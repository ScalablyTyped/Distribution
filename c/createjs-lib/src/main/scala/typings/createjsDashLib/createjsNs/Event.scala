package typings.createjsDashLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Event")
@js.native
class Event protected () extends js.Object {
  def this(`type`: String, bubbles: Boolean, cancelable: Boolean) = this()
  // properties
  var bubbles: Boolean = js.native
  var cancelable: Boolean = js.native
  var currentTarget: js.Any = js.native
  // other event payloads
  var data: js.Any = js.native
   // It is 'Object' type officially, but 'any' is easier to use.
  var defaultPrevented: Boolean = js.native
  var delta: Double = js.native
  var error: String = js.native
  var eventPhase: Double = js.native
  var id: String = js.native
  var immediatePropagationStopped: Boolean = js.native
  var item: js.Any = js.native
  var loaded: Double = js.native
  var name: String = js.native
  var next: String = js.native
  var params: js.Any = js.native
  var paused: Boolean = js.native
  var progress: Double = js.native
  var propagationStopped: Boolean = js.native
  var rawResult: js.Any = js.native
  var removed: Boolean = js.native
  var result: js.Any = js.native
  var runTime: Double = js.native
  var src: String = js.native
  var target: js.Any = js.native
  var time: Double = js.native
   // It is 'Object' type officially, but 'any' is easier to use.
  var timeStamp: Double = js.native
  var total: Double = js.native
  var `type`: String = js.native
  def preventDefault(): Unit = js.native
  def remove(): Unit = js.native
  def set(props: js.Object): Event = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

