package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharePrincipal extends StObject {
  
  /**
    * The ID of the recipient.
    */
  var Id: IdType
  
  /**
    * The role of the recipient.
    */
  var Role: RoleType
  
  /**
    * The type of the recipient.
    */
  var Type: PrincipalType
}
object SharePrincipal {
  
  inline def apply(Id: IdType, Role: RoleType, Type: PrincipalType): SharePrincipal = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePrincipal]
  }
  
  extension [Self <: SharePrincipal](x: Self) {
    
    inline def setId(value: IdType): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setRole(value: RoleType): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setType(value: PrincipalType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
