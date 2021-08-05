package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainDeliverabilityCampaignRequest extends StObject {
  
  /**
    * The unique identifier for the campaign. Amazon Pinpoint automatically generates and assigns this identifier to a campaign. This value is not the same as the campaign identifier that Amazon Pinpoint assigns to campaigns that you create and manage by using the Amazon Pinpoint API or the Amazon Pinpoint console.
    */
  var CampaignId: typings.awsSdk.pinpointemailMod.CampaignId
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
