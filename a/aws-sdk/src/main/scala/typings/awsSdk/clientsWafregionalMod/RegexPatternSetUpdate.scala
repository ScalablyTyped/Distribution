package typings.awsSdk.clientsWafregionalMod

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
  var RegexPatternString: typings.awsSdk.clientsWafregionalMod.RegexPatternString
}
object RegexPatternSetUpdate {
  
  inline def apply(Action: ChangeAction, RegexPatternString: RegexPatternString): RegexPatternSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], RegexPatternString = RegexPatternString.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexPatternSetUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegexPatternSetUpdate] (val x: Self) extends AnyVal {
    
    inline def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternString(value: RegexPatternString): Self = StObject.set(x, "RegexPatternString", value.asInstanceOf[js.Any])
  }
}
