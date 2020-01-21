package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.audio
import typings.chromeApps.chromeAppsStrings.screen
import typings.chromeApps.chromeAppsStrings.tab
import typings.chromeApps.chromeAppsStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDIO extends js.Object {
  var AUDIO: audio
  var SCREEN: screen
  var TAB: tab
  var WINDOW: window
}

object AnonAUDIO {
  @scala.inline
  def apply(AUDIO: audio, SCREEN: screen, TAB: tab, WINDOW: window): AnonAUDIO = {
    val __obj = js.Dynamic.literal(AUDIO = AUDIO.asInstanceOf[js.Any], SCREEN = SCREEN.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], WINDOW = WINDOW.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAUDIO]
  }
}

