package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyBackupAttributesRequest extends js.Object {
  
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
  implicit class ModifyBackupAttributesRequestOps[Self <: ModifyBackupAttributesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackupId(value: BackupId): Self = this.set("BackupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeverExpires(value: Boolean): Self = this.set("NeverExpires", value.asInstanceOf[js.Any])
  }
}
