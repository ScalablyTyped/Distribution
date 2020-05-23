package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EcsParameters extends js.Object {
  /**
    * Specifies an ECS task group for the task. The maximum length is 255 characters.
    */
  var Group: js.UndefOr[String] = js.native
  /**
    * Specifies the launch type on which your task is running. The launch type that you specify here must match one of the launch type (compatibilities) of the target task. The FARGATE value is supported only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see AWS Fargate on Amazon ECS in the Amazon Elastic Container Service Developer Guide.
    */
  var LaunchType: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.LaunchType] = js.native
  /**
    * Use this structure if the ECS task uses the awsvpc network mode. This structure specifies the VPC subnets and security groups associated with the task, and whether a public IP address is to be used. This structure is required if LaunchType is FARGATE because the awsvpc mode is required for Fargate tasks. If you specify NetworkConfiguration when the target ECS task does not use the awsvpc network mode, the task fails.
    */
  var NetworkConfiguration: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NetworkConfiguration] = js.native
  /**
    * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as 1.1.0. This structure is used only if LaunchType is FARGATE. For more information about valid platform versions, see AWS Fargate Platform Versions in the Amazon Elastic Container Service Developer Guide.
    */
  var PlatformVersion: js.UndefOr[String] = js.native
  /**
    * The number of tasks to create based on TaskDefinition. The default is 1.
    */
  var TaskCount: js.UndefOr[LimitMin1] = js.native
  /**
    * The ARN of the task definition to use if the event target is an Amazon ECS task. 
    */
  var TaskDefinitionArn: Arn = js.native
}

object EcsParameters {
  @scala.inline
  def apply(
    TaskDefinitionArn: Arn,
    Group: String = null,
    LaunchType: LaunchType = null,
    NetworkConfiguration: NetworkConfiguration = null,
    PlatformVersion: String = null,
    TaskCount: js.UndefOr[LimitMin1] = js.undefined
  ): EcsParameters = {
    val __obj = js.Dynamic.literal(TaskDefinitionArn = TaskDefinitionArn.asInstanceOf[js.Any])
    if (Group != null) __obj.updateDynamic("Group")(Group.asInstanceOf[js.Any])
    if (LaunchType != null) __obj.updateDynamic("LaunchType")(LaunchType.asInstanceOf[js.Any])
    if (NetworkConfiguration != null) __obj.updateDynamic("NetworkConfiguration")(NetworkConfiguration.asInstanceOf[js.Any])
    if (PlatformVersion != null) __obj.updateDynamic("PlatformVersion")(PlatformVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(TaskCount)) __obj.updateDynamic("TaskCount")(TaskCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcsParameters]
  }
}

