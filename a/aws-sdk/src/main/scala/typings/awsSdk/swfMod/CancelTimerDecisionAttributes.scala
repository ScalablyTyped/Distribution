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
  @scala.inline
  implicit class CancelTimerDecisionAttributesOps[Self <: CancelTimerDecisionAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTimerId(value: TimerId): Self = this.set("timerId", value.asInstanceOf[js.Any])
  }
  
}

