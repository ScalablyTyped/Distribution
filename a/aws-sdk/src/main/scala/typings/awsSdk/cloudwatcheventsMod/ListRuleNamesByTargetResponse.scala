package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRuleNamesByTargetResponse extends StObject {
  
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.undefined
  
  /**
    * The names of the rules that can invoke the given target.
    */
  var RuleNames: js.UndefOr[RuleNameList] = js.undefined
}
object ListRuleNamesByTargetResponse {
  
  inline def apply(): ListRuleNamesByTargetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRuleNamesByTargetResponse]
  }
  
  extension [Self <: ListRuleNamesByTargetResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRuleNames(value: RuleNameList): Self = StObject.set(x, "RuleNames", value.asInstanceOf[js.Any])
    
    inline def setRuleNamesUndefined: Self = StObject.set(x, "RuleNames", js.undefined)
    
    inline def setRuleNamesVarargs(value: RuleName*): Self = StObject.set(x, "RuleNames", js.Array(value :_*))
  }
}
