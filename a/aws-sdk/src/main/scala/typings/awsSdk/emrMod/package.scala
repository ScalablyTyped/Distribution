package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emrMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TERMINATE_JOB_FLOW
    - typings.awsSdk.awsSdkStrings.TERMINATE_CLUSTER
    - typings.awsSdk.awsSdkStrings.CANCEL_AND_WAIT
    - typings.awsSdk.awsSdkStrings.CONTINUE
    - java.lang.String
  */
  type ActionOnFailure = typings.awsSdk.emrMod._ActionOnFailure | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CHANGE_IN_CAPACITY
    - typings.awsSdk.awsSdkStrings.PERCENT_CHANGE_IN_CAPACITY
    - typings.awsSdk.awsSdkStrings.EXACT_CAPACITY
    - java.lang.String
  */
  type AdjustmentType = typings.awsSdk.emrMod._AdjustmentType | java.lang.String
  type ApplicationList = js.Array[typings.awsSdk.emrMod.Application]
  type ArnType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.ATTACHING
    - typings.awsSdk.awsSdkStrings.ATTACHED
    - typings.awsSdk.awsSdkStrings.DETACHING
    - typings.awsSdk.awsSdkStrings.DETACHED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AutoScalingPolicyState = typings.awsSdk.emrMod._AutoScalingPolicyState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USER_REQUEST
    - typings.awsSdk.awsSdkStrings.PROVISION_FAILURE
    - typings.awsSdk.awsSdkStrings.CLEANUP_FAILURE
    - java.lang.String
  */
  type AutoScalingPolicyStateChangeReasonCode = typings.awsSdk.emrMod._AutoScalingPolicyStateChangeReasonCode | java.lang.String
  type Boolean = scala.Boolean
  type BooleanObject = scala.Boolean
  type BootstrapActionConfigList = js.Array[typings.awsSdk.emrMod.BootstrapActionConfig]
  type BootstrapActionDetailList = js.Array[typings.awsSdk.emrMod.BootstrapActionDetail]
  type CancelStepsInfoList = js.Array[typings.awsSdk.emrMod.CancelStepsInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUBMITTED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CancelStepsRequestStatus = typings.awsSdk.emrMod._CancelStepsRequestStatus | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.emrMod.ClientApiVersions
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
  type ClusterState = typings.awsSdk.emrMod._ClusterState | java.lang.String
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
  type ClusterStateChangeReasonCode = typings.awsSdk.emrMod._ClusterStateChangeReasonCode | java.lang.String
  type ClusterStateList = js.Array[typings.awsSdk.emrMod.ClusterState]
  type ClusterSummaryList = js.Array[typings.awsSdk.emrMod.ClusterSummary]
  type CommandList = js.Array[typings.awsSdk.emrMod.Command]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GREATER_THAN_OR_EQUAL
    - typings.awsSdk.awsSdkStrings.GREATER_THAN
    - typings.awsSdk.awsSdkStrings.LESS_THAN
    - typings.awsSdk.awsSdkStrings.LESS_THAN_OR_EQUAL
    - java.lang.String
  */
  type ComparisonOperator = typings.awsSdk.emrMod._ComparisonOperator | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InstanceFleetUnits
    - typings.awsSdk.awsSdkStrings.Instances
    - typings.awsSdk.awsSdkStrings.VCPU
    - java.lang.String
  */
  type ComputeLimitsUnitType = typings.awsSdk.emrMod._ComputeLimitsUnitType | java.lang.String
  type ConfigurationList = js.Array[typings.awsSdk.emrMod.Configuration]
  type Date = typings.std.Date
  type EC2InstanceIdsList = js.Array[typings.awsSdk.emrMod.InstanceId]
  type EC2InstanceIdsToTerminateList = js.Array[typings.awsSdk.emrMod.InstanceId]
  type EbsBlockDeviceConfigList = js.Array[typings.awsSdk.emrMod.EbsBlockDeviceConfig]
  type EbsBlockDeviceList = js.Array[typings.awsSdk.emrMod.EbsBlockDevice]
  type EbsVolumeList = js.Array[typings.awsSdk.emrMod.EbsVolume]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INSTANCE_FLEET
    - typings.awsSdk.awsSdkStrings.INSTANCE_GROUP
    - java.lang.String
  */
  type InstanceCollectionType = typings.awsSdk.emrMod._InstanceCollectionType | java.lang.String
  type InstanceFleetConfigList = js.Array[typings.awsSdk.emrMod.InstanceFleetConfig]
  type InstanceFleetId = java.lang.String
  type InstanceFleetList = js.Array[typings.awsSdk.emrMod.InstanceFleet]
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
  type InstanceFleetState = typings.awsSdk.emrMod._InstanceFleetState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typings.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typings.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceFleetStateChangeReasonCode = typings.awsSdk.emrMod._InstanceFleetStateChangeReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MASTER
    - typings.awsSdk.awsSdkStrings.CORE
    - typings.awsSdk.awsSdkStrings.TASK
    - java.lang.String
  */
  type InstanceFleetType = typings.awsSdk.emrMod._InstanceFleetType | java.lang.String
  type InstanceGroupConfigList = js.Array[typings.awsSdk.emrMod.InstanceGroupConfig]
  type InstanceGroupDetailList = js.Array[typings.awsSdk.emrMod.InstanceGroupDetail]
  type InstanceGroupId = java.lang.String
  type InstanceGroupIdsList = js.Array[typings.awsSdk.emrMod.XmlStringMaxLen256]
  type InstanceGroupList = js.Array[typings.awsSdk.emrMod.InstanceGroup]
  type InstanceGroupModifyConfigList = js.Array[typings.awsSdk.emrMod.InstanceGroupModifyConfig]
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
  type InstanceGroupState = typings.awsSdk.emrMod._InstanceGroupState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typings.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typings.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceGroupStateChangeReasonCode = typings.awsSdk.emrMod._InstanceGroupStateChangeReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MASTER
    - typings.awsSdk.awsSdkStrings.CORE
    - typings.awsSdk.awsSdkStrings.TASK
    - java.lang.String
  */
  type InstanceGroupType = typings.awsSdk.emrMod._InstanceGroupType | java.lang.String
  type InstanceGroupTypeList = js.Array[typings.awsSdk.emrMod.InstanceGroupType]
  type InstanceId = java.lang.String
  type InstanceList = js.Array[typings.awsSdk.emrMod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MASTER
    - typings.awsSdk.awsSdkStrings.CORE
    - typings.awsSdk.awsSdkStrings.TASK
    - java.lang.String
  */
  type InstanceRoleType = typings.awsSdk.emrMod._InstanceRoleType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AWAITING_FULFILLMENT
    - typings.awsSdk.awsSdkStrings.PROVISIONING
    - typings.awsSdk.awsSdkStrings.BOOTSTRAPPING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.TERMINATED
    - java.lang.String
  */
  type InstanceState = typings.awsSdk.emrMod._InstanceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INTERNAL_ERROR
    - typings.awsSdk.awsSdkStrings.VALIDATION_ERROR
    - typings.awsSdk.awsSdkStrings.INSTANCE_FAILURE
    - typings.awsSdk.awsSdkStrings.BOOTSTRAP_FAILURE
    - typings.awsSdk.awsSdkStrings.CLUSTER_TERMINATED
    - java.lang.String
  */
  type InstanceStateChangeReasonCode = typings.awsSdk.emrMod._InstanceStateChangeReasonCode | java.lang.String
  type InstanceStateList = js.Array[typings.awsSdk.emrMod.InstanceState]
  type InstanceType = java.lang.String
  type InstanceTypeConfigList = js.Array[typings.awsSdk.emrMod.InstanceTypeConfig]
  type InstanceTypeSpecificationList = js.Array[typings.awsSdk.emrMod.InstanceTypeSpecification]
  type Integer = scala.Double
  type JobFlowDetailList = js.Array[typings.awsSdk.emrMod.JobFlowDetail]
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
  type JobFlowExecutionState = typings.awsSdk.emrMod._JobFlowExecutionState | java.lang.String
  type JobFlowExecutionStateList = js.Array[typings.awsSdk.emrMod.JobFlowExecutionState]
  type KeyValueList = js.Array[typings.awsSdk.emrMod.KeyValue]
  type Long = scala.Double
  type Marker = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ON_DEMAND
    - typings.awsSdk.awsSdkStrings.SPOT
    - java.lang.String
  */
  type MarketType = typings.awsSdk.emrMod._MarketType | java.lang.String
  type MetricDimensionList = js.Array[typings.awsSdk.emrMod.MetricDimension]
  type NewSupportedProductsList = js.Array[typings.awsSdk.emrMod.SupportedProductConfig]
  type NonNegativeDouble = scala.Double
  type OptionalArnType = java.lang.String
  type Port = scala.Double
  type PortRanges = js.Array[typings.awsSdk.emrMod.PortRange]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SECURITY
    - typings.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type RepoUpgradeOnBoot = typings.awsSdk.emrMod._RepoUpgradeOnBoot | java.lang.String
  type ResourceId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TERMINATE_AT_INSTANCE_HOUR
    - typings.awsSdk.awsSdkStrings.TERMINATE_AT_TASK_COMPLETION
    - java.lang.String
  */
  type ScaleDownBehavior = typings.awsSdk.emrMod._ScaleDownBehavior | java.lang.String
  type ScalingRuleList = js.Array[typings.awsSdk.emrMod.ScalingRule]
  type SecurityConfigurationList = js.Array[typings.awsSdk.emrMod.SecurityConfigurationSummary]
  type SecurityGroupsList = js.Array[typings.awsSdk.emrMod.XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SWITCH_TO_ON_DEMAND
    - typings.awsSdk.awsSdkStrings.TERMINATE_CLUSTER
    - java.lang.String
  */
  type SpotProvisioningTimeoutAction = typings.awsSdk.emrMod._SpotProvisioningTimeoutAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SAMPLE_COUNT
    - typings.awsSdk.awsSdkStrings.AVERAGE
    - typings.awsSdk.awsSdkStrings.SUM
    - typings.awsSdk.awsSdkStrings.MINIMUM
    - typings.awsSdk.awsSdkStrings.MAXIMUM
    - java.lang.String
  */
  type Statistic = typings.awsSdk.emrMod._Statistic | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SEND_INTERRUPT
    - typings.awsSdk.awsSdkStrings.TERMINATE_PROCESS
    - java.lang.String
  */
  type StepCancellationOption = typings.awsSdk.emrMod._StepCancellationOption | java.lang.String
  type StepConfigList = js.Array[typings.awsSdk.emrMod.StepConfig]
  type StepDetailList = js.Array[typings.awsSdk.emrMod.StepDetail]
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
  type StepExecutionState = typings.awsSdk.emrMod._StepExecutionState | java.lang.String
  type StepId = java.lang.String
  type StepIdsList = js.Array[typings.awsSdk.emrMod.XmlStringMaxLen256]
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
  type StepState = typings.awsSdk.emrMod._StepState | java.lang.String
  type StepStateChangeReasonCode = typings.awsSdk.awsSdkStrings.NONE | java.lang.String
  type StepStateList = js.Array[typings.awsSdk.emrMod.StepState]
  type StepSummaryList = js.Array[typings.awsSdk.emrMod.StepSummary]
  type String = java.lang.String
  type StringList = js.Array[typings.awsSdk.emrMod.String]
  type StringMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.emrMod.String]
  type SupportedProductsList = js.Array[typings.awsSdk.emrMod.XmlStringMaxLen256]
  type TagList = js.Array[typings.awsSdk.emrMod.Tag]
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
  type Unit = typings.awsSdk.emrMod._Unit | java.lang.String
  type WholeNumber = scala.Double
  type XmlString = java.lang.String
  type XmlStringList = js.Array[typings.awsSdk.emrMod.XmlString]
  type XmlStringMaxLen256 = java.lang.String
  type XmlStringMaxLen256List = js.Array[typings.awsSdk.emrMod.XmlStringMaxLen256]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2009-03-31`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.emrMod._apiVersion | java.lang.String
}
