package typings.chromeApps.global.chrome

import typings.chromeApps.Window
import typings.chromeApps.anon.APPUPDATE
import typings.chromeApps.anon.NOUPDATE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.runtime.ConnectInfo
import typings.chromeApps.chrome.runtime.ExtensionConnectEvent
import typings.chromeApps.chrome.runtime.ExtensionMessageEvent
import typings.chromeApps.chrome.runtime.InstalledDetails
import typings.chromeApps.chrome.runtime.LastError
import typings.chromeApps.chrome.runtime.Manifest
import typings.chromeApps.chrome.runtime.MessageOptions
import typings.chromeApps.chrome.runtime.PlatformInfo
import typings.chromeApps.chrome.runtime.Port
import typings.chromeApps.chrome.runtime.RuntimeEvent
import typings.chromeApps.chrome.runtime.UpdateAvailableDetails
import typings.chromeApps.chrome.runtime.UpdateCheckDetails
import typings.chromeApps.chromeAppsStrings.APP_UPDATE
import typings.chromeApps.chromeAppsStrings.NO_UPDATE
import typings.chromeApps.chromeAppsStrings.OS_UPDATE
import typings.chromeApps.chromeAppsStrings.PERIODIC
import typings.chromeApps.chromeAppsStrings.THROTTLED
import typings.chromeApps.chromeAppsStrings.UPDATE_AVAILABLE
import typings.chromeApps.chromeAppsStrings.`x86-32`
import typings.chromeApps.chromeAppsStrings.`x86-64`
import typings.chromeApps.chromeAppsStrings.android_
import typings.chromeApps.chromeAppsStrings.app_update_
import typings.chromeApps.chromeAppsStrings.arm_
import typings.chromeApps.chromeAppsStrings.chrome_update_
import typings.chromeApps.chromeAppsStrings.cros_
import typings.chromeApps.chromeAppsStrings.install_
import typings.chromeApps.chromeAppsStrings.linux_
import typings.chromeApps.chromeAppsStrings.mac_
import typings.chromeApps.chromeAppsStrings.mips64_
import typings.chromeApps.chromeAppsStrings.mips_
import typings.chromeApps.chromeAppsStrings.no_update_
import typings.chromeApps.chromeAppsStrings.openbsd_
import typings.chromeApps.chromeAppsStrings.os_update_
import typings.chromeApps.chromeAppsStrings.periodic_
import typings.chromeApps.chromeAppsStrings.shared_module_update_
import typings.chromeApps.chromeAppsStrings.throttled_
import typings.chromeApps.chromeAppsStrings.update_
import typings.chromeApps.chromeAppsStrings.update_available_
import typings.chromeApps.chromeAppsStrings.win_
import typings.filesystem.DirectoryEntry
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.runtime
/////////////
// Runtime //
/////////////
/**
  * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
  * @since Chrome 22
  */
