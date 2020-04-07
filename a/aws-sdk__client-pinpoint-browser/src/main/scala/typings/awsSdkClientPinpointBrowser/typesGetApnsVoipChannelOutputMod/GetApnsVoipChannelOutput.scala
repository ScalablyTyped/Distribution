package typings.awsSdkClientPinpointBrowser.typesGetApnsVoipChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesApnsvoipchannelresponseMod.UnmarshalledAPNSVoipChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApnsVoipChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Apple VoIP Push Notification Service channel definition.
    */
  var APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse
}

object GetApnsVoipChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, APNSVoipChannelResponse: UnmarshalledAPNSVoipChannelResponse): GetApnsVoipChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipChannelResponse = APNSVoipChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetApnsVoipChannelOutput]
  }
}

