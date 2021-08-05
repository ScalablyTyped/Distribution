package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionRequest extends StObject {
  
  /**
    * The ARN of the permission.
    */
  var permissionArn: String
  
  /**
    * The identifier for the version of the permission.
    */
  var permissionVersion: js.UndefOr[Integer] = js.undefined
}
object GetPermissionRequest {
  
  inline def apply(permissionArn: String): GetPermissionRequest = {
    val __obj = js.Dynamic.literal(permissionArn = permissionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPermissionRequest]
  }
  
  extension [Self <: GetPermissionRequest](x: Self) {
    
    inline def setPermissionArn(value: String): Self = StObject.set(x, "permissionArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionVersion(value: Integer): Self = StObject.set(x, "permissionVersion", value.asInstanceOf[js.Any])
    
    inline def setPermissionVersionUndefined: Self = StObject.set(x, "permissionVersion", js.undefined)
  }
}
