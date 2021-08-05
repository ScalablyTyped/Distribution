package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignVersionResponse extends StObject {
  
  var CampaignResponse: typings.awsSdk.pinpointMod.CampaignResponse
}
object GetCampaignVersionResponse {
  
  inline def apply(CampaignResponse: CampaignResponse): GetCampaignVersionResponse = {
    val __obj = js.Dynamic.literal(CampaignResponse = CampaignResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignVersionResponse]
  }
  
  extension [Self <: GetCampaignVersionResponse](x: Self) {
    
    inline def setCampaignResponse(value: CampaignResponse): Self = StObject.set(x, "CampaignResponse", value.asInstanceOf[js.Any])
  }
}
