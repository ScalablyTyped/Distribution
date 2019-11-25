package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteEmailChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEmailChannelResponseMod._UnmarshalledEmailChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteEmailChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Email Channel Response.
    */
  var EmailChannelResponse: _UnmarshalledEmailChannelResponse
}

object DeleteEmailChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EmailChannelResponse: _UnmarshalledEmailChannelResponse): DeleteEmailChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], EmailChannelResponse = EmailChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEmailChannelOutput]
  }
}

