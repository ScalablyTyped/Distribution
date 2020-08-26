package typings.chromeApps.chrome.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeSettingGetDetails extends js.Object {
  /** Whether to return the value that applies to the incognito session (default false). */
  var incognito: js.UndefOr[Boolean] = js.native
}

object ChromeSettingGetDetails {
  @scala.inline
  def apply(): ChromeSettingGetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeSettingGetDetails]
  }
  @scala.inline
  implicit class ChromeSettingGetDetailsOps[Self <: ChromeSettingGetDetails] (val x: Self) extends AnyVal {
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
    def setIncognito(value: Boolean): Self = this.set("incognito", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncognito: Self = this.set("incognito", js.undefined)
  }
  
}

