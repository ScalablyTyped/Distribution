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
  def apply(): ListRepositoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesRequest]
  }
  @scala.inline
  implicit class ListRepositoriesRequestOps[Self <: ListRepositoriesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxResults(value: ListRepositoriesMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRepositoryPrefix(value: RepositoryName): Self = this.set("repositoryPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepositoryPrefix: Self = this.set("repositoryPrefix", js.undefined)
  }
  
}

