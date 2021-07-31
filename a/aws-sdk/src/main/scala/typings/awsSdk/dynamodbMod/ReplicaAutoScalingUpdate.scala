package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaAutoScalingUpdate extends StObject {
  
  /**
    * The Region where the replica exists.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName
  
  /**
    * Represents the auto scaling settings of global secondary indexes that will be modified.
    */
  var ReplicaGlobalSecondaryIndexUpdates: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingUpdateList] = js.undefined
  
  var ReplicaProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
}
object ReplicaAutoScalingUpdate {
  
  @scala.inline
  def apply(RegionName: RegionName): ReplicaAutoScalingUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaAutoScalingUpdate]
  }
  
  @scala.inline
  implicit class ReplicaAutoScalingUpdateMutableBuilder[Self <: ReplicaAutoScalingUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexUpdates(value: ReplicaGlobalSecondaryIndexAutoScalingUpdateList): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", js.undefined)
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexUpdatesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", js.Array(value :_*))
    
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingUpdate", js.undefined)
  }
}
