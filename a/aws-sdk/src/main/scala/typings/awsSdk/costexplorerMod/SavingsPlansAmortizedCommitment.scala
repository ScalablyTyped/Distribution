package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingsPlansAmortizedCommitment extends StObject {
  
  /**
    * The amortized amount of your Savings Plans commitment that was purchased with either a Partial or a NoUpfront.
    */
  var AmortizedRecurringCommitment: js.UndefOr[GenericString] = js.native
  
  /**
    * The amortized amount of your Savings Plans commitment that was purchased with an Upfront or PartialUpfront Savings Plans.
    */
  var AmortizedUpfrontCommitment: js.UndefOr[GenericString] = js.native
  
  /**
    * The total amortized amount of your Savings Plans commitment, regardless of your Savings Plans purchase method. 
    */
  var TotalAmortizedCommitment: js.UndefOr[GenericString] = js.native
}
object SavingsPlansAmortizedCommitment {
  
  @scala.inline
  def apply(): SavingsPlansAmortizedCommitment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansAmortizedCommitment]
  }
  
  @scala.inline
  implicit class SavingsPlansAmortizedCommitmentMutableBuilder[Self <: SavingsPlansAmortizedCommitment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmortizedRecurringCommitment(value: GenericString): Self = StObject.set(x, "AmortizedRecurringCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmortizedRecurringCommitmentUndefined: Self = StObject.set(x, "AmortizedRecurringCommitment", js.undefined)
    
    @scala.inline
    def setAmortizedUpfrontCommitment(value: GenericString): Self = StObject.set(x, "AmortizedUpfrontCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmortizedUpfrontCommitmentUndefined: Self = StObject.set(x, "AmortizedUpfrontCommitment", js.undefined)
    
    @scala.inline
    def setTotalAmortizedCommitment(value: GenericString): Self = StObject.set(x, "TotalAmortizedCommitment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalAmortizedCommitmentUndefined: Self = StObject.set(x, "TotalAmortizedCommitment", js.undefined)
  }
}
