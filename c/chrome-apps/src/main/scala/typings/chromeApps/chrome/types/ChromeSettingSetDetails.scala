package typings.chromeApps.chrome.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeSettingSetDetails extends ChromeSettingClearDetails {
  /**
    * The value of the setting.
    * Note that every setting has a specific value type,
    * which is described together with the setting.
    * An app should not set a value of a different type.
    */
  var value: js.Any = js.native
}

object ChromeSettingSetDetails {
  @scala.inline
  def apply(value: js.Any): ChromeSettingSetDetails = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeSettingSetDetails]
  }
  @scala.inline
  implicit class ChromeSettingSetDetailsOps[Self <: ChromeSettingSetDetails] (val x: Self) extends AnyVal {
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
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

