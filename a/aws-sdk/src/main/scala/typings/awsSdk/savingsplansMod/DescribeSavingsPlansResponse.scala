package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlansResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Information about the Savings Plans.
    */
  var savingsPlans: js.UndefOr[SavingsPlanList] = js.native
}
object DescribeSavingsPlansResponse {
  
  @scala.inline
  def apply(): DescribeSavingsPlansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansResponse]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlansResponseMutableBuilder[Self <: DescribeSavingsPlansResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSavingsPlans(value: SavingsPlanList): Self = StObject.set(x, "savingsPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlansUndefined: Self = StObject.set(x, "savingsPlans", js.undefined)
    
    @scala.inline
    def setSavingsPlansVarargs(value: SavingsPlan*): Self = StObject.set(x, "savingsPlans", js.Array(value :_*))
  }
}
