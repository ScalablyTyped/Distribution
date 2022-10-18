package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * A description of the rule group that helps with identification. 
    */
  var Description: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * A unique identifier for the rule group. This ID is returned in the responses to create and list commands. You provide it to operations like update and delete.
    */
  var Id: js.UndefOr[EntityId] = js.undefined
  
  /**
    * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: js.UndefOr[typings.awsSdk.clientsWafv2Mod.LockToken] = js.undefined
  
  /**
    * The name of the data type instance. You cannot change the name after you create the instance.
    */
  var Name: js.UndefOr[EntityName] = js.undefined
}
object RuleGroupSummary {
  
  inline def apply(): RuleGroupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSummary]
  }
  
  extension [Self <: RuleGroupSummary](x: Self) {
    
    inline def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setDescription(value: EntityDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: EntityId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLockToken(value: LockToken): Self = StObject.set(x, "LockToken", value.asInstanceOf[js.Any])
    
    inline def setLockTokenUndefined: Self = StObject.set(x, "LockToken", js.undefined)
    
    inline def setName(value: EntityName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
