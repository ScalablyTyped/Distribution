package typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesConsumerDescriptionMod.UnmarshalledConsumerDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamConsumerOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * <p>An object that represents the details of the consumer.</p>
    */
  var ConsumerDescription: UnmarshalledConsumerDescription = js.native
}

object DescribeStreamConsumerOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ConsumerDescription: UnmarshalledConsumerDescription): DescribeStreamConsumerOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ConsumerDescription = ConsumerDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamConsumerOutput]
  }
  @scala.inline
  implicit class DescribeStreamConsumerOutputOps[Self <: DescribeStreamConsumerOutput] (val x: Self) extends AnyVal {
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
    def setConsumerDescription(value: UnmarshalledConsumerDescription): Self = this.set("ConsumerDescription", value.asInstanceOf[js.Any])
  }
  
}

