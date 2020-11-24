package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationJob extends js.Object {
  
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * Indicates whether the replication job should produce encrypted AMIs.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  
  /**
    * The time between consecutive replication runs, in hours.
    */
  var frequency: js.UndefOr[Frequency] = js.native
  
  /**
    * The ID of the KMS key for replication jobs that produce encrypted AMIs. This value can be any of the following:    KMS key ID   KMS key alias   ARN referring to the KMS key ID   ARN referring to the KMS key alias   If encrypted is enabled but a KMS key ID is not specified, the customer's default KMS key for Amazon EBS is used.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  
  /**
    * The ID of the latest Amazon Machine Image (AMI).
    */
  var latestAmiId: js.UndefOr[AmiId] = js.native
  
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.native
  
  /**
    * The start time of the next replication run.
    */
  var nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The number of recent AMIs to keep in the customer's account for a replication job. By default, the value is set to zero, meaning that all AMIs are kept.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.native
  
  /**
    * The ID of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.native
  
  /**
    * Information about the replication runs.
    */
  var replicationRunList: js.UndefOr[ReplicationRunList] = js.native
  
  /**
    * The name of the IAM role to be used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  
  /**
    * Indicates whether to run the replication job one time.
    */
  var runOnce: js.UndefOr[RunOnce] = js.native
  
  /**
    * The seed replication time.
    */
  var seedReplicationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The ID of the server.
    */
  var serverId: js.UndefOr[ServerId] = js.native
  
  /**
    * The type of server.
    */
  var serverType: js.UndefOr[ServerType] = js.native
  
  /**
    * The state of the replication job.
    */
  var state: js.UndefOr[ReplicationJobState] = js.native
  
  /**
    * The description of the current status of the replication job.
    */
  var statusMessage: js.UndefOr[ReplicationJobStatusMessage] = js.native
  
  /**
    * Information about the VM server.
    */
  var vmServer: js.UndefOr[VmServer] = js.native
}
object ReplicationJob {
  
  @scala.inline
  def apply(): ReplicationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationJob]
  }
  
  @scala.inline
  implicit class ReplicationJobOps[Self <: ReplicationJob] (val x: Self) extends AnyVal {
    
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
    def setLatestAmiId(value: AmiId): Self = this.set("latestAmiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatestAmiId: Self = this.set("latestAmiId", js.undefined)
    
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
    def setReplicationJobId(value: ReplicationJobId): Self = this.set("replicationJobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationJobId: Self = this.set("replicationJobId", js.undefined)
    
    @scala.inline
    def setReplicationRunListVarargs(value: ReplicationRun*): Self = this.set("replicationRunList", js.Array(value :_*))
    
    @scala.inline
    def setReplicationRunList(value: ReplicationRunList): Self = this.set("replicationRunList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationRunList: Self = this.set("replicationRunList", js.undefined)
    
    @scala.inline
    def setRoleName(value: RoleName): Self = this.set("roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    
    @scala.inline
    def setRunOnce(value: RunOnce): Self = this.set("runOnce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunOnce: Self = this.set("runOnce", js.undefined)
    
    @scala.inline
    def setSeedReplicationTime(value: Timestamp): Self = this.set("seedReplicationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeedReplicationTime: Self = this.set("seedReplicationTime", js.undefined)
    
    @scala.inline
    def setServerId(value: ServerId): Self = this.set("serverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerId: Self = this.set("serverId", js.undefined)
    
    @scala.inline
    def setServerType(value: ServerType): Self = this.set("serverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerType: Self = this.set("serverType", js.undefined)
    
    @scala.inline
    def setState(value: ReplicationJobState): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: ReplicationJobStatusMessage): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    
    @scala.inline
    def setVmServer(value: VmServer): Self = this.set("vmServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmServer: Self = this.set("vmServer", js.undefined)
  }
}
