package typings.currentGitBranch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CurrentGitBranchOptionsObject extends js.Object {
  
  var altPath: js.UndefOr[String] = js.native
  
  var branchOptions: js.UndefOr[String] = js.native
}
object CurrentGitBranchOptionsObject {
  
  @scala.inline
  def apply(): CurrentGitBranchOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentGitBranchOptionsObject]
  }
  
  @scala.inline
  implicit class CurrentGitBranchOptionsObjectOps[Self <: CurrentGitBranchOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setAltPath(value: String): Self = this.set("altPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltPath: Self = this.set("altPath", js.undefined)
    
    @scala.inline
    def setBranchOptions(value: String): Self = this.set("branchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBranchOptions: Self = this.set("branchOptions", js.undefined)
  }
}
