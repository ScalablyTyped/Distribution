package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEndpointOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointResponseMod._UnmarshalledEndpointResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEndpointOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Endpoint response
    */
  var EndpointResponse: _UnmarshalledEndpointResponse
}

object DeleteEndpointOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EndpointResponse: _UnmarshalledEndpointResponse): DeleteEndpointOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, EndpointResponse = EndpointResponse)
  
    __obj.asInstanceOf[DeleteEndpointOutput]
  }
}

