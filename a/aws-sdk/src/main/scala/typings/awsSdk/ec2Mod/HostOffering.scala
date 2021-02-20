package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostOffering extends StObject {
  
  /**
    * The currency of the offering.
    */
  var CurrencyCode: js.UndefOr[CurrencyCodeValues] = js.native
  
  /**
    * The duration of the offering (in seconds).
    */
  var Duration: js.UndefOr[Integer] = js.native
  
  /**
    * The hourly price of the offering.
    */
  var HourlyPrice: js.UndefOr[String] = js.native
  
  /**
    * The instance family of the offering.
    */
  var InstanceFamily: js.UndefOr[String] = js.native
  
  /**
    * The ID of the offering.
    */
  var OfferingId: js.UndefOr[String] = js.native
  
  /**
    * The available payment option.
    */
  var PaymentOption: js.UndefOr[typings.awsSdk.ec2Mod.PaymentOption] = js.native
  
  /**
    * The upfront price of the offering. Does not apply to No Upfront offerings.
    */
  var UpfrontPrice: js.UndefOr[String] = js.native
}
object HostOffering {
  
  @scala.inline
  def apply(): HostOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostOffering]
  }
  
  @scala.inline
  implicit class HostOfferingMutableBuilder[Self <: HostOffering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: CurrencyCodeValues): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCodeUndefined: Self = StObject.set(x, "CurrencyCode", js.undefined)
    
    @scala.inline
    def setDuration(value: Integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setHourlyPrice(value: String): Self = StObject.set(x, "HourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyPriceUndefined: Self = StObject.set(x, "HourlyPrice", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    @scala.inline
    def setOfferingId(value: String): Self = StObject.set(x, "OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "OfferingId", js.undefined)
    
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
