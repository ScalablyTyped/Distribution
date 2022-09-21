package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionGroupsResponse extends StObject {
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of all the permission groups.
    */
  var permissionGroups: js.UndefOr[PermissionGroupList] = js.undefined
}
object ListPermissionGroupsResponse {
  
  inline def apply(): ListPermissionGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionGroupsResponse]
  }
  
  extension [Self <: ListPermissionGroupsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPermissionGroups(value: PermissionGroupList): Self = StObject.set(x, "permissionGroups", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupsUndefined: Self = StObject.set(x, "permissionGroups", js.undefined)
    
    inline def setPermissionGroupsVarargs(value: PermissionGroup*): Self = StObject.set(x, "permissionGroups", js.Array(value*))
  }
}
