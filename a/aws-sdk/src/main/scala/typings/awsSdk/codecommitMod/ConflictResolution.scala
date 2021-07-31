package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConflictResolution extends StObject {
  
  /**
    * Files to be deleted as part of the merge conflict resolution.
    */
  var deleteFiles: js.UndefOr[DeleteFileEntries] = js.undefined
  
  /**
    * Files to have content replaced as part of the merge conflict resolution.
    */
  var replaceContents: js.UndefOr[ReplaceContentEntries] = js.undefined
  
  /**
    * File modes that are set as part of the merge conflict resolution.
    */
  var setFileModes: js.UndefOr[SetFileModeEntries] = js.undefined
}
object ConflictResolution {
  
  @scala.inline
  def apply(): ConflictResolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConflictResolution]
  }
  
  @scala.inline
  implicit class ConflictResolutionMutableBuilder[Self <: ConflictResolution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteFiles(value: DeleteFileEntries): Self = StObject.set(x, "deleteFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteFilesUndefined: Self = StObject.set(x, "deleteFiles", js.undefined)
    
    @scala.inline
    def setDeleteFilesVarargs(value: DeleteFileEntry*): Self = StObject.set(x, "deleteFiles", js.Array(value :_*))
    
    @scala.inline
    def setReplaceContents(value: ReplaceContentEntries): Self = StObject.set(x, "replaceContents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceContentsUndefined: Self = StObject.set(x, "replaceContents", js.undefined)
    
    @scala.inline
    def setReplaceContentsVarargs(value: ReplaceContentEntry*): Self = StObject.set(x, "replaceContents", js.Array(value :_*))
    
    @scala.inline
    def setSetFileModes(value: SetFileModeEntries): Self = StObject.set(x, "setFileModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetFileModesUndefined: Self = StObject.set(x, "setFileModes", js.undefined)
    
    @scala.inline
    def setSetFileModesVarargs(value: SetFileModeEntry*): Self = StObject.set(x, "setFileModes", js.Array(value :_*))
  }
}
