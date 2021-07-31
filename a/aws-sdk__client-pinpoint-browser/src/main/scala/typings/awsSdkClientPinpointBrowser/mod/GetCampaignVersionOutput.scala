package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignVersionOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetCampaignVersionOutputMod.GetCampaignVersionOutput
object GetCampaignVersionOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): GetCampaignVersionOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignVersionOutput]
  }
}
