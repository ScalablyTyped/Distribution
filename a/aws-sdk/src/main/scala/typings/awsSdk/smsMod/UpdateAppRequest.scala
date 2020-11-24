package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAppRequest extends js.Object {
  
  /**
    * The ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.native
  
  /**
    * The new description of the application.
    */
  var description: js.UndefOr[AppDescription] = js.native
  
  /**
    * The new name of the application.
    */
  var name: js.UndefOr[AppName] = js.native
  
  /**
    * The name of the service role in the customer's account used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.native
  
  /**
    * The server groups in the application to update.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.native
  
  /**
    * The tags to associate with the application.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object UpdateAppRequest {
  
  @scala.inline
  def apply(): UpdateAppRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAppRequest]
  }
  
  @scala.inline
  implicit class UpdateAppRequestOps[Self <: UpdateAppRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setDescription(value: AppDescription): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: AppName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRoleName(value: RoleName): Self = this.set("roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    
    @scala.inline
    def setServerGroupsVarargs(value: ServerGroup*): Self = this.set("serverGroups", js.Array(value :_*))
    
    @scala.inline
    def setServerGroups(value: ServerGroups): Self = this.set("serverGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerGroups: Self = this.set("serverGroups", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
