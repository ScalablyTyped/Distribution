package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopKeyPhrasesDetectionJobRequest extends js.Object {
  /**
    * The identifier of the key phrases detection job to stop.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId = js.native
}

object StopKeyPhrasesDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopKeyPhrasesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopKeyPhrasesDetectionJobRequest]
  }
}

