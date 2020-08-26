package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPermissionsResponse extends js.Object {
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
  implicit class ListPermissionsResponseOps[Self <: ListPermissionsResponse] (val x: Self) extends AnyVal {
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
    def setPrincipalResourcePermissionsVarargs(value: PrincipalResourcePermissions*): Self = this.set("PrincipalResourcePermissions", js.Array(value :_*))
    @scala.inline
    def setPrincipalResourcePermissions(value: PrincipalResourcePermissionsList): Self = this.set("PrincipalResourcePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipalResourcePermissions: Self = this.set("PrincipalResourcePermissions", js.undefined)
  }
  
}

