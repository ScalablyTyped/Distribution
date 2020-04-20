package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.audio_
import typings.chromeApps.chromeAppsStrings.screen_
import typings.chromeApps.chromeAppsStrings.tab_
import typings.chromeApps.chromeAppsStrings.window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDIO extends js.Object {
  var AUDIO: audio_
  var SCREEN: screen_
  var TAB: tab_
  var WINDOW: window_
}

object AnonAUDIO {
  @scala.inline
  def apply(AUDIO: audio_, SCREEN: screen_, TAB: tab_, WINDOW: window_): AnonAUDIO = {
    val __obj = js.Dynamic.literal(AUDIO = AUDIO.asInstanceOf[js.Any], SCREEN = SCREEN.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], WINDOW = WINDOW.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAUDIO]
  }
}

