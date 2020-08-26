package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinition extends js.Object {
  /**
    * The launch type to use with your task. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var compatibilities: js.UndefOr[CompatibilityList] = js.native
  /**
    * A list of container definitions in JSON format that describe the different containers that make up your task. For more information about container definition parameters and defaults, see Amazon ECS Task Definitions in the Amazon Elastic Container Service Developer Guide.
    */
  var containerDefinitions: js.UndefOr[ContainerDefinitions] = js.native
  /**
    * The number of cpu units used by the task. If you are using the EC2 launch type, this field is optional and any value can be used. If you are using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of valid values for the memory parameter:   256 (.25 vCPU) - Available memory values: 512 (0.5 GB), 1024 (1 GB), 2048 (2 GB)   512 (.5 vCPU) - Available memory values: 1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB)   1024 (1 vCPU) - Available memory values: 2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB)   2048 (2 vCPU) - Available memory values: Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB)   4096 (4 vCPU) - Available memory values: Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB)  
    */
  var cpu: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the task execution role that grants the Amazon ECS container agent permission to make AWS API calls on your behalf. The task execution IAM role is required depending on the requirements of your task. For more information, see Amazon ECS task execution IAM role in the Amazon Elastic Container Service Developer Guide.
    */
  var executionRoleArn: js.UndefOr[String] = js.native
  /**
    * The name of a family that this task definition is registered to. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. A family groups multiple versions of a task definition. Amazon ECS gives the first task definition that you registered to a family a revision number of 1. Amazon ECS gives sequential revision numbers to each task definition that you add.
    */
  var family: js.UndefOr[String] = js.native
  /**
    * The Elastic Inference accelerator associated with the task.
    */
  var inferenceAccelerators: js.UndefOr[InferenceAccelerators] = js.native
  /**
    * The IPC resource namespace to use for the containers in the task. The valid values are host, task, or none. If host is specified, then all containers within the tasks that specified the host IPC mode on the same container instance share the same IPC resources with the host Amazon EC2 instance. If task is specified, all containers within the specified task share the same IPC resources. If none is specified, then IPC resources within the containers of a task are private and not shared with other containers in a task or on the container instance. If no value is specified, then the IPC resource namespace sharing depends on the Docker daemon setting on the container instance. For more information, see IPC settings in the Docker run reference. If the host IPC mode is used, be aware that there is a heightened risk of undesired IPC namespace expose. For more information, see Docker security. If you are setting namespaced kernel parameters using systemControls for the containers in the task, the following will apply to your IPC resource namespace. For more information, see System Controls in the Amazon Elastic Container Service Developer Guide.   For tasks that use the host IPC mode, IPC namespace related systemControls are not supported.   For tasks that use the task IPC mode, IPC namespace related systemControls will apply to all containers within a task.    This parameter is not supported for Windows containers or tasks using the Fargate launch type. 
    */
  var ipcMode: js.UndefOr[IpcMode] = js.native
  /**
    * The amount (in MiB) of memory used by the task. If using the EC2 launch type, this field is optional and any value can be used. If a task-level memory value is specified then the container-level memory value is optional. If using the Fargate launch type, this field is required and you must use one of the following values, which determines your range of valid values for the cpu parameter:   512 (0.5 GB), 1024 (1 GB), 2048 (2 GB) - Available cpu values: 256 (.25 vCPU)   1024 (1 GB), 2048 (2 GB), 3072 (3 GB), 4096 (4 GB) - Available cpu values: 512 (.5 vCPU)   2048 (2 GB), 3072 (3 GB), 4096 (4 GB), 5120 (5 GB), 6144 (6 GB), 7168 (7 GB), 8192 (8 GB) - Available cpu values: 1024 (1 vCPU)   Between 4096 (4 GB) and 16384 (16 GB) in increments of 1024 (1 GB) - Available cpu values: 2048 (2 vCPU)   Between 8192 (8 GB) and 30720 (30 GB) in increments of 1024 (1 GB) - Available cpu values: 4096 (4 vCPU)  
    */
  var memory: js.UndefOr[String] = js.native
  /**
    * The Docker networking mode to use for the containers in the task. The valid values are none, bridge, awsvpc, and host. The default Docker network mode is bridge. If you are using the Fargate launch type, the awsvpc network mode is required. If you are using the EC2 launch type, any network mode can be used. If the network mode is set to none, you cannot specify port mappings in your container definitions, and the tasks containers do not have external connectivity. The host and awsvpc network modes offer the highest networking performance for containers because they use the EC2 network stack instead of the virtualized network stack provided by the bridge mode. With the host and awsvpc network modes, exposed container ports are mapped directly to the corresponding host port (for the host network mode) or the attached elastic network interface port (for the awsvpc network mode), so you cannot take advantage of dynamic host port mappings.  If the network mode is awsvpc, the task is allocated an elastic network interface, and you must specify a NetworkConfiguration value when you create a service or run a task with the task definition. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide.  Currently, only Amazon ECS-optimized AMIs, other Amazon Linux variants with the ecs-init package, or AWS Fargate infrastructure support the awsvpc network mode.   If the network mode is host, you cannot run multiple instantiations of the same task on a single container instance when port mappings are used. Docker for Windows uses different network modes than Docker for Linux. When you register a task definition with Windows containers, you must not specify a network mode. If you use the console to register a task definition with Windows containers, you must choose the &lt;default&gt; network mode object.  For more information, see Network settings in the Docker run reference.
    */
  var networkMode: js.UndefOr[NetworkMode] = js.native
  /**
    * The process namespace to use for the containers in the task. The valid values are host or task. If host is specified, then all containers within the tasks that specified the host PID mode on the same container instance share the same process namespace with the host Amazon EC2 instance. If task is specified, all containers within the specified task share the same process namespace. If no value is specified, the default is a private namespace. For more information, see PID settings in the Docker run reference. If the host PID mode is used, be aware that there is a heightened risk of undesired process namespace expose. For more information, see Docker security.  This parameter is not supported for Windows containers or tasks using the Fargate launch type. 
    */
  var pidMode: js.UndefOr[PidMode] = js.native
  /**
    * An array of placement constraint objects to use for tasks. This field is not valid if you are using the Fargate launch type for your task.
    */
  var placementConstraints: js.UndefOr[TaskDefinitionPlacementConstraints] = js.native
  /**
    * The configuration details for the App Mesh proxy. Your Amazon ECS container instances require at least version 1.26.0 of the container agent and at least version 1.26.0-1 of the ecs-init package to enable a proxy configuration. If your container instances are launched from the Amazon ECS-optimized AMI version 20190301 or later, then they contain the required versions of the container agent and ecs-init. For more information, see Amazon ECS-optimized Linux AMI in the Amazon Elastic Container Service Developer Guide.
    */
  var proxyConfiguration: js.UndefOr[ProxyConfiguration] = js.native
  /**
    * The container instance attributes required by your task. This field is not valid if you are using the Fargate launch type for your task.
    */
  var requiresAttributes: js.UndefOr[RequiresAttributes] = js.native
  /**
    * The launch type the task requires. If no value is specified, it will default to EC2. Valid values include EC2 and FARGATE.
    */
  var requiresCompatibilities: js.UndefOr[CompatibilityList] = js.native
  /**
    * The revision of the task in a particular family. The revision is a version number of a task definition in a family. When you register a task definition for the first time, the revision is 1. Each time that you register a new revision of a task definition in the same family, the revision value always increases by one, even if you have deregistered previous revisions in this family.
    */
  var revision: js.UndefOr[Integer] = js.native
  /**
    * The status of the task definition.
    */
  var status: js.UndefOr[TaskDefinitionStatus] = js.native
  /**
    * The full Amazon Resource Name (ARN) of the task definition.
    */
  var taskDefinitionArn: js.UndefOr[String] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the AWS Identity and Access Management (IAM) role that grants containers in the task permission to call AWS APIs on your behalf. For more information, see Amazon ECS Task Role in the Amazon Elastic Container Service Developer Guide. IAM roles for tasks on Windows require that the -EnableTaskIAMRole option is set when you launch the Amazon ECS-optimized Windows AMI. Your containers must also run some configuration code in order to take advantage of the feature. For more information, see Windows IAM Roles for Tasks in the Amazon Elastic Container Service Developer Guide.
    */
  var taskRoleArn: js.UndefOr[String] = js.native
  /**
    * The list of volume definitions for the task. If your tasks are using the Fargate launch type, the host and sourcePath parameters are not supported. For more information about volume definition parameters and defaults, see Amazon ECS Task Definitions in the Amazon Elastic Container Service Developer Guide.
    */
  var volumes: js.UndefOr[VolumeList] = js.native
}

