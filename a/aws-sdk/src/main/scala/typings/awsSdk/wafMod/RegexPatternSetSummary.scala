package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSetSummary extends js.Object {
  /**
    * A friendly name or description of the RegexPatternSet. You can't change Name after you create a RegexPatternSet.
    */
  var Name: ResourceName = js.native
  /**
    * The RegexPatternSetId for a RegexPatternSet. You use RegexPatternSetId to get information about a RegexPatternSet, update a RegexPatternSet, remove a RegexPatternSet from a RegexMatchSet, and delete a RegexPatternSet from AWS WAF.  RegexPatternSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId = js.native
}

object RegexPatternSetSummary {
  @scala.inline
  def apply(Name: ResourceName, RegexPatternSetId: ResourceId): RegexPatternSetSummary = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSetSummary]
  }
  @scala.inline
  implicit class RegexPatternSetSummaryOps[Self <: RegexPatternSetSummary] (val x: Self) extends AnyVal {
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
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegexPatternSetId(value: ResourceId): Self = this.set("RegexPatternSetId", value.asInstanceOf[js.Any])
  }
  
}

