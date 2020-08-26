package typings.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterStreamConsumerInput extends InputTypesUnion {
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
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
  /**
    * <p>The ARN returned by Kinesis Data Streams when you registered the consumer. If you don't know the ARN of the consumer that you want to deregister, you can use the ListStreamConsumers operation to get a list of the descriptions of all the consumers that are currently registered with a given data stream. The description of a consumer contains its ARN.</p>
    */
  var ConsumerARN: js.UndefOr[String] = js.native
  /**
    * <p>The name that you gave to the consumer.</p>
    */
  var ConsumerName: js.UndefOr[String] = js.native
  /**
    * <p>The ARN of the Kinesis data stream that the consumer is registered with. For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams">Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.</p>
    */
  var StreamARN: js.UndefOr[String] = js.native
}

object DeregisterStreamConsumerInput {
  @scala.inline
  def apply(): DeregisterStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterStreamConsumerInput]
  }
  @scala.inline
  implicit class DeregisterStreamConsumerInputOps[Self <: DeregisterStreamConsumerInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: BrowserHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setConsumerARN(value: String): Self = this.set("ConsumerARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerARN: Self = this.set("ConsumerARN", js.undefined)
    @scala.inline
    def setConsumerName(value: String): Self = this.set("ConsumerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerName: Self = this.set("ConsumerName", js.undefined)
    @scala.inline
    def setStreamARN(value: String): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamARN: Self = this.set("StreamARN", js.undefined)
  }
  
}

