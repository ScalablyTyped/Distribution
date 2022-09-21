package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSavingsPlansRequest extends StObject {
  
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanFilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the Savings Plans.
    */
  var savingsPlanArns: js.UndefOr[SavingsPlanArnList] = js.undefined
  
  /**
    * The IDs of the Savings Plans.
    */
  var savingsPlanIds: js.UndefOr[SavingsPlanIdList] = js.undefined
  
  /**
    * The states.
    */
  var states: js.UndefOr[SavingsPlanStateList] = js.undefined
}
object DescribeSavingsPlansRequest {
  
  inline def apply(): DescribeSavingsPlansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansRequest]
  }
  
  extension [Self <: DescribeSavingsPlansRequest](x: Self) {
    
    inline def setFilters(value: SavingsPlanFilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: SavingsPlanFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSavingsPlanArns(value: SavingsPlanArnList): Self = StObject.set(x, "savingsPlanArns", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanArnsUndefined: Self = StObject.set(x, "savingsPlanArns", js.undefined)
    
    inline def setSavingsPlanArnsVarargs(value: SavingsPlanArn*): Self = StObject.set(x, "savingsPlanArns", js.Array(value*))
    
    inline def setSavingsPlanIds(value: SavingsPlanIdList): Self = StObject.set(x, "savingsPlanIds", value.asInstanceOf[js.Any])
    
    inline def setSavingsPlanIdsUndefined: Self = StObject.set(x, "savingsPlanIds", js.undefined)
    
    inline def setSavingsPlanIdsVarargs(value: SavingsPlanId*): Self = StObject.set(x, "savingsPlanIds", js.Array(value*))
    
    inline def setStates(value: SavingsPlanStateList): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatesVarargs(value: SavingsPlanState*): Self = StObject.set(x, "states", js.Array(value*))
  }
}
