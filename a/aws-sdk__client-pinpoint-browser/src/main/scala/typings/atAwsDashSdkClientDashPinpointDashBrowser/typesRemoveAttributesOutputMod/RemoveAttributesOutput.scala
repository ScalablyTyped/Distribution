package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesRemoveAttributesOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAttributesResourceMod._UnmarshalledAttributesResource
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var AttributesResource: _UnmarshalledAttributesResource
}

object RemoveAttributesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, AttributesResource: _UnmarshalledAttributesResource): RemoveAttributesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, AttributesResource = AttributesResource)
  
    __obj.asInstanceOf[RemoveAttributesOutput]
  }
}

