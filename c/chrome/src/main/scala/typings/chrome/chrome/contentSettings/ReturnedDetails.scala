package typings.chrome.chrome.contentSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnedDetails extends js.Object {
  /** The content setting. See the description of the individual ContentSetting objects for the possible values. */
  var setting: js.Any = js.native
}

object ReturnedDetails {
  @scala.inline
  def apply(setting: js.Any): ReturnedDetails = {
    val __obj = js.Dynamic.literal(setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnedDetails]
  }
  @scala.inline
  implicit class ReturnedDetailsOps[Self <: ReturnedDetails] (val x: Self) extends AnyVal {
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
    def setSetting(value: js.Any): Self = this.set("setting", value.asInstanceOf[js.Any])
  }
  
}

