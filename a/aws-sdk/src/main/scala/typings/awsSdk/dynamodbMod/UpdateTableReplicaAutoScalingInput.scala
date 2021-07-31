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
  
  @scala.inline
  def apply(TableName: TableName): UpdateTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingInput]
  }
  
  @scala.inline
  implicit class UpdateTableReplicaAutoScalingInputMutableBuilder[Self <: UpdateTableReplicaAutoScalingInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalSecondaryIndexUpdates(value: GlobalSecondaryIndexAutoScalingUpdateList): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexUpdatesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexAutoScalingUpdate*): Self = StObject.set(x, "GlobalSecondaryIndexUpdates", js.Array(value :_*))
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingUpdateUndefined: Self = StObject.set(x, "ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
    
    @scala.inline
    def setReplicaUpdates(value: ReplicaAutoScalingUpdateList): Self = StObject.set(x, "ReplicaUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaUpdatesUndefined: Self = StObject.set(x, "ReplicaUpdates", js.undefined)
    
    @scala.inline
    def setReplicaUpdatesVarargs(value: ReplicaAutoScalingUpdate*): Self = StObject.set(x, "ReplicaUpdates", js.Array(value :_*))
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
  }
}
