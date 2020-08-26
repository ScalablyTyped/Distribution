package typings.awsSdkClientKinesisBrowser.typesListStreamConsumersOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesConsumerMod.UnmarshalledConsumer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamConsumersOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>An array of JSON objects. Each object represents one registered consumer.</p>
    */
  var Consumers: js.UndefOr[js.Array[UnmarshalledConsumer]] = js.native
  /**
    * <p>When the number of consumers that are registered with the data stream is greater than the default value for the <code>MaxResults</code> parameter, or if you explicitly specify a value for <code>MaxResults</code> that is less than the number of registered consumers, the response includes a pagination token named <code>NextToken</code>. You can specify this <code>NextToken</code> value in a subsequent call to <code>ListStreamConsumers</code> to list the next set of registered consumers. For more information about the use of this pagination token when calling the <code>ListStreamConsumers</code> operation, see <a>ListStreamConsumersInput$NextToken</a>.</p> <important> <p>Tokens expire after 300 seconds. When you obtain a value for <code>NextToken</code> in the response to a call to <code>ListStreamConsumers</code>, you have 300 seconds to use that value. If you specify an expired token in a call to <code>ListStreamConsumers</code>, you get <code>ExpiredNextTokenException</code>.</p> </important>
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListStreamConsumersOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): ListStreamConsumersOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamConsumersOutput]
  }
  @scala.inline
  implicit class ListStreamConsumersOutputOps[Self <: ListStreamConsumersOutput] (val x: Self) extends AnyVal {
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
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumersVarargs(value: UnmarshalledConsumer*): Self = this.set("Consumers", js.Array(value :_*))
    @scala.inline
    def setConsumers(value: js.Array[UnmarshalledConsumer]): Self = this.set("Consumers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumers: Self = this.set("Consumers", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

