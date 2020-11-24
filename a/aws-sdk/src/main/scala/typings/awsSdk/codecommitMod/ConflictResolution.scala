package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConflictResolution extends js.Object {
  
  /**
    * Files to be deleted as part of the merge conflict resolution.
    */
  var deleteFiles: js.UndefOr[DeleteFileEntries] = js.native
  
  /**
    * Files to have content replaced as part of the merge conflict resolution.
    */
  var replaceContents: js.UndefOr[ReplaceContentEntries] = js.native
  
  /**
    * File modes that are set as part of the merge conflict resolution.
    */
  var setFileModes: js.UndefOr[SetFileModeEntries] = js.native
}
object ConflictResolution {
  
  @scala.inline
  def apply(): ConflictResolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConflictResolution]
  }
  
  @scala.inline
  implicit class ConflictResolutionOps[Self <: ConflictResolution] (val x: Self) extends AnyVal {
    
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
    def setDeleteFilesVarargs(value: DeleteFileEntry*): Self = this.set("deleteFiles", js.Array(value :_*))
    
    @scala.inline
    def setDeleteFiles(value: DeleteFileEntries): Self = this.set("deleteFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteFiles: Self = this.set("deleteFiles", js.undefined)
    
    @scala.inline
    def setReplaceContentsVarargs(value: ReplaceContentEntry*): Self = this.set("replaceContents", js.Array(value :_*))
    
    @scala.inline
    def setReplaceContents(value: ReplaceContentEntries): Self = this.set("replaceContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceContents: Self = this.set("replaceContents", js.undefined)
    
    @scala.inline
    def setSetFileModesVarargs(value: SetFileModeEntry*): Self = this.set("setFileModes", js.Array(value :_*))
    
    @scala.inline
    def setSetFileModes(value: SetFileModeEntries): Self = this.set("setFileModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetFileModes: Self = this.set("setFileModes", js.undefined)
  }
}
