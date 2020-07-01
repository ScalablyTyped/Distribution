package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepositoryDescription extends js.Object {
  /**
    *  The 12-digit account number of the AWS account that manages the repository. 
    */
  var administratorAccount: js.UndefOr[AccountId] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the repository. 
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    *  A text description of the repository. 
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  The name of the domain that contains the repository. 
    */
  var domainName: js.UndefOr[DomainName] = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain that contains the repository. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  An array of external connections associated with the repository. 
    */
  var externalConnections: js.UndefOr[RepositoryExternalConnectionInfoList] = js.native
  /**
    *  The name of the repository. 
    */
  var name: js.UndefOr[RepositoryName] = js.native
  /**
    *  A list of upstream repositories to associate with the repository. The order of the upstream repositories in the list determines their priority order when AWS CodeArtifact looks for a requested package version. For more information, see Working with upstream repositories. 
    */
  var upstreams: js.UndefOr[UpstreamRepositoryInfoList] = js.native
}

object RepositoryDescription {
  @scala.inline
  def apply(
    administratorAccount: AccountId = null,
    arn: Arn = null,
    description: Description = null,
    domainName: DomainName = null,
    domainOwner: AccountId = null,
    externalConnections: RepositoryExternalConnectionInfoList = null,
    name: RepositoryName = null,
    upstreams: UpstreamRepositoryInfoList = null
  ): RepositoryDescription = {
    val __obj = js.Dynamic.literal()
    if (administratorAccount != null) __obj.updateDynamic("administratorAccount")(administratorAccount.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (externalConnections != null) __obj.updateDynamic("externalConnections")(externalConnections.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (upstreams != null) __obj.updateDynamic("upstreams")(upstreams.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryDescription]
  }
}

