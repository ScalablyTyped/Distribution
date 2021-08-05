package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task extends StObject {
  
  /**
    * The Elastic Network Adapter associated with the task if the task uses the awsvpc network mode.
    */
  var attachments: js.UndefOr[Attachments] = js.undefined
  
  /**
    * The attributes of the task
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  
  /**
    * The availability zone of the task.
    */
  var availabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The capacity provider associated with the task.
    */
  var capacityProviderName: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the cluster that hosts the task.
    */
  var clusterArn: js.UndefOr[String] = js.undefined
  
  /**
    * The connectivity status of a task.
    */
  var connectivity: js.UndefOr[Connectivity] = js.undefined
  
  /**
    * The Unix timestamp for when the task last went into CONNECTED status.
    */
  var connectivityAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The ARN of the container instances that host the task.
    */
  var containerInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The containers associated with the task.
    */
  var containers: js.UndefOr[Containers] = js.undefined
  
  /**
    * The number of CPU units used by the task as expressed in a task definition. It can be expressed as an integer using CPU units, for example 1024. It can also be expressed as a string using vCPUs, for example 1 vCPU or 1 vcpu. String values are converted to an integer indicating the CPU units when the task definition is registered. If you are using the EC2 launch type, this field is optional. Supported values are between 128 CPU units (0.125 vCPUs) and 10240 CPU units (10 vCPUs). If you are using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of supported values for the memory parameter:   256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)   512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)   1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)   2048 (2 vCPU) - Available memory values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB)   4096 (4 vCPU) - Available memory values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB)  
    */
  var cpu: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for when the task was created (the task entered the PENDING state).
    */
  var createdAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The desired status of the task. For more information, see Task Lifecycle.
    */
  var desiredStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for when the task execution stopped.
    */
  var executionStoppedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the task group associated with the task.
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * The health status for the task, which is determined by the health of the essential containers in the task. If all essential containers in the task are reporting as HEALTHY, then the task status also reports as HEALTHY. If any essential containers in the task are reporting as UNHEALTHY or UNKNOWN, then the task status also reports as UNHEALTHY or UNKNOWN, accordingly.  The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a container image (such as those specified in a parent image or from the image's Dockerfile) and not specified in the container definition. Health check parameters that are specified in a container definition override any Docker health checks that exist in the container image. 
    */
  var healthStatus: js.UndefOr[HealthStatus] = js.undefined
  
  /**
    * The Elastic Inference accelerator associated with the task.
    */
  var inferenceAccelerators: js.UndefOr[InferenceAccelerators] = js.undefined
  
  /**
    * The last known status of the task. For more information, see Task Lifecycle.
    */
  var lastStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The launch type on which your task is running. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  
  /**
    * The amount of memory (in MiB) used by the task as expressed in a task definition. It can be expressed as an integer using MiB, for example 1024. It can also be expressed as a string using GB, for example 1GB or 1 GB. String values are converted to an integer indicating the MiB when the task definition is registered. If you are using the EC2 launch type, this field is optional. If you are using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of supported values for the cpu parameter:   512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)   1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)   2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available cpu values: 1024 (1 vCPU)   Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values: 2048 (2 vCPU)   Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values: 4096 (4 vCPU)  
    */
  var memory: js.UndefOr[String] = js.undefined
  
  /**
    * One or more container overrides.
    */
  var overrides: js.UndefOr[TaskOverride] = js.undefined
  
  /**
    * The platform version on which your task is running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for when the container image pull began.
    */
  var pullStartedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Unix timestamp for when the container image pull completed.
    */
  var pullStoppedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The Unix timestamp for when the task started (the task transitioned from the PENDING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the startedBy parameter contains the deployment ID of the service that starts it.
    */
  var startedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The stop code indicating why a task was stopped. The stoppedReason may contain additional details.
    */
  var stopCode: js.UndefOr[TaskStopCode] = js.undefined
  
  /**
    * The Unix timestamp for when the task was stopped (the task transitioned from the RUNNING state to the STOPPED state).
    */
  var stoppedAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The reason that the task was stopped.
    */
  var stoppedReason: js.UndefOr[String] = js.undefined
  
  /**
    * The Unix timestamp for when the task stops (transitions from the RUNNING state to STOPPED).
    */
  var stoppingAt: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var taskArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the task definition that creates the task.
    */
  var taskDefinitionArn: js.UndefOr[String] = js.undefined
  
  /**
    * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch Events, you can compare the version of a task reported by the Amazon ECS API actions with the version reported in CloudWatch Events for the task (inside the detail object) to verify that the version in your event stream is current.
    */
  var version: js.UndefOr[Long] = js.undefined
}
object Task {
  
  inline def apply(): Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Task]
  }
  
  extension [Self <: Task](x: Self) {
    
    inline def setAttachments(value: Attachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    inline def setCapacityProviderName(value: String): Self = StObject.set(x, "capacityProviderName", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderNameUndefined: Self = StObject.set(x, "capacityProviderName", js.undefined)
    
    inline def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    inline def setClusterArnUndefined: Self = StObject.set(x, "clusterArn", js.undefined)
    
    inline def setConnectivity(value: Connectivity): Self = StObject.set(x, "connectivity", value.asInstanceOf[js.Any])
    
    inline def setConnectivityAt(value: Timestamp): Self = StObject.set(x, "connectivityAt", value.asInstanceOf[js.Any])
    
    inline def setConnectivityAtUndefined: Self = StObject.set(x, "connectivityAt", js.undefined)
    
    inline def setConnectivityUndefined: Self = StObject.set(x, "connectivity", js.undefined)
    
    inline def setContainerInstanceArn(value: String): Self = StObject.set(x, "containerInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceArnUndefined: Self = StObject.set(x, "containerInstanceArn", js.undefined)
    
    inline def setContainers(value: Containers): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    inline def setContainersVarargs(value: Container*): Self = StObject.set(x, "containers", js.Array(value :_*))
    
    inline def setCpu(value: String): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
    
    inline def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDesiredStatus(value: String): Self = StObject.set(x, "desiredStatus", value.asInstanceOf[js.Any])
    
    inline def setDesiredStatusUndefined: Self = StObject.set(x, "desiredStatus", js.undefined)
    
    inline def setExecutionStoppedAt(value: Timestamp): Self = StObject.set(x, "executionStoppedAt", value.asInstanceOf[js.Any])
    
    inline def setExecutionStoppedAtUndefined: Self = StObject.set(x, "executionStoppedAt", js.undefined)
    
    inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHealthStatus(value: HealthStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "healthStatus", js.undefined)
    
    inline def setInferenceAccelerators(value: InferenceAccelerators): Self = StObject.set(x, "inferenceAccelerators", value.asInstanceOf[js.Any])
    
    inline def setInferenceAcceleratorsUndefined: Self = StObject.set(x, "inferenceAccelerators", js.undefined)
    
    inline def setInferenceAcceleratorsVarargs(value: InferenceAccelerator*): Self = StObject.set(x, "inferenceAccelerators", js.Array(value :_*))
    
    inline def setLastStatus(value: String): Self = StObject.set(x, "lastStatus", value.asInstanceOf[js.Any])
    
    inline def setLastStatusUndefined: Self = StObject.set(x, "lastStatus", js.undefined)
    
    inline def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    inline def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    inline def setMemory(value: String): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
    
    inline def setOverrides(value: TaskOverride): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    inline def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    inline def setPullStartedAt(value: Timestamp): Self = StObject.set(x, "pullStartedAt", value.asInstanceOf[js.Any])
    
    inline def setPullStartedAtUndefined: Self = StObject.set(x, "pullStartedAt", js.undefined)
    
    inline def setPullStoppedAt(value: Timestamp): Self = StObject.set(x, "pullStoppedAt", value.asInstanceOf[js.Any])
    
    inline def setPullStoppedAtUndefined: Self = StObject.set(x, "pullStoppedAt", js.undefined)
    
    inline def setStartedAt(value: Timestamp): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setStartedBy(value: String): Self = StObject.set(x, "startedBy", value.asInstanceOf[js.Any])
    
    inline def setStartedByUndefined: Self = StObject.set(x, "startedBy", js.undefined)
    
    inline def setStopCode(value: TaskStopCode): Self = StObject.set(x, "stopCode", value.asInstanceOf[js.Any])
    
    inline def setStopCodeUndefined: Self = StObject.set(x, "stopCode", js.undefined)
    
    inline def setStoppedAt(value: Timestamp): Self = StObject.set(x, "stoppedAt", value.asInstanceOf[js.Any])
    
    inline def setStoppedAtUndefined: Self = StObject.set(x, "stoppedAt", js.undefined)
    
    inline def setStoppedReason(value: String): Self = StObject.set(x, "stoppedReason", value.asInstanceOf[js.Any])
    
    inline def setStoppedReasonUndefined: Self = StObject.set(x, "stoppedReason", js.undefined)
    
    inline def setStoppingAt(value: Timestamp): Self = StObject.set(x, "stoppingAt", value.asInstanceOf[js.Any])
    
    inline def setStoppingAtUndefined: Self = StObject.set(x, "stoppingAt", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    inline def setTaskArn(value: String): Self = StObject.set(x, "taskArn", value.asInstanceOf[js.Any])
    
    inline def setTaskArnUndefined: Self = StObject.set(x, "taskArn", js.undefined)
    
    inline def setTaskDefinitionArn(value: String): Self = StObject.set(x, "taskDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setTaskDefinitionArnUndefined: Self = StObject.set(x, "taskDefinitionArn", js.undefined)
    
    inline def setVersion(value: Long): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
