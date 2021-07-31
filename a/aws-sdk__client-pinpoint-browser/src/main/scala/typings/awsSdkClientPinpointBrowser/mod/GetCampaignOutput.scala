package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesCampaignResponseMod.UnmarshalledCampaignResponse
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignOutput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput
object GetCampaignOutput {
  
  @scala.inline
  def apply($metadata: ResponseMetadata, CampaignResponse: UnmarshalledCampaignResponse): GetCampaignOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignOutput]
  }
}
