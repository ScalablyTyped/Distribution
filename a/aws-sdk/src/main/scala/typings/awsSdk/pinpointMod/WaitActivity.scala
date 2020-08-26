package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaitActivity extends js.Object {
  /**
    * The unique identifier for the next activity to perform, after performing the wait activity.
    */
  var NextActivity: js.UndefOr[string] = js.native
  /**
    * The amount of time to wait or the date and time when the activity moves participants to the next activity in the journey.
    */
  var WaitTime: js.UndefOr[typings.awsSdk.pinpointMod.WaitTime] = js.native
}

object WaitActivity {
  @scala.inline
  def apply(): WaitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitActivity]
  }
  @scala.inline
  implicit class WaitActivityOps[Self <: WaitActivity] (val x: Self) extends AnyVal {
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
    def setNextActivity(value: string): Self = this.set("NextActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextActivity: Self = this.set("NextActivity", js.undefined)
    @scala.inline
    def setWaitTime(value: WaitTime): Self = this.set("WaitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitTime: Self = this.set("WaitTime", js.undefined)
  }
  
}

