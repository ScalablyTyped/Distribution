package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerInstance extends js.Object {
  
  /**
    * This parameter returns true if the agent is connected to Amazon ECS. Registered instances with an agent that may be unhealthy or stopped return false. Only instances connected to an agent can accept placement requests.
    */
  var agentConnected: js.UndefOr[Boolean] = js.native
  
  /**
    * The status of the most recent agent update. If an update has never been requested, this value is NULL.
    */
  var agentUpdateStatus: js.UndefOr[AgentUpdateStatus] = js.native
  
  /**
    * The resources attached to a container instance, such as elastic network interfaces.
    */
  var attachments: js.UndefOr[Attachments] = js.native
  
  /**
    * The attributes set for the container instance, either by the Amazon ECS container agent at instance registration or manually with the PutAttributes operation.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  
  /**
    * The capacity provider associated with the container instance.
    */
  var capacityProviderName: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the container instance. The ARN contains the arn:aws:ecs namespace, followed by the Region of the container instance, the AWS account ID of the container instance owner, the container-instance namespace, and then the container instance ID. For example, arn:aws:ecs:region:aws_account_id:container-instance/container_instance_ID.
    */
  var containerInstanceArn: js.UndefOr[String] = js.native
  
  /**
    * The EC2 instance ID of the container instance.
    */
  var ec2InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The number of tasks on the container instance that are in the PENDING status.
    */
  var pendingTasksCount: js.UndefOr[Integer] = js.native
  
  /**
    * The Unix timestamp for when the container instance was registered.
    */
  var registeredAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * For CPU and memory resource types, this parameter describes the amount of each resource that was available on the container instance when the container agent registered it with Amazon ECS. This value represents the total amount of CPU and memory that can be allocated on this container instance to tasks. For port resource types, this parameter describes the ports that were reserved by the Amazon ECS container agent when it registered the container instance with Amazon ECS.
    */
  var registeredResources: js.UndefOr[Resources] = js.native
  
  /**
    * For CPU and memory resource types, this parameter describes the remaining CPU and memory that has not already been allocated to tasks and is therefore available for new tasks. For port resource types, this parameter describes the ports that were reserved by the Amazon ECS container agent (at instance registration time) and any task containers that have reserved port mappings on the host (with the host or bridge network mode). Any port that is not specified here is available for new tasks.
    */
  var remainingResources: js.UndefOr[Resources] = js.native
  
  /**
    * The number of tasks on the container instance that are in the RUNNING status.
    */
  var runningTasksCount: js.UndefOr[Integer] = js.native
  
  /**
    * The status of the container instance. The valid values are REGISTERING, REGISTRATION_FAILED, ACTIVE, INACTIVE, DEREGISTERING, or DRAINING. If your account has opted in to the awsvpcTrunking account setting, then any newly registered container instance will transition to a REGISTERING status while the trunk elastic network interface is provisioned for the instance. If the registration fails, the instance will transition to a REGISTRATION_FAILED status. You can describe the container instance and see the reason for failure in the statusReason parameter. Once the container instance is terminated, the instance transitions to a DEREGISTERING status while the trunk elastic network interface is deprovisioned. The instance then transitions to an INACTIVE status. The ACTIVE status indicates that the container instance can accept tasks. The DRAINING indicates that new tasks are not placed on the container instance and any service tasks running on the container instance are removed if possible. For more information, see Container Instance Draining in the Amazon Elastic Container Service Developer Guide.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The reason that the container instance reached its current status.
    */
  var statusReason: js.UndefOr[String] = js.native
  
  /**
    * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  
  /**
    * The version counter for the container instance. Every time a container instance experiences a change that triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS container instance state with CloudWatch Events, you can compare the version of a container instance reported by the Amazon ECS APIs with the version reported in CloudWatch Events for the container instance (inside the detail object) to verify that the version in your event stream is current.
    */
  var version: js.UndefOr[Long] = js.native
  
  /**
    * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
    */
  var versionInfo: js.UndefOr[VersionInfo] = js.native
}
object ContainerInstance {
  
  @scala.inline
  def apply(): ContainerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerInstance]
  }
  
  @scala.inline
  implicit class ContainerInstanceOps[Self <: ContainerInstance] (val x: Self) extends AnyVal {
    
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
    def setAgentConnected(value: Boolean): Self = this.set("agentConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentConnected: Self = this.set("agentConnected", js.undefined)
    
    @scala.inline
    def setAgentUpdateStatus(value: AgentUpdateStatus): Self = this.set("agentUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentUpdateStatus: Self = this.set("agentUpdateStatus", js.undefined)
    
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
    def setCapacityProviderName(value: String): Self = this.set("capacityProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityProviderName: Self = this.set("capacityProviderName", js.undefined)
    
    @scala.inline
    def setContainerInstanceArn(value: String): Self = this.set("containerInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerInstanceArn: Self = this.set("containerInstanceArn", js.undefined)
    
    @scala.inline
    def setEc2InstanceId(value: String): Self = this.set("ec2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEc2InstanceId: Self = this.set("ec2InstanceId", js.undefined)
    
    @scala.inline
    def setPendingTasksCount(value: Integer): Self = this.set("pendingTasksCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingTasksCount: Self = this.set("pendingTasksCount", js.undefined)
    
    @scala.inline
    def setRegisteredAt(value: Timestamp): Self = this.set("registeredAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisteredAt: Self = this.set("registeredAt", js.undefined)
    
    @scala.inline
    def setRegisteredResourcesVarargs(value: Resource*): Self = this.set("registeredResources", js.Array(value :_*))
    
    @scala.inline
    def setRegisteredResources(value: Resources): Self = this.set("registeredResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegisteredResources: Self = this.set("registeredResources", js.undefined)
    
    @scala.inline
    def setRemainingResourcesVarargs(value: Resource*): Self = this.set("remainingResources", js.Array(value :_*))
    
    @scala.inline
    def setRemainingResources(value: Resources): Self = this.set("remainingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemainingResources: Self = this.set("remainingResources", js.undefined)
    
    @scala.inline
    def setRunningTasksCount(value: Integer): Self = this.set("runningTasksCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunningTasksCount: Self = this.set("runningTasksCount", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusReason(value: String): Self = this.set("statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusReason: Self = this.set("statusReason", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersion(value: Long): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVersionInfo(value: VersionInfo): Self = this.set("versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionInfo: Self = this.set("versionInfo", js.undefined)
  }
}
