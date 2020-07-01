package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesInDomainRequest extends js.Object {
  /**
    *  Filter the list of repositories to only include those that are managed by the AWS account ID. 
    */
  var administratorAccount: js.UndefOr[AccountId] = js.native
  /**
    *  The name of the domain that contains the returned list of repositories. 
    */
  var domain: DomainName = js.native
  /**
    *  The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. 
    */
  var domainOwner: js.UndefOr[AccountId] = js.native
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListRepositoriesInDomainMaxResults] = js.native
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  A prefix used to filter returned repositories. Only repositories with names that start with repositoryPrefix are returned. 
    */
  var repositoryPrefix: js.UndefOr[RepositoryName] = js.native
}

object ListRepositoriesInDomainRequest {
  @scala.inline
  def apply(
    domain: DomainName,
    administratorAccount: AccountId = null,
    domainOwner: AccountId = null,
    maxResults: js.UndefOr[ListRepositoriesInDomainMaxResults] = js.undefined,
    nextToken: PaginationToken = null,
    repositoryPrefix: RepositoryName = null
  ): ListRepositoriesInDomainRequest = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    if (administratorAccount != null) __obj.updateDynamic("administratorAccount")(administratorAccount.asInstanceOf[js.Any])
    if (domainOwner != null) __obj.updateDynamic("domainOwner")(domainOwner.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (repositoryPrefix != null) __obj.updateDynamic("repositoryPrefix")(repositoryPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesInDomainRequest]
  }
}

