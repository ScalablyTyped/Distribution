package typings.awsSdkClientPinpointBrowser.typesGetApnsChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnschannelresponseMod.UnmarshalledAPNSChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApnsChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Apple Distribution Push Notification Service channel definition.
    */
  var APNSChannelResponse: UnmarshalledAPNSChannelResponse
}

object GetApnsChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): GetApnsChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApnsChannelOutput]
  }
}

