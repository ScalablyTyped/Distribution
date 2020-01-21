package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcknowledgeJobOutput extends js.Object {
  /**
    * Whether the job worker has received the specified job.
    */
  var status: js.UndefOr[JobStatus] = js.native
}

object AcknowledgeJobOutput {
  @scala.inline
  def apply(status: JobStatus = null): AcknowledgeJobOutput = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeJobOutput]
  }
}

