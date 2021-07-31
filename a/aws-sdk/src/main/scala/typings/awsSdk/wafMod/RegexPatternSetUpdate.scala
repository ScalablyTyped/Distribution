package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexPatternSetUpdate extends StObject {
  
  /**
    * Specifies whether to insert or delete a RegexPatternString.
    */
  var Action: ChangeAction
  
  /**
    * Specifies the regular expression (regex) pattern that you want AWS WAF to search for, such as B[a@]dB[o0]t.
    */
  var RegexPatternString: typings.awsSdk.wafMod.RegexPatternString
}
object RegexPatternSetUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, RegexPatternString: RegexPatternString): RegexPatternSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], RegexPatternString = RegexPatternString.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSetUpdate]
  }
  
  @scala.inline
  implicit class RegexPatternSetUpdateMutableBuilder[Self <: RegexPatternSetUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternString(value: RegexPatternString): Self = StObject.set(x, "RegexPatternString", value.asInstanceOf[js.Any])
  }
}
