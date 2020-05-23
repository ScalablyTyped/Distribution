package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationJob extends js.Object {
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Whether the replication job should produce encrypted AMIs or not. See also KmsKeyId below.
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
    * Number of recent AMIs to keep in the customer's account for a replication job. By default the value is set to zero, meaning that all AMIs are kept.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.native
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.native
  /**
    * Information about the replication runs.
    */
  var replicationRunList: js.UndefOr[ReplicationRunList] = js.native
  /**
    * The name of the IAM role to be used by the Server Migration Service.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  /**
    * 
    */
  var runOnce: js.UndefOr[RunOnce] = js.native
  /**
    * The seed replication time.
    */
  var seedReplicationTime: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier of the server.
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
  def apply(
    description: Description = null,
    encrypted: js.UndefOr[Encrypted] = js.undefined,
    frequency: js.UndefOr[Frequency] = js.undefined,
    kmsKeyId: KmsKeyId = null,
    latestAmiId: AmiId = null,
    licenseType: LicenseType = null,
    nextReplicationRunStartTime: Timestamp = null,
    numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
    replicationJobId: ReplicationJobId = null,
    replicationRunList: ReplicationRunList = null,
    roleName: RoleName = null,
    runOnce: js.UndefOr[RunOnce] = js.undefined,
    seedReplicationTime: Timestamp = null,
    serverId: ServerId = null,
    serverType: ServerType = null,
    state: ReplicationJobState = null,
    statusMessage: ReplicationJobStatusMessage = null,
    vmServer: VmServer = null
  ): ReplicationJob = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (latestAmiId != null) __obj.updateDynamic("latestAmiId")(latestAmiId.asInstanceOf[js.Any])
    if (licenseType != null) __obj.updateDynamic("licenseType")(licenseType.asInstanceOf[js.Any])
    if (nextReplicationRunStartTime != null) __obj.updateDynamic("nextReplicationRunStartTime")(nextReplicationRunStartTime.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfRecentAmisToKeep)) __obj.updateDynamic("numberOfRecentAmisToKeep")(numberOfRecentAmisToKeep.get.asInstanceOf[js.Any])
    if (replicationJobId != null) __obj.updateDynamic("replicationJobId")(replicationJobId.asInstanceOf[js.Any])
    if (replicationRunList != null) __obj.updateDynamic("replicationRunList")(replicationRunList.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName.asInstanceOf[js.Any])
    if (!js.isUndefined(runOnce)) __obj.updateDynamic("runOnce")(runOnce.get.asInstanceOf[js.Any])
    if (seedReplicationTime != null) __obj.updateDynamic("seedReplicationTime")(seedReplicationTime.asInstanceOf[js.Any])
    if (serverId != null) __obj.updateDynamic("serverId")(serverId.asInstanceOf[js.Any])
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (vmServer != null) __obj.updateDynamic("vmServer")(vmServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationJob]
  }
}

