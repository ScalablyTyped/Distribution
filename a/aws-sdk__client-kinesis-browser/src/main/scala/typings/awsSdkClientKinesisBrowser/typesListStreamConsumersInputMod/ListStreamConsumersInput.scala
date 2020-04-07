package typings.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStreamConsumersInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>The maximum number of consumers that you want a single call of <code>ListStreamConsumers</code> to return.</p>
    */
  var MaxResults: js.UndefOr[Double] = js.undefined
  /**
    * <p>When the number of consumers that are registered with the data stream is greater than the default value for the <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of consumers that are registered with the data stream, the response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to <code>ListStreamConsumers</code> to list the next set of registered consumers.</p> <p>Don't specify <code>StreamName</code> or <code>StreamCreationTimestamp</code> if you specify <code>NextToken</code> because the latter unambiguously identifies the stream.</p> <p>You can optionally specify a value for the <code>MaxResults</code> parameter when you specify <code>NextToken</code>. If you specify a <code>MaxResults</code> value that is less than the number of consumers that the operation returns if you don't specify <code>MaxResults</code>, the response will contain a new <code>NextToken</code> value. You can use the new <code>NextToken</code> value in a subsequent call to the <code>ListStreamConsumers</code> operation to list the next set of consumers.</p> <important> <p>Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to <code>ListStreamConsumers</code>, you have 300 seconds to use that value. If you specify an expired token in a call to <code>ListStreamConsumers</code>, you get <code>ExpiredNextTokenException</code>.</p> </important>
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * <p>The ARN of the Kinesis data stream for which you want to list the registered consumers. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams">Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.</p>
    */
  var StreamARN: String
  /**
    * <p>Specify this input parameter to distinguish data streams that have the same name. For example, if you create a data stream and then delete it, and you later create another data stream with the same name, you can use this input parameter to specify which of the two streams you want to list the consumers for. </p> <p>You can't specify this parameter if you specify the NextToken parameter. </p>
    */
  var StreamCreationTimestamp: js.UndefOr[Date | String | Double] = js.undefined
}

object ListStreamConsumersInput {
  @scala.inline
  def apply(
    StreamARN: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    StreamCreationTimestamp: Date | String | Double = null
  ): ListStreamConsumersInput = {
    val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StreamCreationTimestamp != null) __obj.updateDynamic("StreamCreationTimestamp")(StreamCreationTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamConsumersInput]
  }
}

