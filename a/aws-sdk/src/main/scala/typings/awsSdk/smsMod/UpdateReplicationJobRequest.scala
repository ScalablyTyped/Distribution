package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateReplicationJobRequest extends js.Object {
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * When true, the replication job produces encrypted AMIs . See also KmsKeyId below.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  /**
    * The time between consecutive replication runs, in hours.
    */
  var frequency: js.UndefOr[Frequency] = js.native
  /**
    *  KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.native
  /**
    * The start time of the next replication run.
    */
  var nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached and a new AMI is created.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.native
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: ReplicationJobId = js.native
  /**
    * The name of the IAM role to be used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
}

object UpdateReplicationJobRequest {
  @scala.inline
  def apply(replicationJobId: ReplicationJobId): UpdateReplicationJobRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReplicationJobRequest]
  }
  @scala.inline
  implicit class UpdateReplicationJobRequestOps[Self <: UpdateReplicationJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReplicationJobId(value: ReplicationJobId): Self = this.set("replicationJobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEncrypted(value: Encrypted): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    @scala.inline
    def setFrequency(value: Frequency): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setLicenseType(value: LicenseType): Self = this.set("licenseType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseType: Self = this.set("licenseType", js.undefined)
    @scala.inline
    def setNextReplicationRunStartTime(value: Timestamp): Self = this.set("nextReplicationRunStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextReplicationRunStartTime: Self = this.set("nextReplicationRunStartTime", js.undefined)
    @scala.inline
    def setNumberOfRecentAmisToKeep(value: NumberOfRecentAmisToKeep): Self = this.set("numberOfRecentAmisToKeep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfRecentAmisToKeep: Self = this.set("numberOfRecentAmisToKeep", js.undefined)
    @scala.inline
    def setRoleName(value: RoleName): Self = this.set("roleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
  }
  
}

