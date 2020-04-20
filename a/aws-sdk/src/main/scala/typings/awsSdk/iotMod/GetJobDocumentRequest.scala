package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobDocumentRequest extends js.Object {
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId = js.native
}

object GetJobDocumentRequest {
  @scala.inline
  def apply(jobId: JobId): GetJobDocumentRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobDocumentRequest]
  }
}

