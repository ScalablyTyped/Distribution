package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Identity extends StObject {
  
  /**
    * The principal ID of resource identity.
    */
  val principalId: js.UndefOr[String] = js.undefined
  
  /**
    * The tenant ID of resource.
    */
  val tenantId: js.UndefOr[String] = js.undefined
  
  /**
    * The identity type. Possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
    * UserAssigned', 'None'
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The list of user identities associated with the resource. The user identity dictionary key
    * references will be ARM resource ids in the form:
    * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
    */
  var userAssignedIdentities: js.UndefOr[StringDictionary[IdentityUserAssignedIdentitiesValue]] = js.undefined
}
object Identity {
  
  inline def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  extension [Self <: Identity](x: Self) {
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserAssignedIdentities(value: StringDictionary[IdentityUserAssignedIdentitiesValue]): Self = StObject.set(x, "userAssignedIdentities", value.asInstanceOf[js.Any])
    
    inline def setUserAssignedIdentitiesUndefined: Self = StObject.set(x, "userAssignedIdentities", js.undefined)
  }
}
