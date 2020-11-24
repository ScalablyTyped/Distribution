package typings.awsSdk.codegurureviewerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommitDiffSourceCodeType extends js.Object {
  
  /**
    *  The SHA of the destination commit used to generate a commit diff. 
    */
  var DestinationCommit: js.UndefOr[CommitId] = js.native
  
  /**
    *  The SHA of the source commit used to generate a commit diff. 
    */
  var SourceCommit: js.UndefOr[CommitId] = js.native
}
object CommitDiffSourceCodeType {
  
  @scala.inline
  def apply(): CommitDiffSourceCodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommitDiffSourceCodeType]
  }
  
  @scala.inline
  implicit class CommitDiffSourceCodeTypeOps[Self <: CommitDiffSourceCodeType] (val x: Self) extends AnyVal {
    
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
    def setDestinationCommit(value: CommitId): Self = this.set("DestinationCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCommit: Self = this.set("DestinationCommit", js.undefined)
    
    @scala.inline
    def setSourceCommit(value: CommitId): Self = this.set("SourceCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCommit: Self = this.set("SourceCommit", js.undefined)
  }
}
