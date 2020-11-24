package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAppResponse extends js.Object {
  
  /**
    * A summary description of the application.
    */
  var appSummary: js.UndefOr[AppSummary] = js.native
  
  /**
    * The server groups included in the application.
    */
  var serverGroups: js.UndefOr[ServerGroups] = js.native
  
  /**
    * The tags associated with the application.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object CreateAppResponse {
  
  @scala.inline
  def apply(): CreateAppResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAppResponse]
  }
  
  @scala.inline
  implicit class CreateAppResponseOps[Self <: CreateAppResponse] (val x: Self) extends AnyVal {
    
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
    def setAppSummary(value: AppSummary): Self = this.set("appSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppSummary: Self = this.set("appSummary", js.undefined)
    
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
