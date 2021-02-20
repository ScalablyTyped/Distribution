package typings.chayns

import org.scalablytyped.runtime.StObject
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
trait UserGroup extends StObject {
  
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
  implicit class UserGroupMutableBuilder[Self <: UserGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    @scala.inline
    def setIsSystemGroup(value: Boolean): Self = StObject.set(x, "isSystemGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSystemGroupUndefined: Self = StObject.set(x, "isSystemGroup", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowName(value: String): Self = StObject.set(x, "showName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNameUndefined: Self = StObject.set(x, "showName", js.undefined)
  }
}
