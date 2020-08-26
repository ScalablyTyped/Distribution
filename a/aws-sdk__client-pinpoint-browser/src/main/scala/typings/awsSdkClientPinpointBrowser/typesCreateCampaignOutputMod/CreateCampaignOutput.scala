package typings.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCampaignOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * Campaign definition
    */
  var CampaignResponse: UnmarshalledCampaignResponse = js.native
}

object CreateCampaignOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): CreateCampaignOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCampaignOutput]
  }
  @scala.inline
  implicit class CreateCampaignOutputOps[Self <: CreateCampaignOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$metadata(value: ResponseMetadata): Self = this.set("$metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setCampaignResponse(value: UnmarshalledCampaignResponse): Self = this.set("CampaignResponse", value.asInstanceOf[js.Any])
  }
  
}

