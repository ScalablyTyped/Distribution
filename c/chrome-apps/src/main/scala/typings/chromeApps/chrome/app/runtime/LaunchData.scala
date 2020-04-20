package typings.chromeApps.chrome.app.runtime

import typings.chromeApps.AnonABOUTPAGE
import typings.chromeApps.AnonNEWNOTE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.ABOUT_PAGE
import typings.chromeApps.chromeAppsStrings.APP_LAUNCHER
import typings.chromeApps.chromeAppsStrings.BACKGROUND
import typings.chromeApps.chromeAppsStrings.CHROME_INTERNAL
import typings.chromeApps.chromeAppsStrings.COMMAND_LINE
import typings.chromeApps.chromeAppsStrings.CONTEXT_MENU
import typings.chromeApps.chromeAppsStrings.EPHEMERAL_APP
import typings.chromeApps.chromeAppsStrings.EXTENSIONS_PAGE
import typings.chromeApps.chromeAppsStrings.FILE_HANDLER
import typings.chromeApps.chromeAppsStrings.INSTALLED_NOTIFICATION
import typings.chromeApps.chromeAppsStrings.KEYBOARD
import typings.chromeApps.chromeAppsStrings.KIOSK
import typings.chromeApps.chromeAppsStrings.LOAD_AND_LAUNCH
import typings.chromeApps.chromeAppsStrings.MANAGEMENT_API
import typings.chromeApps.chromeAppsStrings.NEW_NOTE
import typings.chromeApps.chromeAppsStrings.NEW_TAB_PAGE
import typings.chromeApps.chromeAppsStrings.RELOAD
import typings.chromeApps.chromeAppsStrings.RESTART
import typings.chromeApps.chromeAppsStrings.SYSTEM_TRAY
import typings.chromeApps.chromeAppsStrings.TEST
import typings.chromeApps.chromeAppsStrings.UNTRACKED
import typings.chromeApps.chromeAppsStrings.URL_HANDLER
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
import typings.chromeApps.chromeAppsStrings.new_note_
import typings.chromeApps.chromeAppsStrings.new_tab_page_
import typings.chromeApps.chromeAppsStrings.reload_
import typings.chromeApps.chromeAppsStrings.restart_
import typings.chromeApps.chromeAppsStrings.system_tray_
import typings.chromeApps.chromeAppsStrings.test_
import typings.chromeApps.chromeAppsStrings.untracked_
import typings.chromeApps.chromeAppsStrings.url_handler_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchData extends js.Object {
  /**
    * Contains data that specifies the ActionType this app was launched with. This is null if the app was not launched with a specific action intent.
    *  ______________________________________________________________________________
    * | type of 'new_note' | actionType | new_note                                   |
    * |                    |            | The user wants to quickly take a new note. |
    * |____________________|____________|____________________________________________|
    * @since Chrome 54.
    */
  var actionData: js.UndefOr[ToStringLiteral[AnonNEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]] = js.undefined
  /**
    * The ID of the file or URL handler that the app is being invoked with.
    * Handler IDs are the top-level keys in the file_handlers and/or url_handlers dictionaries in the manifest.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Whether the app is being launched in a Chrome OS kiosk session.
    */
  var isKioskSession: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the app is being launched in a Chrome OS public session.
    * @since Chrome 47.
    */
  var isPublicSession: js.UndefOr[Boolean] = js.undefined
  /**
    * The file entries for the onLaunched event triggered by a matching file handler in the file_handlers manifest key.
    */
  var items: js.UndefOr[js.Array[LaunchDataItem]] = js.undefined
  /**
    * The referrer URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
    */
  var referrerUrl: js.UndefOr[String] = js.undefined
  /**
    * Where the app is launched from.
    * @see enum LaunchSource
    */
  var source: js.UndefOr[
    ToStringLiteral[
      AnonABOUTPAGE, 
      ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
      Exclude[
        ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
        command_line_ | background_ | url_handler_ | system_tray_ | context_menu_ | chrome_internal_ | installed_notification_ | kiosk_ | restart_ | reload_ | new_tab_page_ | test_ | extensions_page_ | file_handler_ | management_api_ | about_page_ | load_and_launch_ | untracked_ | app_launcher_ | keyboard_ | ephemeral_app_
      ]
    ]
  ] = js.undefined
  /**
    * The URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
    */
  var url: js.UndefOr[String] = js.undefined
}

object LaunchData {
  @scala.inline
  def apply(
    actionData: ToStringLiteral[AnonNEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]] = null,
    id: String = null,
    isKioskSession: js.UndefOr[Boolean] = js.undefined,
    isPublicSession: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[LaunchDataItem] = null,
    referrerUrl: String = null,
    source: ToStringLiteral[
      AnonABOUTPAGE, 
      ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
      Exclude[
        ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
        command_line_ | background_ | url_handler_ | system_tray_ | context_menu_ | chrome_internal_ | installed_notification_ | kiosk_ | restart_ | reload_ | new_tab_page_ | test_ | extensions_page_ | file_handler_ | management_api_ | about_page_ | load_and_launch_ | untracked_ | app_launcher_ | keyboard_ | ephemeral_app_
      ]
    ] = null,
    url: String = null
  ): LaunchData = {
    val __obj = js.Dynamic.literal()
    if (actionData != null) __obj.updateDynamic("actionData")(actionData.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isKioskSession)) __obj.updateDynamic("isKioskSession")(isKioskSession.asInstanceOf[js.Any])
    if (!js.isUndefined(isPublicSession)) __obj.updateDynamic("isPublicSession")(isPublicSession.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (referrerUrl != null) __obj.updateDynamic("referrerUrl")(referrerUrl.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchData]
  }
}

