package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUpdateEndpointsBatchOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreMessageBodyMod._UnmarshalledMessageBody
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEndpointsBatchOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Simple message object.
    */
  var MessageBody: _UnmarshalledMessageBody
}

object UpdateEndpointsBatchOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, MessageBody: _UnmarshalledMessageBody): UpdateEndpointsBatchOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], MessageBody = MessageBody.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEndpointsBatchOutput]
  }
}

