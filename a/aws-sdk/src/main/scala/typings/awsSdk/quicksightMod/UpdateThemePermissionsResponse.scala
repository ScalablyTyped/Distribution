package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateThemePermissionsResponse extends js.Object {
  /**
    * The resulting list of resource permissions for the theme.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * The Amazon Resource Name (ARN) of the theme.
    */
  var ThemeArn: js.UndefOr[Arn] = js.native
  /**
    * The ID for the theme.
    */
  var ThemeId: js.UndefOr[RestrictiveResourceId] = js.native
}

object UpdateThemePermissionsResponse {
  @scala.inline
  def apply(): UpdateThemePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThemePermissionsResponse]
  }
  @scala.inline
  implicit class UpdateThemePermissionsResponseOps[Self <: UpdateThemePermissionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPermissionsVarargs(value: ResourcePermission*): Self = this.set("Permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: ResourcePermissionList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setStatus(value: StatusCode): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setThemeArn(value: Arn): Self = this.set("ThemeArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeArn: Self = this.set("ThemeArn", js.undefined)
    @scala.inline
    def setThemeId(value: RestrictiveResourceId): Self = this.set("ThemeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeId: Self = this.set("ThemeId", js.undefined)
  }
  
}

