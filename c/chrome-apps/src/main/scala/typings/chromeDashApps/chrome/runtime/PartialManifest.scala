package typings.chromeDashApps.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typings.chromeDashApps.Anon_
import typings.chromeDashApps.Anon_3D
import typings.chromeDashApps.Anon_Accepttlschannelid
import typings.chromeDashApps.Anon_Actions
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
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsNumbers.`2`
import typings.chromeDashApps.chromeDashAppsStrings.new_note
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialManifest extends js.Object {
  //////////////
  // OPTIONAL //
  //////////////
  /**
    * @requires(CrOS) **Will only work on Chrome OS.**
    * @description
    * The action_handlers manifest property declares which user actions or intents the
    * application supports; these can serve as alternate launch points for your application.
    * This list contains one or more of the ActionType values specified
    * in the ActionType entry of app.runtime.onLaunched.
    * @example
    * 'action_handlers': ['new_note']
    */
  var action_handlers: js.UndefOr[js.Array[ToStringLiteral[Anon_NEWNOTE, String, Exclude[String, new_note]]]] = js.undefined
  //////////////
  // REQUIRED //
  //////////////
  /**
    * Used by packaged apps to specify the app's background scripts.
    * Also used by hosted apps to specify the URLs that the app uses.
    * @required
    */
  var app: Anon_Background
  /**
    * App author information
    * @see[Not implemented anywhere in code]{@link https://github.com/chromium/chromium/blob/master/chrome/browser/chromeos/extensions/device_local_account_management_policy_provider.cc#L46}
    */
  var author: js.UndefOr[Anon_Email | js.Any] = js.undefined
  /**
    * Allows inspection of page contents, not enabled on stable anyways except for whitelist.
    * @see[Docs]{@link https://github.com/chromium/chromium/blob/master/extensions/common/manifest_handlers/automation.cc}
    */
  var automation: js.UndefOr[AutomationOptions | Boolean] = js.undefined
  /**
    * Note: The 'bluetooth' manifest permission is used by the
    * chrome.bluetooth, chrome.bluetoothSocket and
    * chrome.bluetoothLowEnergy APIs.
    * @requires Platforms: Chrome OS, Windows and Mac
    */
  var bluetooth: js.UndefOr[Anon_Lowenergy] = js.undefined
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your app.
    * E.g. an action to open the browser action or send a command to the app.
    */
  var commands: js.UndefOr[StringDictionary[Anon_Description]] = js.undefined
  /**
    * An implementation detail (actually written by Chrome, not the app author).
    */
  val current_locale: js.UndefOr[String] = js.undefined
  /////////////////
  // RECOMMENDED //
  /////////////////
  /**
    * Specifies the subdirectory of _locales that contains the default strings for this app.
    * This field is required in apps that have a _locales directory; it must be absent in
    * apps that have no _locales directory. For details, see Internationalization:
    * @see[Internationalization]{@see https://developer.chrome.com/extensions/i18n}
    */
  var default_locale: js.UndefOr[String] = js.undefined
  /**
    * A plain text string (no HTML or other formatting; no more than 132 characters)
    * that describes the extension. The description should be suitable for both the
    * browser's extension management UI and the Chrome Web Store. You can specify
    * locale-specific strings for this field; see Internationalization for details.
    * @see[Internationalization]{@see https://developer.chrome.com/extensions/i18n}
    */
  var description: js.UndefOr[String] = js.undefined
  /** Restricted to whitelist */
  var display_in_launcher: js.UndefOr[Boolean] = js.undefined
  /** Restricted to whitelist */
  var display_in_new_tab_page: js.UndefOr[Boolean] = js.undefined
  /**
    * The *event_rules* manifest property provides a mechanism to add rules that
    * intercept, block, or modify web requests in-flight using **declarativeWebRequest**
    * or take actions depending on the content of a page, without requiring permission
    * to read the page's content using **declarativeContent**.
    * @see[event_rules docs]{@link https://developer.chrome.com/extensions/manifest/event_rules}
    */
  var event_rules: js.UndefOr[js.Array[Anon_Actions]] = js.undefined
  /**
    * Declares which extensions, apps, and web pages can connect
    * to your extension via runtime.connect and runtime.sendMessage.
    */
  var externally_connectable: Anon_Accepttlschannelid
  /**
    * @requires Permissions: 'fileBrowserHandle'
    * @requires Location': 'component'
    * You can specify locale-specific strings for the value of 'default_title'
    */
  var file_browser_handlers: js.UndefOr[js.Array[Anon_Defaulticon]] = js.undefined
  /**
    * Triggers a launch of the app when one of these files are handled.
    */
  var file_handlers: js.UndefOr[StringDictionary[Anon_]] = js.undefined
  /**
    * Files app uses above information in order to render related UI elements approprietly.
    */
  var file_system_provider_capabilities: js.UndefOr[Anon_Configurable] = js.undefined
  /**
    * One or more icons that represent the extension, app, or theme.
    * You should always provide a 128x128 icon; it's used during
    * installation and by the Chrome Web Store. Extensions should
    * also provide a 48x48 icon, which is used in the extensions
    * management page (chrome://extensions). You can also specify
    * a 16x16 icon to be used as the favicon for an extension's pages.
    *
    * Icons should generally be in PNG format, because PNG has the best support for transparency.
    * They can, however, be in any format supported by WebKit, including BMP, GIF, ICO, and JPEG.
    *
    * You may provide icons of any other size you wish, and Chrome will attempt to use the best size
    * where appropriate. For example, Windows often requires 32-pixel icons, and if the app includes
    * a 32-pixel icon, Chrome will choose that instead of shrinking a 48-pixel icon down. However,
    * you should ensure that all of your icons are square, or unexpected behavior may result.
    *
    * @example
    * 'icons': { '16': 'icon16.png',
    *            '48': 'icon48.png',
    *            '128': 'icon128.png' },
    */
  var icons: js.UndefOr[ManifestIcons] = js.undefined
  /**
    * Import resources from another extension / app.
    * @see[Shared modules]{@link https://developer.chrome.com/apps/shared_modules}
    */
  var `import`: js.UndefOr[js.Array[Anon_Id]] = js.undefined
  /** This value can be used to control the unique ID of an app when it is loaded during development. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * One integer specifying the version of the manifest file format your package requires.
    * As of Chrome 18, developers should specify 2 (without quotes).
    * @see[Manifest Version Info]{@link https://developer.chrome.com/apps/manifest/manifest_version}
    * @required
    */
  var manifest_version: `2`
  /**
    * The minimum version of Chrome that your app, if any.
    * @example
    * 'minimum_chrome_version': '33.0.1715.0'
    */
  var minimum_chrome_version: js.UndefOr[String] = js.undefined
  /** One or more mappings from MIME types to the Native Client module that handles each type. */
  var nacl_modules: js.UndefOr[js.Array[Anon_Mimetype]] = js.undefined
  /**
    * The *name* (maximum of 45 characters) is the primary identifier
    * of the app and is a required field.
    * It is displayed in the following locations:
    *  - Install dialog
    *  - Extension management UI
    *  - Chrome Web Store
    *
    * You can specify locale-specific strings, see Internationalization docs:
    * @see[Internationalization]{@see https://developer.chrome.com/extensions/i18n}
    * @required
    * @requires string - Maximum 45 characters!
    */
  var name: String
  /**
    * Use the Chrome Identity API to authenticate users:
    * the getAuthToken for users logged into their Google Account
    * and the launchWebAuthFlow for users logged into a non-Google account.
    */
  var oauth2: js.UndefOr[Anon_Clientid] = js.undefined
  /**
    * Whether the app is expected to work offline.
    * When Chrome detects that it is offline, apps with this field set to true will be highlighted on the New Tab page.
    */
  var offline_enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Use the chrome.permissions API to request declared optional permissions
    * at run time rather than install time, so users understand why the
    * permissions are needed and grant only those that are necessary.
    */
  var optional_permissions: js.UndefOr[js.Array[js.Array[UrlMatches] | OptionalPermission | String]] = js.undefined
  /**
    * Permissions help to limit damage if your app is compromised by malware.
    * Some permissions are also displayed to users before installation,
    * as detailed in Permission Warnings.
    */
  var permissions: js.UndefOr[js.Array[Permission | String]] = js.undefined
  /**
    * Native Client
    * @see[NDK Docs]{@link https://github.com/crosswalk-project/chromium-crosswalk/blob/af36cc3ce3f5fcb8033f16236725718f8012abfe/native_client_sdk/src/doc/devguide/distributing.rst}
    * @see[Chromium Source]{@link https://github.com/crosswalk-project/chromium-crosswalk/blob/af36cc3ce3f5fcb8033f16236725718f8012abfe/native_client_sdk/src/tools/fix_manifest.py}
    */
  var platforms: js.UndefOr[js.Array[Anon_Arm]] = js.undefined
  /**
    * Technologies required by the app. Hosting sites such
    * as the Chrome Web Store may use this list to dissuade
    * users from installing appss that will not
    * work on their computer. Supported requirements currently
    * include '3D' and 'plugins'; additional requirements checks
    * may be added in the future.
    */
  var requirements: js.UndefOr[Anon_3D] = js.undefined
  /**
    * @deprecated
    * Warning: Starting in version 57, Chrome will no longer allow external web content
    * (including embedded frames and scripts) inside sandboxed pages.
    * Please use a webview instead.
    */
  var sandbox: js.UndefOr[Anon_Contentsecuritypolicy] = js.undefined
  /**
    * The short_name (maximum of 12 characters recommended) is
    * a short version of the app's name. It is an optional field
    * and if not specified, the name will be used, though it will
    * likely be truncated. The short name is typically used where
    * there is insufficient space to display the full name, such as:
    * - App launcher
    * - New Tab page
    *
    * You can specify locale-specific strings, see Internationalization docs:
    * @see[Internationalization]{@see https://developer.chrome.com/extensions/i18n}
    */
  var short_name: js.UndefOr[String] = js.undefined
  /** Doc missing. Declared as a feature, but unused. */
  var signature: js.UndefOr[js.Any] = js.undefined
  /**
    * The sockets manifest property declares which permissions are available
    * for the sockets.udp, sockets.tcp and sockets.tcpServer APIs.
    */
  var sockets: js.UndefOr[Anon_Tcp] = js.undefined
  /**
    * Unlike the local and sync storage areas,
    * the managed storage area requires its structure
    * to be declared as JSON Schema and is strictly validated by Chrome.
    * This schema must be stored in a file indicated by the 'managed_schema'
    * property of the 'storage' manifest key and declares the enterprise
    * policies supported by the app. Policies are analogous to options
    * but are configured by a system administrator instead of the user,
    * allowing the app to be preconfigured for all users of an organization.
    *
    * After declaring the policies they can be read from the storage.managed API.
    * It's up to the app to enforce the policies configured by the administrator.
    */
  var storage: js.UndefOr[Anon_Managedschema] = js.undefined
  // system_indicator?: any; // Deprecated / removed: https://bugs.chromium.org/p/chromium/issues/detail?id=142450
  /**
    * If you publish using the Chrome Developer Dashboard, ignore this field.
    * If you host your own app: URL to an update manifest XML file.
    * **⚠ Warning**
    * As of M33, Windows stable / beta channel users can only
    * download apps hosted in the Chrome Web Store
    * @requires(not Windows)
    * (@see[Protecting Windows users from malicious extensions]{@link http://blog.chromium.org/2013/11/protecting-windows-users-from-malicious.html}).
    * @see[Documentation]{@link https://developer.chrome.com/apps/autoupdate}
    */
  var update_url: js.UndefOr[String] = js.undefined
  /**
    * Used by packaged apps to specify URL patterns the app wants to intercept and handle.
    * An app can define multiple URL handlers under this manifest entry,
    * each having an identifier, a URL pattern, and a title.
    * Here's an example of how to specify url_handlers:
    * @example
    * 'view_foobar_presentation': {
    *   'matches': [
    *     'https://www.foobar.com/presentation/view/ *'
    *   ],
    *   'title': 'View FooBar presentation'
    * }
    * @see[Documentation]{@link https://developer.chrome.com/apps/manifest/url_handlers}
    *
    */
  var url_handlers: js.UndefOr[StringDictionary[Anon_Matches]] = js.undefined
  /** The usbPrinters manifest property declares which USB printers are supported by an app using the printerProvider API. */
  var usb_printers: js.UndefOr[Anon_Filters] = js.undefined
  /**
    * One to four dot-separated integers identifying the version of this app.
    * A couple of rules apply to the integers: they must be between 0 and 65535, inclusive,
    * and non-zero integers can't start with 0. For example, 99999 and 032 are both invalid.
    * A missing integer is equal to zero. For example, 1.1.9.9999 is newer than 1.1.
    * @see[Manifest- Version Docs]{@link https://developer.chrome.com/apps/manifest/version}
    * @required
    */
  var version: String
  /**
    * version_name can be set to a descriptive version string and will be used for display purposes if present.
    * If no version_name is present, the version field will be used for display purposes as well.
    * @example
    * 'version_name': '0.8 beta'
    * 'version_name': 'build rc3'
    * 'version_name': 'Gold Edition'
    */
  var version_name: js.UndefOr[String] = js.undefined
  /**
    * By default, webviews are prevented from loading any resources packaged with the app.
    * However, webview partitions may be granted access to these resources via a webview.partitions
    * section in the app manifest. Partitions may be granted access to a set of files by
    * matching partition name patterns with file name patterns. Both sorts of patterns may
    * contain the * wildcard.
    * @see[Accessing packaged resources]{@link https://developer.chrome.com/apps/tags/webview#local_resources}
    */
  var webview: js.UndefOr[Anon_Partitions] = js.undefined
}

object PartialManifest {
  @scala.inline
  def apply(
    app: Anon_Background,
    externally_connectable: Anon_Accepttlschannelid,
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
  ): PartialManifest = {
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
    __obj.asInstanceOf[PartialManifest]
  }
}

