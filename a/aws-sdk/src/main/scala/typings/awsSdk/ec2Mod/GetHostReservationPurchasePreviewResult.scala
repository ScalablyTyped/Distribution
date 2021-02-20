package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHostReservationPurchasePreviewResult extends StObject {
  
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
  implicit class GetHostReservationPurchasePreviewResultMutableBuilder[Self <: GetHostReservationPurchasePreviewResult] (val x: Self) extends AnyVal {
    
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
