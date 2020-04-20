package typings.awsSdkClientPinpointBrowser.typesUpdateApnsChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnschannelresponseMod.UnmarshalledAPNSChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateApnsChannelOutput extends OutputTypesUnion {
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

object UpdateApnsChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): UpdateApnsChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsChannelOutput]
  }
}

