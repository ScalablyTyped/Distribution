package typings.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBackupPolicyRequest extends js.Object {
  
  /**
    * The backup policy included in the PutBackupPolicy request.
    */
  var BackupPolicy: typings.awsSdk.efsMod.BackupPolicy = js.native
  
  /**
    * Specifies which EFS file system to update the backup policy for.
    */
  var FileSystemId: typings.awsSdk.efsMod.FileSystemId = js.native
}
object PutBackupPolicyRequest {
  
  @scala.inline
  def apply(BackupPolicy: BackupPolicy, FileSystemId: FileSystemId): PutBackupPolicyRequest = {
    val __obj = js.Dynamic.literal(BackupPolicy = BackupPolicy.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBackupPolicyRequest]
  }
  
  @scala.inline
  implicit class PutBackupPolicyRequestOps[Self <: PutBackupPolicyRequest] (val x: Self) extends AnyVal {
    
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
    def setBackupPolicy(value: BackupPolicy): Self = this.set("BackupPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSystemId(value: FileSystemId): Self = this.set("FileSystemId", value.asInstanceOf[js.Any])
  }
}
