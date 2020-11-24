package typings.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyClusterRequest extends js.Object {
  
  /**
    * A policy that defines how the service retains backups.
    */
  var BackupRetentionPolicy: typings.awsSdk.cloudhsmv2Mod.BackupRetentionPolicy = js.native
  
  /**
    * The identifier (ID) of the cluster that you want to modify. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typings.awsSdk.cloudhsmv2Mod.ClusterId = js.native
}
object ModifyClusterRequest {
  
  @scala.inline
  def apply(BackupRetentionPolicy: BackupRetentionPolicy, ClusterId: ClusterId): ModifyClusterRequest = {
    val __obj = js.Dynamic.literal(BackupRetentionPolicy = BackupRetentionPolicy.asInstanceOf[js.Any], ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterRequest]
  }
  
  @scala.inline
  implicit class ModifyClusterRequestOps[Self <: ModifyClusterRequest] (val x: Self) extends AnyVal {
    
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
    def setBackupRetentionPolicy(value: BackupRetentionPolicy): Self = this.set("BackupRetentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = this.set("ClusterId", value.asInstanceOf[js.Any])
  }
}
