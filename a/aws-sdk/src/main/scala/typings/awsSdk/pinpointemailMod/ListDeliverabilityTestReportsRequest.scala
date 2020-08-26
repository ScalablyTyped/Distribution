package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeliverabilityTestReportsRequest extends js.Object {
  /**
    * A token returned from a previous call to ListDeliverabilityTestReports to indicate the position in the list of predictive inbox placement tests.
    */
  var NextToken: js.UndefOr[typings.awsSdk.pinpointemailMod.NextToken] = js.native
  /**
    * The number of results to show in a single call to ListDeliverabilityTestReports. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results. The value you specify has to be at least 0, and can be no more than 1000.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
}

object ListDeliverabilityTestReportsRequest {
  @scala.inline
  def apply(): ListDeliverabilityTestReportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeliverabilityTestReportsRequest]
  }
  @scala.inline
  implicit class ListDeliverabilityTestReportsRequestOps[Self <: ListDeliverabilityTestReportsRequest] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPageSize(value: MaxItems): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
  }
  
}

