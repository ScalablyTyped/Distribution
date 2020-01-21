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
  def apply(
    Permissions: PermissionList,
    Principal: DataLakePrincipal,
    Resource: Resource,
    CatalogId: CatalogIdString = null,
    PermissionsWithGrantOption: PermissionList = null
  ): RevokePermissionsRequest = {
    val __obj = js.Dynamic.literal(Permissions = Permissions.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId.asInstanceOf[js.Any])
    if (PermissionsWithGrantOption != null) __obj.updateDynamic("PermissionsWithGrantOption")(PermissionsWithGrantOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokePermissionsRequest]
  }
}

