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
  def apply(): GetUsageTotalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUsageTotalsResponse]
  }
  @scala.inline
  implicit class GetUsageTotalsResponseOps[Self <: GetUsageTotalsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUsageTotalsVarargs(value: UsageTotal*): Self = this.set("usageTotals", js.Array(value :_*))
    @scala.inline
    def setUsageTotals(value: listOfUsageTotal): Self = this.set("usageTotals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsageTotals: Self = this.set("usageTotals", js.undefined)
  }
  
}

