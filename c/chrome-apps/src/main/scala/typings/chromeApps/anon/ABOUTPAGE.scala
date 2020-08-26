package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.about_page_
import typings.chromeApps.chromeAppsStrings.app_launcher_
import typings.chromeApps.chromeAppsStrings.background_
import typings.chromeApps.chromeAppsStrings.chrome_internal_
import typings.chromeApps.chromeAppsStrings.command_line_
import typings.chromeApps.chromeAppsStrings.context_menu_
import typings.chromeApps.chromeAppsStrings.ephemeral_app_
import typings.chromeApps.chromeAppsStrings.extensions_page_
import typings.chromeApps.chromeAppsStrings.file_handler_
import typings.chromeApps.chromeAppsStrings.installed_notification_
import typings.chromeApps.chromeAppsStrings.keyboard_
import typings.chromeApps.chromeAppsStrings.kiosk_
import typings.chromeApps.chromeAppsStrings.load_and_launch_
import typings.chromeApps.chromeAppsStrings.management_api_
import typings.chromeApps.chromeAppsStrings.new_tab_page_
import typings.chromeApps.chromeAppsStrings.reload_
import typings.chromeApps.chromeAppsStrings.restart_
import typings.chromeApps.chromeAppsStrings.system_tray_
import typings.chromeApps.chromeAppsStrings.test_
import typings.chromeApps.chromeAppsStrings.untracked_
import typings.chromeApps.chromeAppsStrings.url_handler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ABOUTPAGE extends js.Object {
  var ABOUT_PAGE: about_page_ = js.native
  var APP_LAUNCHER: app_launcher_ = js.native
  var BACKGROUND: background_ = js.native
  var CHROME_INTERNAL: chrome_internal_ = js.native
  var COMMAND_LINE: command_line_ = js.native
  var CONTEXT_MENU: context_menu_ = js.native
  var EPHEMERAL_APP: ephemeral_app_ = js.native
  var EXTENSIONS_PAGE: extensions_page_ = js.native
  var FILE_HANDLER: file_handler_ = js.native
  var INSTALLED_NOTIFICATION: installed_notification_ = js.native
  var KEYBOARD: keyboard_ = js.native
  var KIOSK: kiosk_ = js.native
  var LOAD_AND_LAUNCH: load_and_launch_ = js.native
  var MANAGEMENT_API: management_api_ = js.native
  var NEW_TAB_PAGE: new_tab_page_ = js.native
  var RELOAD: reload_ = js.native
  var RESTART: restart_ = js.native
  var SYSTEM_TRAY: system_tray_ = js.native
  var TEST: test_ = js.native
  var UNTRACKED: untracked_ = js.native
  var URL_HANDLER: url_handler_ = js.native
}

