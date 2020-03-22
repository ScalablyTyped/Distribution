package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var Arn: TargetArn = js.native
  /**
    * If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters. For more information, see Jobs in the AWS Batch User Guide.
    */
  var BatchParameters: js.UndefOr[typings.awsSdk.eventbridgeMod.BatchParameters] = js.native
  /**
    * Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS task. For more information about Amazon ECS tasks, see Task Definitions  in the Amazon EC2 Container Service Developer Guide.
    */
  var EcsParameters: js.UndefOr[typings.awsSdk.eventbridgeMod.EcsParameters] = js.native
  /**
    * The ID of the target.
    */
  var Id: TargetId = js.native
  /**
    * Valid JSON text passed to the target. In this case, nothing from the event itself is passed to the target. For more information, see The JavaScript Object Notation (JSON) Data Interchange Format.
    */
  var Input: js.UndefOr[TargetInput] = js.native
  /**
    * The value of the JSONPath that is used for extracting part of the matched event when passing it to the target. You must use JSON dot notation, not bracket notation. For more information about JSON paths, see JSONPath.
    */
  var InputPath: js.UndefOr[TargetInputPath] = js.native
  /**
    * Settings to enable you to provide custom input to a target based on certain event data. You can extract one or more key-value pairs from the event and then use that data to send customized input to the target.
    */
  var InputTransformer: js.UndefOr[typings.awsSdk.eventbridgeMod.InputTransformer] = js.native
  /**
    * The custom parameter you can use to control the shard assignment, when the target is a Kinesis data stream. If you do not include this parameter, the default is to use the eventId as the partition key.
    */
  var KinesisParameters: js.UndefOr[typings.awsSdk.eventbridgeMod.KinesisParameters] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If one rule triggers multiple targets, you can use a different IAM role for each target.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.eventbridgeMod.RoleArn] = js.native
  /**
    * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
    */
  var RunCommandParameters: js.UndefOr[typings.awsSdk.eventbridgeMod.RunCommandParameters] = js.native
  /**
    * Contains the message group ID to use when the target is a FIFO queue. If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
    */
  var SqsParameters: js.UndefOr[typings.awsSdk.eventbridgeMod.SqsParameters] = js.native
}

object Target {
  @scala.inline
  def apply(
    Arn: TargetArn,
    Id: TargetId,
    BatchParameters: BatchParameters = null,
    EcsParameters: EcsParameters = null,
    Input: TargetInput = null,
    InputPath: TargetInputPath = null,
    InputTransformer: InputTransformer = null,
    KinesisParameters: KinesisParameters = null,
    RoleArn: RoleArn = null,
    RunCommandParameters: RunCommandParameters = null,
    SqsParameters: SqsParameters = null
  ): Target = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    if (BatchParameters != null) __obj.updateDynamic("BatchParameters")(BatchParameters.asInstanceOf[js.Any])
    if (EcsParameters != null) __obj.updateDynamic("EcsParameters")(EcsParameters.asInstanceOf[js.Any])
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    if (InputPath != null) __obj.updateDynamic("InputPath")(InputPath.asInstanceOf[js.Any])
    if (InputTransformer != null) __obj.updateDynamic("InputTransformer")(InputTransformer.asInstanceOf[js.Any])
    if (KinesisParameters != null) __obj.updateDynamic("KinesisParameters")(KinesisParameters.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (RunCommandParameters != null) __obj.updateDynamic("RunCommandParameters")(RunCommandParameters.asInstanceOf[js.Any])
    if (SqsParameters != null) __obj.updateDynamic("SqsParameters")(SqsParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

