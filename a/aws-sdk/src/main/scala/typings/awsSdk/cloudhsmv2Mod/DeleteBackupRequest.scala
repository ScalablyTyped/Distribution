package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteBackupRequest extends StObject {
  
  /**
    * The ID of the backup to be deleted. To find the ID of a backup, use the DescribeBackups operation.
    */
  var BackupId: typings.awsSdk.cloudhsmv2Mod.BackupId = js.native
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
