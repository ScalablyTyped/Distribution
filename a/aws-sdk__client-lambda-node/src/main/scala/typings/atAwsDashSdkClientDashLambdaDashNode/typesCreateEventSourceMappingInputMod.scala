package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.AT_TIMESTAMP
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.LATEST
import typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.TRIM_HORIZON
import typings.atAwsDashSdkClientDashLambdaDashNode.typesInputTypesUnionMod._InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/CreateEventSourceMappingInput", JSImport.Namespace)
@js.native
object typesCreateEventSourceMappingInputMod extends js.Object {
  @js.native
  trait CreateEventSourceMappingInput extends _InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>The largest number of records that AWS Lambda will retrieve from your event source at the time of invoking your function. Your function receives an event with all the retrieved records. The default for Amazon Kinesis and Amazon DynamoDB is 100 records. Both the default and maximum for Amazon SQS are 10 messages.</p>
      */
    var BatchSize: js.UndefOr[Double] = js.native
    /**
      * <p>Set to false to disable the event source upon creation. </p>
      */
    var Enabled: js.UndefOr[Boolean] = js.native
    /**
      * <p>The Amazon Resource Name (ARN) of the event source.</p>
      */
    var EventSourceArn: String = js.native
    /**
      * <p>The name of the lambda function.</p> <p class="title"> <b>Name formats</b> </p> <ul> <li> <p> <b>Function name</b> - <code>MyFunction</code>.</p> </li> <li> <p> <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.</p> </li> <li> <p> <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.</p> </li> <li> <p> <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.</p> </li> </ul> <p>The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.</p>
      */
    var FunctionName: String = js.native
    /**
      * <p>The position in the DynamoDB or Kinesis stream where AWS Lambda should start reading. For more information, see <a href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">GetShardIterator</a> in the <i>Amazon Kinesis API Reference Guide</i> or <a href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/API_streams_GetShardIterator.html">GetShardIterator</a> in the <i>Amazon DynamoDB API Reference Guide</i>. The <code>AT_TIMESTAMP</code> value is supported only for <a href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>. </p>
      */
    var StartingPosition: js.UndefOr[TRIM_HORIZON | LATEST | AT_TIMESTAMP | String] = js.native
    /**
      * <p>The timestamp of the data record from which to start reading. Used with <a href="http://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType">shard iterator type</a> AT_TIMESTAMP. If a record with this exact timestamp does not exist, the iterator returned is for the next (later) record. If the timestamp is older than the current trim horizon, the iterator returned is for the oldest untrimmed data record (TRIM_HORIZON). Valid only for <a href="http://docs.aws.amazon.com/streams/latest/dev/amazon-kinesis-streams.html">Kinesis streams</a>. </p>
      */
    var StartingPositionTimestamp: js.UndefOr[Date | String | Double] = js.native
  }
  
}

