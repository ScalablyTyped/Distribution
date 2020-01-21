package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceAccessPoliciesResponse extends js.Object {
  /**
    * The access rules configured for the domain.
    */
  var AccessPolicies: AccessPoliciesStatus = js.native
}

object UpdateServiceAccessPoliciesResponse {
  @scala.inline
  def apply(AccessPolicies: AccessPoliciesStatus): UpdateServiceAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateServiceAccessPoliciesResponse]
  }
}

