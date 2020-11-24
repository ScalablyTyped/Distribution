package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationJobRequest extends js.Object {
  
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * Indicates whether the replication job produces encrypted AMIs.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  
  /**
    * The time between consecutive replication runs, in hours.
    */
  var frequency: js.UndefOr[Frequency] = js.native
  
  /**
    * The ID of the KMS key for replication jobs that produce encrypted AMIs. This value can be any of the following:   KMS key ID   KMS key alias   ARN referring to the KMS key ID   ARN referring to the KMS key alias    If encrypted is true but a KMS key ID is not specified, the customer's default KMS key for Amazon EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.native
  
  /**
    * The maximum number of SMS-created AMIs to retain. The oldest is deleted after the maximum number is reached and a new AMI is created.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.native
  
  /**
    * The name of the IAM role to be used by the AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  
  /**
    * Indicates whether to run the replication job one time.
    */
  var runOnce: js.UndefOr[RunOnce] = js.native
  
  /**
    * The seed replication time.
    */
  var seedReplicationTime: Timestamp = js.native
  
  /**
    * The ID of the server.
    */
  var serverId: ServerId = js.native
}
object CreateReplicationJobRequest {
  
  @scala.inline
  def apply(seedReplicationTime: Timestamp, serverId: ServerId): CreateReplicationJobRequest = {
    val __obj = js.Dynamic.literal(seedReplicationTime = seedReplicationTime.asInstanceOf[js.Any], serverId = serverId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplicationJobRequest]
  }
  
  @scala.inline
  implicit class CreateReplicationJobRequestOps[Self <: CreateReplicationJobRequest] (val x: Self) extends AnyVal {
    
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
    def setSeedReplicationTime(value: Timestamp): Self = this.set("seedReplicationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerId(value: ServerId): Self = this.set("serverId", value.asInstanceOf[js.Any])
    
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
    def setNumberOfRecentAmisToKeep(value: NumberOfRecentAmisToKeep): Self = this.set("numberOfRecentAmisToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfRecentAmisToKeep: Self = this.set("numberOfRecentAmisToKeep", js.undefined)
    
    @scala.inline
    def setRoleName(value: RoleName): Self = this.set("roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    
    @scala.inline
    def setRunOnce(value: RunOnce): Self = this.set("runOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunOnce: Self = this.set("runOnce", js.undefined)
  }
}
