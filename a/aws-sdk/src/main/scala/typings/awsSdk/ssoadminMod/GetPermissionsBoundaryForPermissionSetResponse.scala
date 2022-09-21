package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPermissionsBoundaryForPermissionSetResponse extends StObject {
  
  /**
    * The permissions boundary attached to the specified permission set.
    */
  var PermissionsBoundary: js.UndefOr[typings.awsSdk.ssoadminMod.PermissionsBoundary] = js.undefined
}
object GetPermissionsBoundaryForPermissionSetResponse {
  
  inline def apply(): GetPermissionsBoundaryForPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPermissionsBoundaryForPermissionSetResponse]
  }
  
  extension [Self <: GetPermissionsBoundaryForPermissionSetResponse](x: Self) {
    
    inline def setPermissionsBoundary(value: PermissionsBoundary): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryUndefined: Self = StObject.set(x, "PermissionsBoundary", js.undefined)
  }
}
