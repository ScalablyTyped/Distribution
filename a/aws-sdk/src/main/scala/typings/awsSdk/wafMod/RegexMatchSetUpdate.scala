package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexMatchSetUpdate extends StObject {
  
  /**
    * Specifies whether to insert or delete a RegexMatchTuple.
    */
  var Action: ChangeAction
  
  /**
    * Information about the part of a web request that you want AWS WAF to inspect and the identifier of the regular expression (regex) pattern that you want AWS WAF to search for. If you specify DELETE for the value of Action, the RegexMatchTuple values must exactly match the values in the RegexMatchTuple that you want to delete from the RegexMatchSet.
    */
  var RegexMatchTuple: typings.awsSdk.wafMod.RegexMatchTuple
}
object RegexMatchSetUpdate {
  
  @scala.inline
  def apply(Action: ChangeAction, RegexMatchTuple: RegexMatchTuple): RegexMatchSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], RegexMatchTuple = RegexMatchTuple.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchSetUpdate]
  }
  
  @scala.inline
  implicit class RegexMatchSetUpdateMutableBuilder[Self <: RegexMatchSetUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: ChangeAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexMatchTuple(value: RegexMatchTuple): Self = StObject.set(x, "RegexMatchTuple", value.asInstanceOf[js.Any])
  }
}
