package typings.awsSdkClientPinpointBrowser.typesUpdateSmsChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesSmschannelresponseMod.UnmarshalledSMSChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSmsChannelOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * SMS Channel Response.
    */
  var SMSChannelResponse: UnmarshalledSMSChannelResponse
}

object UpdateSmsChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): UpdateSmsChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateSmsChannelOutput]
  }
}

