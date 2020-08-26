package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRelationalDatabaseMasterUserPasswordResult extends js.Object {
  /**
    * The timestamp when the specified version of the master user password was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The master user password for the password version specified.
    */
  var masterUserPassword: js.UndefOr[SensitiveString] = js.native
}

object GetRelationalDatabaseMasterUserPasswordResult {
  @scala.inline
  def apply(): GetRelationalDatabaseMasterUserPasswordResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseMasterUserPasswordResult]
  }
  @scala.inline
  implicit class GetRelationalDatabaseMasterUserPasswordResultOps[Self <: GetRelationalDatabaseMasterUserPasswordResult] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setMasterUserPassword(value: SensitiveString): Self = this.set("masterUserPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("masterUserPassword", js.undefined)
  }
  
}

