package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseMasterUserPasswordRequest extends js.Object {
  /**
    * The password version to return. Specifying CURRENT or PREVIOUS returns the current or previous passwords respectively. Specifying PENDING returns the newest version of the password that will rotate to CURRENT. After the PENDING password rotates to CURRENT, the PENDING password is no longer available. Default: CURRENT 
    */
  var passwordVersion: js.UndefOr[RelationalDatabasePasswordVersion] = js.native
  /**
    * The name of your database for which to get the master user password.
    */
  var relationalDatabaseName: ResourceName = js.native
}

object GetRelationalDatabaseMasterUserPasswordRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): GetRelationalDatabaseMasterUserPasswordRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordRequest]
  }
  @scala.inline
  implicit class GetRelationalDatabaseMasterUserPasswordRequestOps[Self <: GetRelationalDatabaseMasterUserPasswordRequest] (val x: Self) extends AnyVal {
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
    def setRelationalDatabaseName(value: ResourceName): Self = this.set("relationalDatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordVersion(value: RelationalDatabasePasswordVersion): Self = this.set("passwordVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordVersion: Self = this.set("passwordVersion", js.undefined)
  }
  
}

