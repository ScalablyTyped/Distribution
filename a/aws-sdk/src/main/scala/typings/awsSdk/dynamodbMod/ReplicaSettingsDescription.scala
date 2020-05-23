package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaSettingsDescription extends js.Object {
  /**
    * The Region name of the replica.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName = js.native
  /**
    * The read/write capacity mode of the replica.
    */
  var ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary] = js.native
  /**
    * Replica global secondary index settings for the global table.
    */
  var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList] = js.native
  /**
    * Auto scaling settings for a global table replica's read capacity units.
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
  /**
    * Auto scaling settings for a global table replica's write capacity units.
    */
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    */
  var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.native
  /**
    * The current state of the Region:    CREATING - The Region is being created.    UPDATING - The Region is being updated.    DELETING - The Region is being deleted.    ACTIVE - The Region is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ReplicaStatus] = js.native
}

object ReplicaSettingsDescription {
  @scala.inline
  def apply(
    RegionName: RegionName,
    ReplicaBillingModeSummary: BillingModeSummary = null,
    ReplicaGlobalSecondaryIndexSettings: ReplicaGlobalSecondaryIndexSettingsDescriptionList = null,
    ReplicaProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined,
    ReplicaProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined,
    ReplicaStatus: ReplicaStatus = null
  ): ReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    if (ReplicaBillingModeSummary != null) __obj.updateDynamic("ReplicaBillingModeSummary")(ReplicaBillingModeSummary.asInstanceOf[js.Any])
    if (ReplicaGlobalSecondaryIndexSettings != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexSettings")(ReplicaGlobalSecondaryIndexSettings.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityAutoScalingSettings != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettings")(ReplicaProvisionedReadCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(ReplicaProvisionedReadCapacityUnits)) __obj.updateDynamic("ReplicaProvisionedReadCapacityUnits")(ReplicaProvisionedReadCapacityUnits.get.asInstanceOf[js.Any])
    if (ReplicaProvisionedWriteCapacityAutoScalingSettings != null) __obj.updateDynamic("ReplicaProvisionedWriteCapacityAutoScalingSettings")(ReplicaProvisionedWriteCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(ReplicaProvisionedWriteCapacityUnits)) __obj.updateDynamic("ReplicaProvisionedWriteCapacityUnits")(ReplicaProvisionedWriteCapacityUnits.get.asInstanceOf[js.Any])
    if (ReplicaStatus != null) __obj.updateDynamic("ReplicaStatus")(ReplicaStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsDescription]
  }
}

