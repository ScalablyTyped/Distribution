package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaAutoScalingUpdate extends StObject {
  
  /**
    * <p>The Region where the replica exists.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>Represents the auto scaling settings of global secondary indexes that will be
    *             modified.</p>
    */
  var ReplicaGlobalSecondaryIndexUpdates: js.UndefOr[js.Array[ReplicaGlobalSecondaryIndexAutoScalingUpdate]] = js.undefined
  
  /**
    * <p>Represents the auto scaling settings to be modified for a global table or global
    *             secondary index.</p>
    */
  var ReplicaProvisionedReadCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
}
object ReplicaAutoScalingUpdate {
  
  inline def apply(): ReplicaAutoScalingUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaAutoScalingUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicaAutoScalingUpdate] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setReplicaGlobalSecondaryIndexUpdates(value: js.Array[ReplicaGlobalSecondaryIndexAutoScalingUpdate]): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    inline def setReplicaGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", js.undefined)
    
    inline def setReplicaGlobalSecondaryIndexUpdatesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexUpdates", js.Array(value*))
    
    inline def setReplicaProvisionedReadCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedReadCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingUpdate", js.undefined)
  }
}
