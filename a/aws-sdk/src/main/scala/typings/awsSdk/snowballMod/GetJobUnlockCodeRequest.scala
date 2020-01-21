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
}

