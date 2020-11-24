package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Purchase extends js.Object {
  
  /**
    * The currency in which the UpfrontPrice and HourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  
  /**
    * The duration of the reservation's term in seconds.
    */
  var Duration: js.UndefOr[Integer] = js.native
  
  /**
    * The IDs of the Dedicated Hosts associated with the reservation.
    */
  var HostIdSet: js.UndefOr[ResponseHostIdSet] = js.native
  
  /**
    * The ID of the reservation.
    */
  var HostReservationId: js.UndefOr[String] = js.native
  
  /**
    * The hourly price of the reservation per hour.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  
  /**
    * The instance family on the Dedicated Host that the reservation can be associated with.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  
  /**
    * The payment option for the reservation.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.ec2Mod.PaymentOption] = js.native
  
  /**
    * The upfront price of the reservation.
    */
  var UpfrontPrice: js.UndefOr[String] = js.native
}
object Purchase {
  
  @scala.inline
  def apply(): Purchase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Purchase]
  }
  
  @scala.inline
  implicit class PurchaseOps[Self <: Purchase] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Integer): Self = this.set("Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("Duration", js.undefined)
    
    @scala.inline
    def setHostIdSetVarargs(value: String*): Self = this.set("HostIdSet", js.Array(value :_*))
    
    @scala.inline
    def setHostIdSet(value: ResponseHostIdSet): Self = this.set("HostIdSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostIdSet: Self = this.set("HostIdSet", js.undefined)
    
    @scala.inline
    def setHostReservationId(value: String): Self = this.set("HostReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostReservationId: Self = this.set("HostReservationId", js.undefined)
    
    @scala.inline
    def setHourlyPrice(value: String): Self = this.set("HourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourlyPrice: Self = this.set("HourlyPrice", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: String): Self = this.set("InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFamily: Self = this.set("InstanceFamily", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: PaymentOption): Self = this.set("PaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentOption: Self = this.set("PaymentOption", js.undefined)
    
    @scala.inline
    def setUpfrontPrice(value: String): Self = this.set("UpfrontPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpfrontPrice: Self = this.set("UpfrontPrice", js.undefined)
  }
}
