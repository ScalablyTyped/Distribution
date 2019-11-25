package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.fullscreen
import typings.chromeDashApps.chromeDashAppsStrings.maximized
import typings.chromeDashApps.chromeDashAppsStrings.minimized
import typings.chromeDashApps.chromeDashAppsStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FULLSCREEN extends js.Object {
  var FULLSCREEN: fullscreen
  var MAXIMIZED: maximized
  var MINIMIZED: minimized
  var NORMAL: normal
}

object Anon_FULLSCREEN {
  @scala.inline
  def apply(FULLSCREEN: fullscreen, MAXIMIZED: maximized, MINIMIZED: minimized, NORMAL: normal): Anon_FULLSCREEN = {
    val __obj = js.Dynamic.literal(FULLSCREEN = FULLSCREEN.asInstanceOf[js.Any], MAXIMIZED = MAXIMIZED.asInstanceOf[js.Any], MINIMIZED = MINIMIZED.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FULLSCREEN]
  }
}

