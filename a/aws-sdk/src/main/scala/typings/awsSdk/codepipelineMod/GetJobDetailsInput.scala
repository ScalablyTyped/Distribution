package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobDetailsInput extends js.Object {
  /**
    * The unique system-generated ID for the job.
    */
  var jobId: JobId = js.native
}

object GetJobDetailsInput {
  @scala.inline
  def apply(jobId: JobId): GetJobDetailsInput = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobDetailsInput]
  }
}

