package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeICD10CMInferenceJobRequest extends js.Object {
  /**
    * The identifier that Amazon Comprehend Medical generated for the job. The StartICD10CMInferenceJob operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.comprehendmedicalMod.JobId = js.native
}

object DescribeICD10CMInferenceJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeICD10CMInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeICD10CMInferenceJobRequest]
  }
}

