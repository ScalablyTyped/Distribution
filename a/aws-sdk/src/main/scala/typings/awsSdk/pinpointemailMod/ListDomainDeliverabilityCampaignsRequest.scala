package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainDeliverabilityCampaignsRequest extends StObject {
  
  /**
    * The last day, in Unix time format, that you want to obtain deliverability data for. This value has to be less than or equal to 30 days after the value of the StartDate parameter.
    */
  var EndDate: Timestamp
  
  /**
    * A token that’s returned from a previous call to the ListDomainDeliverabilityCampaigns operation. This token indicates the position of a campaign in the list of campaigns.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.undefined
  
  /**
    * The maximum number of results to include in response to a single call to the ListDomainDeliverabilityCampaigns operation. If the number of results is larger than the number that you specify in this parameter, the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.undefined
  
  /**
    * The first day, in Unix time format, that you want to obtain deliverability data for.
    */
  var StartDate: Timestamp
  
  /**
    * The domain to obtain deliverability data for.
    */
  var SubscribedDomain: Domain
}
object ListDomainDeliverabilityCampaignsRequest {
  
  inline def apply(EndDate: Timestamp, StartDate: Timestamp, SubscribedDomain: Domain): ListDomainDeliverabilityCampaignsRequest = {
    val __obj = js.Dynamic.literal(EndDate = EndDate.asInstanceOf[js.Any], StartDate = StartDate.asInstanceOf[js.Any], SubscribedDomain = SubscribedDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainDeliverabilityCampaignsRequest]
  }
  
  extension [Self <: ListDomainDeliverabilityCampaignsRequest](x: Self) {
    
    inline def setEndDate(value: Timestamp): Self = StObject.set(x, "EndDate", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageSize(value: MaxItems): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    inline def setStartDate(value: Timestamp): Self = StObject.set(x, "StartDate", value.asInstanceOf[js.Any])
    
    inline def setSubscribedDomain(value: Domain): Self = StObject.set(x, "SubscribedDomain", value.asInstanceOf[js.Any])
  }
}
