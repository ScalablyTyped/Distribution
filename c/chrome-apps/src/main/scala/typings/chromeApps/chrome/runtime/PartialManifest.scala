package typings.chromeApps.chrome.runtime

import org.scalablytyped.runtime.StringDictionary
import typings.chromeApps.anon.Accepttlschannelid
import typings.chromeApps.anon.Actions
import typings.chromeApps.anon.Background
import typings.chromeApps.anon.Clientid
import typings.chromeApps.anon.Configurable
import typings.chromeApps.anon.Contentsecuritypolicy
import typings.chromeApps.anon.Defaulticon
import typings.chromeApps.anon.Email
import typings.chromeApps.anon.Extensions
import typings.chromeApps.anon.FiltersArray
import typings.chromeApps.anon.Global
import typings.chromeApps.anon.Id
import typings.chromeApps.anon.Lowenergy
import typings.chromeApps.anon.Managedschema
import typings.chromeApps.anon.Matches
import typings.chromeApps.anon.Mimetype
import typings.chromeApps.anon.NEWNOTE
import typings.chromeApps.anon.Naclarch
import typings.chromeApps.anon.Partitions
import typings.chromeApps.anon.Tcp
import typings.chromeApps.anon.`3D`
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsNumbers.`2`
import typings.chromeApps.chromeAppsStrings.NEW_NOTE
import typings.chromeApps.chromeAppsStrings.new_note_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartialManifest extends StObject {
  
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
  var action_handlers: js.UndefOr[js.Array[ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]]] = js.native
  
  //////////////
  // REQUIRED //
  //////////////
  /**
    * Used by packaged apps to specify the app's background scripts.
    * Also used by hosted apps to specify the URLs that the app uses.
    * @required
    */
  var app: Background = js.native
  
  /**
    * App author information
    * @see[Not implemented anywhere in code]{@link https://github.com/chromium/chromium/blob/master/chrome/browser/chromeos/extensions/device_local_account_management_policy_provider.cc#L46}
    */
  var author: js.UndefOr[Email | js.Any] = js.native
  
  /**
    * Allows inspection of page contents, not enabled on stable anyways except for whitelist.
    * @see[Docs]{@link https://github.com/chromium/chromium/blob/master/extensions/common/manifest_handlers/automation.cc}
    */
  var automation: js.UndefOr[AutomationOptions | Boolean] = js.native
  
  /**
    * Note: The 'bluetooth' manifest permission is used by the
    * chrome.bluetooth, chrome.bluetoothSocket and
    * chrome.bluetoothLowEnergy APIs.
    * @requires Platforms: Chrome OS, Windows and Mac
    */
  var bluetooth: js.UndefOr[Lowenergy] = js.native
  
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your app.
    * E.g. an action to open the browser action or send a command to the app.
    */
  var commands: js.UndefOr[StringDictionary[Global]] = js.native
  
  /**
    * An implementation detail (actually written by Chrome, not the app author).
    */
  val current_locale: js.UndefOr[String] = js.native
  
  /////////////////
  // RECOMMENDED //
  /////////////////
  /**
    * Specifies the subdirectory of _locales that contains the default strings for this app.
    * This field is required in apps that have a _locales directory; it must be absent in
    * apps that have no _locales directory. For details, see Internationalization:
    * @see[Internationalization]{@see https://developer.chrome.com/extensions/i18n}
    */
  var default_locale: js.UndefOr[String] = js.native
  
  /**
    * A plain text string (no HTML or other formatting; no more than 132 characters)
    * that describes the extension. The description should be suitable for both the
    * browser's extension management UI and the Chrome Web Store. You can specify
    * locale-specific strings for this field; see Internationalization for details.
    * @see[Internationalization]{@see https://developer.chrome.com/extensions/i18n}
    */
  var description: js.UndefOr[String] = js.native
  
  /** Restricted to whitelist */
  var display_in_launcher: js.UndefOr[Boolean] = js.native
  
  /** Restricted to whitelist */
  var display_in_new_tab_page: js.UndefOr[Boolean] = js.native
  
  /**
    * The *event_rules* manifest property provides a mechanism to add rules that
    * intercept, block, or modify web requests in-flight using **declarativeWebRequest**
    * or take actions depending on the content of a page, without requiring permission
    * to read the page's content using **declarativeContent**.
    * @see[event_rules docs]{@link https://developer.chrome.com/extensions/manifest/event_rules}
    */
  var event_rules: js.UndefOr[js.Array[Actions]] = js.native
  
  /**
    * Declares which extensions, apps, and web pages can connect
    * to your extension via runtime.connect and runtime.sendMessage.
    */
  var externally_connectable: Accepttlschannelid = js.native
  
  /**
    * @requires Permissions: 'fileBrowserHandle'
    * @requires Location': 'component'
    * You can specify locale-specific strings for the value of 'default_title'
    */
  var file_browser_handlers: js.UndefOr[js.Array[Defaulticon]] = js.native
  
  /**
    * Triggers a launch of the app when one of these files are handled.
    */
  var file_handlers: js.UndefOr[StringDictionary[Extensions]] = js.native
  
  /**
    * Files app uses above information in order to render related UI elements approprietly.
    */
  var file_system_provider_capabilities: js.UndefOr[Configurable] = js.native
  
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
  var icons: js.UndefOr[ManifestIcons] = js.native
  
  /**
    * Import resources from another extension / app.
    * @see[Shared modules]{@link https://developer.chrome.com/apps/shared_modules}
    */
  var `import`: js.UndefOr[js.Array[Id]] = js.native
  
  /** This value can be used to control the unique ID of an app when it is loaded during development. */
  var key: js.UndefOr[String] = js.native
  
  /**
    * One integer specifying the version of the manifest file format your package requires.
    * As of Chrome 18, developers should specify 2 (without quotes).
    * @see[Manifest Version Info]{@link https://developer.chrome.com/apps/manifest/manifest_version}
    * @required
    */
  var manifest_version: `2` = js.native
  
  /**
    * The minimum version of Chrome that your app, if any.
    * @example
    * 'minimum_chrome_version': '33.0.1715.0'
    */
  var minimum_chrome_version: js.UndefOr[String] = js.native
  
  /** One or more mappings from MIME types to the Native Client module that handles each type. */
  var nacl_modules: js.UndefOr[js.Array[Mimetype]] = js.native
  
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
  var name: String = js.native
  
  /**
    * Use the Chrome Identity API to authenticate users:
    * the getAuthToken for users logged into their Google Account
    * and the launchWebAuthFlow for users logged into a non-Google account.
    */
  var oauth2: js.UndefOr[Clientid] = js.native
  
  /**
    * Whether the app is expected to work offline.
    * When Chrome detects that it is offline, apps with this field set to true will be highlighted on the New Tab page.
    */
  var offline_enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Use the chrome.permissions API to request declared optional permissions
    * at run time rather than install time, so users understand why the
    * permissions are needed and grant only those that are necessary.
    */
  var optional_permissions: js.UndefOr[js.Array[js.Array[UrlMatches] | OptionalPermission | String]] = js.native
  
  /**
    * Permissions help to limit damage if your app is compromised by malware.
    * Some permissions are also displayed to users before installation,
    * as detailed in Permission Warnings.
    */
  var permissions: js.UndefOr[js.Array[Permission | String]] = js.native
  
  /**
    * Native Client
    * @see[NDK Docs]{@link https://github.com/crosswalk-project/chromium-crosswalk/blob/af36cc3ce3f5fcb8033f16236725718f8012abfe/native_client_sdk/src/doc/devguide/distributing.rst}
    * @see[Chromium Source]{@link https://github.com/crosswalk-project/chromium-crosswalk/blob/af36cc3ce3f5fcb8033f16236725718f8012abfe/native_client_sdk/src/tools/fix_manifest.py}
    */
  var platforms: js.UndefOr[js.Array[Naclarch]] = js.native
  
  /**
    * Technologies required by the app. Hosting sites such
    * as the Chrome Web Store may use this list to dissuade
    * users from installing appss that will not
    * work on their computer. Supported requirements currently
    * include '3D' and 'plugins'; additional requirements checks
    * may be added in the future.
    */
  var requirements: js.UndefOr[`3D`] = js.native
  
  /**
    * @deprecated
    * Warning: Starting in version 57, Chrome will no longer allow external web content
    * (including embedded frames and scripts) inside sandboxed pages.
    * Please use a webview instead.
    */
  var sandbox: js.UndefOr[Contentsecuritypolicy] = js.native
  
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
  var short_name: js.UndefOr[String] = js.native
  
  /** Doc missing. Declared as a feature, but unused. */
  var signature: js.UndefOr[js.Any] = js.native
  
  /**
    * The sockets manifest property declares which permissions are available
    * for the sockets.udp, sockets.tcp and sockets.tcpServer APIs.
    */
  var sockets: js.UndefOr[Tcp] = js.native
  
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
  var storage: js.UndefOr[Managedschema] = js.native
  
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
  var update_url: js.UndefOr[String] = js.native
  
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
  var url_handlers: js.UndefOr[StringDictionary[Matches]] = js.native
  
  /** The usbPrinters manifest property declares which USB printers are supported by an app using the printerProvider API. */
  var usb_printers: js.UndefOr[FiltersArray] = js.native
  
  /**
    * One to four dot-separated integers identifying the version of this app.
    * A couple of rules apply to the integers: they must be between 0 and 65535, inclusive,
    * and non-zero integers can't start with 0. For example, 99999 and 032 are both invalid.
    * A missing integer is equal to zero. For example, 1.1.9.9999 is newer than 1.1.
    * @see[Manifest- Version Docs]{@link https://developer.chrome.com/apps/manifest/version}
    * @required
    */
  var version: String = js.native
  
  /**
    * version_name can be set to a descriptive version string and will be used for display purposes if present.
    * If no version_name is present, the version field will be used for display purposes as well.
    * @example
    * 'version_name': '0.8 beta'
    * 'version_name': 'build rc3'
    * 'version_name': 'Gold Edition'
    */
  var version_name: js.UndefOr[String] = js.native
  
  /**
    * By default, webviews are prevented from loading any resources packaged with the app.
    * However, webview partitions may be granted access to these resources via a webview.partitions
    * section in the app manifest. Partitions may be granted access to a set of files by
    * matching partition name patterns with file name patterns. Both sorts of patterns may
    * contain the * wildcard.
    * @see[Accessing packaged resources]{@link https://developer.chrome.com/apps/tags/webview#local_resources}
    */
  var webview: js.UndefOr[Partitions] = js.native
}
object PartialManifest {
  
