package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsageTotalsResponse extends js.Object {
  /**
    * An array of objects that contains the results of the query. Each object contains the data for a specific usage metric.
    */
  var usageTotals: js.UndefOr[listOfUsageTotal] = js.native
}

object GetUsageTotalsResponse {
  @scala.inline
  def apply(usageTotals: listOfUsageTotal = null): GetUsageTotalsResponse = {
    val __obj = js.Dynamic.literal()
    if (usageTotals != null) __obj.updateDynamic("usageTotals")(usageTotals.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageTotalsResponse]
  }
}

