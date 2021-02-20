package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutDeliverabilityDashboardOptionRequest extends StObject {
  
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
  implicit class PutDeliverabilityDashboardOptionRequestMutableBuilder[Self <: PutDeliverabilityDashboardOptionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashboardEnabled(value: Enabled): Self = StObject.set(x, "DashboardEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedDomains(value: DomainDeliverabilityTrackingOptions): Self = StObject.set(x, "SubscribedDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscribedDomainsUndefined: Self = StObject.set(x, "SubscribedDomains", js.undefined)
    
    @scala.inline
    def setSubscribedDomainsVarargs(value: DomainDeliverabilityTrackingOption*): Self = StObject.set(x, "SubscribedDomains", js.Array(value :_*))
  }
}
