package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesGetCampaignActivitiesOutputMod

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreActivitiesResponseMod._UnmarshalledActivitiesResponse
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var ActivitiesResponse: _UnmarshalledActivitiesResponse
}

object GetCampaignActivitiesOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, ActivitiesResponse: _UnmarshalledActivitiesResponse): GetCampaignActivitiesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ActivitiesResponse = ActivitiesResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetCampaignActivitiesOutput]
  }
}

