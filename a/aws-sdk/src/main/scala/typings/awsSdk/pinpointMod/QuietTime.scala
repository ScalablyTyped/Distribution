package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuietTime extends js.Object {
  /**
    * The specific time when quiet time ends. This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
    */
  var End: js.UndefOr[string] = js.native
  /**
    * The specific time when quiet time begins. This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a leading zero, if applicable) and MM is the minutes. For example, use 02:30 to represent 2:30 AM, or 14:30 to represent 2:30 PM.
    */
  var Start: js.UndefOr[string] = js.native
}

object QuietTime {
  @scala.inline
  def apply(End: string = null, Start: string = null): QuietTime = {
    val __obj = js.Dynamic.literal()
    if (End != null) __obj.updateDynamic("End")(End.asInstanceOf[js.Any])
    if (Start != null) __obj.updateDynamic("Start")(Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuietTime]
  }
}

