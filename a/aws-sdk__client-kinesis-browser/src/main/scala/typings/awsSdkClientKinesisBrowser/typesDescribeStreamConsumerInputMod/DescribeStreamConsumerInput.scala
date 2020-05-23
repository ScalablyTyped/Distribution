package typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamConsumerInput extends InputTypesUnion {
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
    * <p>The ARN returned by Kinesis Data Streams when you registered the consumer.</p>
    */
  var ConsumerARN: js.UndefOr[String] = js.undefined
  /**
    * <p>The name that you gave to the consumer.</p>
    */
  var ConsumerName: js.UndefOr[String] = js.undefined
  /**
    * <p>The ARN of the Kinesis data stream that the consumer is registered with. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams">Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.</p>
    */
  var StreamARN: js.UndefOr[String] = js.undefined
}

object DescribeStreamConsumerInput {
  @scala.inline
  def apply(
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: js.UndefOr[Double] = js.undefined,
    ConsumerARN: String = null,
    ConsumerName: String = null,
    StreamARN: String = null
  ): DescribeStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined($maxRetries)) __obj.updateDynamic("$maxRetries")($maxRetries.get.asInstanceOf[js.Any])
    if (ConsumerARN != null) __obj.updateDynamic("ConsumerARN")(ConsumerARN.asInstanceOf[js.Any])
    if (ConsumerName != null) __obj.updateDynamic("ConsumerName")(ConsumerName.asInstanceOf[js.Any])
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamConsumerInput]
  }
}

