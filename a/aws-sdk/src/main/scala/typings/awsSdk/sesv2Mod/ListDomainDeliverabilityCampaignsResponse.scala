package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDomainDeliverabilityCampaignsResponse extends StObject {
  
  /**
    * An array of responses, one for each campaign that used the domain to send email during the specified time range.
    */
  var DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList = js.native
  
  /**
    * A token that’s returned from a previous call to the ListDomainDeliverabilityCampaigns operation. This token indicates the position of the campaign in the list of campaigns.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
}
object ListDomainDeliverabilityCampaignsResponse {
  
  @scala.inline
  def apply(DomainDeliverabilityCampaigns: DomainDeliverabilityCampaignList): ListDomainDeliverabilityCampaignsResponse = {
    val __obj = js.Dynamic.literal(DomainDeliverabilityCampaigns = DomainDeliverabilityCampaigns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainDeliverabilityCampaignsResponse]
  }
  
  @scala.inline
  implicit class ListDomainDeliverabilityCampaignsResponseMutableBuilder[Self <: ListDomainDeliverabilityCampaignsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainDeliverabilityCampaigns(value: DomainDeliverabilityCampaignList): Self = StObject.set(x, "DomainDeliverabilityCampaigns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainDeliverabilityCampaignsVarargs(value: DomainDeliverabilityCampaign*): Self = StObject.set(x, "DomainDeliverabilityCampaigns", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
