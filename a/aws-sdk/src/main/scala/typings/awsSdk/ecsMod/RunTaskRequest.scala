package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunTaskRequest extends StObject {
  
  /**
    * The capacity provider strategy to use for the task. A capacity provider strategy consists of one or more capacity providers along with the base and weight to assign to them. A capacity provider must be associated with the cluster to be used in a capacity provider strategy. The PutClusterCapacityProviders API is used to associate a capacity provider with a cluster. Only capacity providers with an ACTIVE or UPDATING status can be used. If a capacityProviderStrategy is specified, the launchType parameter must be omitted. If no capacityProviderStrategy or launchType is specified, the defaultCapacityProviderStrategy for the cluster is used. If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created. New capacity providers can be created with the CreateCapacityProvider API operation. To use a AWS Fargate capacity provider, specify either the FARGATE or FARGATE_SPOT capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be associated with a cluster to be used. The PutClusterCapacityProviders API operation is used to update the list of available capacity providers for a cluster after the cluster is created.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.undefined
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * The number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks per call.
    */
  var count: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see Tagging Your Amazon ECS Resources in the Amazon Elastic Container Service Developer Guide.
    */
  var enableECSManagedTags: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the task group to associate with the task. The default value is the family name of the task definition (for example, family:my-family-name).
    */
  var group: js.UndefOr[String] = js.undefined
  
  /**
    * The launch type on which to run your task. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide. If a launchType is specified, the capacityProviderStrategy parameter must be omitted.
    */
  var launchType: js.UndefOr[LaunchType] = js.undefined
  
  /**
    * The network configuration for the task. This parameter is required for task definitions that use the awsvpc network mode to receive their own elastic network interface, and it is not supported for other network modes. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.undefined
  
  /**
    * A list of container overrides in JSON format that specify the name of a container in the specified task definition and the overrides it should receive. You can override the default command for a container (that is specified in the task definition or Docker image) with a command override. You can also override existing environment variables (that are specified in the task definition or Docker image) on a container or add new environment variables to it with an environment override.  A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the override structure. 
    */
  var overrides: js.UndefOr[TaskOverride] = js.undefined
  
  /**
    * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task (including constraints in the task definition and those specified at runtime).
    */
  var placementConstraints: js.UndefOr[PlacementConstraints] = js.undefined
  
  /**
    * The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
    */
  var placementStrategy: js.UndefOr[PlacementStrategies] = js.undefined
  
  /**
    * The platform version the task should run. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after task creation, use the TagResource API action.  An error will be received if you specify the SERVICE option when running a task. 
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
    * The family and revision (family:revision) or full ARN of the task definition to run. If a revision is not specified, the latest ACTIVE revision is used.
    */
  var taskDefinition: String
}
object RunTaskRequest {
  
  @scala.inline
  def apply(taskDefinition: String): RunTaskRequest = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunTaskRequest]
  }
  
  @scala.inline
  implicit class RunTaskRequestMutableBuilder[Self <: RunTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "capacityProviderStrategy", js.undefined)
    
    @scala.inline
    def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "capacityProviderStrategy", js.Array(value :_*))
    
    @scala.inline
    def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    @scala.inline
    def setCount(value: BoxedInteger): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setEnableECSManagedTags(value: Boolean): Self = StObject.set(x, "enableECSManagedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableECSManagedTagsUndefined: Self = StObject.set(x, "enableECSManagedTags", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    @scala.inline
    def setOverrides(value: TaskOverride): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setPlacementConstraints(value: PlacementConstraints): Self = StObject.set(x, "placementConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementConstraintsUndefined: Self = StObject.set(x, "placementConstraints", js.undefined)
    
    @scala.inline
    def setPlacementConstraintsVarargs(value: PlacementConstraint*): Self = StObject.set(x, "placementConstraints", js.Array(value :_*))
    
    @scala.inline
    def setPlacementStrategy(value: PlacementStrategies): Self = StObject.set(x, "placementStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementStrategyUndefined: Self = StObject.set(x, "placementStrategy", js.undefined)
    
    @scala.inline
    def setPlacementStrategyVarargs(value: PlacementStrategy*): Self = StObject.set(x, "placementStrategy", js.Array(value :_*))
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
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
