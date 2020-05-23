package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerReplicationParameters extends js.Object {
  /**
    * When true, the replication job produces encrypted AMIs. See also KmsKeyId below.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  /**
    * Frequency of creating replication jobs for the server.
    */
  var frequency: js.UndefOr[Frequency] = js.native
  /**
    *  KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * License type for creating a replication job for the server.
    */
  var licenseType: js.UndefOr[LicenseType] = js.native
  /**
    * Number of recent AMIs to keep when creating a replication job for this server.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.native
  /**
    * 
    */
  var runOnce: js.UndefOr[RunOnce] = js.native
  /**
    * Seed time for creating a replication job for the server.
    */
  var seedTime: js.UndefOr[Timestamp] = js.native
}

object ServerReplicationParameters {
  @scala.inline
  def apply(
    encrypted: js.UndefOr[Encrypted] = js.undefined,
    frequency: js.UndefOr[Frequency] = js.undefined,
    kmsKeyId: KmsKeyId = null,
    licenseType: LicenseType = null,
    numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
    runOnce: js.UndefOr[RunOnce] = js.undefined,
    seedTime: Timestamp = null
  ): ServerReplicationParameters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (licenseType != null) __obj.updateDynamic("licenseType")(licenseType.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfRecentAmisToKeep)) __obj.updateDynamic("numberOfRecentAmisToKeep")(numberOfRecentAmisToKeep.get.asInstanceOf[js.Any])
    if (!js.isUndefined(runOnce)) __obj.updateDynamic("runOnce")(runOnce.get.asInstanceOf[js.Any])
    if (seedTime != null) __obj.updateDynamic("seedTime")(seedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerReplicationParameters]
  }
}

