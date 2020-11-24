package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepositoryHeadSourceCodeType extends js.Object {
  
  /**
    *  The name of the branch in an associated repository. The RepositoryHeadSourceCodeType specifies the tip of this branch. 
    */
  var BranchName: typings.awsSdk.codegurureviewerMod.BranchName = js.native
}
object RepositoryHeadSourceCodeType {
  
  @scala.inline
  def apply(BranchName: BranchName): RepositoryHeadSourceCodeType = {
    val __obj = js.Dynamic.literal(BranchName = BranchName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepositoryHeadSourceCodeType]
  }
  
  @scala.inline
  implicit class RepositoryHeadSourceCodeTypeOps[Self <: RepositoryHeadSourceCodeType] (val x: Self) extends AnyVal {
    
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
    def setBranchName(value: BranchName): Self = this.set("BranchName", value.asInstanceOf[js.Any])
  }
}
