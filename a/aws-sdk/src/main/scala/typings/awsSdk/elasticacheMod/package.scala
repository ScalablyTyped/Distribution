package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elasticacheMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`single-az`
    - typings.awsSdk.awsSdkStrings.`cross-az`
    - java.lang.String
  */
  type AZMode = typings.awsSdk.elasticacheMod._AZMode | java.lang.String
  type AllowedNodeGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SETTING
    - typings.awsSdk.awsSdkStrings.ROTATING
    - java.lang.String
  */
  type AuthTokenUpdateStatus = typings.awsSdk.elasticacheMod._AuthTokenUpdateStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SET
    - typings.awsSdk.awsSdkStrings.ROTATE
    - java.lang.String
  */
  type AuthTokenUpdateStrategyType = typings.awsSdk.elasticacheMod._AuthTokenUpdateStrategyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enabled__
    - typings.awsSdk.awsSdkStrings.disabled__
    - typings.awsSdk.awsSdkStrings.enabling__
    - typings.awsSdk.awsSdkStrings.disabling_
    - java.lang.String
  */
  type AutomaticFailoverStatus = typings.awsSdk.elasticacheMod._AutomaticFailoverStatus | java.lang.String
  type AvailabilityZonesList = js.Array[typings.awsSdk.elasticacheMod.String]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type CacheClusterIdList = js.Array[typings.awsSdk.elasticacheMod.String]
  type CacheClusterList = js.Array[typings.awsSdk.elasticacheMod.CacheCluster]
  type CacheEngineVersionList = js.Array[typings.awsSdk.elasticacheMod.CacheEngineVersion]
  type CacheNodeIdsList = js.Array[typings.awsSdk.elasticacheMod.String]
  type CacheNodeList = js.Array[typings.awsSdk.elasticacheMod.CacheNode]
  type CacheNodeTypeSpecificParametersList = js.Array[typings.awsSdk.elasticacheMod.CacheNodeTypeSpecificParameter]
  type CacheNodeTypeSpecificValueList = js.Array[typings.awsSdk.elasticacheMod.CacheNodeTypeSpecificValue]
  type CacheNodeUpdateStatusList = js.Array[typings.awsSdk.elasticacheMod.CacheNodeUpdateStatus]
  type CacheParameterGroupList = js.Array[typings.awsSdk.elasticacheMod.CacheParameterGroup]
  type CacheSecurityGroupMembershipList = js.Array[typings.awsSdk.elasticacheMod.CacheSecurityGroupMembership]
  type CacheSecurityGroupNameList = js.Array[typings.awsSdk.elasticacheMod.String]
  type CacheSecurityGroups = js.Array[typings.awsSdk.elasticacheMod.CacheSecurityGroup]
  type CacheSubnetGroups = js.Array[typings.awsSdk.elasticacheMod.CacheSubnetGroup]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.immediate_
    - typings.awsSdk.awsSdkStrings.`requires-reboot`
    - java.lang.String
  */
  type ChangeType = typings.awsSdk.elasticacheMod._ChangeType | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.elasticacheMod.ClientApiVersions
  type ClusterIdList = js.Array[typings.awsSdk.elasticacheMod.String]
  type CustomerNodeEndpointList = js.Array[typings.awsSdk.elasticacheMod.CustomerNodeEndpoint]
  type Double = scala.Double
  type EC2SecurityGroupList = js.Array[typings.awsSdk.elasticacheMod.EC2SecurityGroup]
  type EventList = js.Array[typings.awsSdk.elasticacheMod.Event]
  type GlobalNodeGroupIdList = js.Array[typings.awsSdk.elasticacheMod.String]
  type GlobalNodeGroupList = js.Array[typings.awsSdk.elasticacheMod.GlobalNodeGroup]
  type GlobalReplicationGroupList = js.Array[typings.awsSdk.elasticacheMod.GlobalReplicationGroup]
  type GlobalReplicationGroupMemberList = js.Array[typings.awsSdk.elasticacheMod.GlobalReplicationGroupMember]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type KeyList = js.Array[typings.awsSdk.elasticacheMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enabled__
    - typings.awsSdk.awsSdkStrings.disabled__
    - java.lang.String
  */
  type MultiAZStatus = typings.awsSdk.elasticacheMod._MultiAZStatus | java.lang.String
  type NodeGroupConfigurationList = js.Array[typings.awsSdk.elasticacheMod.NodeGroupConfiguration]
  type NodeGroupList = js.Array[typings.awsSdk.elasticacheMod.NodeGroup]
  type NodeGroupMemberList = js.Array[typings.awsSdk.elasticacheMod.NodeGroupMember]
  type NodeGroupMemberUpdateStatusList = js.Array[typings.awsSdk.elasticacheMod.NodeGroupMemberUpdateStatus]
  type NodeGroupUpdateStatusList = js.Array[typings.awsSdk.elasticacheMod.NodeGroupUpdateStatus]
  type NodeGroupsToRemoveList = js.Array[typings.awsSdk.elasticacheMod.AllowedNodeGroupId]
  type NodeGroupsToRetainList = js.Array[typings.awsSdk.elasticacheMod.AllowedNodeGroupId]
  type NodeSnapshotList = js.Array[typings.awsSdk.elasticacheMod.NodeSnapshot]
  type NodeTypeList = js.Array[typings.awsSdk.elasticacheMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.system__
    - typings.awsSdk.awsSdkStrings.customer_
    - java.lang.String
  */
  type NodeUpdateInitiatedBy = typings.awsSdk.elasticacheMod._NodeUpdateInitiatedBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`not-applied`
    - typings.awsSdk.awsSdkStrings.`waiting-to-start`
    - typings.awsSdk.awsSdkStrings.`in-progress`
    - typings.awsSdk.awsSdkStrings.stopping__
    - typings.awsSdk.awsSdkStrings.stopped__
    - typings.awsSdk.awsSdkStrings.complete__
    - java.lang.String
  */
  type NodeUpdateStatus = typings.awsSdk.elasticacheMod._NodeUpdateStatus | java.lang.String
  type ParameterNameValueList = js.Array[typings.awsSdk.elasticacheMod.ParameterNameValue]
  type ParametersList = js.Array[typings.awsSdk.elasticacheMod.Parameter]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.enabled__
    - typings.awsSdk.awsSdkStrings.disabled__
    - java.lang.String
  */
  type PendingAutomaticFailoverStatus = typings.awsSdk.elasticacheMod._PendingAutomaticFailoverStatus | java.lang.String
  type PreferredAvailabilityZoneList = js.Array[typings.awsSdk.elasticacheMod.String]
  type ProcessedUpdateActionList = js.Array[typings.awsSdk.elasticacheMod.ProcessedUpdateAction]
  type RecurringChargeList = js.Array[typings.awsSdk.elasticacheMod.RecurringCharge]
  type RegionalConfigurationList = js.Array[typings.awsSdk.elasticacheMod.RegionalConfiguration]
  type RemoveReplicasList = js.Array[typings.awsSdk.elasticacheMod.String]
  type ReplicaConfigurationList = js.Array[typings.awsSdk.elasticacheMod.ConfigureShard]
  type ReplicationGroupIdList = js.Array[typings.awsSdk.elasticacheMod.String]
  type ReplicationGroupList = js.Array[typings.awsSdk.elasticacheMod.ReplicationGroup]
  type ReservedCacheNodeList = js.Array[typings.awsSdk.elasticacheMod.ReservedCacheNode]
  type ReservedCacheNodesOfferingList = js.Array[typings.awsSdk.elasticacheMod.ReservedCacheNodesOffering]
  type ReshardingConfigurationList = js.Array[typings.awsSdk.elasticacheMod.ReshardingConfiguration]
  type SecurityGroupIdsList = js.Array[typings.awsSdk.elasticacheMod.String]
  type SecurityGroupMembershipList = js.Array[typings.awsSdk.elasticacheMod.SecurityGroupMembership]
  type ServiceUpdateList = js.Array[typings.awsSdk.elasticacheMod.ServiceUpdate]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.critical_
    - typings.awsSdk.awsSdkStrings.important
    - typings.awsSdk.awsSdkStrings.medium__
    - typings.awsSdk.awsSdkStrings.low__
    - java.lang.String
  */
  type ServiceUpdateSeverity = typings.awsSdk.elasticacheMod._ServiceUpdateSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.available__
    - typings.awsSdk.awsSdkStrings.cancelled__
    - typings.awsSdk.awsSdkStrings.expired__
    - java.lang.String
  */
  type ServiceUpdateStatus = typings.awsSdk.elasticacheMod._ServiceUpdateStatus | java.lang.String
  type ServiceUpdateStatusList = js.Array[typings.awsSdk.elasticacheMod.ServiceUpdateStatus]
  type ServiceUpdateType = typings.awsSdk.awsSdkStrings.`security-update` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.yes_
    - typings.awsSdk.awsSdkStrings.no_
    - typings.awsSdk.awsSdkStrings.nSlasha
    - java.lang.String
  */
  type SlaMet = typings.awsSdk.elasticacheMod._SlaMet | java.lang.String
  type SnapshotArnsList = js.Array[typings.awsSdk.elasticacheMod.String]
  type SnapshotList = js.Array[typings.awsSdk.elasticacheMod.Snapshot]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`cache-cluster`
    - typings.awsSdk.awsSdkStrings.`cache-parameter-group`
    - typings.awsSdk.awsSdkStrings.`cache-security-group`
    - typings.awsSdk.awsSdkStrings.`cache-subnet-group`
    - typings.awsSdk.awsSdkStrings.`replication-group`
    - java.lang.String
  */
  type SourceType = typings.awsSdk.elasticacheMod._SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[typings.awsSdk.elasticacheMod.String]
  type SubnetList = js.Array[typings.awsSdk.elasticacheMod.Subnet]
  type TStamp = typings.std.Date
  type TagList = js.Array[typings.awsSdk.elasticacheMod.Tag]
  type UnprocessedUpdateActionList = js.Array[typings.awsSdk.elasticacheMod.UnprocessedUpdateAction]
  type UpdateActionList = js.Array[typings.awsSdk.elasticacheMod.UpdateAction]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`not-applied`
    - typings.awsSdk.awsSdkStrings.`waiting-to-start`
    - typings.awsSdk.awsSdkStrings.`in-progress`
    - typings.awsSdk.awsSdkStrings.stopping__
    - typings.awsSdk.awsSdkStrings.stopped__
    - typings.awsSdk.awsSdkStrings.complete__
    - typings.awsSdk.awsSdkStrings.scheduling_
    - typings.awsSdk.awsSdkStrings.scheduled__
    - typings.awsSdk.awsSdkStrings.`not-applicable`
    - java.lang.String
  */
  type UpdateActionStatus = typings.awsSdk.elasticacheMod._UpdateActionStatus | java.lang.String
  type UpdateActionStatusList = js.Array[typings.awsSdk.elasticacheMod.UpdateActionStatus]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2012-11-15`
    - typings.awsSdk.awsSdkStrings.`2014-03-24`
    - typings.awsSdk.awsSdkStrings.`2014-07-15`
    - typings.awsSdk.awsSdkStrings.`2014-09-30`
    - typings.awsSdk.awsSdkStrings.`2015-02-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.elasticacheMod._apiVersion | java.lang.String
}
