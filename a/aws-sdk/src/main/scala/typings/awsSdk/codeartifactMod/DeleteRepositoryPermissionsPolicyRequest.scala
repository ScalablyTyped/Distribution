package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryPermissionsPolicyRequest extends js.Object {
  /**
    *  The name of the domain that contains the repository associated with the resource policy to be deleted. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The revision of the repository's resource policy to be deleted. This revision is used for optimistic locking, which prevents others from accidentally overwriting your changes to the repository's resource policy. 
    */
  var policyRevision: js.UndefOr[PolicyRevision] = js.native
  /**
    *  The name of the repository that is associated with the resource policy to be deleted 
    */
  var repository: RepositoryName = js.native
}

object DeleteRepositoryPermissionsPolicyRequest {
  @scala.inline
  def apply(
    domain: DomainName,
    repository: RepositoryName,
    domainOwner: AccountId = null,
    policyRevision: PolicyRevision = null
  ): DeleteRepositoryPermissionsPolicyRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (policyRevision != null) __obj.updateDynamic("policyRevision")(policyRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryPermissionsPolicyRequest]
  }
}

