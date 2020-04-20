package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopEntitiesDetectionJobRequest extends js.Object {
  /**
    * The identifier of the entities detection job to stop.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId = js.native
}

object StopEntitiesDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopEntitiesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopEntitiesDetectionJobRequest]
  }
}

