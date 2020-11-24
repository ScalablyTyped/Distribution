package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTableReplicaAutoScalingInput extends js.Object {
  
  /**
    * Represents the auto scaling settings of the global secondary indexes of the replica to be updated.
    */
  var GlobalSecondaryIndexUpdates: js.UndefOr[GlobalSecondaryIndexAutoScalingUpdateList] = js.native
  
  var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  
  /**
    * Represents the auto scaling settings of replicas of the table that will be modified.
    */
  var ReplicaUpdates: js.UndefOr[ReplicaAutoScalingUpdateList] = js.native
  
  /**
    * The name of the global table to be updated.
    */
  var TableName: typings.awsSdk.dynamodbMod.TableName = js.native
}
object UpdateTableReplicaAutoScalingInput {
  
  @scala.inline
  def apply(TableName: TableName): UpdateTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingInput]
  }
  
  @scala.inline
  implicit class UpdateTableReplicaAutoScalingInputOps[Self <: UpdateTableReplicaAutoScalingInput] (val x: Self) extends AnyVal {
    
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
    def setTableName(value: TableName): Self = this.set("TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexUpdatesVarargs(value: GlobalSecondaryIndexAutoScalingUpdate*): Self = this.set("GlobalSecondaryIndexUpdates", js.Array(value :_*))
    
    @scala.inline
    def setGlobalSecondaryIndexUpdates(value: GlobalSecondaryIndexAutoScalingUpdateList): Self = this.set("GlobalSecondaryIndexUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalSecondaryIndexUpdates: Self = this.set("GlobalSecondaryIndexUpdates", js.undefined)
    
    @scala.inline
    def setProvisionedWriteCapacityAutoScalingUpdate(value: AutoScalingSettingsUpdate): Self = this.set("ProvisionedWriteCapacityAutoScalingUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedWriteCapacityAutoScalingUpdate: Self = this.set("ProvisionedWriteCapacityAutoScalingUpdate", js.undefined)
    
    @scala.inline
    def setReplicaUpdatesVarargs(value: ReplicaAutoScalingUpdate*): Self = this.set("ReplicaUpdates", js.Array(value :_*))
    
    @scala.inline
    def setReplicaUpdates(value: ReplicaAutoScalingUpdateList): Self = this.set("ReplicaUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicaUpdates: Self = this.set("ReplicaUpdates", js.undefined)
  }
}
