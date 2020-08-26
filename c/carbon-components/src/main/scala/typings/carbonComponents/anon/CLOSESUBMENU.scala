package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CLOSESUBMENU extends js.Object {
  var CLOSE_SUBMENU: String = js.native
  var DELEGATE_TO_FLYOUT_MENU: String = js.native
  var OPEN_SUBMENU: String = js.native
  var TOGGLE_SUBMENU_WITH_FOCUS: String = js.native
}

object CLOSESUBMENU {
  @scala.inline
  def apply(
    CLOSE_SUBMENU: String,
    DELEGATE_TO_FLYOUT_MENU: String,
    OPEN_SUBMENU: String,
    TOGGLE_SUBMENU_WITH_FOCUS: String
  ): CLOSESUBMENU = {
    val __obj = js.Dynamic.literal(CLOSE_SUBMENU = CLOSE_SUBMENU.asInstanceOf[js.Any], DELEGATE_TO_FLYOUT_MENU = DELEGATE_TO_FLYOUT_MENU.asInstanceOf[js.Any], OPEN_SUBMENU = OPEN_SUBMENU.asInstanceOf[js.Any], TOGGLE_SUBMENU_WITH_FOCUS = TOGGLE_SUBMENU_WITH_FOCUS.asInstanceOf[js.Any])
    __obj.asInstanceOf[CLOSESUBMENU]
  }
  @scala.inline
  implicit class CLOSESUBMENUOps[Self <: CLOSESUBMENU] (val x: Self) extends AnyVal {
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
    def setCLOSE_SUBMENU(value: String): Self = this.set("CLOSE_SUBMENU", value.asInstanceOf[js.Any])
    @scala.inline
    def setDELEGATE_TO_FLYOUT_MENU(value: String): Self = this.set("DELEGATE_TO_FLYOUT_MENU", value.asInstanceOf[js.Any])
    @scala.inline
    def setOPEN_SUBMENU(value: String): Self = this.set("OPEN_SUBMENU", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOGGLE_SUBMENU_WITH_FOCUS(value: String): Self = this.set("TOGGLE_SUBMENU_WITH_FOCUS", value.asInstanceOf[js.Any])
  }
  
}

