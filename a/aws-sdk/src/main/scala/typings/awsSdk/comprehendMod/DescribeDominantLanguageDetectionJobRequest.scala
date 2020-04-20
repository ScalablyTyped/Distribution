package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDominantLanguageDetectionJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId = js.native
}

object DescribeDominantLanguageDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeDominantLanguageDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDominantLanguageDetectionJobRequest]
  }
}

