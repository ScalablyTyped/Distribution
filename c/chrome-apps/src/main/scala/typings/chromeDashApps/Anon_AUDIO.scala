package typings.chromeDashApps

import typings.chromeDashApps.chromeDashAppsStrings.audio
import typings.chromeDashApps.chromeDashAppsStrings.screen
import typings.chromeDashApps.chromeDashAppsStrings.tab
import typings.chromeDashApps.chromeDashAppsStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AUDIO extends js.Object {
  var AUDIO: audio
  var SCREEN: screen
  var TAB: tab
  var WINDOW: window
}

object Anon_AUDIO {
  @scala.inline
  def apply(AUDIO: audio, SCREEN: screen, TAB: tab, WINDOW: window): Anon_AUDIO = {
    val __obj = js.Dynamic.literal(AUDIO = AUDIO.asInstanceOf[js.Any], SCREEN = SCREEN.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], WINDOW = WINDOW.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AUDIO]
  }
}

