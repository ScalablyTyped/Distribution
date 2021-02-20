package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUserGroupMessage extends StObject {
  
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
  implicit class DeleteUserGroupMessageMutableBuilder[Self <: DeleteUserGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserGroupId(value: String): Self = StObject.set(x, "UserGroupId", value.asInstanceOf[js.Any])
  }
}
