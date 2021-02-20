package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEffectivePermissionsForPathResponse extends StObject {
  
  /**
    * A continuation token, if this is not the first call to retrieve this list.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * A list of the permissions for the specified table or database resource located at the path in Amazon S3.
    */
  var Permissions: js.UndefOr[PrincipalResourcePermissionsList] = js.native
}
object GetEffectivePermissionsForPathResponse {
  
  @scala.inline
  def apply(): GetEffectivePermissionsForPathResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEffectivePermissionsForPathResponse]
  }
  
  @scala.inline
  implicit class GetEffectivePermissionsForPathResponseMutableBuilder[Self <: GetEffectivePermissionsForPathResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPermissions(value: PrincipalResourcePermissionsList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: PrincipalResourcePermissions*): Self = StObject.set(x, "Permissions", js.Array(value :_*))
  }
}
