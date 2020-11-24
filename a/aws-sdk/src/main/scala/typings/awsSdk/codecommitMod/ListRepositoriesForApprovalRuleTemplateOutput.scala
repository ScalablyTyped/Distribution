package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRepositoriesForApprovalRuleTemplateOutput extends js.Object {
  
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list of repository names that are associated with the specified approval rule template.
    */
  var repositoryNames: js.UndefOr[RepositoryNameList] = js.native
}
object ListRepositoriesForApprovalRuleTemplateOutput {
  
  @scala.inline
  def apply(): ListRepositoriesForApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesForApprovalRuleTemplateOutput]
  }
  
  @scala.inline
  implicit class ListRepositoriesForApprovalRuleTemplateOutputOps[Self <: ListRepositoriesForApprovalRuleTemplateOutput] (val x: Self) extends AnyVal {
    
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
    def setRepositoryNamesVarargs(value: RepositoryName*): Self = this.set("repositoryNames", js.Array(value :_*))
    
    @scala.inline
    def setRepositoryNames(value: RepositoryNameList): Self = this.set("repositoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryNames: Self = this.set("repositoryNames", js.undefined)
  }
}
