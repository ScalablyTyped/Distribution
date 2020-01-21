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
  def apply(NextActivity: string = null, WaitTime: WaitTime = null): WaitActivity = {
    val __obj = js.Dynamic.literal()
    if (NextActivity != null) __obj.updateDynamic("NextActivity")(NextActivity.asInstanceOf[js.Any])
    if (WaitTime != null) __obj.updateDynamic("WaitTime")(WaitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitActivity]
  }
}

