package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Task extends js.Object {
  /**
    * The Elastic Network Adapter associated with the task if the task uses the awsvpc network mode.
    */
  var attachments: js.UndefOr[Attachments] = js.native
  /**
    * The attributes of the task
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * The availability zone of the task.
    */
  var availabilityZone: js.UndefOr[String] = js.native
  /**
    * The capacity provider associated with the task.
    */
  var capacityProviderName: js.UndefOr[String] = js.native
  /**
    * The ARN of the cluster that hosts the task.
    */
  var clusterArn: js.UndefOr[String] = js.native
  /**
    * The connectivity status of a task.
    */
  var connectivity: js.UndefOr[Connectivity] = js.native
  /**
    * The Unix timestamp for when the task last went into CONNECTED status.
    */
  var connectivityAt: js.UndefOr[Timestamp] = js.native
  /**
    * The ARN of the container instances that host the task.
    */
  var containerInstanceArn: js.UndefOr[String] = js.native
  /**
    * The containers associated with the task.
    */
  var containers: js.UndefOr[Containers] = js.native
  /**
    * The number of CPU units used by the task as expressed in a task definition. It can be expressed as an integer using CPU units, for example 1024. It can also be expressed as a string using vCPUs, for example 1 vCPU or 1 vcpu. String values are converted to an integer indicating the CPU units when the task definition is registered. If you are using the EC2 launch type, this field is optional. Supported values are between 128 CPU units (0.125 vCPUs) and 10240 CPU units (10 vCPUs). If you are using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of supported values for the memory parameter:   256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)   512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)   1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)   2048 (2 vCPU) - Available memory values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB)   4096 (4 vCPU) - Available memory values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB)  
    */
  var cpu: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the task was created (the task entered the PENDING state).
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  /**
    * The desired status of the task. For more information, see Task Lifecycle.
    */
  var desiredStatus: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the task execution stopped.
    */
  var executionStoppedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the task group associated with the task.
    */
  var group: js.UndefOr[String] = js.native
  /**
    * The health status for the task, which is determined by the health of the essential containers in the task. If all essential containers in the task are reporting as HEALTHY, then the task status also reports as HEALTHY. If any essential containers in the task are reporting as UNHEALTHY or UNKNOWN, then the task status also reports as UNHEALTHY or UNKNOWN, accordingly.  The Amazon ECS container agent does not monitor or report on Docker health checks that are embedded in a container image (such as those specified in a parent image or from the image's Dockerfile) and not specified in the container definition. Health check parameters that are specified in a container definition override any Docker health checks that exist in the container image. 
    */
  var healthStatus: js.UndefOr[HealthStatus] = js.native
  /**
    * The Elastic Inference accelerator associated with the task.
    */
  var inferenceAccelerators: js.UndefOr[InferenceAccelerators] = js.native
  /**
    * The last known status of the task. For more information, see Task Lifecycle.
    */
  var lastStatus: js.UndefOr[String] = js.native
  /**
    * The launch type on which your task is running. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  /**
    * The amount of memory (in MiB) used by the task as expressed in a task definition. It can be expressed as an integer using MiB, for example 1024. It can also be expressed as a string using GB, for example 1GB or 1 GB. String values are converted to an integer indicating the MiB when the task definition is registered. If you are using the EC2 launch type, this field is optional. If you are using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of supported values for the cpu parameter:   512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)   1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)   2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available cpu values: 1024 (1 vCPU)   Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values: 2048 (2 vCPU)   Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values: 4096 (4 vCPU)  
    */
  var memory: js.UndefOr[String] = js.native
  /**
    * One or more container overrides.
    */
  var overrides: js.UndefOr[TaskOverride] = js.native
  /**
    * The platform version on which your task is running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the container image pull began.
    */
  var pullStartedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The Unix timestamp for when the container image pull completed.
    */
  var pullStoppedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The Unix timestamp for when the task started (the task transitioned from the PENDING state to the RUNNING state).
    */
  var startedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The tag specified when a task is started. If the task is started by an Amazon ECS service, then the startedBy parameter contains the deployment ID of the service that starts it.
    */
  var startedBy: js.UndefOr[String] = js.native
  /**
    * The stop code indicating why a task was stopped. The stoppedReason may contain additional details.
    */
  var stopCode: js.UndefOr[TaskStopCode] = js.native
  /**
    * The Unix timestamp for when the task was stopped (the task transitioned from the RUNNING state to the STOPPED state).
    */
  var stoppedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The reason that the task was stopped.
    */
  var stoppedReason: js.UndefOr[String] = js.native
  /**
    * The Unix timestamp for when the task stops (transitions from the RUNNING state to STOPPED).
    */
  var stoppingAt: js.UndefOr[Timestamp] = js.native
  /**
    * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task.
    */
  var taskArn: js.UndefOr[String] = js.native
  /**
    * The ARN of the task definition that creates the task.
    */
  var taskDefinitionArn: js.UndefOr[String] = js.native
  /**
    * The version counter for the task. Every time a task experiences a change that triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS task state with CloudWatch Events, you can compare the version of a task reported by the Amazon ECS API actions with the version reported in CloudWatch Events for the task (inside the detail object) to verify that the version in your event stream is current.
    */
  var version: js.UndefOr[Long] = js.native
}

