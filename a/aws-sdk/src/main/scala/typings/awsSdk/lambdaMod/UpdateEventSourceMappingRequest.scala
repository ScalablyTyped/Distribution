package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEventSourceMappingRequest extends js.Object {
  /**
    * The maximum number of items to retrieve in a single batch.    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 1,000.    Amazon Simple Queue Service - Default 10. Max 10.  
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
    * Disables the event source mapping to pause polling and invocation.
    */
  var Enabled: js.UndefOr[typings.awsSdk.lambdaMod.Enabled] = js.native
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: js.UndefOr[typings.awsSdk.lambdaMod.FunctionName] = js.native
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
    * The identifier of the event source mapping.
    */
  var UUID: String = js.native
}

object UpdateEventSourceMappingRequest {
  @scala.inline
  def apply(
    UUID: String,
    BatchSize: js.UndefOr[BatchSize] = js.undefined,
    BisectBatchOnFunctionError: js.UndefOr[BisectBatchOnFunctionError] = js.undefined,
    DestinationConfig: DestinationConfig = null,
    Enabled: js.UndefOr[Enabled] = js.undefined,
    FunctionName: FunctionName = null,
    MaximumBatchingWindowInSeconds: js.UndefOr[MaximumBatchingWindowInSeconds] = js.undefined,
    MaximumRecordAgeInSeconds: js.UndefOr[MaximumRecordAgeInSeconds] = js.undefined,
    MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.undefined,
    ParallelizationFactor: js.UndefOr[ParallelizationFactor] = js.undefined
  ): UpdateEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
    if (!js.isUndefined(BatchSize)) __obj.updateDynamic("BatchSize")(BatchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BisectBatchOnFunctionError)) __obj.updateDynamic("BisectBatchOnFunctionError")(BisectBatchOnFunctionError.get.asInstanceOf[js.Any])
    if (DestinationConfig != null) __obj.updateDynamic("DestinationConfig")(DestinationConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumBatchingWindowInSeconds)) __obj.updateDynamic("MaximumBatchingWindowInSeconds")(MaximumBatchingWindowInSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumRecordAgeInSeconds)) __obj.updateDynamic("MaximumRecordAgeInSeconds")(MaximumRecordAgeInSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaximumRetryAttempts)) __obj.updateDynamic("MaximumRetryAttempts")(MaximumRetryAttempts.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ParallelizationFactor)) __obj.updateDynamic("ParallelizationFactor")(ParallelizationFactor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventSourceMappingRequest]
  }
}

