package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaAutoScalingDescription extends StObject {
  
  /**
    * <p>Replica-specific global secondary index auto scaling settings.</p>
    */
  var GlobalSecondaryIndexes: js.UndefOr[js.Array[ReplicaGlobalSecondaryIndexAutoScalingDescription]] = js.undefined
  
  /**
    * <p>The Region where the replica exists.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Represents the auto scaling settings for a global table or global secondary
    *             index.</p>
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  
  /**
    * <p>Represents the auto scaling settings for a global table or global secondary
    *             index.</p>
    */
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  
  /**
    * <p>The current state of the replica:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>CREATING</code> - The replica is being created.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>UPDATING</code> - The replica is being updated.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>DELETING</code> - The replica is being deleted.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ACTIVE</code> - The replica is ready for use.</p>
    *             </li>
    *          </ul>
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReplicaStatus | String] = js.undefined
}
object ReplicaAutoScalingDescription {
  
  inline def apply(): ReplicaAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaAutoScalingDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicaAutoScalingDescription] (val x: Self) extends AnyVal {
    
    inline def setGlobalSecondaryIndexes(value: js.Array[ReplicaGlobalSecondaryIndexAutoScalingDescription]): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    inline def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value*))
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
    
    inline def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    
    inline def setReplicaStatus(value: ReplicaStatus | String): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
  }
}
