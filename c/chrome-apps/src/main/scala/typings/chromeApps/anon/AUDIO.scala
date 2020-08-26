package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.audio_
import typings.chromeApps.chromeAppsStrings.screen_
import typings.chromeApps.chromeAppsStrings.tab_
import typings.chromeApps.chromeAppsStrings.window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AUDIO extends js.Object {
  var AUDIO: audio_ = js.native
  var SCREEN: screen_ = js.native
  var TAB: tab_ = js.native
  var WINDOW: window_ = js.native
}

object AUDIO {
  @scala.inline
  def apply(AUDIO: audio_, SCREEN: screen_, TAB: tab_, WINDOW: window_): AUDIO = {
    val __obj = js.Dynamic.literal(AUDIO = AUDIO.asInstanceOf[js.Any], SCREEN = SCREEN.asInstanceOf[js.Any], TAB = TAB.asInstanceOf[js.Any], WINDOW = WINDOW.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDIO]
  }
  @scala.inline
  implicit class AUDIOOps[Self <: AUDIO] (val x: Self) extends AnyVal {
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
    def setAUDIO(value: audio_): Self = this.set("AUDIO", value.asInstanceOf[js.Any])
    @scala.inline
    def setSCREEN(value: screen_): Self = this.set("SCREEN", value.asInstanceOf[js.Any])
    @scala.inline
    def setTAB(value: tab_): Self = this.set("TAB", value.asInstanceOf[js.Any])
    @scala.inline
    def setWINDOW(value: window_): Self = this.set("WINDOW", value.asInstanceOf[js.Any])
  }
  
}

