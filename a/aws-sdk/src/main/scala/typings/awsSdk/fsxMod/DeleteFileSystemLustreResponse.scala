package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSystemLustreResponse extends StObject {
  
  /**
    * The ID of the final backup for this file system.
    */
  var FinalBackupId: js.UndefOr[BackupId] = js.undefined
  
  /**
    * The set of tags applied to the final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.undefined
}
object DeleteFileSystemLustreResponse {
  
  @scala.inline
  def apply(): DeleteFileSystemLustreResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemLustreResponse]
  }
  
  @scala.inline
  implicit class DeleteFileSystemLustreResponseMutableBuilder[Self <: DeleteFileSystemLustreResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinalBackupId(value: BackupId): Self = StObject.set(x, "FinalBackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalBackupIdUndefined: Self = StObject.set(x, "FinalBackupId", js.undefined)
    
    @scala.inline
    def setFinalBackupTags(value: Tags): Self = StObject.set(x, "FinalBackupTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalBackupTagsUndefined: Self = StObject.set(x, "FinalBackupTags", js.undefined)
    
    @scala.inline
    def setFinalBackupTagsVarargs(value: Tag*): Self = StObject.set(x, "FinalBackupTags", js.Array(value :_*))
  }
}
