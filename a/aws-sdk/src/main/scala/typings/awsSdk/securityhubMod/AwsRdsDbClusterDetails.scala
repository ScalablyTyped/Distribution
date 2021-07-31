package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbClusterDetails extends StObject {
  
  /**
    * The status of the database activity stream.
    */
  var ActivityStreamStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * For all database engines except Aurora, specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * A list of the IAM roles that are associated with the DB cluster.
    */
  var AssociatedRoles: js.UndefOr[AwsRdsDbClusterAssociatedRoles] = js.undefined
  
  /**
    * A list of Availability Zones (AZs) where instances in the DB cluster can be created.
    */
  var AvailabilityZones: js.UndefOr[StringList] = js.undefined
  
  /**
    * The number of days for which automated backups are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates when the DB cluster was created, in Universal Coordinated Time (UTC). Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var ClusterCreateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether tags are copied from the DB cluster to snapshots of the DB cluster.
    */
  var CopyTagsToSnapshot: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the DB cluster is a clone of a DB cluster owned by a different AWS account.
    */
  var CrossAccountClone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of custom endpoints for the DB cluster.
    */
  var CustomEndpoints: js.UndefOr[StringList] = js.undefined
  
  /**
    * The name of the database.
    */
  var DatabaseName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The DB cluster identifier that the user assigned to the cluster. This identifier is the unique key that identifies a DB cluster.
    */
  var DbClusterIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The list of instances that make up the DB cluster.
    */
  var DbClusterMembers: js.UndefOr[AwsRdsDbClusterMembers] = js.undefined
  
  /**
    * The list of option group memberships for this DB cluster.
    */
  var DbClusterOptionGroupMemberships: js.UndefOr[AwsRdsDbClusterOptionGroupMemberships] = js.undefined
  
  /**
    * The name of the DB cluster parameter group for the DB cluster.
    */
  var DbClusterParameterGroup: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the DB cluster. The identifier must be unique within each AWS Region and is immutable.
    */
  var DbClusterResourceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The subnet group that is associated with the DB cluster, including the name, description, and subnets in the subnet group.
    */
  var DbSubnetGroup: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the DB cluster has deletion protection enabled.
    */
  var DeletionProtection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Active Directory domain membership records that are associated with the DB cluster.
    */
  var DomainMemberships: js.UndefOr[AwsRdsDbDomainMemberships] = js.undefined
  
  /**
    * A list of log types that this DB cluster is configured to export to CloudWatch Logs.
    */
  var EnabledCloudWatchLogsExports: js.UndefOr[StringList] = js.undefined
  
  /**
    * The connection endpoint for the primary instance of the DB cluster.
    */
  var Endpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the database engine to use for this DB cluster.
    */
  var Engine: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The database engine mode of the DB cluster.
    */
  var EngineMode: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The version number of the database engine to use.
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the identifier that Amazon Route 53 assigns when you create a hosted zone.
    */
  var HostedZoneId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the HTTP endpoint for an Aurora Serverless DB cluster is enabled.
    */
  var HttpEndpointEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the mapping of IAM accounts to database accounts is enabled.
    */
  var IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the AWS KMS master key that is used to encrypt the database instances in the DB cluster.
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the master user for the DB cluster.
    */
  var MasterUsername: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the DB cluster has instances in multiple Availability Zones.
    */
  var MultiAz: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The port number on which the DB instances in the DB cluster accept connections.
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * The range of time each day when automated backups are created, if automated backups are enabled. Uses the format HH:MM-HH:MM. For example, 04:52-05:22.
    */
  var PreferredBackupWindow: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). Uses the format &lt;day&gt;:HH:MM-&lt;day&gt;:HH:MM. For the day values, use mon|tue|wed|thu|fri|sat|sun. For example, sun:09:32-sun:10:02.
    */
  var PreferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifiers of the read replicas that are associated with this DB cluster.
    */
  var ReadReplicaIdentifiers: js.UndefOr[StringList] = js.undefined
  
  /**
    * The reader endpoint for the DB cluster.
    */
  var ReaderEndpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current status of this DB cluster.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the DB cluster is encrypted.
    */
  var StorageEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of VPC security groups that the DB cluster belongs to.
    */
  var VpcSecurityGroups: js.UndefOr[AwsRdsDbInstanceVpcSecurityGroups] = js.undefined
}
object AwsRdsDbClusterDetails {
  
