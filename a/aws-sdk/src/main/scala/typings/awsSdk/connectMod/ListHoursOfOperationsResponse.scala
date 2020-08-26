package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHoursOfOperationsResponse extends js.Object {
  /**
    * Information about the hours of operation.
    */
  var HoursOfOperationSummaryList: js.UndefOr[typings.awsSdk.connectMod.HoursOfOperationSummaryList] = js.native
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.connectMod.NextToken] = js.native
}

object ListHoursOfOperationsResponse {
  @scala.inline
  def apply(): ListHoursOfOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHoursOfOperationsResponse]
  }
  @scala.inline
  implicit class ListHoursOfOperationsResponseOps[Self <: ListHoursOfOperationsResponse] (val x: Self) extends AnyVal {
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
    def setHoursOfOperationSummaryListVarargs(value: HoursOfOperationSummary*): Self = this.set("HoursOfOperationSummaryList", js.Array(value :_*))
    @scala.inline
    def setHoursOfOperationSummaryList(value: HoursOfOperationSummaryList): Self = this.set("HoursOfOperationSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoursOfOperationSummaryList: Self = this.set("HoursOfOperationSummaryList", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

