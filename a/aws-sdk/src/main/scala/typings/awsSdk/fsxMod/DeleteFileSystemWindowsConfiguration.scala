package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSystemWindowsConfiguration extends StObject {
  
  /**
    * A set of tags for your final backup.
    */
  var FinalBackupTags: js.UndefOr[Tags] = js.undefined
  
  /**
    * By default, Amazon FSx for Windows takes a final backup on your behalf when the DeleteFileSystem operation is invoked. Doing this helps protect you from data loss, and we highly recommend taking the final backup. If you want to skip this backup, use this flag to do so.
    */
  var SkipFinalBackup: js.UndefOr[Flag] = js.undefined
}
object DeleteFileSystemWindowsConfiguration {
  
  @scala.inline
  def apply(): DeleteFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFileSystemWindowsConfiguration]
  }
  
  @scala.inline
  implicit class DeleteFileSystemWindowsConfigurationMutableBuilder[Self <: DeleteFileSystemWindowsConfiguration] (val x: Self) extends AnyVal {
    
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
