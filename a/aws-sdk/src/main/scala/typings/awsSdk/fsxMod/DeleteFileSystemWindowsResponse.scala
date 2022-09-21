package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSystemWindowsResponse extends StObject {
  
  /**
    * The ID of the final backup for this file system.
    */
  var FinalBackupId: js.UndefOr[BackupId] = js.undefined
  
  /**
    * The set of tags applied to the final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.undefined
}
object DeleteFileSystemWindowsResponse {
  
  inline def apply(): DeleteFileSystemWindowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemWindowsResponse]
  }
  
  extension [Self <: DeleteFileSystemWindowsResponse](x: Self) {
    
    inline def setFinalBackupId(value: BackupId): Self = StObject.set(x, "FinalBackupId", value.asInstanceOf[js.Any])
    
    inline def setFinalBackupIdUndefined: Self = StObject.set(x, "FinalBackupId", js.undefined)
    
    inline def setFinalBackupTags(value: Tags): Self = StObject.set(x, "FinalBackupTags", value.asInstanceOf[js.Any])
    
    inline def setFinalBackupTagsUndefined: Self = StObject.set(x, "FinalBackupTags", js.undefined)
    
    inline def setFinalBackupTagsVarargs(value: Tag*): Self = StObject.set(x, "FinalBackupTags", js.Array(value*))
  }
}
