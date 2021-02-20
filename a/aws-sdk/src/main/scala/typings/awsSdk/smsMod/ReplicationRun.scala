package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationRun extends StObject {
  
  /**
    * The ID of the Amazon Machine Image (AMI) from the replication run.
    */
  var amiId: js.UndefOr[AmiId] = js.native
  
  /**
    * The completion time of the last replication run.
    */
  var completedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * Indicates whether the replication run should produce an encrypted AMI.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  
  /**
    * The ID of the KMS key for replication jobs that produce encrypted AMIs. This value can be any of the following:   KMS key ID   KMS key alias   ARN referring to the KMS key ID   ARN referring to the KMS key alias    If encrypted is true but a KMS key ID is not specified, the customer's default KMS key for Amazon EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    * The ID of the replication run.
    */
  var replicationRunId: js.UndefOr[ReplicationRunId] = js.native
  
  /**
    * The start time of the next replication run.
    */
  var scheduledStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Details about the current stage of the replication run.
    */
  var stageDetails: js.UndefOr[ReplicationRunStageDetails] = js.native
  
  /**
    * The state of the replication run.
    */
  var state: js.UndefOr[ReplicationRunState] = js.native
  
  /**
    * The description of the current status of the replication job.
    */
  var statusMessage: js.UndefOr[ReplicationRunStatusMessage] = js.native
  
  /**
    * The type of replication run.
    */
  var `type`: js.UndefOr[ReplicationRunType] = js.native
}
object ReplicationRun {
  
  @scala.inline
  def apply(): ReplicationRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRun]
  }
  
  @scala.inline
  implicit class ReplicationRunMutableBuilder[Self <: ReplicationRun] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmiId(value: AmiId): Self = StObject.set(x, "amiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmiIdUndefined: Self = StObject.set(x, "amiId", js.undefined)
    
    @scala.inline
    def setCompletedTime(value: Timestamp): Self = StObject.set(x, "completedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedTimeUndefined: Self = StObject.set(x, "completedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Encrypted): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    @scala.inline
    def setReplicationRunId(value: ReplicationRunId): Self = StObject.set(x, "replicationRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationRunIdUndefined: Self = StObject.set(x, "replicationRunId", js.undefined)
    
    @scala.inline
    def setScheduledStartTime(value: Timestamp): Self = StObject.set(x, "scheduledStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledStartTimeUndefined: Self = StObject.set(x, "scheduledStartTime", js.undefined)
    
    @scala.inline
    def setStageDetails(value: ReplicationRunStageDetails): Self = StObject.set(x, "stageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageDetailsUndefined: Self = StObject.set(x, "stageDetails", js.undefined)
    
    @scala.inline
    def setState(value: ReplicationRunState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: ReplicationRunStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setType(value: ReplicationRunType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
