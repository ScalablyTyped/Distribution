package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCluster extends js.Object {
  /**
    * Provides a list of the AWS Identity and Access Management (IAM) roles that are associated with the cluster. IAM roles that are associated with a cluster grant permission for the cluster to access other AWS services on your behalf.
    */
  var AssociatedRoles: js.UndefOr[DBClusterRoles] = js.native
  /**
    * Provides the list of Amazon EC2 Availability Zones that instances in the cluster can be created in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.docdbMod.AvailabilityZones] = js.native
  /**
    * Specifies the number of days for which automatic snapshots are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the time when the cluster was created, in Universal Coordinated Time (UTC).
    */
  var ClusterCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * The Amazon Resource Name (ARN) for the cluster.
    */
  var DBClusterArn: js.UndefOr[String] = js.native
  /**
    * Contains a user-supplied cluster identifier. This identifier is the unique key that identifies a cluster.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * Provides the list of instances that make up the cluster.
    */
  var DBClusterMembers: js.UndefOr[DBClusterMemberList] = js.native
  /**
    * Specifies the name of the cluster parameter group for the cluster.
    */
  var DBClusterParameterGroup: js.UndefOr[String] = js.native
  /**
    * Specifies information on the subnet group that is associated with the cluster, including the name, description, and subnets in the subnet group.
    */
  var DBSubnetGroup: js.UndefOr[String] = js.native
  /**
    * The AWS Region-unique, immutable identifier for the cluster. This identifier is found in AWS CloudTrail log entries whenever the AWS KMS key for the cluster is accessed.
    */
  var DbClusterResourceId: js.UndefOr[String] = js.native
  /**
    * Specifies whether this cluster can be deleted. If DeletionProtection is enabled, the cluster cannot be deleted unless it is modified and DeletionProtection is disabled. DeletionProtection protects clusters from being accidentally deleted.
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.native
  /**
    * The earliest time to which a database can be restored with point-in-time restore.
    */
  var EarliestRestorableTime: js.UndefOr[TStamp] = js.native
  /**
    * A list of log types that this cluster is configured to export to Amazon CloudWatch Logs.
    */
  var EnabledCloudwatchLogsExports: js.UndefOr[LogTypeList] = js.native
  /**
    * Specifies the connection endpoint for the primary instance of the cluster.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * Provides the name of the database engine to be used for this cluster.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * Specifies the ID that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[String] = js.native
  /**
    * If StorageEncrypted is true, the AWS KMS key identifier for the encrypted cluster.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * Specifies the latest time to which a database can be restored with point-in-time restore.
    */
  var LatestRestorableTime: js.UndefOr[TStamp] = js.native
  /**
    * Contains the master user name for the cluster.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * Specifies whether the cluster has instances in multiple Availability Zones.
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the progress of the operation as a percentage.
    */
  var PercentProgress: js.UndefOr[String] = js.native
  /**
    * Specifies the port that the database engine is listening on.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the daily time range during which automated backups are created if automated backups are enabled, as determined by the BackupRetentionPeriod. 
    */
  var PreferredBackupWindow: js.UndefOr[String] = js.native
  /**
    * Specifies the weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC).
    */
  var PreferredMaintenanceWindow: js.UndefOr[String] = js.native
  /**
    * The reader endpoint for the cluster. The reader endpoint for a cluster load balances connections across the Amazon DocumentDB replicas that are available in a cluster. As clients request new connections to the reader endpoint, Amazon DocumentDB distributes the connection requests among the Amazon DocumentDB replicas in the cluster. This functionality can help balance your read workload across multiple Amazon DocumentDB replicas in your cluster.  If a failover occurs, and the Amazon DocumentDB replica that you are connected to is promoted to be the primary instance, your connection is dropped. To continue sending your read workload to other Amazon DocumentDB replicas in the cluster, you can then reconnect to the reader endpoint.
    */
  var ReaderEndpoint: js.UndefOr[String] = js.native
  /**
    * Specifies the current state of this cluster.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Specifies whether the cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  /**
    * Provides a list of virtual private cloud (VPC) security groups that the cluster belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[VpcSecurityGroupMembershipList] = js.native
}

object DBCluster {
  @scala.inline
  def apply(
    AssociatedRoles: DBClusterRoles = null,
    AvailabilityZones: AvailabilityZones = null,
    BackupRetentionPeriod: Int | Double = null,
    ClusterCreateTime: TStamp = null,
    DBClusterArn: String = null,
    DBClusterIdentifier: String = null,
    DBClusterMembers: DBClusterMemberList = null,
    DBClusterParameterGroup: String = null,
    DBSubnetGroup: String = null,
    DbClusterResourceId: String = null,
    DeletionProtection: js.UndefOr[scala.Boolean] = js.undefined,
    EarliestRestorableTime: TStamp = null,
    EnabledCloudwatchLogsExports: LogTypeList = null,
    Endpoint: String = null,
    Engine: String = null,
    EngineVersion: String = null,
    HostedZoneId: String = null,
    KmsKeyId: String = null,
    LatestRestorableTime: TStamp = null,
    MasterUsername: String = null,
    MultiAZ: js.UndefOr[scala.Boolean] = js.undefined,
    PercentProgress: String = null,
    Port: Int | Double = null,
    PreferredBackupWindow: String = null,
    PreferredMaintenanceWindow: String = null,
    ReaderEndpoint: String = null,
    Status: String = null,
    StorageEncrypted: js.UndefOr[scala.Boolean] = js.undefined,
    VpcSecurityGroups: VpcSecurityGroupMembershipList = null
  ): DBCluster = {
    val __obj = js.Dynamic.literal()
    if (AssociatedRoles != null) __obj.updateDynamic("AssociatedRoles")(AssociatedRoles.asInstanceOf[js.Any])
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (BackupRetentionPeriod != null) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod.asInstanceOf[js.Any])
    if (ClusterCreateTime != null) __obj.updateDynamic("ClusterCreateTime")(ClusterCreateTime.asInstanceOf[js.Any])
    if (DBClusterArn != null) __obj.updateDynamic("DBClusterArn")(DBClusterArn.asInstanceOf[js.Any])
    if (DBClusterIdentifier != null) __obj.updateDynamic("DBClusterIdentifier")(DBClusterIdentifier.asInstanceOf[js.Any])
    if (DBClusterMembers != null) __obj.updateDynamic("DBClusterMembers")(DBClusterMembers.asInstanceOf[js.Any])
    if (DBClusterParameterGroup != null) __obj.updateDynamic("DBClusterParameterGroup")(DBClusterParameterGroup.asInstanceOf[js.Any])
    if (DBSubnetGroup != null) __obj.updateDynamic("DBSubnetGroup")(DBSubnetGroup.asInstanceOf[js.Any])
    if (DbClusterResourceId != null) __obj.updateDynamic("DbClusterResourceId")(DbClusterResourceId.asInstanceOf[js.Any])
    if (!js.isUndefined(DeletionProtection)) __obj.updateDynamic("DeletionProtection")(DeletionProtection.asInstanceOf[js.Any])
    if (EarliestRestorableTime != null) __obj.updateDynamic("EarliestRestorableTime")(EarliestRestorableTime.asInstanceOf[js.Any])
    if (EnabledCloudwatchLogsExports != null) __obj.updateDynamic("EnabledCloudwatchLogsExports")(EnabledCloudwatchLogsExports.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (HostedZoneId != null) __obj.updateDynamic("HostedZoneId")(HostedZoneId.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LatestRestorableTime != null) __obj.updateDynamic("LatestRestorableTime")(LatestRestorableTime.asInstanceOf[js.Any])
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ.asInstanceOf[js.Any])
    if (PercentProgress != null) __obj.updateDynamic("PercentProgress")(PercentProgress.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (PreferredBackupWindow != null) __obj.updateDynamic("PreferredBackupWindow")(PreferredBackupWindow.asInstanceOf[js.Any])
    if (PreferredMaintenanceWindow != null) __obj.updateDynamic("PreferredMaintenanceWindow")(PreferredMaintenanceWindow.asInstanceOf[js.Any])
    if (ReaderEndpoint != null) __obj.updateDynamic("ReaderEndpoint")(ReaderEndpoint.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (!js.isUndefined(StorageEncrypted)) __obj.updateDynamic("StorageEncrypted")(StorageEncrypted.asInstanceOf[js.Any])
    if (VpcSecurityGroups != null) __obj.updateDynamic("VpcSecurityGroups")(VpcSecurityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCluster]
  }
}

