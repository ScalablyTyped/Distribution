package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHostReservationPurchasePreviewResult extends js.Object {
  
  /**
    * The currency in which the totalUpfrontPrice and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  
  /**
    * The purchase information of the Dedicated Host reservation and the Dedicated Hosts associated with it.
    */
  var Purchase: js.UndefOr[PurchaseSet] = js.native
  
  /**
    * The potential total hourly price of the reservation per hour.
    */
  var TotalHourlyPrice: js.UndefOr[String] = js.native
  
  /**
    * The potential total upfront price. This is billed immediately.
    */
  var TotalUpfrontPrice: js.UndefOr[String] = js.native
}
object GetHostReservationPurchasePreviewResult {
  
  @scala.inline
  def apply(): GetHostReservationPurchasePreviewResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHostReservationPurchasePreviewResult]
  }
  
  @scala.inline
  implicit class GetHostReservationPurchasePreviewResultOps[Self <: GetHostReservationPurchasePreviewResult] (val x: Self) extends AnyVal {
    
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
    def setCurrencyCode(value: CurrencyCodeValues): Self = this.set("CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("CurrencyCode", js.undefined)
    
    @scala.inline
    def setPurchaseVarargs(value: Purchase*): Self = this.set("Purchase", js.Array(value :_*))
    
    @scala.inline
    def setPurchase(value: PurchaseSet): Self = this.set("Purchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchase: Self = this.set("Purchase", js.undefined)
    
    @scala.inline
    def setTotalHourlyPrice(value: String): Self = this.set("TotalHourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalHourlyPrice: Self = this.set("TotalHourlyPrice", js.undefined)
    
    @scala.inline
    def setTotalUpfrontPrice(value: String): Self = this.set("TotalUpfrontPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalUpfrontPrice: Self = this.set("TotalUpfrontPrice", js.undefined)
  }
}
