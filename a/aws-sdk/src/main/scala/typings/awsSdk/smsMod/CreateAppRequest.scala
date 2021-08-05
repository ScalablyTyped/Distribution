package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of application creation.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The description of the new application
    */
  var description: js.UndefOr[AppDescription] = js.undefined
  
  /**
    * The name of the new application.
    */
  var name: js.UndefOr[AppName] = js.undefined
  
  /**
    * The name of the service role in the customer's account to be used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  
  /**
    * The server groups to include in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.undefined
  
  /**
    * The tags to be associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateAppRequest {
  
  inline def apply(): CreateAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppRequest]
  }
  
  extension [Self <: CreateAppRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: AppDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: AppName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoleName(value: RoleName): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    inline def setServerGroups(value: ServerGroups): Self = StObject.set(x, "serverGroups", value.asInstanceOf[js.Any])
    
    inline def setServerGroupsUndefined: Self = StObject.set(x, "serverGroups", js.undefined)
    
    inline def setServerGroupsVarargs(value: ServerGroup*): Self = StObject.set(x, "serverGroups", js.Array(value :_*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
