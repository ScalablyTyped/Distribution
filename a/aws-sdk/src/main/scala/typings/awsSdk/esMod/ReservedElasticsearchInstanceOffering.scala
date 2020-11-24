package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservedElasticsearchInstanceOffering extends js.Object {
  
  /**
    * The currency code for the reserved Elasticsearch instance offering.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  
  /**
    * The duration, in seconds, for which the offering will reserve the Elasticsearch instance.
    */
  var Duration: js.UndefOr[Integer] = js.native
  
  /**
    * The Elasticsearch instance type offered by the reserved instance offering.
    */
  var ElasticsearchInstanceType: js.UndefOr[ESPartitionInstanceType] = js.native
  
  /**
    * The upfront fixed charge you will pay to purchase the specific reserved Elasticsearch instance offering. 
    */
  var FixedPrice: js.UndefOr[Double] = js.native
  
  /**
    * Payment option for the reserved Elasticsearch instance offering
    */
  var PaymentOption: js.UndefOr[ReservedElasticsearchInstancePaymentOption] = js.native
  
  /**
    * The charge to your account regardless of whether you are creating any domains using the instance offering.
    */
  var RecurringCharges: js.UndefOr[RecurringChargeList] = js.native
  
  /**
    * The Elasticsearch reserved instance offering identifier.
    */
  var ReservedElasticsearchInstanceOfferingId: js.UndefOr[GUID] = js.native
  
  /**
    * The rate you are charged for each hour the domain that is using the offering is running.
    */
  var UsagePrice: js.UndefOr[Double] = js.native
}
object ReservedElasticsearchInstanceOffering {
  
  @scala.inline
  def apply(): ReservedElasticsearchInstanceOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedElasticsearchInstanceOffering]
  }
  
  @scala.inline
  implicit class ReservedElasticsearchInstanceOfferingOps[Self <: ReservedElasticsearchInstanceOffering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    
    @scala.inline
    def setDuration(value: Integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setElasticsearchInstanceType(value: ESPartitionInstanceType): Self = this.set("ElasticsearchInstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticsearchInstanceType: Self = this.set("ElasticsearchInstanceType", js.undefined)
    
    @scala.inline
    def setFixedPrice(value: Double): Self = this.set("FixedPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedPrice: Self = this.set("FixedPrice", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: ReservedElasticsearchInstancePaymentOption): Self = this.set("PaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentOption: Self = this.set("PaymentOption", js.undefined)
    
    @scala.inline
    def setRecurringChargesVarargs(value: RecurringCharge*): Self = this.set("RecurringCharges", js.Array(value :_*))
    
    @scala.inline
    def setRecurringCharges(value: RecurringChargeList): Self = this.set("RecurringCharges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecurringCharges: Self = this.set("RecurringCharges", js.undefined)
    
    @scala.inline
    def setReservedElasticsearchInstanceOfferingId(value: GUID): Self = this.set("ReservedElasticsearchInstanceOfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedElasticsearchInstanceOfferingId: Self = this.set("ReservedElasticsearchInstanceOfferingId", js.undefined)
    
    @scala.inline
    def setUsagePrice(value: Double): Self = this.set("UsagePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsagePrice: Self = this.set("UsagePrice", js.undefined)
  }
}
