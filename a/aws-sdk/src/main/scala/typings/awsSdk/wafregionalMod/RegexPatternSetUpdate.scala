package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegexPatternSetUpdate extends js.Object {
  
  /**
    * Specifies whether to insert or delete a RegexPatternString.
    */
  var Action: ChangeAction = js.native
  
  /**
    * Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t.
    */
  var RegexPatternString: typings.awsSdk.wafregionalMod.RegexPatternString = js.native
}
object RegexPatternSetUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, RegexPatternString: RegexPatternString): RegexPatternSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], RegexPatternString = RegexPatternString.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSetUpdate]
  }
  
  @scala.inline
  implicit class RegexPatternSetUpdateOps[Self <: RegexPatternSetUpdate] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ChangeAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternString(value: RegexPatternString): Self = this.set("RegexPatternString", value.asInstanceOf[js.Any])
  }
}
