package typings.chromeDashApps.chromeNs.runtimeNs

import org.scalablytyped.runtime.StringDictionary
import typings.chromeDashApps.Anon_
import typings.chromeDashApps.Anon_3D
import typings.chromeDashApps.Anon_Accepttlschannelid
import typings.chromeDashApps.Anon_Actions
import typings.chromeDashApps.Anon_Alwaysupdate
import typings.chromeDashApps.Anon_Arm
import typings.chromeDashApps.Anon_Background
import typings.chromeDashApps.Anon_Clientid
import typings.chromeDashApps.Anon_Configurable
import typings.chromeDashApps.Anon_Contentsecuritypolicy
import typings.chromeDashApps.Anon_Defaulticon
import typings.chromeDashApps.Anon_Description
import typings.chromeDashApps.Anon_Email
import typings.chromeDashApps.Anon_Filters
import typings.chromeDashApps.Anon_Id
import typings.chromeDashApps.Anon_Lowenergy
import typings.chromeDashApps.Anon_Managedschema
import typings.chromeDashApps.Anon_Matches
import typings.chromeDashApps.Anon_Mimetype
import typings.chromeDashApps.Anon_NEWNOTE
import typings.chromeDashApps.Anon_Partitions
import typings.chromeDashApps.Anon_Tcp
import typings.chromeDashApps.chromeDashAppsNumbers.`2`
import typings.chromeDashApps.chromeDashAppsNumbers.`true`
import typings.chromeDashApps.chromeDashAppsStrings.new_note
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.std.Exclude
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
  var kiosk: js.UndefOr[Anon_Alwaysupdate] = js.undefined
  /**
    * Enable this app to be used as a kiosk app.
    */
  var kiosk_enabled: `true`
  /**
    * This app can only be used as a kiosk app on Chrome OS
    */
  var kiosk_only: js.UndefOr[Boolean] = js.undefined
  /**
    * Not useful since it will prevent app from running.
    * @see[Source]{@link https://github.com/chromium/chromium/blob/master/chrome/browser/chromeos/extensions/device_local_account_management_policy_provider.cc#L155}
    */
  var kiosk_secondary_apps: js.UndefOr[js.Any] = js.undefined
}

object ValidKioskManifest {
  @scala.inline
  def apply(
    app: Anon_Background,
    externally_connectable: Anon_Accepttlschannelid,
    kiosk_enabled: `true`,
    manifest_version: `2`,
    name: String,
    version: String,
    action_handlers: js.Array[ToStringLiteral[Anon_NEWNOTE, String, Exclude[String, new_note]]] = null,
    author: Anon_Email | js.Any = null,
    automation: AutomationOptions | Boolean = null,
    bluetooth: Anon_Lowenergy = null,
    commands: StringDictionary[Anon_Description] = null,
    current_locale: String = null,
    default_locale: String = null,
    description: String = null,
    display_in_launcher: js.UndefOr[Boolean] = js.undefined,
    display_in_new_tab_page: js.UndefOr[Boolean] = js.undefined,
    event_rules: js.Array[Anon_Actions] = null,
    file_browser_handlers: js.Array[Anon_Defaulticon] = null,
    file_handlers: StringDictionary[Anon_] = null,
    file_system_provider_capabilities: Anon_Configurable = null,
    icons: ManifestIcons = null,
    `import`: js.Array[Anon_Id] = null,
    key: String = null,
    kiosk: Anon_Alwaysupdate = null,
    kiosk_only: js.UndefOr[Boolean] = js.undefined,
    kiosk_secondary_apps: js.Any = null,
    minimum_chrome_version: String = null,
    nacl_modules: js.Array[Anon_Mimetype] = null,
    oauth2: Anon_Clientid = null,
    offline_enabled: js.UndefOr[Boolean] = js.undefined,
    optional_permissions: js.Array[js.Array[UrlMatches] | OptionalPermission | String] = null,
    permissions: js.Array[Permission | String] = null,
    platforms: js.Array[Anon_Arm] = null,
    requirements: Anon_3D = null,
    sandbox: Anon_Contentsecuritypolicy = null,
    short_name: String = null,
    signature: js.Any = null,
    sockets: Anon_Tcp = null,
    storage: Anon_Managedschema = null,
    update_url: String = null,
    url_handlers: StringDictionary[Anon_Matches] = null,
    usb_printers: Anon_Filters = null,
    version_name: String = null,
    webview: Anon_Partitions = null
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
    if (optional_permissions != null) __obj.updateDynamic("optional_permissions")(optional_permissions)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
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

