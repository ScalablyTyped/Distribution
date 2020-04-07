package typings.awsSdkClientPinpointBrowser.typesGetEndpointOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesEndpointResponseMod.UnmarshalledEndpointResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEndpointOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Endpoint response
    */
  var EndpointResponse: UnmarshalledEndpointResponse
}

object GetEndpointOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EndpointResponse: UnmarshalledEndpointResponse): GetEndpointOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetEndpointOutput]
  }
}