object TaskDefinition {
  @scala.inline
  def apply(): TaskDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskDefinition]
  }
  @scala.inline
  implicit class TaskDefinitionOps[Self <: TaskDefinition] (val x: Self) extends AnyVal {
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
    def setCompatibilitiesVarargs(value: Compatibility*): Self = this.set("compatibilities", js.Array(value :_*))
    @scala.inline
    def setCompatibilities(value: CompatibilityList): Self = this.set("compatibilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibilities: Self = this.set("compatibilities", js.undefined)
    @scala.inline
    def setContainerDefinitionsVarargs(value: ContainerDefinition*): Self = this.set("containerDefinitions", js.Array(value :_*))
    @scala.inline
    def setContainerDefinitions(value: ContainerDefinitions): Self = this.set("containerDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerDefinitions: Self = this.set("containerDefinitions", js.undefined)
    @scala.inline
    def setCpu(value: String): Self = this.set("cpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCpu: Self = this.set("cpu", js.undefined)
    @scala.inline
    def setExecutionRoleArn(value: String): Self = this.set("executionRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("executionRoleArn", js.undefined)
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setInferenceAcceleratorsVarargs(value: InferenceAccelerator*): Self = this.set("inferenceAccelerators", js.Array(value :_*))
    @scala.inline
    def setInferenceAccelerators(value: InferenceAccelerators): Self = this.set("inferenceAccelerators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInferenceAccelerators: Self = this.set("inferenceAccelerators", js.undefined)
    @scala.inline
    def setIpcMode(value: IpcMode): Self = this.set("ipcMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpcMode: Self = this.set("ipcMode", js.undefined)
    @scala.inline
    def setMemory(value: String): Self = this.set("memory", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
    @scala.inline
    def setNetworkMode(value: NetworkMode): Self = this.set("networkMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkMode: Self = this.set("networkMode", js.undefined)
    @scala.inline
    def setPidMode(value: PidMode): Self = this.set("pidMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePidMode: Self = this.set("pidMode", js.undefined)
    @scala.inline
    def setPlacementConstraintsVarargs(value: TaskDefinitionPlacementConstraint*): Self = this.set("placementConstraints", js.Array(value :_*))
    @scala.inline
    def setPlacementConstraints(value: TaskDefinitionPlacementConstraints): Self = this.set("placementConstraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementConstraints: Self = this.set("placementConstraints", js.undefined)
    @scala.inline
    def setProxyConfiguration(value: ProxyConfiguration): Self = this.set("proxyConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyConfiguration: Self = this.set("proxyConfiguration", js.undefined)
    @scala.inline
    def setRequiresAttributesVarargs(value: Attribute*): Self = this.set("requiresAttributes", js.Array(value :_*))
    @scala.inline
    def setRequiresAttributes(value: RequiresAttributes): Self = this.set("requiresAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiresAttributes: Self = this.set("requiresAttributes", js.undefined)
    @scala.inline
    def setRequiresCompatibilitiesVarargs(value: Compatibility*): Self = this.set("requiresCompatibilities", js.Array(value :_*))
    @scala.inline
    def setRequiresCompatibilities(value: CompatibilityList): Self = this.set("requiresCompatibilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiresCompatibilities: Self = this.set("requiresCompatibilities", js.undefined)
    @scala.inline
    def setRevision(value: Integer): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevision: Self = this.set("revision", js.undefined)
    @scala.inline
    def setStatus(value: TaskDefinitionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTaskDefinitionArn(value: String): Self = this.set("taskDefinitionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskDefinitionArn: Self = this.set("taskDefinitionArn", js.undefined)
    @scala.inline
    def setTaskRoleArn(value: String): Self = this.set("taskRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskRoleArn: Self = this.set("taskRoleArn", js.undefined)
    @scala.inline
    def setVolumesVarargs(value: Volume*): Self = this.set("volumes", js.Array(value :_*))
    @scala.inline
    def setVolumes(value: VolumeList): Self = this.set("volumes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumes: Self = this.set("volumes", js.undefined)
  }
  
}

