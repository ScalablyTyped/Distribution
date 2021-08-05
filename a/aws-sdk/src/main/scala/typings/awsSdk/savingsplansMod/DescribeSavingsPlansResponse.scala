package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSavingsPlansResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the Savings Plans.
    */
  var savingsPlans: js.UndefOr[SavingsPlanList] = js.undefined
}
object DescribeSavingsPlansResponse {
  
  inline def apply(): DescribeSavingsPlansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansResponse]
  }
  
  extension [Self <: DescribeSavingsPlansResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSavingsPlans(value: SavingsPlanList): Self = StObject.set(x, "savingsPlans", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlansUndefined: Self = StObject.set(x, "savingsPlans", js.undefined)
    
    inline def setSavingsPlansVarargs(value: SavingsPlan*): Self = StObject.set(x, "savingsPlans", js.Array(value :_*))
  }
}
