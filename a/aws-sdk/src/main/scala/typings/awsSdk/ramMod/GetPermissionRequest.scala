package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPermissionRequest extends StObject {
  
  /**
    * The ARN of the permission.
    */
  var permissionArn: String = js.native
  
  /**
    * The identifier for the version of the permission.
    */
  var permissionVersion: js.UndefOr[Integer] = js.native
}
object GetPermissionRequest {
  
  @scala.inline
  def apply(permissionArn: String): GetPermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionRequest]
  }
  
  @scala.inline
  implicit class GetPermissionRequestMutableBuilder[Self <: GetPermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionArn(value: String): Self = StObject.set(x, "permissionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionVersion(value: Integer): Self = StObject.set(x, "permissionVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionVersionUndefined: Self = StObject.set(x, "permissionVersion", js.undefined)
  }
}
