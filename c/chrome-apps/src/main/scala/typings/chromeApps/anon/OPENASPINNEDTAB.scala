package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB
import typings.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB
import typings.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW
import typings.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OPENASPINNEDTAB extends js.Object {
  var OPEN_AS_PINNED_TAB: typings.chromeApps.chromeAppsStrings.OPEN_AS_PINNED_TAB = js.native
  var OPEN_AS_REGULAR_TAB: typings.chromeApps.chromeAppsStrings.OPEN_AS_REGULAR_TAB = js.native
  var OPEN_AS_WINDOW: typings.chromeApps.chromeAppsStrings.OPEN_AS_WINDOW = js.native
  var OPEN_FULL_SCREEN: typings.chromeApps.chromeAppsStrings.OPEN_FULL_SCREEN = js.native
}

object OPENASPINNEDTAB {
  @scala.inline
  def apply(
    OPEN_AS_PINNED_TAB: OPEN_AS_PINNED_TAB,
    OPEN_AS_REGULAR_TAB: OPEN_AS_REGULAR_TAB,
    OPEN_AS_WINDOW: OPEN_AS_WINDOW,
    OPEN_FULL_SCREEN: OPEN_FULL_SCREEN
  ): OPENASPINNEDTAB = {
    val __obj = js.Dynamic.literal(OPEN_AS_PINNED_TAB = OPEN_AS_PINNED_TAB.asInstanceOf[js.Any], OPEN_AS_REGULAR_TAB = OPEN_AS_REGULAR_TAB.asInstanceOf[js.Any], OPEN_AS_WINDOW = OPEN_AS_WINDOW.asInstanceOf[js.Any], OPEN_FULL_SCREEN = OPEN_FULL_SCREEN.asInstanceOf[js.Any])
    __obj.asInstanceOf[OPENASPINNEDTAB]
  }
  @scala.inline
  implicit class OPENASPINNEDTABOps[Self <: OPENASPINNEDTAB] (val x: Self) extends AnyVal {
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
    def setOPEN_AS_PINNED_TAB(value: OPEN_AS_PINNED_TAB): Self = this.set("OPEN_AS_PINNED_TAB", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_AS_REGULAR_TAB(value: OPEN_AS_REGULAR_TAB): Self = this.set("OPEN_AS_REGULAR_TAB", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_AS_WINDOW(value: OPEN_AS_WINDOW): Self = this.set("OPEN_AS_WINDOW", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_FULL_SCREEN(value: OPEN_FULL_SCREEN): Self = this.set("OPEN_FULL_SCREEN", value.asInstanceOf[js.Any])
  }
  
}

