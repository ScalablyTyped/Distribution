package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlansOfferingsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the Savings Plans offerings.
    */
  var searchResults: js.UndefOr[SavingsPlanOfferingsList] = js.native
}

object DescribeSavingsPlansOfferingsResponse {
  @scala.inline
  def apply(nextToken: PaginationToken = null, searchResults: SavingsPlanOfferingsList = null): DescribeSavingsPlansOfferingsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (searchResults != null) __obj.updateDynamic("searchResults")(searchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSavingsPlansOfferingsResponse]
  }
}

