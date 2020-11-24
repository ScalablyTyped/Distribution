package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEffectivePermissionsForPathResponse extends js.Object {
  
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
  implicit class GetEffectivePermissionsForPathResponseOps[Self <: GetEffectivePermissionsForPathResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: PrincipalResourcePermissions*): Self = this.set("Permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: PrincipalResourcePermissionsList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
  }
}
