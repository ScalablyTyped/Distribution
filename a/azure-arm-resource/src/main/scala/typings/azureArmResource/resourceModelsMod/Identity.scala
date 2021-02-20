package typings.azureArmResource.resourceModelsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identity extends StObject {
  
  /**
    * The principal ID of resource identity.
    */
  val principalId: js.UndefOr[String] = js.native
  
  /**
    * The tenant ID of resource.
    */
  val tenantId: js.UndefOr[String] = js.native
  
  /**
    * The identity type. Possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
    * UserAssigned', 'None'
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The list of user identities associated with the resource. The user identity dictionary key
    * references will be ARM resource ids in the form:
    * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
    */
  var userAssignedIdentities: js.UndefOr[StringDictionary[IdentityUserAssignedIdentitiesValue]] = js.native
}
object Identity {
  
  @scala.inline
  def apply(): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrincipalId(value: String): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    @scala.inline
    def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserAssignedIdentities(value: StringDictionary[IdentityUserAssignedIdentitiesValue]): Self = StObject.set(x, "userAssignedIdentities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserAssignedIdentitiesUndefined: Self = StObject.set(x, "userAssignedIdentities", js.undefined)
  }
}
