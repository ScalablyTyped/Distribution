package typings.d3Selection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEventParameters extends js.Object {
  /**
    * If true, the event is dispatched to ancestors in reverse tree order
    */
  var bubbles: Boolean
  /**
    * If true, event.preventDefault is allowed
    */
  var cancelable: Boolean
  /**
    * Any custom data associated with the event
    */
  var detail: js.Any
}

object CustomEventParameters {
  @scala.inline
  def apply(bubbles: Boolean, cancelable: Boolean, detail: js.Any): CustomEventParameters = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomEventParameters]
  }
}

