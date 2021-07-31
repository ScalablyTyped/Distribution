package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountsWithRestoreAccessList = js.Array[typings.awsSdk.redshiftMod.AccountWithRestoreAccess]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`restore-cluster`
  - typings.awsSdk.awsSdkStrings.`recommend-node-config`
  - typings.awsSdk.awsSdkStrings.`resize-cluster`
  - java.lang.String
*/
type ActionType = typings.awsSdk.redshiftMod._ActionType | java.lang.String

type AssociatedClusterList = js.Array[typings.awsSdk.redshiftMod.ClusterAssociatedToSchedule]

type AttributeList = js.Array[typings.awsSdk.redshiftMod.AccountAttribute]

type AttributeNameList = js.Array[typings.awsSdk.redshiftMod.String]

type AttributeValueList = js.Array[typings.awsSdk.redshiftMod.AttributeValueTarget]

type AvailabilityZoneList = js.Array[typings.awsSdk.redshiftMod.AvailabilityZone]

type BatchSnapshotOperationErrorList = js.Array[typings.awsSdk.redshiftMod.SnapshotErrorMessage]

type BatchSnapshotOperationErrors = js.Array[typings.awsSdk.redshiftMod.SnapshotErrorMessage]

type Boolean = scala.Boolean

type BooleanOptional = scala.Boolean

type ClusterDbRevisionsList = js.Array[typings.awsSdk.redshiftMod.ClusterDbRevision]

type ClusterIamRoleList = js.Array[typings.awsSdk.redshiftMod.ClusterIamRole]

type ClusterList = js.Array[typings.awsSdk.redshiftMod.Cluster]

type ClusterNodesList = js.Array[typings.awsSdk.redshiftMod.ClusterNode]

type ClusterParameterGroupStatusList = js.Array[typings.awsSdk.redshiftMod.ClusterParameterGroupStatus]

type ClusterParameterStatusList = js.Array[typings.awsSdk.redshiftMod.ClusterParameterStatus]

type ClusterSecurityGroupMembershipList = js.Array[typings.awsSdk.redshiftMod.ClusterSecurityGroupMembership]

type ClusterSecurityGroupNameList = js.Array[typings.awsSdk.redshiftMod.String]

type ClusterSecurityGroups = js.Array[typings.awsSdk.redshiftMod.ClusterSecurityGroup]

type ClusterSubnetGroups = js.Array[typings.awsSdk.redshiftMod.ClusterSubnetGroup]

type ClusterVersionList = js.Array[typings.awsSdk.redshiftMod.ClusterVersion]

type DbGroupList = js.Array[typings.awsSdk.redshiftMod.String]

type DeferredMaintenanceWindowsList = js.Array[typings.awsSdk.redshiftMod.DeferredMaintenanceWindow]

type DeleteClusterSnapshotMessageList = js.Array[typings.awsSdk.redshiftMod.DeleteClusterSnapshotMessage]

type Double = scala.Double

type DoubleOptional = scala.Double

type EC2SecurityGroupList = js.Array[typings.awsSdk.redshiftMod.EC2SecurityGroup]

type EligibleTracksToUpdateList = js.Array[typings.awsSdk.redshiftMod.UpdateTarget]

type EventCategoriesList = js.Array[typings.awsSdk.redshiftMod.String]

type EventCategoriesMapList = js.Array[typings.awsSdk.redshiftMod.EventCategoriesMap]

type EventInfoMapList = js.Array[typings.awsSdk.redshiftMod.EventInfoMap]

type EventList = js.Array[typings.awsSdk.redshiftMod.Event]

type EventSubscriptionsList = js.Array[typings.awsSdk.redshiftMod.EventSubscription]

type HsmClientCertificateList = js.Array[typings.awsSdk.redshiftMod.HsmClientCertificate]

type HsmConfigurationList = js.Array[typings.awsSdk.redshiftMod.HsmConfiguration]

type IPRangeList = js.Array[typings.awsSdk.redshiftMod.IPRange]

type IamRoleArnList = js.Array[typings.awsSdk.redshiftMod.String]

type ImportTablesCompleted = js.Array[typings.awsSdk.redshiftMod.String]

