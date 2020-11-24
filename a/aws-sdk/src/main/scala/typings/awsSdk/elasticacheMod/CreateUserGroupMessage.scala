package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserGroupMessage extends js.Object {
  
  /**
    * Must be Redis. 
    */
  var Engine: EngineType = js.native
  
  /**
    * The ID of the user group.
    */
  var UserGroupId: String = js.native
  
  /**
    * The list of user IDs that belong to the user group.
    */
  var UserIds: js.UndefOr[UserIdListInput] = js.native
}
object CreateUserGroupMessage {
  
  @scala.inline
  def apply(Engine: EngineType, UserGroupId: String): CreateUserGroupMessage = {
    val __obj = js.Dynamic.literal(Engine = Engine.asInstanceOf[js.Any], UserGroupId = UserGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserGroupMessage]
  }
  
  @scala.inline
  implicit class CreateUserGroupMessageOps[Self <: CreateUserGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setEngine(value: EngineType): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupId(value: String): Self = this.set("UserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsVarargs(value: UserId*): Self = this.set("UserIds", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: UserIdListInput): Self = this.set("UserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIds: Self = this.set("UserIds", js.undefined)
  }
}
