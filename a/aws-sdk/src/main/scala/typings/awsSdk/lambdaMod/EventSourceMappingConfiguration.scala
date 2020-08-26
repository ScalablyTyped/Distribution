package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSourceMappingConfiguration extends js.Object {
  /**
    * The maximum number of items to retrieve in a single batch.
    */
  var BatchSize: js.UndefOr[typings.awsSdk.lambdaMod.BatchSize] = js.native
  /**
    * (Streams) If the function returns an error, split the batch in two and retry.
    */
  var BisectBatchOnFunctionError: js.UndefOr[typings.awsSdk.lambdaMod.BisectBatchOnFunctionError] = js.native
  /**
    * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
    */
  var DestinationConfig: js.UndefOr[typings.awsSdk.lambdaMod.DestinationConfig] = js.native
  /**
    * The Amazon Resource Name (ARN) of the event source.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  /**
    * The ARN of the Lambda function.
    */
  var FunctionArn: js.UndefOr[typings.awsSdk.lambdaMod.FunctionArn] = js.native
  /**
    * The date that the event source mapping was last updated, or its state changed.
    */
  var LastModified: js.UndefOr[Date] = js.native
  /**
    * The result of the last AWS Lambda invocation of your Lambda function.
    */
  var LastProcessingResult: js.UndefOr[String] = js.native
  /**
    * (Streams) The maximum amount of time to gather records before invoking the function, in seconds.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsSdk.lambdaMod.MaximumBatchingWindowInSeconds] = js.native
  /**
    * (Streams) The maximum age of a record that Lambda sends to a function for processing.
    */
  var MaximumRecordAgeInSeconds: js.UndefOr[typings.awsSdk.lambdaMod.MaximumRecordAgeInSeconds] = js.native
  /**
    * (Streams) The maximum number of times to retry when the function returns an error.
    */
  var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.native
  /**
    * (Streams) The number of batches to process from each shard concurrently.
    */
  var ParallelizationFactor: js.UndefOr[typings.awsSdk.lambdaMod.ParallelizationFactor] = js.native
  /**
    * The state of the event source mapping. It can be one of the following: Creating, Enabling, Enabled, Disabling, Disabled, Updating, or Deleting.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * Indicates whether the last change to the event source mapping was made by a user, or by the Lambda service.
    */
  var StateTransitionReason: js.UndefOr[String] = js.native
  /**
    * The identifier of the event source mapping.
    */
  var UUID: js.UndefOr[String] = js.native
}

object EventSourceMappingConfiguration {
  @scala.inline
  def apply(): EventSourceMappingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceMappingConfiguration]
  }
  @scala.inline
  implicit class EventSourceMappingConfigurationOps[Self <: EventSourceMappingConfiguration] (val x: Self) extends AnyVal {
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
    def setBatchSize(value: BatchSize): Self = this.set("BatchSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchSize: Self = this.set("BatchSize", js.undefined)
    @scala.inline
    def setBisectBatchOnFunctionError(value: BisectBatchOnFunctionError): Self = this.set("BisectBatchOnFunctionError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBisectBatchOnFunctionError: Self = this.set("BisectBatchOnFunctionError", js.undefined)
    @scala.inline
    def setDestinationConfig(value: DestinationConfig): Self = this.set("DestinationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationConfig: Self = this.set("DestinationConfig", js.undefined)
    @scala.inline
    def setEventSourceArn(value: Arn): Self = this.set("EventSourceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventSourceArn: Self = this.set("EventSourceArn", js.undefined)
    @scala.inline
    def setFunctionArn(value: FunctionArn): Self = this.set("FunctionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionArn: Self = this.set("FunctionArn", js.undefined)
    @scala.inline
    def setLastModified(value: Date): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setLastProcessingResult(value: String): Self = this.set("LastProcessingResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastProcessingResult: Self = this.set("LastProcessingResult", js.undefined)
    @scala.inline
    def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = this.set("MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumBatchingWindowInSeconds: Self = this.set("MaximumBatchingWindowInSeconds", js.undefined)
    @scala.inline
    def setMaximumRecordAgeInSeconds(value: MaximumRecordAgeInSeconds): Self = this.set("MaximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumRecordAgeInSeconds: Self = this.set("MaximumRecordAgeInSeconds", js.undefined)
    @scala.inline
    def setMaximumRetryAttempts(value: MaximumRetryAttemptsEventSourceMapping): Self = this.set("MaximumRetryAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumRetryAttempts: Self = this.set("MaximumRetryAttempts", js.undefined)
    @scala.inline
    def setParallelizationFactor(value: ParallelizationFactor): Self = this.set("ParallelizationFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallelizationFactor: Self = this.set("ParallelizationFactor", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateTransitionReason(value: String): Self = this.set("StateTransitionReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateTransitionReason: Self = this.set("StateTransitionReason", js.undefined)
    @scala.inline
    def setUUID(value: String): Self = this.set("UUID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUUID: Self = this.set("UUID", js.undefined)
  }
  
}

