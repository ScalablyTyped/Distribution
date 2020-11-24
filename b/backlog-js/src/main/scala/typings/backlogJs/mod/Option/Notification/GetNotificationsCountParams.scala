package typings.backlogJs.mod.Option.Notification

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetNotificationsCountParams extends js.Object {
  
  var alreadyRead: Boolean = js.native
  
  var resourceAlreadyRead: Boolean = js.native
}
object GetNotificationsCountParams {
  
  @scala.inline
  def apply(alreadyRead: Boolean, resourceAlreadyRead: Boolean): GetNotificationsCountParams = {
    val __obj = js.Dynamic.literal(alreadyRead = alreadyRead.asInstanceOf[js.Any], resourceAlreadyRead = resourceAlreadyRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNotificationsCountParams]
  }
  
  @scala.inline
  implicit class GetNotificationsCountParamsOps[Self <: GetNotificationsCountParams] (val x: Self) extends AnyVal {
    
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
    def setAlreadyRead(value: Boolean): Self = this.set("alreadyRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceAlreadyRead(value: Boolean): Self = this.set("resourceAlreadyRead", value.asInstanceOf[js.Any])
  }
}
