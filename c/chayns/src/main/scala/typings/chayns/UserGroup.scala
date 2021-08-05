package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enviroment Variables
  * User
  * interfaces
  */
// chayns.env.user.groups
trait UserGroup extends StObject {
  
  var id: Double
  
  var isActive: js.UndefOr[Boolean] = js.undefined
  
  var isSystemGroup: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var showName: js.UndefOr[String] = js.undefined
}
object UserGroup {
  
  inline def apply(id: Double, name: String): UserGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserGroup]
  }
  
  extension [Self <: UserGroup](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
    
    inline def setIsSystemGroup(value: Boolean): Self = StObject.set(x, "isSystemGroup", value.asInstanceOf[js.Any])
    
    inline def setIsSystemGroupUndefined: Self = StObject.set(x, "isSystemGroup", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setShowName(value: String): Self = StObject.set(x, "showName", value.asInstanceOf[js.Any])
    
    inline def setShowNameUndefined: Self = StObject.set(x, "showName", js.undefined)
  }
}
