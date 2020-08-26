package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSuppressedDestinationsResponse extends js.Object {
  /**
    * A token that indicates that there are additional email addresses on the suppression list for your account. To view additional suppressed addresses, issue another request to ListSuppressedDestinations, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typings.awsSdk.sesv2Mod.NextToken] = js.native
  /**
    * A list of summaries, each containing a summary for a suppressed email destination.
    */
  var SuppressedDestinationSummaries: js.UndefOr[typings.awsSdk.sesv2Mod.SuppressedDestinationSummaries] = js.native
}

object ListSuppressedDestinationsResponse {
  @scala.inline
  def apply(): ListSuppressedDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSuppressedDestinationsResponse]
  }
  @scala.inline
  implicit class ListSuppressedDestinationsResponseOps[Self <: ListSuppressedDestinationsResponse] (val x: Self) extends AnyVal {
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
    def setSuppressedDestinationSummariesVarargs(value: SuppressedDestinationSummary*): Self = this.set("SuppressedDestinationSummaries", js.Array(value :_*))
    @scala.inline
    def setSuppressedDestinationSummaries(value: SuppressedDestinationSummaries): Self = this.set("SuppressedDestinationSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressedDestinationSummaries: Self = this.set("SuppressedDestinationSummaries", js.undefined)
  }
  
}

