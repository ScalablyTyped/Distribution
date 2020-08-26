package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokePermissionsRequest extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The permissions revoked to the principal on the resource. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  var Permissions: PermissionList = js.native
  /**
    * Indicates a list of permissions for which to revoke the grant option allowing the principal to pass permissions to other principals.
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.native
  /**
    * The principal to be revoked permissions on the resource.
    */
  var Principal: DataLakePrincipal = js.native
  /**
    * The resource to which permissions are to be revoked.
    */
  var Resource: typings.awsSdk.lakeformationMod.Resource = js.native
}

object RevokePermissionsRequest {
  @scala.inline
  def apply(Permissions: PermissionList, Principal: DataLakePrincipal, Resource: Resource): RevokePermissionsRequest = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokePermissionsRequest]
  }
  @scala.inline
  implicit class RevokePermissionsRequestOps[Self <: RevokePermissionsRequest] (val x: Self) extends AnyVal {
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
    def setPrincipal(value: DataLakePrincipal): Self = this.set("Principal", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: Resource): Self = this.set("Resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    @scala.inline
    def setPermissionsWithGrantOptionVarargs(value: Permission*): Self = this.set("PermissionsWithGrantOption", js.Array(value :_*))
    @scala.inline
    def setPermissionsWithGrantOption(value: PermissionList): Self = this.set("PermissionsWithGrantOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionsWithGrantOption: Self = this.set("PermissionsWithGrantOption", js.undefined)
  }
  
}

