package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignsOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreCampaignsResponseMod._UnmarshalledCampaignsResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCampaignsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * List of available campaigns.
    */
  var CampaignsResponse: _UnmarshalledCampaignsResponse
}

object GetCampaignsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, CampaignsResponse: _UnmarshalledCampaignsResponse): GetCampaignsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCampaignsOutput]
  }
}

