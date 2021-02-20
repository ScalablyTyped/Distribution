package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentSavingsPlanOffering extends StObject {
  
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
  implicit class ParentSavingsPlanOfferingMutableBuilder[Self <: ParentSavingsPlanOffering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: CurrencyCode): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDurationSeconds(value: SavingsPlansDuration): Self = StObject.set(x, "durationSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationSecondsUndefined: Self = StObject.set(x, "durationSeconds", js.undefined)
    
    @scala.inline
    def setOfferingId(value: UUID): Self = StObject.set(x, "offeringId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingIdUndefined: Self = StObject.set(x, "offeringId", js.undefined)
    
    @scala.inline
    def setPaymentOption(value: SavingsPlanPaymentOption): Self = StObject.set(x, "paymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentOptionUndefined: Self = StObject.set(x, "paymentOption", js.undefined)
    
    @scala.inline
    def setPlanDescription(value: SavingsPlanDescription): Self = StObject.set(x, "planDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanDescriptionUndefined: Self = StObject.set(x, "planDescription", js.undefined)
    
    @scala.inline
    def setPlanType(value: SavingsPlanType): Self = StObject.set(x, "planType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanTypeUndefined: Self = StObject.set(x, "planType", js.undefined)
  }
}
