package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

