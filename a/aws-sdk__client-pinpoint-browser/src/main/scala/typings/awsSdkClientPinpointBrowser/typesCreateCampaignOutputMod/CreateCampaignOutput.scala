package typings.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var CampaignResponse: UnmarshalledCampaignResponse
}

object CreateCampaignOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): CreateCampaignOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateCampaignOutput]
  }
}

