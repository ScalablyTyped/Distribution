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
  def apply(
    attachments: Attachments = null,
    attributes: Attributes = null,
    availabilityZone: String = null,
    capacityProviderName: String = null,
    clusterArn: String = null,
    connectivity: Connectivity = null,
    connectivityAt: Timestamp = null,
    containerInstanceArn: String = null,
    containers: Containers = null,
    cpu: String = null,
    createdAt: Timestamp = null,
    desiredStatus: String = null,
    executionStoppedAt: Timestamp = null,
    group: String = null,
    healthStatus: HealthStatus = null,
    inferenceAccelerators: InferenceAccelerators = null,
    lastStatus: String = null,
    launchType: LaunchType = null,
    memory: String = null,
    overrides: TaskOverride = null,
    platformVersion: String = null,
    pullStartedAt: Timestamp = null,
    pullStoppedAt: Timestamp = null,
    startedAt: Timestamp = null,
    startedBy: String = null,
    stopCode: TaskStopCode = null,
    stoppedAt: Timestamp = null,
    stoppedReason: String = null,
    stoppingAt: Timestamp = null,
    tags: Tags = null,
    taskArn: String = null,
    taskDefinitionArn: String = null,
    version: js.UndefOr[Long] = js.undefined
  ): Task = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (capacityProviderName != null) __obj.updateDynamic("capacityProviderName")(capacityProviderName.asInstanceOf[js.Any])
    if (clusterArn != null) __obj.updateDynamic("clusterArn")(clusterArn.asInstanceOf[js.Any])
    if (connectivity != null) __obj.updateDynamic("connectivity")(connectivity.asInstanceOf[js.Any])
    if (connectivityAt != null) __obj.updateDynamic("connectivityAt")(connectivityAt.asInstanceOf[js.Any])
    if (containerInstanceArn != null) __obj.updateDynamic("containerInstanceArn")(containerInstanceArn.asInstanceOf[js.Any])
    if (containers != null) __obj.updateDynamic("containers")(containers.asInstanceOf[js.Any])
    if (cpu != null) __obj.updateDynamic("cpu")(cpu.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (desiredStatus != null) __obj.updateDynamic("desiredStatus")(desiredStatus.asInstanceOf[js.Any])
    if (executionStoppedAt != null) __obj.updateDynamic("executionStoppedAt")(executionStoppedAt.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (healthStatus != null) __obj.updateDynamic("healthStatus")(healthStatus.asInstanceOf[js.Any])
    if (inferenceAccelerators != null) __obj.updateDynamic("inferenceAccelerators")(inferenceAccelerators.asInstanceOf[js.Any])
    if (lastStatus != null) __obj.updateDynamic("lastStatus")(lastStatus.asInstanceOf[js.Any])
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (memory != null) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (pullStartedAt != null) __obj.updateDynamic("pullStartedAt")(pullStartedAt.asInstanceOf[js.Any])
    if (pullStoppedAt != null) __obj.updateDynamic("pullStoppedAt")(pullStoppedAt.asInstanceOf[js.Any])
    if (startedAt != null) __obj.updateDynamic("startedAt")(startedAt.asInstanceOf[js.Any])
    if (startedBy != null) __obj.updateDynamic("startedBy")(startedBy.asInstanceOf[js.Any])
    if (stopCode != null) __obj.updateDynamic("stopCode")(stopCode.asInstanceOf[js.Any])
    if (stoppedAt != null) __obj.updateDynamic("stoppedAt")(stoppedAt.asInstanceOf[js.Any])
    if (stoppedReason != null) __obj.updateDynamic("stoppedReason")(stoppedReason.asInstanceOf[js.Any])
    if (stoppingAt != null) __obj.updateDynamic("stoppingAt")(stoppingAt.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (taskArn != null) __obj.updateDynamic("taskArn")(taskArn.asInstanceOf[js.Any])
    if (taskDefinitionArn != null) __obj.updateDynamic("taskDefinitionArn")(taskDefinitionArn.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}

