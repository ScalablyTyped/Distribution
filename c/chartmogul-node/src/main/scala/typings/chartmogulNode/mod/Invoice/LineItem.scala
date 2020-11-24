package typings.chartmogulNode.mod.Invoice

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineItem extends js.Object {
  
  var account_code: js.UndefOr[String] = js.native
  
  var amount_in_cents: js.UndefOr[Double] = js.native
  
  var cancelled_at: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var discount_amount_in_cents: js.UndefOr[Double] = js.native
  
  var discount_code: js.UndefOr[String] = js.native
  
  var external_id: js.UndefOr[String] = js.native
  
  var plan_uuid: js.UndefOr[String] = js.native
  
  var prorated: js.UndefOr[Boolean] = js.native
  
  var quantity: js.UndefOr[Double] = js.native
  
  var service_period_end: js.UndefOr[String] = js.native
  
  var service_period_start: js.UndefOr[String] = js.native
  
  var subscription_external_id: js.UndefOr[String] = js.native
  
  var subscription_uuid: js.UndefOr[String] = js.native
  
  var tax_amount_in_cents: js.UndefOr[Double] = js.native
  
  var transaction_fees_in_cents: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var uuid: js.UndefOr[String] = js.native
}
object LineItem {
  
  @scala.inline
  def apply(): LineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineItem]
  }
  
  @scala.inline
  implicit class LineItemOps[Self <: LineItem] (val x: Self) extends AnyVal {
    
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
    def setAccount_code(value: String): Self = this.set("account_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccount_code: Self = this.set("account_code", js.undefined)
    
    @scala.inline
    def setAmount_in_cents(value: Double): Self = this.set("amount_in_cents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmount_in_cents: Self = this.set("amount_in_cents", js.undefined)
    
    @scala.inline
    def setCancelled_at(value: String): Self = this.set("cancelled_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelled_at: Self = this.set("cancelled_at", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDiscount_amount_in_cents(value: Double): Self = this.set("discount_amount_in_cents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscount_amount_in_cents: Self = this.set("discount_amount_in_cents", js.undefined)
    
    @scala.inline
    def setDiscount_code(value: String): Self = this.set("discount_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscount_code: Self = this.set("discount_code", js.undefined)
    
    @scala.inline
    def setExternal_id(value: String): Self = this.set("external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternal_id: Self = this.set("external_id", js.undefined)
    
    @scala.inline
    def setPlan_uuid(value: String): Self = this.set("plan_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlan_uuid: Self = this.set("plan_uuid", js.undefined)
    
    @scala.inline
    def setProrated(value: Boolean): Self = this.set("prorated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProrated: Self = this.set("prorated", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
    
    @scala.inline
    def setService_period_end(value: String): Self = this.set("service_period_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService_period_end: Self = this.set("service_period_end", js.undefined)
    
    @scala.inline
    def setService_period_start(value: String): Self = this.set("service_period_start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService_period_start: Self = this.set("service_period_start", js.undefined)
    
    @scala.inline
    def setSubscription_external_id(value: String): Self = this.set("subscription_external_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription_external_id: Self = this.set("subscription_external_id", js.undefined)
    
    @scala.inline
    def setSubscription_uuid(value: String): Self = this.set("subscription_uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscription_uuid: Self = this.set("subscription_uuid", js.undefined)
    
    @scala.inline
    def setTax_amount_in_cents(value: Double): Self = this.set("tax_amount_in_cents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTax_amount_in_cents: Self = this.set("tax_amount_in_cents", js.undefined)
    
    @scala.inline
    def setTransaction_fees_in_cents(value: Double): Self = this.set("transaction_fees_in_cents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction_fees_in_cents: Self = this.set("transaction_fees_in_cents", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
