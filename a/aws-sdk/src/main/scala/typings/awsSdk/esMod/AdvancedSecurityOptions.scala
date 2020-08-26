package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvancedSecurityOptions extends js.Object {
  /**
    * True if advanced security is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * True if the internal user database is enabled.
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.native
}

object AdvancedSecurityOptions {
  @scala.inline
  def apply(): AdvancedSecurityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvancedSecurityOptions]
  }
  @scala.inline
  implicit class AdvancedSecurityOptionsOps[Self <: AdvancedSecurityOptions] (val x: Self) extends AnyVal {
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
  }
  
}

