package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAccountSettingResponse extends js.Object {
  /**
    * The account setting for the specified principal ARN.
    */
  var setting: js.UndefOr[Setting] = js.native
}

object DeleteAccountSettingResponse {
  @scala.inline
  def apply(setting: Setting = null): DeleteAccountSettingResponse = {
    val __obj = js.Dynamic.literal()
    if (setting != null) __obj.updateDynamic("setting")(setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccountSettingResponse]
  }
}

