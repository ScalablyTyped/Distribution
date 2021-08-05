package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeliverabilityDashboardOptionsResponse extends StObject {
  
  /**
    * The current status of your Deliverability dashboard subscription. If this value is PENDING_EXPIRATION, your subscription is scheduled to expire at the end of the current calendar month.
    */
  var AccountStatus: js.UndefOr[DeliverabilityDashboardAccountStatus] = js.undefined
  
  /**
    * An array of objects, one for each verified domain that you use to send email and currently has an active Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar month.
    */
  var ActiveSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.undefined
  
  /**
    * Specifies whether the Deliverability dashboard is enabled. If this value is true, the dashboard is enabled.
    */
  var DashboardEnabled: Enabled
  
  /**
    * An array of objects, one for each verified domain that you use to send email and currently has an active Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
    */
  var PendingExpirationSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.undefined
  
  /**
    * The date, in Unix time format, when your current subscription to the Deliverability dashboard is scheduled to expire, if your subscription is scheduled to expire at the end of the current calendar month. This value is null if you have an active subscription that isn’t due to expire at the end of the month.
    */
  var SubscriptionExpiryDate: js.UndefOr[Timestamp] = js.undefined
}
object GetDeliverabilityDashboardOptionsResponse {
  
  inline def apply(DashboardEnabled: Enabled): GetDeliverabilityDashboardOptionsResponse = {
    val __obj = js.Dynamic.literal(DashboardEnabled = DashboardEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityDashboardOptionsResponse]
  }
  
  extension [Self <: GetDeliverabilityDashboardOptionsResponse](x: Self) {
    
    inline def setAccountStatus(value: DeliverabilityDashboardAccountStatus): Self = StObject.set(x, "AccountStatus", value.asInstanceOf[js.Any])
    
    inline def setAccountStatusUndefined: Self = StObject.set(x, "AccountStatus", js.undefined)
    
    inline def setActiveSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = StObject.set(x, "ActiveSubscribedDomains", value.asInstanceOf[js.Any])
    
    inline def setActiveSubscribedDomainsUndefined: Self = StObject.set(x, "ActiveSubscribedDomains", js.undefined)
    
    inline def setActiveSubscribedDomainsVarargs(value: DomainDeliverabilityTrackingOption*): Self = StObject.set(x, "ActiveSubscribedDomains", js.Array(value :_*))
    
    inline def setDashboardEnabled(value: Enabled): Self = StObject.set(x, "DashboardEnabled", value.asInstanceOf[js.Any])
    
    inline def setPendingExpirationSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = StObject.set(x, "PendingExpirationSubscribedDomains", value.asInstanceOf[js.Any])
    
    inline def setPendingExpirationSubscribedDomainsUndefined: Self = StObject.set(x, "PendingExpirationSubscribedDomains", js.undefined)
    
    inline def setPendingExpirationSubscribedDomainsVarargs(value: DomainDeliverabilityTrackingOption*): Self = StObject.set(x, "PendingExpirationSubscribedDomains", js.Array(value :_*))
    
    inline def setSubscriptionExpiryDate(value: Timestamp): Self = StObject.set(x, "SubscriptionExpiryDate", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionExpiryDateUndefined: Self = StObject.set(x, "SubscriptionExpiryDate", js.undefined)
  }
}
