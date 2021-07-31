package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceLinkedRoleResponse extends StObject {
  
  /**
    * A Role object that contains details about the newly created role.
    */
  var Role: js.UndefOr[typings.awsSdk.iamMod.Role] = js.undefined
}
object CreateServiceLinkedRoleResponse {
  
  @scala.inline
  def apply(): CreateServiceLinkedRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceLinkedRoleResponse]
  }
  
  @scala.inline
  implicit class CreateServiceLinkedRoleResponseMutableBuilder[Self <: CreateServiceLinkedRoleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
