package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTextTranslationJobRequest extends js.Object {
  /**
    * The identifier that Amazon Translate generated for the job. The StartTextTranslationJob operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.translateMod.JobId = js.native
}

object DescribeTextTranslationJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeTextTranslationJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeTextTranslationJobRequest]
  }
}

