package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReplicationJobRequest extends js.Object {
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * When true, the replication job produces encrypted AMIs. See also KmsKeyId below.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  /**
    * The time between consecutive replication runs, in hours.
    */
  var frequency: js.UndefOr[Frequency] = js.native
  /**
    * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.native
  /**
    * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached and a new AMI is created.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.native
  /**
    * The name of the IAM role to be used by the AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  /**
    * 
    */
  var runOnce: js.UndefOr[RunOnce] = js.native
  /**
    * The seed replication time.
    */
  var seedReplicationTime: Timestamp = js.native
  /**
    * The identifier of the server.
    */
  var serverId: ServerId = js.native
}

object CreateReplicationJobRequest {
  @scala.inline
  def apply(
    seedReplicationTime: Timestamp,
    serverId: ServerId,
    description: Description = null,
    encrypted: js.UndefOr[Encrypted] = js.undefined,
    frequency: js.UndefOr[Frequency] = js.undefined,
    kmsKeyId: KmsKeyId = null,
    licenseType: LicenseType = null,
    numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
    roleName: RoleName = null,
    runOnce: js.UndefOr[RunOnce] = js.undefined
  ): CreateReplicationJobRequest = {
    val __obj = js.Dynamic.literal(seedReplicationTime = seedReplicationTime.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (licenseType != null) __obj.updateDynamic("licenseType")(licenseType.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfRecentAmisToKeep)) __obj.updateDynamic("numberOfRecentAmisToKeep")(numberOfRecentAmisToKeep.get.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    if (!js.isUndefined(runOnce)) __obj.updateDynamic("runOnce")(runOnce.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationJobRequest]
  }
}

