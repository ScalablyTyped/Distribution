package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSuppressedDestinationsRequest extends js.Object {
  /**
    * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to the list before a specific date. The date that you specify should be in Unix time format.
    */
  var EndDate: js.UndefOr[Timestamp] = js.native
  /**
    * A token returned from a previous call to ListSuppressedDestinations to indicate the position in the list of suppressed email addresses.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
  /**
    * The number of results to show in a single call to ListSuppressedDestinations. If the number of results is larger than the number you specified in this parameter, then the response includes a NextToken element, which you can use to obtain additional results.
    */
  var PageSize: js.UndefOr[MaxItems] = js.native
  /**
    * The factors that caused the email address to be added to .
    */
  var Reasons: js.UndefOr[SuppressionListReasons] = js.native
  /**
    * Used to filter the list of suppressed email destinations so that it only includes addresses that were added to the list after a specific date. The date that you specify should be in Unix time format.
    */
  var StartDate: js.UndefOr[Timestamp] = js.native
}

object ListSuppressedDestinationsRequest {
  @scala.inline
  def apply(): ListSuppressedDestinationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSuppressedDestinationsRequest]
  }
  @scala.inline
  implicit class ListSuppressedDestinationsRequestOps[Self <: ListSuppressedDestinationsRequest] (val x: Self) extends AnyVal {
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
    def setEndDate(value: Timestamp): Self = this.set("EndDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("EndDate", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPageSize(value: MaxItems): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    @scala.inline
    def setReasonsVarargs(value: SuppressionListReason*): Self = this.set("Reasons", js.Array(value :_*))
    @scala.inline
    def setReasons(value: SuppressionListReasons): Self = this.set("Reasons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasons: Self = this.set("Reasons", js.undefined)
    @scala.inline
    def setStartDate(value: Timestamp): Self = this.set("StartDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("StartDate", js.undefined)
  }
  
}

