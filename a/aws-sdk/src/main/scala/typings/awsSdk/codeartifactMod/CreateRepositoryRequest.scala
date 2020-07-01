package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRepositoryRequest extends js.Object {
  /**
    *  A description of the created repository. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  The domain that contains the created repository. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The name of the repository to create. 
    */
  var repository: RepositoryName = js.native
  /**
    *  A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. For more information, see Working with upstream repositories. 
    */
  var upstreams: js.UndefOr[UpstreamRepositoryList] = js.native
}

object CreateRepositoryRequest {
  @scala.inline
  def apply(
    domain: DomainName,
    repository: RepositoryName,
    description: Description = null,
    domainOwner: AccountId = null,
    upstreams: UpstreamRepositoryList = null
  ): CreateRepositoryRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (upstreams != null) __obj.updateDynamic("upstreams")(upstreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryRequest]
  }
}

