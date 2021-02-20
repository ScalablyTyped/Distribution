package typings.crossroads

import org.scalablytyped.runtime.Shortcut
import typings.crossroads.mod.CrossroadsJs.CrossRoadsStatic
import typings.signals.mod.Signal
import typings.signals.mod.SignalBinding
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("crossroads", JSImport.Namespace)
  @js.native
  val ^ : CrossRoadsStatic = js.native
  
  /**
    * Signal dispatched every time that crossroads.parse can't find a Route that matches the request. Useful for debuging and error handling.
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("crossroads", "bypassed")
  @js.native
  /**
    * Custom event broadcaster
    * <br />- inspired by Robert Penner's AS3 Signals.
    * @author Miller Medeiros
    */
  class bypassed ()
    extends Signal[js.Any]
  
  /**
    * Signal dispatched every time that crossroads.parse find a Route that matches the request. Useful for debuging and for executing tasks that should happen at each routing.
    */
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("crossroads", "routed")
  @js.native
  /**
    * Custom event broadcaster
    * <br />- inspired by Robert Penner's AS3 Signals.
    * @author Miller Medeiros
    */
  class routed ()
    extends Signal[js.Any]
  
  object CrossroadsJs {
    
    @js.native
    trait CrossRoadsStatic extends StObject {
      
      var NORM_AS_ARRAY: js.Function = js.native
      
      var NORM_AS_OBJECT: js.Function = js.native
      
      /**
        * String representation of the crossroads version number (e.g. "0.6.0").
        */
      var VERSION: String = js.native
      
      /**
        * Creates a new route pattern listener and add it to crossroads routes collection.
        *
        * @param pattern String pattern or Regular Expression that should be used to match against requests.
        * @param handler Function that should be executed when a request matches the Route pattern.
        * @param priority Route execution priority.
        */
      def addRoute(pattern: js.Any): Route = js.native
      def addRoute(pattern: js.Any, handler: js.UndefOr[scala.Nothing], priority: Double): Route = js.native
      def addRoute(pattern: js.Any, handler: js.Function): Route = js.native
      def addRoute(pattern: js.Any, handler: js.Function, priority: Double): Route = js.native
      
      /**
        * Signal dispatched every time that crossroads.parse can't find a Route that matches the request. Useful for debuging and error handling.
        */
      var bypassed: Signal[_] = js.native
      
      /**
        * Create a new independent Router instance.
        */
      def create(): CrossRoadsStatic = js.native
      
      /**
        * Get number of Routes contained on the crossroads collection.
        */
      def getNumRoutes(): Double = js.native
      
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
        * Signal dispatched every time that crossroads.parse find a Route that matches the request. Useful for debuging and for executing tasks that should happen at each routing.
        */
      var routed: Signal[_] = js.native
      
      /**
        * Set if crossroads should typecast route paths. Default value is false (IMPORTANT: on v0.5.0 it was true by default).
        */
      var shouldTypecast: Boolean = js.native
      
      /**
        * "Ceci n'est pas une pipe"
        */
      def unpipe(router: CrossRoadsStatic): Unit = js.native
    }
    
    @js.native
    trait Route extends StObject {
      
      /**
        * Add a listener to the signal.
        *
        * @param listener Signal handler function.
        * @param listenercontext Context on which listener will be executed (object that should represent the `this` variable inside listener function).
        * @param priority The priority level of the event listener. Listeners with higher priority will be executed before listeners with lower priority. Listeners with same priority level will be executed at the same order as they were added. (default = 0)
        */
      def add(listener: js.Function): SignalBinding[_] = js.native
      def add(listener: js.Function, listenerContext: js.UndefOr[scala.Nothing], priority: Number): SignalBinding[_] = js.native
      def add(listener: js.Function, listenerContext: js.Any): SignalBinding[_] = js.native
      def add(listener: js.Function, listenerContext: js.Any, priority: Number): SignalBinding[_] = js.native
      
      /**
        * Remove route from crossroads and destroy it, releasing memory.
        */
      def dispose(): Unit = js.native
      
      /**
        * If crossroads should try to match this Route even after matching another Route.
        */
      var greedy: Boolean = js.native
      
      /**
        * Return a string that matches the route replacing the capturing groups with the values provided in the replacements object.
        */
      def interpolate(replacements: js.Any): String = js.native
      
      /**
        * Test if Route matches against request. Return true if request validate against route rules and pattern.
        */
      def `match`(request: js.Any): Boolean = js.native
      
      var matched: Signal[_] = js.native
      
      /**
        * Object used to configure parameters/segments validation rules.
        */
      var rules: js.Any = js.native
      
      /**
        * Signal dispatched every time a request "leaves" the route.
        */
      var switched: Signal[_] = js.native
    }
  }
  
  type _To = CrossRoadsStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CrossRoadsStatic = ^
}
