package typings
package chromeDashAppsLib.chromeNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Manifest for Chrome OS Kiosk apps
  * @requires(CrOS Kiosk App) **Only for Chrome OS Kiosk Apps.**
  */
trait ValidKioskManifest
  extends PartialManifest
     with Manifest {
  /** Kiosk settings */
  var kiosk: js.UndefOr[chromeDashAppsLib.Anon_Alwaysupdate] = js.undefined
  /**
    * Enable this app to be used as a kiosk app.
    */
  var kiosk_enabled: chromeDashAppsLib.chromeDashAppsLibNumbers.`true`
  /**
    * This app can only be used as a kiosk app on Chrome OS
    */
  var kiosk_only: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Not useful since it will prevent app from running.
    * @see[Source]{@link https://github.com/chromium/chromium/blob/master/chrome/browser/chromeos/extensions/device_local_account_management_policy_provider.cc#L155}
    */
  var kiosk_secondary_apps: js.UndefOr[js.Any] = js.undefined
}

object ValidKioskManifest {
  @scala.inline
  def apply(
    app: chromeDashAppsLib.Anon_Background,
    externally_connectable: chromeDashAppsLib.Anon_Accepttlschannelid,
    kiosk_enabled: chromeDashAppsLib.chromeDashAppsLibNumbers.`true`,
    manifest_version: chromeDashAppsLib.chromeDashAppsLibNumbers.`2`,
    name: java.lang.String,
    version: java.lang.String,
    action_handlers: js.Array[
      chromeDashAppsLib.chromeNs.ToStringLiteral[
        chromeDashAppsLib.Anon_NEWNOTE, 
        java.lang.String, 
        stdLib.Exclude[
          java.lang.String, 
          /* import warning: ImportType.apply Failed type conversion: chrome-apps.Anon_NEWNOTE[keyof chrome-apps.Anon_NEWNOTE] */ js.Any
        ]
      ]
    ] = null,
    author: chromeDashAppsLib.Anon_Email | js.Any = null,
    automation: AutomationOptions | scala.Boolean = null,
    bluetooth: chromeDashAppsLib.Anon_Lowenergy = null,
    commands: org.scalablytyped.runtime.StringDictionary[chromeDashAppsLib.Anon_Description] = null,
    current_locale: java.lang.String = null,
    default_locale: java.lang.String = null,
    description: java.lang.String = null,
    display_in_launcher: js.UndefOr[scala.Boolean] = js.undefined,
    display_in_new_tab_page: js.UndefOr[scala.Boolean] = js.undefined,
    event_rules: js.Array[chromeDashAppsLib.Anon_Actions] = null,
    file_browser_handlers: js.Array[chromeDashAppsLib.Anon_Defaulticon] = null,
    file_handlers: org.scalablytyped.runtime.StringDictionary[chromeDashAppsLib.Anon_] = null,
    file_system_provider_capabilities: chromeDashAppsLib.Anon_Configurable = null,
    icons: ManifestIcons = null,
    `import`: js.Array[chromeDashAppsLib.Anon_Id] = null,
    key: java.lang.String = null,
    kiosk: chromeDashAppsLib.Anon_Alwaysupdate = null,
    kiosk_only: js.UndefOr[scala.Boolean] = js.undefined,
    kiosk_secondary_apps: js.Any = null,
    minimum_chrome_version: java.lang.String = null,
    nacl_modules: js.Array[chromeDashAppsLib.Anon_Mimetype] = null,
    oauth2: chromeDashAppsLib.Anon_Clientid = null,
    offline_enabled: js.UndefOr[scala.Boolean] = js.undefined,
    optional_permissions: js.Array[OptionalPermission] | (js.Array[OptionalPermission | js.Array[UrlMatches]]) | (js.Array[OptionalPermission | js.Array[UrlMatches] | java.lang.String]) = null,
    permissions: js.Array[Permission] | (js.Array[Permission | java.lang.String]) = null,
    platforms: js.Array[chromeDashAppsLib.Anon_Naclarch] = null,
    requirements: chromeDashAppsLib.Anon_3D = null,
    sandbox: chromeDashAppsLib.Anon_Contentsecuritypolicy = null,
    short_name: java.lang.String = null,
    signature: js.Any = null,
    sockets: chromeDashAppsLib.Anon_Tcp = null,
    storage: chromeDashAppsLib.Anon_Managedschema = null,
    update_url: java.lang.String = null,
    url_handlers: org.scalablytyped.runtime.StringDictionary[chromeDashAppsLib.Anon_Matches] = null,
    usb_printers: chromeDashAppsLib.Anon_Filters = null,
    version_name: java.lang.String = null,
    webview: chromeDashAppsLib.Anon_Partitions = null
  ): ValidKioskManifest = {
    val __obj = js.Dynamic.literal(app = app, externally_connectable = externally_connectable, kiosk_enabled = kiosk_enabled, manifest_version = manifest_version, name = name, version = version)
    if (action_handlers != null) __obj.updateDynamic("action_handlers")(action_handlers)
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (automation != null) __obj.updateDynamic("automation")(automation.asInstanceOf[js.Any])
    if (bluetooth != null) __obj.updateDynamic("bluetooth")(bluetooth)
    if (commands != null) __obj.updateDynamic("commands")(commands)
    if (current_locale != null) __obj.updateDynamic("current_locale")(current_locale)
    if (default_locale != null) __obj.updateDynamic("default_locale")(default_locale)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(display_in_launcher)) __obj.updateDynamic("display_in_launcher")(display_in_launcher)
    if (!js.isUndefined(display_in_new_tab_page)) __obj.updateDynamic("display_in_new_tab_page")(display_in_new_tab_page)
    if (event_rules != null) __obj.updateDynamic("event_rules")(event_rules)
    if (file_browser_handlers != null) __obj.updateDynamic("file_browser_handlers")(file_browser_handlers)
    if (file_handlers != null) __obj.updateDynamic("file_handlers")(file_handlers)
    if (file_system_provider_capabilities != null) __obj.updateDynamic("file_system_provider_capabilities")(file_system_provider_capabilities)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (`import` != null) __obj.updateDynamic("import")(`import`)
    if (key != null) __obj.updateDynamic("key")(key)
    if (kiosk != null) __obj.updateDynamic("kiosk")(kiosk)
    if (!js.isUndefined(kiosk_only)) __obj.updateDynamic("kiosk_only")(kiosk_only)
    if (kiosk_secondary_apps != null) __obj.updateDynamic("kiosk_secondary_apps")(kiosk_secondary_apps)
    if (minimum_chrome_version != null) __obj.updateDynamic("minimum_chrome_version")(minimum_chrome_version)
    if (nacl_modules != null) __obj.updateDynamic("nacl_modules")(nacl_modules)
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2)
    if (!js.isUndefined(offline_enabled)) __obj.updateDynamic("offline_enabled")(offline_enabled)
    if (optional_permissions != null) __obj.updateDynamic("optional_permissions")(optional_permissions.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms)
    if (requirements != null) __obj.updateDynamic("requirements")(requirements)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (short_name != null) __obj.updateDynamic("short_name")(short_name)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (sockets != null) __obj.updateDynamic("sockets")(sockets)
    if (storage != null) __obj.updateDynamic("storage")(storage)
    if (update_url != null) __obj.updateDynamic("update_url")(update_url)
    if (url_handlers != null) __obj.updateDynamic("url_handlers")(url_handlers)
    if (usb_printers != null) __obj.updateDynamic("usb_printers")(usb_printers)
    if (version_name != null) __obj.updateDynamic("version_name")(version_name)
    if (webview != null) __obj.updateDynamic("webview")(webview)
    __obj.asInstanceOf[ValidKioskManifest]
  }
}

