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
  def apply(
    Id: Identifier,
    Permissions: PermissionList = null,
    PermissionsWithGrantOption: PermissionList = null,
    Principal: DataLakePrincipal = null,
    Resource: Resource = null
  ): BatchPermissionsRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (PermissionsWithGrantOption != null) __obj.updateDynamic("PermissionsWithGrantOption")(PermissionsWithGrantOption.asInstanceOf[js.Any])
    if (Principal != null) __obj.updateDynamic("Principal")(Principal.asInstanceOf[js.Any])
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPermissionsRequestEntry]
  }
}

