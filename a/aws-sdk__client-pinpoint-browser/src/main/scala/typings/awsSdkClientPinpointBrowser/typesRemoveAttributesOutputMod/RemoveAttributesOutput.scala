package typings.awsSdkClientPinpointBrowser.typesRemoveAttributesOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesAttributesResourceMod.UnmarshalledAttributesResource
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveAttributesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Attributes.
    */
  var AttributesResource: UnmarshalledAttributesResource
}

object RemoveAttributesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, AttributesResource: UnmarshalledAttributesResource): RemoveAttributesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], AttributesResource = AttributesResource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveAttributesOutput]
  }
}

