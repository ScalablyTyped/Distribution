package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserGroupMessage extends js.Object {
  
  /**
    * The ID of the user group.
    */
  var UserGroupId: String = js.native
}
object DeleteUserGroupMessage {
  
  @scala.inline
  def apply(UserGroupId: String): DeleteUserGroupMessage = {
    val __obj = js.Dynamic.literal(UserGroupId = UserGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserGroupMessage]
  }
  
  @scala.inline
  implicit class DeleteUserGroupMessageOps[Self <: DeleteUserGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUserGroupId(value: String): Self = this.set("UserGroupId", value.asInstanceOf[js.Any])
  }
}
