package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRepositoryPermissionsPolicyRequest extends js.Object {
  /**
    *  The name of the domain containing the repository to set the resource policy on. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  A valid displayable JSON Aspen policy string to be set as the access control resource policy on the provided repository. 
    */
  var policyDocument: PolicyDocument = js.native
  /**
    *  Sets the revision of the resource policy that specifies permissions to access the repository. This revision is used for optimistic locking, which prevents others from overwriting your changes to the repository's resource policy. 
    */
  var policyRevision: js.UndefOr[PolicyRevision] = js.native
  /**
    *  The name of the repository to set the resource policy on. 
    */
  var repository: RepositoryName = js.native
}

object PutRepositoryPermissionsPolicyRequest {
  @scala.inline
  def apply(
    domain: DomainName,
    policyDocument: PolicyDocument,
    repository: RepositoryName,
    domainOwner: AccountId = null,
    policyRevision: PolicyRevision = null
  ): PutRepositoryPermissionsPolicyRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], policyDocument = policyDocument.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (policyRevision != null) __obj.updateDynamic("policyRevision")(policyRevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRepositoryPermissionsPolicyRequest]
  }
}

