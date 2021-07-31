package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppRequest extends StObject {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  
  /**
    * The new description of the application.
    */
  var description: js.UndefOr[AppDescription] = js.undefined
  
  /**
    * The new name of the application.
    */
  var name: js.UndefOr[AppName] = js.undefined
  
  /**
    * The name of the service role in the customer's account used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  
  /**
    * The server groups in the application to update.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.undefined
  
  /**
    * The tags to associate with the application.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object UpdateAppRequest {
  
  @scala.inline
  def apply(): UpdateAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppRequest]
  }
  
  @scala.inline
  implicit class UpdateAppRequestMutableBuilder[Self <: UpdateAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppIdUndefined: Self = StObject.set(x, "appId", js.undefined)
    
    @scala.inline
    def setDescription(value: AppDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: AppName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRoleName(value: RoleName): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    @scala.inline
    def setServerGroups(value: ServerGroups): Self = StObject.set(x, "serverGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerGroupsUndefined: Self = StObject.set(x, "serverGroups", js.undefined)
    
    @scala.inline
    def setServerGroupsVarargs(value: ServerGroup*): Self = StObject.set(x, "serverGroups", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
