package typings.chromeApps.anon

import typings.chromeApps.chrome.deprecated
import typings.chromeApps.chrome.deprecatedButUsable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofchrome extends StObject {
  
  // #endregion
  // #region classes
  /////////////
  // CLASSES //
  /////////////
  /**
    * New Chrome Event
    */
  val Event: Instantiable
  
  // | 'double';
  // #endregion internal
  // #region chrome.accessibilityFeatures
  ////////////////////////////
  // Accessibility Features //
  ////////////////////////////
  /**
    * @requires Important: This API works only on Chrome OS.
    * @requires Permissions:
    *      'accessibilityFeatures.read' (For read access)
    *      'accessibilityFeatures.modify' (For modifications)
    *      Note that accessibilityFeatures.modify does not imply accessibilityFeatures.read permission.
    * @since Chrome 37.
    * @description
    * Use the chrome.accessibilityFeatures API to manage Chrome's accessibility features.
    * This API relies on the ChromeSetting prototype of the type API for getting and setting individual accessibility features.
    * In order to get feature states the extension must request accessibilityFeatures.read permission.
    * For modifying feature state, the extension needs accessibilityFeatures.modify permission.
    * Note that accessibilityFeatures.modify does not imply accessibilityFeatures.read permission.
    */
  val accessibilityFeatures: TypeofaccessibilityFeatur
  
  // #endregion
  // #region chrome.alarms
  ////////////
  // Alarms //
  ////////////
  /**
    * @requires Permissions: 'alarms'
    * @since Chrome 22.
    * @description
    * Use the chrome.alarms API to schedule code to run
    * periodically or at a specified time in the future.
    */
  val alarms: Typeofalarms
  
  ////////////////
  // App Window //
  ////////////////
  /**
    * @since Chrome 24.
    * @description
    * Use the chrome.app.window API to create windows.
    * Windows have an optional frame with title bar and size controls.
    * They are not associated with any Chrome browser windows.
    * See the Window State Sample for a demonstration of these options.
    */
  val app: Typeofapp
  
  // #endregion chrome.app.*
  // #region chrome.audio
  ///////////
  // Audio //
  ///////////
  /**
    * @since Chrome 59.
    * @requires Permissions: 'audio'
    * @description
    * The chrome.audio API is provided to allow users to get information
    * about and control the audio devices attached to the system.
    * This API is currently only available in kiosk mode for ChromeOS.
    */
  val audio: Typeofaudio
  
  // #endregion
  // #region chrome.bluetooth*
  ///////////////
  // Bluetooth //
  ///////////////
  /**
    * @since Chrome 37
    * @requires Manifest: 'bluetooth': {...}
    * @description
    * Use the chrome.bluetooth API to connect to a Bluetooth device.
    * All functions report failures via chrome.runtime.lastError.
    * **Important: This API works only on OS X, Windows and Chrome OS.**
    */
  val bluetooth: Typeofbluetooth
  
  /**
    * @since Chrome 37
    * @requires Manifest: 'bluetooth': {...}
    * @requires Important: This API works only on Chrome OS.
    * @requires Note: With Chrome 56, users can select nearby Bluetooth Low Energy devices to provide to web sites that use the Web Bluetooth API.
    * @description
    * The chrome.bluetoothLowEnergy API is used to communicate
    * with Bluetooth Smart (Low Energy) devices using the
    * Generic Attribute Profile (GATT).
    */
  val bluetoothLowEnergy: TypeofbluetoothLowEnergy
  
  /**
    * @since Chrome 37
    * @requires Manifest: 'bluetooth': {...}
    * @requires Important: This API works only on OS X, Windows and Chrome OS.
    * Use the chrome.bluetoothSocket API to send and receive data to Bluetooth devices using RFCOMM and L2CAP connections.
    */
  val bluetoothSocket: TypeofbluetoothSocket
  
  // #endregion
  // #region chrome.browser
  /////////////
  // Browser //
  /////////////
  /**
    * @since Chrome 42.
    * @requires Permissions: 'browser'
    * @description
    * Use the chrome.browser API to interact with the Chrome browser associated with
    * the current application and Chrome profile.
    */
  val browser: Typeofbrowser
  
  // #endregion
  // #region chrome.certificateProvider
  //////////////////////////
  // Certificate Provider //
  //////////////////////////
  /**
    * @requires(CrOS) Chrome OS only.
    * @requires Permissions: 'certificateProvider'
    * @description
    * Use this API to expose certificates to the platform which
    * can use these certificates for TLS authentications.
    */
  val certificateProvider: TypeofcertificateProvider
  
  // #endregion
  // #region chrome.clipboard
  ///////////////
  // Clipboard //
  ///////////////
  /**
    * @requires(dev) **Dev** channel only.
    * @requires Permissions: 'clipboard'
    * @description
    * *This API is* **experimental**. *It is* **only** *available to Chrome users on the* **dev** *channel.*
    * The chrome.clipboard API is provided to allow users to access data of the clipboard.
    * This is a temporary solution for chromeos platform apps until open-web alternative is available.
    * It will be deprecated once open-web solution is available.
    * @see[Docs]{@link https://developer.chrome.com/apps/clipboard}
    */
  val clipboard: Typeofclipboard
  
  // #endregion
  // #region chrome.commands
  //////////////
  // Commands //
  //////////////
  /**
    * @since Chrome 35.
    * @requires Manifest:  'commands': {...}
    * @description
    * Use the commands API to add keyboard shortcuts that
    * trigger actions in your app, for example, an
    * action to open the browser action or send a command
    * to the app.
    * @see[Usage]{@link https://developer.chrome.com/apps/commands}
    */
  val commands: Typeofcommands
  
  // #endregion
  // #region chrome.contextMenus
  ///////////////////
  // Context Menus //
  ///////////////////
  /**
    * @since Chrome 24.
    * @requires Permissions: 'contextMenus'
    * @description
    * Use the chrome.contextMenus API to add items to Google Chrome's context menu.
    * You can choose what types of objects your context menu additions apply to,
    * such as images, hyperlinks, and pages.
    *
    * Context menu items can appear in any document (or frame within a document),
    * even those with file:// or chrome:// URLs. To control which documents your
    * items can appear in, specify the documentUrlPatterns field when you call the
    * create() or update() method.
    *
    * You can create as many context menu items as you need,
    * but if more than one from your app is visible at once,
    * Google Chrome automatically collapses them into a single parent menu.
    */
  val contextMenus: TypeofcontextMenus
  
  // #endregion
  // #region methods
  /////////////
  // METHODS //
  /////////////
  /**
    * Different page speed and load metrics
    */
  def csi(): OnloadT
  
  // #endregion
  // #region chrome.desktopCapture
  /////////////////////
  // Desktop Capture //
  /////////////////////
  /**
    * Desktop Capture API that can be used to capture content of screen or individual windows.
    * @since Chrome 34.
    * @requires Permissions: 'desktopCapture'
    */
  val desktopCapture: TypeofdesktopCapture
  
  // #endregion
  // #region chrome.diagnostics
  /////////////////
  // Diagnostics //
  /////////////////
  /**
    * @requires(CrOS) Only Chrome OS. Crashes app on Windows.
    * @requires Permissions: 'diagnostics'
    */
  val diagnostics: Typeofdiagnostics
  
  // #endregion
  // #region chrome.displaySource
  ////////////////////
  // Display Source //
  ////////////////////
  /**
    * @requires(dev) Development versions only
    * @requires Permissions: 'displaySource'
    * The *chrome.displaySource* API creates a Display session using WebMediaStreamTrack as sources.
    * @todo TODO Finish documentation and typings
    */
  val displaySource: TypeofdisplaySource
  
  // #endregion
  // #region chrome.dns
  /////////
  // DNS //
  /////////
  /**
    * @requires(CrOS) Only Chrome OS. Crashes app on Windows.
    * @requires Permissions: 'diagnostics'
    * @description
    * Use the *chrome.dns* API for dns resolution.
    */
  val dns: Typeofdns
  
  // #endregion
  // #region chrome.documentScan
  ///////////////////
  // Document Scan //
  ///////////////////
  /**
    * Use the chrome.documentScan API to discover and retrieve
    * images from attached paper document scanners.
    *
    * The Document Scan API is designed to allow apps to view
    * the content of paper documents on an attached document scanner.
    *
    * *Note: This API depends on OS features that may not be available*
    * *depending on the underlying operating system. As of this writing only*
    * *Chrome OS for certain USB-attached devices is known to successfully work.*
    *
    * @since Chrome 44.
    * @requires Permissions: 'documentScan'
    * @requires Important: This API works only on Chrome OS.
    */
  val documentScan: TypeofdocumentScan
  
  val enterprise: Typeofenterprise
  
  // #endregion chrome.enterprise.*
  // #region chrome.events
  ////////////
  // Events //
  ////////////
  /**
    * The chrome.events namespace contains common types used by APIs
    * dispatching events to notify you when something interesting happens.
    *
    * An Event is an object that allows you to be notified when something interesting happens.
    * Here's an example of using the chrome.alarms.onAlarm event to be notified whenever an alarm has elapsed:
    * @example
    * chrome.alarms.onAlarm.addListener(function(alarm) {
    *   appendToLog('alarms.onAlarm --'
    *               + ' name: '          + alarm.name
    *               + ' scheduledTime: ' + alarm.scheduledTime);
    * });
    * @description
    * As the example shows, you register for notification using addListener().
    * The argument to addListener() is always a function that you define to
    * handle the event, but the parameters to the function depend on which
    * event you're handling. Checking the documentation for alarms.onAlarm,
    * you can see that the function has a single parameter: an alarms.Alarm
    * object that has details about the elapsed alarm.
    * @since Chrome 25.
    */
  val events: Any
  
  // #endregion
  // #region placeholders
  //////////////////
  // PLACEHOLDERS //
  //////////////////
  /**
    * Chrome experimental apis may be using this namespace.
    * Please consult the official documentation.
    * @see[Documentation]{@link https://developer.chrome.com/apps/experimental}
    */
  val experimental: Any
  
  // #endregion
  // #region chrome.extensionTypes
  /////////////////////
  // Extension Types //
  /////////////////////
  /**
    * Primary for extensions, but also used in apps.
    * https://developer.chrome.com/extensions/extensionTypes#type-ImageDetails
    * @since Chrome 39.
    **/
  val extensionTypes: TypeofextensionTypes
  
  // #endregion
  // #region chrome.fileBrowserHandle
  /////////////////////////
  // File Browser Handle //
  /////////////////////////
  /**
    * @requires(CrOS) Chrome OS Only
    * @requires Permissions: 'fileBrowserHandler'
    * @requires Manifest: 'file_browser_handlers'
    * @description
    * Use the chrome.fileBrowserHandler API to extend the Chrome OS file browser.
    * For example, you can use this API to enable users to upload files to your website.
    * @see[Documentation]{@link https://developer.chrome.com/extensions/fileBrowserHandler}
    */
  val fileBrowserHandler: TypeoffileBrowserHandler
  
  // #endregion
  // #region chrome.fileSystem
  ////////////////
  // FileSystem //
  ////////////////
  /**
    * Use the chrome.fileSystem API to create, read, navigate, and write to the user's local file system.
    * With this API, Chrome Apps can read and write to a user-selected location.
    * For example, a text editor app can use the API to read and write local documents.
    * All failures are notified via chrome.runtime.lastError.
    * @since Chrome 24.
    * @requires Permissions:
    *   'fileSystem'
    *   {'fileSystem': ['write']}
    *   {'fileSystem': ['write', 'retainEntries', 'directory']}
    */
  val fileSystem: TypeoffileSystem
  
  // #endregion
  // #region chrome.fileSystemProvider
  //////////////////////////
  // File System Provider //
  //////////////////////////
  /**
    * Use the chrome.fileSystemProvider API to create file systems,
    * that can be accessible from the file manager on Chrome OS.
    * @since Chrome 40.
    * @requires Permissions: 'fileSystemProvider'
    * @requires(CrOS) This API works only on Chrome OS.
    * @requires Manifest:
    * Requires an section in addition to the permission.
    * The file_system_provider section must be declared as follows:
    * **configurable (boolean)** - optional
    * Whether configuring via onConfigureRequested is supported. By default: false.
    * **multiple_mounts (boolean)** - optional
    * Whether multiple (more than one) mounted file systems are supported. By default: false.
    * **watchable (boolean)** - optional
    * Whether setting watchers and notifying about changes is supported. By default: false.
    * **source (type of 'file', 'device', or 'network') - required**
    * Source of data for mounted file systems.
    * @description
    * Files app uses above information in order to render related UI elements approprietly.
    * For example, if configurable is set to true, then a menu item for configuring volumes
    * will be rendered. Similarly, if multiple_mounts is set to true, then Files app will
    * allow to add more than one mount points from the UI. If watchable is false, then a
    * refresh button will be rendered. Note, that if possible you should add support for
    * watchers, so changes on the file system can be reflected immediately and automatically.
    * @see[More information]{@link https://developer.chrome.com/apps/fileSystemProvider}
    */
  val fileSystemProvider: TypeoffileSystemProvider
  
  // #endregion
  // #region chrome.gcm
  ////////////////////////////
  // Google Cloud Messaging //
  ////////////////////////////
  /**
    * Use chrome.gcm to enable apps to send and receive
    * messages through the Google Cloud Messaging Service.
    * @deprecated
    * As of April 10, 2018, Google has deprecated GCM.
    * The GCM server and client APIs are deprecated and will be removed as soon as April 11, 2019.
    * Migrate GCM apps to Firebase Cloud Messaging (FCM),
    * which inherits the reliable and scalable GCM infrastructure,
    * plus many new features. See the migration guide to learn more.
    * @see[Migration guide]{@link https://developers.google.com/cloud-messaging/android/android-migrate-fcm}
    * @see[GCM Imlementation guide]{@link https://developers.google.com/cloud-messaging/chrome/client}
    * @since Chrome 35.
    * @requires Permissions: 'gcm'
    */
  val gcm: Typeofgcm
  
  // #endregion
  // #region chrome.hid
  /////////
  // HID //
  /////////
  /**
    * Use the chrome.hid API to interact with connected HID devices.
    * This API provides access to HID operations from within the context of an app.
    * Using this API, apps can function as drivers for hardware devices.
    * Errors generated by this API are reported by setting runtime.lastError
    * and executing the function's regular callback. The callback's regular
    * parameters will be undefined in this case.
    *
    * @requires Permissions: 'hid'
    * @since Chrome 38.
    */
  val hid: Typeofhid
  
  // #endregion
  // #region chrome.i18n
  /////////////////////////////////
  // i18n - Internationalization //
  /////////////////////////////////
  /**
    * Use the chrome.i18n infrastructure to implement internationalization across your whole app.
    * Content scripts: Fully supported.
    * @see[Docs]{@link https://developer.chrome.com/apps/i18n}
    * @since Chrome 25.
    */
  val i18n: Typeofi18n
  
  // #endregion
  // #region chrome.identity
  //////////////
  // Identity //
  //////////////
  /**
    * Use the chrome.identity API to get OAuth2 access tokens.
    * @requires Permissions: 'identity'
    * @see[Identity User]{@link https://developer.chrome.com/apps/app_identity}
    * @since Chrome 29.
    */
  val identity: Typeofidentity
  
  // #endregion
  // #region chrome.idle
  //////////
  // Idle //
  //////////
  /**
    * Use the chrome.idle API to detect when the machine's idle state changes.
    * @requires Permissions: 'idle'
    * @since Chrome 25.
    */
  val idle: Typeofidle
  
  // #endregion
  // #region chrome.instanceID
  ////////////////
  // InstanceID //
  ////////////////
  /**
    * Use chrome.instanceID to access the Instance ID service.
    * @requires Permissions: 'gcm'
    * @since Chrome 46
    */
  val instanceID: TypeofinstanceID
  
  /**
    * @deprecated Deprecated in Chrome 64.
    * chrome.loadTimes() is a non-standard API that exposes loading metrics
    * and network information to developers in order to help them better
    * understand their site's performance in the real world.
    * @see[Use this instead]{@link https://www.w3.org/TR/navigation-timing-2/}
    * @see[Deprecation article]{@link https://developers.google.com/web/updates/2017/12/chrome-loadtimes-deprecated}
    */
  def loadTimes(): deprecatedButUsable
  
  // #endregion
  // #region chrome.management
  ////////////////
  // Management //
  ////////////////
  /**
    * The chrome.management API provides ways to
    * manage the list of apps
    * that are installed and running.
    */
  val management: Typeofmanagement
  
  // #endregion
  // #region chrome.mdns
  //////////
  // mDNS //
  //////////
  /**
    * Use the chrome.mdns API to discover services over mDNS.
    * This comprises a subset of the features of the NSD spec:
    * @see[NSD Spec]{@link http://www.w3.org/TR/discovery-api/}
    * @requires Permissions: 'mdns'
    * @since Chrome 31
    */
  val mdns: Typeofmdns
  
  // #endregion
  // #region chrome.mediaGalleries
  /////////////////////
  // Media Galleries //
  /////////////////////
  /**
    * Use the chrome.mediaGalleries API to access media files (audio, images, video)
    * from the user's local disks (with the user's consent).
    * @since Chrome 24.
    * @requires Permissions: {'mediaGalleries': ['accessType1' | 'accessType2', ...]}
    *                        {'mediaGalleries': ['accessType1' | 'accessType2', ..., 'allAutoDetected']}
    * @see[More information]{@link https://developer.chrome.com/apps/mediaGalleries}
    */
  val mediaGalleries: TypeofmediaGalleries
  
  val networking: Typeofnetworking
  
  // #endregion chrome.networking.*
  // #region chrome.notifications
  ///////////////////
  // Notifications //
  ///////////////////
  /**
    * Use the chrome.notifications API to create rich notifications using
    * templates and show these notifications to users in the system tray.
    * @requires Permissions: 'notifications'
    * @since Chrome 28.
    * @see[Docs]{@link https://developer.chrome.com/extensions/notifications}
    */
  val notifications: Typeofnotifications
  
  // #endregion
  // #region chrome.permissions
  /////////////////
  // Permissions //
  /////////////////
  /**
    * Use the chrome.permissions API to request declared optional permissions at run time rather than install time,
    * so users understand why the permissions are needed and grant only those that are necessary.
    * @since Chrome 16.
    */
  val permissions: Typeofpermissions
  
  // #endregion
  // #region chrome.platformKeys
  ///////////////////
  // Platform Keys //
  ///////////////////
  /**
    * @requires(CrOS) Only for Chrome OS.
    * @requires Permissions: 'platformKeys'
    * @description
    * Use the *chrome.platformKeys* API to access client certificates
    * managed by the platform. If the user or policy grants the permission, an
    * app can use such a certficate in its custom authentication protocol.
    * E.g. this allows usage of platform managed certificates in third party VPNs
    * @see chrome.vpnProvider
    */
  val platformKeys: TypeofplatformKeysClientCertificateType
  
  // #endregion
  // #region chrome.power
  ///////////
  // Power //
  ///////////
  /**
    * Use the chrome.power API to override the system's power management features.
    * @requires Permissions: 'power'
    * @since Chrome 27.
    */
  val power: Typeofpower
  
  // #endregion
  // #region chrome.printerProvider
  //////////////////////
  // Printer Provider //
  //////////////////////
  /**
    * The chrome.printerProvider API exposes events used by print manager
    * to query printers controlled by extensions, to query their
    * capabilities and to submit print jobs to these printers.
    *
    * @requires Permissions: 'printerProvider'
    * @since Chrome 44.
    */
  val printerProvider: TypeofprinterProvider
  
  // #endregion
  // #region chrome.runtime
  /////////////
  // Runtime //
  /////////////
  /**
    * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
    * @since Chrome 22
    */
  val runtime: TypeofruntimeConnect
  
  // #endregion
  // #region chrome.serial
  ////////////
  // Serial //
  ////////////
  /**
    * Use the chrome.socket API to send and receive data over the network using TCP and UDP connections.
    * @deprecated Note: Starting with Chrome 33,
    *  this API is deprecated in favor of the
    *  sockets.udp, sockets.tcp and sockets.tcpServer APIs.
    * @since Chrome 23
    */
  val serial: deprecated
  
  // #endregion
  // #region chrome.signedInDevices
  //////////////////////
  // SignedIn Devices //
  //////////////////////
  /**
    * @requires(dev) Requires Chrome *dev*
    * Use the *chrome.signedInDevices* API to get a list of devices
    * signed into chrome with the same account as the current profile.
    */
  val signedInDevices: TypeofsignedInDevices
  
  // #endregion
  // #region chrome.socket
  ////////////
  // Socket //
  ////////////
  /*
    * @deprecated Since Chrome 33
    * @description
    * Use the chrome.socket API to send and receive data over the network using TCP and UDP connections.
    * Note: Starting with Chrome 33, this API is deprecated in favor of the sockets.udp, sockets.tcp
    * and sockets.tcpServer APIs.
    */
  // const socket: chrome.deprecatedButUsable; // Removed to not be confused with chrome.sockets.*
  // #endregion
  // #region chrome.sockets.*
  ////////////////////
  // Chrome Sockets //
  ////////////////////
  /**
    * Use the chrome.sockets.* APIs to send and receive data over the network using TCP and UDP connections.
    * @since Chrome 33.
    */
  val sockets: Typeofsockets
  
  // #endregion chrome.sockets.*
  // #region chrome.storage
  /////////////
  // Storage //
  /////////////
  /**
    * Use the chrome.storage API to store, retrieve, and track changes to user data.
    * Permissions:  'storage'
    * @since Chrome 20.
    */
  val storage: Typeofstorage
  
  // #endregion
  // #region chrome.syncFileSystem
  ////////////////////
  // SyncFileSystem //
  ////////////////////
  /**
    * Use the chrome.syncFileSystem API to save and synchronize data on Google Drive.
    * This API is NOT for accessing arbitrary user docs stored in Google Drive.
    * It provides app-specific syncable storage for offline and caching usage so that
    * the same data can be available across different clients. Read Manage Data for
    * more on using this API.
    *
    * @requires[Permissions: 'syncFileSystem']
    * @see[Learn more: Manage Data]{@link https://developer.chrome.com/apps/app_storage}
    * @since Chrome 27
    */
  val syncFileSystem: TypeofsyncFileSystem
  
  val system: Typeofsystem
  
  // #endregion chrome.system.*
  // #region chrome.tts
  ////////////////////
  // Text to Speech //
  ////////////////////
  /**
    * Use the chrome.tts API to play synthesized text-to-speech (TTS). See also the related ttsEngine API, which allows an extension to implement a speech engine.
    * Permissions:  'tts'
    * @since Chrome 14.
    */
  val tts: Typeoftts
  
  // #endregion
  // #region chrome.types
  ///////////
  // Types //
  ///////////
  /**
    * The chrome.types API contains type declarations for Chrome.
    */
  val types: Any
  
  // #endregion
  // #region chrome.usb
  /////////
  // USB //
  /////////
  /**
    * @requires Permissions: 'usb'
    * @since Chrome 26.
    * Use the chrome.usb API to interact with connected USB devices.
    * This API provides access to USB operations from within the context of an app.
    * Using this API, apps can function as drivers for hardware devices.
    * Errors generated by this API are reported by setting runtime.lastError
    * and executing the function's regular callback. The callback's
    * regular parameters will be undefined in this case.
    * @see[Accessing Hardware Devices]{@link https://developer.chrome.com/apps/app_usb}
    */
  val usb: Typeofusb
  
  // #endregion
  // #region chrome.virtualKeyboard
  //////////////////////
  // Virtual Keyboard //
  //////////////////////
  /**
    * @requires(CrOS Kiosk) Important: This API works only in Chrome OS apps.
    * @requires Permissions: 'virtualKeyboard'
    * @since Chrome 58
    * @description
    * The *chrome.virtualKeybaord* API is a kiosk only API used
    * to configure virtual keyboard layout and behavior in kiosk sessions.
    */
  val virtualKeyboard: TypeofvirtualKeyboard
  
  // #endregion
  // #region chrome.vpnProvider
  //////////////////
  // VPN Provider //
  //////////////////
  /**
    * Use the chrome.vpnProvider API to implement a VPN client.
    * @requires(CrOS) Important: This API works only on Chrome OS.
    * @requires Permissions: 'vpnProvider'
    * @since Chrome 43.
    */
  val vpnProvider: TypeofvpnProvider
  
  // #endregion
  // #region chrome.wallpaper
  ///////////////
  // Wallpaper //
  ///////////////
  /**
    * Use the chrome.wallpaper API to change the ChromeOS wallpaper.
    * @requires Permissions: 'wallpaper'
    * @requires Important: This API works only on Chrome OS.
    * @since Chrome 43.
    */
  val wallpaper: Typeofwallpaper
  
  // #endregion
  // #region chrome.webRequest
  val webRequest: Any
  
  // #endregion
  // #region chrome.webViewRequest
  /////////////////////
  // WebView Request //
  /////////////////////
  /**
    * @requires Permissions: 'webview'
    * @description
    * Use the *chrome.webViewRequest* API to intercept, block, or modify requests in-flight.
    */
  val webViewRequest: TypeofwebViewRequest
}
object Typeofchrome {
  
