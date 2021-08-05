package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceMappingConfiguration extends StObject {
  
  /**
    * The maximum number of items to retrieve in a single batch.
    */
  var BatchSize: js.UndefOr[typings.awsSdk.lambdaMod.BatchSize] = js.undefined
  
  /**
    * (Streams) If the function returns an error, split the batch in two and retry. The default value is false.
    */
  var BisectBatchOnFunctionError: js.UndefOr[typings.awsSdk.lambdaMod.BisectBatchOnFunctionError] = js.undefined
  
  /**
    * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
    */
  var DestinationConfig: js.UndefOr[typings.awsSdk.lambdaMod.DestinationConfig] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the event source.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the Lambda function.
    */
  var FunctionArn: js.UndefOr[typings.awsSdk.lambdaMod.FunctionArn] = js.undefined
  
  /**
    * The date that the event source mapping was last updated, or its state changed.
    */
  var LastModified: js.UndefOr[Date] = js.undefined
  
  /**
    * The result of the last AWS Lambda invocation of your Lambda function.
    */
  var LastProcessingResult: js.UndefOr[String] = js.undefined
  
  /**
    * (Streams) The maximum amount of time to gather records before invoking the function, in seconds. The default value is zero.
    */
  var MaximumBatchingWindowInSeconds: js.UndefOr[typings.awsSdk.lambdaMod.MaximumBatchingWindowInSeconds] = js.undefined
  
  /**
    * (Streams) Discard records older than the specified age. The default value is infinite (-1). When set to infinite (-1), failed records are retried until the record expires.
    */
  var MaximumRecordAgeInSeconds: js.UndefOr[typings.awsSdk.lambdaMod.MaximumRecordAgeInSeconds] = js.undefined
  
  /**
    * (Streams) Discard records after the specified number of retries. The default value is infinite (-1). When set to infinite (-1), failed records are retried until the record expires.
    */
  var MaximumRetryAttempts: js.UndefOr[MaximumRetryAttemptsEventSourceMapping] = js.undefined
  
  /**
    * (Streams) The number of batches to process from each shard concurrently. The default value is 1.
    */
  var ParallelizationFactor: js.UndefOr[typings.awsSdk.lambdaMod.ParallelizationFactor] = js.undefined
  
  /**
    *  (MQ) The name of the Amazon MQ broker destination queue to consume. 
    */
  var Queues: js.UndefOr[typings.awsSdk.lambdaMod.Queues] = js.undefined
  
  /**
    *  (MQ) The Secrets Manager secret that stores your broker credentials. To store your secret, use the following format:  { "username": "your username", "password": "your password" }  To reference the secret, use the following format: [ { "Type": "BASIC_AUTH", "URI": "secretARN" } ]  The value of Type is always BASIC_AUTH. To encrypt the secret, you can use customer or service managed keys. When using a customer managed KMS key, the Lambda execution role requires kms:Decrypt permissions.
    */
  var SourceAccessConfigurations: js.UndefOr[typings.awsSdk.lambdaMod.SourceAccessConfigurations] = js.undefined
  
  /**
    * The position in a stream from which to start reading. Required for Amazon Kinesis, Amazon DynamoDB, and Amazon MSK Streams sources. AT_TIMESTAMP is only supported for Amazon Kinesis streams.
    */
  var StartingPosition: js.UndefOr[EventSourcePosition] = js.undefined
  
  /**
    * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading.
    */
  var StartingPositionTimestamp: js.UndefOr[Date] = js.undefined
  
  /**
    * The state of the event source mapping. It can be one of the following: Creating, Enabling, Enabled, Disabling, Disabled, Updating, or Deleting.
    */
  var State: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the last change to the event source mapping was made by a user, or by the Lambda service.
    */
  var StateTransitionReason: js.UndefOr[String] = js.undefined
  
  /**
    *  (MSK) The name of the Kafka topic to consume. 
    */
  var Topics: js.UndefOr[typings.awsSdk.lambdaMod.Topics] = js.undefined
  
  /**
    * The identifier of the event source mapping.
    */
  var UUID: js.UndefOr[String] = js.undefined
}
object EventSourceMappingConfiguration {
  
