package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupRequest extends StObject {
  
  /**
    * (Optional) A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent creation. This string is automatically filled on your behalf when you use the AWS Command Line Interface (AWS CLI) or an AWS SDK.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The ID of the file system to back up.
    */
  var FileSystemId: typings.awsSdk.fsxMod.FileSystemId
  
  /**
    * (Optional) The tags to apply to the backup at backup creation. The key value of the Name tag appears in the console as the backup name. If you have set CopyTagsToBackups to true, and you specify one or more tags using the CreateBackup action, no existing file system tags are copied from the file system to the backup.
    */
  var Tags: js.UndefOr[typings.awsSdk.fsxMod.Tags] = js.undefined
}
object CreateBackupRequest {
  
  @scala.inline
  def apply(FileSystemId: FileSystemId): CreateBackupRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupRequest]
  }
  
  @scala.inline
  implicit class CreateBackupRequestMutableBuilder[Self <: CreateBackupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
