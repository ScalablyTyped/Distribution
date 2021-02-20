package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskSet extends StObject {
  
  /**
    * The capacity provider strategy associated with the task set.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the cluster that the service that hosts the task set exists in.
    */
  var clusterArn: js.UndefOr[String] = js.native
  
  /**
    * The computed desired count for the task set. This is calculated by multiplying the service's desiredCount by the task set's scale percentage. The result is always rounded up. For example, if the computed desired count is 1.2, it rounds up to 2 tasks.
    */
  var computedDesiredCount: js.UndefOr[Integer] = js.native
  
  /**
    * The Unix timestamp for when the task set was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The external ID associated with the task set. If a task set is created by an AWS CodeDeploy deployment, the externalId parameter contains the AWS CodeDeploy deployment ID. If a task set is created for an external deployment and is associated with a service discovery registry, the externalId parameter contains the ECS_TASK_SET_EXTERNAL_ID AWS Cloud Map attribute.
    */
  var externalId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the task set.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The launch type the tasks in the task set are using. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  
  /**
    * Details on a load balancer that is used with a task set.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.native
  
  /**
    * The network configuration for the task set.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  
  /**
    * The number of tasks in the task set that are in the PENDING status during a deployment. A task in the PENDING state is preparing to enter the RUNNING state. A task set enters the PENDING status when it launches for the first time or when it is restarted after being in the STOPPED state.
    */
  var pendingCount: js.UndefOr[Integer] = js.native
  
  /**
    * The platform version on which the tasks in the task set are running. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  
  /**
    * The number of tasks in the task set that are in the RUNNING status during a deployment. A task in the RUNNING state is running and ready for use.
    */
  var runningCount: js.UndefOr[Integer] = js.native
  
  /**
    * A floating-point percentage of the desired number of tasks to place and keep running in the task set.
    */
  var scale: js.UndefOr[Scale] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the service the task set exists in.
    */
  var serviceArn: js.UndefOr[String] = js.native
  
  /**
    * The details of the service discovery registries to assign to this task set. For more information, see Service Discovery.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.native
  
  /**
    * The stability status, which indicates whether the task set has reached a steady state. If the following conditions are met, the task set will be in STEADY_STATE:   The task runningCount is equal to the computedDesiredCount.   The pendingCount is 0.   There are no tasks running on container instances in the DRAINING status.   All tasks are reporting a healthy status from the load balancers, service discovery, and container health checks.   If any of those conditions are not met, the stability status returns STABILIZING.
    */
  var stabilityStatus: js.UndefOr[StabilityStatus] = js.native
  
  /**
    * The Unix timestamp for when the task set stability status was retrieved.
    */
  var stabilityStatusAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The tag specified when a task set is started. If the task set is created by an AWS CodeDeploy deployment, the startedBy parameter is CODE_DEPLOY. For a task set created for an external deployment, the startedBy field isn't used.
    */
  var startedBy: js.UndefOr[String] = js.native
  
  /**
    * The status of the task set. The following describes each state:  PRIMARY  The task set is serving production traffic.  ACTIVE  The task set is not serving production traffic.  DRAINING  The tasks in the task set are being stopped and their corresponding targets are being deregistered from their target group.  
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The metadata that you apply to the task set to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  
  /**
    * The task definition the task set is using.
    */
  var taskDefinition: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the task set.
    */
  var taskSetArn: js.UndefOr[String] = js.native
  
  /**
    * The Unix timestamp for when the task set was last updated.
    */
  var updatedAt: js.UndefOr[Timestamp] = js.native
}
object TaskSet {
  
  @scala.inline
  def apply(): TaskSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskSet]
  }
  
  @scala.inline
  implicit class TaskSetMutableBuilder[Self <: TaskSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = StObject.set(x, "capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityProviderStrategyUndefined: Self = StObject.set(x, "capacityProviderStrategy", js.undefined)
    
    @scala.inline
    def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = StObject.set(x, "capacityProviderStrategy", js.Array(value :_*))
    
    @scala.inline
    def setClusterArn(value: String): Self = StObject.set(x, "clusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterArnUndefined: Self = StObject.set(x, "clusterArn", js.undefined)
    
    @scala.inline
    def setComputedDesiredCount(value: Integer): Self = StObject.set(x, "computedDesiredCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedDesiredCountUndefined: Self = StObject.set(x, "computedDesiredCount", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLaunchType(value: LaunchType): Self = StObject.set(x, "launchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTypeUndefined: Self = StObject.set(x, "launchType", js.undefined)
    
    @scala.inline
    def setLoadBalancers(value: LoadBalancers): Self = StObject.set(x, "loadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancersUndefined: Self = StObject.set(x, "loadBalancers", js.undefined)
    
    @scala.inline
    def setLoadBalancersVarargs(value: LoadBalancer*): Self = StObject.set(x, "loadBalancers", js.Array(value :_*))
    
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = StObject.set(x, "networkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkConfigurationUndefined: Self = StObject.set(x, "networkConfiguration", js.undefined)
    
    @scala.inline
    def setPendingCount(value: Integer): Self = StObject.set(x, "pendingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingCountUndefined: Self = StObject.set(x, "pendingCount", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = StObject.set(x, "platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformVersionUndefined: Self = StObject.set(x, "platformVersion", js.undefined)
    
    @scala.inline
    def setRunningCount(value: Integer): Self = StObject.set(x, "runningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunningCountUndefined: Self = StObject.set(x, "runningCount", js.undefined)
    
    @scala.inline
    def setScale(value: Scale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setServiceArn(value: String): Self = StObject.set(x, "serviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceArnUndefined: Self = StObject.set(x, "serviceArn", js.undefined)
    
    @scala.inline
    def setServiceRegistries(value: ServiceRegistries): Self = StObject.set(x, "serviceRegistries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRegistriesUndefined: Self = StObject.set(x, "serviceRegistries", js.undefined)
    
    @scala.inline
    def setServiceRegistriesVarargs(value: ServiceRegistry*): Self = StObject.set(x, "serviceRegistries", js.Array(value :_*))
    
    @scala.inline
    def setStabilityStatus(value: StabilityStatus): Self = StObject.set(x, "stabilityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStabilityStatusAt(value: Timestamp): Self = StObject.set(x, "stabilityStatusAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStabilityStatusAtUndefined: Self = StObject.set(x, "stabilityStatusAt", js.undefined)
    
    @scala.inline
    def setStabilityStatusUndefined: Self = StObject.set(x, "stabilityStatus", js.undefined)
    
    @scala.inline
    def setStartedBy(value: String): Self = StObject.set(x, "startedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedByUndefined: Self = StObject.set(x, "startedBy", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskDefinitionUndefined: Self = StObject.set(x, "taskDefinition", js.undefined)
    
    @scala.inline
    def setTaskSetArn(value: String): Self = StObject.set(x, "taskSetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSetArnUndefined: Self = StObject.set(x, "taskSetArn", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: Timestamp): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
