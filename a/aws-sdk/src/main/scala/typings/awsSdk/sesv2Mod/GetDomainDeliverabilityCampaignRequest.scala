package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainDeliverabilityCampaignRequest extends StObject {
  
  /**
    * The unique identifier for the campaign. The Deliverability dashboard automatically generates and assigns this identifier to a campaign.
    */
  var CampaignId: typings.awsSdk.sesv2Mod.CampaignId
}
object GetDomainDeliverabilityCampaignRequest {
  
  inline def apply(CampaignId: CampaignId): GetDomainDeliverabilityCampaignRequest = {
    val __obj = js.Dynamic.literal(CampaignId = CampaignId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainDeliverabilityCampaignRequest]
  }
  
  extension [Self <: GetDomainDeliverabilityCampaignRequest](x: Self) {
    
    inline def setCampaignId(value: CampaignId): Self = StObject.set(x, "CampaignId", value.asInstanceOf[js.Any])
  }
}
