package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSqlInjectionMatchSetsResponse extends js.Object {
  /**
    * If you have more SqlInjectionMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SqlInjectionMatchSet objects, submit another ListSqlInjectionMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of SqlInjectionMatchSetSummary objects.
    */
  var SqlInjectionMatchSets: js.UndefOr[SqlInjectionMatchSetSummaries] = js.native
}

object ListSqlInjectionMatchSetsResponse {
  @scala.inline
  def apply(NextMarker: NextMarker = null, SqlInjectionMatchSets: SqlInjectionMatchSetSummaries = null): ListSqlInjectionMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (SqlInjectionMatchSets != null) __obj.updateDynamic("SqlInjectionMatchSets")(SqlInjectionMatchSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSqlInjectionMatchSetsResponse]
  }
}

