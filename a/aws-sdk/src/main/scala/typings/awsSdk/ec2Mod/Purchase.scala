package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Purchase extends StObject {
  
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
  implicit class PurchaseMutableBuilder[Self <: Purchase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setHostIdSet(value: ResponseHostIdSet): Self = StObject.set(x, "HostIdSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostIdSetUndefined: Self = StObject.set(x, "HostIdSet", js.undefined)
    
    @scala.inline
    def setHostIdSetVarargs(value: String*): Self = StObject.set(x, "HostIdSet", js.Array(value :_*))
    
    @scala.inline
    def setHostReservationId(value: String): Self = StObject.set(x, "HostReservationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostReservationIdUndefined: Self = StObject.set(x, "HostReservationId", js.undefined)
    
    @scala.inline
    def setHourlyPrice(value: String): Self = StObject.set(x, "HourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyPriceUndefined: Self = StObject.set(x, "HourlyPrice", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: PaymentOption): Self = StObject.set(x, "PaymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentOptionUndefined: Self = StObject.set(x, "PaymentOption", js.undefined)
    
    @scala.inline
    def setUpfrontPrice(value: String): Self = StObject.set(x, "UpfrontPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpfrontPriceUndefined: Self = StObject.set(x, "UpfrontPrice", js.undefined)
  }
}
