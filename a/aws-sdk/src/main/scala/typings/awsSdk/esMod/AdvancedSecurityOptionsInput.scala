package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedSecurityOptionsInput extends js.Object {
  /**
    * True if advanced security is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * True if the internal user database is enabled.
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Credentials for the master user: username and password, ARN, or both.
    */
  var MasterUserOptions: js.UndefOr[typings.awsSdk.esMod.MasterUserOptions] = js.native
}

object AdvancedSecurityOptionsInput {
  @scala.inline
  def apply(): AdvancedSecurityOptionsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOptionsInput]
  }
  @scala.inline
  implicit class AdvancedSecurityOptionsInputOps[Self <: AdvancedSecurityOptionsInput] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setInternalUserDatabaseEnabled(value: Boolean): Self = this.set("InternalUserDatabaseEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalUserDatabaseEnabled: Self = this.set("InternalUserDatabaseEnabled", js.undefined)
    @scala.inline
    def setMasterUserOptions(value: MasterUserOptions): Self = this.set("MasterUserOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUserOptions: Self = this.set("MasterUserOptions", js.undefined)
  }
  
}

