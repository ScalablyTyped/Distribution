package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Target extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the target.
    */
  var Arn: TargetArn = js.native
  
  /**
    * If the event target is an AWS Batch job, this contains the job definition, job name, and other parameters. For more information, see Jobs in the AWS Batch User Guide.
    */
  var BatchParameters: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.BatchParameters] = js.native
  
  /**
    * The DeadLetterConfig that defines the target queue to send dead-letter queue events to.
    */
  var DeadLetterConfig: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.DeadLetterConfig] = js.native
  
  /**
    * Contains the Amazon ECS task definition and task count to be used, if the event target is an Amazon ECS task. For more information about Amazon ECS tasks, see Task Definitions  in the Amazon EC2 Container Service Developer Guide.
    */
  var EcsParameters: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EcsParameters] = js.native
  
  /**
    * Contains the HTTP parameters to use when the target is a API Gateway REST endpoint. If you specify an API Gateway REST API as a target, you can use this parameter to specify headers, path parameter, query string keys/values as part of your target invoking request.
    */
  var HttpParameters: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.HttpParameters] = js.native
  
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
  var InputTransformer: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.InputTransformer] = js.native
  
  /**
    * The custom parameter you can use to control the shard assignment, when the target is a Kinesis data stream. If you do not include this parameter, the default is to use the eventId as the partition key.
    */
  var KinesisParameters: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.KinesisParameters] = js.native
  
  /**
    * Contains the Redshift Data API parameters to use when the target is a Redshift cluster. If you specify a Redshift Cluster as a Target, you can use this to specify parameters to invoke the Redshift Data API ExecuteStatement based on EventBridge events.
    */
  var RedshiftDataParameters: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RedshiftDataParameters] = js.native
  
  /**
    * The RetryPolicy object that contains the retry policy configuration to use for the dead-letter queue.
    */
  var RetryPolicy: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RetryPolicy] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. If one rule triggers multiple targets, you can use a different IAM role for each target.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RoleArn] = js.native
  
  /**
    * Parameters used when you are using the rule to invoke Amazon EC2 Run Command.
    */
  var RunCommandParameters: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RunCommandParameters] = js.native
  
  /**
    * Contains the message group ID to use when the target is a FIFO queue. If you specify an SQS FIFO queue as a target, the queue must have content-based deduplication enabled.
    */
  var SqsParameters: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.SqsParameters] = js.native
}
object Target {
  
  @scala.inline
  def apply(Arn: TargetArn, Id: TargetId): Target = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  @scala.inline
  implicit class TargetOps[Self <: Target] (val x: Self) extends AnyVal {
    
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
    def setArn(value: TargetArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: TargetId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchParameters(value: BatchParameters): Self = this.set("BatchParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchParameters: Self = this.set("BatchParameters", js.undefined)
    
    @scala.inline
    def setDeadLetterConfig(value: DeadLetterConfig): Self = this.set("DeadLetterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeadLetterConfig: Self = this.set("DeadLetterConfig", js.undefined)
    
    @scala.inline
    def setEcsParameters(value: EcsParameters): Self = this.set("EcsParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcsParameters: Self = this.set("EcsParameters", js.undefined)
    
    @scala.inline
    def setHttpParameters(value: HttpParameters): Self = this.set("HttpParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpParameters: Self = this.set("HttpParameters", js.undefined)
    
    @scala.inline
    def setInput(value: TargetInput): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    
    @scala.inline
    def setInputPath(value: TargetInputPath): Self = this.set("InputPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputPath: Self = this.set("InputPath", js.undefined)
    
    @scala.inline
    def setInputTransformer(value: InputTransformer): Self = this.set("InputTransformer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputTransformer: Self = this.set("InputTransformer", js.undefined)
    
    @scala.inline
    def setKinesisParameters(value: KinesisParameters): Self = this.set("KinesisParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisParameters: Self = this.set("KinesisParameters", js.undefined)
    
    @scala.inline
    def setRedshiftDataParameters(value: RedshiftDataParameters): Self = this.set("RedshiftDataParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedshiftDataParameters: Self = this.set("RedshiftDataParameters", js.undefined)
    
    @scala.inline
    def setRetryPolicy(value: RetryPolicy): Self = this.set("RetryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryPolicy: Self = this.set("RetryPolicy", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setRunCommandParameters(value: RunCommandParameters): Self = this.set("RunCommandParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunCommandParameters: Self = this.set("RunCommandParameters", js.undefined)
    
    @scala.inline
    def setSqsParameters(value: SqsParameters): Self = this.set("SqsParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqsParameters: Self = this.set("SqsParameters", js.undefined)
  }
}