object Task {
  @scala.inline
  def apply(): Task = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Task]
  }
  @scala.inline
  implicit class TaskOps[Self <: Task] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = this.set("attachments", js.Array(value :_*))
    @scala.inline
    def setAttachments(value: Attachments): Self = this.set("attachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: Attributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setCapacityProviderName(value: String): Self = this.set("capacityProviderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityProviderName: Self = this.set("capacityProviderName", js.undefined)
    @scala.inline
    def setClusterArn(value: String): Self = this.set("clusterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterArn: Self = this.set("clusterArn", js.undefined)
    @scala.inline
    def setConnectivity(value: Connectivity): Self = this.set("connectivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectivity: Self = this.set("connectivity", js.undefined)
    @scala.inline
    def setConnectivityAt(value: Timestamp): Self = this.set("connectivityAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectivityAt: Self = this.set("connectivityAt", js.undefined)
    @scala.inline
    def setContainerInstanceArn(value: String): Self = this.set("containerInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerInstanceArn: Self = this.set("containerInstanceArn", js.undefined)
    @scala.inline
    def setContainersVarargs(value: Container*): Self = this.set("containers", js.Array(value :_*))
    @scala.inline
    def setContainers(value: Containers): Self = this.set("containers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainers: Self = this.set("containers", js.undefined)
    @scala.inline
    def setCpu(value: String): Self = this.set("cpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setDesiredStatus(value: String): Self = this.set("desiredStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredStatus: Self = this.set("desiredStatus", js.undefined)
    @scala.inline
    def setExecutionStoppedAt(value: Timestamp): Self = this.set("executionStoppedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionStoppedAt: Self = this.set("executionStoppedAt", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHealthStatus(value: HealthStatus): Self = this.set("healthStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthStatus: Self = this.set("healthStatus", js.undefined)
    @scala.inline
    def setInferenceAcceleratorsVarargs(value: InferenceAccelerator*): Self = this.set("inferenceAccelerators", js.Array(value :_*))
    @scala.inline
    def setInferenceAccelerators(value: InferenceAccelerators): Self = this.set("inferenceAccelerators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInferenceAccelerators: Self = this.set("inferenceAccelerators", js.undefined)
    @scala.inline
    def setLastStatus(value: String): Self = this.set("lastStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStatus: Self = this.set("lastStatus", js.undefined)
    @scala.inline
    def setLaunchType(value: LaunchType): Self = this.set("launchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchType: Self = this.set("launchType", js.undefined)
    @scala.inline
    def setMemory(value: String): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    @scala.inline
    def setOverrides(value: TaskOverride): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    @scala.inline
    def setPullStartedAt(value: Timestamp): Self = this.set("pullStartedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullStartedAt: Self = this.set("pullStartedAt", js.undefined)
    @scala.inline
    def setPullStoppedAt(value: Timestamp): Self = this.set("pullStoppedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePullStoppedAt: Self = this.set("pullStoppedAt", js.undefined)
    @scala.inline
    def setStartedAt(value: Timestamp): Self = this.set("startedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedAt: Self = this.set("startedAt", js.undefined)
    @scala.inline
    def setStartedBy(value: String): Self = this.set("startedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartedBy: Self = this.set("startedBy", js.undefined)
    @scala.inline
    def setStopCode(value: TaskStopCode): Self = this.set("stopCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopCode: Self = this.set("stopCode", js.undefined)
    @scala.inline
    def setStoppedAt(value: Timestamp): Self = this.set("stoppedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoppedAt: Self = this.set("stoppedAt", js.undefined)
    @scala.inline
    def setStoppedReason(value: String): Self = this.set("stoppedReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoppedReason: Self = this.set("stoppedReason", js.undefined)
    @scala.inline
    def setStoppingAt(value: Timestamp): Self = this.set("stoppingAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoppingAt: Self = this.set("stoppingAt", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTaskArn(value: String): Self = this.set("taskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskArn: Self = this.set("taskArn", js.undefined)
    @scala.inline
    def setTaskDefinitionArn(value: String): Self = this.set("taskDefinitionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskDefinitionArn: Self = this.set("taskDefinitionArn", js.undefined)
    @scala.inline
    def setVersion(value: Long): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

