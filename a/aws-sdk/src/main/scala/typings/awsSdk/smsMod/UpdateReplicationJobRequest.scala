package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateReplicationJobRequest extends StObject {
  
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * When true, the replication job produces encrypted AMIs. For more information, KmsKeyId.
    */
  var encrypted: js.UndefOr[Encrypted] = js.undefined
  
  /**
    * The time between consecutive replication runs, in hours.
    */
  var frequency: js.UndefOr[Frequency] = js.undefined
  
  /**
    * The ID of the KMS key for replication jobs that produce encrypted AMIs. This value can be any of the following:   KMS key ID   KMS key alias   ARN referring to the KMS key ID   ARN referring to the KMS key alias   If encrypted is enabled but a KMS key ID is not specified, the customer's default KMS key for Amazon EBS is used.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.undefined
  
  /**
    * The start time of the next replication run.
    */
  var nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The maximum number of SMS-created AMIs to retain. The oldest is deleted after the maximum number is reached and a new AMI is created.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined
  
  /**
    * The ID of the replication job.
    */
  var replicationJobId: ReplicationJobId
  
  /**
    * The name of the IAM role to be used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
}
object UpdateReplicationJobRequest {
  
  @scala.inline
  def apply(replicationJobId: ReplicationJobId): UpdateReplicationJobRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReplicationJobRequest]
  }
  
  @scala.inline
  implicit class UpdateReplicationJobRequestMutableBuilder[Self <: UpdateReplicationJobRequest] (val x: Self) extends AnyVal {
    
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
    def setNextReplicationRunStartTime(value: Timestamp): Self = StObject.set(x, "nextReplicationRunStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextReplicationRunStartTimeUndefined: Self = StObject.set(x, "nextReplicationRunStartTime", js.undefined)
    
    @scala.inline
    def setNumberOfRecentAmisToKeep(value: NumberOfRecentAmisToKeep): Self = StObject.set(x, "numberOfRecentAmisToKeep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfRecentAmisToKeepUndefined: Self = StObject.set(x, "numberOfRecentAmisToKeep", js.undefined)
    
    @scala.inline
    def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleName(value: RoleName): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
  }
}
