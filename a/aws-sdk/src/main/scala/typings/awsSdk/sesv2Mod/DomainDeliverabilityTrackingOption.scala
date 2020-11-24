package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDeliverabilityTrackingOption extends js.Object {
  
  /**
    * A verified domain that’s associated with your AWS account and currently has an active Deliverability dashboard subscription.
    */
  var Domain: js.UndefOr[typings.awsSdk.sesv2Mod.Domain] = js.native
  
  /**
    * An object that contains information about the inbox placement data settings for the domain.
    */
  var InboxPlacementTrackingOption: js.UndefOr[typings.awsSdk.sesv2Mod.InboxPlacementTrackingOption] = js.native
  
  /**
    * The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
    */
  var SubscriptionStartDate: js.UndefOr[Timestamp] = js.native
}
object DomainDeliverabilityTrackingOption {
  
  @scala.inline
  def apply(): DomainDeliverabilityTrackingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDeliverabilityTrackingOption]
  }
  
  @scala.inline
  implicit class DomainDeliverabilityTrackingOptionOps[Self <: DomainDeliverabilityTrackingOption] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: Domain): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setInboxPlacementTrackingOption(value: InboxPlacementTrackingOption): Self = this.set("InboxPlacementTrackingOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInboxPlacementTrackingOption: Self = this.set("InboxPlacementTrackingOption", js.undefined)
    
    @scala.inline
    def setSubscriptionStartDate(value: Timestamp): Self = this.set("SubscriptionStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionStartDate: Self = this.set("SubscriptionStartDate", js.undefined)
  }
}
