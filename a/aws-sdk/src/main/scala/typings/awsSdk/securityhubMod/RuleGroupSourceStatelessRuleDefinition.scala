package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatelessRuleDefinition extends StObject {
  
  /**
    * The actions to take on a packet that matches one of the stateless rule definition's match attributes. You must specify a standard action (aws:pass, aws:drop, or aws:forward_to_sfe). You can then add custom actions.
    */
  var Actions: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The criteria for Network Firewall to use to inspect an individual packet in a stateless rule inspection.
    */
  var MatchAttributes: js.UndefOr[RuleGroupSourceStatelessRuleMatchAttributes] = js.undefined
}
object RuleGroupSourceStatelessRuleDefinition {
  
  inline def apply(): RuleGroupSourceStatelessRuleDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatelessRuleDefinition]
  }
  
  extension [Self <: RuleGroupSourceStatelessRuleDefinition](x: Self) {
    
    inline def setActions(value: NonEmptyStringList): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "Actions", js.undefined)
    
    inline def setActionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setMatchAttributes(value: RuleGroupSourceStatelessRuleMatchAttributes): Self = StObject.set(x, "MatchAttributes", value.asInstanceOf[js.Any])
    
    inline def setMatchAttributesUndefined: Self = StObject.set(x, "MatchAttributes", js.undefined)
  }
}
