package typings
package createjsDashLibLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.Event")
@js.native
class Event protected () extends js.Object {
  def this(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean) = this()
  // properties
  var bubbles: scala.Boolean = js.native
  var cancelable: scala.Boolean = js.native
  var currentTarget: js.Any = js.native
  // other event payloads
  var data: js.Any = js.native
   // It is 'Object' type officially, but 'any' is easier to use.
  var defaultPrevented: scala.Boolean = js.native
  var delta: scala.Double = js.native
  var error: java.lang.String = js.native
  var eventPhase: scala.Double = js.native
  var id: java.lang.String = js.native
  var immediatePropagationStopped: scala.Boolean = js.native
  var item: js.Any = js.native
  var loaded: scala.Double = js.native
  var name: java.lang.String = js.native
  var next: java.lang.String = js.native
  var params: js.Any = js.native
  var paused: scala.Boolean = js.native
  var progress: scala.Double = js.native
  var propagationStopped: scala.Boolean = js.native
  var rawResult: js.Any = js.native
  var removed: scala.Boolean = js.native
  var result: js.Any = js.native
  var runTime: scala.Double = js.native
  var src: java.lang.String = js.native
  var target: js.Any = js.native
  var time: scala.Double = js.native
   // It is 'Object' type officially, but 'any' is easier to use.
  var timeStamp: scala.Double = js.native
  var total: scala.Double = js.native
  var `type`: java.lang.String = js.native
  def preventDefault(): scala.Unit = js.native
  def remove(): scala.Unit = js.native
  def set(props: js.Object): Event = js.native
  def stopImmediatePropagation(): scala.Unit = js.native
  def stopPropagation(): scala.Unit = js.native
}

