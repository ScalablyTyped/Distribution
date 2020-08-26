package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofchrome extends js.Object {
  val _debugger: TypeofDebugger = js.native
  ////////////////////
  // Accessibility Features
  ////////////////////
  /**
    * Use the chrome.accessibilityFeatures API to manage Chrome's accessibility features. This API relies on the ChromeSetting prototype of the type API for getting and setting individual accessibility features. In order to get feature states the extension must request accessibilityFeatures.read permission. For modifying feature state, the extension needs accessibilityFeatures.modify permission. Note that accessibilityFeatures.modify does not imply accessibilityFeatures.read permission.
    * Availability: Since Chrome 37.
    * Permissions: "accessibilityFeatures.read"
    * Important: This API works only on Chrome OS.
    */
  val accessibilityFeatures: TypeofaccessibilityFeatur = js.native
  ////////////////////
  // Alarms
  ////////////////////
  /**
    * Use the chrome.alarms API to schedule code to run periodically or at a specified time in the future.
    * Availability: Since Chrome 22.
    * Permissions:  "alarms"
    */
  val alarms: Typeofalarms = js.native
  ////////////////////
  // Bookmarks
  ////////////////////
  /**
    * Use the chrome.bookmarks API to create, organize, and otherwise manipulate bookmarks. Also see Override Pages, which you can use to create a custom Bookmark Manager page.
    * Availability: Since Chrome 5.
    * Permissions:  "bookmarks"
    */
  val bookmarks: Typeofbookmarks = js.native
  ////////////////////
  // Browser
  ////////////////////
  /**
    * Use the chrome.browser API to interact with the Chrome browser associated with
    * the current application and Chrome profile.
    */
  val browser: Typeofbrowser = js.native
  ////////////////////
  // Browser Action
  ////////////////////
  /**
    * Use browser actions to put icons in the main Google Chrome toolbar, to the right of the address bar. In addition to its icon, a browser action can also have a tooltip, a badge, and a popup.
    * Availability: Since Chrome 5.
    * Manifest:  "browser_action": {...}
    */
  val browserAction: TypeofbrowserAction = js.native
  ////////////////////
  // Browsing Data
  ////////////////////
  /**
    * Use the chrome.browsingData API to remove browsing data from a user's local profile.
    * Availability: Since Chrome 19.
    * Permissions:  "browsingData"
    */
  val browsingData: TypeofbrowsingData = js.native
  val cast: Typeofcast = js.native
  ////////////////////
  // Commands
  ////////////////////
  /**
    * Use the commands API to add keyboard shortcuts that trigger actions in your extension, for example, an action to open the browser action or send a command to the extension.
    * Availability: Since Chrome 25.
    * Manifest:  "commands": {...}
    */
  val commands: Typeofcommands = js.native
  ////////////////////
  // Content Settings
  ////////////////////
  /**
    * Use the chrome.contentSettings API to change settings that control whether websites can use features such as cookies, JavaScript, and plugins. More generally speaking, content settings allow you to customize Chrome's behavior on a per-site basis instead of globally.
    * Availability: Since Chrome 16.
    * Permissions:  "contentSettings"
    */
  val contentSettings: TypeofcontentSettings = js.native
  ////////////////////
  // Context Menus
  ////////////////////
  /**
    * Use the chrome.contextMenus API to add items to Google Chrome's context menu. You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages.
    * Availability: Since Chrome 6.
    * Permissions:  "contextMenus"
    */
  val contextMenus: TypeofcontextMenus = js.native
  ////////////////////
  // Cookies
  ////////////////////
  /**
    * Use the chrome.cookies API to query and modify cookies, and to be notified when they change.
    * Availability: Since Chrome 6.
    * Permissions:  "cookies", host permissions
    */
  val cookies: Typeofcookies = js.native
  ////////////////////
  // Declarative Content
  ////////////////////
  /**
    * Use the chrome.declarativeContent API to take actions depending on the content of a page, without requiring permission to read the page's content.
    * Availability: Since Chrome 33.
    * Permissions:  "declarativeContent"
    */
  val declarativeContent: TypeofdeclarativeContent = js.native
  ////////////////////
  // Declarative Web Request
  ////////////////////
  val declarativeWebRequest: TypeofdeclarativeWebReque = js.native
  ////////////////////
  // DesktopCapture
  ////////////////////
  /**
    * Desktop Capture API that can be used to capture content of screen, individual windows or tabs.
    * Availability: Since Chrome 34.
    * Permissions:  "desktopCapture"
    */
  val desktopCapture: TypeofdesktopCapture = js.native
  val devtools: Typeofdevtools = js.native
  ////////////////////
  // Document Scan
  ////////////////////
  /**
    * Use the chrome.documentScan API to discover and retrieve images from attached paper document scanners.
    * Availability: Since Chrome 44.
    * Permissions:  "documentScan"
    * Important: This API works only on Chrome OS.
    */
  val documentScan: TypeofdocumentScan = js.native
  ////////////////////
  // Dev Tools - Downloads
  ////////////////////
  /**
    * Use the chrome.downloads API to programmatically initiate, monitor, manipulate, and search for downloads.
    * Availability: Since Chrome 31.
    * Permissions:  "downloads"
    */
  val downloads: Typeofdownloads = js.native
  val enterprise: Typeofenterprise = js.native
  ////////////////////
  // Events
  ////////////////////
  /**
    * The chrome.events namespace contains common types used by APIs dispatching events to notify you when something interesting happens.
    * Availability: Since Chrome 21.
    */
  val events: js.Any = js.native
  ////////////////////
  // Extension
  ////////////////////
  /**
    * The chrome.extension API has utilities that can be used by any extension page. It includes support for exchanging messages between an extension and its content scripts or between extensions, as described in detail in Message Passing.
    * Availability: Since Chrome 5.
    */
  val extension: Typeofextension = js.native
  ////////////////////
  // File Browser Handler
  ////////////////////
  /**
    * Use the chrome.fileBrowserHandler API to extend the Chrome OS file browser. For example, you can use this API to enable users to upload files to your website.
    * Availability: Since Chrome 12.
    * Permissions:  "fileBrowserHandler"
    * Important: This API works only on Chrome OS.
    */
  val fileBrowserHandler: TypeoffileBrowserHandler = js.native
  ////////////////////
  // File System Provider
  ////////////////////
  /**
    * Use the chrome.fileSystemProvider API to create file systems, that can be accessible from the file manager on Chrome OS.
    * Availability: Since Chrome 40.
    * Permissions:  "fileSystemProvider"
    * Important: This API works only on Chrome OS.
    */
  val fileSystemProvider: TypeoffileSystemProvider = js.native
  ////////////////////
  // Font Settings
  ////////////////////
  /**
    * Use the chrome.fontSettings API to manage Chrome's font settings.
    * Availability: Since Chrome 22.
    * Permissions:  "fontSettings"
    */
  val fontSettings: TypeoffontSettings = js.native
  ////////////////////
  // Google Cloud Messaging
  ////////////////////
  /**
    * Use chrome.gcm to enable apps and extensions to send and receive messages through the Google Cloud Messaging Service.
    * Availability: Since Chrome 35.
    * Permissions:  "gcm"
    */
  val gcm: Typeofgcm = js.native
  ////////////////////
  // History
  ////////////////////
  /**
    * Use the chrome.history API to interact with the browser's record of visited pages. You can add, remove, and query for URLs in the browser's history. To override the history page with your own version, see Override Pages.
    * Availability: Since Chrome 5.
    * Permissions:  "history"
    */
  val history: Typeofhistory = js.native
  ////////////////////
  // i18n
  ////////////////////
  /**
    * Use the chrome.i18n infrastructure to implement internationalization across your whole app or extension.
    * @since Chrome 5.
    */
  val i18n: Typeofi18n = js.native
  ////////////////////
  // Identity
  ////////////////////
  /**
    * Use the chrome.identity API to get OAuth2 access tokens.
    * Permissions:  "identity"
    * @since Chrome 29.
    */
  val identity: Typeofidentity = js.native
  ////////////////////
  // Idle
  ////////////////////
  /**
    * Use the chrome.idle API to detect when the machine's idle state changes.
    * Permissions:  "idle"
    * @since Chrome 6.
    */
  val idle: Typeofidle = js.native
  val input: Typeofinput = js.native
  ////////////////////
  // LoginState
  ////////////////////
  /**
    * Use the chrome.loginState API to read and monitor the login state.
    * Permissions: "loginState"
    * @since Chrome 78.
    * Important: This API works only on Chrome OS.
    */
  val loginState: TypeofloginState = js.native
  ////////////////////
  // Management
  ////////////////////
  /**
    * The chrome.management API provides ways to manage the list of extensions/apps that are installed and running. It is particularly useful for extensions that override the built-in New Tab page.
    * Permissions:  "management"
    * @since Chrome 8.
    */
  val management: Typeofmanagement = js.native
  val networking: Typeofnetworking = js.native
  ////////////////////
  // Notifications
  // https://developer.chrome.com/extensions/notifications
  ////////////////////
  /**
    * Use the chrome.notifications API to create rich notifications using templates and show these notifications to users in the system tray.
    * Permissions:  "notifications"
    * @since Chrome 28.
    */
  val notifications: Typeofnotifications = js.native
  ////////////////////
  // Omnibox
  ////////////////////
  /**
    * The omnibox API allows you to register a keyword with Google Chrome's address bar, which is also known as the omnibox.
    * Manifest:  "omnibox": {...}
    * @since Chrome 9.
    */
  val omnibox: Typeofomnibox = js.native
  ////////////////////
  // Page Action
  ////////////////////
  /**
    * Use the chrome.pageAction API to put icons inside the address bar. Page actions represent actions that can be taken on the current page, but that aren't applicable to all pages.
    * Manifest:  "page_action": {...}
    * @since Chrome 5.
    */
  val pageAction: TypeofpageAction = js.native
  ////////////////////
  // Page Capture
  ////////////////////
  /**
    * Use the chrome.pageCapture API to save a tab as MHTML.
    * Permissions:  "pageCapture"
    * @since Chrome 18.
    */
  val pageCapture: TypeofpageCapture = js.native
  ////////////////////
  // Permissions
  ////////////////////
  /**
    * Use the chrome.permissions API to request declared optional permissions at run time rather than install time, so users understand why the permissions are needed and grant only those that are necessary.
    * @since Chrome 16.
    */
  val permissions: Typeofpermissions = js.native
  ////////////////////
  // Platform Keys
  ////////////////////
  /**
    * Use the chrome.platformKeys API to access client certificates managed by the platform. If the user or policy grants the permission, an extension can use such a certficate in its custom authentication protocol. E.g. this allows usage of platform managed certificates in third party VPNs (see chrome.vpnProvider).
    * Permissions:  "platformKeys"
    * Important: This API works only on Chrome OS.
    * @since Chrome 45.
    */
  val platformKeys: TypeofplatformKeysGetKeyPair = js.native
  ////////////////////
  // Power
  ////////////////////
  /**
    * Use the chrome.power API to override the system's power management features.
    * Permissions:  "power"
    * @since Chrome 27.
    */
  val power: Typeofpower = js.native
  ////////////////////
  // Printer Provider
  ////////////////////
  /**
    * The chrome.printerProvider API exposes events used by print manager to query printers controlled by extensions, to query their capabilities and to submit print jobs to these printers.
    * Permissions:  "printerProvider"
    * @since Chrome 44.
    */
  val printerProvider: TypeofprinterProvider = js.native
  ////////////////////
  // Privacy
  ////////////////////
  /**
    * Use the chrome.privacy API to control usage of the features in Chrome that can affect a user's privacy. This API relies on the ChromeSetting prototype of the type API for getting and setting Chrome's configuration.
    * Permissions:  "privacy"
    * The Chrome Privacy Whitepaper gives background detail regarding the features which this API can control.
    * @since Chrome 18.
    */
  val privacy: Typeofprivacy = js.native
  ////////////////////
  // Proxy
  ////////////////////
  /**
    * Use the chrome.proxy API to manage Chrome's proxy settings. This API relies on the ChromeSetting prototype of the type API for getting and setting the proxy configuration.
    * Permissions:  "proxy"
    * @since Chrome 13.
    */
  val proxy: Typeofproxy = js.native
  ////////////////////
  // Runtime
  ////////////////////
  /**
    * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app or extension lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
    * @since Chrome 22
    */
  val runtime: Typeofruntime = js.native
  ////////////////////
  // Script Badge
  ////////////////////
  val scriptBadge: TypeofscriptBadge = js.native
  ////////////////////
  // Serial
  ////////////////////
  /**
    * Use the <code>chrome.serial</code> API to read from and write to a device connected to a serial port.
    * Permissions:  "enterprise.serial"
    * Since: Chrome 29
    * Important: This API works only on Chrome OS.
    */
  val serial: Typeofserial = js.native
  ////////////////////
  // Sessions
  ////////////////////
  /**
    * Use the chrome.sessions API to query and restore tabs and windows from a browsing session.
    * Permissions:  "sessions"
    * @since Chrome 37.
    */
  val sessions: Typeofsessions = js.native
  ////////////////////
  // Socket
  ////////////////////
  val socket: Typeofsocket = js.native
  ////////////////////
  // Storage
  ////////////////////
  /**
    * Use the chrome.storage API to store, retrieve, and track changes to user data.
    * Permissions:  "storage"
    * @since Chrome 20.
    */
  val storage: Typeofstorage = js.native
  val system: Typeofsystem = js.native
  ////////////////////
  // TabCapture
  ////////////////////
  /**
    * Use the chrome.tabCapture API to interact with tab media streams.
    * Permissions:  "tabCapture"
    * @since Chrome 31.
    */
  val tabCapture: TypeoftabCapture = js.native
  ////////////////////
  // Tabs
  ////////////////////
  /**
    * Use the chrome.tabs API to interact with the browser's tab system. You can use this API to create, modify, and rearrange tabs in the browser.
    * Permissions: The majority of the chrome.tabs API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab.
    * @since Chrome 5.
    */
  val tabs: Typeoftabs = js.native
  ////////////////////
  // Top Sites
  ////////////////////
  /**
    * Use the chrome.topSites API to access the top sites that are displayed on the new tab page.
    * Permissions:  "topSites"
    * @since Chrome 19.
    */
  val topSites: TypeoftopSites = js.native
  ////////////////////
  // Text to Speech
  ////////////////////
  /**
    * Use the chrome.tts API to play synthesized text-to-speech (TTS). See also the related ttsEngine API, which allows an extension to implement a speech engine.
    * Permissions:  "tts"
    * @since Chrome 14.
    */
  val tts: Typeoftts = js.native
  ////////////////////
  // Text to Speech Engine
  ////////////////////
  /**
    * Use the chrome.ttsEngine API to implement a text-to-speech(TTS) engine using an extension. If your extension registers using this API, it will receive events containing an utterance to be spoken and other parameters when any extension or Chrome App uses the tts API to generate speech. Your extension can then use any available web technology to synthesize and output the speech, and send events back to the calling function to report the status.
    * Permissions:  "ttsEngine"
    * @since Chrome 14.
    */
  val ttsEngine: TypeofttsEngine = js.native
  ////////////////////
  // Types
  ////////////////////
  /**
    * The chrome.types API contains type declarations for Chrome.
    * @since Chrome 13.
    */
  val types: js.Any = js.native
  ////////////////////
  // VPN Provider
  ////////////////////
  /**
    * Use the chrome.vpnProvider API to implement a VPN client.
    * Permissions:  "vpnProvider"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  val vpnProvider: TypeofvpnProvider = js.native
  ////////////////////
  // Wallpaper
  ////////////////////
  /**
    * Use the chrome.wallpaper API to change the ChromeOS wallpaper.
    * Permissions:  "wallpaper"
    * Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  val wallpaper: Typeofwallpaper = js.native
  ////////////////////
  // Web Navigation
  ////////////////////
  /**
    * Use the chrome.webNavigation API to receive notifications about the status of navigation requests in-flight.
    * Permissions:  "webNavigation"
    * @since Chrome 16.
    */
  val webNavigation: TypeofwebNavigation = js.native
  ////////////////////
  // Web Request
  ////////////////////
  /**
    * Use the chrome.webRequest API to observe and analyze traffic and to intercept, block, or modify requests in-flight.
    * Permissions:  "webRequest", host permissions
    * @since Chrome 17.
    */
  val webRequest: TypeofwebRequest = js.native
  ////////////////////
  // Web Store
  ////////////////////
  /**
    * Use the chrome.webstore API to initiate app and extension installations "inline" from your site.
    * @since Chrome 15.
    */
  val webstore: Typeofwebstore = js.native
  ////////////////////
  // Windows
  ////////////////////
  /**
    * Use the chrome.windows API to interact with browser windows. You can use this API to create, modify, and rearrange windows in the browser.
    * Permissions: The chrome.windows API can be used without declaring any permission. However, the "tabs" permission is required in order to populate the url, title, and favIconUrl properties of Tab objects.
    * @since Chrome 5.
    */
  val windows: Typeofwindows = js.native
}

