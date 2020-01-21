package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The scheduling strategy to use for the service. For more information, see Services. There are two service scheduler strategies available:    REPLICA-The replica scheduling strategy places and maintains the desired number of tasks across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement strategies and constraints to customize task placement decisions.    DAEMON-The daemon scheduling strategy deploys exactly one task on each container instance in your cluster. When you are using this strategy, do not specify a desired number of tasks or any task placement strategies.  Fargate tasks do not support the DAEMON scheduling strategy.   
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
  def apply(
    capacityProviderStrategy: CapacityProviderStrategy = null,
    clusterArn: String = null,
    createdAt: Timestamp = null,
    createdBy: String = null,
    deploymentConfiguration: DeploymentConfiguration = null,
    deploymentController: DeploymentController = null,
    deployments: Deployments = null,
    desiredCount: Int | scala.Double = null,
    enableECSManagedTags: js.UndefOr[scala.Boolean] = js.undefined,
    events: ServiceEvents = null,
    healthCheckGracePeriodSeconds: Int | scala.Double = null,
    launchType: LaunchType = null,
    loadBalancers: LoadBalancers = null,
    networkConfiguration: NetworkConfiguration = null,
    pendingCount: Int | scala.Double = null,
    placementConstraints: PlacementConstraints = null,
    placementStrategy: PlacementStrategies = null,
    platformVersion: String = null,
    propagateTags: PropagateTags = null,
    roleArn: String = null,
    runningCount: Int | scala.Double = null,
    schedulingStrategy: SchedulingStrategy = null,
    serviceArn: String = null,
    serviceName: String = null,
    serviceRegistries: ServiceRegistries = null,
    status: String = null,
    tags: Tags = null,
    taskDefinition: String = null,
    taskSets: TaskSets = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    if (capacityProviderStrategy != null) __obj.updateDynamic("capacityProviderStrategy")(capacityProviderStrategy.asInstanceOf[js.Any])
    if (clusterArn != null) __obj.updateDynamic("clusterArn")(clusterArn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (deploymentConfiguration != null) __obj.updateDynamic("deploymentConfiguration")(deploymentConfiguration.asInstanceOf[js.Any])
    if (deploymentController != null) __obj.updateDynamic("deploymentController")(deploymentController.asInstanceOf[js.Any])
    if (deployments != null) __obj.updateDynamic("deployments")(deployments.asInstanceOf[js.Any])
    if (desiredCount != null) __obj.updateDynamic("desiredCount")(desiredCount.asInstanceOf[js.Any])
    if (!js.isUndefined(enableECSManagedTags)) __obj.updateDynamic("enableECSManagedTags")(enableECSManagedTags.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (healthCheckGracePeriodSeconds != null) __obj.updateDynamic("healthCheckGracePeriodSeconds")(healthCheckGracePeriodSeconds.asInstanceOf[js.Any])
    if (launchType != null) __obj.updateDynamic("launchType")(launchType.asInstanceOf[js.Any])
    if (loadBalancers != null) __obj.updateDynamic("loadBalancers")(loadBalancers.asInstanceOf[js.Any])
    if (networkConfiguration != null) __obj.updateDynamic("networkConfiguration")(networkConfiguration.asInstanceOf[js.Any])
    if (pendingCount != null) __obj.updateDynamic("pendingCount")(pendingCount.asInstanceOf[js.Any])
    if (placementConstraints != null) __obj.updateDynamic("placementConstraints")(placementConstraints.asInstanceOf[js.Any])
    if (placementStrategy != null) __obj.updateDynamic("placementStrategy")(placementStrategy.asInstanceOf[js.Any])
    if (platformVersion != null) __obj.updateDynamic("platformVersion")(platformVersion.asInstanceOf[js.Any])
    if (propagateTags != null) __obj.updateDynamic("propagateTags")(propagateTags.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (runningCount != null) __obj.updateDynamic("runningCount")(runningCount.asInstanceOf[js.Any])
    if (schedulingStrategy != null) __obj.updateDynamic("schedulingStrategy")(schedulingStrategy.asInstanceOf[js.Any])
    if (serviceArn != null) __obj.updateDynamic("serviceArn")(serviceArn.asInstanceOf[js.Any])
    if (serviceName != null) __obj.updateDynamic("serviceName")(serviceName.asInstanceOf[js.Any])
    if (serviceRegistries != null) __obj.updateDynamic("serviceRegistries")(serviceRegistries.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (taskDefinition != null) __obj.updateDynamic("taskDefinition")(taskDefinition.asInstanceOf[js.Any])
    if (taskSets != null) __obj.updateDynamic("taskSets")(taskSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

