package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPrincipalType extends StObject {
  
  /**
    * UserIds or GroupIds.
    */
  var Id: IdType
  
  /**
    * The Role of a User or Group.
    */
  var Roles: js.UndefOr[SearchPrincipalRoleList] = js.undefined
}
object SearchPrincipalType {
  
  inline def apply(Id: IdType): SearchPrincipalType = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPrincipalType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchPrincipalType] (val x: Self) extends AnyVal {
    
    inline def setId(value: IdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: SearchPrincipalRoleList): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
    
    inline def setRolesVarargs(value: PrincipalRoleType*): Self = StObject.set(x, "Roles", js.Array(value*))
  }
}
