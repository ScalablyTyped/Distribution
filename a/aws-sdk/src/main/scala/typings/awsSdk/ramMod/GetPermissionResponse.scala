package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPermissionResponse extends StObject {
  
  /**
    * Information about the permission.
    */
  var permission: js.UndefOr[ResourceSharePermissionDetail] = js.native
}
object GetPermissionResponse {
  
  @scala.inline
  def apply(): GetPermissionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPermissionResponse]
  }
  
  @scala.inline
  implicit class GetPermissionResponseMutableBuilder[Self <: GetPermissionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission(value: ResourceSharePermissionDetail): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
