package typings.crossroads.crossroadsMod.CrossroadsJsNs

import typings.signals.signalsMod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossRoadsStatic extends js.Object {
  var NORM_AS_ARRAY: js.Function = js.native
  var NORM_AS_OBJECT: js.Function = js.native
  /**
    * String representation of the crossroads version number (e.g. "0.6.0").
    */
  var VERSION: String = js.native
  /**
    * Signal dispatched every time that crossroads.parse can't find a Route that matches the request. Useful for debuging and error handling.
    */
  var bypassed: Signal[_] = js.native
  /**
    * Sets global route matching behavior to greedy so crossroads will try to match every single route with the supplied request (if true it won't stop at first match).
    */
  var greedy: Boolean = js.native
  /**
    * Sets if the greedy routes feature is enabled. If false it won't try to match multiple routes (faster).
    */
  var greedyEnabled: Boolean = js.native
  /**
    * Sets if Router should care about previous state, so multiple crossroads.parse() calls passing same argument would not trigger the routed, matched and bypassed signals.
    */
  var ignoreState: Boolean = js.native
  /**
    * Sets a default function that should be used to normalize parameters before passing them to the Route.matched, works similarly to Route.rules.normalize_.
    */
  var normalizeFn: js.Function = js.native
  /**
    * Signal dispatched every time that crossroads.parse find a Route that matches the request. Useful for debuging and for executing tasks that should happen at each routing.
    */
  var routed: Signal[_] = js.native
  /**
    * Set if crossroads should typecast route paths. Default value is false (IMPORTANT: on v0.5.0 it was true by default).
    */
  var shouldTypecast: Boolean = js.native
  /**
    * Creates a new route pattern listener and add it to crossroads routes collection.
    *
    * @param pattern String pattern or Regular Expression that should be used to match against requests.
    * @param handler Function that should be executed when a request matches the Route pattern.
    * @param priority Route execution priority.
    */
  def addRoute(pattern: js.Any): Route = js.native
  def addRoute(pattern: js.Any, handler: js.Function): Route = js.native
  def addRoute(pattern: js.Any, handler: js.Function, priority: Double): Route = js.native
  /**
    * Create a new independent Router instance.
    */
  def create(): CrossRoadsStatic = js.native
  /**
    * Get number of Routes contained on the crossroads collection.
    */
  def getNumRoutes(): Double = js.native
  /**
    * Parse a string input and dispatch matched Signal of the first Route that matches the request.
    *
    * @param request String that should be evaluated and matched against Routes to define which Route handlers should be executed and which parameters should be passed to the handlers.
    * @param defaultargs Array containing values passed to matched/routed/bypassed signals as first arguments. Useful for node.js in case you need to access the request and response objects.
    */
  def parse(request: String, defaultArgs: js.Any*): Unit = js.native
  /**
    * Pipe routers, so all crossroads.parse() calls will be forwarded to the other router as well.
    */
  def pipe(router: CrossRoadsStatic): Unit = js.native
  /**
    * Remove all routes from crossroads collection.
    */
  def removeAllRoutes(): Unit = js.native
  /**
    * Remove a single route from crossroads collection.
    *
    * @param route Reference to the Route object returned by crossroads.addRoute().
    */
  def removeRoute(route: Route): Unit = js.native
  /**
    * Resets the Router internal state. Will clear reference to previously matched routes (so they won't dispatch switched signal when matching a new route) and reset last request.
    */
  def resetState(): Unit = js.native
  /**
    * "Ceci n'est pas une pipe"
    */
  def unpipe(router: CrossRoadsStatic): Unit = js.native
}

