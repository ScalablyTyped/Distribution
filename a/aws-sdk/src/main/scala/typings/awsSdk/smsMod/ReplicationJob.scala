package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationJob extends StObject {
  
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Indicates whether the replication job should produce encrypted AMIs.
    */
  var encrypted: js.UndefOr[Encrypted] = js.undefined
  
  /**
    * The time between consecutive replication runs, in hours.
    */
  var frequency: js.UndefOr[Frequency] = js.undefined
  
  /**
    * The ID of the KMS key for replication jobs that produce encrypted AMIs. This value can be any of the following:    KMS key ID   KMS key alias   ARN referring to the KMS key ID   ARN referring to the KMS key alias   If encrypted is enabled but a KMS key ID is not specified, the customer's default KMS key for Amazon EBS is used.
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The ID of the latest Amazon Machine Image (AMI).
    */
  var latestAmiId: js.UndefOr[AmiId] = js.undefined
  
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.undefined
  
  /**
    * The start time of the next replication run.
    */
  var nextReplicationRunStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of recent AMIs to keep in the customer's account for a replication job. By default, the value is set to zero, meaning that all AMIs are kept.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined
  
  /**
    * The ID of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
  
  /**
    * Information about the replication runs.
    */
  var replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined
  
  /**
    * The name of the IAM role to be used by Server Migration Service.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  
  /**
    * Indicates whether to run the replication job one time.
    */
  var runOnce: js.UndefOr[RunOnce] = js.undefined
  
  /**
    * The seed replication time.
    */
  var seedReplicationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the server.
    */
  var serverId: js.UndefOr[ServerId] = js.undefined
  
  /**
    * The type of server.
    */
  var serverType: js.UndefOr[ServerType] = js.undefined
  
  /**
    * The state of the replication job.
    */
  var state: js.UndefOr[ReplicationJobState] = js.undefined
  
  /**
    * The description of the current status of the replication job.
    */
  var statusMessage: js.UndefOr[ReplicationJobStatusMessage] = js.undefined
  
  /**
    * Information about the VM server.
    */
  var vmServer: js.UndefOr[VmServer] = js.undefined
}
object ReplicationJob {
  
  inline def apply(): ReplicationJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationJob]
  }
  
  extension [Self <: ReplicationJob](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncrypted(value: Encrypted): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setFrequency(value: Frequency): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setLatestAmiId(value: AmiId): Self = StObject.set(x, "latestAmiId", value.asInstanceOf[js.Any])
    
    inline def setLatestAmiIdUndefined: Self = StObject.set(x, "latestAmiId", js.undefined)
    
    inline def setLicenseType(value: LicenseType): Self = StObject.set(x, "licenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypeUndefined: Self = StObject.set(x, "licenseType", js.undefined)
    
    inline def setNextReplicationRunStartTime(value: js.Date): Self = StObject.set(x, "nextReplicationRunStartTime", value.asInstanceOf[js.Any])
    
    inline def setNextReplicationRunStartTimeUndefined: Self = StObject.set(x, "nextReplicationRunStartTime", js.undefined)
    
    inline def setNumberOfRecentAmisToKeep(value: NumberOfRecentAmisToKeep): Self = StObject.set(x, "numberOfRecentAmisToKeep", value.asInstanceOf[js.Any])
    
    inline def setNumberOfRecentAmisToKeepUndefined: Self = StObject.set(x, "numberOfRecentAmisToKeep", js.undefined)
    
    inline def setReplicationJobId(value: ReplicationJobId): Self = StObject.set(x, "replicationJobId", value.asInstanceOf[js.Any])
    
    inline def setReplicationJobIdUndefined: Self = StObject.set(x, "replicationJobId", js.undefined)
    
    inline def setReplicationRunList(value: ReplicationRunList): Self = StObject.set(x, "replicationRunList", value.asInstanceOf[js.Any])
    
    inline def setReplicationRunListUndefined: Self = StObject.set(x, "replicationRunList", js.undefined)
    
    inline def setReplicationRunListVarargs(value: ReplicationRun*): Self = StObject.set(x, "replicationRunList", js.Array(value*))
    
    inline def setRoleName(value: RoleName): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    inline def setRunOnce(value: RunOnce): Self = StObject.set(x, "runOnce", value.asInstanceOf[js.Any])
    
    inline def setRunOnceUndefined: Self = StObject.set(x, "runOnce", js.undefined)
    
    inline def setSeedReplicationTime(value: js.Date): Self = StObject.set(x, "seedReplicationTime", value.asInstanceOf[js.Any])
    
    inline def setSeedReplicationTimeUndefined: Self = StObject.set(x, "seedReplicationTime", js.undefined)
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "serverId", value.asInstanceOf[js.Any])
    
    inline def setServerIdUndefined: Self = StObject.set(x, "serverId", js.undefined)
    
    inline def setServerType(value: ServerType): Self = StObject.set(x, "serverType", value.asInstanceOf[js.Any])
    
    inline def setServerTypeUndefined: Self = StObject.set(x, "serverType", js.undefined)
    
    inline def setState(value: ReplicationJobState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: ReplicationJobStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setVmServer(value: VmServer): Self = StObject.set(x, "vmServer", value.asInstanceOf[js.Any])
    
    inline def setVmServerUndefined: Self = StObject.set(x, "vmServer", js.undefined)
  }
}
