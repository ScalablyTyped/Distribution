package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionEntry extends StObject {
  
  /**
    * Specifies whether the user or group has the Admin or Editor role.
    */
  var role: Role
  
  /**
    * A structure with the ID of the user or group with this role.
    */
  var user: User
}
object PermissionEntry {
  
  inline def apply(role: Role, user: User): PermissionEntry = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionEntry]
  }
  
  extension [Self <: PermissionEntry](x: Self) {
    
    inline def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
