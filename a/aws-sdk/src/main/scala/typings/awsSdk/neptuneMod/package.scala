package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object neptuneMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.immediate_
    - typings.awsSdk.awsSdkStrings.`pending-reboot`
    - java.lang.String
  */
  type ApplyMethod = typings.awsSdk.neptuneMod._ApplyMethod | java.lang.String
  
  type AttributeValueList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type AvailabilityZoneList = js.Array[typings.awsSdk.neptuneMod.AvailabilityZone]
  
  type AvailabilityZones = js.Array[typings.awsSdk.neptuneMod.String]
  
  type Boolean = scala.Boolean
  
  type BooleanOptional = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.neptuneMod.ClientApiVersions
  
  type DBClusterEndpointList = js.Array[typings.awsSdk.neptuneMod.DBClusterEndpoint]
  
  type DBClusterList = js.Array[typings.awsSdk.neptuneMod.DBCluster]
  
  type DBClusterMemberList = js.Array[typings.awsSdk.neptuneMod.DBClusterMember]
  
  type DBClusterOptionGroupMemberships = js.Array[typings.awsSdk.neptuneMod.DBClusterOptionGroupStatus]
  
  type DBClusterParameterGroupList = js.Array[typings.awsSdk.neptuneMod.DBClusterParameterGroup]
  
  type DBClusterRoles = js.Array[typings.awsSdk.neptuneMod.DBClusterRole]
  
  type DBClusterSnapshotAttributeList = js.Array[typings.awsSdk.neptuneMod.DBClusterSnapshotAttribute]
  
  type DBClusterSnapshotList = js.Array[typings.awsSdk.neptuneMod.DBClusterSnapshot]
  
  type DBEngineVersionList = js.Array[typings.awsSdk.neptuneMod.DBEngineVersion]
  
  type DBInstanceList = js.Array[typings.awsSdk.neptuneMod.DBInstance]
  
  type DBInstanceStatusInfoList = js.Array[typings.awsSdk.neptuneMod.DBInstanceStatusInfo]
  
  type DBParameterGroupList = js.Array[typings.awsSdk.neptuneMod.DBParameterGroup]
  
  type DBParameterGroupStatusList = js.Array[typings.awsSdk.neptuneMod.DBParameterGroupStatus]
  
  type DBSecurityGroupMembershipList = js.Array[typings.awsSdk.neptuneMod.DBSecurityGroupMembership]
  
  type DBSecurityGroupNameList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type DBSubnetGroups = js.Array[typings.awsSdk.neptuneMod.DBSubnetGroup]
  
  type DomainMembershipList = js.Array[typings.awsSdk.neptuneMod.DomainMembership]
  
  type Double = scala.Double
  
  type DoubleOptional = scala.Double
  
  type DoubleRangeList = js.Array[typings.awsSdk.neptuneMod.DoubleRange]
  
  type EventCategoriesList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type EventCategoriesMapList = js.Array[typings.awsSdk.neptuneMod.EventCategoriesMap]
  
  type EventList = js.Array[typings.awsSdk.neptuneMod.Event]
  
  type EventSubscriptionsList = js.Array[typings.awsSdk.neptuneMod.EventSubscription]
  
  type FilterList = js.Array[typings.awsSdk.neptuneMod.Filter]
  
  type FilterValueList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type Integer = scala.Double
  
  type IntegerOptional = scala.Double
  
  type KeyList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type LogTypeList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type OptionGroupMembershipList = js.Array[typings.awsSdk.neptuneMod.OptionGroupMembership]
  
  type OrderableDBInstanceOptionsList = js.Array[typings.awsSdk.neptuneMod.OrderableDBInstanceOption]
  
  type ParametersList = js.Array[typings.awsSdk.neptuneMod.Parameter]
  
  type PendingMaintenanceActionDetails = js.Array[typings.awsSdk.neptuneMod.PendingMaintenanceAction]
  
  type PendingMaintenanceActions = js.Array[typings.awsSdk.neptuneMod.ResourcePendingMaintenanceActions]
  
  type RangeList = js.Array[typings.awsSdk.neptuneMod.Range]
  
  type ReadReplicaDBClusterIdentifierList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type ReadReplicaDBInstanceIdentifierList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type ReadReplicaIdentifierList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type SourceIdsList = js.Array[typings.awsSdk.neptuneMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`db-instance`
    - typings.awsSdk.awsSdkStrings.`db-parameter-group`
    - typings.awsSdk.awsSdkStrings.`db-security-group`
    - typings.awsSdk.awsSdkStrings.`db-snapshot`
    - typings.awsSdk.awsSdkStrings.`db-cluster`
    - typings.awsSdk.awsSdkStrings.`db-cluster-snapshot`
    - java.lang.String
  */
  type SourceType = typings.awsSdk.neptuneMod._SourceType | java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type SubnetIdentifierList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type SubnetList = js.Array[typings.awsSdk.neptuneMod.Subnet]
  
  type SupportedCharacterSetsList = js.Array[typings.awsSdk.neptuneMod.CharacterSet]
  
  type SupportedTimezonesList = js.Array[typings.awsSdk.neptuneMod.Timezone]
  
  type TStamp = typings.std.Date
  
  type TagList = js.Array[typings.awsSdk.neptuneMod.Tag]
  
  type ValidStorageOptionsList = js.Array[typings.awsSdk.neptuneMod.ValidStorageOptions]
  
  type ValidUpgradeTargetList = js.Array[typings.awsSdk.neptuneMod.UpgradeTarget]
  
  type VpcSecurityGroupIdList = js.Array[typings.awsSdk.neptuneMod.String]
  
  type VpcSecurityGroupMembershipList = js.Array[typings.awsSdk.neptuneMod.VpcSecurityGroupMembership]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-10-31`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.neptuneMod._apiVersion | java.lang.String
}