  inline def apply(
    Event: Instantiable,
    accessibilityFeatures: TypeofaccessibilityFeatur,
    alarms: Typeofalarms,
    app: Typeofapp,
    audio: Typeofaudio,
    bluetooth: Typeofbluetooth,
    bluetoothLowEnergy: TypeofbluetoothLowEnergy,
    bluetoothSocket: TypeofbluetoothSocket,
    browser: Typeofbrowser,
    certificateProvider: TypeofcertificateProvider,
    clipboard: Typeofclipboard,
    commands: Typeofcommands,
    contextMenus: TypeofcontextMenus,
    csi: () => OnloadT,
    desktopCapture: TypeofdesktopCapture,
    diagnostics: Typeofdiagnostics,
    displaySource: TypeofdisplaySource,
    dns: Typeofdns,
    documentScan: TypeofdocumentScan,
    enterprise: Typeofenterprise,
    events: Any,
    experimental: Any,
    extensionTypes: TypeofextensionTypes,
    fileBrowserHandler: TypeoffileBrowserHandler,
    fileSystem: TypeoffileSystem,
    fileSystemProvider: TypeoffileSystemProvider,
    gcm: Typeofgcm,
    hid: Typeofhid,
    i18n: Typeofi18n,
    identity: Typeofidentity,
    idle: Typeofidle,
    instanceID: TypeofinstanceID,
    loadTimes: () => deprecatedButUsable,
    management: Typeofmanagement,
    mdns: Typeofmdns,
    mediaGalleries: TypeofmediaGalleries,
    networking: Typeofnetworking,
    notifications: Typeofnotifications,
    permissions: Typeofpermissions,
    platformKeys: TypeofplatformKeysClientCertificateType,
    power: Typeofpower,
    printerProvider: TypeofprinterProvider,
    runtime: TypeofruntimeConnect,
    serial: deprecated,
    signedInDevices: TypeofsignedInDevices,
    sockets: Typeofsockets,
    storage: Typeofstorage,
    syncFileSystem: TypeofsyncFileSystem,
    system: Typeofsystem,
    tts: Typeoftts,
    types: Any,
    usb: Typeofusb,
    virtualKeyboard: TypeofvirtualKeyboard,
    vpnProvider: TypeofvpnProvider,
    wallpaper: Typeofwallpaper,
    webRequest: Any,
    webViewRequest: TypeofwebViewRequest
  ): Typeofchrome = {
    val __obj = js.Dynamic.literal(Event = Event.asInstanceOf[js.Any], accessibilityFeatures = accessibilityFeatures.asInstanceOf[js.Any], alarms = alarms.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], bluetooth = bluetooth.asInstanceOf[js.Any], bluetoothLowEnergy = bluetoothLowEnergy.asInstanceOf[js.Any], bluetoothSocket = bluetoothSocket.asInstanceOf[js.Any], browser = browser.asInstanceOf[js.Any], certificateProvider = certificateProvider.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any], contextMenus = contextMenus.asInstanceOf[js.Any], csi = js.Any.fromFunction0(csi), desktopCapture = desktopCapture.asInstanceOf[js.Any], diagnostics = diagnostics.asInstanceOf[js.Any], displaySource = displaySource.asInstanceOf[js.Any], dns = dns.asInstanceOf[js.Any], documentScan = documentScan.asInstanceOf[js.Any], enterprise = enterprise.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], experimental = experimental.asInstanceOf[js.Any], extensionTypes = extensionTypes.asInstanceOf[js.Any], fileBrowserHandler = fileBrowserHandler.asInstanceOf[js.Any], fileSystem = fileSystem.asInstanceOf[js.Any], fileSystemProvider = fileSystemProvider.asInstanceOf[js.Any], gcm = gcm.asInstanceOf[js.Any], hid = hid.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], instanceID = instanceID.asInstanceOf[js.Any], loadTimes = js.Any.fromFunction0(loadTimes), management = management.asInstanceOf[js.Any], mdns = mdns.asInstanceOf[js.Any], mediaGalleries = mediaGalleries.asInstanceOf[js.Any], networking = networking.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], platformKeys = platformKeys.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any], printerProvider = printerProvider.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], serial = serial.asInstanceOf[js.Any], signedInDevices = signedInDevices.asInstanceOf[js.Any], sockets = sockets.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], syncFileSystem = syncFileSystem.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], tts = tts.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], usb = usb.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any], vpnProvider = vpnProvider.asInstanceOf[js.Any], wallpaper = wallpaper.asInstanceOf[js.Any], webRequest = webRequest.asInstanceOf[js.Any], webViewRequest = webViewRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofchrome]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeofchrome] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityFeatures(value: TypeofaccessibilityFeatur): Self = StObject.set(x, "accessibilityFeatures", value.asInstanceOf[js.Any])
    
    inline def setAlarms(value: Typeofalarms): Self = StObject.set(x, "alarms", value.asInstanceOf[js.Any])
    
    inline def setApp(value: Typeofapp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAudio(value: Typeofaudio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setBluetooth(value: Typeofbluetooth): Self = StObject.set(x, "bluetooth", value.asInstanceOf[js.Any])
    
    inline def setBluetoothLowEnergy(value: TypeofbluetoothLowEnergy): Self = StObject.set(x, "bluetoothLowEnergy", value.asInstanceOf[js.Any])
    
    inline def setBluetoothSocket(value: TypeofbluetoothSocket): Self = StObject.set(x, "bluetoothSocket", value.asInstanceOf[js.Any])
    
    inline def setBrowser(value: Typeofbrowser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
    
    inline def setCertificateProvider(value: TypeofcertificateProvider): Self = StObject.set(x, "certificateProvider", value.asInstanceOf[js.Any])
    
    inline def setClipboard(value: Typeofclipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
    
    inline def setCommands(value: Typeofcommands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
    
    inline def setContextMenus(value: TypeofcontextMenus): Self = StObject.set(x, "contextMenus", value.asInstanceOf[js.Any])
    
    inline def setCsi(value: () => OnloadT): Self = StObject.set(x, "csi", js.Any.fromFunction0(value))
    
    inline def setDesktopCapture(value: TypeofdesktopCapture): Self = StObject.set(x, "desktopCapture", value.asInstanceOf[js.Any])
    
    inline def setDiagnostics(value: Typeofdiagnostics): Self = StObject.set(x, "diagnostics", value.asInstanceOf[js.Any])
    
    inline def setDisplaySource(value: TypeofdisplaySource): Self = StObject.set(x, "displaySource", value.asInstanceOf[js.Any])
    
    inline def setDns(value: Typeofdns): Self = StObject.set(x, "dns", value.asInstanceOf[js.Any])
    
    inline def setDocumentScan(value: TypeofdocumentScan): Self = StObject.set(x, "documentScan", value.asInstanceOf[js.Any])
    
    inline def setEnterprise(value: Typeofenterprise): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: Instantiable): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setExperimental(value: Any): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    inline def setExtensionTypes(value: TypeofextensionTypes): Self = StObject.set(x, "extensionTypes", value.asInstanceOf[js.Any])
    
    inline def setFileBrowserHandler(value: TypeoffileBrowserHandler): Self = StObject.set(x, "fileBrowserHandler", value.asInstanceOf[js.Any])
    
    inline def setFileSystem(value: TypeoffileSystem): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemProvider(value: TypeoffileSystemProvider): Self = StObject.set(x, "fileSystemProvider", value.asInstanceOf[js.Any])
    
    inline def setGcm(value: Typeofgcm): Self = StObject.set(x, "gcm", value.asInstanceOf[js.Any])
    
    inline def setHid(value: Typeofhid): Self = StObject.set(x, "hid", value.asInstanceOf[js.Any])
    
    inline def setI18n(value: Typeofi18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: Typeofidentity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdle(value: Typeofidle): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    inline def setInstanceID(value: TypeofinstanceID): Self = StObject.set(x, "instanceID", value.asInstanceOf[js.Any])
    
    inline def setLoadTimes(value: () => deprecatedButUsable): Self = StObject.set(x, "loadTimes", js.Any.fromFunction0(value))
    
    inline def setManagement(value: Typeofmanagement): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    inline def setMdns(value: Typeofmdns): Self = StObject.set(x, "mdns", value.asInstanceOf[js.Any])
    
    inline def setMediaGalleries(value: TypeofmediaGalleries): Self = StObject.set(x, "mediaGalleries", value.asInstanceOf[js.Any])
    
    inline def setNetworking(value: Typeofnetworking): Self = StObject.set(x, "networking", value.asInstanceOf[js.Any])
    
    inline def setNotifications(value: Typeofnotifications): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: Typeofpermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPlatformKeys(value: TypeofplatformKeysClientCertificateType): Self = StObject.set(x, "platformKeys", value.asInstanceOf[js.Any])
    
    inline def setPower(value: Typeofpower): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPrinterProvider(value: TypeofprinterProvider): Self = StObject.set(x, "printerProvider", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: TypeofruntimeConnect): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setSerial(value: deprecated): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSignedInDevices(value: TypeofsignedInDevices): Self = StObject.set(x, "signedInDevices", value.asInstanceOf[js.Any])
    
    inline def setSockets(value: Typeofsockets): Self = StObject.set(x, "sockets", value.asInstanceOf[js.Any])
    
    inline def setStorage(value: Typeofstorage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setSyncFileSystem(value: TypeofsyncFileSystem): Self = StObject.set(x, "syncFileSystem", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: Typeofsystem): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setTts(value: Typeoftts): Self = StObject.set(x, "tts", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: Any): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setUsb(value: Typeofusb): Self = StObject.set(x, "usb", value.asInstanceOf[js.Any])
    
    inline def setVirtualKeyboard(value: TypeofvirtualKeyboard): Self = StObject.set(x, "virtualKeyboard", value.asInstanceOf[js.Any])
    
    inline def setVpnProvider(value: TypeofvpnProvider): Self = StObject.set(x, "vpnProvider", value.asInstanceOf[js.Any])
    
    inline def setWallpaper(value: Typeofwallpaper): Self = StObject.set(x, "wallpaper", value.asInstanceOf[js.Any])
    
    inline def setWebRequest(value: Any): Self = StObject.set(x, "webRequest", value.asInstanceOf[js.Any])
    
    inline def setWebViewRequest(value: TypeofwebViewRequest): Self = StObject.set(x, "webViewRequest", value.asInstanceOf[js.Any])
  }
}
