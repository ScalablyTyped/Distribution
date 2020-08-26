package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountSettingsResult extends js.Object {
  /**
    * The account settings.
    */
  var accountSettings: js.UndefOr[AccountSettings] = js.native
}

object GetAccountSettingsResult {
  @scala.inline
  def apply(): GetAccountSettingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountSettingsResult]
  }
  @scala.inline
  implicit class GetAccountSettingsResultOps[Self <: GetAccountSettingsResult] (val x: Self) extends AnyVal {
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
    def setAccountSettings(value: AccountSettings): Self = this.set("accountSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountSettings: Self = this.set("accountSettings", js.undefined)
  }
  
}

