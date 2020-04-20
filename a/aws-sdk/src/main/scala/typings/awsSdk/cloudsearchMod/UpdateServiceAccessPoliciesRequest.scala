package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceAccessPoliciesRequest extends js.Object {
  /**
    * The access rules you want to configure. These rules replace any existing rules. 
    */
  var AccessPolicies: PolicyDocument = js.native
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}

object UpdateServiceAccessPoliciesRequest {
  @scala.inline
  def apply(AccessPolicies: PolicyDocument, DomainName: DomainName): UpdateServiceAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceAccessPoliciesRequest]
  }
}

