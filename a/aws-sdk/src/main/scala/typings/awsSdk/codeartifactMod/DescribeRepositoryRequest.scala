package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRepositoryRequest extends js.Object {
  /**
    *  The name of the domain that contains the repository to describe. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  A string that specifies the name of the requested repository. 
    */
  var repository: RepositoryName = js.native
}

object DescribeRepositoryRequest {
  @scala.inline
  def apply(domain: DomainName, repository: RepositoryName, domainOwner: AccountId = null): DescribeRepositoryRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRepositoryRequest]
  }
}

