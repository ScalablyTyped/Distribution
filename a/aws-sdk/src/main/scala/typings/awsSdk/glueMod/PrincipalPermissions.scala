package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrincipalPermissions extends js.Object {
  /**
    * The permissions that are granted to the principal.
    */
  var Permissions: js.UndefOr[PermissionList] = js.native
  /**
    * The principal who is granted permissions.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.native
}

object PrincipalPermissions {
  @scala.inline
  def apply(): PrincipalPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalPermissions]
  }
  @scala.inline
  implicit class PrincipalPermissionsOps[Self <: PrincipalPermissions] (val x: Self) extends AnyVal {
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
    def setPermissionsVarargs(value: Permission*): Self = this.set("Permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: PermissionList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
    @scala.inline
    def setPrincipal(value: DataLakePrincipal): Self = this.set("Principal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipal: Self = this.set("Principal", js.undefined)
  }
  
}

