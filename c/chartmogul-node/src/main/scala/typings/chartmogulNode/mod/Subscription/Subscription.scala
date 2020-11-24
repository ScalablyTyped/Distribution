package typings.chartmogulNode.mod.Subscription

import typings.chartmogulNode.commonMod.Strings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscription extends js.Object {
  
  var cancellation_dates: Strings = js.native
  
  var customer_uuid: String = js.native
  
  var data_source_uuid: String = js.native
  
  var external_id: String = js.native
  
  var plan_uuid: String = js.native
  
  var uuid: String = js.native
}
object Subscription {
  
  @scala.inline
  def apply(
    cancellation_dates: Strings,
    customer_uuid: String,
    data_source_uuid: String,
    external_id: String,
    plan_uuid: String,
    uuid: String
  ): Subscription = {
    val __obj = js.Dynamic.literal(cancellation_dates = cancellation_dates.asInstanceOf[js.Any], customer_uuid = customer_uuid.asInstanceOf[js.Any], data_source_uuid = data_source_uuid.asInstanceOf[js.Any], external_id = external_id.asInstanceOf[js.Any], plan_uuid = plan_uuid.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit class SubscriptionOps[Self <: typings.chartmogulNode.mod.Subscription.Subscription] (val x: Self) extends AnyVal {
    
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
    def setCancellation_datesVarargs(value: String*): Self = this.set("cancellation_dates", js.Array(value :_*))
    
    @scala.inline
    def setCancellation_dates(value: Strings): Self = this.set("cancellation_dates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomer_uuid(value: String): Self = this.set("customer_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData_source_uuid(value: String): Self = this.set("data_source_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan_uuid(value: String): Self = this.set("plan_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
}
