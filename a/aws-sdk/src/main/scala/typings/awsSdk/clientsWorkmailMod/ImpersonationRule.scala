package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImpersonationRule extends StObject {
  
  /**
    * The rule description.
    */
  var Description: js.UndefOr[ImpersonationRuleDescription] = js.undefined
  
  /**
    * The effect of the rule when it matches the input. Allowed effect values are ALLOW or DENY.
    */
  var Effect: AccessEffect
  
  /**
    * The identifier of the rule.
    */
  var ImpersonationRuleId: typings.awsSdk.clientsWorkmailMod.ImpersonationRuleId
  
  /**
    * The rule name.
    */
  var Name: js.UndefOr[ImpersonationRuleName] = js.undefined
  
  /**
    * A list of user IDs that don't match the rule.
    */
  var NotTargetUsers: js.UndefOr[TargetUsers] = js.undefined
  
  /**
    * A list of user IDs that match the rule.
    */
  var TargetUsers: js.UndefOr[typings.awsSdk.clientsWorkmailMod.TargetUsers] = js.undefined
}
object ImpersonationRule {
  
  inline def apply(Effect: AccessEffect, ImpersonationRuleId: ImpersonationRuleId): ImpersonationRule = {
    val __obj = js.Dynamic.literal(Effect = Effect.asInstanceOf[js.Any], ImpersonationRuleId = ImpersonationRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImpersonationRule]
  }
  
  extension [Self <: ImpersonationRule](x: Self) {
    
    inline def setDescription(value: ImpersonationRuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEffect(value: AccessEffect): Self = StObject.set(x, "Effect", value.asInstanceOf[js.Any])
    
    inline def setImpersonationRuleId(value: ImpersonationRuleId): Self = StObject.set(x, "ImpersonationRuleId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ImpersonationRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNotTargetUsers(value: TargetUsers): Self = StObject.set(x, "NotTargetUsers", value.asInstanceOf[js.Any])
    
    inline def setNotTargetUsersUndefined: Self = StObject.set(x, "NotTargetUsers", js.undefined)
    
    inline def setNotTargetUsersVarargs(value: EntityIdentifier*): Self = StObject.set(x, "NotTargetUsers", js.Array(value*))
    
    inline def setTargetUsers(value: TargetUsers): Self = StObject.set(x, "TargetUsers", value.asInstanceOf[js.Any])
    
    inline def setTargetUsersUndefined: Self = StObject.set(x, "TargetUsers", js.undefined)
    
    inline def setTargetUsersVarargs(value: EntityIdentifier*): Self = StObject.set(x, "TargetUsers", js.Array(value*))
  }
}
