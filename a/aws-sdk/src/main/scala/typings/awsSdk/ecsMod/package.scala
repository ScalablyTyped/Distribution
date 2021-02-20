package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ecsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.STAGING
    - typings.awsSdk.awsSdkStrings.STAGED
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.UPDATED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type AgentUpdateStatus = typings.awsSdk.ecsMod._AgentUpdateStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AssignPublicIp = typings.awsSdk.ecsMod._AssignPublicIp | java.lang.String
  
  type AttachmentDetails = js.Array[typings.awsSdk.ecsMod.KeyValuePair]
  
  type AttachmentStateChanges = js.Array[typings.awsSdk.ecsMod.AttachmentStateChange]
  
  type Attachments = js.Array[typings.awsSdk.ecsMod.Attachment]
  
  type Attributes = js.Array[typings.awsSdk.ecsMod.Attribute]
  
  type Boolean = scala.Boolean
  
  type BoxedBoolean = scala.Boolean
  
  type BoxedInteger = scala.Double
  
  type CapacityProviderField = typings.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type CapacityProviderFieldList = js.Array[typings.awsSdk.ecsMod.CapacityProviderField]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type CapacityProviderStatus = typings.awsSdk.ecsMod._CapacityProviderStatus | java.lang.String
  
  type CapacityProviderStrategy = js.Array[typings.awsSdk.ecsMod.CapacityProviderStrategyItem]
  
  type CapacityProviderStrategyItemBase = scala.Double
  
  type CapacityProviderStrategyItemWeight = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.DELETE_COMPLETE
    - typings.awsSdk.awsSdkStrings.DELETE_FAILED
    - java.lang.String
  */
  type CapacityProviderUpdateStatus = typings.awsSdk.ecsMod._CapacityProviderUpdateStatus | java.lang.String
  
  type CapacityProviders = js.Array[typings.awsSdk.ecsMod.CapacityProvider]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.ecsMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ATTACHMENTS
    - typings.awsSdk.awsSdkStrings.SETTINGS
    - typings.awsSdk.awsSdkStrings.STATISTICS
    - typings.awsSdk.awsSdkStrings.TAGS
    - java.lang.String
  */
  type ClusterField = typings.awsSdk.ecsMod._ClusterField | java.lang.String
  
  type ClusterFieldList = js.Array[typings.awsSdk.ecsMod.ClusterField]
  
  type ClusterSettingName = typings.awsSdk.awsSdkStrings.containerInsights | java.lang.String
  
  type ClusterSettings = js.Array[typings.awsSdk.ecsMod.ClusterSetting]
  
  type Clusters = js.Array[typings.awsSdk.ecsMod.Cluster]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EC2
    - typings.awsSdk.awsSdkStrings.FARGATE
    - java.lang.String
  */
  type Compatibility = typings.awsSdk.ecsMod._Compatibility | java.lang.String
  
  type CompatibilityList = js.Array[typings.awsSdk.ecsMod.Compatibility]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CONNECTED
    - typings.awsSdk.awsSdkStrings.DISCONNECTED
    - java.lang.String
  */
  type Connectivity = typings.awsSdk.ecsMod._Connectivity | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.START
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - typings.awsSdk.awsSdkStrings.SUCCESS
    - typings.awsSdk.awsSdkStrings.HEALTHY
    - java.lang.String
  */
  type ContainerCondition = typings.awsSdk.ecsMod._ContainerCondition | java.lang.String
  
  type ContainerDefinitions = js.Array[typings.awsSdk.ecsMod.ContainerDefinition]
  
  type ContainerDependencies = js.Array[typings.awsSdk.ecsMod.ContainerDependency]
  
  type ContainerInstanceField = typings.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type ContainerInstanceFieldList = js.Array[typings.awsSdk.ecsMod.ContainerInstanceField]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DRAINING
    - typings.awsSdk.awsSdkStrings.REGISTERING
    - typings.awsSdk.awsSdkStrings.DEREGISTERING
    - typings.awsSdk.awsSdkStrings.REGISTRATION_FAILED
    - java.lang.String
  */
  type ContainerInstanceStatus = typings.awsSdk.ecsMod._ContainerInstanceStatus | java.lang.String
  
  type ContainerInstances = js.Array[typings.awsSdk.ecsMod.ContainerInstance]
  
  type ContainerOverrides = js.Array[typings.awsSdk.ecsMod.ContainerOverride]
  
  type ContainerStateChanges = js.Array[typings.awsSdk.ecsMod.ContainerStateChange]
  
  type Containers = js.Array[typings.awsSdk.ecsMod.Container]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ECS
    - typings.awsSdk.awsSdkStrings.CODE_DEPLOY
    - typings.awsSdk.awsSdkStrings.EXTERNAL
    - java.lang.String
  */
  type DeploymentControllerType = typings.awsSdk.ecsMod._DeploymentControllerType | java.lang.String
  
  type Deployments = js.Array[typings.awsSdk.ecsMod.Deployment]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type DesiredStatus = typings.awsSdk.ecsMod._DesiredStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.read_
    - typings.awsSdk.awsSdkStrings.write_
    - typings.awsSdk.awsSdkStrings.mknod_
    - java.lang.String
  */
  type DeviceCgroupPermission = typings.awsSdk.ecsMod._DeviceCgroupPermission | java.lang.String
  
  type DeviceCgroupPermissions = js.Array[typings.awsSdk.ecsMod.DeviceCgroupPermission]
  
  type DevicesList = js.Array[typings.awsSdk.ecsMod.Device]
  
  type DockerLabelsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ecsMod.String]
  
  type Double = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type EFSAuthorizationConfigIAM = typings.awsSdk.ecsMod._EFSAuthorizationConfigIAM | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type EFSTransitEncryption = typings.awsSdk.ecsMod._EFSTransitEncryption | java.lang.String
  
  type EnvironmentFileType = typings.awsSdk.awsSdkStrings.s3_ | java.lang.String
  
  type EnvironmentFiles = js.Array[typings.awsSdk.ecsMod.EnvironmentFile]
  
  type EnvironmentVariables = js.Array[typings.awsSdk.ecsMod.KeyValuePair]
  
  type Failures = js.Array[typings.awsSdk.ecsMod.Failure]
  
  type FirelensConfigurationOptionsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ecsMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.fluentd
    - typings.awsSdk.awsSdkStrings.fluentbit
    - java.lang.String
  */
  type FirelensConfigurationType = typings.awsSdk.ecsMod._FirelensConfigurationType | java.lang.String
  
  type GpuIds = js.Array[typings.awsSdk.ecsMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HEALTHY
    - typings.awsSdk.awsSdkStrings.UNHEALTHY
    - typings.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type HealthStatus = typings.awsSdk.ecsMod._HealthStatus | java.lang.String
  
  type HostEntryList = js.Array[typings.awsSdk.ecsMod.HostEntry]
  
  type InferenceAcceleratorOverrides = js.Array[typings.awsSdk.ecsMod.InferenceAcceleratorOverride]
  
  type InferenceAccelerators = js.Array[typings.awsSdk.ecsMod.InferenceAccelerator]
  
  type Integer = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.host__
    - typings.awsSdk.awsSdkStrings.task_
    - typings.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type IpcMode = typings.awsSdk.ecsMod._IpcMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EC2
    - typings.awsSdk.awsSdkStrings.FARGATE
    - java.lang.String
  */
  type LaunchType = typings.awsSdk.ecsMod._LaunchType | java.lang.String
  
  type LoadBalancers = js.Array[typings.awsSdk.ecsMod.LoadBalancer]
  
  type LogConfigurationOptionsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ecsMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`json-file`
    - typings.awsSdk.awsSdkStrings.syslog
    - typings.awsSdk.awsSdkStrings.journald
    - typings.awsSdk.awsSdkStrings.gelf
    - typings.awsSdk.awsSdkStrings.fluentd
    - typings.awsSdk.awsSdkStrings.awslogs
    - typings.awsSdk.awsSdkStrings.splunk
    - typings.awsSdk.awsSdkStrings.awsfirelens
    - java.lang.String
  */
  type LogDriver = typings.awsSdk.ecsMod._LogDriver | java.lang.String
  
  type Long = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ManagedScalingStatus = typings.awsSdk.ecsMod._ManagedScalingStatus | java.lang.String
  
  type ManagedScalingStepSize = scala.Double
  
  type ManagedScalingTargetCapacity = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ManagedTerminationProtection = typings.awsSdk.ecsMod._ManagedTerminationProtection | java.lang.String
  
  type MountPointList = js.Array[typings.awsSdk.ecsMod.MountPoint]
  
  type NetworkBindings = js.Array[typings.awsSdk.ecsMod.NetworkBinding]
  
  type NetworkInterfaces = js.Array[typings.awsSdk.ecsMod.NetworkInterface]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.bridge
    - typings.awsSdk.awsSdkStrings.host__
    - typings.awsSdk.awsSdkStrings.awsvpc_
    - typings.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type NetworkMode = typings.awsSdk.ecsMod._NetworkMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.host__
    - typings.awsSdk.awsSdkStrings.task_
    - java.lang.String
  */
  type PidMode = typings.awsSdk.ecsMod._PidMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.distinctInstance
    - typings.awsSdk.awsSdkStrings.memberOf
    - java.lang.String
  */
  type PlacementConstraintType = typings.awsSdk.ecsMod._PlacementConstraintType | java.lang.String
  
  type PlacementConstraints = js.Array[typings.awsSdk.ecsMod.PlacementConstraint]
  
  type PlacementStrategies = js.Array[typings.awsSdk.ecsMod.PlacementStrategy]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.random__
    - typings.awsSdk.awsSdkStrings.spread_
    - typings.awsSdk.awsSdkStrings.binpack
    - java.lang.String
  */
  type PlacementStrategyType = typings.awsSdk.ecsMod._PlacementStrategyType | java.lang.String
  
  type PlatformDeviceType = typings.awsSdk.awsSdkStrings.GPU | java.lang.String
  
  type PlatformDevices = js.Array[typings.awsSdk.ecsMod.PlatformDevice]
  
  type PortMappingList = js.Array[typings.awsSdk.ecsMod.PortMapping]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TASK_DEFINITION
    - typings.awsSdk.awsSdkStrings.SERVICE
    - java.lang.String
  */
  type PropagateTags = typings.awsSdk.ecsMod._PropagateTags | java.lang.String
  
  type ProxyConfigurationProperties = js.Array[typings.awsSdk.ecsMod.KeyValuePair]
  
  type ProxyConfigurationType = typings.awsSdk.awsSdkStrings.APPMESH | java.lang.String
  
  type RequiresAttributes = js.Array[typings.awsSdk.ecsMod.Attribute]
  
  type ResourceRequirements = js.Array[typings.awsSdk.ecsMod.ResourceRequirement]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GPU
    - typings.awsSdk.awsSdkStrings.InferenceAccelerator
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.ecsMod._ResourceType | java.lang.String
  
  type Resources = js.Array[typings.awsSdk.ecsMod.Resource]
  
  type ScaleUnit = typings.awsSdk.awsSdkStrings.PERCENT | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.REPLICA
    - typings.awsSdk.awsSdkStrings.DAEMON
    - java.lang.String
  */
  type SchedulingStrategy = typings.awsSdk.ecsMod._SchedulingStrategy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.task_
    - typings.awsSdk.awsSdkStrings.shared__
    - java.lang.String
  */
  type Scope = typings.awsSdk.ecsMod._Scope | java.lang.String
  
  type SecretList = js.Array[typings.awsSdk.ecsMod.Secret]
  
  type ServiceEvents = js.Array[typings.awsSdk.ecsMod.ServiceEvent]
  
  type ServiceField = typings.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type ServiceFieldList = js.Array[typings.awsSdk.ecsMod.ServiceField]
  
  type ServiceRegistries = js.Array[typings.awsSdk.ecsMod.ServiceRegistry]
  
  type Services = js.Array[typings.awsSdk.ecsMod.Service]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.serviceLongArnFormat
    - typings.awsSdk.awsSdkStrings.taskLongArnFormat
    - typings.awsSdk.awsSdkStrings.containerInstanceLongArnFormat
    - typings.awsSdk.awsSdkStrings.awsvpcTrunking
    - typings.awsSdk.awsSdkStrings.containerInsights
    - java.lang.String
  */
  type SettingName = typings.awsSdk.ecsMod._SettingName | java.lang.String
  
  type Settings = js.Array[typings.awsSdk.ecsMod.Setting]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASC
    - typings.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type SortOrder = typings.awsSdk.ecsMod._SortOrder | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STEADY_STATE
    - typings.awsSdk.awsSdkStrings.STABILIZING
    - java.lang.String
  */
  type StabilityStatus = typings.awsSdk.ecsMod._StabilityStatus | java.lang.String
  
  type Statistics = js.Array[typings.awsSdk.ecsMod.KeyValuePair]
  
  type String = java.lang.String
  
  type StringList = js.Array[typings.awsSdk.ecsMod.String]
  
  type StringMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ecsMod.String]
  
  type SystemControls = js.Array[typings.awsSdk.ecsMod.SystemControl]
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typings.awsSdk.ecsMod.TagKey]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typings.awsSdk.ecsMod.Tag]
  
  type TargetType = typings.awsSdk.awsSdkStrings.`container-instance` | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type TaskDefinitionFamilyStatus = typings.awsSdk.ecsMod._TaskDefinitionFamilyStatus | java.lang.String
  
  type TaskDefinitionField = typings.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type TaskDefinitionFieldList = js.Array[typings.awsSdk.ecsMod.TaskDefinitionField]
  
  type TaskDefinitionPlacementConstraintType = typings.awsSdk.awsSdkStrings.memberOf | java.lang.String
  
  type TaskDefinitionPlacementConstraints = js.Array[typings.awsSdk.ecsMod.TaskDefinitionPlacementConstraint]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type TaskDefinitionStatus = typings.awsSdk.ecsMod._TaskDefinitionStatus | java.lang.String
  
  type TaskField = typings.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type TaskFieldList = js.Array[typings.awsSdk.ecsMod.TaskField]
  
  type TaskSetField = typings.awsSdk.awsSdkStrings.TAGS | java.lang.String
  
  type TaskSetFieldList = js.Array[typings.awsSdk.ecsMod.TaskSetField]
  
  type TaskSets = js.Array[typings.awsSdk.ecsMod.TaskSet]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TaskFailedToStart
    - typings.awsSdk.awsSdkStrings.EssentialContainerExited
    - typings.awsSdk.awsSdkStrings.UserInitiated
    - java.lang.String
  */
  type TaskStopCode = typings.awsSdk.ecsMod._TaskStopCode | java.lang.String
  
  type Tasks = js.Array[typings.awsSdk.ecsMod.Task]
  
  type Timestamp = typings.std.Date
  
  type TmpfsList = js.Array[typings.awsSdk.ecsMod.Tmpfs]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.tcp_
    - typings.awsSdk.awsSdkStrings.udp_
    - java.lang.String
  */
  type TransportProtocol = typings.awsSdk.ecsMod._TransportProtocol | java.lang.String
  
  type UlimitList = js.Array[typings.awsSdk.ecsMod.Ulimit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.core__
    - typings.awsSdk.awsSdkStrings.cpu__
    - typings.awsSdk.awsSdkStrings.data_
    - typings.awsSdk.awsSdkStrings.fsize
    - typings.awsSdk.awsSdkStrings.locks
    - typings.awsSdk.awsSdkStrings.memlock
    - typings.awsSdk.awsSdkStrings.msgqueue
    - typings.awsSdk.awsSdkStrings.nice
    - typings.awsSdk.awsSdkStrings.nofile
    - typings.awsSdk.awsSdkStrings.nproc
    - typings.awsSdk.awsSdkStrings.rss
    - typings.awsSdk.awsSdkStrings.rtprio
    - typings.awsSdk.awsSdkStrings.rttime
    - typings.awsSdk.awsSdkStrings.sigpending
    - typings.awsSdk.awsSdkStrings.stack
    - java.lang.String
  */
  type UlimitName = typings.awsSdk.ecsMod._UlimitName | java.lang.String
  
  type VolumeFromList = js.Array[typings.awsSdk.ecsMod.VolumeFrom]
  
  type VolumeList = js.Array[typings.awsSdk.ecsMod.Volume]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-11-13`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.ecsMod._apiVersion | java.lang.String
}
