package typings
package d3DashSelectionLib.d3DashSelectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEventParameters extends js.Object {
  /**
    * If true, the event is dispatched to ancestors in reverse tree order
    */
  var bubbles: scala.Boolean
  /**
    * If true, event.preventDefault is allowed
    */
  var cancelable: scala.Boolean
  /**
    * Any custom data associated with the event
    */
  var detail: js.Any
}

object CustomEventParameters {
  @scala.inline
  def apply(bubbles: scala.Boolean, cancelable: scala.Boolean, detail: js.Any): CustomEventParameters = {
    val __obj = js.Dynamic.literal(bubbles = bubbles, cancelable = cancelable, detail = detail)
  
    __obj.asInstanceOf[CustomEventParameters]
  }
}

