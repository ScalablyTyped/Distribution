package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rdsMod {
  type AccountQuotaList = js.Array[typings.awsSdk.rdsMod.AccountQuota]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.sync
    - typings.awsSdk.awsSdkStrings.async
    - java.lang.String
  */
  type ActivityStreamMode = typings.awsSdk.rdsMod._ActivityStreamMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.stopped__
    - typings.awsSdk.awsSdkStrings.starting__
    - typings.awsSdk.awsSdkStrings.started__
    - typings.awsSdk.awsSdkStrings.stopping__
    - java.lang.String
  */
  type ActivityStreamStatus = typings.awsSdk.rdsMod._ActivityStreamStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.immediate_
    - typings.awsSdk.awsSdkStrings.`pending-reboot`
    - java.lang.String
  */
  type ApplyMethod = typings.awsSdk.rdsMod._ApplyMethod | java.lang.String
  type AttributeValueList = js.Array[typings.awsSdk.rdsMod.String]
  type AuthScheme = typings.awsSdk.awsSdkStrings.SECRETS | java.lang.String
  type AvailabilityZoneList = js.Array[typings.awsSdk.rdsMod.AvailabilityZone]
  type AvailabilityZones = js.Array[typings.awsSdk.rdsMod.String]
  type AvailableProcessorFeatureList = js.Array[typings.awsSdk.rdsMod.AvailableProcessorFeature]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CertificateList = js.Array[typings.awsSdk.rdsMod.Certificate]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.rdsMod.ClientApiVersions
  type CustomAvailabilityZoneList = js.Array[typings.awsSdk.rdsMod.CustomAvailabilityZone]
  type DBClusterBacktrackList = js.Array[typings.awsSdk.rdsMod.DBClusterBacktrack]
  type DBClusterEndpointList = js.Array[typings.awsSdk.rdsMod.DBClusterEndpoint]
  type DBClusterList = js.Array[typings.awsSdk.rdsMod.DBCluster]
  type DBClusterMemberList = js.Array[typings.awsSdk.rdsMod.DBClusterMember]
  type DBClusterOptionGroupMemberships = js.Array[typings.awsSdk.rdsMod.DBClusterOptionGroupStatus]
  type DBClusterParameterGroupList = js.Array[typings.awsSdk.rdsMod.DBClusterParameterGroup]
  type DBClusterRoles = js.Array[typings.awsSdk.rdsMod.DBClusterRole]
  type DBClusterSnapshotAttributeList = js.Array[typings.awsSdk.rdsMod.DBClusterSnapshotAttribute]
  type DBClusterSnapshotList = js.Array[typings.awsSdk.rdsMod.DBClusterSnapshot]
  type DBEngineVersionList = js.Array[typings.awsSdk.rdsMod.DBEngineVersion]
  type DBInstanceAutomatedBackupList = js.Array[typings.awsSdk.rdsMod.DBInstanceAutomatedBackup]
  type DBInstanceList = js.Array[typings.awsSdk.rdsMod.DBInstance]
  type DBInstanceRoles = js.Array[typings.awsSdk.rdsMod.DBInstanceRole]
  type DBInstanceStatusInfoList = js.Array[typings.awsSdk.rdsMod.DBInstanceStatusInfo]
  type DBParameterGroupList = js.Array[typings.awsSdk.rdsMod.DBParameterGroup]
  type DBParameterGroupStatusList = js.Array[typings.awsSdk.rdsMod.DBParameterGroupStatus]
  type DBProxyList = js.Array[typings.awsSdk.rdsMod.DBProxy]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.modifying_
    - typings.awsSdk.awsSdkStrings.`incompatible-network`
    - typings.awsSdk.awsSdkStrings.`insufficient-resource-limits`
    - typings.awsSdk.awsSdkStrings.creating__
    - typings.awsSdk.awsSdkStrings.deleting__
    - typings.awsSdk.awsSdkStrings.suspended__
    - typings.awsSdk.awsSdkStrings.suspending
    - typings.awsSdk.awsSdkStrings.reactivating
    - java.lang.String
  */
  type DBProxyStatus = typings.awsSdk.rdsMod._DBProxyStatus | java.lang.String
  type DBSecurityGroupMembershipList = js.Array[typings.awsSdk.rdsMod.DBSecurityGroupMembership]
  type DBSecurityGroupNameList = js.Array[typings.awsSdk.rdsMod.String]
  type DBSecurityGroups = js.Array[typings.awsSdk.rdsMod.DBSecurityGroup]
  type DBSnapshotAttributeList = js.Array[typings.awsSdk.rdsMod.DBSnapshotAttribute]
  type DBSnapshotList = js.Array[typings.awsSdk.rdsMod.DBSnapshot]
  type DBSubnetGroups = js.Array[typings.awsSdk.rdsMod.DBSubnetGroup]
  type DescribeDBLogFilesList = js.Array[typings.awsSdk.rdsMod.DescribeDBLogFilesDetails]
  type DomainMembershipList = js.Array[typings.awsSdk.rdsMod.DomainMembership]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type DoubleRangeList = js.Array[typings.awsSdk.rdsMod.DoubleRange]
  type EC2SecurityGroupList = js.Array[typings.awsSdk.rdsMod.EC2SecurityGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MYSQL
    - typings.awsSdk.awsSdkStrings.POSTGRESQL
    - java.lang.String
  */
  type EngineFamily = typings.awsSdk.rdsMod._EngineFamily | java.lang.String
  type EngineModeList = js.Array[typings.awsSdk.rdsMod.String]
  type EventCategoriesList = js.Array[typings.awsSdk.rdsMod.String]
  type EventCategoriesMapList = js.Array[typings.awsSdk.rdsMod.EventCategoriesMap]
  type EventList = js.Array[typings.awsSdk.rdsMod.Event]
  type EventSubscriptionsList = js.Array[typings.awsSdk.rdsMod.EventSubscription]
  type ExportTasksList = js.Array[typings.awsSdk.rdsMod.ExportTask]
  type FeatureNameList = js.Array[typings.awsSdk.rdsMod.String]
  type FilterList = js.Array[typings.awsSdk.rdsMod.Filter]
  type FilterValueList = js.Array[typings.awsSdk.rdsMod.String]
  type GlobalClusterList = js.Array[typings.awsSdk.rdsMod.GlobalCluster]
  type GlobalClusterMemberList = js.Array[typings.awsSdk.rdsMod.GlobalClusterMember]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.REQUIRED
    - java.lang.String
  */
  type IAMAuthMode = typings.awsSdk.rdsMod._IAMAuthMode | java.lang.String
  type IPRangeList = js.Array[typings.awsSdk.rdsMod.IPRange]
  type InstallationMediaList = js.Array[typings.awsSdk.rdsMod.InstallationMedia]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[typings.awsSdk.rdsMod.String]
  type LogTypeList = js.Array[typings.awsSdk.rdsMod.String]
  type Long = scala.Double
  type LongOptional = scala.Double
  type MaxRecords = scala.Double
  type MinimumEngineVersionPerAllowedValueList = js.Array[typings.awsSdk.rdsMod.MinimumEngineVersionPerAllowedValue]
  type OptionConfigurationList = js.Array[typings.awsSdk.rdsMod.OptionConfiguration]
  type OptionGroupMembershipList = js.Array[typings.awsSdk.rdsMod.OptionGroupMembership]
  type OptionGroupOptionSettingsList = js.Array[typings.awsSdk.rdsMod.OptionGroupOptionSetting]
  type OptionGroupOptionVersionsList = js.Array[typings.awsSdk.rdsMod.OptionVersion]
  type OptionGroupOptionsList = js.Array[typings.awsSdk.rdsMod.OptionGroupOption]
  type OptionGroupsList = js.Array[typings.awsSdk.rdsMod.OptionGroup]
  type OptionNamesList = js.Array[typings.awsSdk.rdsMod.String]
  type OptionSettingConfigurationList = js.Array[typings.awsSdk.rdsMod.OptionSetting]
  type OptionSettingsList = js.Array[typings.awsSdk.rdsMod.OptionSetting]
  type OptionsConflictsWith = js.Array[typings.awsSdk.rdsMod.String]
  type OptionsDependedOn = js.Array[typings.awsSdk.rdsMod.String]
  type OptionsList = js.Array[typings.awsSdk.rdsMod.Option]
  type OrderableDBInstanceOptionsList = js.Array[typings.awsSdk.rdsMod.OrderableDBInstanceOption]
  type ParametersList = js.Array[typings.awsSdk.rdsMod.Parameter]
  type PendingMaintenanceActionDetails = js.Array[typings.awsSdk.rdsMod.PendingMaintenanceAction]
  type PendingMaintenanceActions = js.Array[typings.awsSdk.rdsMod.ResourcePendingMaintenanceActions]
  type ProcessorFeatureList = js.Array[typings.awsSdk.rdsMod.ProcessorFeature]
  type RangeList = js.Array[typings.awsSdk.rdsMod.Range]
  type ReadReplicaDBClusterIdentifierList = js.Array[typings.awsSdk.rdsMod.String]
  type ReadReplicaDBInstanceIdentifierList = js.Array[typings.awsSdk.rdsMod.String]
  type ReadReplicaIdentifierList = js.Array[typings.awsSdk.rdsMod.String]
  type ReadersArnList = js.Array[typings.awsSdk.rdsMod.String]
  type RecurringChargeList = js.Array[typings.awsSdk.rdsMod.RecurringCharge]
  type ReservedDBInstanceList = js.Array[typings.awsSdk.rdsMod.ReservedDBInstance]
  type ReservedDBInstancesOfferingList = js.Array[typings.awsSdk.rdsMod.ReservedDBInstancesOffering]
  type SourceIdsList = js.Array[typings.awsSdk.rdsMod.String]
  type SourceRegionList = js.Array[typings.awsSdk.rdsMod.SourceRegion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`db-instance`
    - typings.awsSdk.awsSdkStrings.`db-parameter-group`
    - typings.awsSdk.awsSdkStrings.`db-security-group`
    - typings.awsSdk.awsSdkStrings.`db-snapshot`
    - typings.awsSdk.awsSdkStrings.`db-cluster`
    - typings.awsSdk.awsSdkStrings.`db-cluster-snapshot`
    - java.lang.String
  */
  type SourceType = typings.awsSdk.rdsMod._SourceType | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typings.awsSdk.rdsMod.String]
  type StringSensitive = java.lang.String
  type SubnetIdentifierList = js.Array[typings.awsSdk.rdsMod.String]
  type SubnetList = js.Array[typings.awsSdk.rdsMod.Subnet]
  type SupportedCharacterSetsList = js.Array[typings.awsSdk.rdsMod.CharacterSet]
  type SupportedTimezonesList = js.Array[typings.awsSdk.rdsMod.Timezone]
  type TStamp = typings.std.Date
  type TagList = js.Array[typings.awsSdk.rdsMod.Tag]
  type TargetGroupList = js.Array[typings.awsSdk.rdsMod.DBProxyTargetGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.UNREACHABLE
    - typings.awsSdk.awsSdkStrings.CONNECTION_FAILED
    - typings.awsSdk.awsSdkStrings.AUTH_FAILURE
    - typings.awsSdk.awsSdkStrings.PENDING_PROXY_CAPACITY
    - java.lang.String
  */
  type TargetHealthReason = typings.awsSdk.rdsMod._TargetHealthReason | java.lang.String
  type TargetList = js.Array[typings.awsSdk.rdsMod.DBProxyTarget]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REGISTERING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.UNAVAILABLE
    - java.lang.String
  */
  type TargetState = typings.awsSdk.rdsMod._TargetState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RDS_INSTANCE
    - typings.awsSdk.awsSdkStrings.RDS_SERVERLESS_ENDPOINT
    - typings.awsSdk.awsSdkStrings.TRACKED_CLUSTER
    - java.lang.String
  */
  type TargetType = typings.awsSdk.rdsMod._TargetType | java.lang.String
  type UserAuthConfigInfoList = js.Array[typings.awsSdk.rdsMod.UserAuthConfigInfo]
  type UserAuthConfigList = js.Array[typings.awsSdk.rdsMod.UserAuthConfig]
  type ValidStorageOptionsList = js.Array[typings.awsSdk.rdsMod.ValidStorageOptions]
  type ValidUpgradeTargetList = js.Array[typings.awsSdk.rdsMod.UpgradeTarget]
  type VpcSecurityGroupIdList = js.Array[typings.awsSdk.rdsMod.String]
  type VpcSecurityGroupMembershipList = js.Array[typings.awsSdk.rdsMod.VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2013-01-10`
    - typings.awsSdk.awsSdkStrings.`2013-02-12`
    - typings.awsSdk.awsSdkStrings.`2013-09-09`
    - typings.awsSdk.awsSdkStrings.`2014-09-01`
    - typings.awsSdk.awsSdkStrings.`2014-10-31`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.rdsMod._apiVersion | java.lang.String
}
