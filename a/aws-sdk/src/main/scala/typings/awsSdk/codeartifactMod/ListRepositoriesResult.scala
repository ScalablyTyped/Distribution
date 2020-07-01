package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesResult extends js.Object {
  /**
    *  If there are additional results, this is the token for the next set of results. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    *  The returned list of  RepositorySummary  objects. 
    */
  var repositories: js.UndefOr[RepositorySummaryList] = js.native
}

object ListRepositoriesResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, repositories: RepositorySummaryList = null): ListRepositoriesResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (repositories != null) __obj.updateDynamic("repositories")(repositories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRepositoriesResult]
  }
}

