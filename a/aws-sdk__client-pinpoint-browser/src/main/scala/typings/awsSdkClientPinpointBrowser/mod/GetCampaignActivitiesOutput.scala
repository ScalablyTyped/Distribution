package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesActivitiesResponseMod.UnmarshalledActivitiesResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignActivitiesOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetCampaignActivitiesOutputMod.GetCampaignActivitiesOutput
object GetCampaignActivitiesOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, ActivitiesResponse: UnmarshalledActivitiesResponse): GetCampaignActivitiesOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ActivitiesResponse = ActivitiesResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignActivitiesOutput]
  }
}
