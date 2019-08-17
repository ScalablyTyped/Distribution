package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetSmsChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSMSChannelResponseMod._UnmarshalledSMSChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var SMSChannelResponse: _UnmarshalledSMSChannelResponse
}

object GetSmsChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SMSChannelResponse: _UnmarshalledSMSChannelResponse): GetSmsChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, SMSChannelResponse = SMSChannelResponse)
  
    __obj.asInstanceOf[GetSmsChannelOutput]
  }
}

