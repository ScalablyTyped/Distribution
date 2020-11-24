package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentSavingsPlanOffering extends js.Object {
  
  /**
    * The currency.
    */
  var currency: js.UndefOr[CurrencyCode] = js.native
  
  /**
    * The duration, in seconds.
    */
  var durationSeconds: js.UndefOr[SavingsPlansDuration] = js.native
  
  /**
    * The ID of the offering.
    */
  var offeringId: js.UndefOr[UUID] = js.native
  
  /**
    * The payment option.
    */
  var paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.native
  
  /**
    * The description.
    */
  var planDescription: js.UndefOr[SavingsPlanDescription] = js.native
  
  /**
    * The plan type.
    */
  var planType: js.UndefOr[SavingsPlanType] = js.native
}
object ParentSavingsPlanOffering {
  
  @scala.inline
  def apply(): ParentSavingsPlanOffering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentSavingsPlanOffering]
  }
  
  @scala.inline
  implicit class ParentSavingsPlanOfferingOps[Self <: ParentSavingsPlanOffering] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: CurrencyCode): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setDurationSeconds(value: SavingsPlansDuration): Self = this.set("durationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationSeconds: Self = this.set("durationSeconds", js.undefined)
    
    @scala.inline
    def setOfferingId(value: UUID): Self = this.set("offeringId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferingId: Self = this.set("offeringId", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: SavingsPlanPaymentOption): Self = this.set("paymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentOption: Self = this.set("paymentOption", js.undefined)
    
    @scala.inline
    def setPlanDescription(value: SavingsPlanDescription): Self = this.set("planDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanDescription: Self = this.set("planDescription", js.undefined)
    
    @scala.inline
    def setPlanType(value: SavingsPlanType): Self = this.set("planType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanType: Self = this.set("planType", js.undefined)
  }
}
