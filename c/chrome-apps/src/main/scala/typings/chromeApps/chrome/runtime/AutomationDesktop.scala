package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutomationDesktop extends _AutomationOptions {
  var desktop: `true` = js.native
  var interact: js.UndefOr[`true`] = js.native
}

object AutomationDesktop {
  @scala.inline
  def apply(desktop: `true`): AutomationDesktop = {
    val __obj = js.Dynamic.literal(desktop = desktop.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutomationDesktop]
  }
  @scala.inline
  implicit class AutomationDesktopOps[Self <: AutomationDesktop] (val x: Self) extends AnyVal {
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
    def setDesktop(value: `true`): Self = this.set("desktop", value.asInstanceOf[js.Any])
    @scala.inline
    def setInteract(value: `true`): Self = this.set("interact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteract: Self = this.set("interact", js.undefined)
  }
  
}

