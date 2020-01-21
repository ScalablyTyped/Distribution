package typings.awsSdk.datasyncMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSync extends Service {
  @JSName("config")
  var config_DataSync: ConfigBase with ClientConfiguration = js.native
  /**
    * Cancels execution of a task.  When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that are transferred to the destination might be incomplete or inconsistent with the source files. However, if you start a new task execution on the same task and you allow the task execution to complete, file content on the destination is complete and consistent. This applies to other unexpected failures that interrupt a task execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task execution.
    */
  def cancelTaskExecution(): Request[CancelTaskExecutionResponse, AWSError] = js.native
  def cancelTaskExecution(callback: js.Function2[/* err */ AWSError, /* data */ CancelTaskExecutionResponse, Unit]): Request[CancelTaskExecutionResponse, AWSError] = js.native
  /**
    * Cancels execution of a task.  When you cancel a task execution, the transfer of some files are abruptly interrupted. The contents of files that are transferred to the destination might be incomplete or inconsistent with the source files. However, if you start a new task execution on the same task and you allow the task execution to complete, file content on the destination is complete and consistent. This applies to other unexpected failures that interrupt a task execution. In all of these cases, AWS DataSync successfully complete the transfer when you start the next task execution.
    */
  def cancelTaskExecution(params: CancelTaskExecutionRequest): Request[CancelTaskExecutionResponse, AWSError] = js.native
  def cancelTaskExecution(
    params: CancelTaskExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelTaskExecutionResponse, Unit]
  ): Request[CancelTaskExecutionResponse, AWSError] = js.native
  /**
    * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent with your account. In the activation process, you specify information such as the AWS Region that you want to activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this AWS Region. You can activate the agent in a VPC (Virtual private Cloud) or provide the agent access to a VPC endpoint so you can run tasks without going over the public Internet. You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents must be AVAILABLE for the task to run.  Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption to your tasks. 
    */
  def createAgent(): Request[CreateAgentResponse, AWSError] = js.native
  def createAgent(callback: js.Function2[/* err */ AWSError, /* data */ CreateAgentResponse, Unit]): Request[CreateAgentResponse, AWSError] = js.native
  /**
    * Activates an AWS DataSync agent that you have deployed on your host. The activation process associates your agent with your account. In the activation process, you specify information such as the AWS Region that you want to activate the agent in. You activate the agent in the AWS Region where your target locations (in Amazon S3 or Amazon EFS) reside. Your tasks are created in this AWS Region. You can activate the agent in a VPC (Virtual private Cloud) or provide the agent access to a VPC endpoint so you can run tasks without going over the public Internet. You can use an agent for more than one location. If a task uses multiple agents, all of them need to have status AVAILABLE for the task to run. If you use multiple agents for a source location, the status of all the agents must be AVAILABLE for the task to run.  Agents are automatically updated by AWS on a regular basis, using a mechanism that ensures minimal interruption to your tasks. 
    */
  def createAgent(params: CreateAgentRequest): Request[CreateAgentResponse, AWSError] = js.native
  def createAgent(
    params: CreateAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAgentResponse, Unit]
  ): Request[CreateAgentResponse, AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon EFS file system.
    */
  def createLocationEfs(): Request[CreateLocationEfsResponse, AWSError] = js.native
  def createLocationEfs(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationEfsResponse, Unit]): Request[CreateLocationEfsResponse, AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon EFS file system.
    */
  def createLocationEfs(params: CreateLocationEfsRequest): Request[CreateLocationEfsResponse, AWSError] = js.native
  def createLocationEfs(
    params: CreateLocationEfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationEfsResponse, Unit]
  ): Request[CreateLocationEfsResponse, AWSError] = js.native
  /**
    * Defines a file system on a Network File System (NFS) server that can be read from or written to
    */
  def createLocationNfs(): Request[CreateLocationNfsResponse, AWSError] = js.native
  def createLocationNfs(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationNfsResponse, Unit]): Request[CreateLocationNfsResponse, AWSError] = js.native
  /**
    * Defines a file system on a Network File System (NFS) server that can be read from or written to
    */
  def createLocationNfs(params: CreateLocationNfsRequest): Request[CreateLocationNfsResponse, AWSError] = js.native
  def createLocationNfs(
    params: CreateLocationNfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationNfsResponse, Unit]
  ): Request[CreateLocationNfsResponse, AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon S3 bucket. For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role that has the required permissions. You can set up the required permissions by creating an IAM policy that grants the required permissions and attaching the policy to the role. An example of such a policy is shown in the examples section. For more information, see https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location in the AWS DataSync User Guide. 
    */
  def createLocationS3(): Request[CreateLocationS3Response, AWSError] = js.native
  def createLocationS3(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationS3Response, Unit]): Request[CreateLocationS3Response, AWSError] = js.native
  /**
    * Creates an endpoint for an Amazon S3 bucket. For AWS DataSync to access a destination S3 bucket, it needs an AWS Identity and Access Management (IAM) role that has the required permissions. You can set up the required permissions by creating an IAM policy that grants the required permissions and attaching the policy to the role. An example of such a policy is shown in the examples section. For more information, see https://docs.aws.amazon.com/datasync/latest/userguide/working-with-locations.html#create-s3-location in the AWS DataSync User Guide. 
    */
  def createLocationS3(params: CreateLocationS3Request): Request[CreateLocationS3Response, AWSError] = js.native
  def createLocationS3(
    params: CreateLocationS3Request,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationS3Response, Unit]
  ): Request[CreateLocationS3Response, AWSError] = js.native
  /**
    * Defines a file system on an Server Message Block (SMB) server that can be read from or written to.
    */
  def createLocationSmb(): Request[CreateLocationSmbResponse, AWSError] = js.native
  def createLocationSmb(callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationSmbResponse, Unit]): Request[CreateLocationSmbResponse, AWSError] = js.native
  /**
    * Defines a file system on an Server Message Block (SMB) server that can be read from or written to.
    */
  def createLocationSmb(params: CreateLocationSmbRequest): Request[CreateLocationSmbResponse, AWSError] = js.native
  def createLocationSmb(
    params: CreateLocationSmbRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLocationSmbResponse, Unit]
  ): Request[CreateLocationSmbResponse, AWSError] = js.native
  /**
    * Creates a task. A task is a set of two locations (source and destination) and a set of Options that you use to control the behavior of a task. If you don't specify Options when you create a task, AWS DataSync populates them with service defaults. When you create a task, it first enters the CREATING state. During CREATING AWS DataSync attempts to mount the on-premises Network File System (NFS) location. The task transitions to the AVAILABLE state without waiting for the AWS location to become mounted. If required, AWS DataSync mounts the AWS location before each task execution. If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your agent might be having trouble mounting the source NFS file system. Check the task's ErrorCode and ErrorDetail. Mount issues are often caused by either a misconfigured firewall or a mistyped NFS server host name.
    */
  def createTask(): Request[CreateTaskResponse, AWSError] = js.native
  def createTask(callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskResponse, Unit]): Request[CreateTaskResponse, AWSError] = js.native
  /**
    * Creates a task. A task is a set of two locations (source and destination) and a set of Options that you use to control the behavior of a task. If you don't specify Options when you create a task, AWS DataSync populates them with service defaults. When you create a task, it first enters the CREATING state. During CREATING AWS DataSync attempts to mount the on-premises Network File System (NFS) location. The task transitions to the AVAILABLE state without waiting for the AWS location to become mounted. If required, AWS DataSync mounts the AWS location before each task execution. If an agent that is associated with a source (NFS) location goes offline, the task transitions to the UNAVAILABLE status. If the status of the task remains in the CREATING status for more than a few minutes, it means that your agent might be having trouble mounting the source NFS file system. Check the task's ErrorCode and ErrorDetail. Mount issues are often caused by either a misconfigured firewall or a mistyped NFS server host name.
    */
  def createTask(params: CreateTaskRequest): Request[CreateTaskResponse, AWSError] = js.native
  def createTask(
    params: CreateTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTaskResponse, Unit]
  ): Request[CreateTaskResponse, AWSError] = js.native
  /**
    * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent virtual machine (VM) from your on-premises environment.
    */
  def deleteAgent(): Request[DeleteAgentResponse, AWSError] = js.native
  def deleteAgent(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAgentResponse, Unit]): Request[DeleteAgentResponse, AWSError] = js.native
  /**
    * Deletes an agent. To specify which agent to delete, use the Amazon Resource Name (ARN) of the agent in your request. The operation disassociates the agent from your AWS account. However, it doesn't delete the agent virtual machine (VM) from your on-premises environment.
    */
  def deleteAgent(params: DeleteAgentRequest): Request[DeleteAgentResponse, AWSError] = js.native
  def deleteAgent(
    params: DeleteAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAgentResponse, Unit]
  ): Request[DeleteAgentResponse, AWSError] = js.native
  /**
    * Deletes the configuration of a location used by AWS DataSync. 
    */
  def deleteLocation(): Request[DeleteLocationResponse, AWSError] = js.native
  def deleteLocation(callback: js.Function2[/* err */ AWSError, /* data */ DeleteLocationResponse, Unit]): Request[DeleteLocationResponse, AWSError] = js.native
  /**
    * Deletes the configuration of a location used by AWS DataSync. 
    */
  def deleteLocation(params: DeleteLocationRequest): Request[DeleteLocationResponse, AWSError] = js.native
  def deleteLocation(
    params: DeleteLocationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteLocationResponse, Unit]
  ): Request[DeleteLocationResponse, AWSError] = js.native
  /**
    * Deletes a task.
    */
  def deleteTask(): Request[DeleteTaskResponse, AWSError] = js.native
  def deleteTask(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTaskResponse, Unit]): Request[DeleteTaskResponse, AWSError] = js.native
  /**
    * Deletes a task.
    */
  def deleteTask(params: DeleteTaskRequest): Request[DeleteTaskResponse, AWSError] = js.native
  def deleteTask(
    params: DeleteTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTaskResponse, Unit]
  ): Request[DeleteTaskResponse, AWSError] = js.native
  /**
    * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your request. 
    */
  def describeAgent(): Request[DescribeAgentResponse, AWSError] = js.native
  def describeAgent(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentResponse, Unit]): Request[DescribeAgentResponse, AWSError] = js.native
  /**
    * Returns metadata such as the name, the network interfaces, and the status (that is, whether the agent is running or not) for an agent. To specify which agent to describe, use the Amazon Resource Name (ARN) of the agent in your request. 
    */
  def describeAgent(params: DescribeAgentRequest): Request[DescribeAgentResponse, AWSError] = js.native
  def describeAgent(
    params: DescribeAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentResponse, Unit]
  ): Request[DescribeAgentResponse, AWSError] = js.native
  /**
    * Returns metadata, such as the path information about an Amazon EFS location.
    */
  def describeLocationEfs(): Request[DescribeLocationEfsResponse, AWSError] = js.native
  def describeLocationEfs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationEfsResponse, Unit]): Request[DescribeLocationEfsResponse, AWSError] = js.native
  /**
    * Returns metadata, such as the path information about an Amazon EFS location.
    */
  def describeLocationEfs(params: DescribeLocationEfsRequest): Request[DescribeLocationEfsResponse, AWSError] = js.native
  def describeLocationEfs(
    params: DescribeLocationEfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationEfsResponse, Unit]
  ): Request[DescribeLocationEfsResponse, AWSError] = js.native
  /**
    * Returns metadata, such as the path information, about a NFS location.
    */
  def describeLocationNfs(): Request[DescribeLocationNfsResponse, AWSError] = js.native
  def describeLocationNfs(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationNfsResponse, Unit]): Request[DescribeLocationNfsResponse, AWSError] = js.native
  /**
    * Returns metadata, such as the path information, about a NFS location.
    */
  def describeLocationNfs(params: DescribeLocationNfsRequest): Request[DescribeLocationNfsResponse, AWSError] = js.native
  def describeLocationNfs(
    params: DescribeLocationNfsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationNfsResponse, Unit]
  ): Request[DescribeLocationNfsResponse, AWSError] = js.native
  /**
    * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
    */
  def describeLocationS3(): Request[DescribeLocationS3Response, AWSError] = js.native
  def describeLocationS3(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationS3Response, Unit]): Request[DescribeLocationS3Response, AWSError] = js.native
  /**
    * Returns metadata, such as bucket name, about an Amazon S3 bucket location.
    */
  def describeLocationS3(params: DescribeLocationS3Request): Request[DescribeLocationS3Response, AWSError] = js.native
  def describeLocationS3(
    params: DescribeLocationS3Request,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationS3Response, Unit]
  ): Request[DescribeLocationS3Response, AWSError] = js.native
  /**
    * Returns metadata, such as the path and user information about a SMB location.
    */
  def describeLocationSmb(): Request[DescribeLocationSmbResponse, AWSError] = js.native
  def describeLocationSmb(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationSmbResponse, Unit]): Request[DescribeLocationSmbResponse, AWSError] = js.native
  /**
    * Returns metadata, such as the path and user information about a SMB location.
    */
  def describeLocationSmb(params: DescribeLocationSmbRequest): Request[DescribeLocationSmbResponse, AWSError] = js.native
  def describeLocationSmb(
    params: DescribeLocationSmbRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLocationSmbResponse, Unit]
  ): Request[DescribeLocationSmbResponse, AWSError] = js.native
  /**
    * Returns metadata about a task.
    */
  def describeTask(): Request[DescribeTaskResponse, AWSError] = js.native
  def describeTask(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskResponse, Unit]): Request[DescribeTaskResponse, AWSError] = js.native
  /**
    * Returns metadata about a task.
    */
  def describeTask(params: DescribeTaskRequest): Request[DescribeTaskResponse, AWSError] = js.native
  def describeTask(
    params: DescribeTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskResponse, Unit]
  ): Request[DescribeTaskResponse, AWSError] = js.native
  /**
    * Returns detailed metadata about a task that is being executed.
    */
  def describeTaskExecution(): Request[DescribeTaskExecutionResponse, AWSError] = js.native
  def describeTaskExecution(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskExecutionResponse, Unit]): Request[DescribeTaskExecutionResponse, AWSError] = js.native
  /**
    * Returns detailed metadata about a task that is being executed.
    */
  def describeTaskExecution(params: DescribeTaskExecutionRequest): Request[DescribeTaskExecutionResponse, AWSError] = js.native
  def describeTaskExecution(
    params: DescribeTaskExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTaskExecutionResponse, Unit]
  ): Request[DescribeTaskExecutionResponse, AWSError] = js.native
  /**
    * Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is ordered by agent Amazon Resource Name (ARN). By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you to optionally reduce the number of agents returned in a response. If you have more agents than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a marker that you can specify in your next request to fetch the next page of agents.
    */
  def listAgents(): Request[ListAgentsResponse, AWSError] = js.native
  def listAgents(callback: js.Function2[/* err */ AWSError, /* data */ ListAgentsResponse, Unit]): Request[ListAgentsResponse, AWSError] = js.native
  /**
    * Returns a list of agents owned by an AWS account in the AWS Region specified in the request. The returned list is ordered by agent Amazon Resource Name (ARN). By default, this operation returns a maximum of 100 agents. This operation supports pagination that enables you to optionally reduce the number of agents returned in a response. If you have more agents than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a marker that you can specify in your next request to fetch the next page of agents.
    */
  def listAgents(params: ListAgentsRequest): Request[ListAgentsResponse, AWSError] = js.native
  def listAgents(
    params: ListAgentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAgentsResponse, Unit]
  ): Request[ListAgentsResponse, AWSError] = js.native
  /**
    * Returns a lists of source and destination locations. If you have more locations than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a token that you can specify in your next request to fetch the next page of locations.
    */
  def listLocations(): Request[ListLocationsResponse, AWSError] = js.native
  def listLocations(callback: js.Function2[/* err */ AWSError, /* data */ ListLocationsResponse, Unit]): Request[ListLocationsResponse, AWSError] = js.native
  /**
    * Returns a lists of source and destination locations. If you have more locations than are returned in a response (that is, the response returns only a truncated list of your agents), the response contains a token that you can specify in your next request to fetch the next page of locations.
    */
  def listLocations(params: ListLocationsRequest): Request[ListLocationsResponse, AWSError] = js.native
  def listLocations(
    params: ListLocationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListLocationsResponse, Unit]
  ): Request[ListLocationsResponse, AWSError] = js.native
  /**
    * Returns all the tags associated with a specified resources. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns all the tags associated with a specified resources. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of executed tasks.
    */
  def listTaskExecutions(): Request[ListTaskExecutionsResponse, AWSError] = js.native
  def listTaskExecutions(callback: js.Function2[/* err */ AWSError, /* data */ ListTaskExecutionsResponse, Unit]): Request[ListTaskExecutionsResponse, AWSError] = js.native
  /**
    * Returns a list of executed tasks.
    */
  def listTaskExecutions(params: ListTaskExecutionsRequest): Request[ListTaskExecutionsResponse, AWSError] = js.native
  def listTaskExecutions(
    params: ListTaskExecutionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTaskExecutionsResponse, Unit]
  ): Request[ListTaskExecutionsResponse, AWSError] = js.native
  /**
    * Returns a list of all the tasks.
    */
  def listTasks(): Request[ListTasksResponse, AWSError] = js.native
  def listTasks(callback: js.Function2[/* err */ AWSError, /* data */ ListTasksResponse, Unit]): Request[ListTasksResponse, AWSError] = js.native
  /**
    * Returns a list of all the tasks.
    */
  def listTasks(params: ListTasksRequest): Request[ListTasksResponse, AWSError] = js.native
  def listTasks(
    params: ListTasksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTasksResponse, Unit]
  ): Request[ListTasksResponse, AWSError] = js.native
  /**
    * Starts a specific invocation of a task. A TaskExecution value represents an individual run of a task. Each task can have at most one TaskExecution at a time.  TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING | VERIFYING | SUCCESS/FAILURE.  For detailed information, see the Task Execution section in the Components and Terminology topic in the AWS DataSync User Guide.
    */
  def startTaskExecution(): Request[StartTaskExecutionResponse, AWSError] = js.native
  def startTaskExecution(callback: js.Function2[/* err */ AWSError, /* data */ StartTaskExecutionResponse, Unit]): Request[StartTaskExecutionResponse, AWSError] = js.native
  /**
    * Starts a specific invocation of a task. A TaskExecution value represents an individual run of a task. Each task can have at most one TaskExecution at a time.  TaskExecution has the following transition phases: INITIALIZING | PREPARING | TRANSFERRING | VERIFYING | SUCCESS/FAILURE.  For detailed information, see the Task Execution section in the Components and Terminology topic in the AWS DataSync User Guide.
    */
  def startTaskExecution(params: StartTaskExecutionRequest): Request[StartTaskExecutionResponse, AWSError] = js.native
  def startTaskExecution(
    params: StartTaskExecutionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartTaskExecutionResponse, Unit]
  ): Request[StartTaskExecutionResponse, AWSError] = js.native
  /**
    * Applies a key-value pair to an AWS resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Applies a key-value pair to an AWS resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from an AWS resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag from an AWS resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Updates the name of an agent.
    */
  def updateAgent(): Request[UpdateAgentResponse, AWSError] = js.native
  def updateAgent(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAgentResponse, Unit]): Request[UpdateAgentResponse, AWSError] = js.native
  /**
    * Updates the name of an agent.
    */
  def updateAgent(params: UpdateAgentRequest): Request[UpdateAgentResponse, AWSError] = js.native
  def updateAgent(
    params: UpdateAgentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAgentResponse, Unit]
  ): Request[UpdateAgentResponse, AWSError] = js.native
  /**
    * Updates the metadata associated with a task.
    */
  def updateTask(): Request[UpdateTaskResponse, AWSError] = js.native
  def updateTask(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskResponse, Unit]): Request[UpdateTaskResponse, AWSError] = js.native
  /**
    * Updates the metadata associated with a task.
    */
  def updateTask(params: UpdateTaskRequest): Request[UpdateTaskResponse, AWSError] = js.native
  def updateTask(
    params: UpdateTaskRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTaskResponse, Unit]
  ): Request[UpdateTaskResponse, AWSError] = js.native
}

