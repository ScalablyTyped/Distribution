package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    nextToken: PaginationToken = null,
    savingsPlanId: SavingsPlanId = null,
    searchResults: SavingsPlanRateList = null
  ): DescribeSavingsPlanRatesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (savingsPlanId != null) __obj.updateDynamic("savingsPlanId")(savingsPlanId.asInstanceOf[js.Any])
    if (searchResults != null) __obj.updateDynamic("searchResults")(searchResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSavingsPlanRatesResponse]
  }
}

