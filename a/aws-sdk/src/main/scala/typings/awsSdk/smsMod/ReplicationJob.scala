package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationJob extends StObject {
  
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
  implicit class ReplicationJobMutableBuilder[Self <: ReplicationJob] (val x: Self) extends AnyVal {
    
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
    def setLatestAmiId(value: AmiId): Self = StObject.set(x, "latestAmiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestAmiIdUndefined: Self = StObject.set(x, "latestAmiId", js.undefined)
    
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
    def setReplicationJobIdUndefined: Self = StObject.set(x, "replicationJobId", js.undefined)
    
    @scala.inline
    def setReplicationRunList(value: ReplicationRunList): Self = StObject.set(x, "replicationRunList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationRunListUndefined: Self = StObject.set(x, "replicationRunList", js.undefined)
    
    @scala.inline
    def setReplicationRunListVarargs(value: ReplicationRun*): Self = StObject.set(x, "replicationRunList", js.Array(value :_*))
    
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
    def setSeedReplicationTimeUndefined: Self = StObject.set(x, "seedReplicationTime", js.undefined)
    
    @scala.inline
    def setServerId(value: ServerId): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
    
    @scala.inline
    def setServerType(value: ServerType): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
    
    @scala.inline
    def setState(value: ReplicationJobState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: ReplicationJobStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    @scala.inline
    def setVmServer(value: VmServer): Self = StObject.set(x, "vmServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmServerUndefined: Self = StObject.set(x, "vmServer", js.undefined)
  }
}
