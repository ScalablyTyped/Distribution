package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.Anon3D
import typings.chromeApps.AnonAccepttlschannelid
import typings.chromeApps.AnonActions
import typings.chromeApps.AnonBackground
import typings.chromeApps.AnonClientid
import typings.chromeApps.AnonConfigurable
import typings.chromeApps.AnonContentsecuritypolicy
import typings.chromeApps.AnonDefaulticon
import typings.chromeApps.AnonDescription
import typings.chromeApps.AnonEmail
import typings.chromeApps.AnonExtensions
import typings.chromeApps.AnonFilters
import typings.chromeApps.AnonId
import typings.chromeApps.AnonLowenergy
import typings.chromeApps.AnonManagedschema
import typings.chromeApps.AnonMatches
import typings.chromeApps.AnonMimetype
import typings.chromeApps.AnonNEWNOTE
import typings.chromeApps.AnonNaclarch
import typings.chromeApps.AnonPartitions
import typings.chromeApps.AnonTcp
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsNumbers.`2`
import typings.chromeApps.chromeAppsStrings.new_note
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidManifest
  extends PartialManifest
     with Manifest

object InvalidManifest {
  @scala.inline
  def apply(
    app: AnonBackground,
    externally_connectable: AnonAccepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String,
    action_handlers: js.Array[ToStringLiteral[AnonNEWNOTE, String, Exclude[String, new_note]]] = null,
    author: AnonEmail | js.Any = null,
    automation: AutomationOptions | Boolean = null,
    bluetooth: AnonLowenergy = null,
    commands: StringDictionary[AnonDescription] = null,
    current_locale: String = null,
    default_locale: String = null,
    description: String = null,
    display_in_launcher: js.UndefOr[Boolean] = js.undefined,
    display_in_new_tab_page: js.UndefOr[Boolean] = js.undefined,
    event_rules: js.Array[AnonActions] = null,
    file_browser_handlers: js.Array[AnonDefaulticon] = null,
    file_handlers: StringDictionary[AnonExtensions] = null,
    file_system_provider_capabilities: AnonConfigurable = null,
    icons: ManifestIcons = null,
    `import`: js.Array[AnonId] = null,
    key: String = null,
    minimum_chrome_version: String = null,
    nacl_modules: js.Array[AnonMimetype] = null,
    oauth2: AnonClientid = null,
    offline_enabled: js.UndefOr[Boolean] = js.undefined,
    optional_permissions: js.Array[js.Array[UrlMatches] | OptionalPermission | String] = null,
    permissions: js.Array[Permission | String] = null,
    platforms: js.Array[AnonNaclarch] = null,
    requirements: Anon3D = null,
    sandbox: AnonContentsecuritypolicy = null,
    short_name: String = null,
    signature: js.Any = null,
    sockets: AnonTcp = null,
    storage: AnonManagedschema = null,
    update_url: String = null,
    url_handlers: StringDictionary[AnonMatches] = null,
    usb_printers: AnonFilters = null,
    version_name: String = null,
    webview: AnonPartitions = null
  ): InvalidManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (action_handlers != null) __obj.updateDynamic("action_handlers")(action_handlers.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (automation != null) __obj.updateDynamic("automation")(automation.asInstanceOf[js.Any])
    if (bluetooth != null) __obj.updateDynamic("bluetooth")(bluetooth.asInstanceOf[js.Any])
    if (commands != null) __obj.updateDynamic("commands")(commands.asInstanceOf[js.Any])
    if (current_locale != null) __obj.updateDynamic("current_locale")(current_locale.asInstanceOf[js.Any])
    if (default_locale != null) __obj.updateDynamic("default_locale")(default_locale.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(display_in_launcher)) __obj.updateDynamic("display_in_launcher")(display_in_launcher.asInstanceOf[js.Any])
    if (!js.isUndefined(display_in_new_tab_page)) __obj.updateDynamic("display_in_new_tab_page")(display_in_new_tab_page.asInstanceOf[js.Any])
    if (event_rules != null) __obj.updateDynamic("event_rules")(event_rules.asInstanceOf[js.Any])
    if (file_browser_handlers != null) __obj.updateDynamic("file_browser_handlers")(file_browser_handlers.asInstanceOf[js.Any])
    if (file_handlers != null) __obj.updateDynamic("file_handlers")(file_handlers.asInstanceOf[js.Any])
    if (file_system_provider_capabilities != null) __obj.updateDynamic("file_system_provider_capabilities")(file_system_provider_capabilities.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (`import` != null) __obj.updateDynamic("import")(`import`.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (minimum_chrome_version != null) __obj.updateDynamic("minimum_chrome_version")(minimum_chrome_version.asInstanceOf[js.Any])
    if (nacl_modules != null) __obj.updateDynamic("nacl_modules")(nacl_modules.asInstanceOf[js.Any])
    if (oauth2 != null) __obj.updateDynamic("oauth2")(oauth2.asInstanceOf[js.Any])
    if (!js.isUndefined(offline_enabled)) __obj.updateDynamic("offline_enabled")(offline_enabled.asInstanceOf[js.Any])
    if (optional_permissions != null) __obj.updateDynamic("optional_permissions")(optional_permissions.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (platforms != null) __obj.updateDynamic("platforms")(platforms.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox.asInstanceOf[js.Any])
    if (short_name != null) __obj.updateDynamic("short_name")(short_name.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (sockets != null) __obj.updateDynamic("sockets")(sockets.asInstanceOf[js.Any])
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (update_url != null) __obj.updateDynamic("update_url")(update_url.asInstanceOf[js.Any])
    if (url_handlers != null) __obj.updateDynamic("url_handlers")(url_handlers.asInstanceOf[js.Any])
    if (usb_printers != null) __obj.updateDynamic("usb_printers")(usb_printers.asInstanceOf[js.Any])
    if (version_name != null) __obj.updateDynamic("version_name")(version_name.asInstanceOf[js.Any])
    if (webview != null) __obj.updateDynamic("webview")(webview.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidManifest]
  }
}

