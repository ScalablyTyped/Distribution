package typings.awsSdkClientDynamodbNode.typesReplicaSettingsDescriptionMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ACTIVE
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.CREATING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.DELETING
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.UPDATING
import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsDescriptionMod.AutoScalingSettingsDescription
import typings.awsSdkClientDynamodbNode.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod.ReplicaGlobalSecondaryIndexSettingsDescription
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaSettingsDescription extends js.Object {
  /**
    * <p>The region name of the replica.</p>
    */
  var RegionName: String
  /**
    * <p>Replica global secondary index settings for the global table.</p>
    */
  var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[
    js.Array[ReplicaGlobalSecondaryIndexSettingsDescription] | Iterable[ReplicaGlobalSecondaryIndexSettingsDescription]
  ] = js.undefined
  /**
    * <p>Autoscaling settings for a global table replica's read capacity units.</p>
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>AutoScaling settings for a global table replica's write capacity units.</p>
    */
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>The current state of the region:</p> <ul> <li> <p> <code>CREATING</code> - The region is being created.</p> </li> <li> <p> <code>UPDATING</code> - The region is being updated.</p> </li> <li> <p> <code>DELETING</code> - The region is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The region is ready for use.</p> </li> </ul>
    */
  var ReplicaStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.undefined
}

object ReplicaSettingsDescription {
  @scala.inline
  def apply(
    RegionName: String,
    ReplicaGlobalSecondaryIndexSettings: js.Array[ReplicaGlobalSecondaryIndexSettingsDescription] | Iterable[ReplicaGlobalSecondaryIndexSettingsDescription] = null,
    ReplicaProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined,
    ReplicaProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ReplicaProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined,
    ReplicaStatus: CREATING | UPDATING | DELETING | ACTIVE | String = null
  ): ReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    if (ReplicaGlobalSecondaryIndexSettings != null) __obj.updateDynamic("ReplicaGlobalSecondaryIndexSettings")(ReplicaGlobalSecondaryIndexSettings.asInstanceOf[js.Any])
    if (ReplicaProvisionedReadCapacityAutoScalingSettings != null) __obj.updateDynamic("ReplicaProvisionedReadCapacityAutoScalingSettings")(ReplicaProvisionedReadCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(ReplicaProvisionedReadCapacityUnits)) __obj.updateDynamic("ReplicaProvisionedReadCapacityUnits")(ReplicaProvisionedReadCapacityUnits.get.asInstanceOf[js.Any])
    if (ReplicaProvisionedWriteCapacityAutoScalingSettings != null) __obj.updateDynamic("ReplicaProvisionedWriteCapacityAutoScalingSettings")(ReplicaProvisionedWriteCapacityAutoScalingSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(ReplicaProvisionedWriteCapacityUnits)) __obj.updateDynamic("ReplicaProvisionedWriteCapacityUnits")(ReplicaProvisionedWriteCapacityUnits.get.asInstanceOf[js.Any])
    if (ReplicaStatus != null) __obj.updateDynamic("ReplicaStatus")(ReplicaStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsDescription]
  }
}

