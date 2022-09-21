package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionsResponse extends StObject {
  
  /**
    * A continuation token, if this is not the first call to retrieve this list.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of principals and their permissions on the resource for the specified principal and resource types.
    */
  var PrincipalResourcePermissions: js.UndefOr[PrincipalResourcePermissionsList] = js.undefined
}
object ListPermissionsResponse {
  
  inline def apply(): ListPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionsResponse]
  }
  
  extension [Self <: ListPermissionsResponse](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPrincipalResourcePermissions(value: PrincipalResourcePermissionsList): Self = StObject.set(x, "PrincipalResourcePermissions", value.asInstanceOf[js.Any])
    
    inline def setPrincipalResourcePermissionsUndefined: Self = StObject.set(x, "PrincipalResourcePermissions", js.undefined)
    
    inline def setPrincipalResourcePermissionsVarargs(value: PrincipalResourcePermissions*): Self = StObject.set(x, "PrincipalResourcePermissions", js.Array(value*))
  }
}
