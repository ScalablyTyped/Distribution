package typings.awsSdkClientPinpointBrowser.typesDeleteApnsChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnschannelresponseMod.UnmarshalledAPNSChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApnsChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Apple Distribution Push Notification Service channel definition.
    */
  var APNSChannelResponse: UnmarshalledAPNSChannelResponse = js.native
}

object DeleteApnsChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSChannelResponse: UnmarshalledAPNSChannelResponse): DeleteApnsChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSChannelResponse = APNSChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsChannelOutput]
  }
  @scala.inline
  implicit class DeleteApnsChannelOutputOps[Self <: DeleteApnsChannelOutput] (val x: Self) extends AnyVal {
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
    def setAPNSChannelResponse(value: UnmarshalledAPNSChannelResponse): Self = this.set("APNSChannelResponse", value.asInstanceOf[js.Any])
  }
  
}

