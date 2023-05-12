package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaAutoScalingUpdate extends StObject {
  
  /**
    * The Region where the replica exists.
    */
  var RegionName: typings.awsSdk2Types.clientsDynamodbMod.RegionName
  
  /**
    * Represents the auto scaling settings of global secondary indexes that will be modified.
    */
  var ReplicaGlobalSecondaryIndexUpdates: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingUpdateList] = js.undefined
  
  var ReplicaProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
}
object ReplicaAutoScalingUpdate {
  
  inline def apply(RegionName: RegionName): ReplicaAutoScalingUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaAutoScalingUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicaAutoScalingUpdate] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setReplicaGlobalSecondaryIndexUpdates(value: ReplicaGlobalSecondaryIndexAutoScalingUpdateList): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    inline def setReplicaGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", js.undefined)
    
    inline def setReplicaGlobalSecondaryIndexUpdatesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", js.Array(value*))
    
    inline def setReplicaProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedReadCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingUpdate", js.undefined)
  }
}
