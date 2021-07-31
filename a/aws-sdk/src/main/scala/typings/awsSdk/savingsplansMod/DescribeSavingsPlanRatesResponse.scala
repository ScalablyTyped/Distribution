package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSavingsPlanRatesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: js.UndefOr[SavingsPlanId] = js.undefined
  
  /**
    * Information about the Savings Plans rates.
    */
  var searchResults: js.UndefOr[SavingsPlanRateList] = js.undefined
}
object DescribeSavingsPlanRatesResponse {
  
  @scala.inline
  def apply(): DescribeSavingsPlanRatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlanRatesResponse]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlanRatesResponseMutableBuilder[Self <: DescribeSavingsPlanRatesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSavingsPlanId(value: SavingsPlanId): Self = StObject.set(x, "savingsPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlanIdUndefined: Self = StObject.set(x, "savingsPlanId", js.undefined)
    
    @scala.inline
    def setSearchResults(value: SavingsPlanRateList): Self = StObject.set(x, "searchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchResultsUndefined: Self = StObject.set(x, "searchResults", js.undefined)
    
    @scala.inline
    def setSearchResultsVarargs(value: SavingsPlanRate*): Self = StObject.set(x, "searchResults", js.Array(value :_*))
  }
}
