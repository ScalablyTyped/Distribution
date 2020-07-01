package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainPermissionsPolicyRequest extends js.Object {
  /**
    *  The name of the domain to which the resource policy is attached. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
}

object GetDomainPermissionsPolicyRequest {
  @scala.inline
  def apply(domain: DomainName, domainOwner: AccountId = null): GetDomainPermissionsPolicyRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainPermissionsPolicyRequest]
  }
}

