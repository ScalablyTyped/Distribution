package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserImportJobRequest extends js.Object {
  /**
    * The job ID for the user import job.
    */
  var JobId: UserImportJobIdType = js.native
  /**
    * The user pool ID for the user pool that the users are being imported into.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object DescribeUserImportJobRequest {
  @scala.inline
  def apply(JobId: UserImportJobIdType, UserPoolId: UserPoolIdType): DescribeUserImportJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserImportJobRequest]
  }
  @scala.inline
  implicit class DescribeUserImportJobRequestOps[Self <: DescribeUserImportJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobId(value: UserImportJobIdType): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
  }
  
}

