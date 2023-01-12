package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImpersonationRolesResponse extends StObject {
  
  /**
    * The token to retrieve the next page of results. The value is null when there are no results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsWorkmailMod.NextToken] = js.undefined
  
  /**
    * The list of impersonation roles under the given WorkMail organization.
    */
  var Roles: js.UndefOr[ImpersonationRoleList] = js.undefined
}
object ListImpersonationRolesResponse {
  
  inline def apply(): ListImpersonationRolesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImpersonationRolesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImpersonationRolesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRoles(value: ImpersonationRoleList): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    inline def setRolesUndefined: Self = StObject.set(x, "Roles", js.undefined)
    
    inline def setRolesVarargs(value: ImpersonationRole*): Self = StObject.set(x, "Roles", js.Array(value*))
  }
}
