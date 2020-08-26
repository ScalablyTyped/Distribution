package typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionsOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesCampaignsResponseMod.UnmarshalledCampaignsResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCampaignVersionsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata = js.native
  /**
    * List of available campaigns.
    */
  var CampaignsResponse: UnmarshalledCampaignsResponse = js.native
}

object GetCampaignVersionsOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, CampaignsResponse: UnmarshalledCampaignsResponse): GetCampaignVersionsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignVersionsOutput]
  }
  @scala.inline
  implicit class GetCampaignVersionsOutputOps[Self <: GetCampaignVersionsOutput] (val x: Self) extends AnyVal {
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
    def setCampaignsResponse(value: UnmarshalledCampaignsResponse): Self = this.set("CampaignsResponse", value.asInstanceOf[js.Any])
  }
  
}

