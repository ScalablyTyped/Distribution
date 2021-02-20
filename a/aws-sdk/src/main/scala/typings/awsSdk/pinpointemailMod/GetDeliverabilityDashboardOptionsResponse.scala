package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeliverabilityDashboardOptionsResponse extends StObject {
  
  /**
    * The current status of your Deliverability dashboard subscription. If this value is PENDING_EXPIRATION, your subscription is scheduled to expire at the end of the current calendar month.
    */
  var AccountStatus: js.UndefOr[DeliverabilityDashboardAccountStatus] = js.native
  
  /**
    * An array of objects, one for each verified domain that you use to send email and currently has an active Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar month.
    */
  var ActiveSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.native
  
  /**
    * Specifies whether the Deliverability dashboard is enabled for your Amazon Pinpoint account. If this value is true, the dashboard is enabled.
    */
  var DashboardEnabled: Enabled = js.native
  
  /**
    * An array of objects, one for each verified domain that you use to send email and currently has an active Deliverability dashboard subscription that's scheduled to expire at the end of the current calendar month.
    */
  var PendingExpirationSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.native
  
  /**
    * The date, in Unix time format, when your current subscription to the Deliverability dashboard is scheduled to expire, if your subscription is scheduled to expire at the end of the current calendar month. This value is null if you have an active subscription that isn’t due to expire at the end of the month.
    */
  var SubscriptionExpiryDate: js.UndefOr[Timestamp] = js.native
}
object GetDeliverabilityDashboardOptionsResponse {
  
  @scala.inline
  def apply(DashboardEnabled: Enabled): GetDeliverabilityDashboardOptionsResponse = {
    val __obj = js.Dynamic.literal(DashboardEnabled = DashboardEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityDashboardOptionsResponse]
  }
  
  @scala.inline
  implicit class GetDeliverabilityDashboardOptionsResponseMutableBuilder[Self <: GetDeliverabilityDashboardOptionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountStatus(value: DeliverabilityDashboardAccountStatus): Self = StObject.set(x, "AccountStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountStatusUndefined: Self = StObject.set(x, "AccountStatus", js.undefined)
    
    @scala.inline
    def setActiveSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = StObject.set(x, "ActiveSubscribedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSubscribedDomainsUndefined: Self = StObject.set(x, "ActiveSubscribedDomains", js.undefined)
    
    @scala.inline
    def setActiveSubscribedDomainsVarargs(value: DomainDeliverabilityTrackingOption*): Self = StObject.set(x, "ActiveSubscribedDomains", js.Array(value :_*))
    
    @scala.inline
    def setDashboardEnabled(value: Enabled): Self = StObject.set(x, "DashboardEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingExpirationSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = StObject.set(x, "PendingExpirationSubscribedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingExpirationSubscribedDomainsUndefined: Self = StObject.set(x, "PendingExpirationSubscribedDomains", js.undefined)
    
    @scala.inline
    def setPendingExpirationSubscribedDomainsVarargs(value: DomainDeliverabilityTrackingOption*): Self = StObject.set(x, "PendingExpirationSubscribedDomains", js.Array(value :_*))
    
    @scala.inline
    def setSubscriptionExpiryDate(value: Timestamp): Self = StObject.set(x, "SubscriptionExpiryDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionExpiryDateUndefined: Self = StObject.set(x, "SubscriptionExpiryDate", js.undefined)
  }
}
