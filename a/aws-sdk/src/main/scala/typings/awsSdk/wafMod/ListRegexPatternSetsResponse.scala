package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegexPatternSetsResponse extends js.Object {
  /**
    * If you have more RegexPatternSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexPatternSet objects, submit another ListRegexPatternSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  /**
    * An array of RegexPatternSetSummary objects.
    */
  var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.native
}

object ListRegexPatternSetsResponse {
  @scala.inline
  def apply(): ListRegexPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexPatternSetsResponse]
  }
  @scala.inline
  implicit class ListRegexPatternSetsResponseOps[Self <: ListRegexPatternSetsResponse] (val x: Self) extends AnyVal {
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
    def setRegexPatternSetsVarargs(value: RegexPatternSetSummary*): Self = this.set("RegexPatternSets", js.Array(value :_*))
    @scala.inline
    def setRegexPatternSets(value: RegexPatternSetSummaries): Self = this.set("RegexPatternSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexPatternSets: Self = this.set("RegexPatternSets", js.undefined)
  }
  
}

