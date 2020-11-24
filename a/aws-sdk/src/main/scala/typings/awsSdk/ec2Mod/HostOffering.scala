package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostOffering extends js.Object {
  
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
  implicit class HostOfferingOps[Self <: HostOffering] (val x: Self) extends AnyVal {
    
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
    def setHourlyPrice(value: String): Self = this.set("HourlyPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHourlyPrice: Self = this.set("HourlyPrice", js.undefined)
    
    @scala.inline
    def setInstanceFamily(value: String): Self = this.set("InstanceFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceFamily: Self = this.set("InstanceFamily", js.undefined)
    
    @scala.inline
    def setOfferingId(value: String): Self = this.set("OfferingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingId: Self = this.set("OfferingId", js.undefined)
    
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
