package typings.comDarktalkerCordovaScreenshot

import typings.comDarktalkerCordovaScreenshot.com_.darktalker.cordova.screenshot.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Navigator extends js.Object {
  var screenshot: Plugin = js.native
}

object Navigator {
  @scala.inline
  def apply(screenshot: Plugin): Navigator = {
    val __obj = js.Dynamic.literal(screenshot = screenshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
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
    def setScreenshot(value: Plugin): Self = this.set("screenshot", value.asInstanceOf[js.Any])
  }
  
}

