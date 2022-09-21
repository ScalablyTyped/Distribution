package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.NONE
import typings.awsSdk.awsSdkStrings.`capacity-optimized`
import typings.awsSdk.awsSdkStrings.`lowest-price`
import typings.awsSdk.awsSdkStrings.`use-capacity-reservations-first`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TERMINATE_JOB_FLOW
  - typings.awsSdk.awsSdkStrings.TERMINATE_CLUSTER
  - typings.awsSdk.awsSdkStrings.CANCEL_AND_WAIT
  - typings.awsSdk.awsSdkStrings.CONTINUE
  - java.lang.String
*/
type ActionOnFailure = _ActionOnFailure | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CHANGE_IN_CAPACITY
  - typings.awsSdk.awsSdkStrings.PERCENT_CHANGE_IN_CAPACITY
  - typings.awsSdk.awsSdkStrings.EXACT_CAPACITY
  - java.lang.String
*/
type AdjustmentType = _AdjustmentType | java.lang.String

type ApplicationList = js.Array[Application]

type ArnType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSO
  - typings.awsSdk.awsSdkStrings.IAM
  - java.lang.String
*/
type AuthMode = _AuthMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.ATTACHING
  - typings.awsSdk.awsSdkStrings.ATTACHED
  - typings.awsSdk.awsSdkStrings.DETACHING
  - typings.awsSdk.awsSdkStrings.DETACHED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type AutoScalingPolicyState = _AutoScalingPolicyState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER_REQUEST
  - typings.awsSdk.awsSdkStrings.PROVISION_FAILURE
  - typings.awsSdk.awsSdkStrings.CLEANUP_FAILURE
  - java.lang.String
*/
type AutoScalingPolicyStateChangeReasonCode = _AutoScalingPolicyStateChangeReasonCode | java.lang.String

type Boolean = scala.Boolean

type BooleanObject = scala.Boolean

type BootstrapActionConfigList = js.Array[BootstrapActionConfig]

type BootstrapActionDetailList = js.Array[BootstrapActionDetail]

