package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends js.Object {
  
  /**
    * The capacity provider strategy associated with the service.
    */
  var capacityProviderStrategy: js.UndefOr[CapacityProviderStrategy] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the cluster that hosts the service.
    */
  var clusterArn: js.UndefOr[String] = js.native
  
  /**
    * The Unix timestamp for when the service was created.
    */
  var createdAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * The principal that created the service.
    */
  var createdBy: js.UndefOr[String] = js.native
  
  /**
    * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping and starting tasks.
    */
  var deploymentConfiguration: js.UndefOr[DeploymentConfiguration] = js.native
  
  /**
    * The deployment controller type the service is using. When using the DescribeServices API, this field is omitted if the service is using the ECS deployment controller type.
    */
  var deploymentController: js.UndefOr[DeploymentController] = js.native
  
  /**
    * The current state of deployments for the service.
    */
  var deployments: js.UndefOr[Deployments] = js.native
  
  /**
    * The desired number of instantiations of the task definition to keep running on the service. This value is specified when the service is created with CreateService, and it can be modified with UpdateService.
    */
  var desiredCount: js.UndefOr[Integer] = js.native
  
  /**
    * Specifies whether to enable Amazon ECS managed tags for the tasks in the service. For more information, see Tagging Your Amazon ECS Resources in the Amazon Elastic Container Service Developer Guide.
    */
  var enableECSManagedTags: js.UndefOr[Boolean] = js.native
  
  /**
    * The event stream for your service. A maximum of 100 of the latest events are displayed.
    */
  var events: js.UndefOr[ServiceEvents] = js.native
  
  /**
    * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first started.
    */
  var healthCheckGracePeriodSeconds: js.UndefOr[BoxedInteger] = js.native
  
  /**
    * The launch type on which your service is running. If no value is specified, it will default to EC2. Valid values include EC2 and FARGATE. For more information, see Amazon ECS Launch Types in the Amazon Elastic Container Service Developer Guide.
    */
  var launchType: js.UndefOr[LaunchType] = js.native
  
  /**
    * A list of Elastic Load Balancing load balancer objects, containing the load balancer name, the container name (as it appears in a container definition), and the container port to access from the load balancer.
    */
  var loadBalancers: js.UndefOr[LoadBalancers] = js.native
  
  /**
    * The VPC subnet and security group configuration for tasks that receive their own elastic network interface by using the awsvpc networking mode.
    */
  var networkConfiguration: js.UndefOr[NetworkConfiguration] = js.native
  
  /**
    * The number of tasks in the cluster that are in the PENDING state.
    */
  var pendingCount: js.UndefOr[Integer] = js.native
  
  /**
    * The placement constraints for the tasks in the service.
    */
  var placementConstraints: js.UndefOr[PlacementConstraints] = js.native
  
  /**
    * The placement strategy that determines how tasks for the service are placed.
    */
  var placementStrategy: js.UndefOr[PlacementStrategies] = js.native
  
  /**
    * The platform version on which to run your service. A platform version is only specified for tasks using the Fargate launch type. If one is not specified, the LATEST platform version is used by default. For more information, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var platformVersion: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether to propagate the tags from the task definition or the service to the task. If no value is specified, the tags are not propagated.
    */
  var propagateTags: js.UndefOr[PropagateTags] = js.native
  
  /**
    * The ARN of the IAM role associated with the service that allows the Amazon ECS container agent to register container instances with an Elastic Load Balancing load balancer.
    */
  var roleArn: js.UndefOr[String] = js.native
  
  /**
    * The number of tasks in the cluster that are in the RUNNING state.
    */
  var runningCount: js.UndefOr[Integer] = js.native
  
  /**
    * The scheduling strategy to use for the service. For more information, see Services. There are two service scheduler strategies available:    REPLICA-The replica scheduling strategy places and maintains the desired number of tasks across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement strategies and constraints to customize task placement decisions.    DAEMON-The daemon scheduling strategy deploys exactly one task on each active container instance that meets all of the task placement constraints that you specify in your cluster. The service scheduler also evaluates the task placement constraints for running tasks and will stop tasks that do not meet the placement constraints.  Fargate tasks do not support the DAEMON scheduling strategy.   
    */
  var schedulingStrategy: js.UndefOr[SchedulingStrategy] = js.native
  
  /**
    * The ARN that identifies the service. The ARN contains the arn:aws:ecs namespace, followed by the Region of the service, the AWS account ID of the service owner, the service namespace, and then the service name. For example, arn:aws:ecs:region:012345678910:service/my-service.
    */
  var serviceArn: js.UndefOr[String] = js.native
  
  /**
    * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple clusters within a Region or across multiple Regions.
    */
  var serviceName: js.UndefOr[String] = js.native
  
  /**
    * The details of the service discovery registries to assign to this service. For more information, see Service Discovery.
    */
  var serviceRegistries: js.UndefOr[ServiceRegistries] = js.native
  
  /**
    * The status of the service. The valid values are ACTIVE, DRAINING, or INACTIVE.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The metadata that you apply to the service to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  
  /**
    * The task definition to use for tasks in the service. This value is specified when the service is created with CreateService, and it can be modified with UpdateService.
    */
  var taskDefinition: js.UndefOr[String] = js.native
  
  /**
    * Information about a set of Amazon ECS tasks in either an AWS CodeDeploy or an EXTERNAL deployment. An Amazon ECS task set includes details such as the desired number of tasks, how many tasks are running, and whether the task set serves production traffic.
    */
  var taskSets: js.UndefOr[TaskSets] = js.native
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    
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
    def setCapacityProviderStrategyVarargs(value: CapacityProviderStrategyItem*): Self = this.set("capacityProviderStrategy", js.Array(value :_*))
    
    @scala.inline
    def setCapacityProviderStrategy(value: CapacityProviderStrategy): Self = this.set("capacityProviderStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityProviderStrategy: Self = this.set("capacityProviderStrategy", js.undefined)
    
    @scala.inline
    def setClusterArn(value: String): Self = this.set("clusterArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterArn: Self = this.set("clusterArn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setDeploymentConfiguration(value: DeploymentConfiguration): Self = this.set("deploymentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentConfiguration: Self = this.set("deploymentConfiguration", js.undefined)
    
    @scala.inline
    def setDeploymentController(value: DeploymentController): Self = this.set("deploymentController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentController: Self = this.set("deploymentController", js.undefined)
    
    @scala.inline
    def setDeploymentsVarargs(value: Deployment*): Self = this.set("deployments", js.Array(value :_*))
    
    @scala.inline
    def setDeployments(value: Deployments): Self = this.set("deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeployments: Self = this.set("deployments", js.undefined)
    
    @scala.inline
    def setDesiredCount(value: Integer): Self = this.set("desiredCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredCount: Self = this.set("desiredCount", js.undefined)
    
    @scala.inline
    def setEnableECSManagedTags(value: Boolean): Self = this.set("enableECSManagedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableECSManagedTags: Self = this.set("enableECSManagedTags", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: ServiceEvent*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: ServiceEvents): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setHealthCheckGracePeriodSeconds(value: BoxedInteger): Self = this.set("healthCheckGracePeriodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckGracePeriodSeconds: Self = this.set("healthCheckGracePeriodSeconds", js.undefined)
    
    @scala.inline
    def setLaunchType(value: LaunchType): Self = this.set("launchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchType: Self = this.set("launchType", js.undefined)
    
    @scala.inline
    def setLoadBalancersVarargs(value: LoadBalancer*): Self = this.set("loadBalancers", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancers(value: LoadBalancers): Self = this.set("loadBalancers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancers: Self = this.set("loadBalancers", js.undefined)
    
    @scala.inline
    def setNetworkConfiguration(value: NetworkConfiguration): Self = this.set("networkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkConfiguration: Self = this.set("networkConfiguration", js.undefined)
    
    @scala.inline
    def setPendingCount(value: Integer): Self = this.set("pendingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingCount: Self = this.set("pendingCount", js.undefined)
    
    @scala.inline
    def setPlacementConstraintsVarargs(value: PlacementConstraint*): Self = this.set("placementConstraints", js.Array(value :_*))
    
    @scala.inline
    def setPlacementConstraints(value: PlacementConstraints): Self = this.set("placementConstraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementConstraints: Self = this.set("placementConstraints", js.undefined)
    
    @scala.inline
    def setPlacementStrategyVarargs(value: PlacementStrategy*): Self = this.set("placementStrategy", js.Array(value :_*))
    
    @scala.inline
    def setPlacementStrategy(value: PlacementStrategies): Self = this.set("placementStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementStrategy: Self = this.set("placementStrategy", js.undefined)
    
    @scala.inline
    def setPlatformVersion(value: String): Self = this.set("platformVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatformVersion: Self = this.set("platformVersion", js.undefined)
    
    @scala.inline
    def setPropagateTags(value: PropagateTags): Self = this.set("propagateTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropagateTags: Self = this.set("propagateTags", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    
    @scala.inline
    def setRunningCount(value: Integer): Self = this.set("runningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunningCount: Self = this.set("runningCount", js.undefined)
    
    @scala.inline
    def setSchedulingStrategy(value: SchedulingStrategy): Self = this.set("schedulingStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedulingStrategy: Self = this.set("schedulingStrategy", js.undefined)
    
    @scala.inline
    def setServiceArn(value: String): Self = this.set("serviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceArn: Self = this.set("serviceArn", js.undefined)
    
    @scala.inline
    def setServiceName(value: String): Self = this.set("serviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("serviceName", js.undefined)
    
    @scala.inline
    def setServiceRegistriesVarargs(value: ServiceRegistry*): Self = this.set("serviceRegistries", js.Array(value :_*))
    
    @scala.inline
    def setServiceRegistries(value: ServiceRegistries): Self = this.set("serviceRegistries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRegistries: Self = this.set("serviceRegistries", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTaskDefinition(value: String): Self = this.set("taskDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskDefinition: Self = this.set("taskDefinition", js.undefined)
    
    @scala.inline
    def setTaskSetsVarargs(value: TaskSet*): Self = this.set("taskSets", js.Array(value :_*))
    
    @scala.inline
    def setTaskSets(value: TaskSets): Self = this.set("taskSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskSets: Self = this.set("taskSets", js.undefined)
  }
}
