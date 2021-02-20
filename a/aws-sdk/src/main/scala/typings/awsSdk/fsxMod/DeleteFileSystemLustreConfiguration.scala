package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFileSystemLustreConfiguration extends StObject {
  
  /**
    * Use if SkipFinalBackup is set to false, and you want to apply an array of tags to the final backup. If you have set the file system property CopyTagsToBackups to true, and you specify one or more FinalBackupTags when deleting a file system, Amazon FSx will not copy any existing file system tags to the backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.native
  
  /**
    * Set SkipFinalBackup to false if you want to take a final backup of the file system you are deleting. By default, Amazon FSx will not take a final backup on your behalf when the DeleteFileSystem operation is invoked. (Default = true)
    */
  var SkipFinalBackup: js.UndefOr[Flag] = js.native
}
object DeleteFileSystemLustreConfiguration {
  
  @scala.inline
  def apply(): DeleteFileSystemLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemLustreConfiguration]
  }
  
  @scala.inline
  implicit class DeleteFileSystemLustreConfigurationMutableBuilder[Self <: DeleteFileSystemLustreConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinalBackupTags(value: Tags): Self = StObject.set(x, "FinalBackupTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalBackupTagsUndefined: Self = StObject.set(x, "FinalBackupTags", js.undefined)
    
    @scala.inline
    def setFinalBackupTagsVarargs(value: Tag*): Self = StObject.set(x, "FinalBackupTags", js.Array(value :_*))
    
    @scala.inline
    def setSkipFinalBackup(value: Flag): Self = StObject.set(x, "SkipFinalBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipFinalBackupUndefined: Self = StObject.set(x, "SkipFinalBackup", js.undefined)
  }
}