@JSGlobal("chrome.runtime")
@js.native
object runtime extends js.Object {
  /** The ID of the app. */
  val id: String = js.native
  /** This will be defined during an API method callback if there was an error */
  val lastError: js.UndefOr[LastError] = js.native
  /**
    * @deprecated since Chrome 33. Please use **chrome.runtime.onRestartRequired**.
    * Fired when a Chrome update is available, but isn't installed immediately because a browser restart is required.
    */
  val onBrowserUpdateAvailable: RuntimeEvent = js.native
  /**
    * Fired when a connection is made from either an extension process or a content script.
    * @since Chrome 26.
    */
  val onConnect: ExtensionConnectEvent = js.native
  /**
    * Fired when a connection is made from another extension.
    * @since Chrome 26.
    */
  val onConnectExternal: ExtensionConnectEvent = js.native
  /** Fired when the extension is first installed, when the extension is updated to a new version, and when Chrome is updated to a new version. */
  val onInstalled: typings.chromeApps.chrome.events.Event[js.Function1[/* details */ InstalledDetails, Unit]] = js.native
  /**
    * Fired when a message is sent from either an extension process or a content script.
    * @since Chrome 26.
    */
  val onMessage: ExtensionMessageEvent = js.native
  /**
    * Fired when a message is sent from another app. Cannot be used in a content script.
    * @since Chrome 26.
    */
  val onMessageExternal: ExtensionMessageEvent = js.native
  /**
    * @required(Chrome OS Kiosk app) Currently, this event is only fired for Chrome OS kiosk apps.
    * Fired when an app or the device that it runs on needs to be restarted.
    * The app should close all its windows at its earliest convenient time to let the restart to happen.
    * If the app does nothing, a restart will be enforced after a 24-hour grace period has passed.
    * @since Chrome 29.
    */
  val onRestartRequired: typings.chromeApps.chrome.events.Event[
    js.Function1[
      /* reason */ ToStringLiteral[
        APPUPDATE, 
        /* keyof chrome-apps.anon.APPUPDATE */ APP_UPDATE | OS_UPDATE | PERIODIC, 
        Exclude[
          /* keyof chrome-apps.anon.APPUPDATE */ APP_UPDATE | OS_UPDATE | PERIODIC, 
          app_update_ | os_update_ | periodic_
        ]
      ], 
      Unit
    ]
  ] = js.native
  /**
    * Fired when a profile that has this app installed first starts up. This event is not fired when an incognito profile is started, even if this app is operating in 'split' incognito mode.
    * @since Chrome 23.
    */
  val onStartup: RuntimeEvent = js.native
  /** Sent to the event page just before it is unloaded. This gives the extension opportunity to do some clean up. Note that since the page is unloading, any asynchronous operations started while handling this event are not guaranteed to complete. If more activity for the event page occurs before it gets unloaded the onSuspendCanceled event will be sent and the page won't be unloaded. */
  val onSuspend: RuntimeEvent = js.native
  /** Sent after onSuspend to indicate that the app won't be unloaded after all. */
  val onSuspendCanceled: RuntimeEvent = js.native
  /**
    * Fired when an update is available, but isn't installed immediately because the app is currently running.
    * If you do nothing, the update will be installed the next time the background page gets unloaded,
    * if you want it to be installed sooner you can explicitly call chrome.runtime.reload().
    * If your extension is using a persistent background page, the background page of course never gets unloaded,
    * so unless you call chrome.runtime.reload() manually in response to this event the update
    * will not get installed until the next time chrome itself restarts. If no handlers are listening for this event,
    * and your extension has a persistent background page, it behaves as if chrome.runtime.reload()
    * is called in response to this event.
    * @since Chrome 25.
    */
  val onUpdateAvailable: typings.chromeApps.chrome.events.Event[js.Function1[/* details */ UpdateAvailableDetails, Unit]] = js.native
  /**
    * Attempts to connect to connect listeners within an app (such as the background page), or other apps.
    * This is useful for content scripts connecting to their extension processes, inter-app communication, and web messaging.
    * Note that this does not connect to any listeners in a content script.
    * @since Chrome 26.
    */
  def connect(): Port = js.native
  def connect(connectInfo: ConnectInfo): Port = js.native
  /**
    * Attempts to connect to connect listeners within an app (such as the background page), or other apps.
    * This is useful for content scripts connecting to their extension processes, inter-app communication, and web messaging.
    * Note that this does not connect to any listeners in a content script.
    * @since Chrome 26.
    * @param extensionId Optional; ID of the extension.
    * The ID of the extension or app to connect to.
    * If omitted, a connection will be attempted with your own app.
    * Required if sending messages from a web page for web messaging.
    */
  def connect(extensionId: String): Port = js.native
  def connect(extensionId: String, connectInfo: ConnectInfo): Port = js.native
  /**
    * Connects to a native application in the host machine.
    * @since Chrome 28.
    * @param application The name of the registered application to connect to.
    */
  def connectNative(application: String): Port = js.native
  /**
    * Retrieves the JavaScript 'window' object for the background page running inside the current app.
    * If the background page is an event page, the system will ensure it is loaded before calling the callback.
    * If there is no background page, an error is set.
    */
  def getBackgroundPage(callback: js.Function1[/* backgroundPage */ js.UndefOr[Window], Unit]): Unit = js.native
  /**
    * Returns details about the app from the manifest.
    * The object returned is a serialization of the full manifest file.
    * @returns The manifest details.
    */
  def getManifest(): Manifest = js.native
  /**
    * Returns a DirectoryEntry for the package directory.
    * @since Chrome 29.
    */
  def getPackageDirectoryEntry(callback: js.Function1[/* directoryEntry */ DirectoryEntry, Unit]): Unit = js.native
  /**
    * Returns information about the current platform.
    * @since Chrome 29.
    * @param callback Called with results
    */
  def getPlatformInfo(callback: js.Function1[/* platformInfo */ PlatformInfo, Unit]): Unit = js.native
  /**
    * Converts a relative path within an app install directory to a fully-qualified URL.
    * @param path A path to a resource within an app expressed relative to its install directory.
    */
  def getURL(path: String): String = js.native
  /**
    * Reloads the app .
    * @since Chrome 25.
    */
  def reload(): Unit = js.native
  /**
    * Requests an update check for this app.
    * @since Chrome 25.
    * @param callback
    * Parameter status: Result of the update check. See enum RequestUpdateCheckStatus.
    * Optional parameter details: If an update is available, this contains more information about the available update.
    */
  def requestUpdateCheck(
    callback: js.Function2[
      /* status */ ToStringLiteral[
        NOUPDATE, 
        /* keyof chrome-apps.anon.NOUPDATE */ THROTTLED | NO_UPDATE | UPDATE_AVAILABLE, 
        Exclude[
          /* keyof chrome-apps.anon.NOUPDATE */ THROTTLED | NO_UPDATE | UPDATE_AVAILABLE, 
          throttled_ | no_update_ | update_available_
        ]
      ], 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Restart the ChromeOS device when the app runs in kiosk mode. Otherwise, it's no-op.
    * @since Chrome 32.
    */
  def restart(): Unit = js.native
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response. If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension. Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 32.
    * @param extensionId The ID of the app to send the message to. If omitted, the message will be sent to your own app. Required if sending messages from a web page for web messaging.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  def sendMessage(extensionId: String, message: js.Any): Unit = js.native
  def sendMessage(
    extensionId: String,
    message: js.Any,
    options: js.UndefOr[scala.Nothing],
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def sendMessage(
    extensionId: String,
    message: js.Any,
    options: Null,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def sendMessage(extensionId: String, message: js.Any, options: MessageOptions): Unit = js.native
  def sendMessage(
    extensionId: String,
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response.
    * If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension.
    * Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 26.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response. If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension. Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 32.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  def sendMessage(message: js.Any): Unit = js.native
  def sendMessage(
    message: js.Any,
    options: js.UndefOr[scala.Nothing],
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def sendMessage(message: js.Any, options: Null, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  def sendMessage(message: js.Any, options: MessageOptions): Unit = js.native
  def sendMessage(
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  def sendMessage(message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  /**
    * Send a single message to a native application.
    * @since Chrome 28.
    * @param application The of the native messaging host.
    * @param message The message that will be passed to the native messaging host.
    * @param responseCallback Optional.
    * Parameter response: The response message sent by the native messaging host. If an error occurs while connecting to the native messaging host, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  def sendNativeMessage(application: String, message: js.Object): Unit = js.native
  def sendNativeMessage(
    application: String,
    message: js.Object,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  /**
    * Sets the URL to be visited upon uninstallation. This may be used to clean up server-side data, do analytics, and implement surveys. Maximum 255 characters.
    * @since Chrome 41.
    * @param url Since Chrome 34.
    * URL to be opened after the extension is uninstalled. This URL must have an http: or https: scheme. Set an empty string to not open a new tab upon uninstallation.
    * @param callback Called when the uninstall URL is set. If the given URL is invalid, runtime.lastError will be set.
    */
  def setUninstallURL(url: String): Unit = js.native
  def setUninstallURL(url: String, callback: js.Function0[Unit]): Unit = js.native
  @js.native
  object OnInstalledReason extends js.Object {
    var CHROME_UPDATE: chrome_update_ = js.native
    var INSTALL: install_ = js.native
    var SHARED_MODULE_UPDATE: shared_module_update_ = js.native
    var UPDATE: update_ = js.native
  }
  
  @js.native
  object OnRestartRequiredReason extends js.Object {
    var APP_UPDATE: app_update_ = js.native
    var OS_UPDATE: os_update_ = js.native
    var PERIODIC: periodic_ = js.native
  }
  
  @js.native
  object PlatformArch extends js.Object {
    var ARM: arm_ = js.native
    var MIPS: mips_ = js.native
    var MIPS64: mips64_ = js.native
    var X86_32: `x86-32` = js.native
    var X86_64: `x86-64` = js.native
  }
  
  @js.native
  object PlatformNaclArch extends js.Object {
    var ARM: arm_ = js.native
    var MIPS: mips_ = js.native
    var MIPS64: mips64_ = js.native
    var X86_32: `x86-32` = js.native
    var X86_64: `x86-64` = js.native
  }
  
  @js.native
  object PlatformOs extends js.Object {
    var ANDROID: android_ = js.native
    var CROS: cros_ = js.native
    var LINUX: linux_ = js.native
    var MAC: mac_ = js.native
    var OPENBSD: openbsd_ = js.native
    var WIN: win_ = js.native
  }
  
  @js.native
  object RequestUpdateCheckStatus extends js.Object {
    var NO_UPDATE: no_update_ = js.native
    var THROTTLED: throttled_ = js.native
    var UPDATE_AVAILABLE: update_available_ = js.native
  }
  
}

