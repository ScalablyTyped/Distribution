package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceSharePermissionsResponse extends StObject {
  
  /**
    * If present, this value indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null. This indicates that this is the last page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * An array of objects that describe the permissions associated with the resource share.
    */
  var permissions: js.UndefOr[ResourceSharePermissionList] = js.undefined
}
object ListResourceSharePermissionsResponse {
  
  inline def apply(): ListResourceSharePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceSharePermissionsResponse]
  }
  
  extension [Self <: ListResourceSharePermissionsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPermissions(value: ResourceSharePermissionList): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: ResourceSharePermissionSummary*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
