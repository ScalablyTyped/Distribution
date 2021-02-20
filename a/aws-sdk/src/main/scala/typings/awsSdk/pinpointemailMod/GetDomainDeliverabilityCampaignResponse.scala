package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainDeliverabilityCampaignResponse extends StObject {
  
  /**
    * An object that contains the deliverability data for the campaign.
    */
  var DomainDeliverabilityCampaign: typings.awsSdk.pinpointemailMod.DomainDeliverabilityCampaign = js.native
}
object GetDomainDeliverabilityCampaignResponse {
  
  @scala.inline
  def apply(DomainDeliverabilityCampaign: DomainDeliverabilityCampaign): GetDomainDeliverabilityCampaignResponse = {
    val __obj = js.Dynamic.literal(DomainDeliverabilityCampaign = DomainDeliverabilityCampaign.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainDeliverabilityCampaignResponse]
  }
  
  @scala.inline
  implicit class GetDomainDeliverabilityCampaignResponseMutableBuilder[Self <: GetDomainDeliverabilityCampaignResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainDeliverabilityCampaign(value: DomainDeliverabilityCampaign): Self = StObject.set(x, "DomainDeliverabilityCampaign", value.asInstanceOf[js.Any])
  }
}
