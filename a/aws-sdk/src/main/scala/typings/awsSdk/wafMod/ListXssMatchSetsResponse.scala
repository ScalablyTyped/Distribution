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
  def apply(): ListXssMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListXssMatchSetsResponse]
  }
  @scala.inline
  implicit class ListXssMatchSetsResponseOps[Self <: ListXssMatchSetsResponse] (val x: Self) extends AnyVal {
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
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
    @scala.inline
    def setXssMatchSetsVarargs(value: XssMatchSetSummary*): Self = this.set("XssMatchSets", js.Array(value :_*))
    @scala.inline
    def setXssMatchSets(value: XssMatchSetSummaries): Self = this.set("XssMatchSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXssMatchSets: Self = this.set("XssMatchSets", js.undefined)
  }
  
}

