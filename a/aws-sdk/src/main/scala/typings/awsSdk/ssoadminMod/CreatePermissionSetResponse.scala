package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePermissionSetResponse extends StObject {
  
  /**
    * Defines the level of access on an AWS account.
    */
  var PermissionSet: js.UndefOr[typings.awsSdk.ssoadminMod.PermissionSet] = js.native
}
object CreatePermissionSetResponse {
  
  @scala.inline
  def apply(): CreatePermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePermissionSetResponse]
  }
  
  @scala.inline
  implicit class CreatePermissionSetResponseMutableBuilder[Self <: CreatePermissionSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionSet(value: PermissionSet): Self = StObject.set(x, "PermissionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetUndefined: Self = StObject.set(x, "PermissionSet", js.undefined)
  }
}
