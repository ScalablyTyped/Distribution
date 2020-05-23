package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClassificationJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var jobArn: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the job.
    */
  var jobId: js.UndefOr[string] = js.native
}

object CreateClassificationJobResponse {
  @scala.inline
  def apply(jobArn: string = null, jobId: string = null): CreateClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (jobArn != null) __obj.updateDynamic("jobArn")(jobArn.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClassificationJobResponse]
  }
}

