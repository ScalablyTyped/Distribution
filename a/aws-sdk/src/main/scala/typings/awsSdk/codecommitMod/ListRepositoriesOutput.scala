package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoriesOutput extends js.Object {
  
  /**
    * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * Lists the repositories called by the list repositories operation.
    */
  var repositories: js.UndefOr[RepositoryNameIdPairList] = js.native
}
object ListRepositoriesOutput {
  
  @scala.inline
  def apply(): ListRepositoriesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesOutput]
  }
  
  @scala.inline
  implicit class ListRepositoriesOutputOps[Self <: ListRepositoriesOutput] (val x: Self) extends AnyVal {
    
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
    def setRepositoriesVarargs(value: RepositoryNameIdPair*): Self = this.set("repositories", js.Array(value :_*))
    
    @scala.inline
    def setRepositories(value: RepositoryNameIdPairList): Self = this.set("repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositories: Self = this.set("repositories", js.undefined)
  }
}
