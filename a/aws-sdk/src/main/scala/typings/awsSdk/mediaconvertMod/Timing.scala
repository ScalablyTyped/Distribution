package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timing extends js.Object {
  /**
    * The time, in Unix epoch format, that the transcoding job finished
    */
  var FinishTime: js.UndefOr[timestampUnix] = js.native
  /**
    * The time, in Unix epoch format, that transcoding for the job began.
    */
  var StartTime: js.UndefOr[timestampUnix] = js.native
  /**
    * The time, in Unix epoch format, that you submitted the job.
    */
  var SubmitTime: js.UndefOr[timestampUnix] = js.native
}

object Timing {
  @scala.inline
  def apply(
    FinishTime: timestampUnix = null,
    StartTime: timestampUnix = null,
    SubmitTime: timestampUnix = null
  ): Timing = {
    val __obj = js.Dynamic.literal()
    if (FinishTime != null) __obj.updateDynamic("FinishTime")(FinishTime.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (SubmitTime != null) __obj.updateDynamic("SubmitTime")(SubmitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timing]
  }
}

