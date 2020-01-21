package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelTimerDecisionAttributes extends js.Object {
  /**
    *  The unique ID of the timer to cancel.
    */
  var timerId: TimerId = js.native
}

object CancelTimerDecisionAttributes {
  @scala.inline
  def apply(timerId: TimerId): CancelTimerDecisionAttributes = {
    val __obj = js.Dynamic.literal(timerId = timerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelTimerDecisionAttributes]
  }
}

