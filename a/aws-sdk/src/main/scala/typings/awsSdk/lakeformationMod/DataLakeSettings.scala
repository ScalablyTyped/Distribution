package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLakeSettings extends js.Object {
  /**
    * A structure representing a list of up to three principal permissions entries for default create database permissions.
    */
  var CreateDatabaseDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.native
  /**
    * A structure representing a list of up to three principal permissions entries for default create table permissions.
    */
  var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.native
  /**
    * A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
    */
  var DataLakeAdmins: js.UndefOr[DataLakePrincipalList] = js.native
  /**
    * A list of the resource-owning account IDs that the caller's account can use to share their user access details (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log. You may want to specify this property when you are in a high-trust boundary, such as the same team or company. 
    */
  var TrustedResourceOwners: js.UndefOr[typings.awsSdk.lakeformationMod.TrustedResourceOwners] = js.native
}

object DataLakeSettings {
  @scala.inline
  def apply(): DataLakeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLakeSettings]
  }
  @scala.inline
  implicit class DataLakeSettingsOps[Self <: DataLakeSettings] (val x: Self) extends AnyVal {
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
    def setCreateDatabaseDefaultPermissionsVarargs(value: PrincipalPermissions*): Self = this.set("CreateDatabaseDefaultPermissions", js.Array(value :_*))
    @scala.inline
    def setCreateDatabaseDefaultPermissions(value: PrincipalPermissionsList): Self = this.set("CreateDatabaseDefaultPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDatabaseDefaultPermissions: Self = this.set("CreateDatabaseDefaultPermissions", js.undefined)
    @scala.inline
    def setCreateTableDefaultPermissionsVarargs(value: PrincipalPermissions*): Self = this.set("CreateTableDefaultPermissions", js.Array(value :_*))
    @scala.inline
    def setCreateTableDefaultPermissions(value: PrincipalPermissionsList): Self = this.set("CreateTableDefaultPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTableDefaultPermissions: Self = this.set("CreateTableDefaultPermissions", js.undefined)
    @scala.inline
    def setDataLakeAdminsVarargs(value: DataLakePrincipal*): Self = this.set("DataLakeAdmins", js.Array(value :_*))
    @scala.inline
    def setDataLakeAdmins(value: DataLakePrincipalList): Self = this.set("DataLakeAdmins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLakeAdmins: Self = this.set("DataLakeAdmins", js.undefined)
    @scala.inline
    def setTrustedResourceOwnersVarargs(value: CatalogIdString*): Self = this.set("TrustedResourceOwners", js.Array(value :_*))
    @scala.inline
    def setTrustedResourceOwners(value: TrustedResourceOwners): Self = this.set("TrustedResourceOwners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrustedResourceOwners: Self = this.set("TrustedResourceOwners", js.undefined)
  }
  
}

