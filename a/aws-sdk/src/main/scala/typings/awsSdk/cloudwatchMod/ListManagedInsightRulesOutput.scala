package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListManagedInsightRulesOutput extends StObject {
  
  /**
    *  The managed rules that are available for the specified Amazon Web Services resource. 
    */
  var ManagedRules: js.UndefOr[ManagedRuleDescriptions] = js.undefined
  
  /**
    *  Include this value to get the next set of rules if the value was returned by the previous operation. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.undefined
}
object ListManagedInsightRulesOutput {
  
  inline def apply(): ListManagedInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListManagedInsightRulesOutput]
  }
  
  extension [Self <: ListManagedInsightRulesOutput](x: Self) {
    
    inline def setManagedRules(value: ManagedRuleDescriptions): Self = StObject.set(x, "ManagedRules", value.asInstanceOf[js.Any])
    
    inline def setManagedRulesUndefined: Self = StObject.set(x, "ManagedRules", js.undefined)
    
    inline def setManagedRulesVarargs(value: ManagedRuleDescription*): Self = StObject.set(x, "ManagedRules", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