object ABOUTPAGE {
  @scala.inline
  def apply(
    ABOUT_PAGE: about_page_,
    APP_LAUNCHER: app_launcher_,
    BACKGROUND: background_,
    CHROME_INTERNAL: chrome_internal_,
    COMMAND_LINE: command_line_,
    CONTEXT_MENU: context_menu_,
    EPHEMERAL_APP: ephemeral_app_,
    EXTENSIONS_PAGE: extensions_page_,
    FILE_HANDLER: file_handler_,
    INSTALLED_NOTIFICATION: installed_notification_,
    KEYBOARD: keyboard_,
    KIOSK: kiosk_,
    LOAD_AND_LAUNCH: load_and_launch_,
    MANAGEMENT_API: management_api_,
    NEW_TAB_PAGE: new_tab_page_,
    RELOAD: reload_,
    RESTART: restart_,
    SYSTEM_TRAY: system_tray_,
    TEST: test_,
    UNTRACKED: untracked_,
    URL_HANDLER: url_handler_
  ): ABOUTPAGE = {
    val __obj = js.Dynamic.literal(ABOUT_PAGE = ABOUT_PAGE.asInstanceOf[js.Any], APP_LAUNCHER = APP_LAUNCHER.asInstanceOf[js.Any], BACKGROUND = BACKGROUND.asInstanceOf[js.Any], CHROME_INTERNAL = CHROME_INTERNAL.asInstanceOf[js.Any], COMMAND_LINE = COMMAND_LINE.asInstanceOf[js.Any], CONTEXT_MENU = CONTEXT_MENU.asInstanceOf[js.Any], EPHEMERAL_APP = EPHEMERAL_APP.asInstanceOf[js.Any], EXTENSIONS_PAGE = EXTENSIONS_PAGE.asInstanceOf[js.Any], FILE_HANDLER = FILE_HANDLER.asInstanceOf[js.Any], INSTALLED_NOTIFICATION = INSTALLED_NOTIFICATION.asInstanceOf[js.Any], KEYBOARD = KEYBOARD.asInstanceOf[js.Any], KIOSK = KIOSK.asInstanceOf[js.Any], LOAD_AND_LAUNCH = LOAD_AND_LAUNCH.asInstanceOf[js.Any], MANAGEMENT_API = MANAGEMENT_API.asInstanceOf[js.Any], NEW_TAB_PAGE = NEW_TAB_PAGE.asInstanceOf[js.Any], RELOAD = RELOAD.asInstanceOf[js.Any], RESTART = RESTART.asInstanceOf[js.Any], SYSTEM_TRAY = SYSTEM_TRAY.asInstanceOf[js.Any], TEST = TEST.asInstanceOf[js.Any], UNTRACKED = UNTRACKED.asInstanceOf[js.Any], URL_HANDLER = URL_HANDLER.asInstanceOf[js.Any])
    __obj.asInstanceOf[ABOUTPAGE]
  }
  @scala.inline
  implicit class ABOUTPAGEOps[Self <: ABOUTPAGE] (val x: Self) extends AnyVal {
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
    def setABOUT_PAGE(value: about_page_): Self = this.set("ABOUT_PAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setAPP_LAUNCHER(value: app_launcher_): Self = this.set("APP_LAUNCHER", value.asInstanceOf[js.Any])
    @scala.inline
    def setBACKGROUND(value: background_): Self = this.set("BACKGROUND", value.asInstanceOf[js.Any])
    @scala.inline
    def setCHROME_INTERNAL(value: chrome_internal_): Self = this.set("CHROME_INTERNAL", value.asInstanceOf[js.Any])
    @scala.inline
    def setCOMMAND_LINE(value: command_line_): Self = this.set("COMMAND_LINE", value.asInstanceOf[js.Any])
    @scala.inline
    def setCONTEXT_MENU(value: context_menu_): Self = this.set("CONTEXT_MENU", value.asInstanceOf[js.Any])
    @scala.inline
    def setEPHEMERAL_APP(value: ephemeral_app_): Self = this.set("EPHEMERAL_APP", value.asInstanceOf[js.Any])
    @scala.inline
    def setEXTENSIONS_PAGE(value: extensions_page_): Self = this.set("EXTENSIONS_PAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setFILE_HANDLER(value: file_handler_): Self = this.set("FILE_HANDLER", value.asInstanceOf[js.Any])
    @scala.inline
    def setINSTALLED_NOTIFICATION(value: installed_notification_): Self = this.set("INSTALLED_NOTIFICATION", value.asInstanceOf[js.Any])
    @scala.inline
    def setKEYBOARD(value: keyboard_): Self = this.set("KEYBOARD", value.asInstanceOf[js.Any])
    @scala.inline
    def setKIOSK(value: kiosk_): Self = this.set("KIOSK", value.asInstanceOf[js.Any])
    @scala.inline
    def setLOAD_AND_LAUNCH(value: load_and_launch_): Self = this.set("LOAD_AND_LAUNCH", value.asInstanceOf[js.Any])
    @scala.inline
    def setMANAGEMENT_API(value: management_api_): Self = this.set("MANAGEMENT_API", value.asInstanceOf[js.Any])
    @scala.inline
    def setNEW_TAB_PAGE(value: new_tab_page_): Self = this.set("NEW_TAB_PAGE", value.asInstanceOf[js.Any])
    @scala.inline
    def setRELOAD(value: reload_): Self = this.set("RELOAD", value.asInstanceOf[js.Any])
    @scala.inline
    def setRESTART(value: restart_): Self = this.set("RESTART", value.asInstanceOf[js.Any])
    @scala.inline
    def setSYSTEM_TRAY(value: system_tray_): Self = this.set("SYSTEM_TRAY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTEST(value: test_): Self = this.set("TEST", value.asInstanceOf[js.Any])
    @scala.inline
    def setUNTRACKED(value: untracked_): Self = this.set("UNTRACKED", value.asInstanceOf[js.Any])
    @scala.inline
    def setURL_HANDLER(value: url_handler_): Self = this.set("URL_HANDLER", value.asInstanceOf[js.Any])
  }
  
}

