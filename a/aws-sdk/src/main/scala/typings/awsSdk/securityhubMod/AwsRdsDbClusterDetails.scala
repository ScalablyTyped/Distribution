package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbClusterDetails extends js.Object {
  
  /**
    * The status of the database activity stream.
    */
  var ActivityStreamStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * For all database engines except Aurora, specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  
  /**
    * A list of the IAM roles that are associated with the DB cluster.
    */
  var AssociatedRoles: js.UndefOr[AwsRdsDbClusterAssociatedRoles] = js.native
  
  /**
    * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
    */
  var AvailabilityZones: js.UndefOr[StringList] = js.native
  
  /**
    * The number of days for which automated backups are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.native
  
  /**
    * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC). Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var ClusterCreateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether tags are copied from the DB cluster to snapshots of the DB cluster.
    */
  var CopyTagsToSnapshot: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
    */
  var CrossAccountClone: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of custom endpoints for the DB cluster.
    */
  var CustomEndpoints: js.UndefOr[StringList] = js.native
  
  /**
    * The name of the database.
    */
  var DatabaseName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The DB cluster identifier that the user assigned to the cluster. This identifier is the unique key that identifies a DB cluster.
    */
  var DbClusterIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The list of instances that make up the DB cluster.
    */
  var DbClusterMembers: js.UndefOr[AwsRdsDbClusterMembers] = js.native
  
  /**
    * The list of option group memberships for this DB cluster.
    */
  var DbClusterOptionGroupMemberships: js.UndefOr[AwsRdsDbClusterOptionGroupMemberships] = js.native
  
  /**
    * The name of the DB cluster parameter group for the DB cluster.
    */
  var DbClusterParameterGroup: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the DB cluster. The identifier must be unique within each AWS Region and is immutable.
    */
  var DbClusterResourceId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The subnet group that is associated with the DB cluster, including the name, description, and subnets in the subnet group.
    */
  var DbSubnetGroup: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the DB cluster has deletion protection enabled.
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.native
  
  /**
    * The Active Directory domain membership records that are associated with the DB cluster.
    */
  var DomainMemberships: js.UndefOr[AwsRdsDbDomainMemberships] = js.native
  
  /**
    * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
    */
  var EnabledCloudWatchLogsExports: js.UndefOr[StringList] = js.native
  
  /**
    * The connection endpoint for the primary instance of the DB cluster.
    */
  var Endpoint: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the database engine to use for this DB cluster.
    */
  var Engine: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The database engine mode of the DB cluster.
    */
  var EngineMode: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The version number of the database engine to use.
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Specifies the identifier that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
    */
  var HttpEndpointEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the mapping of IAM accounts to database accounts is enabled.
    */
  var IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the master user for the DB cluster.
    */
  var MasterUsername: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the DB cluster has instances in multiple Availability Zones.
    */
  var MultiAz: js.UndefOr[Boolean] = js.native
  
  /**
    * The port number on which the DB instances in the DB cluster accept connections.
    */
  var Port: js.UndefOr[Integer] = js.native
  
  /**
    * The range of time each day when automated backups are created, if automated backups are enabled. Uses the format HH:MM-HH:MM. For example, 04:52-05:22.
    */
  var PreferredBackupWindow: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Uses the format &lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM. For the day values, use mon|tue|wed|thu|fri|sat|sun. For example, sun:09:32-sun:10:02.
    */
  var PreferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifiers of the read replicas that are associated with this DB cluster.
    */
  var ReadReplicaIdentifiers: js.UndefOr[StringList] = js.native
  
  /**
    * The reader endpoint for the DB cluster.
    */
  var ReaderEndpoint: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The current status of this DB cluster.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * A list of VPC security groups that the DB cluster belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups] = js.native
}
object AwsRdsDbClusterDetails {
  
