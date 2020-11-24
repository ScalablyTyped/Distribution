package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(RegexPatternSetId: ResourceId, RegexPatternStrings: RegexPatternStrings): RegexPatternSet = {
    val __obj = js.Dynamic.literal(RegexPatternSetId = RegexPatternSetId.asInstanceOf[js.Any], RegexPatternStrings = RegexPatternStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSet]
  }
  
  @scala.inline
  implicit class RegexPatternSetOps[Self <: RegexPatternSet] (val x: Self) extends AnyVal {
    
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
    def setRegexPatternSetId(value: ResourceId): Self = this.set("RegexPatternSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternStringsVarargs(value: RegexPatternString*): Self = this.set("RegexPatternStrings", js.Array(value :_*))
    
    @scala.inline
    def setRegexPatternStrings(value: RegexPatternStrings): Self = this.set("RegexPatternStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: ResourceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
