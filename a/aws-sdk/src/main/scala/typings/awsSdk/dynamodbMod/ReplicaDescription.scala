package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaDescription extends js.Object {
  /**
    * Replica-specific global secondary index settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexDescriptionList] = js.native
  /**
    * The AWS KMS customer master key (CMK) of the replica that will be used for AWS KMS encryption.
    */
  var KMSMasterKeyId: js.UndefOr[typings.awsSdk.dynamodbMod.KMSMasterKeyId] = js.native
  /**
    * Replica-specific provisioned throughput. If not described, uses the source table's provisioned throughput settings.
    */
  var ProvisionedThroughputOverride: js.UndefOr[typings.awsSdk.dynamodbMod.ProvisionedThroughputOverride] = js.native
  /**
    * The name of the Region.
    */
  var RegionName: js.UndefOr[typings.awsSdk.dynamodbMod.RegionName] = js.native
  /**
    * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ReplicaStatus] = js.native
  /**
    * Detailed information about the replica status.
    */
  var ReplicaStatusDescription: js.UndefOr[typings.awsSdk.dynamodbMod.ReplicaStatusDescription] = js.native
  /**
    * Specifies the progress of a Create, Update, or Delete action on the replica as a percentage.
    */
  var ReplicaStatusPercentProgress: js.UndefOr[typings.awsSdk.dynamodbMod.ReplicaStatusPercentProgress] = js.native
}

object ReplicaDescription {
  @scala.inline
  def apply(
    GlobalSecondaryIndexes: ReplicaGlobalSecondaryIndexDescriptionList = null,
    KMSMasterKeyId: KMSMasterKeyId = null,
    ProvisionedThroughputOverride: ProvisionedThroughputOverride = null,
    RegionName: RegionName = null,
    ReplicaStatus: ReplicaStatus = null,
    ReplicaStatusDescription: ReplicaStatusDescription = null,
    ReplicaStatusPercentProgress: ReplicaStatusPercentProgress = null
  ): ReplicaDescription = {
    val __obj = js.Dynamic.literal()
    if (GlobalSecondaryIndexes != null) __obj.updateDynamic("GlobalSecondaryIndexes")(GlobalSecondaryIndexes.asInstanceOf[js.Any])
    if (KMSMasterKeyId != null) __obj.updateDynamic("KMSMasterKeyId")(KMSMasterKeyId.asInstanceOf[js.Any])
    if (ProvisionedThroughputOverride != null) __obj.updateDynamic("ProvisionedThroughputOverride")(ProvisionedThroughputOverride.asInstanceOf[js.Any])
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName.asInstanceOf[js.Any])
    if (ReplicaStatus != null) __obj.updateDynamic("ReplicaStatus")(ReplicaStatus.asInstanceOf[js.Any])
    if (ReplicaStatusDescription != null) __obj.updateDynamic("ReplicaStatusDescription")(ReplicaStatusDescription.asInstanceOf[js.Any])
    if (ReplicaStatusPercentProgress != null) __obj.updateDynamic("ReplicaStatusPercentProgress")(ReplicaStatusPercentProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaDescription]
  }
}

