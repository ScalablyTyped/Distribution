package typings.awsSdk.opsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupRequest extends StObject {
  
  /**
    * The ID of the backup to delete. Run the DescribeBackups command to get a list of backup IDs. Backup IDs are in the format ServerName-yyyyMMddHHmmssSSS. 
    */
  var BackupId: typings.awsSdk.opsworkscmMod.BackupId
}
object DeleteBackupRequest {
  
  @scala.inline
  def apply(BackupId: BackupId): DeleteBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupRequest]
  }
  
  @scala.inline
  implicit class DeleteBackupRequestMutableBuilder[Self <: DeleteBackupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
  }
}
