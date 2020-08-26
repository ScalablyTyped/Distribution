package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SoftwareTokenMfaSettingsType extends js.Object {
  /**
    * Specifies whether software token MFA is enabled.
    */
  var Enabled: js.UndefOr[BooleanType] = js.native
  /**
    * Specifies whether software token MFA is the preferred MFA method.
    */
  var PreferredMfa: js.UndefOr[BooleanType] = js.native
}

object SoftwareTokenMfaSettingsType {
  @scala.inline
  def apply(): SoftwareTokenMfaSettingsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareTokenMfaSettingsType]
  }
  @scala.inline
  implicit class SoftwareTokenMfaSettingsTypeOps[Self <: SoftwareTokenMfaSettingsType] (val x: Self) extends AnyVal {
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
    def setEnabled(value: BooleanType): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setPreferredMfa(value: BooleanType): Self = this.set("PreferredMfa", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMfa: Self = this.set("PreferredMfa", js.undefined)
  }
  
}

