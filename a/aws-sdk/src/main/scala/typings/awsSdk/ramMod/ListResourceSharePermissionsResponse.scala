package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourceSharePermissionsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The permissions associated with the resource share.
    */
  var permissions: js.UndefOr[ResourceSharePermissionList] = js.native
}

object ListResourceSharePermissionsResponse {
  @scala.inline
  def apply(): ListResourceSharePermissionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceSharePermissionsResponse]
  }
  @scala.inline
  implicit class ListResourceSharePermissionsResponseOps[Self <: ListResourceSharePermissionsResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: String): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setPermissionsVarargs(value: ResourceSharePermissionSummary*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: ResourceSharePermissionList): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
  }
  
}

