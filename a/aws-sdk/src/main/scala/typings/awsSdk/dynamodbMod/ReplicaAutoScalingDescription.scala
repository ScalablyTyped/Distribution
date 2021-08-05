package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaAutoScalingDescription extends StObject {
  
  /**
    * Replica-specific global secondary index auto scaling settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingDescriptionList] = js.undefined
  
  /**
    * The Region where the replica exists.
    */
  var RegionName: js.UndefOr[typings.awsSdk.dynamodbMod.RegionName] = js.undefined
  
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  
  /**
    * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ReplicaStatus] = js.undefined
}
object ReplicaAutoScalingDescription {
  
  inline def apply(): ReplicaAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaAutoScalingDescription]
  }
  
  extension [Self <: ReplicaAutoScalingDescription](x: Self) {
    
    inline def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexAutoScalingDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
    
    inline def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    
    inline def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
  }
}
