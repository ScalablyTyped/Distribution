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
  def apply(accountSettings: AccountSettings = null): GetAccountSettingsResult = {
    val __obj = js.Dynamic.literal()
    if (accountSettings != null) __obj.updateDynamic("accountSettings")(accountSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountSettingsResult]
  }
}

