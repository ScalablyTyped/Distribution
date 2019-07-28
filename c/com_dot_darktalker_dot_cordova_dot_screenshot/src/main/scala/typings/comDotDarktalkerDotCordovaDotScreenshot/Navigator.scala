package typings.comDotDarktalkerDotCordovaDotScreenshot

import typings.comDotDarktalkerDotCordovaDotScreenshot.comNs.darktalkerNs.cordovaNs.screenshotNs.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  var screenshot: Plugin
}

object Navigator {
  @scala.inline
  def apply(screenshot: Plugin): Navigator = {
    val __obj = js.Dynamic.literal(screenshot = screenshot)
  
    __obj.asInstanceOf[Navigator]
  }
}