  @scala.inline
  def apply(
    app: Background,
    externally_connectable: Accepttlschannelid,
    manifest_version: `2`,
    name: String,
    version: String
  ): PartialManifest = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], externally_connectable = externally_connectable.asInstanceOf[js.Any], manifest_version = manifest_version.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialManifest]
  }
  
  @scala.inline
  implicit class PartialManifestMutableBuilder[Self <: PartialManifest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction_handlers(value: js.Array[ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]]]): Self = StObject.set(x, "action_handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAction_handlersUndefined: Self = StObject.set(x, "action_handlers", js.undefined)
    
    @scala.inline
    def setAction_handlersVarargs(value: (ToStringLiteral[NEWNOTE, NEW_NOTE, Exclude[NEW_NOTE, new_note_]])*): Self = StObject.set(x, "action_handlers", js.Array(value :_*))
    
    @scala.inline
    def setApp(value: Background): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: Email | js.Any): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    @scala.inline
    def setAutomation(value: AutomationOptions | Boolean): Self = StObject.set(x, "automation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationUndefined: Self = StObject.set(x, "automation", js.undefined)
    
    @scala.inline
    def setBluetooth(value: Lowenergy): Self = StObject.set(x, "bluetooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBluetoothUndefined: Self = StObject.set(x, "bluetooth", js.undefined)
    
    @scala.inline
    def setCommands(value: StringDictionary[Global]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    
    @scala.inline
    def setCurrent_locale(value: String): Self = StObject.set(x, "current_locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_localeUndefined: Self = StObject.set(x, "current_locale", js.undefined)
    
    @scala.inline
    def setDefault_locale(value: String): Self = StObject.set(x, "default_locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefault_localeUndefined: Self = StObject.set(x, "default_locale", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplay_in_launcher(value: Boolean): Self = StObject.set(x, "display_in_launcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_in_launcherUndefined: Self = StObject.set(x, "display_in_launcher", js.undefined)
    
    @scala.inline
    def setDisplay_in_new_tab_page(value: Boolean): Self = StObject.set(x, "display_in_new_tab_page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_in_new_tab_pageUndefined: Self = StObject.set(x, "display_in_new_tab_page", js.undefined)
    
    @scala.inline
    def setEvent_rules(value: js.Array[Actions]): Self = StObject.set(x, "event_rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_rulesUndefined: Self = StObject.set(x, "event_rules", js.undefined)
    
    @scala.inline
    def setEvent_rulesVarargs(value: Actions*): Self = StObject.set(x, "event_rules", js.Array(value :_*))
    
    @scala.inline
    def setExternally_connectable(value: Accepttlschannelid): Self = StObject.set(x, "externally_connectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_browser_handlers(value: js.Array[Defaulticon]): Self = StObject.set(x, "file_browser_handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_browser_handlersUndefined: Self = StObject.set(x, "file_browser_handlers", js.undefined)
    
    @scala.inline
    def setFile_browser_handlersVarargs(value: Defaulticon*): Self = StObject.set(x, "file_browser_handlers", js.Array(value :_*))
    
    @scala.inline
    def setFile_handlers(value: StringDictionary[Extensions]): Self = StObject.set(x, "file_handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_handlersUndefined: Self = StObject.set(x, "file_handlers", js.undefined)
    
    @scala.inline
    def setFile_system_provider_capabilities(value: Configurable): Self = StObject.set(x, "file_system_provider_capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_system_provider_capabilitiesUndefined: Self = StObject.set(x, "file_system_provider_capabilities", js.undefined)
    
    @scala.inline
    def setIcons(value: ManifestIcons): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    @scala.inline
    def setImport(value: js.Array[Id]): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    
    @scala.inline
    def setImportVarargs(value: Id*): Self = StObject.set(x, "import", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setManifest_version(value: `2`): Self = StObject.set(x, "manifest_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum_chrome_version(value: String): Self = StObject.set(x, "minimum_chrome_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum_chrome_versionUndefined: Self = StObject.set(x, "minimum_chrome_version", js.undefined)
    
    @scala.inline
    def setNacl_modules(value: js.Array[Mimetype]): Self = StObject.set(x, "nacl_modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNacl_modulesUndefined: Self = StObject.set(x, "nacl_modules", js.undefined)
    
    @scala.inline
    def setNacl_modulesVarargs(value: Mimetype*): Self = StObject.set(x, "nacl_modules", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2(value: Clientid): Self = StObject.set(x, "oauth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauth2Undefined: Self = StObject.set(x, "oauth2", js.undefined)
    
    @scala.inline
    def setOffline_enabled(value: Boolean): Self = StObject.set(x, "offline_enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffline_enabledUndefined: Self = StObject.set(x, "offline_enabled", js.undefined)
    
    @scala.inline
    def setOptional_permissions(value: js.Array[js.Array[UrlMatches] | OptionalPermission | String]): Self = StObject.set(x, "optional_permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional_permissionsUndefined: Self = StObject.set(x, "optional_permissions", js.undefined)
    
    @scala.inline
    def setOptional_permissionsVarargs(value: (js.Array[UrlMatches] | OptionalPermission | String)*): Self = StObject.set(x, "optional_permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[Permission | String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: (Permission | String)*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setPlatforms(value: js.Array[Naclarch]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformsUndefined: Self = StObject.set(x, "platforms", js.undefined)
    
    @scala.inline
    def setPlatformsVarargs(value: Naclarch*): Self = StObject.set(x, "platforms", js.Array(value :_*))
    
    @scala.inline
    def setRequirements(value: `3D`): Self = StObject.set(x, "requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequirementsUndefined: Self = StObject.set(x, "requirements", js.undefined)
    
    @scala.inline
    def setSandbox(value: Contentsecuritypolicy): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    @scala.inline
    def setShort_name(value: String): Self = StObject.set(x, "short_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort_nameUndefined: Self = StObject.set(x, "short_name", js.undefined)
    
    @scala.inline
    def setSignature(value: js.Any): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setSockets(value: Tcp): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketsUndefined: Self = StObject.set(x, "sockets", js.undefined)
    
    @scala.inline
    def setStorage(value: Managedschema): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    @scala.inline
    def setUpdate_url(value: String): Self = StObject.set(x, "update_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_urlUndefined: Self = StObject.set(x, "update_url", js.undefined)
    
    @scala.inline
    def setUrl_handlers(value: StringDictionary[Matches]): Self = StObject.set(x, "url_handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl_handlersUndefined: Self = StObject.set(x, "url_handlers", js.undefined)
    
    @scala.inline
    def setUsb_printers(value: FiltersArray): Self = StObject.set(x, "usb_printers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsb_printersUndefined: Self = StObject.set(x, "usb_printers", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion_name(value: String): Self = StObject.set(x, "version_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion_nameUndefined: Self = StObject.set(x, "version_name", js.undefined)
    
    @scala.inline
    def setWebview(value: Partitions): Self = StObject.set(x, "webview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebviewUndefined: Self = StObject.set(x, "webview", js.undefined)
  }
}
