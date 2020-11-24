package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterDelegatedAdministratorRequest extends js.Object {
  
  /**
    * The account ID number of the member account in the organization to register as a delegated administrator.
    */
  var AccountId: typings.awsSdk.organizationsMod.AccountId = js.native
  
  /**
    * The service principal of the AWS service for which you want to make the member account a delegated administrator.
    */
  var ServicePrincipal: typings.awsSdk.organizationsMod.ServicePrincipal = js.native
}
object RegisterDelegatedAdministratorRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, ServicePrincipal: ServicePrincipal): RegisterDelegatedAdministratorRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDelegatedAdministratorRequest]
  }
  
  @scala.inline
  implicit class RegisterDelegatedAdministratorRequestOps[Self <: RegisterDelegatedAdministratorRequest] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicePrincipal(value: ServicePrincipal): Self = this.set("ServicePrincipal", value.asInstanceOf[js.Any])
  }
}
