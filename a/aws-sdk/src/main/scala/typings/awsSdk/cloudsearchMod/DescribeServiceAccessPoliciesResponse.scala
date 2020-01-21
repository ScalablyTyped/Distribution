package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeServiceAccessPoliciesResponse extends js.Object {
  /**
    * The access rules configured for the domain specified in the request.
    */
  var AccessPolicies: AccessPoliciesStatus = js.native
}

object DescribeServiceAccessPoliciesResponse {
  @scala.inline
  def apply(AccessPolicies: AccessPoliciesStatus): DescribeServiceAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeServiceAccessPoliciesResponse]
  }
}

