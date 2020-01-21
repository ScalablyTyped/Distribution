package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.basic
import typings.chromeApps.chromeAppsStrings.image
import typings.chromeApps.chromeAppsStrings.list
import typings.chromeApps.chromeAppsStrings.progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBASIC extends js.Object {
  var BASIC: basic
  var IMAGE: image
  var LIST: list
  var PROGRESS: progress
}

object AnonBASIC {
  @scala.inline
  def apply(BASIC: basic, IMAGE: image, LIST: list, PROGRESS: progress): AnonBASIC = {
    val __obj = js.Dynamic.literal(BASIC = BASIC.asInstanceOf[js.Any], IMAGE = IMAGE.asInstanceOf[js.Any], LIST = LIST.asInstanceOf[js.Any], PROGRESS = PROGRESS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBASIC]
  }
}

