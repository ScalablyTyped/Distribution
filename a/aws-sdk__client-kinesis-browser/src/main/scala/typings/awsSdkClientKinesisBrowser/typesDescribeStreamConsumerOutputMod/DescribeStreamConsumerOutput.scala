package typings.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerOutputMod

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientKinesisBrowser.typesConsumerDescriptionMod.UnmarshalledConsumerDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamConsumerOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>An object that represents the details of the consumer.</p>
    */
  var ConsumerDescription: UnmarshalledConsumerDescription
}

object DescribeStreamConsumerOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ConsumerDescription: UnmarshalledConsumerDescription): DescribeStreamConsumerOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ConsumerDescription = ConsumerDescription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeStreamConsumerOutput]
  }
}