  @scala.inline
  def apply(): AwsRdsDbClusterDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbClusterDetails]
  }
  
  @scala.inline
  implicit class AwsRdsDbClusterDetailsMutableBuilder[Self <: AwsRdsDbClusterDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityStreamStatus(value: NonEmptyString): Self = StObject.set(x, "ActivityStreamStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityStreamStatusUndefined: Self = StObject.set(x, "ActivityStreamStatus", js.undefined)
    
    @scala.inline
    def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAssociatedRoles(value: AwsRdsDbClusterAssociatedRoles): Self = StObject.set(x, "AssociatedRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedRolesUndefined: Self = StObject.set(x, "AssociatedRoles", js.undefined)
    
    @scala.inline
    def setAssociatedRolesVarargs(value: AwsRdsDbClusterAssociatedRole*): Self = StObject.set(x, "AssociatedRoles", js.Array(value :_*))
    
    @scala.inline
    def setAvailabilityZones(value: StringList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: NonEmptyString*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setBackupRetentionPeriod(value: Integer): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setClusterCreateTime(value: NonEmptyString): Self = StObject.set(x, "ClusterCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterCreateTimeUndefined: Self = StObject.set(x, "ClusterCreateTime", js.undefined)
    
    @scala.inline
    def setCopyTagsToSnapshot(value: Boolean): Self = StObject.set(x, "CopyTagsToSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyTagsToSnapshotUndefined: Self = StObject.set(x, "CopyTagsToSnapshot", js.undefined)
    
    @scala.inline
    def setCrossAccountClone(value: Boolean): Self = StObject.set(x, "CrossAccountClone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossAccountCloneUndefined: Self = StObject.set(x, "CrossAccountClone", js.undefined)
    
    @scala.inline
    def setCustomEndpoints(value: StringList): Self = StObject.set(x, "CustomEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEndpointsUndefined: Self = StObject.set(x, "CustomEndpoints", js.undefined)
    
    @scala.inline
    def setCustomEndpointsVarargs(value: NonEmptyString*): Self = StObject.set(x, "CustomEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setDatabaseName(value: NonEmptyString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    @scala.inline
    def setDbClusterIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterIdentifierUndefined: Self = StObject.set(x, "DbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDbClusterMembers(value: AwsRdsDbClusterMembers): Self = StObject.set(x, "DbClusterMembers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterMembersUndefined: Self = StObject.set(x, "DbClusterMembers", js.undefined)
    
    @scala.inline
    def setDbClusterMembersVarargs(value: AwsRdsDbClusterMember*): Self = StObject.set(x, "DbClusterMembers", js.Array(value :_*))
    
    @scala.inline
    def setDbClusterOptionGroupMemberships(value: AwsRdsDbClusterOptionGroupMemberships): Self = StObject.set(x, "DbClusterOptionGroupMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterOptionGroupMembershipsUndefined: Self = StObject.set(x, "DbClusterOptionGroupMemberships", js.undefined)
    
    @scala.inline
    def setDbClusterOptionGroupMembershipsVarargs(value: AwsRdsDbClusterOptionGroupMembership*): Self = StObject.set(x, "DbClusterOptionGroupMemberships", js.Array(value :_*))
    
    @scala.inline
    def setDbClusterParameterGroup(value: NonEmptyString): Self = StObject.set(x, "DbClusterParameterGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterParameterGroupUndefined: Self = StObject.set(x, "DbClusterParameterGroup", js.undefined)
    
    @scala.inline
    def setDbClusterResourceId(value: NonEmptyString): Self = StObject.set(x, "DbClusterResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterResourceIdUndefined: Self = StObject.set(x, "DbClusterResourceId", js.undefined)
    
    @scala.inline
    def setDbSubnetGroup(value: NonEmptyString): Self = StObject.set(x, "DbSubnetGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSubnetGroupUndefined: Self = StObject.set(x, "DbSubnetGroup", js.undefined)
    
    @scala.inline
    def setDeletionProtection(value: Boolean): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    @scala.inline
    def setDomainMemberships(value: AwsRdsDbDomainMemberships): Self = StObject.set(x, "DomainMemberships", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainMembershipsUndefined: Self = StObject.set(x, "DomainMemberships", js.undefined)
    
    @scala.inline
    def setDomainMembershipsVarargs(value: AwsRdsDbDomainMembership*): Self = StObject.set(x, "DomainMemberships", js.Array(value :_*))
    
    @scala.inline
    def setEnabledCloudWatchLogsExports(value: StringList): Self = StObject.set(x, "EnabledCloudWatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledCloudWatchLogsExportsUndefined: Self = StObject.set(x, "EnabledCloudWatchLogsExports", js.undefined)
    
    @scala.inline
    def setEnabledCloudWatchLogsExportsVarargs(value: NonEmptyString*): Self = StObject.set(x, "EnabledCloudWatchLogsExports", js.Array(value :_*))
    
    @scala.inline
    def setEndpoint(value: NonEmptyString): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setEngine(value: NonEmptyString): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineMode(value: NonEmptyString): Self = StObject.set(x, "EngineMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineModeUndefined: Self = StObject.set(x, "EngineMode", js.undefined)
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: NonEmptyString): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
    
    @scala.inline
    def setHttpEndpointEnabled(value: Boolean): Self = StObject.set(x, "HttpEndpointEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpEndpointEnabledUndefined: Self = StObject.set(x, "HttpEndpointEnabled", js.undefined)
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "IamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IamDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    @scala.inline
    def setMultiAz(value: Boolean): Self = StObject.set(x, "MultiAz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiAzUndefined: Self = StObject.set(x, "MultiAz", js.undefined)
    
    @scala.inline
    def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: NonEmptyString): Self = StObject.set(x, "PreferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindowUndefined: Self = StObject.set(x, "PreferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: NonEmptyString): Self = StObject.set(x, "PreferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "PreferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setReadReplicaIdentifiers(value: StringList): Self = StObject.set(x, "ReadReplicaIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadReplicaIdentifiersUndefined: Self = StObject.set(x, "ReadReplicaIdentifiers", js.undefined)
    
    @scala.inline
    def setReadReplicaIdentifiersVarargs(value: NonEmptyString*): Self = StObject.set(x, "ReadReplicaIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setReaderEndpoint(value: NonEmptyString): Self = StObject.set(x, "ReaderEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaderEndpointUndefined: Self = StObject.set(x, "ReaderEndpoint", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStorageEncrypted(value: Boolean): Self = StObject.set(x, "StorageEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageEncryptedUndefined: Self = StObject.set(x, "StorageEncrypted", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroups(value: AwsRdsDbInstanceVpcSecurityGroups): Self = StObject.set(x, "VpcSecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupsUndefined: Self = StObject.set(x, "VpcSecurityGroups", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupsVarargs(value: AwsRdsDbInstanceVpcSecurityGroup*): Self = StObject.set(x, "VpcSecurityGroups", js.Array(value :_*))
  }
}
