package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesCreateCampaignOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignResponseMod._UnmarshalledCampaignResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCampaignOutput extends OutputTypesUnion {
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

object CreateCampaignOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, CampaignResponse: _UnmarshalledCampaignResponse): CreateCampaignOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateCampaignOutput]
  }
}

