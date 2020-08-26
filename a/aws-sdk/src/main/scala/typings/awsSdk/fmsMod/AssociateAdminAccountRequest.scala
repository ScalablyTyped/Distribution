package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateAdminAccountRequest extends js.Object {
  /**
    * The AWS account ID to associate with AWS Firewall Manager as the AWS Firewall Manager administrator account. This can be an AWS Organizations master account or a member account. For more information about AWS Organizations and master accounts, see Managing the AWS Accounts in Your Organization. 
    */
  var AdminAccount: AWSAccountId = js.native
}

object AssociateAdminAccountRequest {
  @scala.inline
  def apply(AdminAccount: AWSAccountId): AssociateAdminAccountRequest = {
    val __obj = js.Dynamic.literal(AdminAccount = AdminAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateAdminAccountRequest]
  }
  @scala.inline
  implicit class AssociateAdminAccountRequestOps[Self <: AssociateAdminAccountRequest] (val x: Self) extends AnyVal {
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
    def setAdminAccount(value: AWSAccountId): Self = this.set("AdminAccount", value.asInstanceOf[js.Any])
  }
  
}

