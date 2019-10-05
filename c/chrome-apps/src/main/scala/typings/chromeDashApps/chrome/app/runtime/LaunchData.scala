package typings.chromeDashApps.chrome.app.runtime

import typings.chromeDashApps.Anon_ABOUTPAGE
import typings.chromeDashApps.Anon_NEWNOTE
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.about_page
import typings.chromeDashApps.chromeDashAppsStrings.app_launcher
import typings.chromeDashApps.chromeDashAppsStrings.background
import typings.chromeDashApps.chromeDashAppsStrings.chrome_internal
import typings.chromeDashApps.chromeDashAppsStrings.command_line
import typings.chromeDashApps.chromeDashAppsStrings.context_menu
import typings.chromeDashApps.chromeDashAppsStrings.ephemeral_app
import typings.chromeDashApps.chromeDashAppsStrings.extensions_page
import typings.chromeDashApps.chromeDashAppsStrings.file_handler
import typings.chromeDashApps.chromeDashAppsStrings.installed_notification
import typings.chromeDashApps.chromeDashAppsStrings.keyboard
import typings.chromeDashApps.chromeDashAppsStrings.kiosk
import typings.chromeDashApps.chromeDashAppsStrings.load_and_launch
import typings.chromeDashApps.chromeDashAppsStrings.management_api
import typings.chromeDashApps.chromeDashAppsStrings.new_note
import typings.chromeDashApps.chromeDashAppsStrings.new_tab_page
import typings.chromeDashApps.chromeDashAppsStrings.reload
import typings.chromeDashApps.chromeDashAppsStrings.restart
import typings.chromeDashApps.chromeDashAppsStrings.system_tray
import typings.chromeDashApps.chromeDashAppsStrings.test
import typings.chromeDashApps.chromeDashAppsStrings.untracked
import typings.chromeDashApps.chromeDashAppsStrings.url_handler
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
  var actionData: js.UndefOr[ToStringLiteral[Anon_NEWNOTE, String, Exclude[String, new_note]]] = js.undefined
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
      Anon_ABOUTPAGE, 
      String, 
      Exclude[
        String, 
        new_tab_page | context_menu | reload | ephemeral_app | restart | test | url_handler | chrome_internal | kiosk | installed_notification | keyboard | untracked | about_page | load_and_launch | command_line | app_launcher | extensions_page | management_api | background | file_handler | system_tray
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
    actionData: ToStringLiteral[Anon_NEWNOTE, String, Exclude[String, new_note]] = null,
    id: String = null,
    isKioskSession: js.UndefOr[Boolean] = js.undefined,
    isPublicSession: js.UndefOr[Boolean] = js.undefined,
    items: js.Array[LaunchDataItem] = null,
    referrerUrl: String = null,
    source: ToStringLiteral[
      Anon_ABOUTPAGE, 
      String, 
      Exclude[
        String, 
        new_tab_page | context_menu | reload | ephemeral_app | restart | test | url_handler | chrome_internal | kiosk | installed_notification | keyboard | untracked | about_page | load_and_launch | command_line | app_launcher | extensions_page | management_api | background | file_handler | system_tray
      ]
    ] = null,
    url: String = null
  ): LaunchData = {
    val __obj = js.Dynamic.literal()
    if (actionData != null) __obj.updateDynamic("actionData")(actionData.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isKioskSession)) __obj.updateDynamic("isKioskSession")(isKioskSession)
    if (!js.isUndefined(isPublicSession)) __obj.updateDynamic("isPublicSession")(isPublicSession)
    if (items != null) __obj.updateDynamic("items")(items)
    if (referrerUrl != null) __obj.updateDynamic("referrerUrl")(referrerUrl)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[LaunchData]
  }
}

