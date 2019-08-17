package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesDescribeStreamConsumerOutputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscoreConsumerDescriptionMod._UnmarshalledConsumerDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var ConsumerDescription: _UnmarshalledConsumerDescription
}

object DescribeStreamConsumerOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ConsumerDescription: _UnmarshalledConsumerDescription): DescribeStreamConsumerOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, ConsumerDescription = ConsumerDescription)
  
    __obj.asInstanceOf[DescribeStreamConsumerOutput]
  }
}