type ImportTablesInProgress = js.Array[typings.awsSdk.redshiftMod.String]

type ImportTablesNotStarted = js.Array[typings.awsSdk.redshiftMod.String]

type Integer = scala.Double

type IntegerOptional = scala.Double

type Long = scala.Double

type LongOptional = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.standard__
  - typings.awsSdk.awsSdkStrings.`high-performance`
  - java.lang.String
*/
type Mode = typings.awsSdk.redshiftMod._Mode | java.lang.String

type NodeConfigurationOptionList = js.Array[typings.awsSdk.redshiftMod.NodeConfigurationOption]

type NodeConfigurationOptionsFilterList = js.Array[typings.awsSdk.redshiftMod.NodeConfigurationOptionsFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NodeType
  - typings.awsSdk.awsSdkStrings.NumberOfNodes
  - typings.awsSdk.awsSdkStrings.EstimatedDiskUtilizationPercent
  - typings.awsSdk.awsSdkStrings.Mode
  - java.lang.String
*/
type NodeConfigurationOptionsFilterName = typings.awsSdk.redshiftMod._NodeConfigurationOptionsFilterName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.eq_
  - typings.awsSdk.awsSdkStrings.lt_
  - typings.awsSdk.awsSdkStrings.gt_
  - typings.awsSdk.awsSdkStrings.le_
  - typings.awsSdk.awsSdkStrings.ge_
  - typings.awsSdk.awsSdkStrings.in__
  - typings.awsSdk.awsSdkStrings.between_
  - java.lang.String
*/
type OperatorType = typings.awsSdk.redshiftMod._OperatorType | java.lang.String

type OrderableClusterOptionsList = js.Array[typings.awsSdk.redshiftMod.OrderableClusterOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.static__
  - typings.awsSdk.awsSdkStrings.dynamic__
  - java.lang.String
*/
type ParameterApplyType = typings.awsSdk.redshiftMod._ParameterApplyType | java.lang.String

type ParameterGroupList = js.Array[typings.awsSdk.redshiftMod.ClusterParameterGroup]

type ParametersList = js.Array[typings.awsSdk.redshiftMod.Parameter]

type PendingActionsList = js.Array[typings.awsSdk.redshiftMod.String]

type RecurringChargeList = js.Array[typings.awsSdk.redshiftMod.RecurringCharge]

type ReservedNodeList = js.Array[typings.awsSdk.redshiftMod.ReservedNode]

type ReservedNodeOfferingList = js.Array[typings.awsSdk.redshiftMod.ReservedNodeOffering]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Regular_
  - typings.awsSdk.awsSdkStrings.Upgradable
  - java.lang.String
*/
type ReservedNodeOfferingType = typings.awsSdk.redshiftMod._ReservedNodeOfferingType | java.lang.String

type RestorableNodeTypeList = js.Array[typings.awsSdk.redshiftMod.String]

type RevisionTargetsList = js.Array[typings.awsSdk.redshiftMod.RevisionTarget]

type ScheduleDefinitionList = js.Array[typings.awsSdk.redshiftMod.String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MODIFYING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ScheduleState = typings.awsSdk.redshiftMod._ScheduleState | java.lang.String

type ScheduledActionFilterList = js.Array[typings.awsSdk.redshiftMod.ScheduledActionFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`cluster-identifier`
  - typings.awsSdk.awsSdkStrings.`iam-role`
  - java.lang.String
*/
type ScheduledActionFilterName = typings.awsSdk.redshiftMod._ScheduledActionFilterName | java.lang.String

type ScheduledActionList = js.Array[typings.awsSdk.redshiftMod.ScheduledAction]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ScheduledActionState = typings.awsSdk.redshiftMod._ScheduledActionState | java.lang.String

type ScheduledActionTimeList = js.Array[typings.awsSdk.redshiftMod.TStamp]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ResizeCluster
  - typings.awsSdk.awsSdkStrings.PauseCluster
  - typings.awsSdk.awsSdkStrings.ResumeCluster
  - java.lang.String
*/
type ScheduledActionTypeValues = typings.awsSdk.redshiftMod._ScheduledActionTypeValues | java.lang.String

type ScheduledSnapshotTimeList = js.Array[typings.awsSdk.redshiftMod.TStamp]

type SensitiveString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SOURCE_TYPE
  - typings.awsSdk.awsSdkStrings.TOTAL_SIZE
  - typings.awsSdk.awsSdkStrings.CREATE_TIME
  - java.lang.String
*/
type SnapshotAttributeToSortBy = typings.awsSdk.redshiftMod._SnapshotAttributeToSortBy | java.lang.String

type SnapshotCopyGrantList = js.Array[typings.awsSdk.redshiftMod.SnapshotCopyGrant]

type SnapshotIdentifierList = js.Array[typings.awsSdk.redshiftMod.String]

type SnapshotList = js.Array[typings.awsSdk.redshiftMod.Snapshot]

type SnapshotScheduleList = js.Array[typings.awsSdk.redshiftMod.SnapshotSchedule]

type SnapshotSortingEntityList = js.Array[typings.awsSdk.redshiftMod.SnapshotSortingEntity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortByOrder = typings.awsSdk.redshiftMod._SortByOrder | java.lang.String

type SourceIdsList = js.Array[typings.awsSdk.redshiftMod.String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.cluster_
  - typings.awsSdk.awsSdkStrings.`cluster-parameter-group`
  - typings.awsSdk.awsSdkStrings.`cluster-security-group`
  - typings.awsSdk.awsSdkStrings.`cluster-snapshot`
  - typings.awsSdk.awsSdkStrings.`scheduled-action`
  - java.lang.String
*/
type SourceType = typings.awsSdk.redshiftMod._SourceType | java.lang.String

type String = java.lang.String

type SubnetIdentifierList = js.Array[typings.awsSdk.redshiftMod.String]

type SubnetList = js.Array[typings.awsSdk.redshiftMod.Subnet]

type SupportedOperationList = js.Array[typings.awsSdk.redshiftMod.SupportedOperation]

type SupportedPlatformsList = js.Array[typings.awsSdk.redshiftMod.SupportedPlatform]

type TStamp = typings.std.Date

type TableRestoreStatusList = js.Array[typings.awsSdk.redshiftMod.TableRestoreStatus]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - java.lang.String
*/
type TableRestoreStatusType = typings.awsSdk.redshiftMod._TableRestoreStatusType | java.lang.String

type TagKeyList = js.Array[typings.awsSdk.redshiftMod.String]

type TagList = js.Array[typings.awsSdk.redshiftMod.Tag]

type TagValueList = js.Array[typings.awsSdk.redshiftMod.String]

type TaggedResourceList = js.Array[typings.awsSdk.redshiftMod.TaggedResource]

type TrackList = js.Array[typings.awsSdk.redshiftMod.MaintenanceTrack]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.log_
  - typings.awsSdk.awsSdkStrings.`emit-metric`
  - typings.awsSdk.awsSdkStrings.disable_
  - java.lang.String
*/
type UsageLimitBreachAction = typings.awsSdk.redshiftMod._UsageLimitBreachAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.spectrum
  - typings.awsSdk.awsSdkStrings.`concurrency-scaling`
  - java.lang.String
*/
type UsageLimitFeatureType = typings.awsSdk.redshiftMod._UsageLimitFeatureType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.time_
  - typings.awsSdk.awsSdkStrings.`data-scanned`
  - java.lang.String
*/
type UsageLimitLimitType = typings.awsSdk.redshiftMod._UsageLimitLimitType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.daily__
  - typings.awsSdk.awsSdkStrings.weekly__
  - typings.awsSdk.awsSdkStrings.monthly_
  - java.lang.String
*/
type UsageLimitPeriod = typings.awsSdk.redshiftMod._UsageLimitPeriod | java.lang.String

type UsageLimits = js.Array[typings.awsSdk.redshiftMod.UsageLimit]

type ValueStringList = js.Array[typings.awsSdk.redshiftMod.String]

type VpcSecurityGroupIdList = js.Array[typings.awsSdk.redshiftMod.String]

type VpcSecurityGroupMembershipList = js.Array[typings.awsSdk.redshiftMod.VpcSecurityGroupMembership]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2012-12-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.redshiftMod._apiVersion | java.lang.String
