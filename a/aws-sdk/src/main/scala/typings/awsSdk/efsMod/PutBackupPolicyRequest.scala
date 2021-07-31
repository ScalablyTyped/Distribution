package typings.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBackupPolicyRequest extends StObject {
  
  /**
    * The backup policy included in the PutBackupPolicy request.
    */
  var BackupPolicy: typings.awsSdk.efsMod.BackupPolicy
  
  /**
    * Specifies which EFS file system to update the backup policy for.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId
}
object PutBackupPolicyRequest {
  
  @scala.inline
  def apply(BackupPolicy: BackupPolicy, FileSystemId: FileSystemId): PutBackupPolicyRequest = {
    val __obj = js.Dynamic.literal(BackupPolicy = BackupPolicy.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBackupPolicyRequest]
  }
  
  @scala.inline
  implicit class PutBackupPolicyRequestMutableBuilder[Self <: PutBackupPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPolicy(value: BackupPolicy): Self = StObject.set(x, "BackupPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
