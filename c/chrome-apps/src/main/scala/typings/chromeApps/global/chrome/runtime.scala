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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.runtime
/////////////
// Runtime //
/////////////
/**
  * Use the chrome.runtime API to retrieve the background page, return details about the manifest, and listen for and respond to events in the app lifecycle. You can also use this API to convert the relative path of URLs to fully-qualified URLs.
  * @since Chrome 22
  */
object runtime {
  
  object OnInstalledReason {
    
    @JSGlobal("chrome.runtime.OnInstalledReason")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.OnInstalledReason.CHROME_UPDATE")
    @js.native
    def CHROME_UPDATE: chrome_update_ = js.native
    @scala.inline
    def CHROME_UPDATE_=(x: chrome_update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHROME_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.OnInstalledReason.INSTALL")
    @js.native
    def INSTALL: install_ = js.native
    @scala.inline
    def INSTALL_=(x: install_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INSTALL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.OnInstalledReason.SHARED_MODULE_UPDATE")
    @js.native
    def SHARED_MODULE_UPDATE: shared_module_update_ = js.native
    @scala.inline
    def SHARED_MODULE_UPDATE_=(x: shared_module_update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHARED_MODULE_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.OnInstalledReason.UPDATE")
    @js.native
    def UPDATE: update_ = js.native
    @scala.inline
    def UPDATE_=(x: update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATE")(x.asInstanceOf[js.Any])
  }
  
  object OnRestartRequiredReason {
    
    @JSGlobal("chrome.runtime.OnRestartRequiredReason")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.OnRestartRequiredReason.APP_UPDATE")
    @js.native
    def APP_UPDATE: app_update_ = js.native
    @scala.inline
    def APP_UPDATE_=(x: app_update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APP_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.OnRestartRequiredReason.OS_UPDATE")
    @js.native
    def OS_UPDATE: os_update_ = js.native
    @scala.inline
    def OS_UPDATE_=(x: os_update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.OnRestartRequiredReason.PERIODIC")
    @js.native
    def PERIODIC: periodic_ = js.native
    @scala.inline
    def PERIODIC_=(x: periodic_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERIODIC")(x.asInstanceOf[js.Any])
  }
  
  object PlatformArch {
    
    @JSGlobal("chrome.runtime.PlatformArch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.PlatformArch.ARM")
    @js.native
    def ARM: arm_ = js.native
    @scala.inline
    def ARM_=(x: arm_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARM")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformArch.MIPS")
    @js.native
    def MIPS: mips_ = js.native
    
    @JSGlobal("chrome.runtime.PlatformArch.MIPS64")
    @js.native
    def MIPS64: mips64_ = js.native
    @scala.inline
    def MIPS64_=(x: mips64_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIPS64")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def MIPS_=(x: mips_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIPS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformArch.X86_32")
    @js.native
    def X86_32: `x86-32` = js.native
    @scala.inline
    def X86_32_=(x: `x86-32`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X86_32")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformArch.X86_64")
    @js.native
    def X86_64: `x86-64` = js.native
    @scala.inline
    def X86_64_=(x: `x86-64`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X86_64")(x.asInstanceOf[js.Any])
  }
  
  /* was `typeof PlatformArch` */
  object PlatformNaclArch {
    
    @JSGlobal("chrome.runtime.PlatformNaclArch")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.PlatformNaclArch.ARM")
    @js.native
    def ARM: arm_ = js.native
    @scala.inline
    def ARM_=(x: arm_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARM")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformNaclArch.MIPS")
    @js.native
    def MIPS: mips_ = js.native
    
    @JSGlobal("chrome.runtime.PlatformNaclArch.MIPS64")
    @js.native
    def MIPS64: mips64_ = js.native
    @scala.inline
    def MIPS64_=(x: mips64_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIPS64")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def MIPS_=(x: mips_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIPS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformNaclArch.X86_32")
    @js.native
    def X86_32: `x86-32` = js.native
    @scala.inline
    def X86_32_=(x: `x86-32`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X86_32")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformNaclArch.X86_64")
    @js.native
    def X86_64: `x86-64` = js.native
    @scala.inline
    def X86_64_=(x: `x86-64`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X86_64")(x.asInstanceOf[js.Any])
  }
  
  object PlatformOs {
    
    @JSGlobal("chrome.runtime.PlatformOs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.PlatformOs.ANDROID")
    @js.native
    def ANDROID: android_ = js.native
    @scala.inline
    def ANDROID_=(x: android_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ANDROID")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformOs.CROS")
    @js.native
    def CROS: cros_ = js.native
    @scala.inline
    def CROS_=(x: cros_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CROS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformOs.LINUX")
    @js.native
    def LINUX: linux_ = js.native
    @scala.inline
    def LINUX_=(x: linux_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINUX")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformOs.MAC")
    @js.native
    def MAC: mac_ = js.native
    @scala.inline
    def MAC_=(x: mac_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAC")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformOs.OPENBSD")
    @js.native
    def OPENBSD: openbsd_ = js.native
    @scala.inline
    def OPENBSD_=(x: openbsd_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPENBSD")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.PlatformOs.WIN")
    @js.native
    def WIN: win_ = js.native
    @scala.inline
    def WIN_=(x: win_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WIN")(x.asInstanceOf[js.Any])
  }
  
  object RequestUpdateCheckStatus {
    
    @JSGlobal("chrome.runtime.RequestUpdateCheckStatus")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.runtime.RequestUpdateCheckStatus.NO_UPDATE")
    @js.native
    def NO_UPDATE: no_update_ = js.native
    @scala.inline
    def NO_UPDATE_=(x: no_update_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_UPDATE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.RequestUpdateCheckStatus.THROTTLED")
    @js.native
    def THROTTLED: throttled_ = js.native
    @scala.inline
    def THROTTLED_=(x: throttled_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THROTTLED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.runtime.RequestUpdateCheckStatus.UPDATE_AVAILABLE")
    @js.native
    def UPDATE_AVAILABLE: update_available_ = js.native
    @scala.inline
    def UPDATE_AVAILABLE_=(x: update_available_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPDATE_AVAILABLE")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Attempts to connect to connect listeners within an app (such as the background page), or other apps.
    * This is useful for content scripts connecting to their extension processes, inter-app communication, and web messaging.
    * Note that this does not connect to any listeners in a content script.
    * @since Chrome 26.
    */
  @JSGlobal("chrome.runtime.connect")
  @js.native
  def connect(): Port = js.native
  @JSGlobal("chrome.runtime.connect")
  @js.native
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
  @JSGlobal("chrome.runtime.connect")
  @js.native
  def connect(extensionId: String): Port = js.native
  @JSGlobal("chrome.runtime.connect")
  @js.native
  def connect(extensionId: String, connectInfo: ConnectInfo): Port = js.native
  
  /**
    * Connects to a native application in the host machine.
    * @since Chrome 28.
    * @param application The name of the registered application to connect to.
    */
  @JSGlobal("chrome.runtime.connectNative")
  @js.native
  def connectNative(application: String): Port = js.native
  
  /**
    * Retrieves the JavaScript 'window' object for the background page running inside the current app.
    * If the background page is an event page, the system will ensure it is loaded before calling the callback.
    * If there is no background page, an error is set.
    */
  @JSGlobal("chrome.runtime.getBackgroundPage")
  @js.native
  def getBackgroundPage(callback: js.Function1[/* backgroundPage */ js.UndefOr[Window], Unit]): Unit = js.native
  
  /**
    * Returns details about the app from the manifest.
    * The object returned is a serialization of the full manifest file.
    * @returns The manifest details.
    */
  @JSGlobal("chrome.runtime.getManifest")
  @js.native
  def getManifest(): Manifest = js.native
  
  /**
    * Returns a DirectoryEntry for the package directory.
    * @since Chrome 29.
    */
  @JSGlobal("chrome.runtime.getPackageDirectoryEntry")
  @js.native
  def getPackageDirectoryEntry(callback: js.Function1[/* directoryEntry */ DirectoryEntry, Unit]): Unit = js.native
  
  /**
    * Returns information about the current platform.
    * @since Chrome 29.
    * @param callback Called with results
    */
  @JSGlobal("chrome.runtime.getPlatformInfo")
  @js.native
  def getPlatformInfo(callback: js.Function1[/* platformInfo */ PlatformInfo, Unit]): Unit = js.native
  
  /**
    * Converts a relative path within an app install directory to a fully-qualified URL.
    * @param path A path to a resource within an app expressed relative to its install directory.
    */
  @JSGlobal("chrome.runtime.getURL")
  @js.native
  def getURL(path: String): String = js.native
  
  /** The ID of the app. */
  @JSGlobal("chrome.runtime.id")
  @js.native
  val id: String = js.native
  
  /** This will be defined during an API method callback if there was an error */
  @JSGlobal("chrome.runtime.lastError")
  @js.native
  val lastError: js.UndefOr[LastError] = js.native
  
  /**
    * @deprecated since Chrome 33. Please use **chrome.runtime.onRestartRequired**.
    * Fired when a Chrome update is available, but isn't installed immediately because a browser restart is required.
    */
  @JSGlobal("chrome.runtime.onBrowserUpdateAvailable")
  @js.native
  val onBrowserUpdateAvailable: RuntimeEvent = js.native
  
  /**
    * Fired when a connection is made from either an extension process or a content script.
    * @since Chrome 26.
    */
  @JSGlobal("chrome.runtime.onConnect")
  @js.native
  val onConnect: ExtensionConnectEvent = js.native
  
  /**
    * Fired when a connection is made from another extension.
    * @since Chrome 26.
    */
  @JSGlobal("chrome.runtime.onConnectExternal")
  @js.native
  val onConnectExternal: ExtensionConnectEvent = js.native
  
  /** Fired when the extension is first installed, when the extension is updated to a new version, and when Chrome is updated to a new version. */
  @JSGlobal("chrome.runtime.onInstalled")
  @js.native
  val onInstalled: typings.chromeApps.chrome.events.Event[js.Function1[/* details */ InstalledDetails, Unit]] = js.native
  
  /**
    * Fired when a message is sent from either an extension process or a content script.
    * @since Chrome 26.
    */
  @JSGlobal("chrome.runtime.onMessage")
  @js.native
  val onMessage: ExtensionMessageEvent = js.native
  
  /**
    * Fired when a message is sent from another app. Cannot be used in a content script.
    * @since Chrome 26.
    */
  @JSGlobal("chrome.runtime.onMessageExternal")
  @js.native
  val onMessageExternal: ExtensionMessageEvent = js.native
  
  /**
    * @required(Chrome OS Kiosk app) Currently, this event is only fired for Chrome OS kiosk apps.
    * Fired when an app or the device that it runs on needs to be restarted.
    * The app should close all its windows at its earliest convenient time to let the restart to happen.
    * If the app does nothing, a restart will be enforced after a 24-hour grace period has passed.
    * @since Chrome 29.
    */
  @JSGlobal("chrome.runtime.onRestartRequired")
  @js.native
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
  @JSGlobal("chrome.runtime.onStartup")
  @js.native
  val onStartup: RuntimeEvent = js.native
  
  /** Sent to the event page just before it is unloaded. This gives the extension opportunity to do some clean up. Note that since the page is unloading, any asynchronous operations started while handling this event are not guaranteed to complete. If more activity for the event page occurs before it gets unloaded the onSuspendCanceled event will be sent and the page won't be unloaded. */
  @JSGlobal("chrome.runtime.onSuspend")
  @js.native
  val onSuspend: RuntimeEvent = js.native
  
  /** Sent after onSuspend to indicate that the app won't be unloaded after all. */
  @JSGlobal("chrome.runtime.onSuspendCanceled")
  @js.native
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
  @JSGlobal("chrome.runtime.onUpdateAvailable")
  @js.native
  val onUpdateAvailable: typings.chromeApps.chrome.events.Event[js.Function1[/* details */ UpdateAvailableDetails, Unit]] = js.native
  
  /**
    * Reloads the app .
    * @since Chrome 25.
    */
  @JSGlobal("chrome.runtime.reload")
  @js.native
  def reload(): Unit = js.native
  
  /**
    * Requests an update check for this app.
    * @since Chrome 25.
    * @param callback
    * Parameter status: Result of the update check. See enum RequestUpdateCheckStatus.
    * Optional parameter details: If an update is available, this contains more information about the available update.
    */
  @JSGlobal("chrome.runtime.requestUpdateCheck")
  @js.native
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
  @JSGlobal("chrome.runtime.restart")
  @js.native
  def restart(): Unit = js.native
  
  /**
    * Sends a single message to event listeners within your app or a different app. Similar to runtime.connect but only sends a single message, with an optional response. If sending to your extension, the runtime.onMessage event will be fired in each page, or runtime.onMessageExternal, if a different extension. Note that extensions cannot send messages to content scripts using this method.
    * @since Chrome 32.
    * @param extensionId The ID of the app to send the message to. If omitted, the message will be sent to your own app. Required if sending messages from a web page for web messaging.
    * @param [responseCallback]
    * Parameter response: The JSON response object sent by the handler of the message. If an error occurs while connecting to the extension, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(extensionId: String, message: js.Any): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(
    extensionId: String,
    message: js.Any,
    options: js.UndefOr[scala.Nothing],
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(
    extensionId: String,
    message: js.Any,
    options: Null,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(extensionId: String, message: js.Any, options: MessageOptions): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
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
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(message: js.Any): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(
    message: js.Any,
    options: js.UndefOr[scala.Nothing],
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(message: js.Any, options: Null, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(message: js.Any, options: MessageOptions): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(
    message: js.Any,
    options: MessageOptions,
    responseCallback: js.Function1[/* response */ js.Any, Unit]
  ): Unit = js.native
  @JSGlobal("chrome.runtime.sendMessage")
  @js.native
  def sendMessage(message: js.Any, responseCallback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  
  /**
    * Send a single message to a native application.
    * @since Chrome 28.
    * @param application The of the native messaging host.
    * @param message The message that will be passed to the native messaging host.
    * @param responseCallback Optional.
    * Parameter response: The response message sent by the native messaging host. If an error occurs while connecting to the native messaging host, the callback will be called with no arguments and runtime.lastError will be set to the error message.
    */
  @JSGlobal("chrome.runtime.sendNativeMessage")
  @js.native
  def sendNativeMessage(application: String, message: js.Object): Unit = js.native
  @JSGlobal("chrome.runtime.sendNativeMessage")
  @js.native
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
  @JSGlobal("chrome.runtime.setUninstallURL")
  @js.native
  def setUninstallURL(url: String): Unit = js.native
  @JSGlobal("chrome.runtime.setUninstallURL")
  @js.native
  def setUninstallURL(url: String, callback: js.Function0[Unit]): Unit = js.native
}
