package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/role.RoleProps, 'sys'> */
trait OmitRolePropssys extends StObject {
  
  var name: String
  
  var permissions: ContentDelivery
  
  var policies: js.Array[Actions]
}
object OmitRolePropssys {
  
  inline def apply(name: String, permissions: ContentDelivery, policies: js.Array[Actions]): OmitRolePropssys = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitRolePropssys]
  }
  
  extension [Self <: OmitRolePropssys](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: ContentDelivery): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPolicies(value: js.Array[Actions]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    inline def setPoliciesVarargs(value: Actions*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
