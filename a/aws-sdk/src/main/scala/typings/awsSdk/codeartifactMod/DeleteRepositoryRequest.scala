package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryRequest extends js.Object {
  /**
    *  The name of the domain that contains the repository to delete. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The name of the repository to delete. 
    */
  var repository: RepositoryName = js.native
}

object DeleteRepositoryRequest {
  @scala.inline
  def apply(domain: DomainName, repository: RepositoryName, domainOwner: AccountId = null): DeleteRepositoryRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryRequest]
  }
}

