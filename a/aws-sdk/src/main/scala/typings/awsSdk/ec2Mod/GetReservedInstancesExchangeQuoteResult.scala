package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetReservedInstancesExchangeQuoteResult extends js.Object {
  
  /**
    * The currency of the transaction.
    */
  var CurrencyCode: js.UndefOr[String] = js.native
  
  /**
    * If true, the exchange is valid. If false, the exchange cannot be completed.
    */
  var IsValidExchange: js.UndefOr[Boolean] = js.native
  
  /**
    * The new end date of the reservation term.
    */
  var OutputReservedInstancesWillExpireAt: js.UndefOr[DateTime] = js.native
  
  /**
    * The total true upfront charge for the exchange.
    */
  var PaymentDue: js.UndefOr[String] = js.native
  
  /**
    * The cost associated with the Reserved Instance.
    */
  var ReservedInstanceValueRollup: js.UndefOr[ReservationValue] = js.native
  
  /**
    * The configuration of your Convertible Reserved Instances.
    */
  var ReservedInstanceValueSet: js.UndefOr[ReservedInstanceReservationValueSet] = js.native
  
  /**
    * The cost associated with the Reserved Instance.
    */
  var TargetConfigurationValueRollup: js.UndefOr[ReservationValue] = js.native
  
  /**
    * The values of the target Convertible Reserved Instances.
    */
  var TargetConfigurationValueSet: js.UndefOr[TargetReservationValueSet] = js.native
  
  /**
    * Describes the reason why the exchange cannot be completed.
    */
  var ValidationFailureReason: js.UndefOr[String] = js.native
}
object GetReservedInstancesExchangeQuoteResult {
  
  @scala.inline
  def apply(): GetReservedInstancesExchangeQuoteResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetReservedInstancesExchangeQuoteResult]
  }
  
  @scala.inline
  implicit class GetReservedInstancesExchangeQuoteResultOps[Self <: GetReservedInstancesExchangeQuoteResult] (val x: Self) extends AnyVal {
    
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
    def setIsValidExchange(value: Boolean): Self = this.set("IsValidExchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsValidExchange: Self = this.set("IsValidExchange", js.undefined)
    
    @scala.inline
    def setOutputReservedInstancesWillExpireAt(value: DateTime): Self = this.set("OutputReservedInstancesWillExpireAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputReservedInstancesWillExpireAt: Self = this.set("OutputReservedInstancesWillExpireAt", js.undefined)
    
    @scala.inline
    def setPaymentDue(value: String): Self = this.set("PaymentDue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentDue: Self = this.set("PaymentDue", js.undefined)
    
    @scala.inline
    def setReservedInstanceValueRollup(value: ReservationValue): Self = this.set("ReservedInstanceValueRollup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstanceValueRollup: Self = this.set("ReservedInstanceValueRollup", js.undefined)
    
    @scala.inline
    def setReservedInstanceValueSetVarargs(value: ReservedInstanceReservationValue*): Self = this.set("ReservedInstanceValueSet", js.Array(value :_*))
    
    @scala.inline
    def setReservedInstanceValueSet(value: ReservedInstanceReservationValueSet): Self = this.set("ReservedInstanceValueSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReservedInstanceValueSet: Self = this.set("ReservedInstanceValueSet", js.undefined)
    
    @scala.inline
    def setTargetConfigurationValueRollup(value: ReservationValue): Self = this.set("TargetConfigurationValueRollup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetConfigurationValueRollup: Self = this.set("TargetConfigurationValueRollup", js.undefined)
    
    @scala.inline
    def setTargetConfigurationValueSetVarargs(value: TargetReservationValue*): Self = this.set("TargetConfigurationValueSet", js.Array(value :_*))
    
    @scala.inline
    def setTargetConfigurationValueSet(value: TargetReservationValueSet): Self = this.set("TargetConfigurationValueSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetConfigurationValueSet: Self = this.set("TargetConfigurationValueSet", js.undefined)
    
    @scala.inline
    def setValidationFailureReason(value: String): Self = this.set("ValidationFailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationFailureReason: Self = this.set("ValidationFailureReason", js.undefined)
  }
}