  inline def apply(): EventSourceMappingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceMappingConfiguration]
  }
  
  extension [Self <: EventSourceMappingConfiguration](x: Self) {
    
    inline def setBatchSize(value: BatchSize): Self = StObject.set(x, "BatchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "BatchSize", js.undefined)
    
    inline def setBisectBatchOnFunctionError(value: BisectBatchOnFunctionError): Self = StObject.set(x, "BisectBatchOnFunctionError", value.asInstanceOf[js.Any])
    
    inline def setBisectBatchOnFunctionErrorUndefined: Self = StObject.set(x, "BisectBatchOnFunctionError", js.undefined)
    
    inline def setDestinationConfig(value: DestinationConfig): Self = StObject.set(x, "DestinationConfig", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfigUndefined: Self = StObject.set(x, "DestinationConfig", js.undefined)
    
    inline def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    inline def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    inline def setFunctionArn(value: FunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
    
    inline def setLastModified(value: Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setLastProcessingResult(value: String): Self = StObject.set(x, "LastProcessingResult", value.asInstanceOf[js.Any])
    
    inline def setLastProcessingResultUndefined: Self = StObject.set(x, "LastProcessingResult", js.undefined)
    
    inline def setMaximumBatchingWindowInSeconds(value: MaximumBatchingWindowInSeconds): Self = StObject.set(x, "MaximumBatchingWindowInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumBatchingWindowInSecondsUndefined: Self = StObject.set(x, "MaximumBatchingWindowInSeconds", js.undefined)
    
    inline def setMaximumRecordAgeInSeconds(value: MaximumRecordAgeInSeconds): Self = StObject.set(x, "MaximumRecordAgeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaximumRecordAgeInSecondsUndefined: Self = StObject.set(x, "MaximumRecordAgeInSeconds", js.undefined)
    
    inline def setMaximumRetryAttempts(value: MaximumRetryAttemptsEventSourceMapping): Self = StObject.set(x, "MaximumRetryAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaximumRetryAttemptsUndefined: Self = StObject.set(x, "MaximumRetryAttempts", js.undefined)
    
    inline def setParallelizationFactor(value: ParallelizationFactor): Self = StObject.set(x, "ParallelizationFactor", value.asInstanceOf[js.Any])
    
    inline def setParallelizationFactorUndefined: Self = StObject.set(x, "ParallelizationFactor", js.undefined)
    
    inline def setQueues(value: Queues): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    inline def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "Queues", js.Array(value :_*))
    
    inline def setSourceAccessConfigurations(value: SourceAccessConfigurations): Self = StObject.set(x, "SourceAccessConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSourceAccessConfigurationsUndefined: Self = StObject.set(x, "SourceAccessConfigurations", js.undefined)
    
    inline def setSourceAccessConfigurationsVarargs(value: SourceAccessConfiguration*): Self = StObject.set(x, "SourceAccessConfigurations", js.Array(value :_*))
    
    inline def setStartingPosition(value: EventSourcePosition): Self = StObject.set(x, "StartingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionTimestamp(value: Date): Self = StObject.set(x, "StartingPositionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionTimestampUndefined: Self = StObject.set(x, "StartingPositionTimestamp", js.undefined)
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "StartingPosition", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionReason(value: String): Self = StObject.set(x, "StateTransitionReason", value.asInstanceOf[js.Any])
    
    inline def setStateTransitionReasonUndefined: Self = StObject.set(x, "StateTransitionReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTopics(value: Topics): Self = StObject.set(x, "Topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsUndefined: Self = StObject.set(x, "Topics", js.undefined)
    
    inline def setTopicsVarargs(value: Topic*): Self = StObject.set(x, "Topics", js.Array(value :_*))
    
    inline def setUUID(value: String): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
    
    inline def setUUIDUndefined: Self = StObject.set(x, "UUID", js.undefined)
  }
}
