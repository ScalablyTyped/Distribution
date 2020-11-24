package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enviroment Variables
  * User
  * interfaces
  */
// chayns.env.user.groups
@js.native
trait UserGroup extends js.Object {
  
  var id: Double = js.native
  
  var isActive: js.UndefOr[Boolean] = js.native
  
  var isSystemGroup: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var showName: js.UndefOr[String] = js.native
}
object UserGroup {
  
  @scala.inline
  def apply(id: Double, name: String): UserGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroup]
  }
  
  @scala.inline
  implicit class UserGroupOps[Self <: UserGroup] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setIsSystemGroup(value: Boolean): Self = this.set("isSystemGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSystemGroup: Self = this.set("isSystemGroup", js.undefined)
    
    @scala.inline
    def setShowName(value: String): Self = this.set("showName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowName: Self = this.set("showName", js.undefined)
  }
}
