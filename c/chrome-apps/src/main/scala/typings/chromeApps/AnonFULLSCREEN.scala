package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.fullscreen
import typings.chromeApps.chromeAppsStrings.maximized
import typings.chromeApps.chromeAppsStrings.minimized
import typings.chromeApps.chromeAppsStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFULLSCREEN extends js.Object {
  var FULLSCREEN: fullscreen
  var MAXIMIZED: maximized
  var MINIMIZED: minimized
  var NORMAL: normal
}

object AnonFULLSCREEN {
  @scala.inline
  def apply(FULLSCREEN: fullscreen, MAXIMIZED: maximized, MINIMIZED: minimized, NORMAL: normal): AnonFULLSCREEN = {
    val __obj = js.Dynamic.literal(FULLSCREEN = FULLSCREEN.asInstanceOf[js.Any], MAXIMIZED = MAXIMIZED.asInstanceOf[js.Any], MINIMIZED = MINIMIZED.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFULLSCREEN]
  }
}

