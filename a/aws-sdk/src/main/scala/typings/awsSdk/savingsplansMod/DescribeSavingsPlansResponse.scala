package typings.awsSdk.savingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSavingsPlansResponse extends js.Object {
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
  def apply(nextToken: PaginationToken = null, savingsPlans: SavingsPlanList = null): DescribeSavingsPlansResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (savingsPlans != null) __obj.updateDynamic("savingsPlans")(savingsPlans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSavingsPlansResponse]
  }
}

