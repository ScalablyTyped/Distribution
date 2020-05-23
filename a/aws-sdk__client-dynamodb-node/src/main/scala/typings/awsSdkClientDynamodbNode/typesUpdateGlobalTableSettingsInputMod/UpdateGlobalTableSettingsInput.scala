package typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod

import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typings.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
import typings.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGlobalTableSettingsInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
    */
  var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
    (js.Array[
      typings.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
    ]) | (Iterable[
      typings.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod.GlobalTableGlobalSecondaryIndexSettingsUpdate
    ])
  ] = js.undefined
  /**
    * <p>The name of the global table</p>
    */
  var GlobalTableName: String
  /**
    * <p>AutoScaling settings for managing provisioned write capacity for the global table.</p>
    */
  var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException.</code> </p>
    */
  var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
  /**
    * <p>Represents the settings for a global table in a region that will be modified.</p>
    */
  var ReplicaSettingsUpdate: js.UndefOr[
    (js.Array[
      typings.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
    ]) | (Iterable[
      typings.awsSdkClientDynamodbNode.typesReplicaSettingsUpdateMod.ReplicaSettingsUpdate
    ])
  ] = js.undefined
}

object UpdateGlobalTableSettingsInput {
  @scala.inline
  def apply(
    GlobalTableName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: js.UndefOr[Double] = js.undefined,
    GlobalTableGlobalSecondaryIndexSettingsUpdate: js.Array[GlobalTableGlobalSecondaryIndexSettingsUpdate] | Iterable[GlobalTableGlobalSecondaryIndexSettingsUpdate] = null,
    GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: AutoScalingSettingsUpdate = null,
    GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined,
    ReplicaSettingsUpdate: js.Array[ReplicaSettingsUpdate] | Iterable[ReplicaSettingsUpdate] = null
  ): UpdateGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined($maxRetries)) __obj.updateDynamic("$maxRetries")($maxRetries.get.asInstanceOf[js.Any])
    if (GlobalTableGlobalSecondaryIndexSettingsUpdate != null) __obj.updateDynamic("GlobalTableGlobalSecondaryIndexSettingsUpdate")(GlobalTableGlobalSecondaryIndexSettingsUpdate.asInstanceOf[js.Any])
    if (GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate != null) __obj.updateDynamic("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate")(GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(GlobalTableProvisionedWriteCapacityUnits)) __obj.updateDynamic("GlobalTableProvisionedWriteCapacityUnits")(GlobalTableProvisionedWriteCapacityUnits.get.asInstanceOf[js.Any])
    if (ReplicaSettingsUpdate != null) __obj.updateDynamic("ReplicaSettingsUpdate")(ReplicaSettingsUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
  }
}

