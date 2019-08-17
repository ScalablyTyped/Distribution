package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesDeleteCampaignOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignResponseMod._UnmarshalledCampaignResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCampaignOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Campaign definition
    */
  var CampaignResponse: _UnmarshalledCampaignResponse
}

object DeleteCampaignOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, CampaignResponse: _UnmarshalledCampaignResponse): DeleteCampaignOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata, CampaignResponse = CampaignResponse)
  
    __obj.asInstanceOf[DeleteCampaignOutput]
  }
}

