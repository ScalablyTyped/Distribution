package typings.awsSdk.savingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlansRequest extends StObject {
  
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanFilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the Savings Plans.
    */
  var savingsPlanArns: js.UndefOr[SavingsPlanArnList] = js.native
  
  /**
    * The IDs of the Savings Plans.
    */
  var savingsPlanIds: js.UndefOr[SavingsPlanIdList] = js.native
  
  /**
    * The states.
    */
  var states: js.UndefOr[SavingsPlanStateList] = js.native
}
object DescribeSavingsPlansRequest {
  
  @scala.inline
  def apply(): DescribeSavingsPlansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansRequest]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlansRequestMutableBuilder[Self <: DescribeSavingsPlansRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilters(value: SavingsPlanFilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: SavingsPlanFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSavingsPlanArns(value: SavingsPlanArnList): Self = StObject.set(x, "savingsPlanArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlanArnsUndefined: Self = StObject.set(x, "savingsPlanArns", js.undefined)
    
    @scala.inline
    def setSavingsPlanArnsVarargs(value: SavingsPlanArn*): Self = StObject.set(x, "savingsPlanArns", js.Array(value :_*))
    
    @scala.inline
    def setSavingsPlanIds(value: SavingsPlanIdList): Self = StObject.set(x, "savingsPlanIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSavingsPlanIdsUndefined: Self = StObject.set(x, "savingsPlanIds", js.undefined)
    
    @scala.inline
    def setSavingsPlanIdsVarargs(value: SavingsPlanId*): Self = StObject.set(x, "savingsPlanIds", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: SavingsPlanStateList): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: SavingsPlanState*): Self = StObject.set(x, "states", js.Array(value :_*))
  }
}
