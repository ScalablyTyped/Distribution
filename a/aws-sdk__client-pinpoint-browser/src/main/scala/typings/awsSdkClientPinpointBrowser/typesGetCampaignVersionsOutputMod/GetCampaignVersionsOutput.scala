package typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesCampaignsResponseMod.UnmarshalledCampaignsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCampaignVersionsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * List of available campaigns.
    */
  var CampaignsResponse: UnmarshalledCampaignsResponse
}

object GetCampaignVersionsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, CampaignsResponse: UnmarshalledCampaignsResponse): GetCampaignVersionsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCampaignVersionsOutput]
  }
}

