package typings.awsSdk.ecsMod

import typings.awsSdk.DescribeServicesRequestwa
import typings.awsSdk.DescribeTasksRequestwaite
import typings.awsSdk.awsSdkStrings.servicesInactive
import typings.awsSdk.awsSdkStrings.servicesStable
import typings.awsSdk.awsSdkStrings.tasksRunning
import typings.awsSdk.awsSdkStrings.tasksStopped
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECS extends Service {
  var config: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a new capacity provider. Capacity providers are associated with an Amazon ECS cluster and are used in capacity provider strategies to facilitate cluster auto scaling. Only capacity providers using an Auto Scaling group can be created. Amazon ECS tasks on AWS Fargate use the FARGATE and FARGATE_SPOT capacity providers which are already created and available to all accounts in Regions supported by AWS Fargate.
    */
  def createCapacityProvider(): Request[CreateCapacityProviderResponse, AWSError] = js.native
  def createCapacityProvider(callback: js.Function2[/* err */ AWSError, /* data */ CreateCapacityProviderResponse, Unit]): Request[CreateCapacityProviderResponse, AWSError] = js.native
  /**
    * Creates a new capacity provider. Capacity providers are associated with an Amazon ECS cluster and are used in capacity provider strategies to facilitate cluster auto scaling. Only capacity providers using an Auto Scaling group can be created. Amazon ECS tasks on AWS Fargate use the FARGATE and FARGATE_SPOT capacity providers which are already created and available to all accounts in Regions supported by AWS Fargate.
    */
  def createCapacityProvider(params: CreateCapacityProviderRequest): Request[CreateCapacityProviderResponse, AWSError] = js.native
  def createCapacityProvider(
    params: CreateCapacityProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCapacityProviderResponse, Unit]
  ): Request[CreateCapacityProviderResponse, AWSError] = js.native
  /**
    * Creates a new Amazon ECS cluster. By default, your account receives a default cluster when you launch your first container instance. However, you can create your own cluster with a unique name with the CreateCluster action.  When you call the CreateCluster API operation, Amazon ECS attempts to create the Amazon ECS service-linked role for your account so that required resources in other AWS services can be managed on your behalf. However, if the IAM user that makes the call does not have permissions to create the service-linked role, it is not created. For more information, see Using Service-Linked Roles for Amazon ECS in the Amazon Elastic Container Service Developer Guide. 
    */
  def createCluster(): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * Creates a new Amazon ECS cluster. By default, your account receives a default cluster when you launch your first container instance. However, you can create your own cluster with a unique name with the CreateCluster action.  When you call the CreateCluster API operation, Amazon ECS attempts to create the Amazon ECS service-linked role for your account so that required resources in other AWS services can be managed on your behalf. However, if the IAM user that makes the call does not have permissions to create the service-linked role, it is not created. For more information, see Using Service-Linked Roles for Amazon ECS in the Amazon Elastic Container Service Developer Guide. 
    */
  def createCluster(params: CreateClusterRequest): Request[CreateClusterResponse, AWSError] = js.native
  def createCluster(
    params: CreateClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateClusterResponse, Unit]
  ): Request[CreateClusterResponse, AWSError] = js.native
  /**
    * Runs and maintains a desired number of tasks from a specified task definition. If the number of tasks running in a service drops below the desiredCount, Amazon ECS runs another copy of the task in the specified cluster. To update an existing service, see UpdateService. In addition to maintaining the desired count of tasks in your service, you can optionally run your service behind one or more load balancers. The load balancers distribute traffic across the tasks that are associated with the service. For more information, see Service Load Balancing in the Amazon Elastic Container Service Developer Guide. Tasks for services that do not use a load balancer are considered healthy if they're in the RUNNING state. Tasks for services that do use a load balancer are considered healthy if they're in the RUNNING state and the container instance that they're hosted on is reported as healthy by the load balancer. There are two service scheduler strategies available:    REPLICA - The replica scheduling strategy places and maintains the desired number of tasks across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement strategies and constraints to customize task placement decisions. For more information, see Service Scheduler Concepts in the Amazon Elastic Container Service Developer Guide.    DAEMON - The daemon scheduling strategy deploys exactly one task on each active container instance that meets all of the task placement constraints that you specify in your cluster. When using this strategy, you don't need to specify a desired number of tasks, a task placement strategy, or use Service Auto Scaling policies. For more information, see Service Scheduler Concepts in the Amazon Elastic Container Service Developer Guide.   You can optionally specify a deployment configuration for your service. The deployment is triggered by changing properties, such as the task definition or the desired count of a service, with an UpdateService operation. The default value for a replica service for minimumHealthyPercent is 100%. The default value for a daemon service for minimumHealthyPercent is 0%. If a service is using the ECS deployment controller, the minimum healthy percent represents a lower limit on the number of tasks in a service that must remain in the RUNNING state during a deployment, as a percentage of the desired number of tasks (rounded up to the nearest integer), and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. This parameter enables you to deploy without using additional cluster capacity. For example, if your service has a desired number of four tasks and a minimum healthy percent of 50%, the scheduler might stop two existing tasks to free up cluster capacity before starting two new tasks. Tasks for services that do not use a load balancer are considered healthy if they're in the RUNNING state. Tasks for services that do use a load balancer are considered healthy if they're in the RUNNING state and they're reported as healthy by the load balancer. The default value for minimum healthy percent is 100%. If a service is using the ECS deployment controller, the maximum percent parameter represents an upper limit on the number of tasks in a service that are allowed in the RUNNING or PENDING state during a deployment, as a percentage of the desired number of tasks (rounded down to the nearest integer), and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. This parameter enables you to define the deployment batch size. For example, if your service has a desired number of four tasks and a maximum percent value of 200%, the scheduler may start four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are available). The default value for maximum percent is 200%. If a service is using either the CODE_DEPLOY or EXTERNAL deployment controller types and tasks that use the EC2 launch type, the minimum healthy percent and maximum percent values are used only to define the lower and upper limit on the number of the tasks in the service that remain in the RUNNING state while the container instances are in the DRAINING state. If the tasks in the service use the Fargate launch type, the minimum healthy percent and maximum percent values aren't used, although they're currently visible when describing your service. When creating a service that uses the EXTERNAL deployment controller, you can specify only parameters that aren't controlled at the task set level. The only required parameter is the service name. You control your services using the CreateTaskSet operation. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide. When the service scheduler launches new tasks, it determines task placement in your cluster using the following logic:   Determine which of the container instances in your cluster can support your service's task definition (for example, they have the required CPU, memory, ports, and container instance attributes).   By default, the service scheduler attempts to balance tasks across Availability Zones in this manner (although you can choose a different placement strategy) with the placementStrategy parameter):   Sort the valid container instances, giving priority to instances that have the fewest number of running tasks for this service in their respective Availability Zone. For example, if zone A has one running service task and zones B and C each have zero, valid container instances in either zone B or C are considered optimal for placement.   Place the new service task on a valid container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the fewest number of running tasks for this service.    
    */
  def createService(): Request[CreateServiceResponse, AWSError] = js.native
  def createService(callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceResponse, Unit]): Request[CreateServiceResponse, AWSError] = js.native
  /**
    * Runs and maintains a desired number of tasks from a specified task definition. If the number of tasks running in a service drops below the desiredCount, Amazon ECS runs another copy of the task in the specified cluster. To update an existing service, see UpdateService. In addition to maintaining the desired count of tasks in your service, you can optionally run your service behind one or more load balancers. The load balancers distribute traffic across the tasks that are associated with the service. For more information, see Service Load Balancing in the Amazon Elastic Container Service Developer Guide. Tasks for services that do not use a load balancer are considered healthy if they're in the RUNNING state. Tasks for services that do use a load balancer are considered healthy if they're in the RUNNING state and the container instance that they're hosted on is reported as healthy by the load balancer. There are two service scheduler strategies available:    REPLICA - The replica scheduling strategy places and maintains the desired number of tasks across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement strategies and constraints to customize task placement decisions. For more information, see Service Scheduler Concepts in the Amazon Elastic Container Service Developer Guide.    DAEMON - The daemon scheduling strategy deploys exactly one task on each active container instance that meets all of the task placement constraints that you specify in your cluster. When using this strategy, you don't need to specify a desired number of tasks, a task placement strategy, or use Service Auto Scaling policies. For more information, see Service Scheduler Concepts in the Amazon Elastic Container Service Developer Guide.   You can optionally specify a deployment configuration for your service. The deployment is triggered by changing properties, such as the task definition or the desired count of a service, with an UpdateService operation. The default value for a replica service for minimumHealthyPercent is 100%. The default value for a daemon service for minimumHealthyPercent is 0%. If a service is using the ECS deployment controller, the minimum healthy percent represents a lower limit on the number of tasks in a service that must remain in the RUNNING state during a deployment, as a percentage of the desired number of tasks (rounded up to the nearest integer), and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. This parameter enables you to deploy without using additional cluster capacity. For example, if your service has a desired number of four tasks and a minimum healthy percent of 50%, the scheduler might stop two existing tasks to free up cluster capacity before starting two new tasks. Tasks for services that do not use a load balancer are considered healthy if they're in the RUNNING state. Tasks for services that do use a load balancer are considered healthy if they're in the RUNNING state and they're reported as healthy by the load balancer. The default value for minimum healthy percent is 100%. If a service is using the ECS deployment controller, the maximum percent parameter represents an upper limit on the number of tasks in a service that are allowed in the RUNNING or PENDING state during a deployment, as a percentage of the desired number of tasks (rounded down to the nearest integer), and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. This parameter enables you to define the deployment batch size. For example, if your service has a desired number of four tasks and a maximum percent value of 200%, the scheduler may start four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are available). The default value for maximum percent is 200%. If a service is using either the CODE_DEPLOY or EXTERNAL deployment controller types and tasks that use the EC2 launch type, the minimum healthy percent and maximum percent values are used only to define the lower and upper limit on the number of the tasks in the service that remain in the RUNNING state while the container instances are in the DRAINING state. If the tasks in the service use the Fargate launch type, the minimum healthy percent and maximum percent values aren't used, although they're currently visible when describing your service. When creating a service that uses the EXTERNAL deployment controller, you can specify only parameters that aren't controlled at the task set level. The only required parameter is the service name. You control your services using the CreateTaskSet operation. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide. When the service scheduler launches new tasks, it determines task placement in your cluster using the following logic:   Determine which of the container instances in your cluster can support your service's task definition (for example, they have the required CPU, memory, ports, and container instance attributes).   By default, the service scheduler attempts to balance tasks across Availability Zones in this manner (although you can choose a different placement strategy) with the placementStrategy parameter):   Sort the valid container instances, giving priority to instances that have the fewest number of running tasks for this service in their respective Availability Zone. For example, if zone A has one running service task and zones B and C each have zero, valid container instances in either zone B or C are considered optimal for placement.   Place the new service task on a valid container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the fewest number of running tasks for this service.    
    */
  def createService(params: CreateServiceRequest): Request[CreateServiceResponse, AWSError] = js.native
  def createService(
    params: CreateServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateServiceResponse, Unit]
  ): Request[CreateServiceResponse, AWSError] = js.native
  /**
    * Create a task set in the specified cluster and service. This is used when a service uses the EXTERNAL deployment controller type. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide.
    */
  def createTaskSet(): Request[CreateTaskSetResponse, AWSError] = js.native
  def createTaskSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskSetResponse, Unit]): Request[CreateTaskSetResponse, AWSError] = js.native
  /**
    * Create a task set in the specified cluster and service. This is used when a service uses the EXTERNAL deployment controller type. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide.
    */
  def createTaskSet(params: CreateTaskSetRequest): Request[CreateTaskSetResponse, AWSError] = js.native
  def createTaskSet(
    params: CreateTaskSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskSetResponse, Unit]
  ): Request[CreateTaskSetResponse, AWSError] = js.native
  /**
    * Disables an account setting for a specified IAM user, IAM role, or the root user for an account.
    */
  def deleteAccountSetting(): Request[DeleteAccountSettingResponse, AWSError] = js.native
  def deleteAccountSetting(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountSettingResponse, Unit]): Request[DeleteAccountSettingResponse, AWSError] = js.native
  /**
    * Disables an account setting for a specified IAM user, IAM role, or the root user for an account.
    */
  def deleteAccountSetting(params: DeleteAccountSettingRequest): Request[DeleteAccountSettingResponse, AWSError] = js.native
  def deleteAccountSetting(
    params: DeleteAccountSettingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountSettingResponse, Unit]
  ): Request[DeleteAccountSettingResponse, AWSError] = js.native
  /**
    * Deletes one or more custom attributes from an Amazon ECS resource.
    */
  def deleteAttributes(): Request[DeleteAttributesResponse, AWSError] = js.native
  def deleteAttributes(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAttributesResponse, Unit]): Request[DeleteAttributesResponse, AWSError] = js.native
  /**
    * Deletes one or more custom attributes from an Amazon ECS resource.
    */
  def deleteAttributes(params: DeleteAttributesRequest): Request[DeleteAttributesResponse, AWSError] = js.native
  def deleteAttributes(
    params: DeleteAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAttributesResponse, Unit]
  ): Request[DeleteAttributesResponse, AWSError] = js.native
  /**
    * Deletes the specified cluster. The cluster will transition to the INACTIVE state. Clusters with an INACTIVE status may remain discoverable in your account for a period of time. However, this behavior is subject to change in the future, so you should not rely on INACTIVE clusters persisting. You must deregister all container instances from this cluster before you may delete it. You can list the container instances in a cluster with ListContainerInstances and deregister them with DeregisterContainerInstance.
    */
  def deleteCluster(): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * Deletes the specified cluster. The cluster will transition to the INACTIVE state. Clusters with an INACTIVE status may remain discoverable in your account for a period of time. However, this behavior is subject to change in the future, so you should not rely on INACTIVE clusters persisting. You must deregister all container instances from this cluster before you may delete it. You can list the container instances in a cluster with ListContainerInstances and deregister them with DeregisterContainerInstance.
    */
  def deleteCluster(params: DeleteClusterRequest): Request[DeleteClusterResponse, AWSError] = js.native
  def deleteCluster(
    params: DeleteClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteClusterResponse, Unit]
  ): Request[DeleteClusterResponse, AWSError] = js.native
  /**
    * Deletes a specified service within a cluster. You can delete a service if you have no running tasks in it and the desired task count is zero. If the service is actively maintaining tasks, you cannot delete it, and you must update the service to a desired task count of zero. For more information, see UpdateService.  When you delete a service, if there are still running tasks that require cleanup, the service status moves from ACTIVE to DRAINING, and the service is no longer visible in the console or in the ListServices API operation. After all tasks have transitioned to either STOPPING or STOPPED status, the service status moves from DRAINING to INACTIVE. Services in the DRAINING or INACTIVE status can still be viewed with the DescribeServices API operation. However, in the future, INACTIVE services may be cleaned up and purged from Amazon ECS record keeping, and DescribeServices calls on those services return a ServiceNotFoundException error.   If you attempt to create a new service with the same name as an existing service in either ACTIVE or DRAINING status, you receive an error. 
    */
  def deleteService(): Request[DeleteServiceResponse, AWSError] = js.native
  def deleteService(callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceResponse, Unit]): Request[DeleteServiceResponse, AWSError] = js.native
  /**
    * Deletes a specified service within a cluster. You can delete a service if you have no running tasks in it and the desired task count is zero. If the service is actively maintaining tasks, you cannot delete it, and you must update the service to a desired task count of zero. For more information, see UpdateService.  When you delete a service, if there are still running tasks that require cleanup, the service status moves from ACTIVE to DRAINING, and the service is no longer visible in the console or in the ListServices API operation. After all tasks have transitioned to either STOPPING or STOPPED status, the service status moves from DRAINING to INACTIVE. Services in the DRAINING or INACTIVE status can still be viewed with the DescribeServices API operation. However, in the future, INACTIVE services may be cleaned up and purged from Amazon ECS record keeping, and DescribeServices calls on those services return a ServiceNotFoundException error.   If you attempt to create a new service with the same name as an existing service in either ACTIVE or DRAINING status, you receive an error. 
    */
  def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse, AWSError] = js.native
  def deleteService(
    params: DeleteServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteServiceResponse, Unit]
  ): Request[DeleteServiceResponse, AWSError] = js.native
  /**
    * Deletes a specified task set within a service. This is used when a service uses the EXTERNAL deployment controller type. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide.
    */
  def deleteTaskSet(): Request[DeleteTaskSetResponse, AWSError] = js.native
  def deleteTaskSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTaskSetResponse, Unit]): Request[DeleteTaskSetResponse, AWSError] = js.native
  /**
    * Deletes a specified task set within a service. This is used when a service uses the EXTERNAL deployment controller type. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide.
    */
  def deleteTaskSet(params: DeleteTaskSetRequest): Request[DeleteTaskSetResponse, AWSError] = js.native
  def deleteTaskSet(
    params: DeleteTaskSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTaskSetResponse, Unit]
  ): Request[DeleteTaskSetResponse, AWSError] = js.native
  /**
    * Deregisters an Amazon ECS container instance from the specified cluster. This instance is no longer available to run tasks. If you intend to use the container instance for some other purpose after deregistration, you should stop all of the tasks running on the container instance before deregistration. That prevents any orphaned tasks from consuming resources. Deregistering a container instance removes the instance from a cluster, but it does not terminate the EC2 instance. If you are finished using the instance, be sure to terminate it in the Amazon EC2 console to stop billing.  If you terminate a running container instance, Amazon ECS automatically deregisters the instance from your cluster (stopped container instances or instances with disconnected agents are not automatically deregistered when terminated). 
    */
  def deregisterContainerInstance(): Request[DeregisterContainerInstanceResponse, AWSError] = js.native
  def deregisterContainerInstance(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterContainerInstanceResponse, Unit]): Request[DeregisterContainerInstanceResponse, AWSError] = js.native
  /**
    * Deregisters an Amazon ECS container instance from the specified cluster. This instance is no longer available to run tasks. If you intend to use the container instance for some other purpose after deregistration, you should stop all of the tasks running on the container instance before deregistration. That prevents any orphaned tasks from consuming resources. Deregistering a container instance removes the instance from a cluster, but it does not terminate the EC2 instance. If you are finished using the instance, be sure to terminate it in the Amazon EC2 console to stop billing.  If you terminate a running container instance, Amazon ECS automatically deregisters the instance from your cluster (stopped container instances or instances with disconnected agents are not automatically deregistered when terminated). 
    */
  def deregisterContainerInstance(params: DeregisterContainerInstanceRequest): Request[DeregisterContainerInstanceResponse, AWSError] = js.native
  def deregisterContainerInstance(
    params: DeregisterContainerInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterContainerInstanceResponse, Unit]
  ): Request[DeregisterContainerInstanceResponse, AWSError] = js.native
  /**
    * Deregisters the specified task definition by family and revision. Upon deregistration, the task definition is marked as INACTIVE. Existing tasks and services that reference an INACTIVE task definition continue to run without disruption. Existing services that reference an INACTIVE task definition can still scale up or down by modifying the service's desired count. You cannot use an INACTIVE task definition to run new tasks or create new services, and you cannot update an existing service to reference an INACTIVE task definition. However, there may be up to a 10-minute window following deregistration where these restrictions have not yet taken effect.  At this time, INACTIVE task definitions remain discoverable in your account indefinitely. However, this behavior is subject to change in the future, so you should not rely on INACTIVE task definitions persisting beyond the lifecycle of any associated tasks and services. 
    */
  def deregisterTaskDefinition(): Request[DeregisterTaskDefinitionResponse, AWSError] = js.native
  def deregisterTaskDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTaskDefinitionResponse, Unit]): Request[DeregisterTaskDefinitionResponse, AWSError] = js.native
  /**
    * Deregisters the specified task definition by family and revision. Upon deregistration, the task definition is marked as INACTIVE. Existing tasks and services that reference an INACTIVE task definition continue to run without disruption. Existing services that reference an INACTIVE task definition can still scale up or down by modifying the service's desired count. You cannot use an INACTIVE task definition to run new tasks or create new services, and you cannot update an existing service to reference an INACTIVE task definition. However, there may be up to a 10-minute window following deregistration where these restrictions have not yet taken effect.  At this time, INACTIVE task definitions remain discoverable in your account indefinitely. However, this behavior is subject to change in the future, so you should not rely on INACTIVE task definitions persisting beyond the lifecycle of any associated tasks and services. 
    */
  def deregisterTaskDefinition(params: DeregisterTaskDefinitionRequest): Request[DeregisterTaskDefinitionResponse, AWSError] = js.native
  def deregisterTaskDefinition(
    params: DeregisterTaskDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterTaskDefinitionResponse, Unit]
  ): Request[DeregisterTaskDefinitionResponse, AWSError] = js.native
  /**
    * Describes one or more of your capacity providers.
    */
  def describeCapacityProviders(): Request[DescribeCapacityProvidersResponse, AWSError] = js.native
  def describeCapacityProviders(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCapacityProvidersResponse, Unit]): Request[DescribeCapacityProvidersResponse, AWSError] = js.native
  /**
    * Describes one or more of your capacity providers.
    */
  def describeCapacityProviders(params: DescribeCapacityProvidersRequest): Request[DescribeCapacityProvidersResponse, AWSError] = js.native
  def describeCapacityProviders(
    params: DescribeCapacityProvidersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCapacityProvidersResponse, Unit]
  ): Request[DescribeCapacityProvidersResponse, AWSError] = js.native
  /**
    * Describes one or more of your clusters.
    */
  def describeClusters(): Request[DescribeClustersResponse, AWSError] = js.native
  def describeClusters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeClustersResponse, Unit]): Request[DescribeClustersResponse, AWSError] = js.native
  /**
    * Describes one or more of your clusters.
    */
  def describeClusters(params: DescribeClustersRequest): Request[DescribeClustersResponse, AWSError] = js.native
  def describeClusters(
    params: DescribeClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeClustersResponse, Unit]
  ): Request[DescribeClustersResponse, AWSError] = js.native
  /**
    * Describes Amazon Elastic Container Service container instances. Returns metadata about registered and remaining resources on each container instance requested.
    */
  def describeContainerInstances(): Request[DescribeContainerInstancesResponse, AWSError] = js.native
  def describeContainerInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeContainerInstancesResponse, Unit]): Request[DescribeContainerInstancesResponse, AWSError] = js.native
  /**
    * Describes Amazon Elastic Container Service container instances. Returns metadata about registered and remaining resources on each container instance requested.
    */
  def describeContainerInstances(params: DescribeContainerInstancesRequest): Request[DescribeContainerInstancesResponse, AWSError] = js.native
  def describeContainerInstances(
    params: DescribeContainerInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeContainerInstancesResponse, Unit]
  ): Request[DescribeContainerInstancesResponse, AWSError] = js.native
  /**
    * Describes the specified services running in your cluster.
    */
  def describeServices(): Request[DescribeServicesResponse, AWSError] = js.native
  def describeServices(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]): Request[DescribeServicesResponse, AWSError] = js.native
  /**
    * Describes the specified services running in your cluster.
    */
  def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse, AWSError] = js.native
  def describeServices(
    params: DescribeServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]
  ): Request[DescribeServicesResponse, AWSError] = js.native
  /**
    * Describes a task definition. You can specify a family and revision to find information about a specific task definition, or you can simply specify the family to find the latest ACTIVE revision in that family.  You can only describe INACTIVE task definitions while an active task or service references them. 
    */
  def describeTaskDefinition(): Request[DescribeTaskDefinitionResponse, AWSError] = js.native
  def describeTaskDefinition(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskDefinitionResponse, Unit]): Request[DescribeTaskDefinitionResponse, AWSError] = js.native
  /**
    * Describes a task definition. You can specify a family and revision to find information about a specific task definition, or you can simply specify the family to find the latest ACTIVE revision in that family.  You can only describe INACTIVE task definitions while an active task or service references them. 
    */
  def describeTaskDefinition(params: DescribeTaskDefinitionRequest): Request[DescribeTaskDefinitionResponse, AWSError] = js.native
  def describeTaskDefinition(
    params: DescribeTaskDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskDefinitionResponse, Unit]
  ): Request[DescribeTaskDefinitionResponse, AWSError] = js.native
  /**
    * Describes the task sets in the specified cluster and service. This is used when a service uses the EXTERNAL deployment controller type. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide.
    */
  def describeTaskSets(): Request[DescribeTaskSetsResponse, AWSError] = js.native
  def describeTaskSets(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskSetsResponse, Unit]): Request[DescribeTaskSetsResponse, AWSError] = js.native
  /**
    * Describes the task sets in the specified cluster and service. This is used when a service uses the EXTERNAL deployment controller type. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide.
    */
  def describeTaskSets(params: DescribeTaskSetsRequest): Request[DescribeTaskSetsResponse, AWSError] = js.native
  def describeTaskSets(
    params: DescribeTaskSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskSetsResponse, Unit]
  ): Request[DescribeTaskSetsResponse, AWSError] = js.native
  /**
    * Describes a specified task or tasks.
    */
  def describeTasks(): Request[DescribeTasksResponse, AWSError] = js.native
  def describeTasks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTasksResponse, Unit]): Request[DescribeTasksResponse, AWSError] = js.native
  /**
    * Describes a specified task or tasks.
    */
  def describeTasks(params: DescribeTasksRequest): Request[DescribeTasksResponse, AWSError] = js.native
  def describeTasks(
    params: DescribeTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTasksResponse, Unit]
  ): Request[DescribeTasksResponse, AWSError] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Returns an endpoint for the Amazon ECS agent to poll for updates.
    */
  def discoverPollEndpoint(): Request[DiscoverPollEndpointResponse, AWSError] = js.native
  def discoverPollEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ DiscoverPollEndpointResponse, Unit]): Request[DiscoverPollEndpointResponse, AWSError] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Returns an endpoint for the Amazon ECS agent to poll for updates.
    */
  def discoverPollEndpoint(params: DiscoverPollEndpointRequest): Request[DiscoverPollEndpointResponse, AWSError] = js.native
  def discoverPollEndpoint(
    params: DiscoverPollEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DiscoverPollEndpointResponse, Unit]
  ): Request[DiscoverPollEndpointResponse, AWSError] = js.native
  /**
    * Lists the account settings for a specified principal.
    */
  def listAccountSettings(): Request[ListAccountSettingsResponse, AWSError] = js.native
  def listAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountSettingsResponse, Unit]): Request[ListAccountSettingsResponse, AWSError] = js.native
  /**
    * Lists the account settings for a specified principal.
    */
  def listAccountSettings(params: ListAccountSettingsRequest): Request[ListAccountSettingsResponse, AWSError] = js.native
  def listAccountSettings(
    params: ListAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountSettingsResponse, Unit]
  ): Request[ListAccountSettingsResponse, AWSError] = js.native
  /**
    * Lists the attributes for Amazon ECS resources within a specified target type and cluster. When you specify a target type and cluster, ListAttributes returns a list of attribute objects, one for each attribute on each resource. You can filter the list of results to a single attribute name to only return results that have that name. You can also filter the results by attribute name and value, for example, to see which container instances in a cluster are running a Linux AMI (ecs.os-type=linux). 
    */
  def listAttributes(): Request[ListAttributesResponse, AWSError] = js.native
  def listAttributes(callback: js.Function2[/* err */ AWSError, /* data */ ListAttributesResponse, Unit]): Request[ListAttributesResponse, AWSError] = js.native
  /**
    * Lists the attributes for Amazon ECS resources within a specified target type and cluster. When you specify a target type and cluster, ListAttributes returns a list of attribute objects, one for each attribute on each resource. You can filter the list of results to a single attribute name to only return results that have that name. You can also filter the results by attribute name and value, for example, to see which container instances in a cluster are running a Linux AMI (ecs.os-type=linux). 
    */
  def listAttributes(params: ListAttributesRequest): Request[ListAttributesResponse, AWSError] = js.native
  def listAttributes(
    params: ListAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttributesResponse, Unit]
  ): Request[ListAttributesResponse, AWSError] = js.native
  /**
    * Returns a list of existing clusters.
    */
  def listClusters(): Request[ListClustersResponse, AWSError] = js.native
  def listClusters(callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResponse, Unit]): Request[ListClustersResponse, AWSError] = js.native
  /**
    * Returns a list of existing clusters.
    */
  def listClusters(params: ListClustersRequest): Request[ListClustersResponse, AWSError] = js.native
  def listClusters(
    params: ListClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListClustersResponse, Unit]
  ): Request[ListClustersResponse, AWSError] = js.native
  /**
    * Returns a list of container instances in a specified cluster. You can filter the results of a ListContainerInstances operation with cluster query language statements inside the filter parameter. For more information, see Cluster Query Language in the Amazon Elastic Container Service Developer Guide.
    */
  def listContainerInstances(): Request[ListContainerInstancesResponse, AWSError] = js.native
  def listContainerInstances(callback: js.Function2[/* err */ AWSError, /* data */ ListContainerInstancesResponse, Unit]): Request[ListContainerInstancesResponse, AWSError] = js.native
  /**
    * Returns a list of container instances in a specified cluster. You can filter the results of a ListContainerInstances operation with cluster query language statements inside the filter parameter. For more information, see Cluster Query Language in the Amazon Elastic Container Service Developer Guide.
    */
  def listContainerInstances(params: ListContainerInstancesRequest): Request[ListContainerInstancesResponse, AWSError] = js.native
  def listContainerInstances(
    params: ListContainerInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListContainerInstancesResponse, Unit]
  ): Request[ListContainerInstancesResponse, AWSError] = js.native
  /**
    * Lists the services that are running in a specified cluster.
    */
  def listServices(): Request[ListServicesResponse, AWSError] = js.native
  def listServices(callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]): Request[ListServicesResponse, AWSError] = js.native
  /**
    * Lists the services that are running in a specified cluster.
    */
  def listServices(params: ListServicesRequest): Request[ListServicesResponse, AWSError] = js.native
  def listServices(
    params: ListServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListServicesResponse, Unit]
  ): Request[ListServicesResponse, AWSError] = js.native
  /**
    * List the tags for an Amazon ECS resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * List the tags for an Amazon ECS resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of task definition families that are registered to your account (which may include task definition families that no longer have any ACTIVE task definition revisions). You can filter out task definition families that do not contain any ACTIVE task definition revisions by setting the status parameter to ACTIVE. You can also filter the results with the familyPrefix parameter.
    */
  def listTaskDefinitionFamilies(): Request[ListTaskDefinitionFamiliesResponse, AWSError] = js.native
  def listTaskDefinitionFamilies(callback: js.Function2[/* err */ AWSError, /* data */ ListTaskDefinitionFamiliesResponse, Unit]): Request[ListTaskDefinitionFamiliesResponse, AWSError] = js.native
  /**
    * Returns a list of task definition families that are registered to your account (which may include task definition families that no longer have any ACTIVE task definition revisions). You can filter out task definition families that do not contain any ACTIVE task definition revisions by setting the status parameter to ACTIVE. You can also filter the results with the familyPrefix parameter.
    */
  def listTaskDefinitionFamilies(params: ListTaskDefinitionFamiliesRequest): Request[ListTaskDefinitionFamiliesResponse, AWSError] = js.native
  def listTaskDefinitionFamilies(
    params: ListTaskDefinitionFamiliesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTaskDefinitionFamiliesResponse, Unit]
  ): Request[ListTaskDefinitionFamiliesResponse, AWSError] = js.native
  /**
    * Returns a list of task definitions that are registered to your account. You can filter the results by family name with the familyPrefix parameter or by status with the status parameter.
    */
  def listTaskDefinitions(): Request[ListTaskDefinitionsResponse, AWSError] = js.native
  def listTaskDefinitions(callback: js.Function2[/* err */ AWSError, /* data */ ListTaskDefinitionsResponse, Unit]): Request[ListTaskDefinitionsResponse, AWSError] = js.native
  /**
    * Returns a list of task definitions that are registered to your account. You can filter the results by family name with the familyPrefix parameter or by status with the status parameter.
    */
  def listTaskDefinitions(params: ListTaskDefinitionsRequest): Request[ListTaskDefinitionsResponse, AWSError] = js.native
  def listTaskDefinitions(
    params: ListTaskDefinitionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTaskDefinitionsResponse, Unit]
  ): Request[ListTaskDefinitionsResponse, AWSError] = js.native
  /**
    * Returns a list of tasks for a specified cluster. You can filter the results by family name, by a particular container instance, or by the desired status of the task with the family, containerInstance, and desiredStatus parameters. Recently stopped tasks might appear in the returned results. Currently, stopped tasks appear in the returned results for at least one hour. 
    */
  def listTasks(): Request[ListTasksResponse, AWSError] = js.native
  def listTasks(callback: js.Function2[/* err */ AWSError, /* data */ ListTasksResponse, Unit]): Request[ListTasksResponse, AWSError] = js.native
  /**
    * Returns a list of tasks for a specified cluster. You can filter the results by family name, by a particular container instance, or by the desired status of the task with the family, containerInstance, and desiredStatus parameters. Recently stopped tasks might appear in the returned results. Currently, stopped tasks appear in the returned results for at least one hour. 
    */
  def listTasks(params: ListTasksRequest): Request[ListTasksResponse, AWSError] = js.native
  def listTasks(
    params: ListTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTasksResponse, Unit]
  ): Request[ListTasksResponse, AWSError] = js.native
  /**
    * Modifies an account setting. Account settings are set on a per-Region basis. If you change the account setting for the root user, the default settings for all of the IAM users and roles for which no individual account setting has been specified are reset. For more information, see Account Settings in the Amazon Elastic Container Service Developer Guide. When serviceLongArnFormat, taskLongArnFormat, or containerInstanceLongArnFormat are specified, the Amazon Resource Name (ARN) and resource ID format of the resource type for a specified IAM user, IAM role, or the root user for an account is affected. The opt-in and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource will be defined by the opt-in status of the IAM user or role that created the resource. You must enable this setting to use Amazon ECS features such as resource tagging. When awsvpcTrunking is specified, the elastic network interface (ENI) limit for any new container instances that support the feature is changed. If awsvpcTrunking is enabled, any new container instances that support the feature are launched have the increased ENI limits available to them. For more information, see Elastic Network Interface Trunking in the Amazon Elastic Container Service Developer Guide. When containerInsights is specified, the default setting indicating whether CloudWatch Container Insights is enabled for your clusters is changed. If containerInsights is enabled, any new clusters that are created will have Container Insights enabled unless you disable it during cluster creation. For more information, see CloudWatch Container Insights in the Amazon Elastic Container Service Developer Guide.
    */
  def putAccountSetting(): Request[PutAccountSettingResponse, AWSError] = js.native
  def putAccountSetting(callback: js.Function2[/* err */ AWSError, /* data */ PutAccountSettingResponse, Unit]): Request[PutAccountSettingResponse, AWSError] = js.native
  /**
    * Modifies an account setting. Account settings are set on a per-Region basis. If you change the account setting for the root user, the default settings for all of the IAM users and roles for which no individual account setting has been specified are reset. For more information, see Account Settings in the Amazon Elastic Container Service Developer Guide. When serviceLongArnFormat, taskLongArnFormat, or containerInstanceLongArnFormat are specified, the Amazon Resource Name (ARN) and resource ID format of the resource type for a specified IAM user, IAM role, or the root user for an account is affected. The opt-in and opt-out account setting must be set for each Amazon ECS resource separately. The ARN and resource ID format of a resource will be defined by the opt-in status of the IAM user or role that created the resource. You must enable this setting to use Amazon ECS features such as resource tagging. When awsvpcTrunking is specified, the elastic network interface (ENI) limit for any new container instances that support the feature is changed. If awsvpcTrunking is enabled, any new container instances that support the feature are launched have the increased ENI limits available to them. For more information, see Elastic Network Interface Trunking in the Amazon Elastic Container Service Developer Guide. When containerInsights is specified, the default setting indicating whether CloudWatch Container Insights is enabled for your clusters is changed. If containerInsights is enabled, any new clusters that are created will have Container Insights enabled unless you disable it during cluster creation. For more information, see CloudWatch Container Insights in the Amazon Elastic Container Service Developer Guide.
    */
  def putAccountSetting(params: PutAccountSettingRequest): Request[PutAccountSettingResponse, AWSError] = js.native
  def putAccountSetting(
    params: PutAccountSettingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAccountSettingResponse, Unit]
  ): Request[PutAccountSettingResponse, AWSError] = js.native
  /**
    * Modifies an account setting for all IAM users on an account for whom no individual account setting has been specified. Account settings are set on a per-Region basis.
    */
  def putAccountSettingDefault(): Request[PutAccountSettingDefaultResponse, AWSError] = js.native
  def putAccountSettingDefault(callback: js.Function2[/* err */ AWSError, /* data */ PutAccountSettingDefaultResponse, Unit]): Request[PutAccountSettingDefaultResponse, AWSError] = js.native
  /**
    * Modifies an account setting for all IAM users on an account for whom no individual account setting has been specified. Account settings are set on a per-Region basis.
    */
  def putAccountSettingDefault(params: PutAccountSettingDefaultRequest): Request[PutAccountSettingDefaultResponse, AWSError] = js.native
  def putAccountSettingDefault(
    params: PutAccountSettingDefaultRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAccountSettingDefaultResponse, Unit]
  ): Request[PutAccountSettingDefaultResponse, AWSError] = js.native
  /**
    * Create or update an attribute on an Amazon ECS resource. If the attribute does not exist, it is created. If the attribute exists, its value is replaced with the specified value. To delete an attribute, use DeleteAttributes. For more information, see Attributes in the Amazon Elastic Container Service Developer Guide.
    */
  def putAttributes(): Request[PutAttributesResponse, AWSError] = js.native
  def putAttributes(callback: js.Function2[/* err */ AWSError, /* data */ PutAttributesResponse, Unit]): Request[PutAttributesResponse, AWSError] = js.native
  /**
    * Create or update an attribute on an Amazon ECS resource. If the attribute does not exist, it is created. If the attribute exists, its value is replaced with the specified value. To delete an attribute, use DeleteAttributes. For more information, see Attributes in the Amazon Elastic Container Service Developer Guide.
    */
  def putAttributes(params: PutAttributesRequest): Request[PutAttributesResponse, AWSError] = js.native
  def putAttributes(
    params: PutAttributesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutAttributesResponse, Unit]
  ): Request[PutAttributesResponse, AWSError] = js.native
  /**
    * Modifies the available capacity providers and the default capacity provider strategy for a cluster. You must specify both the available capacity providers and a default capacity provider strategy for the cluster. If the specified cluster has existing capacity providers associated with it, you must specify all existing capacity providers in addition to any new ones you want to add. Any existing capacity providers associated with a cluster that are omitted from a PutClusterCapacityProviders API call will be disassociated with the cluster. You can only disassociate an existing capacity provider from a cluster if it's not being used by any existing tasks. When creating a service or running a task on a cluster, if no capacity provider or launch type is specified, then the cluster's default capacity provider strategy is used. It is recommended to define a default capacity provider strategy for your cluster, however you may specify an empty array ([]) to bypass defining a default strategy.
    */
  def putClusterCapacityProviders(): Request[PutClusterCapacityProvidersResponse, AWSError] = js.native
  def putClusterCapacityProviders(callback: js.Function2[/* err */ AWSError, /* data */ PutClusterCapacityProvidersResponse, Unit]): Request[PutClusterCapacityProvidersResponse, AWSError] = js.native
  /**
    * Modifies the available capacity providers and the default capacity provider strategy for a cluster. You must specify both the available capacity providers and a default capacity provider strategy for the cluster. If the specified cluster has existing capacity providers associated with it, you must specify all existing capacity providers in addition to any new ones you want to add. Any existing capacity providers associated with a cluster that are omitted from a PutClusterCapacityProviders API call will be disassociated with the cluster. You can only disassociate an existing capacity provider from a cluster if it's not being used by any existing tasks. When creating a service or running a task on a cluster, if no capacity provider or launch type is specified, then the cluster's default capacity provider strategy is used. It is recommended to define a default capacity provider strategy for your cluster, however you may specify an empty array ([]) to bypass defining a default strategy.
    */
  def putClusterCapacityProviders(params: PutClusterCapacityProvidersRequest): Request[PutClusterCapacityProvidersResponse, AWSError] = js.native
  def putClusterCapacityProviders(
    params: PutClusterCapacityProvidersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutClusterCapacityProvidersResponse, Unit]
  ): Request[PutClusterCapacityProvidersResponse, AWSError] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Registers an EC2 instance into the specified cluster. This instance becomes available to place containers on.
    */
  def registerContainerInstance(): Request[RegisterContainerInstanceResponse, AWSError] = js.native
  def registerContainerInstance(callback: js.Function2[/* err */ AWSError, /* data */ RegisterContainerInstanceResponse, Unit]): Request[RegisterContainerInstanceResponse, AWSError] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Registers an EC2 instance into the specified cluster. This instance becomes available to place containers on.
    */
  def registerContainerInstance(params: RegisterContainerInstanceRequest): Request[RegisterContainerInstanceResponse, AWSError] = js.native
  def registerContainerInstance(
    params: RegisterContainerInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterContainerInstanceResponse, Unit]
  ): Request[RegisterContainerInstanceResponse, AWSError] = js.native
  /**
    * Registers a new task definition from the supplied family and containerDefinitions. Optionally, you can add data volumes to your containers with the volumes parameter. For more information about task definition parameters and defaults, see Amazon ECS Task Definitions in the Amazon Elastic Container Service Developer Guide. You can specify an IAM role for your task with the taskRoleArn parameter. When you specify an IAM role for a task, its containers can then use the latest versions of the AWS CLI or SDKs to make API requests to the AWS services that are specified in the IAM policy associated with the role. For more information, see IAM Roles for Tasks in the Amazon Elastic Container Service Developer Guide. You can specify a Docker networking mode for the containers in your task definition with the networkMode parameter. The available network modes correspond to those described in Network settings in the Docker run reference. If you specify the awsvpc network mode, the task is allocated an elastic network interface, and you must specify a NetworkConfiguration when you create a service or run a task with the task definition. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide.
    */
  def registerTaskDefinition(): Request[RegisterTaskDefinitionResponse, AWSError] = js.native
  def registerTaskDefinition(callback: js.Function2[/* err */ AWSError, /* data */ RegisterTaskDefinitionResponse, Unit]): Request[RegisterTaskDefinitionResponse, AWSError] = js.native
  /**
    * Registers a new task definition from the supplied family and containerDefinitions. Optionally, you can add data volumes to your containers with the volumes parameter. For more information about task definition parameters and defaults, see Amazon ECS Task Definitions in the Amazon Elastic Container Service Developer Guide. You can specify an IAM role for your task with the taskRoleArn parameter. When you specify an IAM role for a task, its containers can then use the latest versions of the AWS CLI or SDKs to make API requests to the AWS services that are specified in the IAM policy associated with the role. For more information, see IAM Roles for Tasks in the Amazon Elastic Container Service Developer Guide. You can specify a Docker networking mode for the containers in your task definition with the networkMode parameter. The available network modes correspond to those described in Network settings in the Docker run reference. If you specify the awsvpc network mode, the task is allocated an elastic network interface, and you must specify a NetworkConfiguration when you create a service or run a task with the task definition. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide.
    */
  def registerTaskDefinition(params: RegisterTaskDefinitionRequest): Request[RegisterTaskDefinitionResponse, AWSError] = js.native
  def registerTaskDefinition(
    params: RegisterTaskDefinitionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterTaskDefinitionResponse, Unit]
  ): Request[RegisterTaskDefinitionResponse, AWSError] = js.native
  /**
    * Starts a new task using the specified task definition. You can allow Amazon ECS to place tasks for you, or you can customize how Amazon ECS places tasks using placement constraints and placement strategies. For more information, see Scheduling Tasks in the Amazon Elastic Container Service Developer Guide. Alternatively, you can use StartTask to use your own scheduler or place tasks manually on specific container instances. The Amazon ECS API follows an eventual consistency model, due to the distributed nature of the system supporting the API. This means that the result of an API command you run that affects your Amazon ECS resources might not be immediately visible to all subsequent commands you run. Keep this in mind when you carry out an API command that immediately follows a previous API command. To manage eventual consistency, you can do the following:   Confirm the state of the resource before you run a command to modify it. Run the DescribeTasks command using an exponential backoff algorithm to ensure that you allow enough time for the previous command to propagate through the system. To do this, run the DescribeTasks command repeatedly, starting with a couple of seconds of wait time and increasing gradually up to five minutes of wait time.   Add wait time between subsequent commands, even if the DescribeTasks command returns an accurate response. Apply an exponential backoff algorithm starting with a couple of seconds of wait time, and increase gradually up to about five minutes of wait time.  
    */
  def runTask(): Request[RunTaskResponse, AWSError] = js.native
  def runTask(callback: js.Function2[/* err */ AWSError, /* data */ RunTaskResponse, Unit]): Request[RunTaskResponse, AWSError] = js.native
  /**
    * Starts a new task using the specified task definition. You can allow Amazon ECS to place tasks for you, or you can customize how Amazon ECS places tasks using placement constraints and placement strategies. For more information, see Scheduling Tasks in the Amazon Elastic Container Service Developer Guide. Alternatively, you can use StartTask to use your own scheduler or place tasks manually on specific container instances. The Amazon ECS API follows an eventual consistency model, due to the distributed nature of the system supporting the API. This means that the result of an API command you run that affects your Amazon ECS resources might not be immediately visible to all subsequent commands you run. Keep this in mind when you carry out an API command that immediately follows a previous API command. To manage eventual consistency, you can do the following:   Confirm the state of the resource before you run a command to modify it. Run the DescribeTasks command using an exponential backoff algorithm to ensure that you allow enough time for the previous command to propagate through the system. To do this, run the DescribeTasks command repeatedly, starting with a couple of seconds of wait time and increasing gradually up to five minutes of wait time.   Add wait time between subsequent commands, even if the DescribeTasks command returns an accurate response. Apply an exponential backoff algorithm starting with a couple of seconds of wait time, and increase gradually up to about five minutes of wait time.  
    */
  def runTask(params: RunTaskRequest): Request[RunTaskResponse, AWSError] = js.native
  def runTask(
    params: RunTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RunTaskResponse, Unit]
  ): Request[RunTaskResponse, AWSError] = js.native
  /**
    * Starts a new task from the specified task definition on the specified container instance or instances. Alternatively, you can use RunTask to place tasks for you. For more information, see Scheduling Tasks in the Amazon Elastic Container Service Developer Guide.
    */
  def startTask(): Request[StartTaskResponse, AWSError] = js.native
  def startTask(callback: js.Function2[/* err */ AWSError, /* data */ StartTaskResponse, Unit]): Request[StartTaskResponse, AWSError] = js.native
  /**
    * Starts a new task from the specified task definition on the specified container instance or instances. Alternatively, you can use RunTask to place tasks for you. For more information, see Scheduling Tasks in the Amazon Elastic Container Service Developer Guide.
    */
  def startTask(params: StartTaskRequest): Request[StartTaskResponse, AWSError] = js.native
  def startTask(
    params: StartTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTaskResponse, Unit]
  ): Request[StartTaskResponse, AWSError] = js.native
  /**
    * Stops a running task. Any tags associated with the task will be deleted. When StopTask is called on a task, the equivalent of docker stop is issued to the containers running in the task. This results in a SIGTERM value and a default 30-second timeout, after which the SIGKILL value is sent and the containers are forcibly stopped. If the container handles the SIGTERM value gracefully and exits within 30 seconds from receiving it, no SIGKILL value is sent.  The default 30-second timeout can be configured on the Amazon ECS container agent with the ECS_CONTAINER_STOP_TIMEOUT variable. For more information, see Amazon ECS Container Agent Configuration in the Amazon Elastic Container Service Developer Guide. 
    */
  def stopTask(): Request[StopTaskResponse, AWSError] = js.native
  def stopTask(callback: js.Function2[/* err */ AWSError, /* data */ StopTaskResponse, Unit]): Request[StopTaskResponse, AWSError] = js.native
  /**
    * Stops a running task. Any tags associated with the task will be deleted. When StopTask is called on a task, the equivalent of docker stop is issued to the containers running in the task. This results in a SIGTERM value and a default 30-second timeout, after which the SIGKILL value is sent and the containers are forcibly stopped. If the container handles the SIGTERM value gracefully and exits within 30 seconds from receiving it, no SIGKILL value is sent.  The default 30-second timeout can be configured on the Amazon ECS container agent with the ECS_CONTAINER_STOP_TIMEOUT variable. For more information, see Amazon ECS Container Agent Configuration in the Amazon Elastic Container Service Developer Guide. 
    */
  def stopTask(params: StopTaskRequest): Request[StopTaskResponse, AWSError] = js.native
  def stopTask(
    params: StopTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopTaskResponse, Unit]
  ): Request[StopTaskResponse, AWSError] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Sent to acknowledge that an attachment changed states.
    */
  def submitAttachmentStateChanges(): Request[SubmitAttachmentStateChangesResponse, AWSError] = js.native
  def submitAttachmentStateChanges(callback: js.Function2[/* err */ AWSError, /* data */ SubmitAttachmentStateChangesResponse, Unit]): Request[SubmitAttachmentStateChangesResponse, AWSError] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Sent to acknowledge that an attachment changed states.
    */
  def submitAttachmentStateChanges(params: SubmitAttachmentStateChangesRequest): Request[SubmitAttachmentStateChangesResponse, AWSError] = js.native
  def submitAttachmentStateChanges(
    params: SubmitAttachmentStateChangesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SubmitAttachmentStateChangesResponse, Unit]
  ): Request[SubmitAttachmentStateChangesResponse, AWSError] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Sent to acknowledge that a container changed states.
    */
  def submitContainerStateChange(): Request[SubmitContainerStateChangeResponse, AWSError] = js.native
  def submitContainerStateChange(callback: js.Function2[/* err */ AWSError, /* data */ SubmitContainerStateChangeResponse, Unit]): Request[SubmitContainerStateChangeResponse, AWSError] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Sent to acknowledge that a container changed states.
    */
  def submitContainerStateChange(params: SubmitContainerStateChangeRequest): Request[SubmitContainerStateChangeResponse, AWSError] = js.native
  def submitContainerStateChange(
    params: SubmitContainerStateChangeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SubmitContainerStateChangeResponse, Unit]
  ): Request[SubmitContainerStateChangeResponse, AWSError] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Sent to acknowledge that a task changed states.
    */
  def submitTaskStateChange(): Request[SubmitTaskStateChangeResponse, AWSError] = js.native
  def submitTaskStateChange(callback: js.Function2[/* err */ AWSError, /* data */ SubmitTaskStateChangeResponse, Unit]): Request[SubmitTaskStateChangeResponse, AWSError] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Sent to acknowledge that a task changed states.
    */
  def submitTaskStateChange(params: SubmitTaskStateChangeRequest): Request[SubmitTaskStateChangeResponse, AWSError] = js.native
  def submitTaskStateChange(
    params: SubmitTaskStateChangeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SubmitTaskStateChangeResponse, Unit]
  ): Request[SubmitTaskStateChangeResponse, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Modifies the settings to use for a cluster.
    */
  def updateClusterSettings(): Request[UpdateClusterSettingsResponse, AWSError] = js.native
  def updateClusterSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterSettingsResponse, Unit]): Request[UpdateClusterSettingsResponse, AWSError] = js.native
  /**
    * Modifies the settings to use for a cluster.
    */
  def updateClusterSettings(params: UpdateClusterSettingsRequest): Request[UpdateClusterSettingsResponse, AWSError] = js.native
  def updateClusterSettings(
    params: UpdateClusterSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateClusterSettingsResponse, Unit]
  ): Request[UpdateClusterSettingsResponse, AWSError] = js.native
  /**
    * Updates the Amazon ECS container agent on a specified container instance. Updating the Amazon ECS container agent does not interrupt running tasks or services on the container instance. The process for updating the agent differs depending on whether your container instance was launched with the Amazon ECS-optimized AMI or another operating system.  UpdateContainerAgent requires the Amazon ECS-optimized AMI or Amazon Linux with the ecs-init service installed and running. For help updating the Amazon ECS container agent on other operating systems, see Manually Updating the Amazon ECS Container Agent in the Amazon Elastic Container Service Developer Guide.
    */
  def updateContainerAgent(): Request[UpdateContainerAgentResponse, AWSError] = js.native
  def updateContainerAgent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContainerAgentResponse, Unit]): Request[UpdateContainerAgentResponse, AWSError] = js.native
  /**
    * Updates the Amazon ECS container agent on a specified container instance. Updating the Amazon ECS container agent does not interrupt running tasks or services on the container instance. The process for updating the agent differs depending on whether your container instance was launched with the Amazon ECS-optimized AMI or another operating system.  UpdateContainerAgent requires the Amazon ECS-optimized AMI or Amazon Linux with the ecs-init service installed and running. For help updating the Amazon ECS container agent on other operating systems, see Manually Updating the Amazon ECS Container Agent in the Amazon Elastic Container Service Developer Guide.
    */
  def updateContainerAgent(params: UpdateContainerAgentRequest): Request[UpdateContainerAgentResponse, AWSError] = js.native
  def updateContainerAgent(
    params: UpdateContainerAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContainerAgentResponse, Unit]
  ): Request[UpdateContainerAgentResponse, AWSError] = js.native
  /**
    * Modifies the status of an Amazon ECS container instance. Once a container instance has reached an ACTIVE state, you can change the status of a container instance to DRAINING to manually remove an instance from a cluster, for example to perform system updates, update the Docker daemon, or scale down the cluster size.  A container instance cannot be changed to DRAINING until it has reached an ACTIVE status. If the instance is in any other status, an error will be received.  When you set a container instance to DRAINING, Amazon ECS prevents new tasks from being scheduled for placement on the container instance and replacement service tasks are started on other container instances in the cluster if the resources are available. Service tasks on the container instance that are in the PENDING state are stopped immediately. Service tasks on the container instance that are in the RUNNING state are stopped and replaced according to the service's deployment configuration parameters, minimumHealthyPercent and maximumPercent. You can change the deployment configuration of your service using UpdateService.   If minimumHealthyPercent is below 100%, the scheduler can ignore desiredCount temporarily during task replacement. For example, desiredCount is four tasks, a minimum of 50% allows the scheduler to stop two existing tasks before starting two new tasks. If the minimum is 100%, the service scheduler can't remove existing tasks until the replacement tasks are considered healthy. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state. Tasks for services that use a load balancer are considered healthy if they are in the RUNNING state and the container instance they are hosted on is reported as healthy by the load balancer.   The maximumPercent parameter represents an upper limit on the number of running tasks during task replacement, which enables you to define the replacement batch size. For example, if desiredCount is four tasks, a maximum of 200% starts four new tasks before stopping the four tasks to be drained, provided that the cluster resources required to do this are available. If the maximum is 100%, then replacement tasks can't start until the draining tasks have stopped.   Any PENDING or RUNNING tasks that do not belong to a service are not affected. You must wait for them to finish or stop them manually. A container instance has completed draining when it has no more RUNNING tasks. You can verify this using ListTasks. When a container instance has been drained, you can set a container instance to ACTIVE status and once it has reached that status the Amazon ECS scheduler can begin scheduling tasks on the instance again.
    */
  def updateContainerInstancesState(): Request[UpdateContainerInstancesStateResponse, AWSError] = js.native
  def updateContainerInstancesState(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContainerInstancesStateResponse, Unit]): Request[UpdateContainerInstancesStateResponse, AWSError] = js.native
  /**
    * Modifies the status of an Amazon ECS container instance. Once a container instance has reached an ACTIVE state, you can change the status of a container instance to DRAINING to manually remove an instance from a cluster, for example to perform system updates, update the Docker daemon, or scale down the cluster size.  A container instance cannot be changed to DRAINING until it has reached an ACTIVE status. If the instance is in any other status, an error will be received.  When you set a container instance to DRAINING, Amazon ECS prevents new tasks from being scheduled for placement on the container instance and replacement service tasks are started on other container instances in the cluster if the resources are available. Service tasks on the container instance that are in the PENDING state are stopped immediately. Service tasks on the container instance that are in the RUNNING state are stopped and replaced according to the service's deployment configuration parameters, minimumHealthyPercent and maximumPercent. You can change the deployment configuration of your service using UpdateService.   If minimumHealthyPercent is below 100%, the scheduler can ignore desiredCount temporarily during task replacement. For example, desiredCount is four tasks, a minimum of 50% allows the scheduler to stop two existing tasks before starting two new tasks. If the minimum is 100%, the service scheduler can't remove existing tasks until the replacement tasks are considered healthy. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state. Tasks for services that use a load balancer are considered healthy if they are in the RUNNING state and the container instance they are hosted on is reported as healthy by the load balancer.   The maximumPercent parameter represents an upper limit on the number of running tasks during task replacement, which enables you to define the replacement batch size. For example, if desiredCount is four tasks, a maximum of 200% starts four new tasks before stopping the four tasks to be drained, provided that the cluster resources required to do this are available. If the maximum is 100%, then replacement tasks can't start until the draining tasks have stopped.   Any PENDING or RUNNING tasks that do not belong to a service are not affected. You must wait for them to finish or stop them manually. A container instance has completed draining when it has no more RUNNING tasks. You can verify this using ListTasks. When a container instance has been drained, you can set a container instance to ACTIVE status and once it has reached that status the Amazon ECS scheduler can begin scheduling tasks on the instance again.
    */
  def updateContainerInstancesState(params: UpdateContainerInstancesStateRequest): Request[UpdateContainerInstancesStateResponse, AWSError] = js.native
  def updateContainerInstancesState(
    params: UpdateContainerInstancesStateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContainerInstancesStateResponse, Unit]
  ): Request[UpdateContainerInstancesStateResponse, AWSError] = js.native
  /**
    * Modifies the parameters of a service. For services using the rolling update (ECS) deployment controller, the desired count, deployment configuration, network configuration, or task definition used can be updated. For services using the blue/green (CODE_DEPLOY) deployment controller, only the desired count, deployment configuration, and health check grace period can be updated using this API. If the network configuration, platform version, or task definition need to be updated, a new AWS CodeDeploy deployment should be created. For more information, see CreateDeployment in the AWS CodeDeploy API Reference. For services using an external deployment controller, you can update only the desired count and health check grace period using this API. If the launch type, load balancer, network configuration, platform version, or task definition need to be updated, you should create a new task set. For more information, see CreateTaskSet. You can add to or subtract from the number of instantiations of a task definition in a service by specifying the cluster that the service is running in and a new desiredCount parameter. If you have updated the Docker image of your application, you can create a new task definition with that image and deploy it to your service. The service scheduler uses the minimum healthy percent and maximum percent parameters (in the service's deployment configuration) to determine the deployment strategy.  If your updated Docker image uses the same tag as what is in the existing task definition for your service (for example, my_image:latest), you do not need to create a new revision of your task definition. You can update the service using the forceNewDeployment option. The new tasks launched by the deployment pull the current image/tag combination from your repository when they start.  You can also update the deployment configuration of a service. When a deployment is triggered by updating the task definition of a service, the service scheduler uses the deployment configuration parameters, minimumHealthyPercent and maximumPercent, to determine the deployment strategy.   If minimumHealthyPercent is below 100%, the scheduler can ignore desiredCount temporarily during a deployment. For example, if desiredCount is four tasks, a minimum of 50% allows the scheduler to stop two existing tasks before starting two new tasks. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state. Tasks for services that use a load balancer are considered healthy if they are in the RUNNING state and the container instance they are hosted on is reported as healthy by the load balancer.   The maximumPercent parameter represents an upper limit on the number of running tasks during a deployment, which enables you to define the deployment batch size. For example, if desiredCount is four tasks, a maximum of 200% starts four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are available).   When UpdateService stops a task during a deployment, the equivalent of docker stop is issued to the containers running in the task. This results in a SIGTERM and a 30-second timeout, after which SIGKILL is sent and the containers are forcibly stopped. If the container handles the SIGTERM gracefully and exits within 30 seconds from receiving it, no SIGKILL is sent. When the service scheduler launches new tasks, it determines task placement in your cluster with the following logic:   Determine which of the container instances in your cluster can support your service's task definition (for example, they have the required CPU, memory, ports, and container instance attributes).   By default, the service scheduler attempts to balance tasks across Availability Zones in this manner (although you can choose a different placement strategy):   Sort the valid container instances by the fewest number of running tasks for this service in the same Availability Zone as the instance. For example, if zone A has one running service task and zones B and C each have zero, valid container instances in either zone B or C are considered optimal for placement.   Place the new service task on a valid container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the fewest number of running tasks for this service.     When the service scheduler stops running tasks, it attempts to maintain balance across the Availability Zones in your cluster using the following logic:    Sort the container instances by the largest number of running tasks for this service in the same Availability Zone as the instance. For example, if zone A has one running service task and zones B and C each have two, container instances in either zone B or C are considered optimal for termination.   Stop the task on a container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the largest number of running tasks for this service.  
    */
  def updateService(): Request[UpdateServiceResponse, AWSError] = js.native
  def updateService(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceResponse, Unit]): Request[UpdateServiceResponse, AWSError] = js.native
  /**
    * Modifies the parameters of a service. For services using the rolling update (ECS) deployment controller, the desired count, deployment configuration, network configuration, or task definition used can be updated. For services using the blue/green (CODE_DEPLOY) deployment controller, only the desired count, deployment configuration, and health check grace period can be updated using this API. If the network configuration, platform version, or task definition need to be updated, a new AWS CodeDeploy deployment should be created. For more information, see CreateDeployment in the AWS CodeDeploy API Reference. For services using an external deployment controller, you can update only the desired count and health check grace period using this API. If the launch type, load balancer, network configuration, platform version, or task definition need to be updated, you should create a new task set. For more information, see CreateTaskSet. You can add to or subtract from the number of instantiations of a task definition in a service by specifying the cluster that the service is running in and a new desiredCount parameter. If you have updated the Docker image of your application, you can create a new task definition with that image and deploy it to your service. The service scheduler uses the minimum healthy percent and maximum percent parameters (in the service's deployment configuration) to determine the deployment strategy.  If your updated Docker image uses the same tag as what is in the existing task definition for your service (for example, my_image:latest), you do not need to create a new revision of your task definition. You can update the service using the forceNewDeployment option. The new tasks launched by the deployment pull the current image/tag combination from your repository when they start.  You can also update the deployment configuration of a service. When a deployment is triggered by updating the task definition of a service, the service scheduler uses the deployment configuration parameters, minimumHealthyPercent and maximumPercent, to determine the deployment strategy.   If minimumHealthyPercent is below 100%, the scheduler can ignore desiredCount temporarily during a deployment. For example, if desiredCount is four tasks, a minimum of 50% allows the scheduler to stop two existing tasks before starting two new tasks. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state. Tasks for services that use a load balancer are considered healthy if they are in the RUNNING state and the container instance they are hosted on is reported as healthy by the load balancer.   The maximumPercent parameter represents an upper limit on the number of running tasks during a deployment, which enables you to define the deployment batch size. For example, if desiredCount is four tasks, a maximum of 200% starts four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are available).   When UpdateService stops a task during a deployment, the equivalent of docker stop is issued to the containers running in the task. This results in a SIGTERM and a 30-second timeout, after which SIGKILL is sent and the containers are forcibly stopped. If the container handles the SIGTERM gracefully and exits within 30 seconds from receiving it, no SIGKILL is sent. When the service scheduler launches new tasks, it determines task placement in your cluster with the following logic:   Determine which of the container instances in your cluster can support your service's task definition (for example, they have the required CPU, memory, ports, and container instance attributes).   By default, the service scheduler attempts to balance tasks across Availability Zones in this manner (although you can choose a different placement strategy):   Sort the valid container instances by the fewest number of running tasks for this service in the same Availability Zone as the instance. For example, if zone A has one running service task and zones B and C each have zero, valid container instances in either zone B or C are considered optimal for placement.   Place the new service task on a valid container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the fewest number of running tasks for this service.     When the service scheduler stops running tasks, it attempts to maintain balance across the Availability Zones in your cluster using the following logic:    Sort the container instances by the largest number of running tasks for this service in the same Availability Zone as the instance. For example, if zone A has one running service task and zones B and C each have two, container instances in either zone B or C are considered optimal for termination.   Stop the task on a container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the largest number of running tasks for this service.  
    */
  def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse, AWSError] = js.native
  def updateService(
    params: UpdateServiceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServiceResponse, Unit]
  ): Request[UpdateServiceResponse, AWSError] = js.native
  /**
    * Modifies which task set in a service is the primary task set. Any parameters that are updated on the primary task set in a service will transition to the service. This is used when a service uses the EXTERNAL deployment controller type. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide.
    */
  def updateServicePrimaryTaskSet(): Request[UpdateServicePrimaryTaskSetResponse, AWSError] = js.native
  def updateServicePrimaryTaskSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateServicePrimaryTaskSetResponse, Unit]): Request[UpdateServicePrimaryTaskSetResponse, AWSError] = js.native
  /**
    * Modifies which task set in a service is the primary task set. Any parameters that are updated on the primary task set in a service will transition to the service. This is used when a service uses the EXTERNAL deployment controller type. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide.
    */
  def updateServicePrimaryTaskSet(params: UpdateServicePrimaryTaskSetRequest): Request[UpdateServicePrimaryTaskSetResponse, AWSError] = js.native
  def updateServicePrimaryTaskSet(
    params: UpdateServicePrimaryTaskSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateServicePrimaryTaskSetResponse, Unit]
  ): Request[UpdateServicePrimaryTaskSetResponse, AWSError] = js.native
  /**
    * Modifies a task set. This is used when a service uses the EXTERNAL deployment controller type. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide.
    */
  def updateTaskSet(): Request[UpdateTaskSetResponse, AWSError] = js.native
  def updateTaskSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskSetResponse, Unit]): Request[UpdateTaskSetResponse, AWSError] = js.native
  /**
    * Modifies a task set. This is used when a service uses the EXTERNAL deployment controller type. For more information, see Amazon ECS Deployment Types in the Amazon Elastic Container Service Developer Guide.
    */
  def updateTaskSet(params: UpdateTaskSetRequest): Request[UpdateTaskSetResponse, AWSError] = js.native
  def updateTaskSet(
    params: UpdateTaskSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskSetResponse, Unit]
  ): Request[UpdateTaskSetResponse, AWSError] = js.native
  /**
    * Waits for the servicesInactive state by periodically calling the underlying ECS.describeServicesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_servicesInactive(state: servicesInactive): Request[DescribeServicesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_servicesInactive(
    state: servicesInactive,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]
  ): Request[DescribeServicesResponse, AWSError] = js.native
  /**
    * Waits for the servicesInactive state by periodically calling the underlying ECS.describeServicesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_servicesInactive(state: servicesInactive, params: DescribeServicesRequestwa): Request[DescribeServicesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_servicesInactive(
    state: servicesInactive,
    params: DescribeServicesRequestwa,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]
  ): Request[DescribeServicesResponse, AWSError] = js.native
  /**
    * Waits for the servicesStable state by periodically calling the underlying ECS.describeServicesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_servicesStable(state: servicesStable): Request[DescribeServicesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_servicesStable(
    state: servicesStable,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]
  ): Request[DescribeServicesResponse, AWSError] = js.native
  /**
    * Waits for the servicesStable state by periodically calling the underlying ECS.describeServicesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_servicesStable(state: servicesStable, params: DescribeServicesRequestwa): Request[DescribeServicesResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_servicesStable(
    state: servicesStable,
    params: DescribeServicesRequestwa,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]
  ): Request[DescribeServicesResponse, AWSError] = js.native
  /**
    * Waits for the tasksRunning state by periodically calling the underlying ECS.describeTasksoperation every 6 seconds (at most 100 times).
    */
  @JSName("waitFor")
  def waitFor_tasksRunning(state: tasksRunning): Request[DescribeTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_tasksRunning(
    state: tasksRunning,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTasksResponse, Unit]
  ): Request[DescribeTasksResponse, AWSError] = js.native
  /**
    * Waits for the tasksRunning state by periodically calling the underlying ECS.describeTasksoperation every 6 seconds (at most 100 times).
    */
  @JSName("waitFor")
  def waitFor_tasksRunning(state: tasksRunning, params: DescribeTasksRequestwaite): Request[DescribeTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_tasksRunning(
    state: tasksRunning,
    params: DescribeTasksRequestwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTasksResponse, Unit]
  ): Request[DescribeTasksResponse, AWSError] = js.native
  /**
    * Waits for the tasksStopped state by periodically calling the underlying ECS.describeTasksoperation every 6 seconds (at most 100 times).
    */
  @JSName("waitFor")
  def waitFor_tasksStopped(state: tasksStopped): Request[DescribeTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_tasksStopped(
    state: tasksStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTasksResponse, Unit]
  ): Request[DescribeTasksResponse, AWSError] = js.native
  /**
    * Waits for the tasksStopped state by periodically calling the underlying ECS.describeTasksoperation every 6 seconds (at most 100 times).
    */
  @JSName("waitFor")
  def waitFor_tasksStopped(state: tasksStopped, params: DescribeTasksRequestwaite): Request[DescribeTasksResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_tasksStopped(
    state: tasksStopped,
    params: DescribeTasksRequestwaite,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTasksResponse, Unit]
  ): Request[DescribeTasksResponse, AWSError] = js.native
}

