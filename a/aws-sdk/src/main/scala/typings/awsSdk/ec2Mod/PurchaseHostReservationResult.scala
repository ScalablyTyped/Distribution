package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PurchaseHostReservationResult extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The currency in which the totalUpfrontPrice and totalHourlyPrice amounts are specified. At this time, the only supported currency is USD.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.undefined
  
  /**
    * Describes the details of the purchase.
    */
  var Purchase: js.UndefOr[PurchaseSet] = js.undefined
  
  /**
    * The total hourly price of the reservation calculated per hour.
    */
  var TotalHourlyPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The total amount charged to your account when you purchase the reservation.
    */
  var TotalUpfrontPrice: js.UndefOr[String] = js.undefined
}
object PurchaseHostReservationResult {
  
  @scala.inline
  def apply(): PurchaseHostReservationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PurchaseHostReservationResult]
  }
  
  @scala.inline
  implicit class PurchaseHostReservationResultMutableBuilder[Self <: PurchaseHostReservationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setPurchase(value: PurchaseSet): Self = StObject.set(x, "Purchase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurchaseUndefined: Self = StObject.set(x, "Purchase", js.undefined)
    
    @scala.inline
    def setPurchaseVarargs(value: Purchase*): Self = StObject.set(x, "Purchase", js.Array(value :_*))
    
    @scala.inline
    def setTotalHourlyPrice(value: String): Self = StObject.set(x, "TotalHourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalHourlyPriceUndefined: Self = StObject.set(x, "TotalHourlyPrice", js.undefined)
    
    @scala.inline
    def setTotalUpfrontPrice(value: String): Self = StObject.set(x, "TotalUpfrontPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUpfrontPriceUndefined: Self = StObject.set(x, "TotalUpfrontPrice", js.undefined)
  }
}