  @scala.inline
  def apply(): AwsRdsDbClusterDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbClusterDetails]
  }
  
  @scala.inline
  implicit class AwsRdsDbClusterDetailsOps[Self <: AwsRdsDbClusterDetails] (val x: Self) extends AnyVal {
    
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
    def setActivityStreamStatus(value: NonEmptyString): Self = this.set("ActivityStreamStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityStreamStatus: Self = this.set("ActivityStreamStatus", js.undefined)
    
    @scala.inline
    def setAllocatedStorage(value: Integer): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAssociatedRolesVarargs(value: AwsRdsDbClusterAssociatedRole*): Self = this.set("AssociatedRoles", js.Array(value :_*))
    
    @scala.inline
    def setAssociatedRoles(value: AwsRdsDbClusterAssociatedRoles): Self = this.set("AssociatedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedRoles: Self = this.set("AssociatedRoles", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: NonEmptyString*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: StringList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    
    @scala.inline
    def setBackupRetentionPeriod(value: Integer): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setClusterCreateTime(value: NonEmptyString): Self = this.set("ClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterCreateTime: Self = this.set("ClusterCreateTime", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: Boolean): Self = this.set("CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyTagsToSnapshot: Self = this.set("CopyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setCrossAccountClone(value: Boolean): Self = this.set("CrossAccountClone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossAccountClone: Self = this.set("CrossAccountClone", js.undefined)
    
    @scala.inline
    def setCustomEndpointsVarargs(value: NonEmptyString*): Self = this.set("CustomEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setCustomEndpoints(value: StringList): Self = this.set("CustomEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEndpoints: Self = this.set("CustomEndpoints", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: NonEmptyString): Self = this.set("DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseName: Self = this.set("DatabaseName", js.undefined)
    
    @scala.inline
    def setDbClusterIdentifier(value: NonEmptyString): Self = this.set("DbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterIdentifier: Self = this.set("DbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDbClusterMembersVarargs(value: AwsRdsDbClusterMember*): Self = this.set("DbClusterMembers", js.Array(value :_*))
    
    @scala.inline
    def setDbClusterMembers(value: AwsRdsDbClusterMembers): Self = this.set("DbClusterMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterMembers: Self = this.set("DbClusterMembers", js.undefined)
    
    @scala.inline
    def setDbClusterOptionGroupMembershipsVarargs(value: AwsRdsDbClusterOptionGroupMembership*): Self = this.set("DbClusterOptionGroupMemberships", js.Array(value :_*))
    
    @scala.inline
    def setDbClusterOptionGroupMemberships(value: AwsRdsDbClusterOptionGroupMemberships): Self = this.set("DbClusterOptionGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterOptionGroupMemberships: Self = this.set("DbClusterOptionGroupMemberships", js.undefined)
    
    @scala.inline
    def setDbClusterParameterGroup(value: NonEmptyString): Self = this.set("DbClusterParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterParameterGroup: Self = this.set("DbClusterParameterGroup", js.undefined)
    
    @scala.inline
    def setDbClusterResourceId(value: NonEmptyString): Self = this.set("DbClusterResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterResourceId: Self = this.set("DbClusterResourceId", js.undefined)
    
    @scala.inline
    def setDbSubnetGroup(value: NonEmptyString): Self = this.set("DbSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSubnetGroup: Self = this.set("DbSubnetGroup", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: Boolean): Self = this.set("DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletionProtection: Self = this.set("DeletionProtection", js.undefined)
    
    @scala.inline
    def setDomainMembershipsVarargs(value: AwsRdsDbDomainMembership*): Self = this.set("DomainMemberships", js.Array(value :_*))
    
    @scala.inline
    def setDomainMemberships(value: AwsRdsDbDomainMemberships): Self = this.set("DomainMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainMemberships: Self = this.set("DomainMemberships", js.undefined)
    
    @scala.inline
    def setEnabledCloudWatchLogsExportsVarargs(value: NonEmptyString*): Self = this.set("EnabledCloudWatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEnabledCloudWatchLogsExports(value: StringList): Self = this.set("EnabledCloudWatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledCloudWatchLogsExports: Self = this.set("EnabledCloudWatchLogsExports", js.undefined)
    
    @scala.inline
    def setEndpoint(value: NonEmptyString): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    
    @scala.inline
    def setEngine(value: NonEmptyString): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineMode(value: NonEmptyString): Self = this.set("EngineMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineMode: Self = this.set("EngineMode", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: NonEmptyString): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostedZoneId: Self = this.set("HostedZoneId", js.undefined)
    
    @scala.inline
    def setHttpEndpointEnabled(value: Boolean): Self = this.set("HttpEndpointEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpEndpointEnabled: Self = this.set("HttpEndpointEnabled", js.undefined)
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = this.set("IamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamDatabaseAuthenticationEnabled: Self = this.set("IamDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    
    @scala.inline
    def setMultiAz(value: Boolean): Self = this.set("MultiAz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAz: Self = this.set("MultiAz", js.undefined)
    
    @scala.inline
    def setPort(value: Integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: NonEmptyString): Self = this.set("PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: NonEmptyString): Self = this.set("PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setReadReplicaIdentifiersVarargs(value: NonEmptyString*): Self = this.set("ReadReplicaIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setReadReplicaIdentifiers(value: StringList): Self = this.set("ReadReplicaIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadReplicaIdentifiers: Self = this.set("ReadReplicaIdentifiers", js.undefined)
    
    @scala.inline
    def setReaderEndpoint(value: NonEmptyString): Self = this.set("ReaderEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReaderEndpoint: Self = this.set("ReaderEndpoint", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = this.set("StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageEncrypted: Self = this.set("StorageEncrypted", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: AwsRdsDbInstanceVpcSecurityGroup*): Self = this.set("VpcSecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setVpcSecurityGroups(value: AwsRdsDbInstanceVpcSecurityGroups): Self = this.set("VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcSecurityGroups: Self = this.set("VpcSecurityGroups", js.undefined)
  }
}
