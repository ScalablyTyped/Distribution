package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTargetsByRuleResponse extends StObject {
  
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.eventbridgeMod.NextToken] = js.undefined
  
  /**
    * The targets assigned to the rule.
    */
  var Targets: js.UndefOr[TargetList] = js.undefined
}
object ListTargetsByRuleResponse {
  
  inline def apply(): ListTargetsByRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTargetsByRuleResponse]
  }
  
  extension [Self <: ListTargetsByRuleResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTargets(value: TargetList): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
