package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationRun extends js.Object {
  
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
  implicit class ReplicationRunOps[Self <: ReplicationRun] (val x: Self) extends AnyVal {
    
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
    def setAmiId(value: AmiId): Self = this.set("amiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmiId: Self = this.set("amiId", js.undefined)
    
    @scala.inline
    def setCompletedTime(value: Timestamp): Self = this.set("completedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedTime: Self = this.set("completedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Encrypted): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: KmsKeyId): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    
    @scala.inline
    def setReplicationRunId(value: ReplicationRunId): Self = this.set("replicationRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationRunId: Self = this.set("replicationRunId", js.undefined)
    
    @scala.inline
    def setScheduledStartTime(value: Timestamp): Self = this.set("scheduledStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledStartTime: Self = this.set("scheduledStartTime", js.undefined)
    
    @scala.inline
    def setStageDetails(value: ReplicationRunStageDetails): Self = this.set("stageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageDetails: Self = this.set("stageDetails", js.undefined)
    
    @scala.inline
    def setState(value: ReplicationRunState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: ReplicationRunStatusMessage): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setType(value: ReplicationRunType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
