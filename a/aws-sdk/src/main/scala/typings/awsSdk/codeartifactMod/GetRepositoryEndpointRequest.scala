package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRepositoryEndpointRequest extends js.Object {
  /**
    *  The name of the domain that contains the repository. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  Returns which endpoint of a repository to return. A repository has one endpoint for each package format:     npm     pypi     maven   
    */
  var format: PackageFormat = js.native
  /**
    *  The name of the repository. 
    */
  var repository: RepositoryName = js.native
}

object GetRepositoryEndpointRequest {
  @scala.inline
  def apply(
    domain: DomainName,
    format: PackageFormat,
    repository: RepositoryName,
    domainOwner: AccountId = null
  ): GetRepositoryEndpointRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRepositoryEndpointRequest]
  }
}

