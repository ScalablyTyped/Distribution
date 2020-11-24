package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceCodeType extends js.Object {
  
  /**
    *  A  SourceCodeType  that specifies a commit diff created by a pull request on an associated repository. 
    */
  var CommitDiff: js.UndefOr[CommitDiffSourceCodeType] = js.native
  
  var RepositoryHead: js.UndefOr[RepositoryHeadSourceCodeType] = js.native
}
object SourceCodeType {
  
  @scala.inline
  def apply(): SourceCodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCodeType]
  }
  
  @scala.inline
  implicit class SourceCodeTypeOps[Self <: SourceCodeType] (val x: Self) extends AnyVal {
    
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
    def setCommitDiff(value: CommitDiffSourceCodeType): Self = this.set("CommitDiff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommitDiff: Self = this.set("CommitDiff", js.undefined)
    
    @scala.inline
    def setRepositoryHead(value: RepositoryHeadSourceCodeType): Self = this.set("RepositoryHead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryHead: Self = this.set("RepositoryHead", js.undefined)
  }
}
