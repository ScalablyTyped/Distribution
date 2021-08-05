package typings.chromeApps

import typings.chromeApps.WebView.ContextType
import typings.chromeApps.WebView.Events.DialogMessageType
import typings.chromeApps.WebView.Events.ExitEventReason
import typings.chromeApps.WebView.Events.LoadAbortReason
import typings.chromeApps.WebView.Events.RequestedPermission
import typings.chromeApps.WebView.Events.WindowOpenDisposition
import typings.chromeApps.WebView.ZoomMode
import typings.chromeApps.chrome.accessibilityFeatures.LevelOfControl
import typings.chromeApps.chrome.accessibilityFeatures.Scope
import typings.chromeApps.chrome.audio.DeviceType
import typings.chromeApps.chrome.audio.StreamType
import typings.chromeApps.chrome.bluetooth.DeviceFilterType
import typings.chromeApps.chrome.bluetooth.DeviceVendorIdSource
import typings.chromeApps.chrome.bluetoothLowEnergy.AdvertisementType
import typings.chromeApps.chrome.bluetoothLowEnergy.CharacteristicProperties
import typings.chromeApps.chrome.bluetoothLowEnergy.DescriptorPermissions
import typings.chromeApps.chrome.bluetoothSocket.OnAcceptErrorCode
import typings.chromeApps.chrome.bluetoothSocket.OnReceiveErrorCode
import typings.chromeApps.chrome.certificateProvider.Hash
import typings.chromeApps.chrome.clipboard.ImageType
import typings.chromeApps.chrome.contextMenus.MediaType
import typings.chromeApps.chrome.extensionTypes.CSSOrigin
import typings.chromeApps.chrome.extensionTypes.RunAt
import typings.chromeApps.chrome.fileBrowserHandler.FileBrowserHandleExecuteId
import typings.chromeApps.chrome.gcm.DisallowedKeys
import typings.chromeApps.chrome.i18n.LanguageCode
import typings.chromeApps.chrome.i18n.kLanguageInfoTable
import typings.chromeApps.chrome.idle.IdleState
import typings.chromeApps.chrome.mediaGalleries.GalleryChangedType
import typings.chromeApps.chrome.mediaGalleries.Interactive
import typings.chromeApps.chrome.mediaGalleries.MetadataOptionsType
import typings.chromeApps.chrome.mediaGalleries.ScanProgressType
import typings.chromeApps.chrome.networking.onc.ActivationStateType
import typings.chromeApps.chrome.networking.onc.CaptivePortalStatus
import typings.chromeApps.chrome.networking.onc.ClientCertType
import typings.chromeApps.chrome.networking.onc.ConnectionStateType
import typings.chromeApps.chrome.networking.onc.DeviceState
import typings.chromeApps.chrome.networking.onc.EthernetAuthenticationType
import typings.chromeApps.chrome.networking.onc.IPConfigType
import typings.chromeApps.chrome.networking.onc.IPConfigurationType
import typings.chromeApps.chrome.networking.onc.InterfaceType
import typings.chromeApps.chrome.networking.onc.ManagedObject
import typings.chromeApps.chrome.networking.onc.NetworkType
import typings.chromeApps.chrome.networking.onc.ProxySettingsType
import typings.chromeApps.chrome.networking.onc.internal.ObjectFunction
import typings.chromeApps.chrome.runtime.ChromeOSOnlyPermissions
import typings.chromeApps.chrome.runtime.DevOnly
import typings.chromeApps.chrome.runtime.JSONBasicTypes
import typings.chromeApps.chrome.runtime.KioskOnlyPermissions
import typings.chromeApps.chrome.runtime.NotAllowedAsOptionalPermissions
import typings.chromeApps.chrome.runtime.OptionalPermission
import typings.chromeApps.chrome.runtime.Permission
import typings.chromeApps.chrome.runtime.UndocumentedPermissions
import typings.chromeApps.chrome.runtime.UrlMatches
import typings.chromeApps.chrome.signedInDevices.OS
import typings.chromeApps.chrome.storage.StorageAreas
import typings.chromeApps.chrome.types.ChromeSettingScope
import typings.chromeApps.chrome.wallpaper.WallpaperLayoutType
import typings.chromeApps.chrome.webRequest.ResourceType
import typings.chromeApps.chrome.webViewRequest.DeclarativeWebRequestActionsList
import typings.chromeApps.chrome.webViewRequest.DeclarativeWebRequestEventList
import typings.chromeApps.chrome.webViewRequest.Stage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeAppsStrings {
  
  @js.native
  sealed trait `8021X`
    extends StObject
       with EthernetAuthenticationType
  inline def `8021X`: `8021X` = "8021X".asInstanceOf[`8021X`]
  
  @js.native
  sealed trait ABORT extends StObject
  inline def ABORT: ABORT = "ABORT".asInstanceOf[ABORT]
  
  @js.native
  sealed trait ABOUT_PAGE extends StObject
  inline def ABOUT_PAGE: ABOUT_PAGE = "ABOUT_PAGE".asInstanceOf[ABOUT_PAGE]
  
  @js.native
  sealed trait ACCESS_DENIED extends StObject
  inline def ACCESS_DENIED: ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[ACCESS_DENIED]
  
  @js.native
  sealed trait ADAPTIVE extends StObject
  inline def ADAPTIVE: ADAPTIVE = "ADAPTIVE".asInstanceOf[ADAPTIVE]
  
  @js.native
  sealed trait ADDED extends StObject
  inline def ADDED: ADDED = "ADDED".asInstanceOf[ADDED]
  
  @js.native
  sealed trait ADMIN extends StObject
  inline def ADMIN: ADMIN = "ADMIN".asInstanceOf[ADMIN]
  
  @js.native
  sealed trait ALL extends StObject
  inline def ALL: ALL = "ALL".asInstanceOf[ALL]
  
  @js.native
  sealed trait ANDROID extends StObject
  inline def ANDROID: ANDROID = "ANDROID".asInstanceOf[ANDROID]
  
  @js.native
  sealed trait APP_LAUNCHER extends StObject
  inline def APP_LAUNCHER: APP_LAUNCHER = "APP_LAUNCHER".asInstanceOf[APP_LAUNCHER]
  
  @js.native
  sealed trait APP_UPDATE extends StObject
  inline def APP_UPDATE: APP_UPDATE = "APP_UPDATE".asInstanceOf[APP_UPDATE]
  
  @js.native
  sealed trait ARM extends StObject
  inline def ARM: ARM = "ARM".asInstanceOf[ARM]
  
  @js.native
  sealed trait ASYNCHRONOUS extends StObject
  inline def ASYNCHRONOUS: ASYNCHRONOUS = "ASYNCHRONOUS".asInstanceOf[ASYNCHRONOUS]
  
  @js.native
  sealed trait AUDIO extends StObject
  inline def AUDIO: AUDIO = "AUDIO".asInstanceOf[AUDIO]
  
  @js.native
  sealed trait AUTHENTICATION_REQUIRED extends StObject
  inline def AUTHENTICATION_REQUIRED: AUTHENTICATION_REQUIRED = "AUTHENTICATION_REQUIRED".asInstanceOf[AUTHENTICATION_REQUIRED]
  
  @js.native
  sealed trait Activated
    extends StObject
       with ActivationStateType
  inline def Activated: Activated = "Activated".asInstanceOf[Activated]
  
  @js.native
  sealed trait Activating
    extends StObject
       with ActivationStateType
  inline def Activating: Activating = "Activating".asInstanceOf[Activating]
  
  @js.native
  sealed trait AddRequestCookie extends StObject
  inline def AddRequestCookie: AddRequestCookie = "AddRequestCookie".asInstanceOf[AddRequestCookie]
  
  @js.native
  sealed trait AddResponseCookie extends StObject
  inline def AddResponseCookie: AddResponseCookie = "AddResponseCookie".asInstanceOf[AddResponseCookie]
  
  @js.native
  sealed trait AddResponseHeader extends StObject
  inline def AddResponseHeader: AddResponseHeader = "AddResponseHeader".asInstanceOf[AddResponseHeader]
  
  @js.native
  sealed trait All_
    extends StObject
       with NetworkType
  inline def All_ : All_ = "All".asInstanceOf[All_]
  
  @js.native
  sealed trait Asterisk extends StObject
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait BACKGROUND extends StObject
  inline def BACKGROUND: BACKGROUND = "BACKGROUND".asInstanceOf[BACKGROUND]
  
  @js.native
  sealed trait BASIC extends StObject
  inline def BASIC: BASIC = "BASIC".asInstanceOf[BASIC]
  
  @js.native
  sealed trait BLUETOOTH
    extends StObject
       with DeviceType
  inline def BLUETOOTH: BLUETOOTH = "BLUETOOTH".asInstanceOf[BLUETOOTH]
  
  @js.native
  sealed trait BOTTOM extends StObject
  inline def BOTTOM: BOTTOM = "BOTTOM".asInstanceOf[BOTTOM]
  
  @js.native
  sealed trait BROWSER_ACTION extends StObject
  inline def BROWSER_ACTION: BROWSER_ACTION = "BROWSER_ACTION".asInstanceOf[BROWSER_ACTION]
  
  @js.native
  sealed trait BULK extends StObject
  inline def BULK: BULK = "BULK".asInstanceOf[BULK]
  
  @js.native
  sealed trait CAPABILITIES_NEGOTIATION_ERROR extends StObject
  inline def CAPABILITIES_NEGOTIATION_ERROR: CAPABILITIES_NEGOTIATION_ERROR = "CAPABILITIES_NEGOTIATION_ERROR".asInstanceOf[CAPABILITIES_NEGOTIATION_ERROR]
  
  @js.native
  sealed trait CDMA extends StObject
  inline def CDMA: CDMA = "CDMA".asInstanceOf[CDMA]
  
  @js.native
  sealed trait CENTER
    extends StObject
       with WallpaperLayoutType
  inline def CENTER: CENTER = "CENTER".asInstanceOf[CENTER]
  
  @js.native
  sealed trait CENTER_CROPPED
    extends StObject
       with WallpaperLayoutType
  inline def CENTER_CROPPED: CENTER_CROPPED = "CENTER_CROPPED".asInstanceOf[CENTER_CROPPED]
  
  @js.native
  sealed trait CHANGED extends StObject
  inline def CHANGED: CHANGED = "CHANGED".asInstanceOf[CHANGED]
  
  @js.native
  sealed trait CHECKBOX extends StObject
  inline def CHECKBOX: CHECKBOX = "CHECKBOX".asInstanceOf[CHECKBOX]
  
  @js.native
  sealed trait CHROME_INTERNAL extends StObject
  inline def CHROME_INTERNAL: CHROME_INTERNAL = "CHROME_INTERNAL".asInstanceOf[CHROME_INTERNAL]
  
  @js.native
  sealed trait CHROME_UPDATE extends StObject
  inline def CHROME_UPDATE: CHROME_UPDATE = "CHROME_UPDATE".asInstanceOf[CHROME_UPDATE]
  
  @js.native
  sealed trait CLASS extends StObject
  inline def CLASS: CLASS = "CLASS".asInstanceOf[CLASS]
  
  @js.native
  sealed trait COMMAND_LINE extends StObject
  inline def COMMAND_LINE: COMMAND_LINE = "COMMAND_LINE".asInstanceOf[COMMAND_LINE]
  
  @js.native
  sealed trait CONFLICTING extends StObject
  inline def CONFLICTING: CONFLICTING = "CONFLICTING".asInstanceOf[CONFLICTING]
  
  @js.native
  sealed trait CONNECTED extends StObject
  inline def CONNECTED: CONNECTED = "CONNECTED".asInstanceOf[CONNECTED]
  
  @js.native
  sealed trait CONNECTING extends StObject
  inline def CONNECTING: CONNECTING = "CONNECTING".asInstanceOf[CONNECTING]
  
  @js.native
  sealed trait CONNECTION_ERROR extends StObject
  inline def CONNECTION_ERROR: CONNECTION_ERROR = "CONNECTION_ERROR".asInstanceOf[CONNECTION_ERROR]
  
  @js.native
  sealed trait CONTEXT_MENU extends StObject
  inline def CONTEXT_MENU: CONTEXT_MENU = "CONTEXT_MENU".asInstanceOf[CONTEXT_MENU]
  
  @js.native
  sealed trait CONTROL extends StObject
  inline def CONTROL: CONTROL = "CONTROL".asInstanceOf[CONTROL]
  
  @js.native
  sealed trait CROS extends StObject
  inline def CROS: CROS = "CROS".asInstanceOf[CROS]
  
  @js.native
  sealed trait CancelRequest extends StObject
  inline def CancelRequest: CancelRequest = "CancelRequest".asInstanceOf[CancelRequest]
  
  @js.native
  sealed trait Cellular
    extends StObject
       with NetworkType
  inline def Cellular: Cellular = "Cellular".asInstanceOf[Cellular]
  
  @js.native
  sealed trait Connected_
    extends StObject
       with ConnectionStateType
  inline def Connected_ : Connected_ = "Connected".asInstanceOf[Connected_]
  
  @js.native
  sealed trait Connecting_
    extends StObject
       with ConnectionStateType
  inline def Connecting_ : Connecting_ = "Connecting".asInstanceOf[Connecting_]
  
  @js.native
  sealed trait DATA extends StObject
  inline def DATA: DATA = "DATA".asInstanceOf[DATA]
  
  @js.native
  sealed trait DELETED extends StObject
  inline def DELETED: DELETED = "DELETED".asInstanceOf[DELETED]
  
  @js.native
  sealed trait DENIED extends StObject
  inline def DENIED: DENIED = "DENIED".asInstanceOf[DENIED]
  
  @js.native
  sealed trait DEVELOPMENT extends StObject
  inline def DEVELOPMENT: DEVELOPMENT = "DEVELOPMENT".asInstanceOf[DEVELOPMENT]
  
  @js.native
  sealed trait DEVICE extends StObject
  inline def DEVICE: DEVICE = "DEVICE".asInstanceOf[DEVICE]
  
  @js.native
  sealed trait DHCP
    extends StObject
       with IPConfigType
  inline def DHCP: DHCP = "DHCP".asInstanceOf[DHCP]
  
  @js.native
  sealed trait DISABLED extends StObject
  inline def DISABLED: DISABLED = "DISABLED".asInstanceOf[DISABLED]
  
  @js.native
  sealed trait DISCONNECTED extends StObject
  inline def DISCONNECTED: DISCONNECTED = "DISCONNECTED".asInstanceOf[DISCONNECTED]
  
  @js.native
  sealed trait DISPLAY extends StObject
  inline def DISPLAY: DISPLAY = "DISPLAY".asInstanceOf[DISPLAY]
  
  @js.native
  sealed trait DevicePolicy extends StObject
  inline def DevicePolicy: DevicePolicy = "DevicePolicy".asInstanceOf[DevicePolicy]
  
  @js.native
  sealed trait Device_ extends StObject
  inline def Device_ : Device_ = "Device".asInstanceOf[Device_]
  
  @js.native
  sealed trait Direct
    extends StObject
       with ProxySettingsType
  inline def Direct: Direct = "Direct".asInstanceOf[Direct]
  
  @js.native
  sealed trait Disabled_
    extends StObject
       with DeviceState
  inline def Disabled_ : Disabled_ = "Disabled".asInstanceOf[Disabled_]
  
  @js.native
  sealed trait Disconnected_ extends StObject
  inline def Disconnected_ : Disconnected_ = "Disconnected".asInstanceOf[Disconnected_]
  
  @js.native
  sealed trait ECDSA_SIGN extends StObject
  inline def ECDSA_SIGN: ECDSA_SIGN = "ECDSA_SIGN".asInstanceOf[ECDSA_SIGN]
  
  @js.native
  sealed trait EDITABLE extends StObject
  inline def EDITABLE: EDITABLE = "EDITABLE".asInstanceOf[EDITABLE]
  
  @js.native
  sealed trait ENDPOINT extends StObject
  inline def ENDPOINT: ENDPOINT = "ENDPOINT".asInstanceOf[ENDPOINT]
  
  @js.native
  sealed trait EPHEMERAL_APP extends StObject
  inline def EPHEMERAL_APP: EPHEMERAL_APP = "EPHEMERAL_APP".asInstanceOf[EPHEMERAL_APP]
  
  @js.native
  sealed trait ERROR extends StObject
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait ERR_ABORTED
    extends StObject
       with LoadAbortReason
  inline def ERR_ABORTED: ERR_ABORTED = "ERR_ABORTED".asInstanceOf[ERR_ABORTED]
  
  @js.native
  sealed trait ERR_ADDRESS_UNREACHABLE
    extends StObject
       with LoadAbortReason
  inline def ERR_ADDRESS_UNREACHABLE: ERR_ADDRESS_UNREACHABLE = "ERR_ADDRESS_UNREACHABLE".asInstanceOf[ERR_ADDRESS_UNREACHABLE]
  
  @js.native
  sealed trait ERR_BLOCKED_BY_CLIENT
    extends StObject
       with LoadAbortReason
  inline def ERR_BLOCKED_BY_CLIENT: ERR_BLOCKED_BY_CLIENT = "ERR_BLOCKED_BY_CLIENT".asInstanceOf[ERR_BLOCKED_BY_CLIENT]
  
  @js.native
  sealed trait ERR_DISALLOWED_URL_SCHEME
    extends StObject
       with LoadAbortReason
  inline def ERR_DISALLOWED_URL_SCHEME: ERR_DISALLOWED_URL_SCHEME = "ERR_DISALLOWED_URL_SCHEME".asInstanceOf[ERR_DISALLOWED_URL_SCHEME]
  
  @js.native
  sealed trait ERR_EMPTY_RESPONSE
    extends StObject
       with LoadAbortReason
  inline def ERR_EMPTY_RESPONSE: ERR_EMPTY_RESPONSE = "ERR_EMPTY_RESPONSE".asInstanceOf[ERR_EMPTY_RESPONSE]
  
  @js.native
  sealed trait ERR_FILE_NOT_FOUND
    extends StObject
       with LoadAbortReason
  inline def ERR_FILE_NOT_FOUND: ERR_FILE_NOT_FOUND = "ERR_FILE_NOT_FOUND".asInstanceOf[ERR_FILE_NOT_FOUND]
  
  @js.native
  sealed trait ERR_INVALID_URL
    extends StObject
       with LoadAbortReason
  inline def ERR_INVALID_URL: ERR_INVALID_URL = "ERR_INVALID_URL".asInstanceOf[ERR_INVALID_URL]
  
  @js.native
  sealed trait ERR_UNKNOWN_URL_SCHEME
    extends StObject
       with LoadAbortReason
  inline def ERR_UNKNOWN_URL_SCHEME: ERR_UNKNOWN_URL_SCHEME = "ERR_UNKNOWN_URL_SCHEME".asInstanceOf[ERR_UNKNOWN_URL_SCHEME]
  
  @js.native
  sealed trait EXISTS extends StObject
  inline def EXISTS: EXISTS = "EXISTS".asInstanceOf[EXISTS]
  
  @js.native
  sealed trait EXPLICIT_FEEDBACK extends StObject
  inline def EXPLICIT_FEEDBACK: EXPLICIT_FEEDBACK = "EXPLICIT_FEEDBACK".asInstanceOf[EXPLICIT_FEEDBACK]
  
  @js.native
  sealed trait EXTENSIONS_PAGE extends StObject
  inline def EXTENSIONS_PAGE: EXTENSIONS_PAGE = "EXTENSIONS_PAGE".asInstanceOf[EXTENSIONS_PAGE]
  
  @js.native
  sealed trait EditRequestCookie extends StObject
  inline def EditRequestCookie: EditRequestCookie = "EditRequestCookie".asInstanceOf[EditRequestCookie]
  
  @js.native
  sealed trait EditResponseCookie extends StObject
  inline def EditResponseCookie: EditResponseCookie = "EditResponseCookie".asInstanceOf[EditResponseCookie]
  
  @js.native
  sealed trait Enabled
    extends StObject
       with DeviceState
  inline def Enabled: Enabled = "Enabled".asInstanceOf[Enabled]
  
  @js.native
  sealed trait Enabling
    extends StObject
       with DeviceState
  inline def Enabling: Enabling = "Enabling".asInstanceOf[Enabling]
  
  @js.native
  sealed trait Ethernet
    extends StObject
       with NetworkType
  inline def Ethernet: Ethernet = "Ethernet".asInstanceOf[Ethernet]
  
  @js.native
  sealed trait FAILED extends StObject
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FAILURE extends StObject
  inline def FAILURE: FAILURE = "FAILURE".asInstanceOf[FAILURE]
  
  @js.native
  sealed trait FEEDBACK extends StObject
  inline def FEEDBACK: FEEDBACK = "FEEDBACK".asInstanceOf[FEEDBACK]
  
  @js.native
  sealed trait FILE_HANDLER extends StObject
  inline def FILE_HANDLER: FILE_HANDLER = "FILE_HANDLER".asInstanceOf[FILE_HANDLER]
  
  @js.native
  sealed trait FIXED extends StObject
  inline def FIXED: FIXED = "FIXED".asInstanceOf[FIXED]
  
  @js.native
  sealed trait FRAME extends StObject
  inline def FRAME: FRAME = "FRAME".asInstanceOf[FRAME]
  
  @js.native
  sealed trait FRONT_MIC
    extends StObject
       with DeviceType
  inline def FRONT_MIC: FRONT_MIC = "FRONT_MIC".asInstanceOf[FRONT_MIC]
  
  @js.native
  sealed trait FULLSCREEN extends StObject
  inline def FULLSCREEN: FULLSCREEN = "FULLSCREEN".asInstanceOf[FULLSCREEN]
  
  @js.native
  sealed trait GOOG
    extends StObject
       with DisallowedKeys
  inline def GOOG: GOOG = "GOOG".asInstanceOf[GOOG]
  
  @js.native
  sealed trait GOOGDot
    extends StObject
       with DisallowedKeys
  inline def GOOGDot: GOOGDot = "GOOG.".asInstanceOf[GOOGDot]
  
  @js.native
  sealed trait GOOGLE
    extends StObject
       with DisallowedKeys
  inline def GOOGLE: GOOGLE = "GOOGLE".asInstanceOf[GOOGLE]
  
  @js.native
  sealed trait GRANTED extends StObject
  inline def GRANTED: GRANTED = "GRANTED".asInstanceOf[GRANTED]
  
  @js.native
  sealed trait GSM extends StObject
  inline def GSM: GSM = "GSM".asInstanceOf[GSM]
  
  @js.native
  sealed trait HDMI
    extends StObject
       with DeviceType
  inline def HDMI: HDMI = "HDMI".asInstanceOf[HDMI]
  
  @js.native
  sealed trait HEADPHONE
    extends StObject
       with DeviceType
  inline def HEADPHONE: HEADPHONE = "HEADPHONE".asInstanceOf[HEADPHONE]
  
  @js.native
  sealed trait HOTWORD
    extends StObject
       with DeviceType
  inline def HOTWORD: HOTWORD = "HOTWORD".asInstanceOf[HOTWORD]
  
  @js.native
  sealed trait IMAGE extends StObject
  inline def IMAGE: IMAGE = "IMAGE".asInstanceOf[IMAGE]
  
  @js.native
  sealed trait IN extends StObject
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait INITIALIZING extends StObject
  inline def INITIALIZING: INITIALIZING = "INITIALIZING".asInstanceOf[INITIALIZING]
  
  @js.native
  sealed trait INPUT
    extends StObject
       with StreamType
  inline def INPUT: INPUT = "INPUT".asInstanceOf[INPUT]
  
  @js.native
  sealed trait INSTALL extends StObject
  inline def INSTALL: INSTALL = "INSTALL".asInstanceOf[INSTALL]
  
  @js.native
  sealed trait INSTALLED_NOTIFICATION extends StObject
  inline def INSTALLED_NOTIFICATION: INSTALLED_NOTIFICATION = "INSTALLED_NOTIFICATION".asInstanceOf[INSTALLED_NOTIFICATION]
  
  @js.native
  sealed trait INTERFACE extends StObject
  inline def INTERFACE: INTERFACE = "INTERFACE".asInstanceOf[INTERFACE]
  
  @js.native
  sealed trait INTERNAL_MIC
    extends StObject
       with DeviceType
  inline def INTERNAL_MIC: INTERNAL_MIC = "INTERNAL_MIC".asInstanceOf[INTERNAL_MIC]
  
  @js.native
  sealed trait INTERNAL_SPEAKER
    extends StObject
       with DeviceType
  inline def INTERNAL_SPEAKER: INTERNAL_SPEAKER = "INTERNAL_SPEAKER".asInstanceOf[INTERNAL_SPEAKER]
  
  @js.native
  sealed trait INTERRUPT extends StObject
  inline def INTERRUPT: INTERRUPT = "INTERRUPT".asInstanceOf[INTERRUPT]
  
  @js.native
  sealed trait INVALID_OPERATION extends StObject
  inline def INVALID_OPERATION: INVALID_OPERATION = "INVALID_OPERATION".asInstanceOf[INVALID_OPERATION]
  
  @js.native
  sealed trait INVALID_PIN extends StObject
  inline def INVALID_PIN: INVALID_PIN = "INVALID_PIN".asInstanceOf[INVALID_PIN]
  
  @js.native
  sealed trait INVALID_PUK extends StObject
  inline def INVALID_PUK: INVALID_PUK = "INVALID_PUK".asInstanceOf[INVALID_PUK]
  
  @js.native
  sealed trait INVALID_URL extends StObject
  inline def INVALID_URL: INVALID_URL = "INVALID_URL".asInstanceOf[INVALID_URL]
  
  @js.native
  sealed trait IN_USE extends StObject
  inline def IN_USE: IN_USE = "IN_USE".asInstanceOf[IN_USE]
  
  @js.native
  sealed trait IO extends StObject
  inline def IO: IO = "IO".asInstanceOf[IO]
  
  @js.native
  sealed trait IPv4
    extends StObject
       with IPConfigurationType
  inline def IPv4: IPv4 = "IPv4".asInstanceOf[IPv4]
  
  @js.native
  sealed trait IPv6
    extends StObject
       with IPConfigurationType
  inline def IPv6: IPv6 = "IPv6".asInstanceOf[IPv6]
  
  @js.native
  sealed trait ISOCHRONOUS extends StObject
  inline def ISOCHRONOUS: ISOCHRONOUS = "ISOCHRONOUS".asInstanceOf[ISOCHRONOUS]
  
  @js.native
  sealed trait IgnoreRules extends StObject
  inline def IgnoreRules: IgnoreRules = "IgnoreRules".asInstanceOf[IgnoreRules]
  
  @js.native
  sealed trait KEYBOARD extends StObject
  inline def KEYBOARD: KEYBOARD = "KEYBOARD".asInstanceOf[KEYBOARD]
  
  @js.native
  sealed trait KEYBOARD_MIC
    extends StObject
       with DeviceType
  inline def KEYBOARD_MIC: KEYBOARD_MIC = "KEYBOARD_MIC".asInstanceOf[KEYBOARD_MIC]
  
  @js.native
  sealed trait KIOSK extends StObject
  inline def KIOSK: KIOSK = "KIOSK".asInstanceOf[KIOSK]
  
  @js.native
  sealed trait LAST_WRITE_WIN extends StObject
  inline def LAST_WRITE_WIN: LAST_WRITE_WIN = "LAST_WRITE_WIN".asInstanceOf[LAST_WRITE_WIN]
  
  @js.native
  sealed trait LAUNCHER extends StObject
  inline def LAUNCHER: LAUNCHER = "LAUNCHER".asInstanceOf[LAUNCHER]
  
  @js.native
  sealed trait LEFT extends StObject
  inline def LEFT: LEFT = "LEFT".asInstanceOf[LEFT]
  
  @js.native
  sealed trait LINEOUT
    extends StObject
       with DeviceType
  inline def LINEOUT: LINEOUT = "LINEOUT".asInstanceOf[LINEOUT]
  
  @js.native
  sealed trait LINK extends StObject
  inline def LINK: LINK = "LINK".asInstanceOf[LINK]
  
  @js.native
  sealed trait LINK_CHANGED extends StObject
  inline def LINK_CHANGED: LINK_CHANGED = "LINK_CHANGED".asInstanceOf[LINK_CHANGED]
  
  @js.native
  sealed trait LINK_DOWN extends StObject
  inline def LINK_DOWN: LINK_DOWN = "LINK_DOWN".asInstanceOf[LINK_DOWN]
  
  @js.native
  sealed trait LINK_UP extends StObject
  inline def LINK_UP: LINK_UP = "LINK_UP".asInstanceOf[LINK_UP]
  
  @js.native
  sealed trait LINUX extends StObject
  inline def LINUX: LINUX = "LINUX".asInstanceOf[LINUX]
  
  @js.native
  sealed trait LIST extends StObject
  inline def LIST: LIST = "LIST".asInstanceOf[LIST]
  
  @js.native
  sealed trait LOAD_AND_LAUNCH extends StObject
  inline def LOAD_AND_LAUNCH: LOAD_AND_LAUNCH = "LOAD_AND_LAUNCH".asInstanceOf[LOAD_AND_LAUNCH]
  
  @js.native
  sealed trait LOCAL_TO_REMOTE extends StObject
  inline def LOCAL_TO_REMOTE: LOCAL_TO_REMOTE = "LOCAL_TO_REMOTE".asInstanceOf[LOCAL_TO_REMOTE]
  
  @js.native
  sealed trait Lessthansignall_urlsGreaterthansign
    extends StObject
       with OptionalPermission
       with UrlMatches
  inline def Lessthansignall_urlsGreaterthansign: Lessthansignall_urlsGreaterthansign = "<all_urls>".asInstanceOf[Lessthansignall_urlsGreaterthansign]
  
  @js.native
  sealed trait MAC extends StObject
  inline def MAC: MAC = "MAC".asInstanceOf[MAC]
  
  @js.native
  sealed trait MANAGEMENT_API extends StObject
  inline def MANAGEMENT_API: MANAGEMENT_API = "MANAGEMENT_API".asInstanceOf[MANAGEMENT_API]
  
  @js.native
  sealed trait MANUAL extends StObject
  inline def MANUAL: MANUAL = "MANUAL".asInstanceOf[MANUAL]
  
  @js.native
  sealed trait MAXIMIZED extends StObject
  inline def MAXIMIZED: MAXIMIZED = "MAXIMIZED".asInstanceOf[MAXIMIZED]
  
  @js.native
  sealed trait MAX_ATTEMPTS_EXCEEDED extends StObject
  inline def MAX_ATTEMPTS_EXCEEDED: MAX_ATTEMPTS_EXCEEDED = "MAX_ATTEMPTS_EXCEEDED".asInstanceOf[MAX_ATTEMPTS_EXCEEDED]
  
  @js.native
  sealed trait MD5_SHA1
    extends StObject
       with Hash
  inline def MD5_SHA1: MD5_SHA1 = "MD5_SHA1".asInstanceOf[MD5_SHA1]
  
  @js.native
  sealed trait MEDIA_PIPELINE_ERROR extends StObject
  inline def MEDIA_PIPELINE_ERROR: MEDIA_PIPELINE_ERROR = "MEDIA_PIPELINE_ERROR".asInstanceOf[MEDIA_PIPELINE_ERROR]
  
  @js.native
  sealed trait MIC
    extends StObject
       with DeviceType
  inline def MIC: MIC = "MIC".asInstanceOf[MIC]
  
  @js.native
  sealed trait MINIMIZED extends StObject
  inline def MINIMIZED: MINIMIZED = "MINIMIZED".asInstanceOf[MINIMIZED]
  
  @js.native
  sealed trait MIPS extends StObject
  inline def MIPS: MIPS = "MIPS".asInstanceOf[MIPS]
  
  @js.native
  sealed trait MIPS64 extends StObject
  inline def MIPS64: MIPS64 = "MIPS64".asInstanceOf[MIPS64]
  
  @js.native
  sealed trait Manual_
    extends StObject
       with ProxySettingsType
  inline def Manual_ : Manual_ = "Manual".asInstanceOf[Manual_]
  
  @js.native
  sealed trait NEW_NOTE extends StObject
  inline def NEW_NOTE: NEW_NOTE = "NEW_NOTE".asInstanceOf[NEW_NOTE]
  
  @js.native
  sealed trait NEW_TAB_PAGE extends StObject
  inline def NEW_TAB_PAGE: NEW_TAB_PAGE = "NEW_TAB_PAGE".asInstanceOf[NEW_TAB_PAGE]
  
  @js.native
  sealed trait NORMAL extends StObject
  inline def NORMAL: NORMAL = "NORMAL".asInstanceOf[NORMAL]
  
  @js.native
  sealed trait NOTIFICATION extends StObject
  inline def NOTIFICATION: NOTIFICATION = "NOTIFICATION".asInstanceOf[NOTIFICATION]
  
  @js.native
  sealed trait NOT_A_DIRECTORY extends StObject
  inline def NOT_A_DIRECTORY: NOT_A_DIRECTORY = "NOT_A_DIRECTORY".asInstanceOf[NOT_A_DIRECTORY]
  
  @js.native
  sealed trait NOT_A_FILE extends StObject
  inline def NOT_A_FILE: NOT_A_FILE = "NOT_A_FILE".asInstanceOf[NOT_A_FILE]
  
  @js.native
  sealed trait NOT_EMPTY extends StObject
  inline def NOT_EMPTY: NOT_EMPTY = "NOT_EMPTY".asInstanceOf[NOT_EMPTY]
  
  @js.native
  sealed trait NOT_FOUND extends StObject
  inline def NOT_FOUND: NOT_FOUND = "NOT_FOUND".asInstanceOf[NOT_FOUND]
  
  @js.native
  sealed trait NO_MEMORY extends StObject
  inline def NO_MEMORY: NO_MEMORY = "NO_MEMORY".asInstanceOf[NO_MEMORY]
  
  @js.native
  sealed trait NO_SPACE extends StObject
  inline def NO_SPACE: NO_SPACE = "NO_SPACE".asInstanceOf[NO_SPACE]
  
  @js.native
  sealed trait NO_SUCH_DEVICE extends StObject
  inline def NO_SUCH_DEVICE: NO_SUCH_DEVICE = "NO_SUCH_DEVICE".asInstanceOf[NO_SUCH_DEVICE]
  
  @js.native
  sealed trait NO_UPDATE extends StObject
  inline def NO_UPDATE: NO_UPDATE = "NO_UPDATE".asInstanceOf[NO_UPDATE]
  
  @js.native
  sealed trait None
    extends StObject
       with EthernetAuthenticationType
  inline def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait NotActivated
    extends StObject
       with ActivationStateType
  inline def NotActivated: NotActivated = "NotActivated".asInstanceOf[NotActivated]
  
  @js.native
  sealed trait NotConnected
    extends StObject
       with ConnectionStateType
  inline def NotConnected: NotConnected = "NotConnected".asInstanceOf[NotConnected]
  
  @js.native
  sealed trait OFFLINE_NOT_NECESSARY extends StObject
  inline def OFFLINE_NOT_NECESSARY: OFFLINE_NOT_NECESSARY = "OFFLINE_NOT_NECESSARY".asInstanceOf[OFFLINE_NOT_NECESSARY]
  
  @js.native
  sealed trait OK extends StObject
  inline def OK: OK = "OK".asInstanceOf[OK]
  
  @js.native
  sealed trait OPENBSD extends StObject
  inline def OPENBSD: OPENBSD = "OPENBSD".asInstanceOf[OPENBSD]
  
  @js.native
  sealed trait OPEN_AS_PINNED_TAB extends StObject
  inline def OPEN_AS_PINNED_TAB: OPEN_AS_PINNED_TAB = "OPEN_AS_PINNED_TAB".asInstanceOf[OPEN_AS_PINNED_TAB]
  
  @js.native
  sealed trait OPEN_AS_REGULAR_TAB extends StObject
  inline def OPEN_AS_REGULAR_TAB: OPEN_AS_REGULAR_TAB = "OPEN_AS_REGULAR_TAB".asInstanceOf[OPEN_AS_REGULAR_TAB]
  
  @js.native
  sealed trait OPEN_AS_WINDOW extends StObject
  inline def OPEN_AS_WINDOW: OPEN_AS_WINDOW = "OPEN_AS_WINDOW".asInstanceOf[OPEN_AS_WINDOW]
  
  @js.native
  sealed trait OPEN_FULL_SCREEN extends StObject
  inline def OPEN_FULL_SCREEN: OPEN_FULL_SCREEN = "OPEN_FULL_SCREEN".asInstanceOf[OPEN_FULL_SCREEN]
  
  @js.native
  sealed trait OS_UPDATE extends StObject
  inline def OS_UPDATE: OS_UPDATE = "OS_UPDATE".asInstanceOf[OS_UPDATE]
  
  @js.native
  sealed trait OTHER
    extends StObject
       with DeviceType
  inline def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @js.native
  sealed trait OUT extends StObject
  inline def OUT: OUT = "OUT".asInstanceOf[OUT]
  
  @js.native
  sealed trait OUTPUT
    extends StObject
       with StreamType
  inline def OUTPUT: OUTPUT = "OUTPUT".asInstanceOf[OUTPUT]
  
  @js.native
  sealed trait Offline
    extends StObject
       with CaptivePortalStatus
  inline def Offline: Offline = "Offline".asInstanceOf[Offline]
  
  @js.native
  sealed trait Online
    extends StObject
       with CaptivePortalStatus
  inline def Online: Online = "Online".asInstanceOf[Online]
  
  @js.native
  sealed trait PAC
    extends StObject
       with ProxySettingsType
  inline def PAC: PAC = "PAC".asInstanceOf[PAC]
  
  @js.native
  sealed trait PAGE extends StObject
  inline def PAGE: PAGE = "PAGE".asInstanceOf[PAGE]
  
  @js.native
  sealed trait PAGE_ACTION extends StObject
  inline def PAGE_ACTION: PAGE_ACTION = "PAGE_ACTION".asInstanceOf[PAGE_ACTION]
  
  @js.native
  sealed trait PBC extends StObject
  inline def PBC: PBC = "PBC".asInstanceOf[PBC]
  
  @js.native
  sealed trait PENDING extends StObject
  inline def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @js.native
  sealed trait PERIODIC extends StObject
  inline def PERIODIC: PERIODIC = "PERIODIC".asInstanceOf[PERIODIC]
  
  @js.native
  sealed trait PERMISSIONS_INCREASE extends StObject
  inline def PERMISSIONS_INCREASE: PERMISSIONS_INCREASE = "PERMISSIONS_INCREASE".asInstanceOf[PERMISSIONS_INCREASE]
  
  @js.native
  sealed trait PIN extends StObject
  inline def PIN: PIN = "PIN".asInstanceOf[PIN]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait POST_DSP_LOOPBACK
    extends StObject
       with DeviceType
  inline def POST_DSP_LOOPBACK: POST_DSP_LOOPBACK = "POST_DSP_LOOPBACK".asInstanceOf[POST_DSP_LOOPBACK]
  
  @js.native
  sealed trait POST_MIX_LOOPBACK
    extends StObject
       with DeviceType
  inline def POST_MIX_LOOPBACK: POST_MIX_LOOPBACK = "POST_MIX_LOOPBACK".asInstanceOf[POST_MIX_LOOPBACK]
  
  @js.native
  sealed trait PROGRESS extends StObject
  inline def PROGRESS: PROGRESS = "PROGRESS".asInstanceOf[PROGRESS]
  
  @js.native
  sealed trait PUK extends StObject
  inline def PUK: PUK = "PUK".asInstanceOf[PUK]
  
  @js.native
  sealed trait PartiallyActivated
    extends StObject
       with ActivationStateType
  inline def PartiallyActivated: PartiallyActivated = "PartiallyActivated".asInstanceOf[PartiallyActivated]
  
  @js.native
  sealed trait Pattern
    extends StObject
       with ClientCertType
  inline def Pattern: Pattern = "Pattern".asInstanceOf[Pattern]
  
  @js.native
  sealed trait Portal
    extends StObject
       with CaptivePortalStatus
  inline def Portal: Portal = "Portal".asInstanceOf[Portal]
  
  @js.native
  sealed trait Prohibited
    extends StObject
       with DeviceState
  inline def Prohibited: Prohibited = "Prohibited".asInstanceOf[Prohibited]
  
  @js.native
  sealed trait ProxyAuthRequired
    extends StObject
       with CaptivePortalStatus
  inline def ProxyAuthRequired: ProxyAuthRequired = "ProxyAuthRequired".asInstanceOf[ProxyAuthRequired]
  
  @js.native
  sealed trait RADIO extends StObject
  inline def RADIO: RADIO = "RADIO".asInstanceOf[RADIO]
  
  @js.native
  sealed trait READ extends StObject
  inline def READ: READ = "READ".asInstanceOf[READ]
  
  @js.native
  sealed trait REAR_MIC
    extends StObject
       with DeviceType
  inline def REAR_MIC: REAR_MIC = "REAR_MIC".asInstanceOf[REAR_MIC]
  
  @js.native
  sealed trait REJECTED extends StObject
  inline def REJECTED: REJECTED = "REJECTED".asInstanceOf[REJECTED]
  
  @js.native
  sealed trait RELOAD extends StObject
  inline def RELOAD: RELOAD = "RELOAD".asInstanceOf[RELOAD]
  
  @js.native
  sealed trait REMOTE_TO_LOCAL extends StObject
  inline def REMOTE_TO_LOCAL: REMOTE_TO_LOCAL = "REMOTE_TO_LOCAL".asInstanceOf[REMOTE_TO_LOCAL]
  
  @js.native
  sealed trait REMOVABLE extends StObject
  inline def REMOVABLE: REMOVABLE = "REMOVABLE".asInstanceOf[REMOVABLE]
  
  @js.native
  sealed trait RESERVED extends StObject
  inline def RESERVED: RESERVED = "RESERVED".asInstanceOf[RESERVED]
  
  @js.native
  sealed trait RESTART extends StObject
  inline def RESTART: RESTART = "RESTART".asInstanceOf[RESTART]
  
  @js.native
  sealed trait RESUME extends StObject
  inline def RESUME: RESUME = "RESUME".asInstanceOf[RESUME]
  
  @js.native
  sealed trait RIGHT extends StObject
  inline def RIGHT: RIGHT = "RIGHT".asInstanceOf[RIGHT]
  
  @js.native
  sealed trait RSA_SIGN extends StObject
  inline def RSA_SIGN: RSA_SIGN = "RSA_SIGN".asInstanceOf[RSA_SIGN]
  
  @js.native
  sealed trait RUNNING extends StObject
  inline def RUNNING: RUNNING = "RUNNING".asInstanceOf[RUNNING]
  
  @js.native
  sealed trait ReadOnly
    extends StObject
       with FileBrowserHandleExecuteId
  inline def ReadOnly: ReadOnly = "ReadOnly".asInstanceOf[ReadOnly]
  
  @js.native
  sealed trait ReadWrite
    extends StObject
       with FileBrowserHandleExecuteId
  inline def ReadWrite: ReadWrite = "ReadWrite".asInstanceOf[ReadWrite]
  
  @js.native
  sealed trait RedirectByRegEx extends StObject
  inline def RedirectByRegEx: RedirectByRegEx = "RedirectByRegEx".asInstanceOf[RedirectByRegEx]
  
  @js.native
  sealed trait RedirectRequest extends StObject
  inline def RedirectRequest: RedirectRequest = "RedirectRequest".asInstanceOf[RedirectRequest]
  
  @js.native
  sealed trait RedirectToEmptyDocument extends StObject
  inline def RedirectToEmptyDocument: RedirectToEmptyDocument = "RedirectToEmptyDocument".asInstanceOf[RedirectToEmptyDocument]
  
  @js.native
  sealed trait RedirectToTransparentImage extends StObject
  inline def RedirectToTransparentImage: RedirectToTransparentImage = "RedirectToTransparentImage".asInstanceOf[RedirectToTransparentImage]
  
  @js.native
  sealed trait Ref
    extends StObject
       with ClientCertType
  inline def Ref: Ref = "Ref".asInstanceOf[Ref]
  
  @js.native
  sealed trait RemoveRequestCookie extends StObject
  inline def RemoveRequestCookie: RemoveRequestCookie = "RemoveRequestCookie".asInstanceOf[RemoveRequestCookie]
  
  @js.native
  sealed trait RemoveRequestHeader extends StObject
  inline def RemoveRequestHeader: RemoveRequestHeader = "RemoveRequestHeader".asInstanceOf[RemoveRequestHeader]
  
  @js.native
  sealed trait RemoveResponseCookie extends StObject
  inline def RemoveResponseCookie: RemoveResponseCookie = "RemoveResponseCookie".asInstanceOf[RemoveResponseCookie]
  
  @js.native
  sealed trait RemoveResponseHeader extends StObject
  inline def RemoveResponseHeader: RemoveResponseHeader = "RemoveResponseHeader".asInstanceOf[RemoveResponseHeader]
  
  @js.native
  sealed trait RequestMatcher extends StObject
  inline def RequestMatcher: RequestMatcher = "RequestMatcher".asInstanceOf[RequestMatcher]
  
  @js.native
  sealed trait SAVE_FOR_OFFLINE extends StObject
  inline def SAVE_FOR_OFFLINE: SAVE_FOR_OFFLINE = "SAVE_FOR_OFFLINE".asInstanceOf[SAVE_FOR_OFFLINE]
  
  @js.native
  sealed trait SCREEN extends StObject
  inline def SCREEN: SCREEN = "SCREEN".asInstanceOf[SCREEN]
  
  @js.native
  sealed trait SECURITY extends StObject
  inline def SECURITY: SECURITY = "SECURITY".asInstanceOf[SECURITY]
  
  @js.native
  sealed trait SELECTION extends StObject
  inline def SELECTION: SELECTION = "SELECTION".asInstanceOf[SELECTION]
  
  @js.native
  sealed trait SEPARATOR extends StObject
  inline def SEPARATOR: SEPARATOR = "SEPARATOR".asInstanceOf[SEPARATOR]
  
  @js.native
  sealed trait SHA1
    extends StObject
       with Hash
  inline def SHA1: SHA1 = "SHA1".asInstanceOf[SHA1]
  
  @js.native
  sealed trait SHA256
    extends StObject
       with Hash
  inline def SHA256: SHA256 = "SHA256".asInstanceOf[SHA256]
  
  @js.native
  sealed trait SHA384
    extends StObject
       with Hash
  inline def SHA384: SHA384 = "SHA384".asInstanceOf[SHA384]
  
  @js.native
  sealed trait SHA512
    extends StObject
       with Hash
  inline def SHA512: SHA512 = "SHA512".asInstanceOf[SHA512]
  
  @js.native
  sealed trait SHARE extends StObject
  inline def SHARE: SHARE = "SHARE".asInstanceOf[SHARE]
  
  @js.native
  sealed trait SHARED_MODULE_UPDATE extends StObject
  inline def SHARED_MODULE_UPDATE: SHARED_MODULE_UPDATE = "SHARED_MODULE_UPDATE".asInstanceOf[SHARED_MODULE_UPDATE]
  
  @js.native
  sealed trait SHOW_ADD_DIALOG extends StObject
  inline def SHOW_ADD_DIALOG: SHOW_ADD_DIALOG = "SHOW_ADD_DIALOG".asInstanceOf[SHOW_ADD_DIALOG]
  
  @js.native
  sealed trait SHOW_CONFIGURE_DIALOG extends StObject
  inline def SHOW_CONFIGURE_DIALOG: SHOW_CONFIGURE_DIALOG = "SHOW_CONFIGURE_DIALOG".asInstanceOf[SHOW_CONFIGURE_DIALOG]
  
  @js.native
  sealed trait SIDELOAD extends StObject
  inline def SIDELOAD: SIDELOAD = "SIDELOAD".asInstanceOf[SIDELOAD]
  
  @js.native
  sealed trait STANDARD extends StObject
  inline def STANDARD: STANDARD = "STANDARD".asInstanceOf[STANDARD]
  
  @js.native
  sealed trait STRETCH
    extends StObject
       with WallpaperLayoutType
  inline def STRETCH: STRETCH = "STRETCH".asInstanceOf[STRETCH]
  
  @js.native
  sealed trait SUCCEEDED extends StObject
  inline def SUCCEEDED: SUCCEEDED = "SUCCEEDED".asInstanceOf[SUCCEEDED]
  
  @js.native
  sealed trait SUCCESS extends StObject
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait SUSPEND extends StObject
  inline def SUSPEND: SUSPEND = "SUSPEND".asInstanceOf[SUSPEND]
  
  @js.native
  sealed trait SYNCED extends StObject
  inline def SYNCED: SYNCED = "SYNCED".asInstanceOf[SYNCED]
  
  @js.native
  sealed trait SYNCHRONOUS extends StObject
  inline def SYNCHRONOUS: SYNCHRONOUS = "SYNCHRONOUS".asInstanceOf[SYNCHRONOUS]
  
  @js.native
  sealed trait SYSTEM extends StObject
  inline def SYSTEM: SYSTEM = "SYSTEM".asInstanceOf[SYSTEM]
  
  @js.native
  sealed trait SYSTEM_TRAY extends StObject
  inline def SYSTEM_TRAY: SYSTEM_TRAY = "SYSTEM_TRAY".asInstanceOf[SYSTEM_TRAY]
  
  @js.native
  sealed trait SendMessageToExtension extends StObject
  inline def SendMessageToExtension: SendMessageToExtension = "SendMessageToExtension".asInstanceOf[SendMessageToExtension]
  
  @js.native
  sealed trait SetRequestHeader extends StObject
  inline def SetRequestHeader: SetRequestHeader = "SetRequestHeader".asInstanceOf[SetRequestHeader]
  
  @js.native
  sealed trait Static
    extends StObject
       with IPConfigType
  inline def Static: Static = "Static".asInstanceOf[Static]
  
  @js.native
  sealed trait TAB extends StObject
  inline def TAB: TAB = "TAB".asInstanceOf[TAB]
  
  @js.native
  sealed trait TEMPORARY_UNAVAILABLE extends StObject
  inline def TEMPORARY_UNAVAILABLE: TEMPORARY_UNAVAILABLE = "TEMPORARY_UNAVAILABLE".asInstanceOf[TEMPORARY_UNAVAILABLE]
  
  @js.native
  sealed trait TEST extends StObject
  inline def TEST: TEST = "TEST".asInstanceOf[TEST]
  
  @js.native
  sealed trait TEXT_HTML extends StObject
  inline def TEXT_HTML: TEXT_HTML = "TEXT_HTML".asInstanceOf[TEXT_HTML]
  
  @js.native
  sealed trait TEXT_PLAIN extends StObject
  inline def TEXT_PLAIN: TEXT_PLAIN = "TEXT_PLAIN".asInstanceOf[TEXT_PLAIN]
  
  @js.native
  sealed trait THROTTLED extends StObject
  inline def THROTTLED: THROTTLED = "THROTTLED".asInstanceOf[THROTTLED]
  
  @js.native
  sealed trait TIMEOUT_ERROR extends StObject
  inline def TIMEOUT_ERROR: TIMEOUT_ERROR = "TIMEOUT_ERROR".asInstanceOf[TIMEOUT_ERROR]
  
  @js.native
  sealed trait TOO_MANY_OPENED extends StObject
  inline def TOO_MANY_OPENED: TOO_MANY_OPENED = "TOO_MANY_OPENED".asInstanceOf[TOO_MANY_OPENED]
  
  @js.native
  sealed trait TOP extends StObject
  inline def TOP: TOP = "TOP".asInstanceOf[TOP]
  
  @js.native
  sealed trait UNHANDLED extends StObject
  inline def UNHANDLED: UNHANDLED = "UNHANDLED".asInstanceOf[UNHANDLED]
  
  @js.native
  sealed trait UNKNOWN extends StObject
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UNKNOWN_ERROR extends StObject
  inline def UNKNOWN_ERROR: UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[UNKNOWN_ERROR]
  
  @js.native
  sealed trait UNTRACKED extends StObject
  inline def UNTRACKED: UNTRACKED = "UNTRACKED".asInstanceOf[UNTRACKED]
  
  @js.native
  sealed trait UPDATE extends StObject
  inline def UPDATE: UPDATE = "UPDATE".asInstanceOf[UPDATE]
  
  @js.native
  sealed trait UPDATED extends StObject
  inline def UPDATED: UPDATED = "UPDATED".asInstanceOf[UPDATED]
  
  @js.native
  sealed trait UPDATE_AVAILABLE extends StObject
  inline def UPDATE_AVAILABLE: UPDATE_AVAILABLE = "UPDATE_AVAILABLE".asInstanceOf[UPDATE_AVAILABLE]
  
  @js.native
  sealed trait URL_HANDLER extends StObject
  inline def URL_HANDLER: URL_HANDLER = "URL_HANDLER".asInstanceOf[URL_HANDLER]
  
  @js.native
  sealed trait USB
    extends StObject
       with DeviceType
  inline def USB: USB = "USB".asInstanceOf[USB]
  
  @js.native
  sealed trait Uninitialized
    extends StObject
       with DeviceState
  inline def Uninitialized: Uninitialized = "Uninitialized".asInstanceOf[Uninitialized]
  
  @js.native
  sealed trait Unknown_
    extends StObject
       with CaptivePortalStatus
  inline def Unknown_ : Unknown_ = "Unknown".asInstanceOf[Unknown_]
  
  @js.native
  sealed trait User extends StObject
  inline def User: User = "User".asInstanceOf[User]
  
  @js.native
  sealed trait UserPolicy extends StObject
  inline def UserPolicy: UserPolicy = "UserPolicy".asInstanceOf[UserPolicy]
  
  @js.native
  sealed trait VENDOR extends StObject
  inline def VENDOR: VENDOR = "VENDOR".asInstanceOf[VENDOR]
  
  @js.native
  sealed trait VIDEO extends StObject
  inline def VIDEO: VIDEO = "VIDEO".asInstanceOf[VIDEO]
  
  @js.native
  sealed trait VPN
    extends StObject
       with NetworkType
  inline def VPN: VPN = "VPN".asInstanceOf[VPN]
  
  @js.native
  sealed trait `WEP-PSK` extends StObject
  inline def `WEP-PSK`: `WEP-PSK` = "WEP-PSK".asInstanceOf[`WEP-PSK`]
  
  @js.native
  sealed trait WIN extends StObject
  inline def WIN: WIN = "WIN".asInstanceOf[WIN]
  
  @js.native
  sealed trait WINDOW extends StObject
  inline def WINDOW: WINDOW = "WINDOW".asInstanceOf[WINDOW]
  
  @js.native
  sealed trait WI_FI extends StObject
  inline def WI_FI: WI_FI = "WI_FI".asInstanceOf[WI_FI]
  
  @js.native
  sealed trait `WPA-EAP` extends StObject
  inline def `WPA-EAP`: `WPA-EAP` = "WPA-EAP".asInstanceOf[`WPA-EAP`]
  
  @js.native
  sealed trait `WPA-PSK` extends StObject
  inline def `WPA-PSK`: `WPA-PSK` = "WPA-PSK".asInstanceOf[`WPA-PSK`]
  
  @js.native
  sealed trait WPAD
    extends StObject
       with ProxySettingsType
  inline def WPAD: WPAD = "WPAD".asInstanceOf[WPAD]
  
  @js.native
  sealed trait WRITE extends StObject
  inline def WRITE: WRITE = "WRITE".asInstanceOf[WRITE]
  
  @js.native
  sealed trait WiFi
    extends StObject
       with NetworkType
  inline def WiFi: WiFi = "WiFi".asInstanceOf[WiFi]
  
  @js.native
  sealed trait WiMAX
    extends StObject
       with NetworkType
  inline def WiMAX: WiMAX = "WiMAX".asInstanceOf[WiMAX]
  
  @js.native
  sealed trait Wireless
    extends StObject
       with NetworkType
  inline def Wireless: Wireless = "Wireless".asInstanceOf[Wireless]
  
  @js.native
  sealed trait X86_32 extends StObject
  inline def X86_32: X86_32 = "X86_32".asInstanceOf[X86_32]
  
  @js.native
  sealed trait X86_64 extends StObject
  inline def X86_64: X86_64 = "X86_64".asInstanceOf[X86_64]
  
  @js.native
  sealed trait _empty extends StObject
  inline def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait abnormal
    extends StObject
       with ExitEventReason
  inline def abnormal: abnormal = "abnormal".asInstanceOf[abnormal]
  
  @js.native
  sealed trait abort_ extends StObject
  inline def abort_ : abort_ = "abort".asInstanceOf[abort_]
  
  @js.native
  sealed trait about_page_ extends StObject
  inline def about_page_ : about_page_ = "about_page".asInstanceOf[about_page_]
  
  @js.native
  sealed trait activate extends StObject
  inline def activate: activate = "activate".asInstanceOf[activate]
  
  @js.native
  sealed trait active
    extends StObject
       with IdleState
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait adaptive_ extends StObject
  inline def adaptive_ : adaptive_ = "adaptive".asInstanceOf[adaptive_]
  
  @js.native
  sealed trait added_ extends StObject
  inline def added_ : added_ = "added".asInstanceOf[added_]
  
  @js.native
  sealed trait admin_ extends StObject
  inline def admin_ : admin_ = "admin".asInstanceOf[admin_]
  
  @js.native
  sealed trait af
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def af: af = "af".asInstanceOf[af]
  
  @js.native
  sealed trait alarms
    extends StObject
       with OptionalPermission
       with Permission
  inline def alarms: alarms = "alarms".asInstanceOf[alarms]
  
  @js.native
  sealed trait alert
    extends StObject
       with DialogMessageType
  inline def alert: alert = "alert".asInstanceOf[alert]
  
  @js.native
  sealed trait allAutoDetected extends StObject
  inline def allAutoDetected: allAutoDetected = "allAutoDetected".asInstanceOf[allAutoDetected]
  
  @js.native
  sealed trait all__
    extends StObject
       with ContextType
       with DeviceFilterType
       with MetadataOptionsType
  inline def all__ : all__ = "all".asInstanceOf[all__]
  
  @js.native
  sealed trait alwaysOnTopWindows
    extends StObject
       with OptionalPermission
       with Permission
  inline def alwaysOnTopWindows: alwaysOnTopWindows = "alwaysOnTopWindows".asInstanceOf[alwaysOnTopWindows]
  
  @js.native
  sealed trait am
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def am: am = "am".asInstanceOf[am]
  
  @js.native
  sealed trait an
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def an: an = "an".asInstanceOf[an]
  
  @js.native
  sealed trait android_
    extends StObject
       with OS
  inline def android_ : android_ = "android".asInstanceOf[android_]
  
  @js.native
  sealed trait animationcancel extends StObject
  inline def animationcancel: animationcancel = "animationcancel".asInstanceOf[animationcancel]
  
  @js.native
  sealed trait animationend extends StObject
  inline def animationend: animationend = "animationend".asInstanceOf[animationend]
  
  @js.native
  sealed trait animationiteration extends StObject
  inline def animationiteration: animationiteration = "animationiteration".asInstanceOf[animationiteration]
  
  @js.native
  sealed trait animationstart extends StObject
  inline def animationstart: animationstart = "animationstart".asInstanceOf[animationstart]
  
  @js.native
  sealed trait appDotwindowDotalpha
    extends StObject
       with DevOnly
  inline def appDotwindowDotalpha: appDotwindowDotalpha = "app.window.alpha".asInstanceOf[appDotwindowDotalpha]
  
  @js.native
  sealed trait appDotwindowDotalwaysOnTop
    extends StObject
       with OptionalPermission
       with Permission
  inline def appDotwindowDotalwaysOnTop: appDotwindowDotalwaysOnTop = "app.window.alwaysOnTop".asInstanceOf[appDotwindowDotalwaysOnTop]
  
  @js.native
  sealed trait appDotwindowDotfullscreen
    extends StObject
       with OptionalPermission
       with Permission
  inline def appDotwindowDotfullscreen: appDotwindowDotfullscreen = "app.window.fullscreen".asInstanceOf[appDotwindowDotfullscreen]
  
  @js.native
  sealed trait appDotwindowDotfullscreenDotoverrideEsc
    extends StObject
       with OptionalPermission
       with Permission
  inline def appDotwindowDotfullscreenDotoverrideEsc: appDotwindowDotfullscreenDotoverrideEsc = "app.window.fullscreen.overrideEsc".asInstanceOf[appDotwindowDotfullscreenDotoverrideEsc]
  
  @js.native
  sealed trait appDotwindowDotime
    extends StObject
       with UndocumentedPermissions
  inline def appDotwindowDotime: appDotwindowDotime = "app.window.ime".asInstanceOf[appDotwindowDotime]
  
  @js.native
  sealed trait appDotwindowDotshape
    extends StObject
       with OptionalPermission
       with Permission
  inline def appDotwindowDotshape: appDotwindowDotshape = "app.window.shape".asInstanceOf[appDotwindowDotshape]
  
  @js.native
  sealed trait app_launcher_ extends StObject
  inline def app_launcher_ : app_launcher_ = "app_launcher".asInstanceOf[app_launcher_]
  
  @js.native
  sealed trait app_update_ extends StObject
  inline def app_update_ : app_update_ = "app_update".asInstanceOf[app_update_]
  
  @js.native
  sealed trait appview
    extends StObject
       with OptionalPermission
       with Permission
  inline def appview: appview = "appview".asInstanceOf[appview]
  
  @js.native
  sealed trait ar
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ar: ar = "ar".asInstanceOf[ar]
  
  @js.native
  sealed trait ar_001
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ar_001: ar_001 = "ar_001".asInstanceOf[ar_001]
  
  @js.native
  sealed trait arm_ extends StObject
  inline def arm_ : arm_ = "arm".asInstanceOf[arm_]
  
  @js.native
  sealed trait array extends StObject
  inline def array: array = "array".asInstanceOf[array]
  
  @js.native
  sealed trait ast
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ast: ast = "ast".asInstanceOf[ast]
  
  @js.native
  sealed trait asynchronous_ extends StObject
  inline def asynchronous_ : asynchronous_ = "asynchronous".asInstanceOf[asynchronous_]
  
  @js.native
  sealed trait audioCapture
    extends StObject
       with OptionalPermission
       with Permission
  inline def audioCapture: audioCapture = "audioCapture".asInstanceOf[audioCapture]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.chromeApps.chrome.runtime.Permission because Already inherited */ @js.native
  sealed trait audio_
    extends StObject
       with ContextType
       with typings.chromeApps.chrome.bluetooth.DeviceType
       with KioskOnlyPermissions
       with MediaType
       with OptionalPermission
  inline def audio_ : audio_ = "audio".asInstanceOf[audio_]
  
  @js.native
  sealed trait authenticatedSignedWrites
    extends StObject
       with CharacteristicProperties
  inline def authenticatedSignedWrites: authenticatedSignedWrites = "authenticatedSignedWrites".asInstanceOf[authenticatedSignedWrites]
  
  @js.native
  sealed trait authentication_required_ extends StObject
  inline def authentication_required_ : authentication_required_ = "authentication_required".asInstanceOf[authentication_required_]
  
  @js.native
  sealed trait author
    extends StObject
       with CSSOrigin
  inline def author: author = "author".asInstanceOf[author]
  
  @js.native
  sealed trait auxclick extends StObject
  inline def auxclick: auxclick = "auxclick".asInstanceOf[auxclick]
  
  @js.native
  sealed trait available extends StObject
  inline def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait avx extends StObject
  inline def avx: avx = "avx".asInstanceOf[avx]
  
  @js.native
  sealed trait az
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def az: az = "az".asInstanceOf[az]
  
  @js.native
  sealed trait background_
    extends StObject
       with OptionalPermission
       with Permission
  inline def background_ : background_ = "background".asInstanceOf[background_]
  
  @js.native
  sealed trait basic_ extends StObject
  inline def basic_ : basic_ = "basic".asInstanceOf[basic_]
  
  @js.native
  sealed trait be
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def be: be = "be".asInstanceOf[be]
  
  @js.native
  sealed trait bg
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def bg: bg = "bg".asInstanceOf[bg]
  
  @js.native
  sealed trait bh
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def bh: bh = "bh".asInstanceOf[bh]
  
  @js.native
  sealed trait bluetooth_
    extends StObject
       with DeviceVendorIdSource
  inline def bluetooth_ : bluetooth_ = "bluetooth".asInstanceOf[bluetooth_]
  
  @js.native
  sealed trait blur extends StObject
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait bn
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def bn: bn = "bn".asInstanceOf[bn]
  
  @js.native
  sealed trait bottom_ extends StObject
  inline def bottom_ : bottom_ = "bottom".asInstanceOf[bottom_]
  
  @js.native
  sealed trait br
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def br: br = "br".asInstanceOf[br]
  
  @js.native
  sealed trait broadcast
    extends StObject
       with AdvertisementType
       with CharacteristicProperties
  inline def broadcast: broadcast = "broadcast".asInstanceOf[broadcast]
  
  @js.native
  sealed trait browser
    extends StObject
       with OptionalPermission
       with Permission
  inline def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait browser_action_ extends StObject
  inline def browser_action_ : browser_action_ = "browser_action".asInstanceOf[browser_action_]
  
  @js.native
  sealed trait bs
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def bs: bs = "bs".asInstanceOf[bs]
  
  @js.native
  sealed trait bulk_ extends StObject
  inline def bulk_ : bulk_ = "bulk".asInstanceOf[bulk_]
  
  @js.native
  sealed trait ca
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ca: ca = "ca".asInstanceOf[ca]
  
  @js.native
  sealed trait cancel
    extends StObject
       with ScanProgressType
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait canplay extends StObject
  inline def canplay: canplay = "canplay".asInstanceOf[canplay]
  
  @js.native
  sealed trait canplaythrough extends StObject
  inline def canplaythrough: canplaythrough = "canplaythrough".asInstanceOf[canplaythrough]
  
  @js.native
  sealed trait capabilities_negotiation_error_ extends StObject
  inline def capabilities_negotiation_error_ : capabilities_negotiation_error_ = "capabilities_negotiation_error".asInstanceOf[capabilities_negotiation_error_]
  
  @js.native
  sealed trait carAudio
    extends StObject
       with typings.chromeApps.chrome.bluetooth.DeviceType
  inline def carAudio: carAudio = "carAudio".asInstanceOf[carAudio]
  
  @js.native
  sealed trait ceb
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ceb: ceb = "ceb".asInstanceOf[ceb]
  
  @js.native
  sealed trait certificateProvider
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def certificateProvider: certificateProvider = "certificateProvider".asInstanceOf[certificateProvider]
  
  @js.native
  sealed trait change extends StObject
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait changed_ extends StObject
  inline def changed_ : changed_ = "changed".asInstanceOf[changed_]
  
  @js.native
  sealed trait checkbox_ extends StObject
  inline def checkbox_ : checkbox_ = "checkbox".asInstanceOf[checkbox_]
  
  @js.native
  sealed trait chrome extends StObject
  inline def chrome: chrome = "chrome".asInstanceOf[chrome]
  
  @js.native
  sealed trait chromeColonSlashSlashfaviconSlash
    extends StObject
       with OptionalPermission
       with UrlMatches
  inline def chromeColonSlashSlashfaviconSlash: chromeColonSlashSlashfaviconSlash = "chrome://favicon/".asInstanceOf[chromeColonSlashSlashfaviconSlash]
  
  @js.native
  sealed trait chrome_internal_ extends StObject
  inline def chrome_internal_ : chrome_internal_ = "chrome_internal".asInstanceOf[chrome_internal_]
  
  @js.native
  sealed trait chrome_os
    extends StObject
       with OS
  inline def chrome_os: chrome_os = "chrome_os".asInstanceOf[chrome_os]
  
  @js.native
  sealed trait chrome_update_ extends StObject
  inline def chrome_update_ : chrome_update_ = "chrome_update".asInstanceOf[chrome_update_]
  
  @js.native
  sealed trait ckb
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ckb: ckb = "ckb".asInstanceOf[ckb]
  
  @js.native
  sealed trait class_ extends StObject
  inline def class_ : class_ = "class".asInstanceOf[class_]
  
  @js.native
  sealed trait clear extends StObject
  inline def clear: clear = "clear".asInstanceOf[clear]
  
  @js.native
  sealed trait click extends StObject
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait clipboard
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def clipboard: clipboard = "clipboard".asInstanceOf[clipboard]
  
  @js.native
  sealed trait clipboardRead
    extends StObject
       with OptionalPermission
       with Permission
  inline def clipboardRead: clipboardRead = "clipboardRead".asInstanceOf[clipboardRead]
  
  @js.native
  sealed trait clipboardWrite
    extends StObject
       with OptionalPermission
       with Permission
  inline def clipboardWrite: clipboardWrite = "clipboardWrite".asInstanceOf[clipboardWrite]
  
  @js.native
  sealed trait close extends StObject
  inline def close: close = "close".asInstanceOf[close]
  
  @js.native
  sealed trait co
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def co: co = "co".asInstanceOf[co]
  
  @js.native
  sealed trait collapse_key
    extends StObject
       with DisallowedKeys
  inline def collapse_key: collapse_key = "collapse_key".asInstanceOf[collapse_key]
  
  @js.native
  sealed trait command_line_ extends StObject
  inline def command_line_ : command_line_ = "command_line".asInstanceOf[command_line_]
  
  @js.native
  sealed trait computer
    extends StObject
       with typings.chromeApps.chrome.bluetooth.DeviceType
  inline def computer: computer = "computer".asInstanceOf[computer]
  
  @js.native
  sealed trait confirm
    extends StObject
       with DialogMessageType
  inline def confirm: confirm = "confirm".asInstanceOf[confirm]
  
  @js.native
  sealed trait conflicting_ extends StObject
  inline def conflicting_ : conflicting_ = "conflicting".asInstanceOf[conflicting_]
  
  @js.native
  sealed trait connected__ extends StObject
  inline def connected__ : connected__ = "connected".asInstanceOf[connected__]
  
  @js.native
  sealed trait connection_error_ extends StObject
  inline def connection_error_ : connection_error_ = "connection_error".asInstanceOf[connection_error_]
  
  @js.native
  sealed trait consolemessage extends StObject
  inline def consolemessage: consolemessage = "consolemessage".asInstanceOf[consolemessage]
  
  @js.native
  sealed trait contentload extends StObject
  inline def contentload: contentload = "contentload".asInstanceOf[contentload]
  
  @js.native
  sealed trait contents_changed
    extends StObject
       with GalleryChangedType
  inline def contents_changed: contents_changed = "contents_changed".asInstanceOf[contents_changed]
  
  @js.native
  sealed trait contextMenus
    extends StObject
       with OptionalPermission
       with Permission
  inline def contextMenus: contextMenus = "contextMenus".asInstanceOf[contextMenus]
  
  @js.native
  sealed trait context_menu_ extends StObject
  inline def context_menu_ : context_menu_ = "context_menu".asInstanceOf[context_menu_]
  
  @js.native
  sealed trait contextmenu extends StObject
  inline def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  
  @js.native
  sealed trait control_ extends StObject
  inline def control_ : control_ = "control".asInstanceOf[control_]
  
  @js.native
  sealed trait controllable_by_this_extension
    extends StObject
       with LevelOfControl
       with typings.chromeApps.chrome.types.LevelOfControl
  inline def controllable_by_this_extension: controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[controllable_by_this_extension]
  
  @js.native
  sealed trait controlled_by_other_extensions
    extends StObject
       with LevelOfControl
       with typings.chromeApps.chrome.types.LevelOfControl
  inline def controlled_by_other_extensions: controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[controlled_by_other_extensions]
  
  @js.native
  sealed trait controlled_by_this_extension
    extends StObject
       with LevelOfControl
       with typings.chromeApps.chrome.types.LevelOfControl
  inline def controlled_by_this_extension: controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[controlled_by_this_extension]
  
  @js.native
  sealed trait copy extends StObject
  inline def copy: copy = "copy".asInstanceOf[copy]
  
  @js.native
  sealed trait crash
    extends StObject
       with ExitEventReason
  inline def crash: crash = "crash".asInstanceOf[crash]
  
  @js.native
  sealed trait created extends StObject
  inline def created: created = "created".asInstanceOf[created]
  
  @js.native
  sealed trait cros_ extends StObject
  inline def cros_ : cros_ = "cros".asInstanceOf[cros_]
  
  @js.native
  sealed trait cs
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def cs: cs = "cs".asInstanceOf[cs]
  
  @js.native
  sealed trait csp_report
    extends StObject
       with ResourceType
  inline def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @js.native
  sealed trait cuechange extends StObject
  inline def cuechange: cuechange = "cuechange".asInstanceOf[cuechange]
  
  @js.native
  sealed trait current_tab
    extends StObject
       with WindowOpenDisposition
  inline def current_tab: current_tab = "current_tab".asInstanceOf[current_tab]
  
  @js.native
  sealed trait cut extends StObject
  inline def cut: cut = "cut".asInstanceOf[cut]
  
  @js.native
  sealed trait cy
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def cy: cy = "cy".asInstanceOf[cy]
  
  @js.native
  sealed trait da
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def da: da = "da".asInstanceOf[da]
  
  @js.native
  sealed trait data_ extends StObject
  inline def data_ : data_ = "data".asInstanceOf[data_]
  
  @js.native
  sealed trait dblclick extends StObject
  inline def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  
  @js.native
  sealed trait de
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def de: de = "de".asInstanceOf[de]
  
  @js.native
  sealed trait `de-AT`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `de-AT`: `de-AT` = "de-AT".asInstanceOf[`de-AT`]
  
  @js.native
  sealed trait `de-CH`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `de-CH`: `de-CH` = "de-CH".asInstanceOf[`de-CH`]
  
  @js.native
  sealed trait `de-DE`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `de-DE`: `de-DE` = "de-DE".asInstanceOf[`de-DE`]
  
  @js.native
  sealed trait `de-LI`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `de-LI`: `de-LI` = "de-LI".asInstanceOf[`de-LI`]
  
  @js.native
  sealed trait debugger
    extends StObject
       with NotAllowedAsOptionalPermissions
  inline def debugger: debugger = "debugger".asInstanceOf[debugger]
  
  @js.native
  sealed trait declarativeContentDotPageStateMatcher extends StObject
  inline def declarativeContentDotPageStateMatcher: declarativeContentDotPageStateMatcher = "declarativeContent.PageStateMatcher".asInstanceOf[declarativeContentDotPageStateMatcher]
  
  @js.native
  sealed trait declarativeContentDotonAuthRequired
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonAuthRequired: declarativeContentDotonAuthRequired = "declarativeContent.onAuthRequired".asInstanceOf[declarativeContentDotonAuthRequired]
  
  @js.native
  sealed trait declarativeContentDotonBeforeRedirect
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonBeforeRedirect: declarativeContentDotonBeforeRedirect = "declarativeContent.onBeforeRedirect".asInstanceOf[declarativeContentDotonBeforeRedirect]
  
  @js.native
  sealed trait declarativeContentDotonBeforeRequest
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonBeforeRequest: declarativeContentDotonBeforeRequest = "declarativeContent.onBeforeRequest".asInstanceOf[declarativeContentDotonBeforeRequest]
  
  @js.native
  sealed trait declarativeContentDotonBeforeSendHeaders
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonBeforeSendHeaders: declarativeContentDotonBeforeSendHeaders = "declarativeContent.onBeforeSendHeaders".asInstanceOf[declarativeContentDotonBeforeSendHeaders]
  
  @js.native
  sealed trait declarativeContentDotonCompleted
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonCompleted: declarativeContentDotonCompleted = "declarativeContent.onCompleted".asInstanceOf[declarativeContentDotonCompleted]
  
  @js.native
  sealed trait declarativeContentDotonErrorOccured
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonErrorOccured: declarativeContentDotonErrorOccured = "declarativeContent.onErrorOccured".asInstanceOf[declarativeContentDotonErrorOccured]
  
  @js.native
  sealed trait declarativeContentDotonHeadersReceived
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonHeadersReceived: declarativeContentDotonHeadersReceived = "declarativeContent.onHeadersReceived".asInstanceOf[declarativeContentDotonHeadersReceived]
  
  @js.native
  sealed trait declarativeContentDotonMessage
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonMessage: declarativeContentDotonMessage = "declarativeContent.onMessage".asInstanceOf[declarativeContentDotonMessage]
  
  @js.native
  sealed trait declarativeContentDotonRequest
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonRequest: declarativeContentDotonRequest = "declarativeContent.onRequest".asInstanceOf[declarativeContentDotonRequest]
  
  @js.native
  sealed trait declarativeContentDotonResponseStarted
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonResponseStarted: declarativeContentDotonResponseStarted = "declarativeContent.onResponseStarted".asInstanceOf[declarativeContentDotonResponseStarted]
  
  @js.native
  sealed trait declarativeContentDotonSendHeaders
    extends StObject
       with DeclarativeWebRequestEventList
  inline def declarativeContentDotonSendHeaders: declarativeContentDotonSendHeaders = "declarativeContent.onSendHeaders".asInstanceOf[declarativeContentDotonSendHeaders]
  
  @js.native
  sealed trait declarativeWebRequestDotAddRequestCookie
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotAddRequestCookie: declarativeWebRequestDotAddRequestCookie = "declarativeWebRequest.AddRequestCookie".asInstanceOf[declarativeWebRequestDotAddRequestCookie]
  
  @js.native
  sealed trait declarativeWebRequestDotAddResponseCookie
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotAddResponseCookie: declarativeWebRequestDotAddResponseCookie = "declarativeWebRequest.AddResponseCookie".asInstanceOf[declarativeWebRequestDotAddResponseCookie]
  
  @js.native
  sealed trait declarativeWebRequestDotAddResponseHeader
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotAddResponseHeader: declarativeWebRequestDotAddResponseHeader = "declarativeWebRequest.AddResponseHeader".asInstanceOf[declarativeWebRequestDotAddResponseHeader]
  
  @js.native
  sealed trait declarativeWebRequestDotCancelRequest
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotCancelRequest: declarativeWebRequestDotCancelRequest = "declarativeWebRequest.CancelRequest".asInstanceOf[declarativeWebRequestDotCancelRequest]
  
  @js.native
  sealed trait declarativeWebRequestDotEditRequestCookie
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotEditRequestCookie: declarativeWebRequestDotEditRequestCookie = "declarativeWebRequest.EditRequestCookie".asInstanceOf[declarativeWebRequestDotEditRequestCookie]
  
  @js.native
  sealed trait declarativeWebRequestDotEditResponseCookie
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotEditResponseCookie: declarativeWebRequestDotEditResponseCookie = "declarativeWebRequest.EditResponseCookie".asInstanceOf[declarativeWebRequestDotEditResponseCookie]
  
  @js.native
  sealed trait declarativeWebRequestDotIgnoreRules
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotIgnoreRules: declarativeWebRequestDotIgnoreRules = "declarativeWebRequest.IgnoreRules".asInstanceOf[declarativeWebRequestDotIgnoreRules]
  
  @js.native
  sealed trait declarativeWebRequestDotRedirectByRegEx
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotRedirectByRegEx: declarativeWebRequestDotRedirectByRegEx = "declarativeWebRequest.RedirectByRegEx".asInstanceOf[declarativeWebRequestDotRedirectByRegEx]
  
  @js.native
  sealed trait declarativeWebRequestDotRedirectRequest
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotRedirectRequest: declarativeWebRequestDotRedirectRequest = "declarativeWebRequest.RedirectRequest".asInstanceOf[declarativeWebRequestDotRedirectRequest]
  
  @js.native
  sealed trait declarativeWebRequestDotRedirectToEmptyDocument
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotRedirectToEmptyDocument: declarativeWebRequestDotRedirectToEmptyDocument = "declarativeWebRequest.RedirectToEmptyDocument".asInstanceOf[declarativeWebRequestDotRedirectToEmptyDocument]
  
  @js.native
  sealed trait declarativeWebRequestDotRedirectToTransparentImage
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotRedirectToTransparentImage: declarativeWebRequestDotRedirectToTransparentImage = "declarativeWebRequest.RedirectToTransparentImage".asInstanceOf[declarativeWebRequestDotRedirectToTransparentImage]
  
  @js.native
  sealed trait declarativeWebRequestDotRemoveRequestCookie
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotRemoveRequestCookie: declarativeWebRequestDotRemoveRequestCookie = "declarativeWebRequest.RemoveRequestCookie".asInstanceOf[declarativeWebRequestDotRemoveRequestCookie]
  
  @js.native
  sealed trait declarativeWebRequestDotRemoveRequestHeader
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotRemoveRequestHeader: declarativeWebRequestDotRemoveRequestHeader = "declarativeWebRequest.RemoveRequestHeader".asInstanceOf[declarativeWebRequestDotRemoveRequestHeader]
  
  @js.native
  sealed trait declarativeWebRequestDotRemoveResponseCookie
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotRemoveResponseCookie: declarativeWebRequestDotRemoveResponseCookie = "declarativeWebRequest.RemoveResponseCookie".asInstanceOf[declarativeWebRequestDotRemoveResponseCookie]
  
  @js.native
  sealed trait declarativeWebRequestDotRemoveResponseHeader
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotRemoveResponseHeader: declarativeWebRequestDotRemoveResponseHeader = "declarativeWebRequest.RemoveResponseHeader".asInstanceOf[declarativeWebRequestDotRemoveResponseHeader]
  
  @js.native
  sealed trait declarativeWebRequestDotSendMessageToExtension
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotSendMessageToExtension: declarativeWebRequestDotSendMessageToExtension = "declarativeWebRequest.SendMessageToExtension".asInstanceOf[declarativeWebRequestDotSendMessageToExtension]
  
  @js.native
  sealed trait declarativeWebRequestDotSetRequestHeader
    extends StObject
       with DeclarativeWebRequestActionsList
  inline def declarativeWebRequestDotSetRequestHeader: declarativeWebRequestDotSetRequestHeader = "declarativeWebRequest.SetRequestHeader".asInstanceOf[declarativeWebRequestDotSetRequestHeader]
  
  @js.native
  sealed trait deleted_ extends StObject
  inline def deleted_ : deleted_ = "deleted".asInstanceOf[deleted_]
  
  @js.native
  sealed trait denied_ extends StObject
  inline def denied_ : denied_ = "denied".asInstanceOf[denied_]
  
  @js.native
  sealed trait desktopCapture
    extends StObject
       with OptionalPermission
       with Permission
  inline def desktopCapture: desktopCapture = "desktopCapture".asInstanceOf[desktopCapture]
  
  @js.native
  sealed trait desktop_or_laptop
    extends StObject
       with typings.chromeApps.chrome.signedInDevices.DeviceType
  inline def desktop_or_laptop: desktop_or_laptop = "desktop_or_laptop".asInstanceOf[desktop_or_laptop]
  
  @js.native
  sealed trait development_ extends StObject
  inline def development_ : development_ = "development".asInstanceOf[development_]
  
  @js.native
  sealed trait device__ extends StObject
  inline def device__ : device__ = "device".asInstanceOf[device__]
  
  @js.native
  sealed trait diagnostics
    extends StObject
       with DevOnly
  inline def diagnostics: diagnostics = "diagnostics".asInstanceOf[diagnostics]
  
  @js.native
  sealed trait dialog extends StObject
  inline def dialog: dialog = "dialog".asInstanceOf[dialog]
  
  @js.native
  sealed trait directory extends StObject
  inline def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait disabled__
    extends StObject
       with ZoomMode
  inline def disabled__ : disabled__ = "disabled".asInstanceOf[disabled__]
  
  @js.native
  sealed trait disconnected__
    extends StObject
       with OnReceiveErrorCode
  inline def disconnected__ : disconnected__ = "disconnected".asInstanceOf[disconnected__]
  
  @js.native
  sealed trait displaySource
    extends StObject
       with DevOnly
  inline def displaySource: displaySource = "displaySource".asInstanceOf[displaySource]
  
  @js.native
  sealed trait display_ extends StObject
  inline def display_ : display_ = "display".asInstanceOf[display_]
  
  @js.native
  sealed trait dns
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def dns: dns = "dns".asInstanceOf[dns]
  
  @js.native
  sealed trait documentScan
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def documentScan: documentScan = "documentScan".asInstanceOf[documentScan]
  
  @js.native
  sealed trait document_end
    extends StObject
       with RunAt
  inline def document_end: document_end = "document_end".asInstanceOf[document_end]
  
  @js.native
  sealed trait document_idle
    extends StObject
       with RunAt
  inline def document_idle: document_idle = "document_idle".asInstanceOf[document_idle]
  
  @js.native
  sealed trait document_start
    extends StObject
       with RunAt
  inline def document_start: document_start = "document_start".asInstanceOf[document_start]
  
  @js.native
  sealed trait download
    extends StObject
       with RequestedPermission
  inline def download: download = "download".asInstanceOf[download]
  
  @js.native
  sealed trait drag extends StObject
  inline def drag: drag = "drag".asInstanceOf[drag]
  
  @js.native
  sealed trait dragend extends StObject
  inline def dragend: dragend = "dragend".asInstanceOf[dragend]
  
  @js.native
  sealed trait dragenter extends StObject
  inline def dragenter: dragenter = "dragenter".asInstanceOf[dragenter]
  
  @js.native
  sealed trait dragexit extends StObject
  inline def dragexit: dragexit = "dragexit".asInstanceOf[dragexit]
  
  @js.native
  sealed trait dragleave extends StObject
  inline def dragleave: dragleave = "dragleave".asInstanceOf[dragleave]
  
  @js.native
  sealed trait dragover extends StObject
  inline def dragover: dragover = "dragover".asInstanceOf[dragover]
  
  @js.native
  sealed trait dragstart extends StObject
  inline def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  
  @js.native
  sealed trait drop extends StObject
  inline def drop: drop = "drop".asInstanceOf[drop]
  
  @js.native
  sealed trait durationchange extends StObject
  inline def durationchange: durationchange = "durationchange".asInstanceOf[durationchange]
  
  @js.native
  sealed trait ecdsaSign extends StObject
  inline def ecdsaSign: ecdsaSign = "ecdsaSign".asInstanceOf[ecdsaSign]
  
  @js.native
  sealed trait editable_
    extends StObject
       with ContextType
  inline def editable_ : editable_ = "editable".asInstanceOf[editable_]
  
  @js.native
  sealed trait el
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def el: el = "el".asInstanceOf[el]
  
  @js.native
  sealed trait emptied extends StObject
  inline def emptied: emptied = "emptied".asInstanceOf[emptied]
  
  @js.native
  sealed trait en
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait `en-AU`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `en-AU`: `en-AU` = "en-AU".asInstanceOf[`en-AU`]
  
  @js.native
  sealed trait `en-CA`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `en-CA`: `en-CA` = "en-CA".asInstanceOf[`en-CA`]
  
  @js.native
  sealed trait `en-GB`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `en-GB`: `en-GB` = "en-GB".asInstanceOf[`en-GB`]
  
  @js.native
  sealed trait `en-IN`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `en-IN`: `en-IN` = "en-IN".asInstanceOf[`en-IN`]
  
  @js.native
  sealed trait `en-NZ`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `en-NZ`: `en-NZ` = "en-NZ".asInstanceOf[`en-NZ`]
  
  @js.native
  sealed trait `en-US`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `en-US`: `en-US` = "en-US".asInstanceOf[`en-US`]
  
  @js.native
  sealed trait `en-ZA`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `en-ZA`: `en-ZA` = "en-ZA".asInstanceOf[`en-ZA`]
  
  @js.native
  sealed trait en_001
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def en_001: en_001 = "en_001".asInstanceOf[en_001]
  
  @js.native
  sealed trait en_150
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def en_150: en_150 = "en_150".asInstanceOf[en_150]
  
  @js.native
  sealed trait enabled_ extends StObject
  inline def enabled_ : enabled_ = "enabled".asInstanceOf[enabled_]
  
  @js.native
  sealed trait encryptAuthenticatedRead
    extends StObject
       with CharacteristicProperties
  inline def encryptAuthenticatedRead: encryptAuthenticatedRead = "encryptAuthenticatedRead".asInstanceOf[encryptAuthenticatedRead]
  
  @js.native
  sealed trait encryptAuthenticatedWrite
    extends StObject
       with CharacteristicProperties
  inline def encryptAuthenticatedWrite: encryptAuthenticatedWrite = "encryptAuthenticatedWrite".asInstanceOf[encryptAuthenticatedWrite]
  
  @js.native
  sealed trait encryptRead
    extends StObject
       with CharacteristicProperties
  inline def encryptRead: encryptRead = "encryptRead".asInstanceOf[encryptRead]
  
  @js.native
  sealed trait encryptWrite
    extends StObject
       with CharacteristicProperties
  inline def encryptWrite: encryptWrite = "encryptWrite".asInstanceOf[encryptWrite]
  
  @js.native
  sealed trait encryptedAuthenticatedRead
    extends StObject
       with DescriptorPermissions
  inline def encryptedAuthenticatedRead: encryptedAuthenticatedRead = "encryptedAuthenticatedRead".asInstanceOf[encryptedAuthenticatedRead]
  
  @js.native
  sealed trait encryptedAuthenticatedWrite
    extends StObject
       with DescriptorPermissions
  inline def encryptedAuthenticatedWrite: encryptedAuthenticatedWrite = "encryptedAuthenticatedWrite".asInstanceOf[encryptedAuthenticatedWrite]
  
  @js.native
  sealed trait encryptedRead
    extends StObject
       with DescriptorPermissions
  inline def encryptedRead: encryptedRead = "encryptedRead".asInstanceOf[encryptedRead]
  
  @js.native
  sealed trait encryptedWrite
    extends StObject
       with DescriptorPermissions
  inline def encryptedWrite: encryptedWrite = "encryptedWrite".asInstanceOf[encryptedWrite]
  
  @js.native
  sealed trait ended extends StObject
  inline def ended: ended = "ended".asInstanceOf[ended]
  
  @js.native
  sealed trait endpoint_ extends StObject
  inline def endpoint_ : endpoint_ = "endpoint".asInstanceOf[endpoint_]
  
  @js.native
  sealed trait enterpriseDotdeviceAttributes
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def enterpriseDotdeviceAttributes: enterpriseDotdeviceAttributes = "enterprise.deviceAttributes".asInstanceOf[enterpriseDotdeviceAttributes]
  
  @js.native
  sealed trait enterpriseDotplatformKeys
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def enterpriseDotplatformKeys: enterpriseDotplatformKeys = "enterprise.platformKeys".asInstanceOf[enterpriseDotplatformKeys]
  
  @js.native
  sealed trait eo
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def eo: eo = "eo".asInstanceOf[eo]
  
  @js.native
  sealed trait ephemeral_app_ extends StObject
  inline def ephemeral_app_ : ephemeral_app_ = "ephemeral_app".asInstanceOf[ephemeral_app_]
  
  @js.native
  sealed trait error_
    extends StObject
       with ScanProgressType
  inline def error_ : error_ = "error".asInstanceOf[error_]
  
  @js.native
  sealed trait es
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait `es-419`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-419`: `es-419` = "es-419".asInstanceOf[`es-419`]
  
  @js.native
  sealed trait `es-AR`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-AR`: `es-AR` = "es-AR".asInstanceOf[`es-AR`]
  
  @js.native
  sealed trait `es-CL`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-CL`: `es-CL` = "es-CL".asInstanceOf[`es-CL`]
  
  @js.native
  sealed trait `es-CO`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-CO`: `es-CO` = "es-CO".asInstanceOf[`es-CO`]
  
  @js.native
  sealed trait `es-CR`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-CR`: `es-CR` = "es-CR".asInstanceOf[`es-CR`]
  
  @js.native
  sealed trait `es-ES`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-ES`: `es-ES` = "es-ES".asInstanceOf[`es-ES`]
  
  @js.native
  sealed trait `es-HN`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-HN`: `es-HN` = "es-HN".asInstanceOf[`es-HN`]
  
  @js.native
  sealed trait `es-MX`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-MX`: `es-MX` = "es-MX".asInstanceOf[`es-MX`]
  
  @js.native
  sealed trait `es-PE`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-PE`: `es-PE` = "es-PE".asInstanceOf[`es-PE`]
  
  @js.native
  sealed trait `es-US`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-US`: `es-US` = "es-US".asInstanceOf[`es-US`]
  
  @js.native
  sealed trait `es-UY`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-UY`: `es-UY` = "es-UY".asInstanceOf[`es-UY`]
  
  @js.native
  sealed trait `es-VE`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `es-VE`: `es-VE` = "es-VE".asInstanceOf[`es-VE`]
  
  @js.native
  sealed trait et
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def et: et = "et".asInstanceOf[et]
  
  @js.native
  sealed trait eu
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def eu: eu = "eu".asInstanceOf[eu]
  
  @js.native
  sealed trait exit extends StObject
  inline def exit: exit = "exit".asInstanceOf[exit]
  
  @js.native
  sealed trait experimental
    extends StObject
       with NotAllowedAsOptionalPermissions
       with Permission
  inline def experimental: experimental = "experimental".asInstanceOf[experimental]
  
  @js.native
  sealed trait explicitFeedback extends StObject
  inline def explicitFeedback: explicitFeedback = "explicitFeedback".asInstanceOf[explicitFeedback]
  
  @js.native
  sealed trait extendedProperties
    extends StObject
       with CharacteristicProperties
  inline def extendedProperties: extendedProperties = "extendedProperties".asInstanceOf[extendedProperties]
  
  @js.native
  sealed trait `extension` extends StObject
  inline def `extension`: `extension` = "extension".asInstanceOf[`extension`]
  
  @js.native
  sealed trait extensions_page_ extends StObject
  inline def extensions_page_ : extensions_page_ = "extensions_page".asInstanceOf[extensions_page_]
  
  @js.native
  sealed trait fa
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def fa: fa = "fa".asInstanceOf[fa]
  
  @js.native
  sealed trait failed_ extends StObject
  inline def failed_ : failed_ = "failed".asInstanceOf[failed_]
  
  @js.native
  sealed trait failure_ extends StObject
  inline def failure_ : failure_ = "failure".asInstanceOf[failure_]
  
  @js.native
  sealed trait feedback_ extends StObject
  inline def feedback_ : feedback_ = "feedback".asInstanceOf[feedback_]
  
  @js.native
  sealed trait female extends StObject
  inline def female: female = "female".asInstanceOf[female]
  
  @js.native
  sealed trait fi
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def fi: fi = "fi".asInstanceOf[fi]
  
  @js.native
  sealed trait fil
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def fil: fil = "fil".asInstanceOf[fil]
  
  @js.native
  sealed trait fileBrowserHandler
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def fileBrowserHandler: fileBrowserHandler = "fileBrowserHandler".asInstanceOf[fileBrowserHandler]
  
  @js.native
  sealed trait fileColonSlashSlashSlashAsteriskSlashAsterisk
    extends StObject
       with OptionalPermission
       with UrlMatches
  inline def fileColonSlashSlashSlashAsteriskSlashAsterisk: fileColonSlashSlashSlashAsteriskSlashAsterisk = "file:///*/*".asInstanceOf[fileColonSlashSlashSlashAsteriskSlashAsterisk]
  
  @js.native
  sealed trait fileSystem
    extends StObject
       with OptionalPermission
       with Permission
  inline def fileSystem: fileSystem = "fileSystem".asInstanceOf[fileSystem]
  
  @js.native
  sealed trait fileSystemProvider
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def fileSystemProvider: fileSystemProvider = "fileSystemProvider".asInstanceOf[fileSystemProvider]
  
  @js.native
  sealed trait file_handler_ extends StObject
  inline def file_handler_ : file_handler_ = "file_handler".asInstanceOf[file_handler_]
  
  @js.native
  sealed trait filesystem_
    extends StObject
       with RequestedPermission
  inline def filesystem_ : filesystem_ = "filesystem".asInstanceOf[filesystem_]
  
  @js.native
  sealed trait findupdate extends StObject
  inline def findupdate: findupdate = "findupdate".asInstanceOf[findupdate]
  
  @js.native
  sealed trait finish
    extends StObject
       with ScanProgressType
  inline def finish: finish = "finish".asInstanceOf[finish]
  
  @js.native
  sealed trait fixed_ extends StObject
  inline def fixed_ : fixed_ = "fixed".asInstanceOf[fixed_]
  
  @js.native
  sealed trait fo
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def fo: fo = "fo".asInstanceOf[fo]
  
  @js.native
  sealed trait focus extends StObject
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait focusin extends StObject
  inline def focusin: focusin = "focusin".asInstanceOf[focusin]
  
  @js.native
  sealed trait focusout extends StObject
  inline def focusout: focusout = "focusout".asInstanceOf[focusout]
  
  @js.native
  sealed trait font
    extends StObject
       with ResourceType
  inline def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait fr
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait `fr-CA`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `fr-CA`: `fr-CA` = "fr-CA".asInstanceOf[`fr-CA`]
  
  @js.native
  sealed trait `fr-CH`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `fr-CH`: `fr-CH` = "fr-CH".asInstanceOf[`fr-CH`]
  
  @js.native
  sealed trait `fr-FR`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `fr-FR`: `fr-FR` = "fr-FR".asInstanceOf[`fr-FR`]
  
  @js.native
  sealed trait frame_
    extends StObject
       with ContextType
  inline def frame_ : frame_ = "frame".asInstanceOf[frame_]
  
  @js.native
  sealed trait full
    extends StObject
       with InterfaceType
  inline def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait fullscreen_
    extends StObject
       with RequestedPermission
       with UndocumentedPermissions
  inline def fullscreen_ : fullscreen_ = "fullscreen".asInstanceOf[fullscreen_]
  
  @js.native
  sealed trait fullscreenchange extends StObject
  inline def fullscreenchange: fullscreenchange = "fullscreenchange".asInstanceOf[fullscreenchange]
  
  @js.native
  sealed trait fullscreenerror extends StObject
  inline def fullscreenerror: fullscreenerror = "fullscreenerror".asInstanceOf[fullscreenerror]
  
  @js.native
  sealed trait fy
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def fy: fy = "fy".asInstanceOf[fy]
  
  @js.native
  sealed trait ga
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ga: ga = "ga".asInstanceOf[ga]
  
  @js.native
  sealed trait gamepad
    extends StObject
       with typings.chromeApps.chrome.bluetooth.DeviceType
  inline def gamepad: gamepad = "gamepad".asInstanceOf[gamepad]
  
  @js.native
  sealed trait gcm
    extends StObject
       with OptionalPermission
       with Permission
  inline def gcm: gcm = "gcm".asInstanceOf[gcm]
  
  @js.native
  sealed trait gd
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def gd: gd = "gd".asInstanceOf[gd]
  
  @js.native
  sealed trait geolocation
    extends StObject
       with NotAllowedAsOptionalPermissions
       with Permission
       with RequestedPermission
  inline def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @js.native
  sealed trait getter
    extends StObject
       with ObjectFunction
  inline def getter: getter = "getter".asInstanceOf[getter]
  
  @js.native
  sealed trait gl
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def gl: gl = "gl".asInstanceOf[gl]
  
  @js.native
  sealed trait gn
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def gn: gn = "gn".asInstanceOf[gn]
  
  @js.native
  sealed trait googDot
    extends StObject
       with DisallowedKeys
  inline def googDot: googDot = "goog.".asInstanceOf[googDot]
  
  @js.native
  sealed trait goog_
    extends StObject
       with DisallowedKeys
  inline def goog_ : goog_ = "goog".asInstanceOf[goog_]
  
  @js.native
  sealed trait google_
    extends StObject
       with DisallowedKeys
  inline def google_ : google_ = "google".asInstanceOf[google_]
  
  @js.native
  sealed trait gotpointercapture extends StObject
  inline def gotpointercapture: gotpointercapture = "gotpointercapture".asInstanceOf[gotpointercapture]
  
  @js.native
  sealed trait granted_ extends StObject
  inline def granted_ : granted_ = "granted".asInstanceOf[granted_]
  
  @js.native
  sealed trait gu
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def gu: gu = "gu".asInstanceOf[gu]
  
  @js.native
  sealed trait ha
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ha: ha = "ha".asInstanceOf[ha]
  
  @js.native
  sealed trait haw
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def haw: haw = "haw".asInstanceOf[haw]
  
  @js.native
  sealed trait he
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def he: he = "he".asInstanceOf[he]
  
  @js.native
  sealed trait hi
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def hi: hi = "hi".asInstanceOf[hi]
  
  @js.native
  sealed trait hid
    extends StObject
       with OptionalPermission
       with Permission
  inline def hid: hid = "hid".asInstanceOf[hid]
  
  @js.native
  sealed trait hmn
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def hmn: hmn = "hmn".asInstanceOf[hmn]
  
  @js.native
  sealed trait hosted_app extends StObject
  inline def hosted_app: hosted_app = "hosted_app".asInstanceOf[hosted_app]
  
  @js.native
  sealed trait hr
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def hr: hr = "hr".asInstanceOf[hr]
  
  @js.native
  sealed trait ht
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ht: ht = "ht".asInstanceOf[ht]
  
  @js.native
  sealed trait httpColonSlashSlashAsteriskSlashAsterisk
    extends StObject
       with OptionalPermission
       with UrlMatches
  inline def httpColonSlashSlashAsteriskSlashAsterisk: httpColonSlashSlashAsteriskSlashAsterisk = "http://*/*".asInstanceOf[httpColonSlashSlashAsteriskSlashAsterisk]
  
  @js.native
  sealed trait httpsColonSlashSlashAsteriskSlashAsterisk
    extends StObject
       with OptionalPermission
       with UrlMatches
  inline def httpsColonSlashSlashAsteriskSlashAsterisk: httpsColonSlashSlashAsteriskSlashAsterisk = "https://*/*".asInstanceOf[httpsColonSlashSlashAsteriskSlashAsterisk]
  
  @js.native
  sealed trait `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`
    extends StObject
       with OptionalPermission
       with UrlMatches
  inline def `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`: `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk` = "https://www.google-analytics.com/*".asInstanceOf[`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`]
  
  @js.native
  sealed trait httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk
    extends StObject
       with OptionalPermission
       with UrlMatches
  inline def httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk: httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk = "https://www.googleapis.com/*".asInstanceOf[httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk]
  
  @js.native
  sealed trait hu
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def hu: hu = "hu".asInstanceOf[hu]
  
  @js.native
  sealed trait hy
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def hy: hy = "hy".asInstanceOf[hy]
  
  @js.native
  sealed trait ia
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ia: ia = "ia".asInstanceOf[ia]
  
  @js.native
  sealed trait id
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def id: id = "id".asInstanceOf[id]
  
  @js.native
  sealed trait identity
    extends StObject
       with OptionalPermission
       with Permission
  inline def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait idle
    extends StObject
       with IdleState
       with OptionalPermission
       with Permission
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait if_needed
    extends StObject
       with Interactive
  inline def if_needed: if_needed = "if_needed".asInstanceOf[if_needed]
  
  @js.native
  sealed trait ig
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ig: ig = "ig".asInstanceOf[ig]
  
  @js.native
  sealed trait ignore
    extends StObject
       with WindowOpenDisposition
  inline def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait image_
    extends StObject
       with ContextType
       with MediaType
       with ResourceType
  inline def image_ : image_ = "image".asInstanceOf[image_]
  
  @js.native
  sealed trait in_ extends StObject
  inline def in_ : in_ = "in".asInstanceOf[in_]
  
  @js.native
  sealed trait in_use_ extends StObject
  inline def in_use_ : in_use_ = "in_use".asInstanceOf[in_use_]
  
  @js.native
  sealed trait incognito_persistent
    extends StObject
       with ChromeSettingScope
       with Scope
  inline def incognito_persistent: incognito_persistent = "incognito_persistent".asInstanceOf[incognito_persistent]
  
  @js.native
  sealed trait incognito_session_only
    extends StObject
       with ChromeSettingScope
       with Scope
  inline def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @js.native
  sealed trait indicate
    extends StObject
       with CharacteristicProperties
  inline def indicate: indicate = "indicate".asInstanceOf[indicate]
  
  @js.native
  sealed trait initializing_ extends StObject
  inline def initializing_ : initializing_ = "initializing".asInstanceOf[initializing_]
  
  @js.native
  sealed trait input_ extends StObject
  inline def input_ : input_ = "input".asInstanceOf[input_]
  
  @js.native
  sealed trait install_ extends StObject
  inline def install_ : install_ = "install".asInstanceOf[install_]
  
  @js.native
  sealed trait installed_notification_ extends StObject
  inline def installed_notification_ : installed_notification_ = "installed_notification".asInstanceOf[installed_notification_]
  
  @js.native
  sealed trait integer
    extends StObject
       with JSONBasicTypes
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait interface_ extends StObject
  inline def interface_ : interface_ = "interface".asInstanceOf[interface_]
  
  @js.native
  sealed trait interrupt_ extends StObject
  inline def interrupt_ : interrupt_ = "interrupt".asInstanceOf[interrupt_]
  
  @js.native
  sealed trait invalid extends StObject
  inline def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait ios
    extends StObject
       with OS
  inline def ios: ios = "ios".asInstanceOf[ios]
  
  @js.native
  sealed trait is
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def is: is = "is".asInstanceOf[is]
  
  @js.native
  sealed trait isochronous_ extends StObject
  inline def isochronous_ : isochronous_ = "isochronous".asInstanceOf[isochronous_]
  
  @js.native
  sealed trait it
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def it: it = "it".asInstanceOf[it]
  
  @js.native
  sealed trait `it-CH`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `it-CH`: `it-CH` = "it-CH".asInstanceOf[`it-CH`]
  
  @js.native
  sealed trait `it-IT`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `it-IT`: `it-IT` = "it-IT".asInstanceOf[`it-IT`]
  
  @js.native
  sealed trait ja
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ja: ja = "ja".asInstanceOf[ja]
  
  @js.native
  sealed trait joystick
    extends StObject
       with typings.chromeApps.chrome.bluetooth.DeviceType
  inline def joystick: joystick = "joystick".asInstanceOf[joystick]
  
  @js.native
  sealed trait jpeg
    extends StObject
       with ImageType
  inline def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  
  @js.native
  sealed trait jv
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def jv: jv = "jv".asInstanceOf[jv]
  
  @js.native
  sealed trait ka
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ka: ka = "ka".asInstanceOf[ka]
  
  @js.native
  sealed trait keep extends StObject
  inline def keep: keep = "keep".asInstanceOf[keep]
  
  @js.native
  sealed trait keyboardMouseCombo
    extends StObject
       with typings.chromeApps.chrome.bluetooth.DeviceType
  inline def keyboardMouseCombo: keyboardMouseCombo = "keyboardMouseCombo".asInstanceOf[keyboardMouseCombo]
  
  @js.native
  sealed trait keyboard_
    extends StObject
       with typings.chromeApps.chrome.bluetooth.DeviceType
  inline def keyboard_ : keyboard_ = "keyboard".asInstanceOf[keyboard_]
  
  @js.native
  sealed trait keydown extends StObject
  inline def keydown: keydown = "keydown".asInstanceOf[keydown]
  
  @js.native
  sealed trait keypress extends StObject
  inline def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @js.native
  sealed trait keyup extends StObject
  inline def keyup: keyup = "keyup".asInstanceOf[keyup]
  
  @js.native
  sealed trait kill
    extends StObject
       with ExitEventReason
  inline def kill: kill = "kill".asInstanceOf[kill]
  
  @js.native
  sealed trait kiosk_ extends StObject
  inline def kiosk_ : kiosk_ = "kiosk".asInstanceOf[kiosk_]
  
  @js.native
  sealed trait kk
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def kk: kk = "kk".asInstanceOf[kk]
  
  @js.native
  sealed trait km
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def km: km = "km".asInstanceOf[km]
  
  @js.native
  sealed trait kn
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def kn: kn = "kn".asInstanceOf[kn]
  
  @js.native
  sealed trait known
    extends StObject
       with DeviceFilterType
  inline def known: known = "known".asInstanceOf[known]
  
  @js.native
  sealed trait ko
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ko: ko = "ko".asInstanceOf[ko]
  
  @js.native
  sealed trait ku
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ku: ku = "ku".asInstanceOf[ku]
  
  @js.native
  sealed trait ky
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ky: ky = "ky".asInstanceOf[ky]
  
  @js.native
  sealed trait la
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def la: la = "la".asInstanceOf[la]
  
  @js.native
  sealed trait last_write_win_ extends StObject
  inline def last_write_win_ : last_write_win_ = "last_write_win".asInstanceOf[last_write_win_]
  
  @js.native
  sealed trait launcher_ extends StObject
  inline def launcher_ : launcher_ = "launcher".asInstanceOf[launcher_]
  
  @js.native
  sealed trait lb
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def lb: lb = "lb".asInstanceOf[lb]
  
  @js.native
  sealed trait left_ extends StObject
  inline def left_ : left_ = "left".asInstanceOf[left_]
  
  @js.native
  sealed trait legacy_packaged_app extends StObject
  inline def legacy_packaged_app: legacy_packaged_app = "legacy_packaged_app".asInstanceOf[legacy_packaged_app]
  
  @js.native
  sealed trait linkChanged extends StObject
  inline def linkChanged: linkChanged = "linkChanged".asInstanceOf[linkChanged]
  
  @js.native
  sealed trait linkDown extends StObject
  inline def linkDown: linkDown = "linkDown".asInstanceOf[linkDown]
  
  @js.native
  sealed trait linkUp extends StObject
  inline def linkUp: linkUp = "linkUp".asInstanceOf[linkUp]
  
  @js.native
  sealed trait link_
    extends StObject
       with ContextType
  inline def link_ : link_ = "link".asInstanceOf[link_]
  
  @js.native
  sealed trait linux_
    extends StObject
       with OS
  inline def linux_ : linux_ = "linux".asInstanceOf[linux_]
  
  @js.native
  sealed trait list_ extends StObject
  inline def list_ : list_ = "list".asInstanceOf[list_]
  
  @js.native
  sealed trait ln
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ln: ln = "ln".asInstanceOf[ln]
  
  @js.native
  sealed trait lo
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def lo: lo = "lo".asInstanceOf[lo]
  
  @js.native
  sealed trait load extends StObject
  inline def load: load = "load".asInstanceOf[load]
  
  @js.native
  sealed trait load_and_launch_ extends StObject
  inline def load_and_launch_ : load_and_launch_ = "load_and_launch".asInstanceOf[load_and_launch_]
  
  @js.native
  sealed trait loadabort extends StObject
  inline def loadabort: loadabort = "loadabort".asInstanceOf[loadabort]
  
  @js.native
  sealed trait loadcommit extends StObject
  inline def loadcommit: loadcommit = "loadcommit".asInstanceOf[loadcommit]
  
  @js.native
  sealed trait loadeddata extends StObject
  inline def loadeddata: loadeddata = "loadeddata".asInstanceOf[loadeddata]
  
  @js.native
  sealed trait loadedmetadata extends StObject
  inline def loadedmetadata: loadedmetadata = "loadedmetadata".asInstanceOf[loadedmetadata]
  
  @js.native
  sealed trait loadplugin
    extends StObject
       with RequestedPermission
  inline def loadplugin: loadplugin = "loadplugin".asInstanceOf[loadplugin]
  
  @js.native
  sealed trait loadredirect extends StObject
  inline def loadredirect: loadredirect = "loadredirect".asInstanceOf[loadredirect]
  
  @js.native
  sealed trait loadstart extends StObject
  inline def loadstart: loadstart = "loadstart".asInstanceOf[loadstart]
  
  @js.native
  sealed trait loadstop extends StObject
  inline def loadstop: loadstop = "loadstop".asInstanceOf[loadstop]
  
  @js.native
  sealed trait local
    extends StObject
       with StorageAreas
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait local_to_remote_ extends StObject
  inline def local_to_remote_ : local_to_remote_ = "local_to_remote".asInstanceOf[local_to_remote_]
  
  @js.native
  sealed trait locked
    extends StObject
       with IdleState
  inline def locked: locked = "locked".asInstanceOf[locked]
  
  @js.native
  sealed trait lostpointercapture extends StObject
  inline def lostpointercapture: lostpointercapture = "lostpointercapture".asInstanceOf[lostpointercapture]
  
  @js.native
  sealed trait lt
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def lt: lt = "lt".asInstanceOf[lt]
  
  @js.native
  sealed trait lv
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def lv: lv = "lv".asInstanceOf[lv]
  
  @js.native
  sealed trait mac_
    extends StObject
       with OS
  inline def mac_ : mac_ = "mac".asInstanceOf[mac_]
  
  @js.native
  sealed trait main_frame
    extends StObject
       with ResourceType
  inline def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @js.native
  sealed trait male extends StObject
  inline def male: male = "male".asInstanceOf[male]
  
  @js.native
  sealed trait managed
    extends StObject
       with ManagedObject
       with StorageAreas
  inline def managed: managed = "managed".asInstanceOf[managed]
  
  @js.native
  sealed trait management_api_ extends StObject
  inline def management_api_ : management_api_ = "management_api".asInstanceOf[management_api_]
  
  @js.native
  sealed trait manual__ extends StObject
  inline def manual__ : manual__ = "manual".asInstanceOf[manual__]
  
  @js.native
  sealed trait maximized_ extends StObject
  inline def maximized_ : maximized_ = "maximized".asInstanceOf[maximized_]
  
  @js.native
  sealed trait mdns
    extends StObject
       with NotAllowedAsOptionalPermissions
       with Permission
  inline def mdns: mdns = "mdns".asInstanceOf[mdns]
  
  @js.native
  sealed trait media
    extends StObject
       with RequestedPermission
       with ResourceType
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait mediaGalleries
    extends StObject
       with OptionalPermission
       with Permission
  inline def mediaGalleries: mediaGalleries = "mediaGalleries".asInstanceOf[mediaGalleries]
  
  @js.native
  sealed trait media_pipeline_error_ extends StObject
  inline def media_pipeline_error_ : media_pipeline_error_ = "media_pipeline_error".asInstanceOf[media_pipeline_error_]
  
  @js.native
  sealed trait mg
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def mg: mg = "mg".asInstanceOf[mg]
  
  @js.native
  sealed trait mi
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def mi: mi = "mi".asInstanceOf[mi]
  
  @js.native
  sealed trait mimeTypeAndTags
    extends StObject
       with MetadataOptionsType
  inline def mimeTypeAndTags: mimeTypeAndTags = "mimeTypeAndTags".asInstanceOf[mimeTypeAndTags]
  
  @js.native
  sealed trait mimeTypeOnly
    extends StObject
       with MetadataOptionsType
  inline def mimeTypeOnly: mimeTypeOnly = "mimeTypeOnly".asInstanceOf[mimeTypeOnly]
  
  @js.native
  sealed trait minimized_ extends StObject
  inline def minimized_ : minimized_ = "minimized".asInstanceOf[minimized_]
  
  @js.native
  sealed trait mips64_ extends StObject
  inline def mips64_ : mips64_ = "mips64".asInstanceOf[mips64_]
  
  @js.native
  sealed trait mips_ extends StObject
  inline def mips_ : mips_ = "mips".asInstanceOf[mips_]
  
  @js.native
  sealed trait mixed extends StObject
  inline def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait mk
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def mk: mk = "mk".asInstanceOf[mk]
  
  @js.native
  sealed trait ml
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ml: ml = "ml".asInstanceOf[ml]
  
  @js.native
  sealed trait mmx extends StObject
  inline def mmx: mmx = "mmx".asInstanceOf[mmx]
  
  @js.native
  sealed trait mn
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def mn: mn = "mn".asInstanceOf[mn]
  
  @js.native
  sealed trait mo
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def mo: mo = "mo".asInstanceOf[mo]
  
  @js.native
  sealed trait modem
    extends StObject
       with typings.chromeApps.chrome.bluetooth.DeviceType
  inline def modem: modem = "modem".asInstanceOf[modem]
  
  @js.native
  sealed trait mouse
    extends StObject
       with typings.chromeApps.chrome.bluetooth.DeviceType
  inline def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait mousedown extends StObject
  inline def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @js.native
  sealed trait mouseenter extends StObject
  inline def mouseenter: mouseenter = "mouseenter".asInstanceOf[mouseenter]
  
  @js.native
  sealed trait mouseleave extends StObject
  inline def mouseleave: mouseleave = "mouseleave".asInstanceOf[mouseleave]
  
  @js.native
  sealed trait mousemove extends StObject
  inline def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  
  @js.native
  sealed trait mouseout extends StObject
  inline def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  
  @js.native
  sealed trait mouseover extends StObject
  inline def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  
  @js.native
  sealed trait mouseup extends StObject
  inline def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  
  @js.native
  sealed trait mr
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def mr: mr = "mr".asInstanceOf[mr]
  
  @js.native
  sealed trait ms
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ms: ms = "ms".asInstanceOf[ms]
  
  @js.native
  sealed trait mt
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def mt: mt = "mt".asInstanceOf[mt]
  
  @js.native
  sealed trait my
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def my: my = "my".asInstanceOf[my]
  
  @js.native
  sealed trait nativeMessaging
    extends StObject
       with OptionalPermission
       with Permission
  inline def nativeMessaging: nativeMessaging = "nativeMessaging".asInstanceOf[nativeMessaging]
  
  @js.native
  sealed trait nb
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def nb: nb = "nb".asInstanceOf[nb]
  
  @js.native
  sealed trait ne
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ne: ne = "ne".asInstanceOf[ne]
  
  @js.native
  sealed trait network extends StObject
  inline def network: network = "network".asInstanceOf[network]
  
  @js.native
  sealed trait networkingDotconfig
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def networkingDotconfig: networkingDotconfig = "networking.config".asInstanceOf[networkingDotconfig]
  
  @js.native
  sealed trait networkingDotonc
    extends StObject
       with KioskOnlyPermissions
       with OptionalPermission
  inline def networkingDotonc: networkingDotonc = "networking.onc".asInstanceOf[networkingDotonc]
  
  @js.native
  sealed trait new_background_tab
    extends StObject
       with WindowOpenDisposition
  inline def new_background_tab: new_background_tab = "new_background_tab".asInstanceOf[new_background_tab]
  
  @js.native
  sealed trait new_foreground_tab
    extends StObject
       with WindowOpenDisposition
  inline def new_foreground_tab: new_foreground_tab = "new_foreground_tab".asInstanceOf[new_foreground_tab]
  
  @js.native
  sealed trait new_note_ extends StObject
  inline def new_note_ : new_note_ = "new_note".asInstanceOf[new_note_]
  
  @js.native
  sealed trait new_popup
    extends StObject
       with WindowOpenDisposition
  inline def new_popup: new_popup = "new_popup".asInstanceOf[new_popup]
  
  @js.native
  sealed trait new_tab_page_ extends StObject
  inline def new_tab_page_ : new_tab_page_ = "new_tab_page".asInstanceOf[new_tab_page_]
  
  @js.native
  sealed trait new_window
    extends StObject
       with WindowOpenDisposition
  inline def new_window: new_window = "new_window".asInstanceOf[new_window]
  
  @js.native
  sealed trait newwindow extends StObject
  inline def newwindow: newwindow = "newwindow".asInstanceOf[newwindow]
  
  @js.native
  sealed trait nl
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def nl: nl = "nl".asInstanceOf[nl]
  
  @js.native
  sealed trait nn
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def nn: nn = "nn".asInstanceOf[nn]
  
  @js.native
  sealed trait no
    extends StObject
       with Interactive
       with LanguageCode
       with kLanguageInfoTable
  inline def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait no_such_device_ extends StObject
  inline def no_such_device_ : no_such_device_ = "no_such_device".asInstanceOf[no_such_device_]
  
  @js.native
  sealed trait no_update_ extends StObject
  inline def no_update_ : no_update_ = "no_update".asInstanceOf[no_update_]
  
  @js.native
  sealed trait none_ extends StObject
  inline def none_ : none_ = "none".asInstanceOf[none_]
  
  @js.native
  sealed trait normal_
    extends StObject
       with ExitEventReason
  inline def normal_ : normal_ = "normal".asInstanceOf[normal_]
  
  @js.native
  sealed trait not_connected
    extends StObject
       with OnReceiveErrorCode
  inline def not_connected: not_connected = "not_connected".asInstanceOf[not_connected]
  
  @js.native
  sealed trait not_controllable
    extends StObject
       with LevelOfControl
       with typings.chromeApps.chrome.types.LevelOfControl
  inline def not_controllable: not_controllable = "not_controllable".asInstanceOf[not_controllable]
  
  @js.native
  sealed trait not_listening
    extends StObject
       with OnAcceptErrorCode
  inline def not_listening: not_listening = "not_listening".asInstanceOf[not_listening]
  
  @js.native
  sealed trait notification_ extends StObject
  inline def notification_ : notification_ = "notification".asInstanceOf[notification_]
  
  @js.native
  sealed trait notifications
    extends StObject
       with OptionalPermission
       with Permission
  inline def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @js.native
  sealed trait notify
    extends StObject
       with CharacteristicProperties
  
  @js.native
  sealed trait number
    extends StObject
       with JSONBasicTypes
  inline def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait ny
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ny: ny = "ny".asInstanceOf[ny]
  
  @js.native
  sealed trait `object`
    extends StObject
       with ResourceType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait oc
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def oc: oc = "oc".asInstanceOf[oc]
  
  @js.native
  sealed trait off extends StObject
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait om
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def om: om = "om".asInstanceOf[om]
  
  @js.native
  sealed trait on extends StObject
  inline def on: on = "on".asInstanceOf[on]
  
  @js.native
  sealed trait onAuthRequired
    extends StObject
       with Stage
  inline def onAuthRequired: onAuthRequired = "onAuthRequired".asInstanceOf[onAuthRequired]
  
  @js.native
  sealed trait onBeforeRequest
    extends StObject
       with Stage
  inline def onBeforeRequest: onBeforeRequest = "onBeforeRequest".asInstanceOf[onBeforeRequest]
  
  @js.native
  sealed trait onBeforeSendHeaders
    extends StObject
       with Stage
  inline def onBeforeSendHeaders: onBeforeSendHeaders = "onBeforeSendHeaders".asInstanceOf[onBeforeSendHeaders]
  
  @js.native
  sealed trait onHeadersReceived
    extends StObject
       with Stage
  inline def onHeadersReceived: onHeadersReceived = "onHeadersReceived".asInstanceOf[onHeadersReceived]
  
  @js.native
  sealed trait openDirectory extends StObject
  inline def openDirectory: openDirectory = "openDirectory".asInstanceOf[openDirectory]
  
  @js.native
  sealed trait openFile extends StObject
  inline def openFile: openFile = "openFile".asInstanceOf[openFile]
  
  @js.native
  sealed trait openWritableFile extends StObject
  inline def openWritableFile: openWritableFile = "openWritableFile".asInstanceOf[openWritableFile]
  
  @js.native
  sealed trait openbsd_ extends StObject
  inline def openbsd_ : openbsd_ = "openbsd".asInstanceOf[openbsd_]
  
  @js.native
  sealed trait or
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def or: or = "or".asInstanceOf[or]
  
  @js.native
  sealed trait os_update_ extends StObject
  inline def os_update_ : os_update_ = "os_update".asInstanceOf[os_update_]
  
  @js.native
  sealed trait other_
    extends StObject
       with ResourceType
  inline def other_ : other_ = "other".asInstanceOf[other_]
  
  @js.native
  sealed trait out_ extends StObject
  inline def out_ : out_ = "out".asInstanceOf[out_]
  
  @js.native
  sealed trait overrideEscFullscreen
    extends StObject
       with UndocumentedPermissions
  inline def overrideEscFullscreen: overrideEscFullscreen = "overrideEscFullscreen".asInstanceOf[overrideEscFullscreen]
  
  @js.native
  sealed trait pa
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def pa: pa = "pa".asInstanceOf[pa]
  
  @js.native
  sealed trait packaged_app extends StObject
  inline def packaged_app: packaged_app = "packaged_app".asInstanceOf[packaged_app]
  
  @js.native
  sealed trait page_
    extends StObject
       with ContextType
  inline def page_ : page_ = "page".asInstanceOf[page_]
  
  @js.native
  sealed trait page_action_ extends StObject
  inline def page_action_ : page_action_ = "page_action".asInstanceOf[page_action_]
  
  @js.native
  sealed trait panel extends StObject
  inline def panel: panel = "panel".asInstanceOf[panel]
  
  @js.native
  sealed trait partial
    extends StObject
       with InterfaceType
  inline def partial: partial = "partial".asInstanceOf[partial]
  
  @js.native
  sealed trait paste extends StObject
  inline def paste: paste = "paste".asInstanceOf[paste]
  
  @js.native
  sealed trait pause extends StObject
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait pending_ extends StObject
  inline def pending_ : pending_ = "pending".asInstanceOf[pending_]
  
  @js.native
  sealed trait `per-origin`
    extends StObject
       with ZoomMode
  inline def `per-origin`: `per-origin` = "per-origin".asInstanceOf[`per-origin`]
  
  @js.native
  sealed trait `per-view`
    extends StObject
       with ZoomMode
  inline def `per-view`: `per-view` = "per-view".asInstanceOf[`per-view`]
  
  @js.native
  sealed trait periodic_ extends StObject
  inline def periodic_ : periodic_ = "periodic".asInstanceOf[periodic_]
  
  @js.native
  sealed trait peripheral
    extends StObject
       with AdvertisementType
       with typings.chromeApps.chrome.bluetooth.DeviceType
  inline def peripheral: peripheral = "peripheral".asInstanceOf[peripheral]
  
  @js.native
  sealed trait permissionrequest extends StObject
  inline def permissionrequest: permissionrequest = "permissionrequest".asInstanceOf[permissionrequest]
  
  @js.native
  sealed trait permissions_increase_ extends StObject
  inline def permissions_increase_ : permissions_increase_ = "permissions_increase".asInstanceOf[permissions_increase_]
  
  @js.native
  sealed trait phone
    extends StObject
       with typings.chromeApps.chrome.bluetooth.DeviceType
       with typings.chromeApps.chrome.signedInDevices.DeviceType
  inline def phone: phone = "phone".asInstanceOf[phone]
  
  @js.native
  sealed trait ping
    extends StObject
       with ResourceType
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait pl
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def pl: pl = "pl".asInstanceOf[pl]
  
  @js.native
  sealed trait platformKeys
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def platformKeys: platformKeys = "platformKeys".asInstanceOf[platformKeys]
  
  @js.native
  sealed trait play extends StObject
  inline def play: play = "play".asInstanceOf[play]
  
  @js.native
  sealed trait playing extends StObject
  inline def playing: playing = "playing".asInstanceOf[playing]
  
  @js.native
  sealed trait png
    extends StObject
       with ImageType
  inline def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait pointerLock
    extends StObject
       with OptionalPermission
       with Permission
       with RequestedPermission
  inline def pointerLock: pointerLock = "pointerLock".asInstanceOf[pointerLock]
  
  @js.native
  sealed trait pointercancel extends StObject
  inline def pointercancel: pointercancel = "pointercancel".asInstanceOf[pointercancel]
  
  @js.native
  sealed trait pointerdown extends StObject
  inline def pointerdown: pointerdown = "pointerdown".asInstanceOf[pointerdown]
  
  @js.native
  sealed trait pointerenter extends StObject
  inline def pointerenter: pointerenter = "pointerenter".asInstanceOf[pointerenter]
  
  @js.native
  sealed trait pointerleave extends StObject
  inline def pointerleave: pointerleave = "pointerleave".asInstanceOf[pointerleave]
  
  @js.native
  sealed trait pointermove extends StObject
  inline def pointermove: pointermove = "pointermove".asInstanceOf[pointermove]
  
  @js.native
  sealed trait pointerout extends StObject
  inline def pointerout: pointerout = "pointerout".asInstanceOf[pointerout]
  
  @js.native
  sealed trait pointerover extends StObject
  inline def pointerover: pointerover = "pointerover".asInstanceOf[pointerover]
  
  @js.native
  sealed trait pointerup extends StObject
  inline def pointerup: pointerup = "pointerup".asInstanceOf[pointerup]
  
  @js.native
  sealed trait power
    extends StObject
       with OptionalPermission
       with Permission
  inline def power: power = "power".asInstanceOf[power]
  
  @js.native
  sealed trait printerProvider
    extends StObject
       with OptionalPermission
       with Permission
  inline def printerProvider: printerProvider = "printerProvider".asInstanceOf[printerProvider]
  
  @js.native
  sealed trait progress_ extends StObject
  inline def progress_ : progress_ = "progress".asInstanceOf[progress_]
  
  @js.native
  sealed trait prompt
    extends StObject
       with DialogMessageType
  inline def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @js.native
  sealed trait proxy
    extends StObject
       with NotAllowedAsOptionalPermissions
  inline def proxy: proxy = "proxy".asInstanceOf[proxy]
  
  @js.native
  sealed trait ps
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ps: ps = "ps".asInstanceOf[ps]
  
  @js.native
  sealed trait pt
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def pt: pt = "pt".asInstanceOf[pt]
  
  @js.native
  sealed trait `pt-BR`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `pt-BR`: `pt-BR` = "pt-BR".asInstanceOf[`pt-BR`]
  
  @js.native
  sealed trait `pt-PT`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `pt-PT`: `pt-PT` = "pt-PT".asInstanceOf[`pt-PT`]
  
  @js.native
  sealed trait qu
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def qu: qu = "qu".asInstanceOf[qu]
  
  @js.native
  sealed trait radio_ extends StObject
  inline def radio_ : radio_ = "radio".asInstanceOf[radio_]
  
  @js.native
  sealed trait ratechange extends StObject
  inline def ratechange: ratechange = "ratechange".asInstanceOf[ratechange]
  
  @js.native
  sealed trait read_
    extends StObject
       with CharacteristicProperties
       with DescriptorPermissions
  inline def read_ : read_ = "read".asInstanceOf[read_]
  
  @js.native
  sealed trait regular
    extends StObject
       with ChromeSettingScope
       with Scope
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait regular_only
    extends StObject
       with ChromeSettingScope
       with Scope
  inline def regular_only: regular_only = "regular_only".asInstanceOf[regular_only]
  
  @js.native
  sealed trait rejected_ extends StObject
  inline def rejected_ : rejected_ = "rejected".asInstanceOf[rejected_]
  
  @js.native
  sealed trait reliableWrite
    extends StObject
       with CharacteristicProperties
  inline def reliableWrite: reliableWrite = "reliableWrite".asInstanceOf[reliableWrite]
  
  @js.native
  sealed trait reload_ extends StObject
  inline def reload_ : reload_ = "reload".asInstanceOf[reload_]
  
  @js.native
  sealed trait remote_to_local_ extends StObject
  inline def remote_to_local_ : remote_to_local_ = "remote_to_local".asInstanceOf[remote_to_local_]
  
  @js.native
  sealed trait removable_ extends StObject
  inline def removable_ : removable_ = "removable".asInstanceOf[removable_]
  
  @js.native
  sealed trait removed extends StObject
  inline def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait requestFileSystem extends StObject
  inline def requestFileSystem: requestFileSystem = "requestFileSystem".asInstanceOf[requestFileSystem]
  
  @js.native
  sealed trait reserved_ extends StObject
  inline def reserved_ : reserved_ = "reserved".asInstanceOf[reserved_]
  
  @js.native
  sealed trait reset extends StObject
  inline def reset: reset = "reset".asInstanceOf[reset]
  
  @js.native
  sealed trait resize extends StObject
  inline def resize: resize = "resize".asInstanceOf[resize]
  
  @js.native
  sealed trait responsive extends StObject
  inline def responsive: responsive = "responsive".asInstanceOf[responsive]
  
  @js.native
  sealed trait restart_ extends StObject
  inline def restart_ : restart_ = "restart".asInstanceOf[restart_]
  
  @js.native
  sealed trait resume_ extends StObject
  inline def resume_ : resume_ = "resume".asInstanceOf[resume_]
  
  @js.native
  sealed trait retainEntries extends StObject
  inline def retainEntries: retainEntries = "retainEntries".asInstanceOf[retainEntries]
  
  @js.native
  sealed trait right_ extends StObject
  inline def right_ : right_ = "right".asInstanceOf[right_]
  
  @js.native
  sealed trait rm
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def rm: rm = "rm".asInstanceOf[rm]
  
  @js.native
  sealed trait ro
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ro: ro = "ro".asInstanceOf[ro]
  
  @js.native
  sealed trait rsaSign extends StObject
  inline def rsaSign: rsaSign = "rsaSign".asInstanceOf[rsaSign]
  
  @js.native
  sealed trait ru
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ru: ru = "ru".asInstanceOf[ru]
  
  @js.native
  sealed trait running_ extends StObject
  inline def running_ : running_ = "running".asInstanceOf[running_]
  
  @js.native
  sealed trait runtime
    extends StObject
       with OptionalPermission
       with Permission
  inline def runtime: runtime = "runtime".asInstanceOf[runtime]
  
  @js.native
  sealed trait saveFile extends StObject
  inline def saveFile: saveFile = "saveFile".asInstanceOf[saveFile]
  
  @js.native
  sealed trait save_to_disk
    extends StObject
       with WindowOpenDisposition
  inline def save_to_disk: save_to_disk = "save_to_disk".asInstanceOf[save_to_disk]
  
  @js.native
  sealed trait screen_ extends StObject
  inline def screen_ : screen_ = "screen".asInstanceOf[screen_]
  
  @js.native
  sealed trait script
    extends StObject
       with ResourceType
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait scroll extends StObject
  inline def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @js.native
  sealed trait sd
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def sd: sd = "sd".asInstanceOf[sd]
  
  @js.native
  sealed trait securitypolicyviolation extends StObject
  inline def securitypolicyviolation: securitypolicyviolation = "securitypolicyviolation".asInstanceOf[securitypolicyviolation]
  
  @js.native
  sealed trait seeked extends StObject
  inline def seeked: seeked = "seeked".asInstanceOf[seeked]
  
  @js.native
  sealed trait seeking extends StObject
  inline def seeking: seeking = "seeking".asInstanceOf[seeking]
  
  @js.native
  sealed trait select extends StObject
  inline def select: select = "select".asInstanceOf[select]
  
  @js.native
  sealed trait selection_
    extends StObject
       with ContextType
  inline def selection_ : selection_ = "selection".asInstanceOf[selection_]
  
  @js.native
  sealed trait selectionchange extends StObject
  inline def selectionchange: selectionchange = "selectionchange".asInstanceOf[selectionchange]
  
  @js.native
  sealed trait selectstart extends StObject
  inline def selectstart: selectstart = "selectstart".asInstanceOf[selectstart]
  
  @js.native
  sealed trait separator_ extends StObject
  inline def separator_ : separator_ = "separator".asInstanceOf[separator_]
  
  @js.native
  sealed trait serial
    extends StObject
       with OptionalPermission
       with Permission
  inline def serial: serial = "serial".asInstanceOf[serial]
  
  @js.native
  sealed trait serviceType extends StObject
  inline def serviceType: serviceType = "serviceType".asInstanceOf[serviceType]
  
  @js.native
  sealed trait setter
    extends StObject
       with ObjectFunction
  inline def setter: setter = "setter".asInstanceOf[setter]
  
  @js.native
  sealed trait sh
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def sh: sh = "sh".asInstanceOf[sh]
  
  @js.native
  sealed trait shared_module_update_ extends StObject
  inline def shared_module_update_ : shared_module_update_ = "shared_module_update".asInstanceOf[shared_module_update_]
  
  @js.native
  sealed trait shell extends StObject
  inline def shell: shell = "shell".asInstanceOf[shell]
  
  @js.native
  sealed trait showAddDialog extends StObject
  inline def showAddDialog: showAddDialog = "showAddDialog".asInstanceOf[showAddDialog]
  
  @js.native
  sealed trait showConfigureDialog extends StObject
  inline def showConfigureDialog: showConfigureDialog = "showConfigureDialog".asInstanceOf[showConfigureDialog]
  
  @js.native
  sealed trait si
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def si: si = "si".asInstanceOf[si]
  
  @js.native
  sealed trait sideload_ extends StObject
  inline def sideload_ : sideload_ = "sideload".asInstanceOf[sideload_]
  
  @js.native
  sealed trait signedInDevices
    extends StObject
       with DevOnly
  inline def signedInDevices: signedInDevices = "signedInDevices".asInstanceOf[signedInDevices]
  
  @js.native
  sealed trait `sim-pin` extends StObject
  inline def `sim-pin`: `sim-pin` = "sim-pin".asInstanceOf[`sim-pin`]
  
  @js.native
  sealed trait `sim-puk` extends StObject
  inline def `sim-puk`: `sim-puk` = "sim-puk".asInstanceOf[`sim-puk`]
  
  @js.native
  sealed trait sizechanged extends StObject
  inline def sizechanged: sizechanged = "sizechanged".asInstanceOf[sizechanged]
  
  @js.native
  sealed trait sk
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def sk: sk = "sk".asInstanceOf[sk]
  
  @js.native
  sealed trait sl
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def sl: sl = "sl".asInstanceOf[sl]
  
  @js.native
  sealed trait sm
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def sm: sm = "sm".asInstanceOf[sm]
  
  @js.native
  sealed trait sn
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def sn: sn = "sn".asInstanceOf[sn]
  
  @js.native
  sealed trait so
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def so: so = "so".asInstanceOf[so]
  
  @js.native
  sealed trait socket
    extends StObject
       with OptionalPermission
  inline def socket: socket = "socket".asInstanceOf[socket]
  
  @js.native
  sealed trait sq
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def sq: sq = "sq".asInstanceOf[sq]
  
  @js.native
  sealed trait sr
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def sr: sr = "sr".asInstanceOf[sr]
  
  @js.native
  sealed trait sse extends StObject
  inline def sse: sse = "sse".asInstanceOf[sse]
  
  @js.native
  sealed trait sse2 extends StObject
  inline def sse2: sse2 = "sse2".asInstanceOf[sse2]
  
  @js.native
  sealed trait sse3 extends StObject
  inline def sse3: sse3 = "sse3".asInstanceOf[sse3]
  
  @js.native
  sealed trait sse4_1 extends StObject
  inline def sse4_1: sse4_1 = "sse4_1".asInstanceOf[sse4_1]
  
  @js.native
  sealed trait sse4_2 extends StObject
  inline def sse4_2: sse4_2 = "sse4_2".asInstanceOf[sse4_2]
  
  @js.native
  sealed trait ssse3 extends StObject
  inline def ssse3: ssse3 = "ssse3".asInstanceOf[ssse3]
  
  @js.native
  sealed trait st
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def st: st = "st".asInstanceOf[st]
  
  @js.native
  sealed trait stalled extends StObject
  inline def stalled: stalled = "stalled".asInstanceOf[stalled]
  
  @js.native
  sealed trait standard_ extends StObject
  inline def standard_ : standard_ = "standard".asInstanceOf[standard_]
  
  @js.native
  sealed trait start
    extends StObject
       with ScanProgressType
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait storage
    extends StObject
       with OptionalPermission
       with Permission
  inline def storage: storage = "storage".asInstanceOf[storage]
  
  @js.native
  sealed trait string
    extends StObject
       with JSONBasicTypes
  inline def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait stylesheet
    extends StObject
       with ResourceType
  inline def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @js.native
  sealed trait su
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def su: su = "su".asInstanceOf[su]
  
  @js.native
  sealed trait sub_frame
    extends StObject
       with ResourceType
  inline def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @js.native
  sealed trait submit extends StObject
  inline def submit: submit = "submit".asInstanceOf[submit]
  
  @js.native
  sealed trait succeeded_ extends StObject
  inline def succeeded_ : succeeded_ = "succeeded".asInstanceOf[succeeded_]
  
  @js.native
  sealed trait success_ extends StObject
  inline def success_ : success_ = "success".asInstanceOf[success_]
  
  @js.native
  sealed trait suspend_ extends StObject
  inline def suspend_ : suspend_ = "suspend".asInstanceOf[suspend_]
  
  @js.native
  sealed trait sv
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def sv: sv = "sv".asInstanceOf[sv]
  
  @js.native
  sealed trait sw
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def sw: sw = "sw".asInstanceOf[sw]
  
  @js.native
  sealed trait sync
    extends StObject
       with StorageAreas
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait syncFileSystem
    extends StObject
       with OptionalPermission
       with Permission
  inline def syncFileSystem: syncFileSystem = "syncFileSystem".asInstanceOf[syncFileSystem]
  
  @js.native
  sealed trait synced_ extends StObject
  inline def synced_ : synced_ = "synced".asInstanceOf[synced_]
  
  @js.native
  sealed trait synchronous_ extends StObject
  inline def synchronous_ : synchronous_ = "synchronous".asInstanceOf[synchronous_]
  
  @js.native
  sealed trait systemDotcpu
    extends StObject
       with OptionalPermission
       with Permission
  inline def systemDotcpu: systemDotcpu = "system.cpu".asInstanceOf[systemDotcpu]
  
  @js.native
  sealed trait systemDotdisplay
    extends StObject
       with OptionalPermission
       with Permission
  inline def systemDotdisplay: systemDotdisplay = "system.display".asInstanceOf[systemDotdisplay]
  
  @js.native
  sealed trait systemDotmemory
    extends StObject
       with OptionalPermission
       with Permission
  inline def systemDotmemory: systemDotmemory = "system.memory".asInstanceOf[systemDotmemory]
  
  @js.native
  sealed trait systemDotnetwork
    extends StObject
       with OptionalPermission
       with Permission
  inline def systemDotnetwork: systemDotnetwork = "system.network".asInstanceOf[systemDotnetwork]
  
  @js.native
  sealed trait systemDotpowerSource
    extends StObject
       with KioskOnlyPermissions
       with OptionalPermission
  inline def systemDotpowerSource: systemDotpowerSource = "system.powerSource".asInstanceOf[systemDotpowerSource]
  
  @js.native
  sealed trait systemDotstorage
    extends StObject
       with OptionalPermission
       with Permission
  inline def systemDotstorage: systemDotstorage = "system.storage".asInstanceOf[systemDotstorage]
  
  @js.native
  sealed trait system_ extends StObject
  inline def system_ : system_ = "system".asInstanceOf[system_]
  
  @js.native
  sealed trait system_error
    extends StObject
       with OnAcceptErrorCode
       with OnReceiveErrorCode
  inline def system_error: system_error = "system_error".asInstanceOf[system_error]
  
  @js.native
  sealed trait system_tray_ extends StObject
  inline def system_tray_ : system_tray_ = "system_tray".asInstanceOf[system_tray_]
  
  @js.native
  sealed trait ta
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ta: ta = "ta".asInstanceOf[ta]
  
  @js.native
  sealed trait tab_ extends StObject
  inline def tab_ : tab_ = "tab".asInstanceOf[tab_]
  
  @js.native
  sealed trait tablet
    extends StObject
       with typings.chromeApps.chrome.bluetooth.DeviceType
       with typings.chromeApps.chrome.signedInDevices.DeviceType
  inline def tablet: tablet = "tablet".asInstanceOf[tablet]
  
  @js.native
  sealed trait te
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def te: te = "te".asInstanceOf[te]
  
  @js.native
  sealed trait temporary_unavailable_ extends StObject
  inline def temporary_unavailable_ : temporary_unavailable_ = "temporary_unavailable".asInstanceOf[temporary_unavailable_]
  
  @js.native
  sealed trait test_ extends StObject
  inline def test_ : test_ = "test".asInstanceOf[test_]
  
  @js.native
  sealed trait textHtml extends StObject
  inline def textHtml: textHtml = "textHtml".asInstanceOf[textHtml]
  
  @js.native
  sealed trait textPlain extends StObject
  inline def textPlain: textPlain = "textPlain".asInstanceOf[textPlain]
  
  @js.native
  sealed trait tg
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def tg: tg = "tg".asInstanceOf[tg]
  
  @js.native
  sealed trait th
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def th: th = "th".asInstanceOf[th]
  
  @js.native
  sealed trait theme extends StObject
  inline def theme: theme = "theme".asInstanceOf[theme]
  
  @js.native
  sealed trait throttled_ extends StObject
  inline def throttled_ : throttled_ = "throttled".asInstanceOf[throttled_]
  
  @js.native
  sealed trait ti
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ti: ti = "ti".asInstanceOf[ti]
  
  @js.native
  sealed trait timeout_error_ extends StObject
  inline def timeout_error_ : timeout_error_ = "timeout_error".asInstanceOf[timeout_error_]
  
  @js.native
  sealed trait timeupdate extends StObject
  inline def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
  
  @js.native
  sealed trait tk
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def tk: tk = "tk".asInstanceOf[tk]
  
  @js.native
  sealed trait tls1 extends StObject
  inline def tls1: tls1 = "tls1".asInstanceOf[tls1]
  
  @js.native
  sealed trait tls1Dot1 extends StObject
  inline def tls1Dot1: tls1Dot1 = "tls1.1".asInstanceOf[tls1Dot1]
  
  @js.native
  sealed trait tls1Dot2 extends StObject
  inline def tls1Dot2: tls1Dot2 = "tls1.2".asInstanceOf[tls1Dot2]
  
  @js.native
  sealed trait tls1Dot3 extends StObject
  inline def tls1Dot3: tls1Dot3 = "tls1.3".asInstanceOf[tls1Dot3]
  
  @js.native
  sealed trait to
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def to: to = "to".asInstanceOf[to]
  
  @js.native
  sealed trait toggle extends StObject
  inline def toggle: toggle = "toggle".asInstanceOf[toggle]
  
  @js.native
  sealed trait top_ extends StObject
  inline def top_ : top_ = "top".asInstanceOf[top_]
  
  @js.native
  sealed trait touchcancel extends StObject
  inline def touchcancel: touchcancel = "touchcancel".asInstanceOf[touchcancel]
  
  @js.native
  sealed trait touchend extends StObject
  inline def touchend: touchend = "touchend".asInstanceOf[touchend]
  
  @js.native
  sealed trait touchmove extends StObject
  inline def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  
  @js.native
  sealed trait touchstart extends StObject
  inline def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  
  @js.native
  sealed trait tr
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def tr: tr = "tr".asInstanceOf[tr]
  
  @js.native
  sealed trait transitioncancel extends StObject
  inline def transitioncancel: transitioncancel = "transitioncancel".asInstanceOf[transitioncancel]
  
  @js.native
  sealed trait transitionend extends StObject
  inline def transitionend: transitionend = "transitionend".asInstanceOf[transitionend]
  
  @js.native
  sealed trait transitionrun extends StObject
  inline def transitionrun: transitionrun = "transitionrun".asInstanceOf[transitionrun]
  
  @js.native
  sealed trait transitionstart extends StObject
  inline def transitionstart: transitionstart = "transitionstart".asInstanceOf[transitionstart]
  
  @js.native
  sealed trait tt
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def tt: tt = "tt".asInstanceOf[tt]
  
  @js.native
  sealed trait tts
    extends StObject
       with NotAllowedAsOptionalPermissions
       with Permission
  inline def tts: tts = "tts".asInstanceOf[tts]
  
  @js.native
  sealed trait tw
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def tw: tw = "tw".asInstanceOf[tw]
  
  @js.native
  sealed trait ug
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ug: ug = "ug".asInstanceOf[ug]
  
  @js.native
  sealed trait uk
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def uk: uk = "uk".asInstanceOf[uk]
  
  @js.native
  sealed trait und
    extends StObject
       with LanguageCode
  inline def und: und = "und".asInstanceOf[und]
  
  @js.native
  sealed trait unhandled_ extends StObject
  inline def unhandled_ : unhandled_ = "unhandled".asInstanceOf[unhandled_]
  
  @js.native
  sealed trait unknown__
    extends StObject
       with typings.chromeApps.chrome.signedInDevices.DeviceType
       with OS
       with ObjectFunction
  inline def unknown__ : unknown__ = "unknown".asInstanceOf[unknown__]
  
  @js.native
  sealed trait unknown_error_ extends StObject
  inline def unknown_error_ : unknown_error_ = "unknown_error".asInstanceOf[unknown_error_]
  
  @js.native
  sealed trait unlimitedStorage
    extends StObject
       with OptionalPermission
       with Permission
  inline def unlimitedStorage: unlimitedStorage = "unlimitedStorage".asInstanceOf[unlimitedStorage]
  
  @js.native
  sealed trait unmanaged
    extends StObject
       with ManagedObject
  inline def unmanaged: unmanaged = "unmanaged".asInstanceOf[unmanaged]
  
  @js.native
  sealed trait unresponsive extends StObject
  inline def unresponsive: unresponsive = "unresponsive".asInstanceOf[unresponsive]
  
  @js.native
  sealed trait untracked_ extends StObject
  inline def untracked_ : untracked_ = "untracked".asInstanceOf[untracked_]
  
  @js.native
  sealed trait update_ extends StObject
  inline def update_ : update_ = "update".asInstanceOf[update_]
  
  @js.native
  sealed trait update_available_ extends StObject
  inline def update_available_ : update_available_ = "update_available".asInstanceOf[update_available_]
  
  @js.native
  sealed trait updated_ extends StObject
  inline def updated_ : updated_ = "updated".asInstanceOf[updated_]
  
  @js.native
  sealed trait ur
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def ur: ur = "ur".asInstanceOf[ur]
  
  @js.native
  sealed trait url_handler_ extends StObject
  inline def url_handler_ : url_handler_ = "url_handler".asInstanceOf[url_handler_]
  
  @js.native
  sealed trait usbDevices
    extends StObject
       with OptionalPermission
       with Permission
  inline def usbDevices: usbDevices = "usbDevices".asInstanceOf[usbDevices]
  
  @js.native
  sealed trait usb_
    extends StObject
       with DeviceVendorIdSource
       with OptionalPermission
       with Permission
  inline def usb_ : usb_ = "usb".asInstanceOf[usb_]
  
  @js.native
  sealed trait user_
    extends StObject
       with CSSOrigin
  inline def user_ : user_ = "user".asInstanceOf[user_]
  
  @js.native
  sealed trait uz
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def uz: uz = "uz".asInstanceOf[uz]
  
  @js.native
  sealed trait vendor_ extends StObject
  inline def vendor_ : vendor_ = "vendor".asInstanceOf[vendor_]
  
  @js.native
  sealed trait vi
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def vi: vi = "vi".asInstanceOf[vi]
  
  @js.native
  sealed trait videoCapture
    extends StObject
       with OptionalPermission
       with Permission
  inline def videoCapture: videoCapture = "videoCapture".asInstanceOf[videoCapture]
  
  @js.native
  sealed trait video_
    extends StObject
       with ContextType
       with typings.chromeApps.chrome.bluetooth.DeviceType
       with MediaType
  inline def video_ : video_ = "video".asInstanceOf[video_]
  
  @js.native
  sealed trait virtualKeyboard
    extends StObject
       with KioskOnlyPermissions
       with OptionalPermission
  inline def virtualKeyboard: virtualKeyboard = "virtualKeyboard".asInstanceOf[virtualKeyboard]
  
  @js.native
  sealed trait volumechange extends StObject
  inline def volumechange: volumechange = "volumechange".asInstanceOf[volumechange]
  
  @js.native
  sealed trait vpnProvider
    extends StObject
       with ChromeOSOnlyPermissions
       with OptionalPermission
  inline def vpnProvider: vpnProvider = "vpnProvider".asInstanceOf[vpnProvider]
  
  @js.native
  sealed trait wa
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def wa: wa = "wa".asInstanceOf[wa]
  
  @js.native
  sealed trait waiting extends StObject
  inline def waiting: waiting = "waiting".asInstanceOf[waiting]
  
  @js.native
  sealed trait wallpaper
    extends StObject
       with ChromeOSOnlyPermissions
       with NotAllowedAsOptionalPermissions
  inline def wallpaper: wallpaper = "wallpaper".asInstanceOf[wallpaper]
  
  @js.native
  sealed trait watch_dropped
    extends StObject
       with GalleryChangedType
  inline def watch_dropped: watch_dropped = "watch_dropped".asInstanceOf[watch_dropped]
  
  @js.native
  sealed trait webgl extends StObject
  inline def webgl: webgl = "webgl".asInstanceOf[webgl]
  
  @js.native
  sealed trait websocket
    extends StObject
       with ResourceType
  inline def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait webview
    extends StObject
       with OptionalPermission
       with Permission
  inline def webview: webview = "webview".asInstanceOf[webview]
  
  @js.native
  sealed trait wheel extends StObject
  inline def wheel: wheel = "wheel".asInstanceOf[wheel]
  
  @js.native
  sealed trait win_
    extends StObject
       with OS
  inline def win_ : win_ = "win".asInstanceOf[win_]
  
  @js.native
  sealed trait window_ extends StObject
  inline def window_ : window_ = "window".asInstanceOf[window_]
  
  @js.native
  sealed trait writableAuxiliaries
    extends StObject
       with CharacteristicProperties
  inline def writableAuxiliaries: writableAuxiliaries = "writableAuxiliaries".asInstanceOf[writableAuxiliaries]
  
  @js.native
  sealed trait writeWithoutResponse
    extends StObject
       with CharacteristicProperties
  inline def writeWithoutResponse: writeWithoutResponse = "writeWithoutResponse".asInstanceOf[writeWithoutResponse]
  
  @js.native
  sealed trait write_
    extends StObject
       with CharacteristicProperties
       with DescriptorPermissions
  inline def write_ : write_ = "write".asInstanceOf[write_]
  
  @js.native
  sealed trait `x86-32` extends StObject
  inline def `x86-32`: `x86-32` = "x86-32".asInstanceOf[`x86-32`]
  
  @js.native
  sealed trait `x86-64` extends StObject
  inline def `x86-64`: `x86-64` = "x86-64".asInstanceOf[`x86-64`]
  
  @js.native
  sealed trait xh
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def xh: xh = "xh".asInstanceOf[xh]
  
  @js.native
  sealed trait xmlhttprequest
    extends StObject
       with ResourceType
  inline def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  
  @js.native
  sealed trait yes
    extends StObject
       with Interactive
  inline def yes: yes = "yes".asInstanceOf[yes]
  
  @js.native
  sealed trait yi
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def yi: yi = "yi".asInstanceOf[yi]
  
  @js.native
  sealed trait yo
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def yo: yo = "yo".asInstanceOf[yo]
  
  @js.native
  sealed trait zh
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def zh: zh = "zh".asInstanceOf[zh]
  
  @js.native
  sealed trait `zh-CN`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `zh-CN`: `zh-CN` = "zh-CN".asInstanceOf[`zh-CN`]
  
  @js.native
  sealed trait `zh-HK`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `zh-HK`: `zh-HK` = "zh-HK".asInstanceOf[`zh-HK`]
  
  @js.native
  sealed trait `zh-TW`
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def `zh-TW`: `zh-TW` = "zh-TW".asInstanceOf[`zh-TW`]
  
  @js.native
  sealed trait zh_hans_cn
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def zh_hans_cn: zh_hans_cn = "zh_hans_cn".asInstanceOf[zh_hans_cn]
  
  @js.native
  sealed trait zh_hans_sg
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def zh_hans_sg: zh_hans_sg = "zh_hans_sg".asInstanceOf[zh_hans_sg]
  
  @js.native
  sealed trait zh_hant_hk
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def zh_hant_hk: zh_hant_hk = "zh_hant_hk".asInstanceOf[zh_hant_hk]
  
  @js.native
  sealed trait zh_hant_mo
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def zh_hant_mo: zh_hant_mo = "zh_hant_mo".asInstanceOf[zh_hant_mo]
  
  @js.native
  sealed trait zh_hant_tw
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def zh_hant_tw: zh_hant_tw = "zh_hant_tw".asInstanceOf[zh_hant_tw]
  
  @js.native
  sealed trait zoomchange extends StObject
  inline def zoomchange: zoomchange = "zoomchange".asInstanceOf[zoomchange]
  
  @js.native
  sealed trait zu
    extends StObject
       with LanguageCode
       with kLanguageInfoTable
  inline def zu: zu = "zu".asInstanceOf[zu]
}
