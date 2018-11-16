package typings
package crossroadsLib.crossroadsMod.CrossroadsJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  /**
           * If crossroads should try to match this Route even after matching another Route.
           */
  var greedy: scala.Boolean = js.native
  var matched: signalsLib.signalsMod.signalsNs.Signal[_] = js.native
  /**
           * Object used to configure parameters/segments validation rules.
           */
  var rules: js.Any = js.native
  /**
           * Signal dispatched every time a request "leaves" the route.
           */
  var switched: signalsLib.signalsMod.signalsNs.Signal[_] = js.native
  /**
           * Add a listener to the signal.
           *
           * @param listener Signal handler function.
           * @param listenercontext Context on which listener will be executed (object that should represent the `this` variable inside listener function).
           * @param priority The priority level of the event listener. Listeners with higher priority will be executed before listeners with lower priority. Listeners with same priority level will be executed at the same order as they were added. (default = 0)
           */
  def add(listener: js.Function): signalsLib.signalsMod.signalsNs.SignalBinding[_] = js.native
  /**
           * Add a listener to the signal.
           *
           * @param listener Signal handler function.
           * @param listenercontext Context on which listener will be executed (object that should represent the `this` variable inside listener function).
           * @param priority The priority level of the event listener. Listeners with higher priority will be executed before listeners with lower priority. Listeners with same priority level will be executed at the same order as they were added. (default = 0)
           */
  def add(listener: js.Function, listenerContext: js.Any): signalsLib.signalsMod.signalsNs.SignalBinding[_] = js.native
  /**
           * Add a listener to the signal.
           *
           * @param listener Signal handler function.
           * @param listenercontext Context on which listener will be executed (object that should represent the `this` variable inside listener function).
           * @param priority The priority level of the event listener. Listeners with higher priority will be executed before listeners with lower priority. Listeners with same priority level will be executed at the same order as they were added. (default = 0)
           */
  def add(listener: js.Function, listenerContext: js.Any, priority: stdLib.Number): signalsLib.signalsMod.signalsNs.SignalBinding[_] = js.native
  /**
           * Remove route from crossroads and destroy it, releasing memory.
           */
  def dispose(): scala.Unit = js.native
  /**
           * Return a string that matches the route replacing the capturing groups with the values provided in the replacements object.
           */
  def interpolate(replacements: js.Any): java.lang.String = js.native
  /**
           * Test if Route matches against request. Return true if request validate against route rules and pattern.
           */
  def `match`(request: js.Any): scala.Boolean = js.native
}

