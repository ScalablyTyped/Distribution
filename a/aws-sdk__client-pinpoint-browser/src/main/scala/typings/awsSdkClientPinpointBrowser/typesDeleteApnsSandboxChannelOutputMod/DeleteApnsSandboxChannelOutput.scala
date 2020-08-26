package typings.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnssandboxchannelresponseMod.UnmarshalledAPNSSandboxChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApnsSandboxChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Apple Development Push Notification Service channel definition.
    */
  var APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse = js.native
}

object DeleteApnsSandboxChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSSandboxChannelResponse: UnmarshalledAPNSSandboxChannelResponse): DeleteApnsSandboxChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSSandboxChannelResponse = APNSSandboxChannelResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApnsSandboxChannelOutput]
  }
  @scala.inline
  implicit class DeleteApnsSandboxChannelOutputOps[Self <: DeleteApnsSandboxChannelOutput] (val x: Self) extends AnyVal {
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
    def setAPNSSandboxChannelResponse(value: UnmarshalledAPNSSandboxChannelResponse): Self = this.set("APNSSandboxChannelResponse", value.asInstanceOf[js.Any])
  }
  
}

