package typings.chromeApps.chrome.app.runtime

import typings.chromeApps.anon.ABOUTPAGE
import typings.chromeApps.anon.NEWNOTE
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

@js.native
trait LaunchData extends js.Object {
  /**
    * Contains data that specifies the ActionType this app was launched with. This is null if the app was not launched with a specific action intent.
    *  ______________________________________________________________________________
    * | type of 'new_note' | actionType | new_note                                   |
    * |                    |            | The user wants to quickly take a new note. |
    * |____________________|____________|____________________________________________|
    * @since Chrome 54.
    */
  var actionData: js.UndefOr[ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]] = js.native
  /**
    * The ID of the file or URL handler that the app is being invoked with.
    * Handler IDs are the top-level keys in the file_handlers and/or url_handlers dictionaries in the manifest.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Whether the app is being launched in a Chrome OS kiosk session.
    */
  var isKioskSession: js.UndefOr[Boolean] = js.native
  /**
    * Whether the app is being launched in a Chrome OS public session.
    * @since Chrome 47.
    */
  var isPublicSession: js.UndefOr[Boolean] = js.native
  /**
    * The file entries for the onLaunched event triggered by a matching file handler in the file_handlers manifest key.
    */
  var items: js.UndefOr[js.Array[LaunchDataItem]] = js.native
  /**
    * The referrer URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
    */
  var referrerUrl: js.UndefOr[String] = js.native
  /**
    * Where the app is launched from.
    * @see enum LaunchSource
    */
  var source: js.UndefOr[
    ToStringLiteral[
      ABOUTPAGE, 
      /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
      Exclude[
        /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
        command_line_ | background_ | url_handler_ | system_tray_ | context_menu_ | chrome_internal_ | installed_notification_ | kiosk_ | restart_ | reload_ | new_tab_page_ | test_ | extensions_page_ | file_handler_ | management_api_ | about_page_ | load_and_launch_ | untracked_ | app_launcher_ | keyboard_ | ephemeral_app_
      ]
    ]
  ] = js.native
  /**
    * The URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
    */
  var url: js.UndefOr[String] = js.native
}

object LaunchData {
  @scala.inline
  def apply(): LaunchData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchData]
  }
  @scala.inline
  implicit class LaunchDataOps[Self <: LaunchData] (val x: Self) extends AnyVal {
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
    def setActionData(value: ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]): Self = this.set("actionData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionData: Self = this.set("actionData", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsKioskSession(value: Boolean): Self = this.set("isKioskSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsKioskSession: Self = this.set("isKioskSession", js.undefined)
    @scala.inline
    def setIsPublicSession(value: Boolean): Self = this.set("isPublicSession", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPublicSession: Self = this.set("isPublicSession", js.undefined)
    @scala.inline
    def setItemsVarargs(value: LaunchDataItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[LaunchDataItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setReferrerUrl(value: String): Self = this.set("referrerUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerUrl: Self = this.set("referrerUrl", js.undefined)
    @scala.inline
    def setSource(
      value: ToStringLiteral[
          ABOUTPAGE, 
          /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
          Exclude[
            /* keyof chrome-apps.anon.ABOUTPAGE */ ABOUT_PAGE | APP_LAUNCHER | BACKGROUND | CHROME_INTERNAL | COMMAND_LINE | CONTEXT_MENU | EPHEMERAL_APP | EXTENSIONS_PAGE | FILE_HANDLER | INSTALLED_NOTIFICATION | KEYBOARD | KIOSK | LOAD_AND_LAUNCH | MANAGEMENT_API | NEW_TAB_PAGE | RELOAD | RESTART | SYSTEM_TRAY | TEST | UNTRACKED | URL_HANDLER, 
            command_line_ | background_ | url_handler_ | system_tray_ | context_menu_ | chrome_internal_ | installed_notification_ | kiosk_ | restart_ | reload_ | new_tab_page_ | test_ | extensions_page_ | file_handler_ | management_api_ | about_page_ | load_and_launch_ | untracked_ | app_launcher_ | keyboard_ | ephemeral_app_
          ]
        ]
    ): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

