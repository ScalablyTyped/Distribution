package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTableReplicaAutoScalingInput extends StObject {
  
  /**
    * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
    */
  var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexAutoScalingUpdateList] = js.undefined
  
  var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  
  /**
    * Represents the auto scaling settings of replicas of the table that will be modified.
    */
  var ReplicaUpdates: js.UndefOr[ReplicaAutoScalingUpdateList] = js.undefined
  
  /**
    * The name of the global table to be updated.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName
}
object UpdateTableReplicaAutoScalingInput {
  
  inline def apply(TableName: TableName): UpdateTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingInput]
  }
  
  extension [Self <: UpdateTableReplicaAutoScalingInput](x: Self) {
    
    inline def setGlobalSecondaryIndexUpdates(value: GlobalSecondaryIndexAutoScalingUpdateList): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    inline def setGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.undefined)
    
    inline def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexAutoScalingUpdate*): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.Array(value :_*))
    
    inline def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    inline def setProvisionedWriteCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
    
    inline def setReplicaUpdates(value: ReplicaAutoScalingUpdateList): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
    
    inline def setReplicaUpdatesUndefined: Self = StObject.set(x, "ReplicaUpdates", js.undefined)
    
    inline def setReplicaUpdatesVarargs(value: ReplicaAutoScalingUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value :_*))
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
