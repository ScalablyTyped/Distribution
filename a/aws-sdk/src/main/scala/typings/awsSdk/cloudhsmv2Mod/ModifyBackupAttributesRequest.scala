package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyBackupAttributesRequest extends StObject {
  
  /**
    * The identifier (ID) of the backup to modify. To find the ID of a backup, use the DescribeBackups operation.
    */
  var BackupId: typings.awsSdk.cloudhsmv2Mod.BackupId = js.native
  
  /**
    * Specifies whether the service should exempt a backup from the retention policy for the cluster. True exempts a backup from the retention policy. False means the service applies the backup retention policy defined at the cluster.
    */
  var NeverExpires: Boolean = js.native
}
object ModifyBackupAttributesRequest {
  
  @scala.inline
  def apply(BackupId: BackupId, NeverExpires: Boolean): ModifyBackupAttributesRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any], NeverExpires = NeverExpires.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyBackupAttributesRequest]
  }
  
  @scala.inline
  implicit class ModifyBackupAttributesRequestMutableBuilder[Self <: ModifyBackupAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeverExpires(value: Boolean): Self = StObject.set(x, "NeverExpires", value.asInstanceOf[js.Any])
  }
}
