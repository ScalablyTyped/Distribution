package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPermissionsResponse extends StObject {
  
  /**
    * A continuation token, if this is not the first call to retrieve this list.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A list of principals and their permissions on the resource for the specified principal and resource types.
    */
  var PrincipalResourcePermissions: js.UndefOr[PrincipalResourcePermissionsList] = js.native
}
object ListPermissionsResponse {
  
  @scala.inline
  def apply(): ListPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionsResponse]
  }
  
  @scala.inline
  implicit class ListPermissionsResponseMutableBuilder[Self <: ListPermissionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPrincipalResourcePermissions(value: PrincipalResourcePermissionsList): Self = StObject.set(x, "PrincipalResourcePermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalResourcePermissionsUndefined: Self = StObject.set(x, "PrincipalResourcePermissions", js.undefined)
    
    @scala.inline
    def setPrincipalResourcePermissionsVarargs(value: PrincipalResourcePermissions*): Self = StObject.set(x, "PrincipalResourcePermissions", js.Array(value :_*))
  }
}
