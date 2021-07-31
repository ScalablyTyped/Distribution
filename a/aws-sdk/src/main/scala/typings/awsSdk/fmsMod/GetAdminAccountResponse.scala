package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdminAccountResponse extends StObject {
  
  /**
    * The AWS account that is set as the AWS Firewall Manager administrator.
    */
  var AdminAccount: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The status of the AWS account that you set as the AWS Firewall Manager administrator.
    */
  var RoleStatus: js.UndefOr[AccountRoleStatus] = js.undefined
}
object GetAdminAccountResponse {
  
  @scala.inline
  def apply(): GetAdminAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAdminAccountResponse]
  }
  
  @scala.inline
  implicit class GetAdminAccountResponseMutableBuilder[Self <: GetAdminAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminAccount(value: AWSAccountId): Self = StObject.set(x, "AdminAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminAccountUndefined: Self = StObject.set(x, "AdminAccount", js.undefined)
    
    @scala.inline
    def setRoleStatus(value: AccountRoleStatus): Self = StObject.set(x, "RoleStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleStatusUndefined: Self = StObject.set(x, "RoleStatus", js.undefined)
  }
}
