package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDeliverabilityDashboardOptionRequest extends js.Object {
  
  /**
    * Specifies whether to enable the Deliverability dashboard for your Amazon Pinpoint account. To enable the dashboard, set this value to true.
    */
  var DashboardEnabled: Enabled = js.native
  
  /**
    * An array of objects, one for each verified domain that you use to send email and enabled the Deliverability dashboard for.
    */
  var SubscribedDomains: js.UndefOr[DomainDeliverabilityTrackingOptions] = js.native
}
object PutDeliverabilityDashboardOptionRequest {
  
  @scala.inline
  def apply(DashboardEnabled: Enabled): PutDeliverabilityDashboardOptionRequest = {
    val __obj = js.Dynamic.literal(DashboardEnabled = DashboardEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutDeliverabilityDashboardOptionRequest]
  }
  
  @scala.inline
  implicit class PutDeliverabilityDashboardOptionRequestOps[Self <: PutDeliverabilityDashboardOptionRequest] (val x: Self) extends AnyVal {
    
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
    def setSubscribedDomainsVarargs(value: DomainDeliverabilityTrackingOption*): Self = this.set("SubscribedDomains", js.Array(value :_*))
    
    @scala.inline
    def setSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = this.set("SubscribedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscribedDomains: Self = this.set("SubscribedDomains", js.undefined)
  }
}
