package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetChannelsOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreChannelsResponseMod._UnmarshalledChannelsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetChannelsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Get channels definition
    */
  var ChannelsResponse: _UnmarshalledChannelsResponse
}

object GetChannelsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ChannelsResponse: _UnmarshalledChannelsResponse): GetChannelsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, ChannelsResponse = ChannelsResponse)
  
    __obj.asInstanceOf[GetChannelsOutput]
  }
}

