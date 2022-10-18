package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImpersonationMatchedRule extends StObject {
  
  /**
    * The ID of the rule that matched the input
    */
  var ImpersonationRuleId: js.UndefOr[typings.awsSdk.clientsWorkmailMod.ImpersonationRuleId] = js.undefined
  
  /**
    * The name of the rule that matched the input.
    */
  var Name: js.UndefOr[ImpersonationRuleName] = js.undefined
}
object ImpersonationMatchedRule {
  
  inline def apply(): ImpersonationMatchedRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImpersonationMatchedRule]
  }
  
  extension [Self <: ImpersonationMatchedRule](x: Self) {
    
    inline def setImpersonationRuleId(value: ImpersonationRuleId): Self = StObject.set(x, "ImpersonationRuleId", value.asInstanceOf[js.Any])
    
    inline def setImpersonationRuleIdUndefined: Self = StObject.set(x, "ImpersonationRuleId", js.undefined)
    
    inline def setName(value: ImpersonationRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
