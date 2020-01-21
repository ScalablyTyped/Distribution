package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationGroupMemberAction extends js.Object {
  /**
    * Replica-specific global secondary index settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexList] = js.native
  /**
    * The AWS KMS customer master key (CMK) that should be used for AWS KMS encryption in the new replica. To specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note that you should only provide this parameter if the key is different from the default DynamoDB KMS master key alias/aws/dynamodb.
    */
  var KMSMasterKeyId: js.UndefOr[typings.awsSdk.dynamodbMod.KMSMasterKeyId] = js.native
  /**
    * Replica-specific provisioned throughput. If not specified, uses the source table's provisioned throughput settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.dynamodbMod.ProvisionedThroughputOverride] = js.native
  /**
    * The Region where the new replica will be created.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName = js.native
}

object CreateReplicationGroupMemberAction {
  @scala.inline
  def apply(
    RegionName: RegionName,
    GlobalSecondaryIndexes: ReplicaGlobalSecondaryIndexList = null,
    KMSMasterKeyId: KMSMasterKeyId = null,
    ProvisionedThroughputOverride: ProvisionedThroughputOverride = null
  ): CreateReplicationGroupMemberAction = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (KMSMasterKeyId != null) __obj.updateDynamic("KMSMasterKeyId")(KMSMasterKeyId.asInstanceOf[js.Any])
    if (ProvisionedThroughputOverride != null) __obj.updateDynamic("ProvisionedThroughputOverride")(ProvisionedThroughputOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationGroupMemberAction]
  }
}

