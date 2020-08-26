package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeliverabilityDashboardOptionsResponse extends js.Object {
  /**
    * The current status of your Deliverability dashboard subscription. If this value is PENDING_EXPIRATION, your subscription is scheduled to expire at the end of the current calendar month.
    */
  var AccountStatus: js.UndefOr[DeliverabilityDashboardAccountStatus] = js.native
  /**
    * An array of objects, one for each verified domain that you use to send email and currently has an active Deliverability dashboard subscription that isn’t scheduled to expire at the end of the current calendar month.
    */
  var ActiveSubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.native
  /**
    * Specifies whether the Deliverability dashboard is enabled. If this value is true, the dashboard is enabled.
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
  implicit class GetDeliverabilityDashboardOptionsResponseOps[Self <: GetDeliverabilityDashboardOptionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDashboardEnabled(value: Enabled): Self = this.set("DashboardEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountStatus(value: DeliverabilityDashboardAccountStatus): Self = this.set("AccountStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountStatus: Self = this.set("AccountStatus", js.undefined)
    @scala.inline
    def setActiveSubscribedDomainsVarargs(value: DomainDeliverabilityTrackingOption*): Self = this.set("ActiveSubscribedDomains", js.Array(value :_*))
    @scala.inline
    def setActiveSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = this.set("ActiveSubscribedDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveSubscribedDomains: Self = this.set("ActiveSubscribedDomains", js.undefined)
    @scala.inline
    def setPendingExpirationSubscribedDomainsVarargs(value: DomainDeliverabilityTrackingOption*): Self = this.set("PendingExpirationSubscribedDomains", js.Array(value :_*))
    @scala.inline
    def setPendingExpirationSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = this.set("PendingExpirationSubscribedDomains", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingExpirationSubscribedDomains: Self = this.set("PendingExpirationSubscribedDomains", js.undefined)
    @scala.inline
    def setSubscriptionExpiryDate(value: Timestamp): Self = this.set("SubscriptionExpiryDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionExpiryDate: Self = this.set("SubscriptionExpiryDate", js.undefined)
  }
  
}