type CancelStepsInfoList = js.Array[CancelStepsInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CancelStepsRequestStatus = _CancelStepsRequestStatus | java.lang.String

type ClusterId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.BOOTSTRAPPING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.WAITING
  - typings.awsSdk.awsSdkStrings.TERMINATING
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - typings.awsSdk.awsSdkStrings.TERMINATED_WITH_ERRORS
  - java.lang.String
*/
type ClusterState = _ClusterState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typings.awsSdk.awsSdkStrings.INSTANCE_FAILURE
  - typings.awsSdk.awsSdkStrings.INSTANCE_FLEET_TIMEOUT
  - typings.awsSdk.awsSdkStrings.BOOTSTRAP_FAILURE
  - typings.awsSdk.awsSdkStrings.USER_REQUEST
  - typings.awsSdk.awsSdkStrings.STEP_FAILURE
  - typings.awsSdk.awsSdkStrings.ALL_STEPS_COMPLETED
  - java.lang.String
*/
type ClusterStateChangeReasonCode = _ClusterStateChangeReasonCode | java.lang.String

type ClusterStateList = js.Array[ClusterState]

type ClusterSummaryList = js.Array[ClusterSummary]

type CommandList = js.Array[Command]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL
  - typings.awsSdk.awsSdkStrings.GREATER_THAN
  - typings.awsSdk.awsSdkStrings.LESS_THAN
  - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL
  - java.lang.String
*/
type ComparisonOperator = _ComparisonOperator | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InstanceFleetUnits
  - typings.awsSdk.awsSdkStrings.Instances
  - typings.awsSdk.awsSdkStrings.VCPU
  - java.lang.String
*/
type ComputeLimitsUnitType = _ComputeLimitsUnitType | java.lang.String

type ConfigurationList = js.Array[Configuration]

type Date = js.Date

type EC2InstanceIdsList = js.Array[InstanceId]

type EC2InstanceIdsToTerminateList = js.Array[InstanceId]

type EbsBlockDeviceConfigList = js.Array[EbsBlockDeviceConfig]

type EbsBlockDeviceList = js.Array[EbsBlockDevice]

type EbsVolumeList = js.Array[EbsVolume]

type ExecutionEngineType = typings.awsSdk.awsSdkStrings.EMR | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USER
  - typings.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type IdentityType = _IdentityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INSTANCE_FLEET
  - typings.awsSdk.awsSdkStrings.INSTANCE_GROUP
  - java.lang.String
*/
type InstanceCollectionType = _InstanceCollectionType | java.lang.String

type InstanceFleetConfigList = js.Array[InstanceFleetConfig]

type InstanceFleetId = java.lang.String

type InstanceFleetList = js.Array[InstanceFleet]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.BOOTSTRAPPING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.RESIZING
  - typings.awsSdk.awsSdkStrings.SUSPENDED
  - typings.awsSdk.awsSdkStrings.TERMINATING
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - java.lang.String
*/
type InstanceFleetState = _InstanceFleetState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typings.awsSdk.awsSdkStrings.INSTANCE_FAILURE
  - typings.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
  - java.lang.String
*/
type InstanceFleetStateChangeReasonCode = _InstanceFleetStateChangeReasonCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MASTER
  - typings.awsSdk.awsSdkStrings.CORE
  - typings.awsSdk.awsSdkStrings.TASK
  - java.lang.String
*/
type InstanceFleetType = _InstanceFleetType | java.lang.String

type InstanceGroupConfigList = js.Array[InstanceGroupConfig]

type InstanceGroupDetailList = js.Array[InstanceGroupDetail]

type InstanceGroupId = java.lang.String

type InstanceGroupIdsList = js.Array[XmlStringMaxLen256]

type InstanceGroupList = js.Array[InstanceGroup]

type InstanceGroupModifyConfigList = js.Array[InstanceGroupModifyConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.BOOTSTRAPPING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.RECONFIGURING
  - typings.awsSdk.awsSdkStrings.RESIZING
  - typings.awsSdk.awsSdkStrings.SUSPENDED
  - typings.awsSdk.awsSdkStrings.TERMINATING
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - typings.awsSdk.awsSdkStrings.ARRESTED
  - typings.awsSdk.awsSdkStrings.SHUTTING_DOWN
  - typings.awsSdk.awsSdkStrings.ENDED
  - java.lang.String
*/
type InstanceGroupState = _InstanceGroupState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typings.awsSdk.awsSdkStrings.INSTANCE_FAILURE
  - typings.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
  - java.lang.String
*/
type InstanceGroupStateChangeReasonCode = _InstanceGroupStateChangeReasonCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MASTER
  - typings.awsSdk.awsSdkStrings.CORE
  - typings.awsSdk.awsSdkStrings.TASK
  - java.lang.String
*/
type InstanceGroupType = _InstanceGroupType | java.lang.String

type InstanceGroupTypeList = js.Array[InstanceGroupType]

type InstanceId = java.lang.String

type InstanceList = js.Array[Instance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MASTER
  - typings.awsSdk.awsSdkStrings.CORE
  - typings.awsSdk.awsSdkStrings.TASK
  - java.lang.String
*/
type InstanceRoleType = _InstanceRoleType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWAITING_FULFILLMENT
  - typings.awsSdk.awsSdkStrings.PROVISIONING
  - typings.awsSdk.awsSdkStrings.BOOTSTRAPPING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - java.lang.String
*/
type InstanceState = _InstanceState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typings.awsSdk.awsSdkStrings.INSTANCE_FAILURE
  - typings.awsSdk.awsSdkStrings.BOOTSTRAP_FAILURE
  - typings.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
  - java.lang.String
*/
type InstanceStateChangeReasonCode = _InstanceStateChangeReasonCode | java.lang.String

type InstanceStateList = js.Array[InstanceState]

type InstanceType = java.lang.String

type InstanceTypeConfigList = js.Array[InstanceTypeConfig]

type InstanceTypeSpecificationList = js.Array[InstanceTypeSpecification]

type Integer = Double

type JobFlowDetailList = js.Array[JobFlowDetail]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.BOOTSTRAPPING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.WAITING
  - typings.awsSdk.awsSdkStrings.SHUTTING_DOWN
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type JobFlowExecutionState = _JobFlowExecutionState | java.lang.String

type JobFlowExecutionStateList = js.Array[JobFlowExecutionState]

type KeyValueList = js.Array[KeyValue]

type Long = Double

type Marker = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ON_DEMAND
  - typings.awsSdk.awsSdkStrings.SPOT
  - java.lang.String
*/
type MarketType = _MarketType | java.lang.String

type MaxResultsNumber = Double

type MetricDimensionList = js.Array[MetricDimension]

type NewSupportedProductsList = js.Array[SupportedProductConfig]

type NonNegativeDouble = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.START_PENDING
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.FINISHING
  - typings.awsSdk.awsSdkStrings.FINISHED
  - typings.awsSdk.awsSdkStrings.FAILING
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOP_PENDING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type NotebookExecutionStatus = _NotebookExecutionStatus | java.lang.String

type NotebookExecutionSummaryList = js.Array[NotebookExecutionSummary]

type OSReleaseList = js.Array[OSRelease]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.open__
  - typings.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type OnDemandCapacityReservationPreference = _OnDemandCapacityReservationPreference | java.lang.String

type OnDemandCapacityReservationUsageStrategy = `use-capacity-reservations-first` | java.lang.String

type OnDemandProvisioningAllocationStrategy = `lowest-price` | java.lang.String

type OptionalArnType = java.lang.String

type PlacementGroupConfigList = js.Array[PlacementGroupConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SPREAD
  - typings.awsSdk.awsSdkStrings.PARTITION
  - typings.awsSdk.awsSdkStrings.CLUSTER
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type PlacementGroupStrategy = _PlacementGroupStrategy | java.lang.String

type Port = Double

type PortRanges = js.Array[PortRange]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OVERWRITE
  - typings.awsSdk.awsSdkStrings.MERGE
  - java.lang.String
*/
type ReconfigurationType = _ReconfigurationType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SECURITY
  - typings.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type RepoUpgradeOnBoot = _RepoUpgradeOnBoot | java.lang.String

type ResourceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TERMINATE_AT_INSTANCE_HOUR
  - typings.awsSdk.awsSdkStrings.TERMINATE_AT_TASK_COMPLETION
  - java.lang.String
*/
type ScaleDownBehavior = _ScaleDownBehavior | java.lang.String

type ScalingRuleList = js.Array[ScalingRule]

type SecurityConfigurationList = js.Array[SecurityConfigurationSummary]

type SecurityGroupsList = js.Array[XmlStringMaxLen256]

type SessionMappingSummaryList = js.Array[SessionMappingSummary]

type SimplifiedApplicationList = js.Array[SimplifiedApplication]

type SpotProvisioningAllocationStrategy = `capacity-optimized` | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SWITCH_TO_ON_DEMAND
  - typings.awsSdk.awsSdkStrings.TERMINATE_CLUSTER
  - java.lang.String
*/
type SpotProvisioningTimeoutAction = _SpotProvisioningTimeoutAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SAMPLE_COUNT
  - typings.awsSdk.awsSdkStrings.AVERAGE
  - typings.awsSdk.awsSdkStrings.SUM
  - typings.awsSdk.awsSdkStrings.MINIMUM
  - typings.awsSdk.awsSdkStrings.MAXIMUM
  - java.lang.String
*/
type Statistic = _Statistic | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SEND_INTERRUPT
  - typings.awsSdk.awsSdkStrings.TERMINATE_PROCESS
  - java.lang.String
*/
type StepCancellationOption = _StepCancellationOption | java.lang.String

type StepConfigList = js.Array[StepConfig]

type StepDetailList = js.Array[StepDetail]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.CONTINUE
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.INTERRUPTED
  - java.lang.String
*/
type StepExecutionState = _StepExecutionState | java.lang.String

type StepId = java.lang.String

type StepIdsList = js.Array[XmlStringMaxLen256]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.CANCEL_PENDING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.INTERRUPTED
  - java.lang.String
*/
type StepState = _StepState | java.lang.String

type StepStateChangeReasonCode = NONE | java.lang.String

type StepStateList = js.Array[StepState]

type StepSummaryList = js.Array[StepSummary]

type String = java.lang.String

type StringList = js.Array[String]

type StringMap = StringDictionary[String]

type StudioSummaryList = js.Array[StudioSummary]

type SubnetIdList = js.Array[String]

type SupportedProductsList = js.Array[XmlStringMaxLen256]

type TagList = js.Array[Tag]

type ThroughputVal = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NONE
  - typings.awsSdk.awsSdkStrings.SECONDS
  - typings.awsSdk.awsSdkStrings.MICRO_SECONDS
  - typings.awsSdk.awsSdkStrings.MILLI_SECONDS
  - typings.awsSdk.awsSdkStrings.BYTES
  - typings.awsSdk.awsSdkStrings.KILO_BYTES
  - typings.awsSdk.awsSdkStrings.MEGA_BYTES
  - typings.awsSdk.awsSdkStrings.GIGA_BYTES
  - typings.awsSdk.awsSdkStrings.TERA_BYTES
  - typings.awsSdk.awsSdkStrings.BITS
  - typings.awsSdk.awsSdkStrings.KILO_BITS
  - typings.awsSdk.awsSdkStrings.MEGA_BITS
  - typings.awsSdk.awsSdkStrings.GIGA_BITS
  - typings.awsSdk.awsSdkStrings.TERA_BITS
  - typings.awsSdk.awsSdkStrings.PERCENT
  - typings.awsSdk.awsSdkStrings.COUNT
  - typings.awsSdk.awsSdkStrings.BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.KILO_BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.MEGA_BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.GIGA_BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.TERA_BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.BITS_PER_SECOND
  - typings.awsSdk.awsSdkStrings.KILO_BITS_PER_SECOND
  - typings.awsSdk.awsSdkStrings.MEGA_BITS_PER_SECOND
  - typings.awsSdk.awsSdkStrings.GIGA_BITS_PER_SECOND
  - typings.awsSdk.awsSdkStrings.TERA_BITS_PER_SECOND
  - typings.awsSdk.awsSdkStrings.COUNT_PER_SECOND
  - java.lang.String
*/
type Unit = _Unit | java.lang.String

type WholeNumber = Double

type XmlString = java.lang.String

type XmlStringList = js.Array[XmlString]

type XmlStringMaxLen256 = java.lang.String

type XmlStringMaxLen256List = js.Array[XmlStringMaxLen256]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2009-03-31`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
