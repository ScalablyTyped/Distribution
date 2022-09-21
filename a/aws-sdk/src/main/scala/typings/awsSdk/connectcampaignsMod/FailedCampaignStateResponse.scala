package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedCampaignStateResponse extends StObject {
  
  var campaignId: js.UndefOr[CampaignId] = js.undefined
  
  var failureCode: js.UndefOr[GetCampaignStateBatchFailureCode] = js.undefined
}
object FailedCampaignStateResponse {
  
  inline def apply(): FailedCampaignStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCampaignStateResponse]
  }
  
  extension [Self <: FailedCampaignStateResponse](x: Self) {
    
    inline def setCampaignId(value: CampaignId): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    inline def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    inline def setFailureCode(value: GetCampaignStateBatchFailureCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
  }
}
