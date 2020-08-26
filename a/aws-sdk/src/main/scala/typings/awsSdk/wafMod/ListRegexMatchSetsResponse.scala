package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegexMatchSetsResponse extends js.Object {
  /**
    * If you have more RegexMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexMatchSet objects, submit another ListRegexMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of RegexMatchSetSummary objects.
    */
  var RegexMatchSets: js.UndefOr[RegexMatchSetSummaries] = js.native
}

object ListRegexMatchSetsResponse {
  @scala.inline
  def apply(): ListRegexMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexMatchSetsResponse]
  }
  @scala.inline
  implicit class ListRegexMatchSetsResponseOps[Self <: ListRegexMatchSetsResponse] (val x: Self) extends AnyVal {
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
    def setRegexMatchSetsVarargs(value: RegexMatchSetSummary*): Self = this.set("RegexMatchSets", js.Array(value :_*))
    @scala.inline
    def setRegexMatchSets(value: RegexMatchSetSummaries): Self = this.set("RegexMatchSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexMatchSets: Self = this.set("RegexMatchSets", js.undefined)
  }
  
}

