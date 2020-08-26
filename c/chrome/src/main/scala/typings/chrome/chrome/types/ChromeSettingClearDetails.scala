package typings.chrome.chrome.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeSettingClearDetails extends js.Object {
  /**
    * Optional.
    * The scope of the ChromeSetting. One of
    * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
    * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
    * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
    * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
    */
  var scope: js.UndefOr[String] = js.native
}

object ChromeSettingClearDetails {
  @scala.inline
  def apply(): ChromeSettingClearDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeSettingClearDetails]
  }
  @scala.inline
  implicit class ChromeSettingClearDetailsOps[Self <: ChromeSettingClearDetails] (val x: Self) extends AnyVal {
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
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
  
}

