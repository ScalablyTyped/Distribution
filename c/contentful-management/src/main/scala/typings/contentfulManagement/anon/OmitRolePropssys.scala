package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/role.RoleProps, 'sys'> */
@js.native
trait OmitRolePropssys extends StObject {
  
  var name: String = js.native
  
  var permissions: ContentDelivery = js.native
  
  var policies: js.Array[Actions] = js.native
}
object OmitRolePropssys {
  
  @scala.inline
  def apply(name: String, permissions: ContentDelivery, policies: js.Array[Actions]): OmitRolePropssys = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitRolePropssys]
  }
  
  @scala.inline
  implicit class OmitRolePropssysMutableBuilder[Self <: OmitRolePropssys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: ContentDelivery): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicies(value: js.Array[Actions]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesVarargs(value: Actions*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
