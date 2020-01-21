package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListXssMatchSetsResponse extends js.Object {
  /**
    * If you have more XssMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more XssMatchSet objects, submit another ListXssMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of XssMatchSetSummary objects.
    */
  var XssMatchSets: js.UndefOr[XssMatchSetSummaries] = js.native
}

object ListXssMatchSetsResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, XssMatchSets: XssMatchSetSummaries = null): ListXssMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (XssMatchSets != null) __obj.updateDynamic("XssMatchSets")(XssMatchSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListXssMatchSetsResponse]
  }
}

