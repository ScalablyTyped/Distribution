package typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod.AutoScalingSettingsDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaGlobalSecondaryIndexSettingsDescription extends js.Object {
  /**
    * <p>The name of the global secondary index. The name must be unique among all other indexes on this table.</p>
    */
  var IndexName: String
  /**
    * <p> The current status of the global secondary index:</p> <ul> <li> <p> <code>CREATING</code> - The global secondary index is being created.</p> </li> <li> <p> <code>UPDATING</code> - The global secondary index is being updated.</p> </li> <li> <p> <code>DELETING</code> - The global secondary index is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The global secondary index is ready for use.</p> </li> </ul>
    */
  var IndexStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.undefined
  /**
    * <p>Autoscaling settings for a global secondary index replica's read capacity units.</p>
    */
  var ProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>AutoScaling settings for a global secondary index replica's write capacity units.</p>
    */
  var ProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>.</p>
    */
  var ProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
}

object ReplicaGlobalSecondaryIndexSettingsDescription {
  @scala.inline
  def apply(
    IndexName: String,
    IndexStatus: CREATING | UPDATING | DELETING | ACTIVE | String = null,
    ProvisionedReadCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined,
    ProvisionedWriteCapacityAutoScalingSettings: AutoScalingSettingsDescription = null,
    ProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
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

