package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBranchesOutput extends js.Object {
  
  /**
    * The list of branch names.
    */
  var branches: js.UndefOr[BranchNameList] = js.native
  
  /**
    * An enumeration token that returns the batch of the results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object ListBranchesOutput {
  
  @scala.inline
  def apply(): ListBranchesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBranchesOutput]
  }
  
  @scala.inline
  implicit class ListBranchesOutputOps[Self <: ListBranchesOutput] (val x: Self) extends AnyVal {
    
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
    def setBranchesVarargs(value: BranchName*): Self = this.set("branches", js.Array(value :_*))
    
    @scala.inline
    def setBranches(value: BranchNameList): Self = this.set("branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranches: Self = this.set("branches", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
