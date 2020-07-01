package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainPermissionsPolicyRequest extends js.Object {
  /**
    *  The name of the domain associated with the resource policy to be deleted. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The current revision of the resource policy to be deleted. This revision is used for optimistic locking, which prevents others from overwriting your changes to the domain's resource policy. 
    */
  var policyRevision: js.UndefOr[PolicyRevision] = js.native
}

object DeleteDomainPermissionsPolicyRequest {
  @scala.inline
  def apply(domain: DomainName, domainOwner: AccountId = null, policyRevision: PolicyRevision = null): DeleteDomainPermissionsPolicyRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (policyRevision != null) __obj.updateDynamic("policyRevision")(policyRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainPermissionsPolicyRequest]
  }
}

