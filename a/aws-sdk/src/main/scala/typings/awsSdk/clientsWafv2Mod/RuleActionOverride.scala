package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleActionOverride extends StObject {
  
  /**
    * The override action to use, in place of the configured action of the rule in the rule group. 
    */
  var ActionToUse: RuleAction
  
  /**
    * The name of the rule to override.
    */
  var Name: EntityName
}
object RuleActionOverride {
  
  inline def apply(ActionToUse: RuleAction, Name: EntityName): RuleActionOverride = {
    val __obj = js.Dynamic.literal(ActionToUse = ActionToUse.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleActionOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleActionOverride] (val x: Self) extends AnyVal {
    
    inline def setActionToUse(value: RuleAction): Self = StObject.set(x, "ActionToUse", value.asInstanceOf[js.Any])
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
