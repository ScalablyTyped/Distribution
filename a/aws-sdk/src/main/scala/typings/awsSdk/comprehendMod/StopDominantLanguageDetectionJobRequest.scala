package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDominantLanguageDetectionJobRequest extends js.Object {
  /**
    * The identifier of the dominant language detection job to stop.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId = js.native
}

object StopDominantLanguageDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopDominantLanguageDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopDominantLanguageDetectionJobRequest]
  }
}

