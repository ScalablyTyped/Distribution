package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantPermissionsRequest extends js.Object {
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  /**
    * The permissions granted to the principal on the resource. AWS Lake Formation defines privileges to grant and revoke access to metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. AWS Lake Formation requires that each principal be authorized to perform a specific task on AWS Lake Formation resources. 
    */
  var Permissions: PermissionList = js.native
  /**
    * Indicates a list of the granted permissions that the principal may pass to other users. These permissions may only be a subset of the permissions granted in the Privileges.
    */
  var PermissionsWithGrantOption: js.UndefOr[PermissionList] = js.native
  /**
    * The principal to be granted the permissions on the resource. Supported principals are IAM users or IAM roles, and they are defined by their principal type and their ARN. Note that if you define a resource with a particular ARN, then later delete, and recreate a resource with that same ARN, the resource maintains the permissions already granted. 
    */
  var Principal: DataLakePrincipal = js.native
  /**
    * The resource to which permissions are to be granted. Resources in AWS Lake Formation are the Data Catalog, databases, and tables.
    */
  var Resource: typings.awsSdk.lakeformationMod.Resource = js.native
}

object GrantPermissionsRequest {
  @scala.inline
  def apply(Permissions: PermissionList, Principal: DataLakePrincipal, Resource: Resource): GrantPermissionsRequest = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrantPermissionsRequest]
  }
  @scala.inline
  implicit class GrantPermissionsRequestOps[Self <: GrantPermissionsRequest] (val x: Self) extends AnyVal {
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

