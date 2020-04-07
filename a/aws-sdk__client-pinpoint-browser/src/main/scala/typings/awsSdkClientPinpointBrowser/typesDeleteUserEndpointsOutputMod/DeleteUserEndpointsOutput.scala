package typings.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesEndpointsResponseMod.UnmarshalledEndpointsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserEndpointsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * List of endpoints
    */
  var EndpointsResponse: UnmarshalledEndpointsResponse
}

object DeleteUserEndpointsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EndpointsResponse: UnmarshalledEndpointsResponse): DeleteUserEndpointsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUserEndpointsOutput]
  }
}

