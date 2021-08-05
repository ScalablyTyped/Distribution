package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansAmortizedCommitment extends StObject {
  
  /**
    * The amortized amount of your Savings Plans commitment that was purchased with either a Partial or a NoUpfront.
    */
  var AmortizedRecurringCommitment: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The amortized amount of your Savings Plans commitment that was purchased with an Upfront or PartialUpfront Savings Plans.
    */
  var AmortizedUpfrontCommitment: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase method. 
    */
  var TotalAmortizedCommitment: js.UndefOr[GenericString] = js.undefined
}
object SavingsPlansAmortizedCommitment {
  
  inline def apply(): SavingsPlansAmortizedCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansAmortizedCommitment]
  }
  
  extension [Self <: SavingsPlansAmortizedCommitment](x: Self) {
    
    inline def setAmortizedRecurringCommitment(value: GenericString): Self = StObject.set(x, "AmortizedRecurringCommitment", value.asInstanceOf[js.Any])
    
    inline def setAmortizedRecurringCommitmentUndefined: Self = StObject.set(x, "AmortizedRecurringCommitment", js.undefined)
    
    inline def setAmortizedUpfrontCommitment(value: GenericString): Self = StObject.set(x, "AmortizedUpfrontCommitment", value.asInstanceOf[js.Any])
    
    inline def setAmortizedUpfrontCommitmentUndefined: Self = StObject.set(x, "AmortizedUpfrontCommitment", js.undefined)
    
    inline def setTotalAmortizedCommitment(value: GenericString): Self = StObject.set(x, "TotalAmortizedCommitment", value.asInstanceOf[js.Any])
    
    inline def setTotalAmortizedCommitmentUndefined: Self = StObject.set(x, "TotalAmortizedCommitment", js.undefined)
  }
}
