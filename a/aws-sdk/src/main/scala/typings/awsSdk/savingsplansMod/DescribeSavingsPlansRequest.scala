package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlansRequest extends js.Object {
  
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
  implicit class DescribeSavingsPlansRequestOps[Self <: DescribeSavingsPlansRequest] (val x: Self) extends AnyVal {
    
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
    def setFiltersVarargs(value: SavingsPlanFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: SavingsPlanFilterList): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSavingsPlanArnsVarargs(value: SavingsPlanArn*): Self = this.set("savingsPlanArns", js.Array(value :_*))
    
    @scala.inline
    def setSavingsPlanArns(value: SavingsPlanArnList): Self = this.set("savingsPlanArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlanArns: Self = this.set("savingsPlanArns", js.undefined)
    
    @scala.inline
    def setSavingsPlanIdsVarargs(value: SavingsPlanId*): Self = this.set("savingsPlanIds", js.Array(value :_*))
    
    @scala.inline
    def setSavingsPlanIds(value: SavingsPlanIdList): Self = this.set("savingsPlanIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlanIds: Self = this.set("savingsPlanIds", js.undefined)
    
    @scala.inline
    def setStatesVarargs(value: SavingsPlanState*): Self = this.set("states", js.Array(value :_*))
    
    @scala.inline
    def setStates(value: SavingsPlanStateList): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
  }
}
