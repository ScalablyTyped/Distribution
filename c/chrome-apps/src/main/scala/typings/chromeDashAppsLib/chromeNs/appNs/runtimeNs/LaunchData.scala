package typings
package chromeDashAppsLib.chromeNs.appNs.runtimeNs

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
  var actionData: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_NEWNOTE, 
      java.lang.String, 
      stdLib.Exclude[java.lang.String, chromeDashAppsLib.chromeDashAppsLibStrings.new_note]
    ]
  ] = js.undefined
  /**
    * The ID of the file or URL handler that the app is being invoked with.
    * Handler IDs are the top-level keys in the file_handlers and/or url_handlers dictionaries in the manifest.
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the app is being launched in a Chrome OS kiosk session.
    */
  var isKioskSession: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the app is being launched in a Chrome OS public session.
    * @since Chrome 47.
    */
  var isPublicSession: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The file entries for the onLaunched event triggered by a matching file handler in the file_handlers manifest key.
    */
  var items: js.UndefOr[js.Array[LaunchDataItem]] = js.undefined
  /**
    * The referrer URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
    */
  var referrerUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Where the app is launched from.
    * @see enum LaunchSource
    */
  var source: js.UndefOr[
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ABOUTPAGE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.new_tab_page | chromeDashAppsLib.chromeDashAppsLibStrings.context_menu | chromeDashAppsLib.chromeDashAppsLibStrings.reload | chromeDashAppsLib.chromeDashAppsLibStrings.ephemeral_app | chromeDashAppsLib.chromeDashAppsLibStrings.restart | chromeDashAppsLib.chromeDashAppsLibStrings.test | chromeDashAppsLib.chromeDashAppsLibStrings.url_handler | chromeDashAppsLib.chromeDashAppsLibStrings.chrome_internal | chromeDashAppsLib.chromeDashAppsLibStrings.kiosk | chromeDashAppsLib.chromeDashAppsLibStrings.installed_notification | chromeDashAppsLib.chromeDashAppsLibStrings.keyboard | chromeDashAppsLib.chromeDashAppsLibStrings.untracked | chromeDashAppsLib.chromeDashAppsLibStrings.about_page | chromeDashAppsLib.chromeDashAppsLibStrings.load_and_launch | chromeDashAppsLib.chromeDashAppsLibStrings.command_line | chromeDashAppsLib.chromeDashAppsLibStrings.app_launcher | chromeDashAppsLib.chromeDashAppsLibStrings.extensions_page | chromeDashAppsLib.chromeDashAppsLibStrings.management_api | chromeDashAppsLib.chromeDashAppsLibStrings.background | chromeDashAppsLib.chromeDashAppsLibStrings.file_handler | chromeDashAppsLib.chromeDashAppsLibStrings.system_tray
      ]
    ]
  ] = js.undefined
  /**
    * The URL for the onLaunched event triggered by a matching URL handler in the url_handlers manifest key.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object LaunchData {
  @scala.inline
  def apply(
    actionData: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_NEWNOTE, 
      java.lang.String, 
      stdLib.Exclude[java.lang.String, chromeDashAppsLib.chromeDashAppsLibStrings.new_note]
    ] = null,
    id: java.lang.String = null,
    isKioskSession: js.UndefOr[scala.Boolean] = js.undefined,
    isPublicSession: js.UndefOr[scala.Boolean] = js.undefined,
    items: js.Array[LaunchDataItem] = null,
    referrerUrl: java.lang.String = null,
    source: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_ABOUTPAGE, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.new_tab_page | chromeDashAppsLib.chromeDashAppsLibStrings.context_menu | chromeDashAppsLib.chromeDashAppsLibStrings.reload | chromeDashAppsLib.chromeDashAppsLibStrings.ephemeral_app | chromeDashAppsLib.chromeDashAppsLibStrings.restart | chromeDashAppsLib.chromeDashAppsLibStrings.test | chromeDashAppsLib.chromeDashAppsLibStrings.url_handler | chromeDashAppsLib.chromeDashAppsLibStrings.chrome_internal | chromeDashAppsLib.chromeDashAppsLibStrings.kiosk | chromeDashAppsLib.chromeDashAppsLibStrings.installed_notification | chromeDashAppsLib.chromeDashAppsLibStrings.keyboard | chromeDashAppsLib.chromeDashAppsLibStrings.untracked | chromeDashAppsLib.chromeDashAppsLibStrings.about_page | chromeDashAppsLib.chromeDashAppsLibStrings.load_and_launch | chromeDashAppsLib.chromeDashAppsLibStrings.command_line | chromeDashAppsLib.chromeDashAppsLibStrings.app_launcher | chromeDashAppsLib.chromeDashAppsLibStrings.extensions_page | chromeDashAppsLib.chromeDashAppsLibStrings.management_api | chromeDashAppsLib.chromeDashAppsLibStrings.background | chromeDashAppsLib.chromeDashAppsLibStrings.file_handler | chromeDashAppsLib.chromeDashAppsLibStrings.system_tray
      ]
    ] = null,
    url: java.lang.String = null
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

