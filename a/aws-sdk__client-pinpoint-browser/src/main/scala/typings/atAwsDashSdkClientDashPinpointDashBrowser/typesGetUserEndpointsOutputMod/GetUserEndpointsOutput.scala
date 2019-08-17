package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetUserEndpointsOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointsResponseMod._UnmarshalledEndpointsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserEndpointsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * List of endpoints
    */
  var EndpointsResponse: _UnmarshalledEndpointsResponse
}

object GetUserEndpointsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EndpointsResponse: _UnmarshalledEndpointsResponse): GetUserEndpointsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, EndpointsResponse = EndpointsResponse)
  
    __obj.asInstanceOf[GetUserEndpointsOutput]
  }
}

