package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCreateAccountStatusRequest extends js.Object {
  /**
    * Specifies the operationId that uniquely identifies the request. You can get the ID from the response to an earlier CreateAccount request, or from the ListCreateAccountStatus operation. The regex pattern for a create account request ID string requires "car-" followed by from 8 to 32 lowercase letters or digits.
    */
  var CreateAccountRequestId: typings.awsSdk.organizationsMod.CreateAccountRequestId = js.native
}

object DescribeCreateAccountStatusRequest {
  @scala.inline
  def apply(CreateAccountRequestId: CreateAccountRequestId): DescribeCreateAccountStatusRequest = {
    val __obj = js.Dynamic.literal(CreateAccountRequestId = CreateAccountRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCreateAccountStatusRequest]
  }
  @scala.inline
  implicit class DescribeCreateAccountStatusRequestOps[Self <: DescribeCreateAccountStatusRequest] (val x: Self) extends AnyVal {
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
    def setCreateAccountRequestId(value: CreateAccountRequestId): Self = this.set("CreateAccountRequestId", value.asInstanceOf[js.Any])
  }
  
}

