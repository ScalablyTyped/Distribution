package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobUnlockCodeRequest extends js.Object {
  /**
    * The ID for the job that you want to get the UnlockCode value for, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsSdk.snowballMod.JobId = js.native
}

object GetJobUnlockCodeRequest {
  @scala.inline
  def apply(JobId: JobId): GetJobUnlockCodeRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobUnlockCodeRequest]
  }
  @scala.inline
  implicit class GetJobUnlockCodeRequestOps[Self <: GetJobUnlockCodeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
  }
  
}

