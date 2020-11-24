package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): ListRepositoriesInDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesInDomainResult]
  }
  
  @scala.inline
  implicit class ListRepositoriesInDomainResultOps[Self <: ListRepositoriesInDomainResult] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setRepositoriesVarargs(value: RepositorySummary*): Self = this.set("repositories", js.Array(value :_*))
    
    @scala.inline
    def setRepositories(value: RepositorySummaryList): Self = this.set("repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositories: Self = this.set("repositories", js.undefined)
  }
}
