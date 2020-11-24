package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlanRatesRequest extends js.Object {
  
  /**
    * The filters.
    */
  var filters: js.UndefOr[SavingsPlanRateFilterList] = js.native
  
  /**
    * The maximum number of results to return with a single call. To retrieve additional results, make another call with the returned token value.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: SavingsPlanId = js.native
}
object DescribeSavingsPlanRatesRequest {
  
  @scala.inline
  def apply(savingsPlanId: SavingsPlanId): DescribeSavingsPlanRatesRequest = {
    val __obj = js.Dynamic.literal(savingsPlanId = savingsPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSavingsPlanRatesRequest]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlanRatesRequestOps[Self <: DescribeSavingsPlanRatesRequest] (val x: Self) extends AnyVal {
    
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
    def setSavingsPlanId(value: SavingsPlanId): Self = this.set("savingsPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: SavingsPlanRateFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: SavingsPlanRateFilterList): Self = this.set("filters", value.asInstanceOf[js.Any])
    
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
  }
}
