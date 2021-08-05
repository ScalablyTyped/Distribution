package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventSourceMappingRequest extends StObject {
  
  /**
    * The maximum number of items to retrieve in a single batch.    Amazon Kinesis - Default 100. Max 10,000.    Amazon DynamoDB Streams - Default 100. Max 1,000.    Amazon Simple Queue Service - Default 10. Max 10.    Amazon Managed Streaming for Apache Kafka - Default 100. Max 10,000.  
    */
  var BatchSize: js.UndefOr[typings.awsSdk.lambdaMod.BatchSize] = js.undefined
  
  /**
    * (Streams) If the function returns an error, split the batch in two and retry.
    */
  var BisectBatchOnFunctionError: js.UndefOr[typings.awsSdk.lambdaMod.BisectBatchOnFunctionError] = js.undefined
  
  /**
    * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
    */
  var DestinationConfig: js.UndefOr[typings.awsSdk.lambdaMod.DestinationConfig] = js.undefined
  
  /**
    * If true, the event source mapping is active. Set to false to pause polling and invocation.
    */
  var Enabled: js.UndefOr[typings.awsSdk.lambdaMod.Enabled] = js.undefined
  
  /**
    * The name of the Lambda function.  Name formats     Function name - MyFunction.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction.    Version or Alias ARN - arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD.    Partial ARN - 123456789012:function:MyFunction.   The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64 characters in length.
    */
  var FunctionName: js.UndefOr[typings.awsSdk.lambdaMod.FunctionName] = js.undefined
  
  /**
    * (Streams) The maximum amount of time to gather records before invoking the function, in seconds.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsSdk.lambdaMod.MaximumBatchingWindowInSeconds] = js.undefined
  
  /**
    * (Streams) Discard records older than the specified age. The default value is infinite (-1).
    */
  var MaximumRecordAgeInSeconds: js.UndefOr[typings.awsSdk.lambdaMod.MaximumRecordAgeInSeconds] = js.undefined
  
  /**
    * (Streams) Discard records after the specified number of retries. The default value is infinite (-1). When set to infinite (-1), failed records will be retried until the record expires.
    */
  var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.undefined
  
  /**
    * (Streams) The number of batches to process from each shard concurrently.
    */
  var ParallelizationFactor: js.UndefOr[typings.awsSdk.lambdaMod.ParallelizationFactor] = js.undefined
  
  /**
    *  (MQ) The Secrets Manager secret that stores your broker credentials. To store your secret, use the following format:  { "username": "your username", "password": "your password" }  To reference the secret, use the following format: [ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]  The value of Type is always BASIC_AUTH. To encrypt the secret, you can use customer or service managed keys. When using a customer managed KMS key, the Lambda execution role requires kms:Decrypt permissions.
    */
  var SourceAccessConfigurations: js.UndefOr[typings.awsSdk.lambdaMod.SourceAccessConfigurations] = js.undefined
  
  /**
    * The identifier of the event source mapping.
    */
  var UUID: String
}
object UpdateEventSourceMappingRequest {
  
  inline def apply(UUID: String): UpdateEventSourceMappingRequest = {
    val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventSourceMappingRequest]
  }
  
  extension [Self <: UpdateEventSourceMappingRequest](x: Self) {
    
    inline def setBatchSize(value: BatchSize): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setBisectBatchOnFunctionError(value: BisectBatchOnFunctionError): Self = StObject.set(x, "BisectBatchOnFunctionError", value.asInstanceOf[js.Any])
    
    inline def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "BisectBatchOnFunctionError", js.undefined)
    
    inline def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "DestinationConfig", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigUndefined: Self = StObject.set(x, "DestinationConfig", js.undefined)
    
    inline def setEnabled(value: Enabled): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setFunctionName(value: FunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    inline def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
    
    inline def setMaximumRecordAgeInSeconds(value: MaximumRecordAgeInSeconds): Self = StObject.set(x, "MaximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "MaximumRecordAgeInSeconds", js.undefined)
    
    inline def setMaximumRetryAttempts(value: MaximumRetryAttemptsEventSourceMapping): Self = StObject.set(x, "MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "MaximumRetryAttempts", js.undefined)
    
    inline def setParallelizationFactor(value: ParallelizationFactor): Self = StObject.set(x, "ParallelizationFactor", value.asInstanceOf[js.Any])
    
    inline def setParallelizationFactorUndefined: Self = StObject.set(x, "ParallelizationFactor", js.undefined)
    
    inline def setSourceAccessConfigurations(value: SourceAccessConfigurations): Self = StObject.set(x, "SourceAccessConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSourceAccessConfigurationsUndefined: Self = StObject.set(x, "SourceAccessConfigurations", js.undefined)
    
    inline def setSourceAccessConfigurationsVarargs(value: SourceAccessConfiguration*): Self = StObject.set(x, "SourceAccessConfigurations", js.Array(value :_*))
    
    inline def setUUID(value: String): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
  }
}
