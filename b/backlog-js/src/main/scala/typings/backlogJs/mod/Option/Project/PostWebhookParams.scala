package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostWebhookParams extends js.Object {
  
  var activityTypeIds: js.UndefOr[js.Array[Double]] = js.native
  
  var allEvent: js.UndefOr[Boolean] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var hookUrl: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
}
object PostWebhookParams {
  
  @scala.inline
  def apply(): PostWebhookParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostWebhookParams]
  }
  
  @scala.inline
  implicit class PostWebhookParamsOps[Self <: PostWebhookParams] (val x: Self) extends AnyVal {
    
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
    def setActivityTypeIdsVarargs(value: Double*): Self = this.set("activityTypeIds", js.Array(value :_*))
    
    @scala.inline
    def setActivityTypeIds(value: js.Array[Double]): Self = this.set("activityTypeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityTypeIds: Self = this.set("activityTypeIds", js.undefined)
    
    @scala.inline
    def setAllEvent(value: Boolean): Self = this.set("allEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllEvent: Self = this.set("allEvent", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHookUrl(value: String): Self = this.set("hookUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHookUrl: Self = this.set("hookUrl", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
