package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReplicationJobRequest extends StObject {
  
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
  implicit class CreateReplicationJobRequestMutableBuilder[Self <: CreateReplicationJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Encrypted): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    @scala.inline
    def setFrequency(value: Frequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseType(value: LicenseType): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseTypeUndefined: Self = StObject.set(x, "licenseType", js.undefined)
    
    @scala.inline
    def setNumberOfRecentAmisToKeep(value: NumberOfRecentAmisToKeep): Self = StObject.set(x, "numberOfRecentAmisToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRecentAmisToKeepUndefined: Self = StObject.set(x, "numberOfRecentAmisToKeep", js.undefined)
    
    @scala.inline
    def setRoleName(value: RoleName): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    @scala.inline
    def setRunOnce(value: RunOnce): Self = StObject.set(x, "runOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunOnceUndefined: Self = StObject.set(x, "runOnce", js.undefined)
    
    @scala.inline
    def setSeedReplicationTime(value: Timestamp): Self = StObject.set(x, "seedReplicationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
  }
}
