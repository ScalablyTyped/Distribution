package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTaskRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster on which to start your task. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * The container instance IDs or full ARN entries for the container instances on which you would like to place your task. You can specify up to 10 container instances.
    */
  var containerInstances: StringList
  
  /**
    * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see Tagging Your Amazon ECS Resources in the Amazon Elastic Container Service Developer Guide.
    */
  var enableECSManagedTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the task group to associate with the task. The default value is the family name of the task definition (for example, family:my-family-name).
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by using the awsvpc networking mode.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * A list of container overrides in JSON format that specify the name of a container in the specified task definition and the overrides it should receive. You can override the default command for a container (that is specified in the task definition or Docker image) with a command override. You can also override existing environment variables (that are specified in the task definition or Docker image) on a container or add new environment variables to it with an environment override.  A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the override structure. 
    */
  var overrides: js.UndefOr[TaskOverride] = js.undefined
  
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the task. If no value is specified, the tags are not propagated.
    */
  var propagateTags: js.UndefOr[PropagateTags] = js.undefined
  
  /**
    * The reference ID to use for the task.
    */
  var referenceId: js.UndefOr[String] = js.undefined
  
  /**
    * An optional tag specified when a task is started. For example, if you automatically trigger a task to run a batch process job, you could apply a unique identifier for that job to your task with the startedBy parameter. You can then identify which tasks belong to that job by filtering the results of a ListTasks call with the startedBy value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed. If a task is started by an Amazon ECS service, then the startedBy parameter contains the deployment ID of the service that starts it.
    */
  var startedBy: js.UndefOr[String] = js.undefined
  
  /**
    * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * The family and revision (family:revision) or full ARN of the task definition to start. If a revision is not specified, the latest ACTIVE revision is used.
    */
  var taskDefinition: String
}
object StartTaskRequest {
  
  @scala.inline
  def apply(containerInstances: StringList, taskDefinition: String): StartTaskRequest = {
    val __obj = js.Dynamic.literal(containerInstances = containerInstances.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTaskRequest]
  }
  
  @scala.inline
  implicit class StartTaskRequestMutableBuilder[Self <: StartTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setContainerInstances(value: StringList): Self = StObject.set(x, "containerInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerInstancesVarargs(value: String*): Self = StObject.set(x, "containerInstances", js.Array(value :_*))
    
    @scala.inline
    def setEnableECSManagedTags(value: Boolean): Self = StObject.set(x, "enableECSManagedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableECSManagedTagsUndefined: Self = StObject.set(x, "enableECSManagedTags", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    @scala.inline
    def setOverrides(value: TaskOverride): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPropagateTags(value: PropagateTags): Self = StObject.set(x, "propagateTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropagateTagsUndefined: Self = StObject.set(x, "propagateTags", js.undefined)
    
    @scala.inline
    def setReferenceId(value: String): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceIdUndefined: Self = StObject.set(x, "referenceId", js.undefined)
    
    @scala.inline
    def setStartedBy(value: String): Self = StObject.set(x, "startedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedByUndefined: Self = StObject.set(x, "startedBy", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
  }
}
