package typings.awsSdk.cloudhsmv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterRequest extends StObject {
  
  /**
    * A policy that defines how the service retains backups.
    */
  var BackupRetentionPolicy: typings.awsSdk.cloudhsmv2Mod.BackupRetentionPolicy
  
  /**
    * The identifier (ID) of the cluster that you want to modify. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typings.awsSdk.cloudhsmv2Mod.ClusterId
}
object ModifyClusterRequest {
  
  @scala.inline
  def apply(BackupRetentionPolicy: BackupRetentionPolicy, ClusterId: ClusterId): ModifyClusterRequest = {
    val __obj = js.Dynamic.literal(BackupRetentionPolicy = BackupRetentionPolicy.asInstanceOf[js.Any], ClusterId = ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterRequest]
  }
  
  @scala.inline
  implicit class ModifyClusterRequestMutableBuilder[Self <: ModifyClusterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupRetentionPolicy(value: BackupRetentionPolicy): Self = StObject.set(x, "BackupRetentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterId(value: ClusterId): Self = StObject.set(x, "ClusterId", value.asInstanceOf[js.Any])
  }
}
