package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableReplicaAutoScalingInput extends StObject {
  
  /**
    * <p>Represents the auto scaling settings of the global secondary indexes of the replica to
    *             be updated.</p>
    */
  var GlobalSecondaryIndexUpdates: js.UndefOr[js.Array[GlobalSecondaryIndexAutoScalingUpdate]] = js.undefined
  
  /**
    * <p>Represents the auto scaling settings to be modified for a global table or global
    *             secondary index.</p>
    */
  var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  
  /**
    * <p>Represents the auto scaling settings of replicas of the table that will be
    *             modified.</p>
    */
  var ReplicaUpdates: js.UndefOr[js.Array[ReplicaAutoScalingUpdate]] = js.undefined
  
  /**
    * <p>The name of the global table to be updated.</p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object UpdateTableReplicaAutoScalingInput {
  
  inline def apply(): UpdateTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTableReplicaAutoScalingInput] (val x: Self) extends AnyVal {
    
    inline def setGlobalSecondaryIndexUpdates(value: js.Array[GlobalSecondaryIndexAutoScalingUpdate]): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.undefined)
    
    inline def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexAutoScalingUpdate*): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.Array(value*))
    
    inline def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    inline def setProvisionedWriteCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
    
    inline def setReplicaUpdates(value: js.Array[ReplicaAutoScalingUpdate]): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
    
    inline def setReplicaUpdatesUndefined: Self = StObject.set(x, "ReplicaUpdates", js.undefined)
    
    inline def setReplicaUpdatesVarargs(value: ReplicaAutoScalingUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value*))
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
