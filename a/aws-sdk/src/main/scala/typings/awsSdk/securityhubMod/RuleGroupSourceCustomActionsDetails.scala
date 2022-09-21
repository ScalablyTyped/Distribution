package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceCustomActionsDetails extends StObject {
  
  /**
    * The definition of a custom action.
    */
  var ActionDefinition: js.UndefOr[StatelessCustomActionDefinition] = js.undefined
  
  /**
    * A descriptive name of the custom action.
    */
  var ActionName: js.UndefOr[NonEmptyString] = js.undefined
}
object RuleGroupSourceCustomActionsDetails {
  
  inline def apply(): RuleGroupSourceCustomActionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceCustomActionsDetails]
  }
  
  extension [Self <: RuleGroupSourceCustomActionsDetails](x: Self) {
    
    inline def setActionDefinition(value: StatelessCustomActionDefinition): Self = StObject.set(x, "ActionDefinition", value.asInstanceOf[js.Any])
    
    inline def setActionDefinitionUndefined: Self = StObject.set(x, "ActionDefinition", js.undefined)
    
    inline def setActionName(value: NonEmptyString): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "ActionName", js.undefined)
  }
}
