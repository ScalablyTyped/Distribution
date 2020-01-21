package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLakeSettings extends js.Object {
  /**
    * A list of up to three principal permissions entries for default create database permissions.
    */
  var CreateDatabaseDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.native
  /**
    * A list of up to three principal permissions entries for default create table permissions.
    */
  var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.native
  /**
    * A list of AWS Lake Formation principals.
    */
  var DataLakeAdmins: js.UndefOr[DataLakePrincipalList] = js.native
}

object DataLakeSettings {
  @scala.inline
  def apply(
    CreateDatabaseDefaultPermissions: PrincipalPermissionsList = null,
    CreateTableDefaultPermissions: PrincipalPermissionsList = null,
    DataLakeAdmins: DataLakePrincipalList = null
  ): DataLakeSettings = {
    val __obj = js.Dynamic.literal()
    if (CreateDatabaseDefaultPermissions != null) __obj.updateDynamic("CreateDatabaseDefaultPermissions")(CreateDatabaseDefaultPermissions.asInstanceOf[js.Any])
    if (CreateTableDefaultPermissions != null) __obj.updateDynamic("CreateTableDefaultPermissions")(CreateTableDefaultPermissions.asInstanceOf[js.Any])
    if (DataLakeAdmins != null) __obj.updateDynamic("DataLakeAdmins")(DataLakeAdmins.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLakeSettings]
  }
}

