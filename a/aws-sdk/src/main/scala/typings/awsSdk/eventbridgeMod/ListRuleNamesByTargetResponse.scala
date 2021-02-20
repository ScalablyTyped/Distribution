package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRuleNamesByTargetResponse extends StObject {
  
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.native
  
  /**
    * The names of the rules that can invoke the given target.
    */
  var RuleNames: js.UndefOr[RuleNameList] = js.native
}
object ListRuleNamesByTargetResponse {
  
  @scala.inline
  def apply(): ListRuleNamesByTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleNamesByTargetResponse]
  }
  
  @scala.inline
  implicit class ListRuleNamesByTargetResponseMutableBuilder[Self <: ListRuleNamesByTargetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRuleNames(value: RuleNameList): Self = StObject.set(x, "RuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNamesUndefined: Self = StObject.set(x, "RuleNames", js.undefined)
    
    @scala.inline
    def setRuleNamesVarargs(value: RuleName*): Self = StObject.set(x, "RuleNames", js.Array(value :_*))
  }
}
