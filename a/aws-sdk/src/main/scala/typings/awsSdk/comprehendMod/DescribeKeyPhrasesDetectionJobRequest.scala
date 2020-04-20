package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeKeyPhrasesDetectionJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend generated for the job. The operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.comprehendMod.JobId = js.native
}

object DescribeKeyPhrasesDetectionJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeKeyPhrasesDetectionJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeKeyPhrasesDetectionJobRequest]
  }
}

