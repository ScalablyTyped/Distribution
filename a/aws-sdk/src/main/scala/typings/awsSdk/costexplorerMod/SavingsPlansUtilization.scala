package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlansUtilization extends StObject {
  
  /**
    * The total amount of Savings Plans commitment that's been purchased in an account (or set of accounts).
    */
  var TotalCommitment: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The amount of your Savings Plans commitment that was not consumed from Savings Plans eligible usage in a specific period.
    */
  var UnusedCommitment: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The amount of your Savings Plans commitment that was consumed from Savings Plans eligible usage in a specific period.
    */
  var UsedCommitment: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The amount of UsedCommitment divided by the TotalCommitment for your Savings Plans.
    */
  var UtilizationPercentage: js.UndefOr[GenericString] = js.undefined
}
object SavingsPlansUtilization {
  
  inline def apply(): SavingsPlansUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansUtilization]
  }
  
  extension [Self <: SavingsPlansUtilization](x: Self) {
    
    inline def setTotalCommitment(value: GenericString): Self = StObject.set(x, "TotalCommitment", value.asInstanceOf[js.Any])
    
    inline def setTotalCommitmentUndefined: Self = StObject.set(x, "TotalCommitment", js.undefined)
    
    inline def setUnusedCommitment(value: GenericString): Self = StObject.set(x, "UnusedCommitment", value.asInstanceOf[js.Any])
    
    inline def setUnusedCommitmentUndefined: Self = StObject.set(x, "UnusedCommitment", js.undefined)
    
    inline def setUsedCommitment(value: GenericString): Self = StObject.set(x, "UsedCommitment", value.asInstanceOf[js.Any])
    
    inline def setUsedCommitmentUndefined: Self = StObject.set(x, "UsedCommitment", js.undefined)
    
    inline def setUtilizationPercentage(value: GenericString): Self = StObject.set(x, "UtilizationPercentage", value.asInstanceOf[js.Any])
    
    inline def setUtilizationPercentageUndefined: Self = StObject.set(x, "UtilizationPercentage", js.undefined)
  }
}
