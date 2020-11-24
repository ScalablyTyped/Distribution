package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRepositoriesResponse extends js.Object {
  
  /**
    * The nextToken value to include in a future DescribeRepositories request. When the results of a DescribeRepositories request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of repository objects corresponding to valid repositories.
    */
  var repositories: js.UndefOr[RepositoryList] = js.native
}
object DescribeRepositoriesResponse {
  
  @scala.inline
  def apply(): DescribeRepositoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRepositoriesResponse]
  }
  
  @scala.inline
  implicit class DescribeRepositoriesResponseOps[Self <: DescribeRepositoriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRepositoriesVarargs(value: Repository*): Self = this.set("repositories", js.Array(value :_*))
    
    @scala.inline
    def setRepositories(value: RepositoryList): Self = this.set("repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositories: Self = this.set("repositories", js.undefined)
  }
}
