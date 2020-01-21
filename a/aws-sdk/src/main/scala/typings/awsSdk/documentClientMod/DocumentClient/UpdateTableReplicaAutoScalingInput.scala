package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var TableName: typings.awsSdk.documentClientMod.DocumentClient.TableName = js.native
}

object UpdateTableReplicaAutoScalingInput {
  @scala.inline
  def apply(
    TableName: TableName,
    GlobalSecondaryIndexUpdates: GlobalSecondaryIndexAutoScalingUpdateList = null,
    ProvisionedWriteCapacityAutoScalingUpdate: AutoScalingSettingsUpdate = null,
    ReplicaUpdates: ReplicaAutoScalingUpdateList = null
  ): UpdateTableReplicaAutoScalingInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexUpdates != null) __obj.updateDynamic("GlobalSecondaryIndexUpdates")(GlobalSecondaryIndexUpdates.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityAutoScalingUpdate != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingUpdate")(ProvisionedWriteCapacityAutoScalingUpdate.asInstanceOf[js.Any])
    if (ReplicaUpdates != null) __obj.updateDynamic("ReplicaUpdates")(ReplicaUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTableReplicaAutoScalingInput]
  }
}

