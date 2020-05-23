package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
  /**
    * The name of the global secondary index. The name must be unique among all other indexes on this table.
    */
  var IndexName: typings.awsSdk.dynamodbMod.IndexName = js.native
  /**
    *  The current status of the global secondary index:    CREATING - The global secondary index is being created.    UPDATING - The global secondary index is being updated.    DELETING - The global secondary index is being deleted.    ACTIVE - The global secondary index is ready for use.  
    */
  var IndexStatus: js.UndefOr[typings.awsSdk.dynamodbMod.IndexStatus] = js.native
  /**
    * Auto scaling settings for a global secondary index replica's read capacity units.
    */
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  /**
    * Auto scaling settings for a global secondary index replica's write capacity units.
    */
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException.
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}

object ReplicaGlobalSecondaryIndexSettingsDescription {
  @scala.inline
  def apply(
    IndexName: IndexName,
    IndexStatus: IndexStatus = null,
    ProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined,
    ProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
  ): ReplicaGlobalSecondaryIndexSettingsDescription = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    if (IndexStatus != null) __obj.updateDynamic("IndexStatus")(IndexStatus.asInstanceOf[js.Any])
    if (ProvisionedReadCapacityAutoScalingSettings != null) __obj.updateDynamic("ProvisionedReadCapacityAutoScalingSettings")(ProvisionedReadCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(ProvisionedReadCapacityUnits)) __obj.updateDynamic("ProvisionedReadCapacityUnits")(ProvisionedReadCapacityUnits.get.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityAutoScalingSettings != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingSettings")(ProvisionedWriteCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(ProvisionedWriteCapacityUnits)) __obj.updateDynamic("ProvisionedWriteCapacityUnits")(ProvisionedWriteCapacityUnits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaGlobalSecondaryIndexSettingsDescription]
  }
}

