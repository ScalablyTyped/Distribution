package typings.comDarktalkerCordovaScreenshot

import typings.comDarktalkerCordovaScreenshot.com_.darktalker.cordova.screenshot.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var screenshot: Plugin
}

object Navigator {
  @scala.inline
  def apply(screenshot: Plugin): Navigator = {
    val __obj = js.Dynamic.literal(screenshot = screenshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
}

