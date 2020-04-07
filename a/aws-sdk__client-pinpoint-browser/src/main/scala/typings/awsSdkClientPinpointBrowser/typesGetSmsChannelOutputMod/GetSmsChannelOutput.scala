package typings.awsSdkClientPinpointBrowser.typesGetSmsChannelOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesSmschannelresponseMod.UnmarshalledSMSChannelResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSmsChannelOutput extends OutputTypesUnion {
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

object GetSmsChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SMSChannelResponse: UnmarshalledSMSChannelResponse): GetSmsChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SMSChannelResponse = SMSChannelResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSmsChannelOutput]
  }
}

