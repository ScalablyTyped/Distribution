package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeoutConfig extends js.Object {
  /**
    * Specifies the amount of time, in minutes, this device has to finish execution of this job. The timeout interval can be anywhere between 1 minute and 7 days (1 to 10080 minutes). The in progress timer can't be updated and will apply to all job executions for the job. Whenever a job execution remains in the IN_PROGRESS status for longer than this interval, the job execution will fail and switch to the terminal TIMED_OUT status.
    */
  var inProgressTimeoutInMinutes: js.UndefOr[InProgressTimeoutInMinutes] = js.native
}

object TimeoutConfig {
  @scala.inline
  def apply(inProgressTimeoutInMinutes: Int | Double = null): TimeoutConfig = {
    val __obj = js.Dynamic.literal()
    if (inProgressTimeoutInMinutes != null) __obj.updateDynamic("inProgressTimeoutInMinutes")(inProgressTimeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeoutConfig]
  }
}

