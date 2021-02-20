package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateAdminAccountRequest extends StObject {
  
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
  implicit class AssociateAdminAccountRequestMutableBuilder[Self <: AssociateAdminAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminAccount(value: AWSAccountId): Self = StObject.set(x, "AdminAccount", value.asInstanceOf[js.Any])
  }
}
