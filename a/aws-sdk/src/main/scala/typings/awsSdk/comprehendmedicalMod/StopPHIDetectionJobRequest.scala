package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopPHIDetectionJobRequest extends js.Object {
  /**
    * The identifier of the PHI detection job to stop.
    */
  var JobId: typings.awsSdk.comprehendmedicalMod.JobId = js.native
}

object StopPHIDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopPHIDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopPHIDetectionJobRequest]
  }
}

