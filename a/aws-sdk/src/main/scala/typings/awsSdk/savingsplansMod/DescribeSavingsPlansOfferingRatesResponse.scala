package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSavingsPlansOfferingRatesResponse extends js.Object {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Information about the Savings Plans offering rates.
    */
  var searchResults: js.UndefOr[SavingsPlanOfferingRatesList] = js.native
}
object DescribeSavingsPlansOfferingRatesResponse {
  
  @scala.inline
  def apply(): DescribeSavingsPlansOfferingRatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSavingsPlansOfferingRatesResponse]
  }
  
  @scala.inline
  implicit class DescribeSavingsPlansOfferingRatesResponseOps[Self <: DescribeSavingsPlansOfferingRatesResponse] (val x: Self) extends AnyVal {
    
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
    def setSearchResultsVarargs(value: SavingsPlanOfferingRate*): Self = this.set("searchResults", js.Array(value :_*))
    
    @scala.inline
    def setSearchResults(value: SavingsPlanOfferingRatesList): Self = this.set("searchResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchResults: Self = this.set("searchResults", js.undefined)
  }
}
