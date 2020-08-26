package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccountResponse extends js.Object {
  /**
    * A structure that contains details about the request to create an account. This response structure might not be fully populated when you first receive it because account creation is an asynchronous process. You can pass the returned CreateAccountStatus ID as a parameter to DescribeCreateAccountStatus to get status about the progress of the request at later times. You can also check the AWS CloudTrail log for the CreateAccountResult event. For more information, see Monitoring the Activity in Your Organization in the AWS Organizations User Guide.
    */
  var CreateAccountStatus: js.UndefOr[typings.awsSdk.organizationsMod.CreateAccountStatus] = js.native
}

object CreateAccountResponse {
  @scala.inline
  def apply(): CreateAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccountResponse]
  }
  @scala.inline
  implicit class CreateAccountResponseOps[Self <: CreateAccountResponse] (val x: Self) extends AnyVal {
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
    def setCreateAccountStatus(value: CreateAccountStatus): Self = this.set("CreateAccountStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateAccountStatus: Self = this.set("CreateAccountStatus", js.undefined)
  }
  
}

