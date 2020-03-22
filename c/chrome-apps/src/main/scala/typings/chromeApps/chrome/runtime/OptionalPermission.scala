package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.usb_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional permissions
  * @see NotAllowedAsOptionalPermissions for permissions that you're not allowed to set on demand.
  */
/* Inlined std.Exclude<chrome-apps.chrome.runtime.Permission, chrome-apps.chrome.runtime.NotAllowedAsOptionalPermissions> */
/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chromeAppsStrings.browser
  - typings.chromeApps.chromeAppsStrings.appDotwindowDotshape
  - typings.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen
  - typings.chromeApps.chromeAppsStrings.alarms
  - typings.chromeApps.chromeAppsStrings.contextMenus
  - typings.chromeApps.chromeAppsStrings.audio
  - typings.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk
  - typings.chromeApps.chromeAppsStrings.gcm
  - typings.chromeApps.chromeAppsStrings.idle
  - typings.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash
  - typings.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes
  - typings.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys
  - typings.chromeApps.chromeAppsStrings.systemDotnetwork
  - typings.chromeApps.chromeAppsStrings.platformKeys
  - typings.chromeApps.chromeAppsStrings.background
  - typings.chromeApps.chromeAppsStrings.dns
  - typings.chromeApps.chromeAppsStrings.systemDotpowerSource
  - typings.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk
  - typings.chromeApps.chromeAppsStrings.webview
  - typings.chromeApps.chromeAppsStrings.unlimitedStorage
  - typings.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk
  - typings.chromeApps.chromeAppsStrings.syncFileSystem
  - typings.chromeApps.chromeAppsStrings.usbDevices
  - typings.chromeApps.chromeAppsStrings.systemDotdisplay
  - typings.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk
  - typings.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop
  - typings.chromeApps.chromeAppsStrings.serial
  - typings.chromeApps.chromeAppsStrings.systemDotcpu
  - typings.chromeApps.chromeAppsStrings.networkingDotconfig
  - typings.chromeApps.chromeAppsStrings.videoCapture
  - typings.chromeApps.chromeAppsStrings.appview
  - typings.chromeApps.chromeAppsStrings.nativeMessaging
  - typings.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`
  - typings.chromeApps.chromeAppsStrings.mediaGalleries
  - typings.chromeApps.chromeAppsStrings.clipboardWrite
  - typings.chromeApps.chromeAppsStrings.printerProvider
  - typings.chromeApps.chromeAppsStrings.clipboard
  - typings.chromeApps.chromeAppsStrings.desktopCapture
  - typings.chromeApps.chromeAppsStrings.fileSystemProvider
  - typings.chromeApps.chromeAppsStrings.clipboardRead
  - typings.chromeApps.chromeAppsStrings.networkingDotonc
  - typings.chromeApps.chromeAppsStrings.pointerLock
  - typings.chromeApps.chromeAppsStrings.usb_
  - typings.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc
  - typings.chromeApps.chromeAppsStrings.storage
  - typings.chromeApps.chromeAppsStrings.alwaysOnTopWindows
  - typings.chromeApps.chromeAppsStrings.audioCapture
  - typings.chromeApps.chromeAppsStrings.systemDotstorage
  - typings.chromeApps.chromeAppsStrings.fileBrowserHandler
  - typings.chromeApps.chromeAppsStrings.power
  - typings.chromeApps.chromeAppsStrings.vpnProvider
  - typings.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign
  - typings.chromeApps.chromeAppsStrings.virtualKeyboard
  - typings.chromeApps.chromeAppsStrings.socket
  - typings.chromeApps.chromeAppsStrings.documentScan
  - typings.chromeApps.chromeAppsStrings.systemDotmemory
  - typings.chromeApps.chromeAppsStrings.identity
  - typings.chromeApps.chromeAppsStrings.certificateProvider
  - typings.chromeApps.chromeAppsStrings.notifications
  - typings.chromeApps.chromeAppsStrings.fileSystem
  - typings.chromeApps.chromeAppsStrings.runtime
  - typings.chromeApps.chromeAppsStrings.hid
*/
trait OptionalPermission extends js.Object

object OptionalPermission {
  @scala.inline
  def Lessthansignall_urlsGreaterthansign: typings.chromeApps.chromeAppsStrings.Lessthansignall_urlsGreaterthansign = this.cast("<all_urls>")
  @scala.inline
  def alarms: typings.chromeApps.chromeAppsStrings.alarms = this.cast("alarms")
  @scala.inline
  def alwaysOnTopWindows: typings.chromeApps.chromeAppsStrings.alwaysOnTopWindows = this.cast("alwaysOnTopWindows")
  @scala.inline
  def appDotwindowDotalwaysOnTop: typings.chromeApps.chromeAppsStrings.appDotwindowDotalwaysOnTop = this.cast("app.window.alwaysOnTop")
  @scala.inline
  def appDotwindowDotfullscreen: typings.chromeApps.chromeAppsStrings.appDotwindowDotfullscreen = this.cast("app.window.fullscreen")
  @scala.inline
  def appDotwindowDotfullscreenDotoverrideEsc: typings.chromeApps.chromeAppsStrings.appDotwindowDotfullscreenDotoverrideEsc = this.cast("app.window.fullscreen.overrideEsc")
  @scala.inline
  def appDotwindowDotshape: typings.chromeApps.chromeAppsStrings.appDotwindowDotshape = this.cast("app.window.shape")
  @scala.inline
  def appview: typings.chromeApps.chromeAppsStrings.appview = this.cast("appview")
  @scala.inline
  def audio: typings.chromeApps.chromeAppsStrings.audio = this.cast("audio")
  @scala.inline
  def audioCapture: typings.chromeApps.chromeAppsStrings.audioCapture = this.cast("audioCapture")
  @scala.inline
  def background: typings.chromeApps.chromeAppsStrings.background = this.cast("background")
  @scala.inline
  def browser: typings.chromeApps.chromeAppsStrings.browser = this.cast("browser")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def certificateProvider: typings.chromeApps.chromeAppsStrings.certificateProvider = this.cast("certificateProvider")
  @scala.inline
  def chromeColonSlashSlashfaviconSlash: typings.chromeApps.chromeAppsStrings.chromeColonSlashSlashfaviconSlash = this.cast("chrome://favicon/")
  @scala.inline
  def clipboard: typings.chromeApps.chromeAppsStrings.clipboard = this.cast("clipboard")
  @scala.inline
  def clipboardRead: typings.chromeApps.chromeAppsStrings.clipboardRead = this.cast("clipboardRead")
  @scala.inline
  def clipboardWrite: typings.chromeApps.chromeAppsStrings.clipboardWrite = this.cast("clipboardWrite")
  @scala.inline
  def contextMenus: typings.chromeApps.chromeAppsStrings.contextMenus = this.cast("contextMenus")
  @scala.inline
  def desktopCapture: typings.chromeApps.chromeAppsStrings.desktopCapture = this.cast("desktopCapture")
  @scala.inline
  def dns: typings.chromeApps.chromeAppsStrings.dns = this.cast("dns")
  @scala.inline
  def documentScan: typings.chromeApps.chromeAppsStrings.documentScan = this.cast("documentScan")
  @scala.inline
  def enterpriseDotdeviceAttributes: typings.chromeApps.chromeAppsStrings.enterpriseDotdeviceAttributes = this.cast("enterprise.deviceAttributes")
  @scala.inline
  def enterpriseDotplatformKeys: typings.chromeApps.chromeAppsStrings.enterpriseDotplatformKeys = this.cast("enterprise.platformKeys")
  @scala.inline
  def fileBrowserHandler: typings.chromeApps.chromeAppsStrings.fileBrowserHandler = this.cast("fileBrowserHandler")
  @scala.inline
  def fileColonSlashSlashSlashAsteriskSlashAsterisk: typings.chromeApps.chromeAppsStrings.fileColonSlashSlashSlashAsteriskSlashAsterisk = this.cast("file:///*/*")
  @scala.inline
  def fileSystem: typings.chromeApps.chromeAppsStrings.fileSystem = this.cast("fileSystem")
  @scala.inline
  def fileSystemProvider: typings.chromeApps.chromeAppsStrings.fileSystemProvider = this.cast("fileSystemProvider")
  @scala.inline
  def gcm: typings.chromeApps.chromeAppsStrings.gcm = this.cast("gcm")
  @scala.inline
  def hid: typings.chromeApps.chromeAppsStrings.hid = this.cast("hid")
  @scala.inline
  def httpColonSlashSlashAsteriskSlashAsterisk: typings.chromeApps.chromeAppsStrings.httpColonSlashSlashAsteriskSlashAsterisk = this.cast("http://*/*")
  @scala.inline
  def httpsColonSlashSlashAsteriskSlashAsterisk: typings.chromeApps.chromeAppsStrings.httpsColonSlashSlashAsteriskSlashAsterisk = this.cast("https://*/*")
  @scala.inline
  def `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`: typings.chromeApps.chromeAppsStrings.`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk` = this.cast("https://www.google-analytics.com/*")
  @scala.inline
  def httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk: typings.chromeApps.chromeAppsStrings.httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk = this.cast("https://www.googleapis.com/*")
  @scala.inline
  def identity: typings.chromeApps.chromeAppsStrings.identity = this.cast("identity")
  @scala.inline
  def idle: typings.chromeApps.chromeAppsStrings.idle = this.cast("idle")
  @scala.inline
  def mediaGalleries: typings.chromeApps.chromeAppsStrings.mediaGalleries = this.cast("mediaGalleries")
  @scala.inline
  def nativeMessaging: typings.chromeApps.chromeAppsStrings.nativeMessaging = this.cast("nativeMessaging")
  @scala.inline
  def networkingDotconfig: typings.chromeApps.chromeAppsStrings.networkingDotconfig = this.cast("networking.config")
  @scala.inline
  def networkingDotonc: typings.chromeApps.chromeAppsStrings.networkingDotonc = this.cast("networking.onc")
  @scala.inline
  def notifications: typings.chromeApps.chromeAppsStrings.notifications = this.cast("notifications")
  @scala.inline
  def platformKeys: typings.chromeApps.chromeAppsStrings.platformKeys = this.cast("platformKeys")
  @scala.inline
  def pointerLock: typings.chromeApps.chromeAppsStrings.pointerLock = this.cast("pointerLock")
  @scala.inline
  def power: typings.chromeApps.chromeAppsStrings.power = this.cast("power")
  @scala.inline
  def printerProvider: typings.chromeApps.chromeAppsStrings.printerProvider = this.cast("printerProvider")
  @scala.inline
  def runtime: typings.chromeApps.chromeAppsStrings.runtime = this.cast("runtime")
  @scala.inline
  def serial: typings.chromeApps.chromeAppsStrings.serial = this.cast("serial")
  @scala.inline
  def socket: typings.chromeApps.chromeAppsStrings.socket = this.cast("socket")
  @scala.inline
  def storage: typings.chromeApps.chromeAppsStrings.storage = this.cast("storage")
  @scala.inline
  def syncFileSystem: typings.chromeApps.chromeAppsStrings.syncFileSystem = this.cast("syncFileSystem")
  @scala.inline
  def systemDotcpu: typings.chromeApps.chromeAppsStrings.systemDotcpu = this.cast("system.cpu")
  @scala.inline
  def systemDotdisplay: typings.chromeApps.chromeAppsStrings.systemDotdisplay = this.cast("system.display")
  @scala.inline
  def systemDotmemory: typings.chromeApps.chromeAppsStrings.systemDotmemory = this.cast("system.memory")
  @scala.inline
  def systemDotnetwork: typings.chromeApps.chromeAppsStrings.systemDotnetwork = this.cast("system.network")
  @scala.inline
  def systemDotpowerSource: typings.chromeApps.chromeAppsStrings.systemDotpowerSource = this.cast("system.powerSource")
  @scala.inline
  def systemDotstorage: typings.chromeApps.chromeAppsStrings.systemDotstorage = this.cast("system.storage")
  @scala.inline
  def unlimitedStorage: typings.chromeApps.chromeAppsStrings.unlimitedStorage = this.cast("unlimitedStorage")
  @scala.inline
  def usb: usb_ = this.cast("usb")
  @scala.inline
  def usbDevices: typings.chromeApps.chromeAppsStrings.usbDevices = this.cast("usbDevices")
  @scala.inline
  def videoCapture: typings.chromeApps.chromeAppsStrings.videoCapture = this.cast("videoCapture")
  @scala.inline
  def virtualKeyboard: typings.chromeApps.chromeAppsStrings.virtualKeyboard = this.cast("virtualKeyboard")
  @scala.inline
  def vpnProvider: typings.chromeApps.chromeAppsStrings.vpnProvider = this.cast("vpnProvider")
  @scala.inline
  def webview: typings.chromeApps.chromeAppsStrings.webview = this.cast("webview")
}

