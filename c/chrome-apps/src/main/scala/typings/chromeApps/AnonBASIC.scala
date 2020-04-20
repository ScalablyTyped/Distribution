package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.basic_
import typings.chromeApps.chromeAppsStrings.image_
import typings.chromeApps.chromeAppsStrings.list_
import typings.chromeApps.chromeAppsStrings.progress_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBASIC extends js.Object {
  var BASIC: basic_
  var IMAGE: image_
  var LIST: list_
  var PROGRESS: progress_
}

object AnonBASIC {
  @scala.inline
  def apply(BASIC: basic_, IMAGE: image_, LIST: list_, PROGRESS: progress_): AnonBASIC = {
    val __obj = js.Dynamic.literal(BASIC = BASIC.asInstanceOf[js.Any], IMAGE = IMAGE.asInstanceOf[js.Any], LIST = LIST.asInstanceOf[js.Any], PROGRESS = PROGRESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBASIC]
  }
}

