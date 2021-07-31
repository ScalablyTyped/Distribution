package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFileSystemPolicyRequest extends StObject {
  
  /**
    * Specifies the EFS file system for which to delete the FileSystemPolicy.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId
}
object DeleteFileSystemPolicyRequest {
  
  @scala.inline
  def apply(FileSystemId: FileSystemId): DeleteFileSystemPolicyRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFileSystemPolicyRequest]
  }
  
  @scala.inline
  implicit class DeleteFileSystemPolicyRequestMutableBuilder[Self <: DeleteFileSystemPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
