package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRegexPatternSetsResponse extends js.Object {
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.native
  /**
    * 
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

