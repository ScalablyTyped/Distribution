package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteServiceLinkedRoleRequest extends StObject {
  
  /**
    * The name of the service-linked role to be deleted.
    */
  var RoleName: roleNameType = js.native
}
object DeleteServiceLinkedRoleRequest {
  
  @scala.inline
  def apply(RoleName: roleNameType): DeleteServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceLinkedRoleRequest]
  }
  
  @scala.inline
  implicit class DeleteServiceLinkedRoleRequestMutableBuilder[Self <: DeleteServiceLinkedRoleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
  }
}
