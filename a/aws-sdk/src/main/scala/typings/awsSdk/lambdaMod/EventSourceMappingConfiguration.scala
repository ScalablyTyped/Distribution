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
    * The maximum amount of time to gather records before invoking the function, in seconds.
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
  def apply(
    BatchSize: Int | Double = null,
    BisectBatchOnFunctionError: js.UndefOr[scala.Boolean] = js.undefined,
    DestinationConfig: DestinationConfig = null,
    EventSourceArn: Arn = null,
    FunctionArn: FunctionArn = null,
    LastModified: Date = null,
    LastProcessingResult: String = null,
    MaximumBatchingWindowInSeconds: Int | Double = null,
    MaximumRecordAgeInSeconds: Int | Double = null,
    MaximumRetryAttempts: Int | Double = null,
    ParallelizationFactor: Int | Double = null,
    State: String = null,
    StateTransitionReason: String = null,
    UUID: String = null
  ): EventSourceMappingConfiguration = {
    val __obj = js.Dynamic.literal()
    if (BatchSize != null) __obj.updateDynamic("BatchSize")(BatchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(BisectBatchOnFunctionError)) __obj.updateDynamic("BisectBatchOnFunctionError")(BisectBatchOnFunctionError.asInstanceOf[js.Any])
    if (DestinationConfig != null) __obj.updateDynamic("DestinationConfig")(DestinationConfig.asInstanceOf[js.Any])
    if (EventSourceArn != null) __obj.updateDynamic("EventSourceArn")(EventSourceArn.asInstanceOf[js.Any])
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    if (LastProcessingResult != null) __obj.updateDynamic("LastProcessingResult")(LastProcessingResult.asInstanceOf[js.Any])
    if (MaximumBatchingWindowInSeconds != null) __obj.updateDynamic("MaximumBatchingWindowInSeconds")(MaximumBatchingWindowInSeconds.asInstanceOf[js.Any])
    if (MaximumRecordAgeInSeconds != null) __obj.updateDynamic("MaximumRecordAgeInSeconds")(MaximumRecordAgeInSeconds.asInstanceOf[js.Any])
    if (MaximumRetryAttempts != null) __obj.updateDynamic("MaximumRetryAttempts")(MaximumRetryAttempts.asInstanceOf[js.Any])
    if (ParallelizationFactor != null) __obj.updateDynamic("ParallelizationFactor")(ParallelizationFactor.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateTransitionReason != null) __obj.updateDynamic("StateTransitionReason")(StateTransitionReason.asInstanceOf[js.Any])
    if (UUID != null) __obj.updateDynamic("UUID")(UUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourceMappingConfiguration]
  }
}

