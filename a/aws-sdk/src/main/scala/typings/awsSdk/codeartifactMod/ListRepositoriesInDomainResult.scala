package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesInDomainResult extends js.Object {
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The returned list of repositories. 
    */
  var repositories: js.UndefOr[RepositorySummaryList] = js.native
}

object ListRepositoriesInDomainResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, repositories: RepositorySummaryList = null): ListRepositoriesInDomainResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (repositories != null) __obj.updateDynamic("repositories")(repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesInDomainResult]
  }
}

