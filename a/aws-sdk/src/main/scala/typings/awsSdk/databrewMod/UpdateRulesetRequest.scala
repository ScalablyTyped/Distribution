package typings.awsSdk.databrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRulesetRequest extends StObject {
  
  /**
    * The description of the ruleset.
    */
  var Description: js.UndefOr[RulesetDescription] = js.undefined
  
  /**
    * The name of the ruleset to be updated.
    */
  var Name: RulesetName
  
  /**
    * A list of rules that are defined with the ruleset. A rule includes one or more checks to be validated on a DataBrew dataset.
    */
  var Rules: RuleList
}
object UpdateRulesetRequest {
  
  inline def apply(Name: RulesetName, Rules: RuleList): UpdateRulesetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRulesetRequest]
  }
  
  extension [Self <: UpdateRulesetRequest](x: Self) {
    
    inline def setDescription(value: RulesetDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: RulesetName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRules(value: RuleList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: Rule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
