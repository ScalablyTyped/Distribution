package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterDelegatedAdministratorRequest extends js.Object {
  /**
    * The account ID number of the member account in the organization that you want to deregister as a delegated administrator.
    */
  var AccountId: typings.awsSdk.organizationsMod.AccountId = js.native
  /**
    * The service principal name of an AWS service for which the account is a delegated administrator. Delegated administrator privileges are revoked for only the specified AWS service from the member account. If the specified service is the only service for which the member account is a delegated administrator, the operation also revokes Organizations read action permissions.
    */
  var ServicePrincipal: typings.awsSdk.organizationsMod.ServicePrincipal = js.native
}

object DeregisterDelegatedAdministratorRequest {
  @scala.inline
  def apply(AccountId: AccountId, ServicePrincipal: ServicePrincipal): DeregisterDelegatedAdministratorRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ServicePrincipal = ServicePrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterDelegatedAdministratorRequest]
  }
}

