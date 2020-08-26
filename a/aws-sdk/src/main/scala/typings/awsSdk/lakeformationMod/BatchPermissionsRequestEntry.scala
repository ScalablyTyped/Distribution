package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchPermissionsRequestEntry extends js.Object {
  /**
    * A unique identifier for the batch permissions request entry.
    */
  var Id: Identifier = js.native
  /**
    * The permissions to be granted.
    */
  var Permissions: js.UndefOr[PermissionList] = js.native
  /**
    * Indicates if the option to pass permissions is granted.
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.native
  /**
    * The principal to be granted a permission.
    */
  var Principal: js.UndefOr[DataLakePrincipal] = js.native
  /**
    * The resource to which the principal is to be granted a permission.
    */
  var Resource: js.UndefOr[typings.awsSdk.lakeformationMod.Resource] = js.native
}

object BatchPermissionsRequestEntry {
  @scala.inline
  def apply(Id: Identifier): BatchPermissionsRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPermissionsRequestEntry]
  }
  @scala.inline
  implicit class BatchPermissionsRequestEntryOps[Self <: BatchPermissionsRequestEntry] (val x: Self) extends AnyVal {
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
    def setId(value: Identifier): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = this.set("Permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: PermissionList): Self = this.set("Permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissions: Self = this.set("Permissions", js.undefined)
    @scala.inline
    def setPermissionsWithGrantOptionVarargs(value: Permission*): Self = this.set("PermissionsWithGrantOption", js.Array(value :_*))
    @scala.inline
    def setPermissionsWithGrantOption(value: PermissionList): Self = this.set("PermissionsWithGrantOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionsWithGrantOption: Self = this.set("PermissionsWithGrantOption", js.undefined)
    @scala.inline
    def setPrincipal(value: DataLakePrincipal): Self = this.set("Principal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipal: Self = this.set("Principal", js.undefined)
    @scala.inline
    def setResource(value: Resource): Self = this.set("Resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("Resource", js.undefined)
  }
  
}

