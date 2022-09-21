package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRulesetsResponse extends StObject {
  
  /**
    * A token that you can use in a subsequent call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.databrewMod.NextToken] = js.undefined
  
  /**
    * A list of RulesetItem. RulesetItem contains meta data of a ruleset.
    */
  var Rulesets: RulesetItemList
}
object ListRulesetsResponse {
  
  inline def apply(Rulesets: RulesetItemList): ListRulesetsResponse = {
    val __obj = js.Dynamic.literal(Rulesets = Rulesets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRulesetsResponse]
  }
  
  extension [Self <: ListRulesetsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRulesets(value: RulesetItemList): Self = StObject.set(x, "Rulesets", value.asInstanceOf[js.Any])
    
    inline def setRulesetsVarargs(value: RulesetItem*): Self = StObject.set(x, "Rulesets", js.Array(value*))
  }
}
