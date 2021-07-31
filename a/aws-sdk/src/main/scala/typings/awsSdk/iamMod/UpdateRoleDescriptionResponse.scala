package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoleDescriptionResponse extends StObject {
  
  /**
    * A structure that contains details about the modified role.
    */
  var Role: js.UndefOr[typings.awsSdk.iamMod.Role] = js.undefined
}
object UpdateRoleDescriptionResponse {
  
  @scala.inline
  def apply(): UpdateRoleDescriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRoleDescriptionResponse]
  }
  
  @scala.inline
  implicit class UpdateRoleDescriptionResponseMutableBuilder[Self <: UpdateRoleDescriptionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
