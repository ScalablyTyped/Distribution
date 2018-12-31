package typings
package chromeDashAppsLib.chromeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtimeNs {
  type AutomationOptions = scala.Boolean | AutomationDesktop | AutomationNonInteractive
  // | 'chrome://extension-icon/'; // Doesn't need permission yet?
  type ChromeOSOnlyPermissions = chromeDashAppsLib.chromeDashAppsLibStrings.certificateProvider | chromeDashAppsLib.chromeDashAppsLibStrings.clipboard | chromeDashAppsLib.chromeDashAppsLibStrings.dns | chromeDashAppsLib.chromeDashAppsLibStrings.documentScan | chromeDashAppsLib.chromeDashAppsLibStrings.enterpriseDOTplatformKeys | chromeDashAppsLib.chromeDashAppsLibStrings.enterpriseDOTdeviceAttributes | chromeDashAppsLib.chromeDashAppsLibStrings.fileBrowserHandler | chromeDashAppsLib.chromeDashAppsLibStrings.fileSystemProvider | chromeDashAppsLib.chromeDashAppsLibStrings.networkingDOTconfig | chromeDashAppsLib.chromeDashAppsLibStrings.platformKeys | chromeDashAppsLib.chromeDashAppsLibStrings.vpnProvider | chromeDashAppsLib.chromeDashAppsLibStrings.wallpaper | FileSystemPermission
  type DevOnly = chromeDashAppsLib.chromeDashAppsLibStrings.appDOTwindowDOTalpha | chromeDashAppsLib.chromeDashAppsLibStrings.diagnostics | chromeDashAppsLib.chromeDashAppsLibStrings.displaySource | chromeDashAppsLib.chromeDashAppsLibStrings.signedInDevices
  type ExtensionConnectEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* port */ Port, scala.Unit]]
  type ExtensionMessageEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ]
  /// For chrome managed storage
  type JSONBasicTypes = chromeDashAppsLib.chromeDashAppsLibStrings.integer | chromeDashAppsLib.chromeDashAppsLibStrings.string | chromeDashAppsLib.chromeDashAppsLibStrings.number
  type KioskOnlyPermissions = chromeDashAppsLib.chromeDashAppsLibStrings.audio | chromeDashAppsLib.chromeDashAppsLibStrings.networkingDOTonc | chromeDashAppsLib.chromeDashAppsLibStrings.systemDOTpowerSource | chromeDashAppsLib.chromeDashAppsLibStrings.virtualKeyboard
  type Manifest = ValidKioskManifest | ValidNonKioskManifest | InvalidManifest
  type NotAllowedAsOptionalPermissions = chromeDashAppsLib.chromeDashAppsLibStrings.debugger | chromeDashAppsLib.chromeDashAppsLibStrings.experimental | chromeDashAppsLib.chromeDashAppsLibStrings.geolocation | chromeDashAppsLib.chromeDashAppsLibStrings.mdns | chromeDashAppsLib.chromeDashAppsLibStrings.proxy | chromeDashAppsLib.chromeDashAppsLibStrings.tts | chromeDashAppsLib.chromeDashAppsLibStrings.wallpaper
  /**
    * Optional permissions
    * @see NotAllowedAsOptionalPermissions for permissions that you're not allowed to set on demand.
    */
  type OptionalPermission = stdLib.Exclude[Permission, NotAllowedAsOptionalPermissions]
  type Permission = chromeDashAppsLib.chromeDashAppsLibStrings.alarms | chromeDashAppsLib.chromeDashAppsLibStrings.appview | chromeDashAppsLib.chromeDashAppsLibStrings.audio | chromeDashAppsLib.chromeDashAppsLibStrings.alwaysOnTopWindows | chromeDashAppsLib.chromeDashAppsLibStrings.appDOTwindowDOTalwaysOnTop | chromeDashAppsLib.chromeDashAppsLibStrings.appDOTwindowDOTfullscreen | chromeDashAppsLib.chromeDashAppsLibStrings.appDOTwindowDOTfullscreenDOToverrideEsc | chromeDashAppsLib.chromeDashAppsLibStrings.appDOTwindowDOTshape | chromeDashAppsLib.chromeDashAppsLibStrings.audioCapture | chromeDashAppsLib.chromeDashAppsLibStrings.background | chromeDashAppsLib.chromeDashAppsLibStrings.browser | chromeDashAppsLib.chromeDashAppsLibStrings.clipboardRead | chromeDashAppsLib.chromeDashAppsLibStrings.clipboardWrite | chromeDashAppsLib.chromeDashAppsLibStrings.contextMenus | chromeDashAppsLib.chromeDashAppsLibStrings.desktopCapture | chromeDashAppsLib.chromeDashAppsLibStrings.experimental | chromeDashAppsLib.chromeDashAppsLibStrings.fileSystem | chromeDashAppsLib.chromeDashAppsLibStrings.gcm | chromeDashAppsLib.chromeDashAppsLibStrings.geolocation | chromeDashAppsLib.chromeDashAppsLibStrings.hid | chromeDashAppsLib.chromeDashAppsLibStrings.identity | chromeDashAppsLib.chromeDashAppsLibStrings.idle | chromeDashAppsLib.chromeDashAppsLibStrings.mdns | chromeDashAppsLib.chromeDashAppsLibStrings.mediaGalleries | chromeDashAppsLib.chromeDashAppsLibStrings.nativeMessaging | chromeDashAppsLib.chromeDashAppsLibStrings.notifications | chromeDashAppsLib.chromeDashAppsLibStrings.pointerLock | chromeDashAppsLib.chromeDashAppsLibStrings.power | chromeDashAppsLib.chromeDashAppsLibStrings.printerProvider | chromeDashAppsLib.chromeDashAppsLibStrings.runtime | chromeDashAppsLib.chromeDashAppsLibStrings.serial | chromeDashAppsLib.chromeDashAppsLibStrings.storage | chromeDashAppsLib.chromeDashAppsLibStrings.syncFileSystem | chromeDashAppsLib.chromeDashAppsLibStrings.systemDOTcpu | chromeDashAppsLib.chromeDashAppsLibStrings.systemDOTdisplay | chromeDashAppsLib.chromeDashAppsLibStrings.systemDOTmemory | chromeDashAppsLib.chromeDashAppsLibStrings.systemDOTnetwork | chromeDashAppsLib.chromeDashAppsLibStrings.systemDOTstorage | chromeDashAppsLib.chromeDashAppsLibStrings.tts | chromeDashAppsLib.chromeDashAppsLibStrings.unlimitedStorage | chromeDashAppsLib.chromeDashAppsLibStrings.usb | chromeDashAppsLib.chromeDashAppsLibStrings.usbDevices | chromeDashAppsLib.chromeDashAppsLibStrings.videoCapture | chromeDashAppsLib.chromeDashAppsLibStrings.webview | ChromeOSOnlyPermissions | KioskOnlyPermissions | MediaGalleriesPermission | SocketPermission | (/**
    * Specifies a **host permission**.
    * Required if the app wants to interact with the code running on pages.
    * Many capabilities, such as cross-origin XMLHttpRequests,
    * programmatically injected content scripts require host permissions.
    * For details on the syntax:
    * @see[Match Patterns]{@link https://developer.chrome.com/apps/match_patterns}
    * A path is allowed but treated as / *
    */
  UrlMatches) | USBDevicesPermission
  type RuntimeEvent = chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function0[scala.Unit]]
  /** Undocumented but used permissions */
  type UndocumentedPermissions = chromeDashAppsLib.chromeDashAppsLibStrings.appDOTwindowDOTime | chromeDashAppsLib.chromeDashAppsLibStrings.fullscreen | chromeDashAppsLib.chromeDashAppsLibStrings.overrideEscFullscreen
  type UrlMatches = chromeDashAppsLib.chromeDashAppsLibStrings.`https://wwwDOTgoogle-analyticsDOTcom/*` | chromeDashAppsLib.chromeDashAppsLibStrings.`https://wwwDOTgoogleapisDOTcom/*` | chromeDashAppsLib.chromeDashAppsLibStrings.`<all_urls>` | chromeDashAppsLib.chromeDashAppsLibStrings.`http://*/*` | chromeDashAppsLib.chromeDashAppsLibStrings.`https://*/*` | chromeDashAppsLib.chromeDashAppsLibStrings.`file:///*/*` | chromeDashAppsLib.chromeDashAppsLibStrings.`chrome://favicon/`
}
