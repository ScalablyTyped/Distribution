package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlanRatesResponse extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: js.UndefOr[SavingsPlanId] = js.native
  
  /**
    * Information about the Savings Plans rates.
    */
  var searchResults: js.UndefOr[SavingsPlanRateList] = js.native
}
object DescribeSavingsPlanRatesResponse {
  
  @scala.inline
  def apply(): DescribeSavingsPlanRatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlanRatesResponse]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlanRatesResponseOps[Self <: DescribeSavingsPlanRatesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSavingsPlanId(value: SavingsPlanId): Self = this.set("savingsPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSavingsPlanId: Self = this.set("savingsPlanId", js.undefined)
    
    @scala.inline
    def setSearchResultsVarargs(value: SavingsPlanRate*): Self = this.set("searchResults", js.Array(value :_*))
    
    @scala.inline
    def setSearchResults(value: SavingsPlanRateList): Self = this.set("searchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchResults: Self = this.set("searchResults", js.undefined)
  }
}
