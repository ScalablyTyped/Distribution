package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerInstance extends StObject {
  
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
  implicit class ContainerInstanceMutableBuilder[Self <: ContainerInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentConnected(value: Boolean): Self = StObject.set(x, "agentConnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentConnectedUndefined: Self = StObject.set(x, "agentConnected", js.undefined)
    
    @scala.inline
    def setAgentUpdateStatus(value: AgentUpdateStatus): Self = StObject.set(x, "agentUpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUpdateStatusUndefined: Self = StObject.set(x, "agentUpdateStatus", js.undefined)
    
    @scala.inline
    def setAttachments(value: Attachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: Attachment*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: Attributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setCapacityProviderName(value: String): Self = StObject.set(x, "capacityProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProviderNameUndefined: Self = StObject.set(x, "capacityProviderName", js.undefined)
    
    @scala.inline
    def setContainerInstanceArn(value: String): Self = StObject.set(x, "containerInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInstanceArnUndefined: Self = StObject.set(x, "containerInstanceArn", js.undefined)
    
    @scala.inline
    def setEc2InstanceId(value: String): Self = StObject.set(x, "ec2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2InstanceIdUndefined: Self = StObject.set(x, "ec2InstanceId", js.undefined)
    
    @scala.inline
    def setPendingTasksCount(value: Integer): Self = StObject.set(x, "pendingTasksCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingTasksCountUndefined: Self = StObject.set(x, "pendingTasksCount", js.undefined)
    
    @scala.inline
    def setRegisteredAt(value: Timestamp): Self = StObject.set(x, "registeredAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredAtUndefined: Self = StObject.set(x, "registeredAt", js.undefined)
    
    @scala.inline
    def setRegisteredResources(value: Resources): Self = StObject.set(x, "registeredResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredResourcesUndefined: Self = StObject.set(x, "registeredResources", js.undefined)
    
    @scala.inline
    def setRegisteredResourcesVarargs(value: Resource*): Self = StObject.set(x, "registeredResources", js.Array(value :_*))
    
    @scala.inline
    def setRemainingResources(value: Resources): Self = StObject.set(x, "remainingResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingResourcesUndefined: Self = StObject.set(x, "remainingResources", js.undefined)
    
    @scala.inline
    def setRemainingResourcesVarargs(value: Resource*): Self = StObject.set(x, "remainingResources", js.Array(value :_*))
    
    @scala.inline
    def setRunningTasksCount(value: Integer): Self = StObject.set(x, "runningTasksCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningTasksCountUndefined: Self = StObject.set(x, "runningTasksCount", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Long): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionInfo(value: VersionInfo): Self = StObject.set(x, "versionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionInfoUndefined: Self = StObject.set(x, "versionInfo", js.undefined)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
