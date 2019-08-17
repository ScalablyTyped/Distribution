package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteApnsChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSChannelResponseMod._UnmarshalledAPNSChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteApnsChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Apple Distribution Push Notification Service channel definition.
    */
  var APNSChannelResponse: _UnmarshalledAPNSChannelResponse
}

object DeleteApnsChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSChannelResponse: _UnmarshalledAPNSChannelResponse): DeleteApnsChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, APNSChannelResponse = APNSChannelResponse)
  
    __obj.asInstanceOf[DeleteApnsChannelOutput]
  }
}

