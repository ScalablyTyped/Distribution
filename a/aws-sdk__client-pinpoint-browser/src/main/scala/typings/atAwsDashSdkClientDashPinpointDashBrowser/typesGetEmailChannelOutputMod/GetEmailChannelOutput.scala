package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetEmailChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEmailChannelResponseMod._UnmarshalledEmailChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEmailChannelOutput extends OutputTypesUnion {
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

object GetEmailChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, EmailChannelResponse: _UnmarshalledEmailChannelResponse): GetEmailChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, EmailChannelResponse = EmailChannelResponse)
  
    __obj.asInstanceOf[GetEmailChannelOutput]
  }
}

