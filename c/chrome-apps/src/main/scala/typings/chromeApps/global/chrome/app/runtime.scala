package typings.chromeApps.global.chrome.app

import typings.chromeApps.AppView.EmbedRequest
import typings.chromeApps.chrome.app.runtime.LaunchData
import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chromeAppsStrings.about_page_
import typings.chromeApps.chromeAppsStrings.app_launcher_
import typings.chromeApps.chromeAppsStrings.available
import typings.chromeApps.chromeAppsStrings.background_
import typings.chromeApps.chromeAppsStrings.chrome_internal_
import typings.chromeApps.chromeAppsStrings.command_line_
import typings.chromeApps.chromeAppsStrings.context_menu_
import typings.chromeApps.chromeAppsStrings.enabled_
import typings.chromeApps.chromeAppsStrings.ephemeral_app_
import typings.chromeApps.chromeAppsStrings.extensions_page_
import typings.chromeApps.chromeAppsStrings.file_handler_
import typings.chromeApps.chromeAppsStrings.installed_notification_
import typings.chromeApps.chromeAppsStrings.keyboard_
import typings.chromeApps.chromeAppsStrings.kiosk_
import typings.chromeApps.chromeAppsStrings.load_and_launch_
import typings.chromeApps.chromeAppsStrings.management_api_
import typings.chromeApps.chromeAppsStrings.new_note_
import typings.chromeApps.chromeAppsStrings.new_tab_page_
import typings.chromeApps.chromeAppsStrings.reload_
import typings.chromeApps.chromeAppsStrings.restart_
import typings.chromeApps.chromeAppsStrings.system_tray_
import typings.chromeApps.chromeAppsStrings.test_
import typings.chromeApps.chromeAppsStrings.unknown__
import typings.chromeApps.chromeAppsStrings.untracked_
import typings.chromeApps.chromeAppsStrings.url_handler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.app.*
/////////////////
// App Runtime //
/////////////////
/**
  * @since Chrome 24.
  * @description
  * Use the chrome.app.runtime API to manage the app lifecycle.
  * The app runtime manages app installation, controls the event page,
  * and can shut down the app at anytime.
  */
@JSGlobal("chrome.app.runtime")
@js.native
object runtime extends js.Object {
  /**
    * Fired when an embedding app requests to embed this app.
    * @since Chrome 43.
    * @see[Documentation]{@link https://developer.chrome.com/apps/tags/appview}
    */
  val onEmbedRequested: Event[js.Function1[/* request */ EmbedRequest, Unit]] = js.native
  /**
    * Fired when an app is launched from the launcher.
    */
  val onLaunched: Event[js.Function1[/* launchData */ LaunchData, Unit]] = js.native
  /**
    * Fired at Chrome startup to apps that were running when Chrome last shut down,
    * or when apps have been requested to restart from their previous state for other reasons
    * (e.g. when the user revokes access to an app's retained files the runtime will restart the app).
    * In these situations if apps do not have an onRestarted handler they will be sent an onLaunched event instead.
    */
  val onRestarted: Event[js.Function0[Unit]] = js.native
  /** @enum */
  @js.native
  object ActionType extends js.Object {
    var NEW_NOTE: new_note_ = js.native
  }
  
  /** @enum */
  @js.native
  object LaunchSource extends js.Object {
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
  
  /** @enum */
  @js.native
  object PlayStoreStatus extends js.Object {
    var AVAILABLE: available = js.native
    var ENABLED: enabled_ = js.native
    var UNKNOWN: unknown__ = js.native
  }
  
}

