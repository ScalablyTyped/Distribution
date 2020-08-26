package typings.awsSdkClientPinpointBrowser.typesDeleteUserEndpointsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesEndpointsResponseMod.UnmarshalledEndpointsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUserEndpointsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * List of endpoints
    */
  var EndpointsResponse: UnmarshalledEndpointsResponse = js.native
}

object DeleteUserEndpointsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EndpointsResponse: UnmarshalledEndpointsResponse): DeleteUserEndpointsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserEndpointsOutput]
  }
  @scala.inline
  implicit class DeleteUserEndpointsOutputOps[Self <: DeleteUserEndpointsOutput] (val x: Self) extends AnyVal {
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
    def setEndpointsResponse(value: UnmarshalledEndpointsResponse): Self = this.set("EndpointsResponse", value.asInstanceOf[js.Any])
  }
  
}

