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
  def apply(NextToken: NextToken = null, SuppressedDestinationSummaries: SuppressedDestinationSummaries = null): ListSuppressedDestinationsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SuppressedDestinationSummaries != null) __obj.updateDynamic("SuppressedDestinationSummaries")(SuppressedDestinationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSuppressedDestinationsResponse]
  }
}

