package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCampaignStateResponse extends StObject {
  
  var state: js.UndefOr[CampaignState] = js.undefined
}
object GetCampaignStateResponse {
  
  inline def apply(): GetCampaignStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCampaignStateResponse]
  }
  
  extension [Self <: GetCampaignStateResponse](x: Self) {
    
    inline def setState(value: CampaignState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
