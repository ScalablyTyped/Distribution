package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignsResponse extends StObject {
  
  var CampaignsResponse: typings.awsSdk.pinpointMod.CampaignsResponse
}
object GetCampaignsResponse {
  
  inline def apply(CampaignsResponse: CampaignsResponse): GetCampaignsResponse = {
    val __obj = js.Dynamic.literal(CampaignsResponse = CampaignsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCampaignsResponse]
  }
  
  extension [Self <: GetCampaignsResponse](x: Self) {
    
    inline def setCampaignsResponse(value: CampaignsResponse): Self = StObject.set(x, "CampaignsResponse", value.asInstanceOf[js.Any])
  }
}
