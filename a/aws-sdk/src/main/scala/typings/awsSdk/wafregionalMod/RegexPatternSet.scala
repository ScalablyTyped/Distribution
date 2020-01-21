package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegexPatternSet extends js.Object {
  /**
    * A friendly name or description of the RegexPatternSet. You can't change Name after you create a RegexPatternSet.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The identifier for the RegexPatternSet. You use RegexPatternSetId to get information about a RegexPatternSet, update a RegexPatternSet, remove a RegexPatternSet from a RegexMatchSet, and delete a RegexPatternSet from AWS WAF.  RegexMatchSetId is returned by CreateRegexPatternSet and by ListRegexPatternSets.
    */
  var RegexPatternSetId: ResourceId = js.native
  /**
    * Specifies the regular expression (regex) patterns that you want AWS WAF to search for, such as B[a@]dB[o0]t.
    */
  var RegexPatternStrings: typings.awsSdk.wafregionalMod.RegexPatternStrings = js.native
}

object RegexPatternSet {
  @scala.inline
  def apply(RegexPatternSetId: ResourceId, RegexPatternStrings: RegexPatternStrings, Name: ResourceName = null): RegexPatternSet = {
    val __obj = js.Dynamic.literal(RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any], RegexPatternStrings = RegexPatternStrings.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSet]
  }
}

