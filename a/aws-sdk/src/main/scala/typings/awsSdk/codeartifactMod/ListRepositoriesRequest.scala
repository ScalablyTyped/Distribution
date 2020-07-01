package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesRequest extends js.Object {
  /**
    *  The maximum number of results to return per page. 
    */
  var maxResults: js.UndefOr[ListRepositoriesMaxResults] = js.native
  /**
    *  The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  A prefix used to filter returned repositories. Only repositories with names that start with repositoryPrefix are returned.
    */
  var repositoryPrefix: js.UndefOr[RepositoryName] = js.native
}

object ListRepositoriesRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[ListRepositoriesMaxResults] = js.undefined,
    nextToken: PaginationToken = null,
    repositoryPrefix: RepositoryName = null
  ): ListRepositoriesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (repositoryPrefix != null) __obj.updateDynamic("repositoryPrefix")(repositoryPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesRequest]
  }
}