object Typeofchrome {
  @scala.inline
  def apply(
    _debugger: TypeofDebugger,
    accessibilityFeatures: TypeofaccessibilityFeatur,
    alarms: Typeofalarms,
    bookmarks: Typeofbookmarks,
    browser: Typeofbrowser,
    browserAction: TypeofbrowserAction,
    browsingData: TypeofbrowsingData,
    cast: Typeofcast,
    commands: Typeofcommands,
    contentSettings: TypeofcontentSettings,
    contextMenus: TypeofcontextMenus,
    cookies: Typeofcookies,
    declarativeContent: TypeofdeclarativeContent,
    declarativeWebRequest: TypeofdeclarativeWebReque,
    desktopCapture: TypeofdesktopCapture,
    devtools: Typeofdevtools,
    documentScan: TypeofdocumentScan,
    downloads: Typeofdownloads,
    enterprise: Typeofenterprise,
    events: js.Any,
    extension: Typeofextension,
    fileBrowserHandler: TypeoffileBrowserHandler,
    fileSystemProvider: TypeoffileSystemProvider,
    fontSettings: TypeoffontSettings,
    gcm: Typeofgcm,
    history: Typeofhistory,
    i18n: Typeofi18n,
    identity: Typeofidentity,
    idle: Typeofidle,
    input: Typeofinput,
    loginState: TypeofloginState,
    management: Typeofmanagement,
    networking: Typeofnetworking,
    notifications: Typeofnotifications,
    omnibox: Typeofomnibox,
    pageAction: TypeofpageAction,
    pageCapture: TypeofpageCapture,
    permissions: Typeofpermissions,
    platformKeys: TypeofplatformKeysGetKeyPair,
    power: Typeofpower,
    printerProvider: TypeofprinterProvider,
    privacy: Typeofprivacy,
    proxy: Typeofproxy,
    runtime: Typeofruntime,
    scriptBadge: TypeofscriptBadge,
    serial: Typeofserial,
    sessions: Typeofsessions,
    socket: Typeofsocket,
    storage: Typeofstorage,
    system: Typeofsystem,
    tabCapture: TypeoftabCapture,
    tabs: Typeoftabs,
    topSites: TypeoftopSites,
    tts: Typeoftts,
    ttsEngine: TypeofttsEngine,
    types: js.Any,
    vpnProvider: TypeofvpnProvider,
    wallpaper: Typeofwallpaper,
    webNavigation: TypeofwebNavigation,
    webRequest: TypeofwebRequest,
    webstore: Typeofwebstore,
    windows: Typeofwindows
  ): Typeofchrome = {
    val __obj = js.Dynamic.literal(_debugger = _debugger.asInstanceOf[js.Any], accessibilityFeatures = accessibilityFeatures.asInstanceOf[js.Any], alarms = alarms.asInstanceOf[js.Any], bookmarks = bookmarks.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], browserAction = browserAction.asInstanceOf[js.Any], browsingData = browsingData.asInstanceOf[js.Any], cast = cast.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], contentSettings = contentSettings.asInstanceOf[js.Any], contextMenus = contextMenus.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], declarativeContent = declarativeContent.asInstanceOf[js.Any], declarativeWebRequest = declarativeWebRequest.asInstanceOf[js.Any], desktopCapture = desktopCapture.asInstanceOf[js.Any], devtools = devtools.asInstanceOf[js.Any], documentScan = documentScan.asInstanceOf[js.Any], downloads = downloads.asInstanceOf[js.Any], enterprise = enterprise.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], fileBrowserHandler = fileBrowserHandler.asInstanceOf[js.Any], fileSystemProvider = fileSystemProvider.asInstanceOf[js.Any], fontSettings = fontSettings.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], loginState = loginState.asInstanceOf[js.Any], management = management.asInstanceOf[js.Any], networking = networking.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], omnibox = omnibox.asInstanceOf[js.Any], pageAction = pageAction.asInstanceOf[js.Any], pageCapture = pageCapture.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], platformKeys = platformKeys.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], printerProvider = printerProvider.asInstanceOf[js.Any], privacy = privacy.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], scriptBadge = scriptBadge.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], tabCapture = tabCapture.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], topSites = topSites.asInstanceOf[js.Any], tts = tts.asInstanceOf[js.Any], ttsEngine = ttsEngine.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], vpnProvider = vpnProvider.asInstanceOf[js.Any], wallpaper = wallpaper.asInstanceOf[js.Any], webNavigation = webNavigation.asInstanceOf[js.Any], webRequest = webRequest.asInstanceOf[js.Any], webstore = webstore.asInstanceOf[js.Any], windows = windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofchrome]
  }
  @scala.inline
  implicit class TypeofchromeOps[Self <: Typeofchrome] (val x: Self) extends AnyVal {
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
    def set_debugger(value: TypeofDebugger): Self = this.set("_debugger", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilityFeatures(value: TypeofaccessibilityFeatur): Self = this.set("accessibilityFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlarms(value: Typeofalarms): Self = this.set("alarms", value.asInstanceOf[js.Any])
    @scala.inline
    def setBookmarks(value: Typeofbookmarks): Self = this.set("bookmarks", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowser(value: Typeofbrowser): Self = this.set("browser", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowserAction(value: TypeofbrowserAction): Self = this.set("browserAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrowsingData(value: TypeofbrowsingData): Self = this.set("browsingData", value.asInstanceOf[js.Any])
    @scala.inline
    def setCast(value: Typeofcast): Self = this.set("cast", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommands(value: Typeofcommands): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentSettings(value: TypeofcontentSettings): Self = this.set("contentSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setContextMenus(value: TypeofcontextMenus): Self = this.set("contextMenus", value.asInstanceOf[js.Any])
    @scala.inline
    def setCookies(value: Typeofcookies): Self = this.set("cookies", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclarativeContent(value: TypeofdeclarativeContent): Self = this.set("declarativeContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclarativeWebRequest(value: TypeofdeclarativeWebReque): Self = this.set("declarativeWebRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesktopCapture(value: TypeofdesktopCapture): Self = this.set("desktopCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setDevtools(value: Typeofdevtools): Self = this.set("devtools", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentScan(value: TypeofdocumentScan): Self = this.set("documentScan", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloads(value: Typeofdownloads): Self = this.set("downloads", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnterprise(value: Typeofenterprise): Self = this.set("enterprise", value.asInstanceOf[js.Any])
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtension(value: Typeofextension): Self = this.set("extension", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileBrowserHandler(value: TypeoffileBrowserHandler): Self = this.set("fileBrowserHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSystemProvider(value: TypeoffileSystemProvider): Self = this.set("fileSystemProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSettings(value: TypeoffontSettings): Self = this.set("fontSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def setGcm(value: Typeofgcm): Self = this.set("gcm", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistory(value: Typeofhistory): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setI18n(value: Typeofi18n): Self = this.set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentity(value: Typeofidentity): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdle(value: Typeofidle): Self = this.set("idle", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: Typeofinput): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoginState(value: TypeofloginState): Self = this.set("loginState", value.asInstanceOf[js.Any])
    @scala.inline
    def setManagement(value: Typeofmanagement): Self = this.set("management", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworking(value: Typeofnetworking): Self = this.set("networking", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotifications(value: Typeofnotifications): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def setOmnibox(value: Typeofomnibox): Self = this.set("omnibox", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageAction(value: TypeofpageAction): Self = this.set("pageAction", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageCapture(value: TypeofpageCapture): Self = this.set("pageCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: Typeofpermissions): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlatformKeys(value: TypeofplatformKeysGetKeyPair): Self = this.set("platformKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setPower(value: Typeofpower): Self = this.set("power", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrinterProvider(value: TypeofprinterProvider): Self = this.set("printerProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivacy(value: Typeofprivacy): Self = this.set("privacy", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxy(value: Typeofproxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(value: Typeofruntime): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setScriptBadge(value: TypeofscriptBadge): Self = this.set("scriptBadge", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerial(value: Typeofserial): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessions(value: Typeofsessions): Self = this.set("sessions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocket(value: Typeofsocket): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorage(value: Typeofstorage): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def setSystem(value: Typeofsystem): Self = this.set("system", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabCapture(value: TypeoftabCapture): Self = this.set("tabCapture", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabs(value: Typeoftabs): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopSites(value: TypeoftopSites): Self = this.set("topSites", value.asInstanceOf[js.Any])
    @scala.inline
    def setTts(value: Typeoftts): Self = this.set("tts", value.asInstanceOf[js.Any])
    @scala.inline
    def setTtsEngine(value: TypeofttsEngine): Self = this.set("ttsEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypes(value: js.Any): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpnProvider(value: TypeofvpnProvider): Self = this.set("vpnProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setWallpaper(value: Typeofwallpaper): Self = this.set("wallpaper", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebNavigation(value: TypeofwebNavigation): Self = this.set("webNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebRequest(value: TypeofwebRequest): Self = this.set("webRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebstore(value: Typeofwebstore): Self = this.set("webstore", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindows(value: Typeofwindows): Self = this.set("windows", value.asInstanceOf[js.Any])
  }
  
}

