package typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod

import typings.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesActivitiesResponseMod.UnmarshalledActivitiesResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCampaignActivitiesOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * Activities for campaign.
    */
  var ActivitiesResponse: UnmarshalledActivitiesResponse
}

object GetCampaignActivitiesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ActivitiesResponse: UnmarshalledActivitiesResponse): GetCampaignActivitiesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ActivitiesResponse = ActivitiesResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCampaignActivitiesOutput]
  }
}

