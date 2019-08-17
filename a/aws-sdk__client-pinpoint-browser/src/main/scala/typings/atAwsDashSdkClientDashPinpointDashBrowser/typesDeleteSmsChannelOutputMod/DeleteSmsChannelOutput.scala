package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteSmsChannelOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreSMSChannelResponseMod._UnmarshalledSMSChannelResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSmsChannelOutput extends OutputTypesUnion {
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

object DeleteSmsChannelOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, SMSChannelResponse: _UnmarshalledSMSChannelResponse): DeleteSmsChannelOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, SMSChannelResponse = SMSChannelResponse)
  
    __obj.asInstanceOf[DeleteSmsChannelOutput]
  }
}

