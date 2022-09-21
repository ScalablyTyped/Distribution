package typings.awsSdk.connectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCampaignResponse extends StObject {
  
  var campaign: js.UndefOr[Campaign] = js.undefined
}
object DescribeCampaignResponse {
  
  inline def apply(): DescribeCampaignResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCampaignResponse]
  }
  
  extension [Self <: DescribeCampaignResponse](x: Self) {
    
    inline def setCampaign(value: Campaign): Self = StObject.set(x, "campaign", value.asInstanceOf[js.Any])
    
    inline def setCampaignUndefined: Self = StObject.set(x, "campaign", js.undefined)
  }
}
