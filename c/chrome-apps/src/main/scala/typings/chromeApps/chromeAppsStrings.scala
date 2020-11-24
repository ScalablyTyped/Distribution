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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeAppsStrings {
  
  @scala.inline
  def `8021X`: `8021X` = "8021X".asInstanceOf[`8021X`]
  
  @scala.inline
  def ABORT: ABORT = "ABORT".asInstanceOf[ABORT]
  
  @scala.inline
  def ABOUT_PAGE: ABOUT_PAGE = "ABOUT_PAGE".asInstanceOf[ABOUT_PAGE]
  
  @scala.inline
  def ACCESS_DENIED: ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[ACCESS_DENIED]
  
  @scala.inline
  def ADAPTIVE: ADAPTIVE = "ADAPTIVE".asInstanceOf[ADAPTIVE]
  
  @scala.inline
  def ADDED: ADDED = "ADDED".asInstanceOf[ADDED]
  
  @scala.inline
  def ADMIN: ADMIN = "ADMIN".asInstanceOf[ADMIN]
  
  @scala.inline
  def ALL: ALL = "ALL".asInstanceOf[ALL]
  
  @scala.inline
  def ANDROID: ANDROID = "ANDROID".asInstanceOf[ANDROID]
  
  @scala.inline
  def APP_LAUNCHER: APP_LAUNCHER = "APP_LAUNCHER".asInstanceOf[APP_LAUNCHER]
  
  @scala.inline
  def APP_UPDATE: APP_UPDATE = "APP_UPDATE".asInstanceOf[APP_UPDATE]
  
  @scala.inline
  def ARM: ARM = "ARM".asInstanceOf[ARM]
  
  @scala.inline
  def ASYNCHRONOUS: ASYNCHRONOUS = "ASYNCHRONOUS".asInstanceOf[ASYNCHRONOUS]
  
  @scala.inline
  def AUDIO: AUDIO = "AUDIO".asInstanceOf[AUDIO]
  
  @scala.inline
  def AUTHENTICATION_REQUIRED: AUTHENTICATION_REQUIRED = "AUTHENTICATION_REQUIRED".asInstanceOf[AUTHENTICATION_REQUIRED]
  
  @scala.inline
  def Activated: Activated = "Activated".asInstanceOf[Activated]
  
  @scala.inline
  def Activating: Activating = "Activating".asInstanceOf[Activating]
  
  @scala.inline
  def AddRequestCookie: AddRequestCookie = "AddRequestCookie".asInstanceOf[AddRequestCookie]
  
  @scala.inline
  def AddResponseCookie: AddResponseCookie = "AddResponseCookie".asInstanceOf[AddResponseCookie]
  
  @scala.inline
  def AddResponseHeader: AddResponseHeader = "AddResponseHeader".asInstanceOf[AddResponseHeader]
  
  @scala.inline
  def All_ : All_ = "All".asInstanceOf[All_]
  
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @scala.inline
  def BACKGROUND: BACKGROUND = "BACKGROUND".asInstanceOf[BACKGROUND]
  
  @scala.inline
  def BASIC: BASIC = "BASIC".asInstanceOf[BASIC]
  
  @scala.inline
  def BLUETOOTH: BLUETOOTH = "BLUETOOTH".asInstanceOf[BLUETOOTH]
  
  @scala.inline
  def BOTTOM: BOTTOM = "BOTTOM".asInstanceOf[BOTTOM]
  
  @scala.inline
  def BROWSER_ACTION: BROWSER_ACTION = "BROWSER_ACTION".asInstanceOf[BROWSER_ACTION]
  
  @scala.inline
  def BULK: BULK = "BULK".asInstanceOf[BULK]
  
  @scala.inline
  def CAPABILITIES_NEGOTIATION_ERROR: CAPABILITIES_NEGOTIATION_ERROR = "CAPABILITIES_NEGOTIATION_ERROR".asInstanceOf[CAPABILITIES_NEGOTIATION_ERROR]
  
  @scala.inline
  def CDMA: CDMA = "CDMA".asInstanceOf[CDMA]
  
  @scala.inline
  def CENTER: CENTER = "CENTER".asInstanceOf[CENTER]
  
  @scala.inline
  def CENTER_CROPPED: CENTER_CROPPED = "CENTER_CROPPED".asInstanceOf[CENTER_CROPPED]
  
  @scala.inline
  def CHANGED: CHANGED = "CHANGED".asInstanceOf[CHANGED]
  
  @scala.inline
  def CHECKBOX: CHECKBOX = "CHECKBOX".asInstanceOf[CHECKBOX]
  
  @scala.inline
  def CHROME_INTERNAL: CHROME_INTERNAL = "CHROME_INTERNAL".asInstanceOf[CHROME_INTERNAL]
  
  @scala.inline
  def CHROME_UPDATE: CHROME_UPDATE = "CHROME_UPDATE".asInstanceOf[CHROME_UPDATE]
  
  @scala.inline
  def CLASS: CLASS = "CLASS".asInstanceOf[CLASS]
  
  @scala.inline
  def COMMAND_LINE: COMMAND_LINE = "COMMAND_LINE".asInstanceOf[COMMAND_LINE]
  
  @scala.inline
  def CONFLICTING: CONFLICTING = "CONFLICTING".asInstanceOf[CONFLICTING]
  
  @scala.inline
  def CONNECTED: CONNECTED = "CONNECTED".asInstanceOf[CONNECTED]
  
  @scala.inline
  def CONNECTING: CONNECTING = "CONNECTING".asInstanceOf[CONNECTING]
  
  @scala.inline
  def CONNECTION_ERROR: CONNECTION_ERROR = "CONNECTION_ERROR".asInstanceOf[CONNECTION_ERROR]
  
  @scala.inline
  def CONTEXT_MENU: CONTEXT_MENU = "CONTEXT_MENU".asInstanceOf[CONTEXT_MENU]
  
  @scala.inline
  def CONTROL: CONTROL = "CONTROL".asInstanceOf[CONTROL]
  
  @scala.inline
  def CROS: CROS = "CROS".asInstanceOf[CROS]
  
  @scala.inline
  def CancelRequest: CancelRequest = "CancelRequest".asInstanceOf[CancelRequest]
  
  @scala.inline
  def Cellular: Cellular = "Cellular".asInstanceOf[Cellular]
  
  @scala.inline
  def Connected_ : Connected_ = "Connected".asInstanceOf[Connected_]
  
  @scala.inline
  def Connecting_ : Connecting_ = "Connecting".asInstanceOf[Connecting_]
  
  @scala.inline
  def DATA: DATA = "DATA".asInstanceOf[DATA]
  
  @scala.inline
  def DELETED: DELETED = "DELETED".asInstanceOf[DELETED]
  
  @scala.inline
  def DENIED: DENIED = "DENIED".asInstanceOf[DENIED]
  
  @scala.inline
  def DEVELOPMENT: DEVELOPMENT = "DEVELOPMENT".asInstanceOf[DEVELOPMENT]
  
  @scala.inline
  def DEVICE: DEVICE = "DEVICE".asInstanceOf[DEVICE]
  
  @scala.inline
  def DHCP: DHCP = "DHCP".asInstanceOf[DHCP]
  
  @scala.inline
  def DISABLED: DISABLED = "DISABLED".asInstanceOf[DISABLED]
  
  @scala.inline
  def DISCONNECTED: DISCONNECTED = "DISCONNECTED".asInstanceOf[DISCONNECTED]
  
  @scala.inline
  def DISPLAY: DISPLAY = "DISPLAY".asInstanceOf[DISPLAY]
  
  @scala.inline
  def DevicePolicy: DevicePolicy = "DevicePolicy".asInstanceOf[DevicePolicy]
  
  @scala.inline
  def Device_ : Device_ = "Device".asInstanceOf[Device_]
  
  @scala.inline
  def Direct: Direct = "Direct".asInstanceOf[Direct]
  
  @scala.inline
  def Disabled_ : Disabled_ = "Disabled".asInstanceOf[Disabled_]
  
  @scala.inline
  def Disconnected_ : Disconnected_ = "Disconnected".asInstanceOf[Disconnected_]
  
  @scala.inline
  def ECDSA_SIGN: ECDSA_SIGN = "ECDSA_SIGN".asInstanceOf[ECDSA_SIGN]
  
  @scala.inline
  def EDITABLE: EDITABLE = "EDITABLE".asInstanceOf[EDITABLE]
  
  @scala.inline
  def ENDPOINT: ENDPOINT = "ENDPOINT".asInstanceOf[ENDPOINT]
  
  @scala.inline
  def EPHEMERAL_APP: EPHEMERAL_APP = "EPHEMERAL_APP".asInstanceOf[EPHEMERAL_APP]
  
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @scala.inline
  def ERR_ABORTED: ERR_ABORTED = "ERR_ABORTED".asInstanceOf[ERR_ABORTED]
  
  @scala.inline
  def ERR_ADDRESS_UNREACHABLE: ERR_ADDRESS_UNREACHABLE = "ERR_ADDRESS_UNREACHABLE".asInstanceOf[ERR_ADDRESS_UNREACHABLE]
  
  @scala.inline
  def ERR_BLOCKED_BY_CLIENT: ERR_BLOCKED_BY_CLIENT = "ERR_BLOCKED_BY_CLIENT".asInstanceOf[ERR_BLOCKED_BY_CLIENT]
  
  @scala.inline
  def ERR_DISALLOWED_URL_SCHEME: ERR_DISALLOWED_URL_SCHEME = "ERR_DISALLOWED_URL_SCHEME".asInstanceOf[ERR_DISALLOWED_URL_SCHEME]
  
  @scala.inline
  def ERR_EMPTY_RESPONSE: ERR_EMPTY_RESPONSE = "ERR_EMPTY_RESPONSE".asInstanceOf[ERR_EMPTY_RESPONSE]
  
  @scala.inline
  def ERR_FILE_NOT_FOUND: ERR_FILE_NOT_FOUND = "ERR_FILE_NOT_FOUND".asInstanceOf[ERR_FILE_NOT_FOUND]
  
  @scala.inline
  def ERR_INVALID_URL: ERR_INVALID_URL = "ERR_INVALID_URL".asInstanceOf[ERR_INVALID_URL]
  
  @scala.inline
  def ERR_UNKNOWN_URL_SCHEME: ERR_UNKNOWN_URL_SCHEME = "ERR_UNKNOWN_URL_SCHEME".asInstanceOf[ERR_UNKNOWN_URL_SCHEME]
  
  @scala.inline
  def EXISTS: EXISTS = "EXISTS".asInstanceOf[EXISTS]
  
  @scala.inline
  def EXPLICIT_FEEDBACK: EXPLICIT_FEEDBACK = "EXPLICIT_FEEDBACK".asInstanceOf[EXPLICIT_FEEDBACK]
  
  @scala.inline
  def EXTENSIONS_PAGE: EXTENSIONS_PAGE = "EXTENSIONS_PAGE".asInstanceOf[EXTENSIONS_PAGE]
  
  @scala.inline
  def EditRequestCookie: EditRequestCookie = "EditRequestCookie".asInstanceOf[EditRequestCookie]
  
  @scala.inline
  def EditResponseCookie: EditResponseCookie = "EditResponseCookie".asInstanceOf[EditResponseCookie]
  
  @scala.inline
  def Enabled: Enabled = "Enabled".asInstanceOf[Enabled]
  
  @scala.inline
  def Enabling: Enabling = "Enabling".asInstanceOf[Enabling]
  
  @scala.inline
  def Ethernet: Ethernet = "Ethernet".asInstanceOf[Ethernet]
  
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @scala.inline
  def FAILURE: FAILURE = "FAILURE".asInstanceOf[FAILURE]
  
  @scala.inline
  def FEEDBACK: FEEDBACK = "FEEDBACK".asInstanceOf[FEEDBACK]
  
  @scala.inline
  def FILE_HANDLER: FILE_HANDLER = "FILE_HANDLER".asInstanceOf[FILE_HANDLER]
  
  @scala.inline
  def FIXED: FIXED = "FIXED".asInstanceOf[FIXED]
  
  @scala.inline
  def FRAME: FRAME = "FRAME".asInstanceOf[FRAME]
  
  @scala.inline
  def FRONT_MIC: FRONT_MIC = "FRONT_MIC".asInstanceOf[FRONT_MIC]
  
  @scala.inline
  def FULLSCREEN: FULLSCREEN = "FULLSCREEN".asInstanceOf[FULLSCREEN]
  
  @scala.inline
  def GOOG: GOOG = "GOOG".asInstanceOf[GOOG]
  
  @scala.inline
  def GOOGDot: GOOGDot = "GOOG.".asInstanceOf[GOOGDot]
  
  @scala.inline
  def GOOGLE: GOOGLE = "GOOGLE".asInstanceOf[GOOGLE]
  
  @scala.inline
  def GRANTED: GRANTED = "GRANTED".asInstanceOf[GRANTED]
  
  @scala.inline
  def GSM: GSM = "GSM".asInstanceOf[GSM]
  
  @scala.inline
  def HDMI: HDMI = "HDMI".asInstanceOf[HDMI]
  
  @scala.inline
  def HEADPHONE: HEADPHONE = "HEADPHONE".asInstanceOf[HEADPHONE]
  
  @scala.inline
  def HOTWORD: HOTWORD = "HOTWORD".asInstanceOf[HOTWORD]
  
  @scala.inline
  def IMAGE: IMAGE = "IMAGE".asInstanceOf[IMAGE]
  
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  
  @scala.inline
  def INITIALIZING: INITIALIZING = "INITIALIZING".asInstanceOf[INITIALIZING]
  
  @scala.inline
  def INPUT: INPUT = "INPUT".asInstanceOf[INPUT]
  
  @scala.inline
  def INSTALL: INSTALL = "INSTALL".asInstanceOf[INSTALL]
  
  @scala.inline
  def INSTALLED_NOTIFICATION: INSTALLED_NOTIFICATION = "INSTALLED_NOTIFICATION".asInstanceOf[INSTALLED_NOTIFICATION]
  
  @scala.inline
  def INTERFACE: INTERFACE = "INTERFACE".asInstanceOf[INTERFACE]
  
  @scala.inline
  def INTERNAL_MIC: INTERNAL_MIC = "INTERNAL_MIC".asInstanceOf[INTERNAL_MIC]
  
  @scala.inline
  def INTERNAL_SPEAKER: INTERNAL_SPEAKER = "INTERNAL_SPEAKER".asInstanceOf[INTERNAL_SPEAKER]
  
  @scala.inline
  def INTERRUPT: INTERRUPT = "INTERRUPT".asInstanceOf[INTERRUPT]
  
  @scala.inline
  def INVALID_OPERATION: INVALID_OPERATION = "INVALID_OPERATION".asInstanceOf[INVALID_OPERATION]
  
  @scala.inline
  def INVALID_PIN: INVALID_PIN = "INVALID_PIN".asInstanceOf[INVALID_PIN]
  
  @scala.inline
  def INVALID_PUK: INVALID_PUK = "INVALID_PUK".asInstanceOf[INVALID_PUK]
  
  @scala.inline
  def INVALID_URL: INVALID_URL = "INVALID_URL".asInstanceOf[INVALID_URL]
  
  @scala.inline
  def IN_USE: IN_USE = "IN_USE".asInstanceOf[IN_USE]
  
  @scala.inline
  def IO: IO = "IO".asInstanceOf[IO]
  
  @scala.inline
  def IPv4: IPv4 = "IPv4".asInstanceOf[IPv4]
  
  @scala.inline
  def IPv6: IPv6 = "IPv6".asInstanceOf[IPv6]
  
  @scala.inline
  def ISOCHRONOUS: ISOCHRONOUS = "ISOCHRONOUS".asInstanceOf[ISOCHRONOUS]
  
  @scala.inline
  def IgnoreRules: IgnoreRules = "IgnoreRules".asInstanceOf[IgnoreRules]
  
  @scala.inline
  def KEYBOARD: KEYBOARD = "KEYBOARD".asInstanceOf[KEYBOARD]
  
  @scala.inline
  def KEYBOARD_MIC: KEYBOARD_MIC = "KEYBOARD_MIC".asInstanceOf[KEYBOARD_MIC]
  
  @scala.inline
  def KIOSK: KIOSK = "KIOSK".asInstanceOf[KIOSK]
  
  @scala.inline
  def LAST_WRITE_WIN: LAST_WRITE_WIN = "LAST_WRITE_WIN".asInstanceOf[LAST_WRITE_WIN]
  
  @scala.inline
  def LAUNCHER: LAUNCHER = "LAUNCHER".asInstanceOf[LAUNCHER]
  
  @scala.inline
  def LEFT: LEFT = "LEFT".asInstanceOf[LEFT]
  
  @scala.inline
  def LINEOUT: LINEOUT = "LINEOUT".asInstanceOf[LINEOUT]
  
  @scala.inline
  def LINK: LINK = "LINK".asInstanceOf[LINK]
  
  @scala.inline
  def LINK_CHANGED: LINK_CHANGED = "LINK_CHANGED".asInstanceOf[LINK_CHANGED]
  
  @scala.inline
  def LINK_DOWN: LINK_DOWN = "LINK_DOWN".asInstanceOf[LINK_DOWN]
  
  @scala.inline
  def LINK_UP: LINK_UP = "LINK_UP".asInstanceOf[LINK_UP]
  
  @scala.inline
  def LINUX: LINUX = "LINUX".asInstanceOf[LINUX]
  
  @scala.inline
  def LIST: LIST = "LIST".asInstanceOf[LIST]
  
  @scala.inline
  def LOAD_AND_LAUNCH: LOAD_AND_LAUNCH = "LOAD_AND_LAUNCH".asInstanceOf[LOAD_AND_LAUNCH]
  
  @scala.inline
  def LOCAL_TO_REMOTE: LOCAL_TO_REMOTE = "LOCAL_TO_REMOTE".asInstanceOf[LOCAL_TO_REMOTE]
  
  @scala.inline
  def Lessthansignall_urlsGreaterthansign: Lessthansignall_urlsGreaterthansign = "<all_urls>".asInstanceOf[Lessthansignall_urlsGreaterthansign]
  
  @scala.inline
  def MAC: MAC = "MAC".asInstanceOf[MAC]
  
  @scala.inline
  def MANAGEMENT_API: MANAGEMENT_API = "MANAGEMENT_API".asInstanceOf[MANAGEMENT_API]
  
  @scala.inline
  def MANUAL: MANUAL = "MANUAL".asInstanceOf[MANUAL]
  
  @scala.inline
  def MAXIMIZED: MAXIMIZED = "MAXIMIZED".asInstanceOf[MAXIMIZED]
  
  @scala.inline
  def MAX_ATTEMPTS_EXCEEDED: MAX_ATTEMPTS_EXCEEDED = "MAX_ATTEMPTS_EXCEEDED".asInstanceOf[MAX_ATTEMPTS_EXCEEDED]
  
  @scala.inline
  def MD5_SHA1: MD5_SHA1 = "MD5_SHA1".asInstanceOf[MD5_SHA1]
  
  @scala.inline
  def MEDIA_PIPELINE_ERROR: MEDIA_PIPELINE_ERROR = "MEDIA_PIPELINE_ERROR".asInstanceOf[MEDIA_PIPELINE_ERROR]
  
  @scala.inline
  def MIC: MIC = "MIC".asInstanceOf[MIC]
  
  @scala.inline
  def MINIMIZED: MINIMIZED = "MINIMIZED".asInstanceOf[MINIMIZED]
  
  @scala.inline
  def MIPS: MIPS = "MIPS".asInstanceOf[MIPS]
  
  @scala.inline
  def MIPS64: MIPS64 = "MIPS64".asInstanceOf[MIPS64]
  
  @scala.inline
  def Manual_ : Manual_ = "Manual".asInstanceOf[Manual_]
  
  @scala.inline
  def NEW_NOTE: NEW_NOTE = "NEW_NOTE".asInstanceOf[NEW_NOTE]
  
  @scala.inline
  def NEW_TAB_PAGE: NEW_TAB_PAGE = "NEW_TAB_PAGE".asInstanceOf[NEW_TAB_PAGE]
  
  @scala.inline
  def NORMAL: NORMAL = "NORMAL".asInstanceOf[NORMAL]
  
  @scala.inline
  def NOTIFICATION: NOTIFICATION = "NOTIFICATION".asInstanceOf[NOTIFICATION]
  
  @scala.inline
  def NOT_A_DIRECTORY: NOT_A_DIRECTORY = "NOT_A_DIRECTORY".asInstanceOf[NOT_A_DIRECTORY]
  
  @scala.inline
  def NOT_A_FILE: NOT_A_FILE = "NOT_A_FILE".asInstanceOf[NOT_A_FILE]
  
  @scala.inline
  def NOT_EMPTY: NOT_EMPTY = "NOT_EMPTY".asInstanceOf[NOT_EMPTY]
  
  @scala.inline
  def NOT_FOUND: NOT_FOUND = "NOT_FOUND".asInstanceOf[NOT_FOUND]
  
  @scala.inline
  def NO_MEMORY: NO_MEMORY = "NO_MEMORY".asInstanceOf[NO_MEMORY]
  
  @scala.inline
  def NO_SPACE: NO_SPACE = "NO_SPACE".asInstanceOf[NO_SPACE]
  
  @scala.inline
  def NO_SUCH_DEVICE: NO_SUCH_DEVICE = "NO_SUCH_DEVICE".asInstanceOf[NO_SUCH_DEVICE]
  
  @scala.inline
  def NO_UPDATE: NO_UPDATE = "NO_UPDATE".asInstanceOf[NO_UPDATE]
  
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  
  @scala.inline
  def NotActivated: NotActivated = "NotActivated".asInstanceOf[NotActivated]
  
  @scala.inline
  def NotConnected: NotConnected = "NotConnected".asInstanceOf[NotConnected]
  
  @scala.inline
  def OFFLINE_NOT_NECESSARY: OFFLINE_NOT_NECESSARY = "OFFLINE_NOT_NECESSARY".asInstanceOf[OFFLINE_NOT_NECESSARY]
  
  @scala.inline
  def OK: OK = "OK".asInstanceOf[OK]
  
  @scala.inline
  def OPENBSD: OPENBSD = "OPENBSD".asInstanceOf[OPENBSD]
  
  @scala.inline
  def OPEN_AS_PINNED_TAB: OPEN_AS_PINNED_TAB = "OPEN_AS_PINNED_TAB".asInstanceOf[OPEN_AS_PINNED_TAB]
  
  @scala.inline
  def OPEN_AS_REGULAR_TAB: OPEN_AS_REGULAR_TAB = "OPEN_AS_REGULAR_TAB".asInstanceOf[OPEN_AS_REGULAR_TAB]
  
  @scala.inline
  def OPEN_AS_WINDOW: OPEN_AS_WINDOW = "OPEN_AS_WINDOW".asInstanceOf[OPEN_AS_WINDOW]
  
  @scala.inline
  def OPEN_FULL_SCREEN: OPEN_FULL_SCREEN = "OPEN_FULL_SCREEN".asInstanceOf[OPEN_FULL_SCREEN]
  
  @scala.inline
  def OS_UPDATE: OS_UPDATE = "OS_UPDATE".asInstanceOf[OS_UPDATE]
  
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  
  @scala.inline
  def OUT: OUT = "OUT".asInstanceOf[OUT]
  
  @scala.inline
  def OUTPUT: OUTPUT = "OUTPUT".asInstanceOf[OUTPUT]
  
  @scala.inline
  def Offline: Offline = "Offline".asInstanceOf[Offline]
  
  @scala.inline
  def Online: Online = "Online".asInstanceOf[Online]
  
  @scala.inline
  def PAC: PAC = "PAC".asInstanceOf[PAC]
  
  @scala.inline
  def PAGE: PAGE = "PAGE".asInstanceOf[PAGE]
  
  @scala.inline
  def PAGE_ACTION: PAGE_ACTION = "PAGE_ACTION".asInstanceOf[PAGE_ACTION]
  
  @scala.inline
  def PBC: PBC = "PBC".asInstanceOf[PBC]
  
  @scala.inline
  def PENDING: PENDING = "PENDING".asInstanceOf[PENDING]
  
  @scala.inline
  def PERIODIC: PERIODIC = "PERIODIC".asInstanceOf[PERIODIC]
  
  @scala.inline
  def PERMISSIONS_INCREASE: PERMISSIONS_INCREASE = "PERMISSIONS_INCREASE".asInstanceOf[PERMISSIONS_INCREASE]
  
  @scala.inline
  def PIN: PIN = "PIN".asInstanceOf[PIN]
  
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  
  @scala.inline
  def POST_DSP_LOOPBACK: POST_DSP_LOOPBACK = "POST_DSP_LOOPBACK".asInstanceOf[POST_DSP_LOOPBACK]
  
  @scala.inline
  def POST_MIX_LOOPBACK: POST_MIX_LOOPBACK = "POST_MIX_LOOPBACK".asInstanceOf[POST_MIX_LOOPBACK]
  
  @scala.inline
  def PROGRESS: PROGRESS = "PROGRESS".asInstanceOf[PROGRESS]
  
  @scala.inline
  def PUK: PUK = "PUK".asInstanceOf[PUK]
  
  @scala.inline
  def PartiallyActivated: PartiallyActivated = "PartiallyActivated".asInstanceOf[PartiallyActivated]
  
  @scala.inline
  def Pattern: Pattern = "Pattern".asInstanceOf[Pattern]
  
  @scala.inline
  def Portal: Portal = "Portal".asInstanceOf[Portal]
  
  @scala.inline
  def Prohibited: Prohibited = "Prohibited".asInstanceOf[Prohibited]
  
  @scala.inline
  def ProxyAuthRequired: ProxyAuthRequired = "ProxyAuthRequired".asInstanceOf[ProxyAuthRequired]
  
  @scala.inline
  def RADIO: RADIO = "RADIO".asInstanceOf[RADIO]
  
  @scala.inline
  def READ: READ = "READ".asInstanceOf[READ]
  
  @scala.inline
  def REAR_MIC: REAR_MIC = "REAR_MIC".asInstanceOf[REAR_MIC]
  
  @scala.inline
  def REJECTED: REJECTED = "REJECTED".asInstanceOf[REJECTED]
  
  @scala.inline
  def RELOAD: RELOAD = "RELOAD".asInstanceOf[RELOAD]
  
  @scala.inline
  def REMOTE_TO_LOCAL: REMOTE_TO_LOCAL = "REMOTE_TO_LOCAL".asInstanceOf[REMOTE_TO_LOCAL]
  
  @scala.inline
  def REMOVABLE: REMOVABLE = "REMOVABLE".asInstanceOf[REMOVABLE]
  
  @scala.inline
  def RESERVED: RESERVED = "RESERVED".asInstanceOf[RESERVED]
  
  @scala.inline
  def RESTART: RESTART = "RESTART".asInstanceOf[RESTART]
  
  @scala.inline
  def RESUME: RESUME = "RESUME".asInstanceOf[RESUME]
  
  @scala.inline
  def RIGHT: RIGHT = "RIGHT".asInstanceOf[RIGHT]
  
  @scala.inline
  def RSA_SIGN: RSA_SIGN = "RSA_SIGN".asInstanceOf[RSA_SIGN]
  
  @scala.inline
  def RUNNING: RUNNING = "RUNNING".asInstanceOf[RUNNING]
  
  @scala.inline
  def ReadOnly: ReadOnly = "ReadOnly".asInstanceOf[ReadOnly]
  
  @scala.inline
  def ReadWrite: ReadWrite = "ReadWrite".asInstanceOf[ReadWrite]
  
  @scala.inline
  def RedirectByRegEx: RedirectByRegEx = "RedirectByRegEx".asInstanceOf[RedirectByRegEx]
  
  @scala.inline
  def RedirectRequest: RedirectRequest = "RedirectRequest".asInstanceOf[RedirectRequest]
  
  @scala.inline
  def RedirectToEmptyDocument: RedirectToEmptyDocument = "RedirectToEmptyDocument".asInstanceOf[RedirectToEmptyDocument]
  
  @scala.inline
  def RedirectToTransparentImage: RedirectToTransparentImage = "RedirectToTransparentImage".asInstanceOf[RedirectToTransparentImage]
  
  @scala.inline
  def Ref: Ref = "Ref".asInstanceOf[Ref]
  
  @scala.inline
  def RemoveRequestCookie: RemoveRequestCookie = "RemoveRequestCookie".asInstanceOf[RemoveRequestCookie]
  
  @scala.inline
  def RemoveRequestHeader: RemoveRequestHeader = "RemoveRequestHeader".asInstanceOf[RemoveRequestHeader]
  
  @scala.inline
  def RemoveResponseCookie: RemoveResponseCookie = "RemoveResponseCookie".asInstanceOf[RemoveResponseCookie]
  
  @scala.inline
  def RemoveResponseHeader: RemoveResponseHeader = "RemoveResponseHeader".asInstanceOf[RemoveResponseHeader]
  
  @scala.inline
  def RequestMatcher: RequestMatcher = "RequestMatcher".asInstanceOf[RequestMatcher]
  
  @scala.inline
  def SAVE_FOR_OFFLINE: SAVE_FOR_OFFLINE = "SAVE_FOR_OFFLINE".asInstanceOf[SAVE_FOR_OFFLINE]
  
  @scala.inline
  def SCREEN: SCREEN = "SCREEN".asInstanceOf[SCREEN]
  
  @scala.inline
  def SECURITY: SECURITY = "SECURITY".asInstanceOf[SECURITY]
  
  @scala.inline
  def SELECTION: SELECTION = "SELECTION".asInstanceOf[SELECTION]
  
  @scala.inline
  def SEPARATOR: SEPARATOR = "SEPARATOR".asInstanceOf[SEPARATOR]
  
  @scala.inline
  def SHA1: SHA1 = "SHA1".asInstanceOf[SHA1]
  
  @scala.inline
  def SHA256: SHA256 = "SHA256".asInstanceOf[SHA256]
  
  @scala.inline
  def SHA384: SHA384 = "SHA384".asInstanceOf[SHA384]
  
  @scala.inline
  def SHA512: SHA512 = "SHA512".asInstanceOf[SHA512]
  
  @scala.inline
  def SHARE: SHARE = "SHARE".asInstanceOf[SHARE]
  
  @scala.inline
  def SHARED_MODULE_UPDATE: SHARED_MODULE_UPDATE = "SHARED_MODULE_UPDATE".asInstanceOf[SHARED_MODULE_UPDATE]
  
  @scala.inline
  def SHOW_ADD_DIALOG: SHOW_ADD_DIALOG = "SHOW_ADD_DIALOG".asInstanceOf[SHOW_ADD_DIALOG]
  
  @scala.inline
  def SHOW_CONFIGURE_DIALOG: SHOW_CONFIGURE_DIALOG = "SHOW_CONFIGURE_DIALOG".asInstanceOf[SHOW_CONFIGURE_DIALOG]
  
  @scala.inline
  def SIDELOAD: SIDELOAD = "SIDELOAD".asInstanceOf[SIDELOAD]
  
  @scala.inline
  def STANDARD: STANDARD = "STANDARD".asInstanceOf[STANDARD]
  
  @scala.inline
  def STRETCH: STRETCH = "STRETCH".asInstanceOf[STRETCH]
  
  @scala.inline
  def SUCCEEDED: SUCCEEDED = "SUCCEEDED".asInstanceOf[SUCCEEDED]
  
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @scala.inline
  def SUSPEND: SUSPEND = "SUSPEND".asInstanceOf[SUSPEND]
  
  @scala.inline
  def SYNCED: SYNCED = "SYNCED".asInstanceOf[SYNCED]
  
  @scala.inline
  def SYNCHRONOUS: SYNCHRONOUS = "SYNCHRONOUS".asInstanceOf[SYNCHRONOUS]
  
  @scala.inline
  def SYSTEM: SYSTEM = "SYSTEM".asInstanceOf[SYSTEM]
  
  @scala.inline
  def SYSTEM_TRAY: SYSTEM_TRAY = "SYSTEM_TRAY".asInstanceOf[SYSTEM_TRAY]
  
  @scala.inline
  def SendMessageToExtension: SendMessageToExtension = "SendMessageToExtension".asInstanceOf[SendMessageToExtension]
  
  @scala.inline
  def SetRequestHeader: SetRequestHeader = "SetRequestHeader".asInstanceOf[SetRequestHeader]
  
  @scala.inline
  def Static: Static = "Static".asInstanceOf[Static]
  
  @scala.inline
  def TAB: TAB = "TAB".asInstanceOf[TAB]
  
  @scala.inline
  def TEMPORARY_UNAVAILABLE: TEMPORARY_UNAVAILABLE = "TEMPORARY_UNAVAILABLE".asInstanceOf[TEMPORARY_UNAVAILABLE]
  
  @scala.inline
  def TEST: TEST = "TEST".asInstanceOf[TEST]
  
  @scala.inline
  def TEXT_HTML: TEXT_HTML = "TEXT_HTML".asInstanceOf[TEXT_HTML]
  
  @scala.inline
  def TEXT_PLAIN: TEXT_PLAIN = "TEXT_PLAIN".asInstanceOf[TEXT_PLAIN]
  
  @scala.inline
  def THROTTLED: THROTTLED = "THROTTLED".asInstanceOf[THROTTLED]
  
  @scala.inline
  def TIMEOUT_ERROR: TIMEOUT_ERROR = "TIMEOUT_ERROR".asInstanceOf[TIMEOUT_ERROR]
  
  @scala.inline
  def TOO_MANY_OPENED: TOO_MANY_OPENED = "TOO_MANY_OPENED".asInstanceOf[TOO_MANY_OPENED]
  
  @scala.inline
  def TOP: TOP = "TOP".asInstanceOf[TOP]
  
  @scala.inline
  def UNHANDLED: UNHANDLED = "UNHANDLED".asInstanceOf[UNHANDLED]
  
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @scala.inline
  def UNKNOWN_ERROR: UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[UNKNOWN_ERROR]
  
  @scala.inline
  def UNTRACKED: UNTRACKED = "UNTRACKED".asInstanceOf[UNTRACKED]
  
  @scala.inline
  def UPDATE: UPDATE = "UPDATE".asInstanceOf[UPDATE]
  
  @scala.inline
  def UPDATED: UPDATED = "UPDATED".asInstanceOf[UPDATED]
  
  @scala.inline
  def UPDATE_AVAILABLE: UPDATE_AVAILABLE = "UPDATE_AVAILABLE".asInstanceOf[UPDATE_AVAILABLE]
  
  @scala.inline
  def URL_HANDLER: URL_HANDLER = "URL_HANDLER".asInstanceOf[URL_HANDLER]
  
  @scala.inline
  def USB: USB = "USB".asInstanceOf[USB]
  
  @scala.inline
  def Uninitialized: Uninitialized = "Uninitialized".asInstanceOf[Uninitialized]
  
  @scala.inline
  def Unknown_ : Unknown_ = "Unknown".asInstanceOf[Unknown_]
  
  @scala.inline
  def User: User = "User".asInstanceOf[User]
  
  @scala.inline
  def UserPolicy: UserPolicy = "UserPolicy".asInstanceOf[UserPolicy]
  
  @scala.inline
  def VENDOR: VENDOR = "VENDOR".asInstanceOf[VENDOR]
  
  @scala.inline
  def VIDEO: VIDEO = "VIDEO".asInstanceOf[VIDEO]
  
  @scala.inline
  def VPN: VPN = "VPN".asInstanceOf[VPN]
  
  @scala.inline
  def `WEP-PSK`: `WEP-PSK` = "WEP-PSK".asInstanceOf[`WEP-PSK`]
  
  @scala.inline
  def WIN: WIN = "WIN".asInstanceOf[WIN]
  
  @scala.inline
  def WINDOW: WINDOW = "WINDOW".asInstanceOf[WINDOW]
  
  @scala.inline
  def WI_FI: WI_FI = "WI_FI".asInstanceOf[WI_FI]
  
  @scala.inline
  def `WPA-EAP`: `WPA-EAP` = "WPA-EAP".asInstanceOf[`WPA-EAP`]
  
  @scala.inline
  def `WPA-PSK`: `WPA-PSK` = "WPA-PSK".asInstanceOf[`WPA-PSK`]
  
  @scala.inline
  def WPAD: WPAD = "WPAD".asInstanceOf[WPAD]
  
  @scala.inline
  def WRITE: WRITE = "WRITE".asInstanceOf[WRITE]
  
  @scala.inline
  def WiFi: WiFi = "WiFi".asInstanceOf[WiFi]
  
  @scala.inline
  def WiMAX: WiMAX = "WiMAX".asInstanceOf[WiMAX]
  
  @scala.inline
  def Wireless: Wireless = "Wireless".asInstanceOf[Wireless]
  
  @scala.inline
  def X86_32: X86_32 = "X86_32".asInstanceOf[X86_32]
  
  @scala.inline
  def X86_64: X86_64 = "X86_64".asInstanceOf[X86_64]
  
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @scala.inline
  def abnormal: abnormal = "abnormal".asInstanceOf[abnormal]
  
  @scala.inline
  def abort_ : abort_ = "abort".asInstanceOf[abort_]
  
  @scala.inline
  def about_page_ : about_page_ = "about_page".asInstanceOf[about_page_]
  
  @scala.inline
  def activate: activate = "activate".asInstanceOf[activate]
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def adaptive_ : adaptive_ = "adaptive".asInstanceOf[adaptive_]
  
  @scala.inline
  def added_ : added_ = "added".asInstanceOf[added_]
  
  @scala.inline
  def admin_ : admin_ = "admin".asInstanceOf[admin_]
  
  @scala.inline
  def af: af = "af".asInstanceOf[af]
  
  @scala.inline
  def alarms: alarms = "alarms".asInstanceOf[alarms]
  
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  
  @scala.inline
  def allAutoDetected: allAutoDetected = "allAutoDetected".asInstanceOf[allAutoDetected]
  
  @scala.inline
  def all__ : all__ = "all".asInstanceOf[all__]
  
  @scala.inline
  def alwaysOnTopWindows: alwaysOnTopWindows = "alwaysOnTopWindows".asInstanceOf[alwaysOnTopWindows]
  
  @scala.inline
  def am: am = "am".asInstanceOf[am]
  
  @scala.inline
  def an: an = "an".asInstanceOf[an]
  
  @scala.inline
  def android_ : android_ = "android".asInstanceOf[android_]
  
  @scala.inline
  def animationcancel: animationcancel = "animationcancel".asInstanceOf[animationcancel]
  
  @scala.inline
  def animationend: animationend = "animationend".asInstanceOf[animationend]
  
  @scala.inline
  def animationiteration: animationiteration = "animationiteration".asInstanceOf[animationiteration]
  
  @scala.inline
  def animationstart: animationstart = "animationstart".asInstanceOf[animationstart]
  
  @scala.inline
  def appDotwindowDotalpha: appDotwindowDotalpha = "app.window.alpha".asInstanceOf[appDotwindowDotalpha]
  
  @scala.inline
  def appDotwindowDotalwaysOnTop: appDotwindowDotalwaysOnTop = "app.window.alwaysOnTop".asInstanceOf[appDotwindowDotalwaysOnTop]
  
  @scala.inline
  def appDotwindowDotfullscreen: appDotwindowDotfullscreen = "app.window.fullscreen".asInstanceOf[appDotwindowDotfullscreen]
  
  @scala.inline
  def appDotwindowDotfullscreenDotoverrideEsc: appDotwindowDotfullscreenDotoverrideEsc = "app.window.fullscreen.overrideEsc".asInstanceOf[appDotwindowDotfullscreenDotoverrideEsc]
  
  @scala.inline
  def appDotwindowDotime: appDotwindowDotime = "app.window.ime".asInstanceOf[appDotwindowDotime]
  
  @scala.inline
  def appDotwindowDotshape: appDotwindowDotshape = "app.window.shape".asInstanceOf[appDotwindowDotshape]
  
  @scala.inline
  def app_launcher_ : app_launcher_ = "app_launcher".asInstanceOf[app_launcher_]
  
  @scala.inline
  def app_update_ : app_update_ = "app_update".asInstanceOf[app_update_]
  
  @scala.inline
  def appview: appview = "appview".asInstanceOf[appview]
  
  @scala.inline
  def ar: ar = "ar".asInstanceOf[ar]
  
  @scala.inline
  def ar_001: ar_001 = "ar_001".asInstanceOf[ar_001]
  
  @scala.inline
  def arm_ : arm_ = "arm".asInstanceOf[arm_]
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  
  @scala.inline
  def ast: ast = "ast".asInstanceOf[ast]
  
  @scala.inline
  def asynchronous_ : asynchronous_ = "asynchronous".asInstanceOf[asynchronous_]
  
  @scala.inline
  def audioCapture: audioCapture = "audioCapture".asInstanceOf[audioCapture]
  
  @scala.inline
  def audio_ : audio_ = "audio".asInstanceOf[audio_]
  
  @scala.inline
  def authenticatedSignedWrites: authenticatedSignedWrites = "authenticatedSignedWrites".asInstanceOf[authenticatedSignedWrites]
  
  @scala.inline
  def authentication_required_ : authentication_required_ = "authentication_required".asInstanceOf[authentication_required_]
  
  @scala.inline
  def author: author = "author".asInstanceOf[author]
  
  @scala.inline
  def auxclick: auxclick = "auxclick".asInstanceOf[auxclick]
  
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  
  @scala.inline
  def avx: avx = "avx".asInstanceOf[avx]
  
  @scala.inline
  def az: az = "az".asInstanceOf[az]
  
  @scala.inline
  def background_ : background_ = "background".asInstanceOf[background_]
  
  @scala.inline
  def basic_ : basic_ = "basic".asInstanceOf[basic_]
  
  @scala.inline
  def be: be = "be".asInstanceOf[be]
  
  @scala.inline
  def bg: bg = "bg".asInstanceOf[bg]
  
  @scala.inline
  def bh: bh = "bh".asInstanceOf[bh]
  
  @scala.inline
  def bluetooth_ : bluetooth_ = "bluetooth".asInstanceOf[bluetooth_]
  
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  
  @scala.inline
  def bn: bn = "bn".asInstanceOf[bn]
  
  @scala.inline
  def bottom_ : bottom_ = "bottom".asInstanceOf[bottom_]
  
  @scala.inline
  def br: br = "br".asInstanceOf[br]
  
  @scala.inline
  def broadcast: broadcast = "broadcast".asInstanceOf[broadcast]
  
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  
  @scala.inline
  def browser_action_ : browser_action_ = "browser_action".asInstanceOf[browser_action_]
  
  @scala.inline
  def bs: bs = "bs".asInstanceOf[bs]
  
  @scala.inline
  def bulk_ : bulk_ = "bulk".asInstanceOf[bulk_]
  
  @scala.inline
  def ca: ca = "ca".asInstanceOf[ca]
  
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @scala.inline
  def canplay: canplay = "canplay".asInstanceOf[canplay]
  
  @scala.inline
  def canplaythrough: canplaythrough = "canplaythrough".asInstanceOf[canplaythrough]
  
  @scala.inline
  def capabilities_negotiation_error_ : capabilities_negotiation_error_ = "capabilities_negotiation_error".asInstanceOf[capabilities_negotiation_error_]
  
  @scala.inline
  def carAudio: carAudio = "carAudio".asInstanceOf[carAudio]
  
  @scala.inline
  def ceb: ceb = "ceb".asInstanceOf[ceb]
  
  @scala.inline
  def certificateProvider: certificateProvider = "certificateProvider".asInstanceOf[certificateProvider]
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @scala.inline
  def changed_ : changed_ = "changed".asInstanceOf[changed_]
  
  @scala.inline
  def checkbox_ : checkbox_ = "checkbox".asInstanceOf[checkbox_]
  
  @scala.inline
  def chrome: chrome = "chrome".asInstanceOf[chrome]
  
  @scala.inline
  def chromeColonSlashSlashfaviconSlash: chromeColonSlashSlashfaviconSlash = "chrome://favicon/".asInstanceOf[chromeColonSlashSlashfaviconSlash]
  
  @scala.inline
  def chrome_internal_ : chrome_internal_ = "chrome_internal".asInstanceOf[chrome_internal_]
  
  @scala.inline
  def chrome_os: chrome_os = "chrome_os".asInstanceOf[chrome_os]
  
  @scala.inline
  def chrome_update_ : chrome_update_ = "chrome_update".asInstanceOf[chrome_update_]
  
  @scala.inline
  def ckb: ckb = "ckb".asInstanceOf[ckb]
  
  @scala.inline
  def class_ : class_ = "class".asInstanceOf[class_]
  
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @scala.inline
  def clipboard: clipboard = "clipboard".asInstanceOf[clipboard]
  
  @scala.inline
  def clipboardRead: clipboardRead = "clipboardRead".asInstanceOf[clipboardRead]
  
  @scala.inline
  def clipboardWrite: clipboardWrite = "clipboardWrite".asInstanceOf[clipboardWrite]
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  
  @scala.inline
  def co: co = "co".asInstanceOf[co]
  
  @scala.inline
  def collapse_key: collapse_key = "collapse_key".asInstanceOf[collapse_key]
  
  @scala.inline
  def command_line_ : command_line_ = "command_line".asInstanceOf[command_line_]
  
  @scala.inline
  def computer: computer = "computer".asInstanceOf[computer]
  
  @scala.inline
  def confirm: confirm = "confirm".asInstanceOf[confirm]
  
  @scala.inline
  def conflicting_ : conflicting_ = "conflicting".asInstanceOf[conflicting_]
  
  @scala.inline
  def connected__ : connected__ = "connected".asInstanceOf[connected__]
  
  @scala.inline
  def connection_error_ : connection_error_ = "connection_error".asInstanceOf[connection_error_]
  
  @scala.inline
  def consolemessage: consolemessage = "consolemessage".asInstanceOf[consolemessage]
  
  @scala.inline
  def contentload: contentload = "contentload".asInstanceOf[contentload]
  
  @scala.inline
  def contents_changed: contents_changed = "contents_changed".asInstanceOf[contents_changed]
  
  @scala.inline
  def contextMenus: contextMenus = "contextMenus".asInstanceOf[contextMenus]
  
  @scala.inline
  def context_menu_ : context_menu_ = "context_menu".asInstanceOf[context_menu_]
  
  @scala.inline
  def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  
  @scala.inline
  def control_ : control_ = "control".asInstanceOf[control_]
  
  @scala.inline
  def controllable_by_this_extension: controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[controllable_by_this_extension]
  
  @scala.inline
  def controlled_by_other_extensions: controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[controlled_by_other_extensions]
  
  @scala.inline
  def controlled_by_this_extension: controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[controlled_by_this_extension]
  
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  
  @scala.inline
  def crash: crash = "crash".asInstanceOf[crash]
  
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  
  @scala.inline
  def cros_ : cros_ = "cros".asInstanceOf[cros_]
  
  @scala.inline
  def cs: cs = "cs".asInstanceOf[cs]
  
  @scala.inline
  def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @scala.inline
  def cuechange: cuechange = "cuechange".asInstanceOf[cuechange]
  
  @scala.inline
  def current_tab: current_tab = "current_tab".asInstanceOf[current_tab]
  
  @scala.inline
  def cut: cut = "cut".asInstanceOf[cut]
  
  @scala.inline
  def cy: cy = "cy".asInstanceOf[cy]
  
  @scala.inline
  def da: da = "da".asInstanceOf[da]
  
  @scala.inline
  def data_ : data_ = "data".asInstanceOf[data_]
  
  @scala.inline
  def dblclick: dblclick = "dblclick".asInstanceOf[dblclick]
  
  @scala.inline
  def de: de = "de".asInstanceOf[de]
  
  @scala.inline
  def `de-AT`: `de-AT` = "de-AT".asInstanceOf[`de-AT`]
  
  @scala.inline
  def `de-CH`: `de-CH` = "de-CH".asInstanceOf[`de-CH`]
  
  @scala.inline
  def `de-DE`: `de-DE` = "de-DE".asInstanceOf[`de-DE`]
  
  @scala.inline
  def `de-LI`: `de-LI` = "de-LI".asInstanceOf[`de-LI`]
  
  @scala.inline
  def debugger: debugger = "debugger".asInstanceOf[debugger]
  
  @scala.inline
  def declarativeContentDotPageStateMatcher: declarativeContentDotPageStateMatcher = "declarativeContent.PageStateMatcher".asInstanceOf[declarativeContentDotPageStateMatcher]
  
  @scala.inline
  def declarativeContentDotonAuthRequired: declarativeContentDotonAuthRequired = "declarativeContent.onAuthRequired".asInstanceOf[declarativeContentDotonAuthRequired]
  
  @scala.inline
  def declarativeContentDotonBeforeRedirect: declarativeContentDotonBeforeRedirect = "declarativeContent.onBeforeRedirect".asInstanceOf[declarativeContentDotonBeforeRedirect]
  
  @scala.inline
  def declarativeContentDotonBeforeRequest: declarativeContentDotonBeforeRequest = "declarativeContent.onBeforeRequest".asInstanceOf[declarativeContentDotonBeforeRequest]
  
  @scala.inline
  def declarativeContentDotonBeforeSendHeaders: declarativeContentDotonBeforeSendHeaders = "declarativeContent.onBeforeSendHeaders".asInstanceOf[declarativeContentDotonBeforeSendHeaders]
  
  @scala.inline
  def declarativeContentDotonCompleted: declarativeContentDotonCompleted = "declarativeContent.onCompleted".asInstanceOf[declarativeContentDotonCompleted]
  
  @scala.inline
  def declarativeContentDotonErrorOccured: declarativeContentDotonErrorOccured = "declarativeContent.onErrorOccured".asInstanceOf[declarativeContentDotonErrorOccured]
  
  @scala.inline
  def declarativeContentDotonHeadersReceived: declarativeContentDotonHeadersReceived = "declarativeContent.onHeadersReceived".asInstanceOf[declarativeContentDotonHeadersReceived]
  
  @scala.inline
  def declarativeContentDotonMessage: declarativeContentDotonMessage = "declarativeContent.onMessage".asInstanceOf[declarativeContentDotonMessage]
  
  @scala.inline
  def declarativeContentDotonRequest: declarativeContentDotonRequest = "declarativeContent.onRequest".asInstanceOf[declarativeContentDotonRequest]
  
  @scala.inline
  def declarativeContentDotonResponseStarted: declarativeContentDotonResponseStarted = "declarativeContent.onResponseStarted".asInstanceOf[declarativeContentDotonResponseStarted]
  
  @scala.inline
  def declarativeContentDotonSendHeaders: declarativeContentDotonSendHeaders = "declarativeContent.onSendHeaders".asInstanceOf[declarativeContentDotonSendHeaders]
  
  @scala.inline
  def declarativeWebRequestDotAddRequestCookie: declarativeWebRequestDotAddRequestCookie = "declarativeWebRequest.AddRequestCookie".asInstanceOf[declarativeWebRequestDotAddRequestCookie]
  
  @scala.inline
  def declarativeWebRequestDotAddResponseCookie: declarativeWebRequestDotAddResponseCookie = "declarativeWebRequest.AddResponseCookie".asInstanceOf[declarativeWebRequestDotAddResponseCookie]
  
  @scala.inline
  def declarativeWebRequestDotAddResponseHeader: declarativeWebRequestDotAddResponseHeader = "declarativeWebRequest.AddResponseHeader".asInstanceOf[declarativeWebRequestDotAddResponseHeader]
  
  @scala.inline
  def declarativeWebRequestDotCancelRequest: declarativeWebRequestDotCancelRequest = "declarativeWebRequest.CancelRequest".asInstanceOf[declarativeWebRequestDotCancelRequest]
  
  @scala.inline
  def declarativeWebRequestDotEditRequestCookie: declarativeWebRequestDotEditRequestCookie = "declarativeWebRequest.EditRequestCookie".asInstanceOf[declarativeWebRequestDotEditRequestCookie]
  
  @scala.inline
  def declarativeWebRequestDotEditResponseCookie: declarativeWebRequestDotEditResponseCookie = "declarativeWebRequest.EditResponseCookie".asInstanceOf[declarativeWebRequestDotEditResponseCookie]
  
  @scala.inline
  def declarativeWebRequestDotIgnoreRules: declarativeWebRequestDotIgnoreRules = "declarativeWebRequest.IgnoreRules".asInstanceOf[declarativeWebRequestDotIgnoreRules]
  
  @scala.inline
  def declarativeWebRequestDotRedirectByRegEx: declarativeWebRequestDotRedirectByRegEx = "declarativeWebRequest.RedirectByRegEx".asInstanceOf[declarativeWebRequestDotRedirectByRegEx]
  
  @scala.inline
  def declarativeWebRequestDotRedirectRequest: declarativeWebRequestDotRedirectRequest = "declarativeWebRequest.RedirectRequest".asInstanceOf[declarativeWebRequestDotRedirectRequest]
  
  @scala.inline
  def declarativeWebRequestDotRedirectToEmptyDocument: declarativeWebRequestDotRedirectToEmptyDocument = "declarativeWebRequest.RedirectToEmptyDocument".asInstanceOf[declarativeWebRequestDotRedirectToEmptyDocument]
  
  @scala.inline
  def declarativeWebRequestDotRedirectToTransparentImage: declarativeWebRequestDotRedirectToTransparentImage = "declarativeWebRequest.RedirectToTransparentImage".asInstanceOf[declarativeWebRequestDotRedirectToTransparentImage]
  
  @scala.inline
  def declarativeWebRequestDotRemoveRequestCookie: declarativeWebRequestDotRemoveRequestCookie = "declarativeWebRequest.RemoveRequestCookie".asInstanceOf[declarativeWebRequestDotRemoveRequestCookie]
  
  @scala.inline
  def declarativeWebRequestDotRemoveRequestHeader: declarativeWebRequestDotRemoveRequestHeader = "declarativeWebRequest.RemoveRequestHeader".asInstanceOf[declarativeWebRequestDotRemoveRequestHeader]
  
  @scala.inline
  def declarativeWebRequestDotRemoveResponseCookie: declarativeWebRequestDotRemoveResponseCookie = "declarativeWebRequest.RemoveResponseCookie".asInstanceOf[declarativeWebRequestDotRemoveResponseCookie]
  
  @scala.inline
  def declarativeWebRequestDotRemoveResponseHeader: declarativeWebRequestDotRemoveResponseHeader = "declarativeWebRequest.RemoveResponseHeader".asInstanceOf[declarativeWebRequestDotRemoveResponseHeader]
  
  @scala.inline
  def declarativeWebRequestDotSendMessageToExtension: declarativeWebRequestDotSendMessageToExtension = "declarativeWebRequest.SendMessageToExtension".asInstanceOf[declarativeWebRequestDotSendMessageToExtension]
  
  @scala.inline
  def declarativeWebRequestDotSetRequestHeader: declarativeWebRequestDotSetRequestHeader = "declarativeWebRequest.SetRequestHeader".asInstanceOf[declarativeWebRequestDotSetRequestHeader]
  
  @scala.inline
  def deleted_ : deleted_ = "deleted".asInstanceOf[deleted_]
  
  @scala.inline
  def denied_ : denied_ = "denied".asInstanceOf[denied_]
  
  @scala.inline
  def desktopCapture: desktopCapture = "desktopCapture".asInstanceOf[desktopCapture]
  
  @scala.inline
  def desktop_or_laptop: desktop_or_laptop = "desktop_or_laptop".asInstanceOf[desktop_or_laptop]
  
  @scala.inline
  def development_ : development_ = "development".asInstanceOf[development_]
  
  @scala.inline
  def device__ : device__ = "device".asInstanceOf[device__]
  
  @scala.inline
  def diagnostics: diagnostics = "diagnostics".asInstanceOf[diagnostics]
  
  @scala.inline
  def dialog: dialog = "dialog".asInstanceOf[dialog]
  
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  
  @scala.inline
  def disabled__ : disabled__ = "disabled".asInstanceOf[disabled__]
  
  @scala.inline
  def disconnected__ : disconnected__ = "disconnected".asInstanceOf[disconnected__]
  
  @scala.inline
  def displaySource: displaySource = "displaySource".asInstanceOf[displaySource]
  
  @scala.inline
  def display_ : display_ = "display".asInstanceOf[display_]
  
  @scala.inline
  def dns: dns = "dns".asInstanceOf[dns]
  
  @scala.inline
  def documentScan: documentScan = "documentScan".asInstanceOf[documentScan]
  
  @scala.inline
  def document_end: document_end = "document_end".asInstanceOf[document_end]
  
  @scala.inline
  def document_idle: document_idle = "document_idle".asInstanceOf[document_idle]
  
  @scala.inline
  def document_start: document_start = "document_start".asInstanceOf[document_start]
  
  @scala.inline
  def download: download = "download".asInstanceOf[download]
  
  @scala.inline
  def drag: drag = "drag".asInstanceOf[drag]
  
  @scala.inline
  def dragend: dragend = "dragend".asInstanceOf[dragend]
  
  @scala.inline
  def dragenter: dragenter = "dragenter".asInstanceOf[dragenter]
  
  @scala.inline
  def dragexit: dragexit = "dragexit".asInstanceOf[dragexit]
  
  @scala.inline
  def dragleave: dragleave = "dragleave".asInstanceOf[dragleave]
  
  @scala.inline
  def dragover: dragover = "dragover".asInstanceOf[dragover]
  
  @scala.inline
  def dragstart: dragstart = "dragstart".asInstanceOf[dragstart]
  
  @scala.inline
  def drop: drop = "drop".asInstanceOf[drop]
  
  @scala.inline
  def durationchange: durationchange = "durationchange".asInstanceOf[durationchange]
  
  @scala.inline
  def ecdsaSign: ecdsaSign = "ecdsaSign".asInstanceOf[ecdsaSign]
  
  @scala.inline
  def editable_ : editable_ = "editable".asInstanceOf[editable_]
  
  @scala.inline
  def el: el = "el".asInstanceOf[el]
  
  @scala.inline
  def emptied: emptied = "emptied".asInstanceOf[emptied]
  
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  
  @scala.inline
  def `en-AU`: `en-AU` = "en-AU".asInstanceOf[`en-AU`]
  
  @scala.inline
  def `en-CA`: `en-CA` = "en-CA".asInstanceOf[`en-CA`]
  
  @scala.inline
  def `en-GB`: `en-GB` = "en-GB".asInstanceOf[`en-GB`]
  
  @scala.inline
  def `en-IN`: `en-IN` = "en-IN".asInstanceOf[`en-IN`]
  
  @scala.inline
  def `en-NZ`: `en-NZ` = "en-NZ".asInstanceOf[`en-NZ`]
  
  @scala.inline
  def `en-US`: `en-US` = "en-US".asInstanceOf[`en-US`]
  
  @scala.inline
  def `en-ZA`: `en-ZA` = "en-ZA".asInstanceOf[`en-ZA`]
  
  @scala.inline
  def en_001: en_001 = "en_001".asInstanceOf[en_001]
  
  @scala.inline
  def en_150: en_150 = "en_150".asInstanceOf[en_150]
  
  @scala.inline
  def enabled_ : enabled_ = "enabled".asInstanceOf[enabled_]
  
  @scala.inline
  def encryptAuthenticatedRead: encryptAuthenticatedRead = "encryptAuthenticatedRead".asInstanceOf[encryptAuthenticatedRead]
  
  @scala.inline
  def encryptAuthenticatedWrite: encryptAuthenticatedWrite = "encryptAuthenticatedWrite".asInstanceOf[encryptAuthenticatedWrite]
  
  @scala.inline
  def encryptRead: encryptRead = "encryptRead".asInstanceOf[encryptRead]
  
  @scala.inline
  def encryptWrite: encryptWrite = "encryptWrite".asInstanceOf[encryptWrite]
  
  @scala.inline
  def encryptedAuthenticatedRead: encryptedAuthenticatedRead = "encryptedAuthenticatedRead".asInstanceOf[encryptedAuthenticatedRead]
  
  @scala.inline
  def encryptedAuthenticatedWrite: encryptedAuthenticatedWrite = "encryptedAuthenticatedWrite".asInstanceOf[encryptedAuthenticatedWrite]
  
  @scala.inline
  def encryptedRead: encryptedRead = "encryptedRead".asInstanceOf[encryptedRead]
  
  @scala.inline
  def encryptedWrite: encryptedWrite = "encryptedWrite".asInstanceOf[encryptedWrite]
  
  @scala.inline
  def ended: ended = "ended".asInstanceOf[ended]
  
  @scala.inline
  def endpoint_ : endpoint_ = "endpoint".asInstanceOf[endpoint_]
  
  @scala.inline
  def enterpriseDotdeviceAttributes: enterpriseDotdeviceAttributes = "enterprise.deviceAttributes".asInstanceOf[enterpriseDotdeviceAttributes]
  
  @scala.inline
  def enterpriseDotplatformKeys: enterpriseDotplatformKeys = "enterprise.platformKeys".asInstanceOf[enterpriseDotplatformKeys]
  
  @scala.inline
  def eo: eo = "eo".asInstanceOf[eo]
  
  @scala.inline
  def ephemeral_app_ : ephemeral_app_ = "ephemeral_app".asInstanceOf[ephemeral_app_]
  
  @scala.inline
  def error_ : error_ = "error".asInstanceOf[error_]
  
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  
  @scala.inline
  def `es-419`: `es-419` = "es-419".asInstanceOf[`es-419`]
  
  @scala.inline
  def `es-AR`: `es-AR` = "es-AR".asInstanceOf[`es-AR`]
  
  @scala.inline
  def `es-CL`: `es-CL` = "es-CL".asInstanceOf[`es-CL`]
  
  @scala.inline
  def `es-CO`: `es-CO` = "es-CO".asInstanceOf[`es-CO`]
  
  @scala.inline
  def `es-CR`: `es-CR` = "es-CR".asInstanceOf[`es-CR`]
  
  @scala.inline
  def `es-ES`: `es-ES` = "es-ES".asInstanceOf[`es-ES`]
  
  @scala.inline
  def `es-HN`: `es-HN` = "es-HN".asInstanceOf[`es-HN`]
  
  @scala.inline
  def `es-MX`: `es-MX` = "es-MX".asInstanceOf[`es-MX`]
  
  @scala.inline
  def `es-PE`: `es-PE` = "es-PE".asInstanceOf[`es-PE`]
  
  @scala.inline
  def `es-US`: `es-US` = "es-US".asInstanceOf[`es-US`]
  
  @scala.inline
  def `es-UY`: `es-UY` = "es-UY".asInstanceOf[`es-UY`]
  
  @scala.inline
  def `es-VE`: `es-VE` = "es-VE".asInstanceOf[`es-VE`]
  
  @scala.inline
  def et: et = "et".asInstanceOf[et]
  
  @scala.inline
  def eu: eu = "eu".asInstanceOf[eu]
  
  @scala.inline
  def exit: exit = "exit".asInstanceOf[exit]
  
  @scala.inline
  def experimental: experimental = "experimental".asInstanceOf[experimental]
  
  @scala.inline
  def explicitFeedback: explicitFeedback = "explicitFeedback".asInstanceOf[explicitFeedback]
  
  @scala.inline
  def extendedProperties: extendedProperties = "extendedProperties".asInstanceOf[extendedProperties]
  
  @scala.inline
  def extension: extension = "extension".asInstanceOf[extension]
  
  @scala.inline
  def extensions_page_ : extensions_page_ = "extensions_page".asInstanceOf[extensions_page_]
  
  @scala.inline
  def fa: fa = "fa".asInstanceOf[fa]
  
  @scala.inline
  def failed_ : failed_ = "failed".asInstanceOf[failed_]
  
  @scala.inline
  def failure_ : failure_ = "failure".asInstanceOf[failure_]
  
  @scala.inline
  def feedback_ : feedback_ = "feedback".asInstanceOf[feedback_]
  
  @scala.inline
  def female: female = "female".asInstanceOf[female]
  
  @scala.inline
  def fi: fi = "fi".asInstanceOf[fi]
  
  @scala.inline
  def fil: fil = "fil".asInstanceOf[fil]
  
  @scala.inline
  def fileBrowserHandler: fileBrowserHandler = "fileBrowserHandler".asInstanceOf[fileBrowserHandler]
  
  @scala.inline
  def fileColonSlashSlashSlashAsteriskSlashAsterisk: fileColonSlashSlashSlashAsteriskSlashAsterisk = "file:///*/*".asInstanceOf[fileColonSlashSlashSlashAsteriskSlashAsterisk]
  
  @scala.inline
  def fileSystem: fileSystem = "fileSystem".asInstanceOf[fileSystem]
  
  @scala.inline
  def fileSystemProvider: fileSystemProvider = "fileSystemProvider".asInstanceOf[fileSystemProvider]
  
  @scala.inline
  def file_handler_ : file_handler_ = "file_handler".asInstanceOf[file_handler_]
  
  @scala.inline
  def filesystem_ : filesystem_ = "filesystem".asInstanceOf[filesystem_]
  
  @scala.inline
  def findupdate: findupdate = "findupdate".asInstanceOf[findupdate]
  
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  
  @scala.inline
  def fixed_ : fixed_ = "fixed".asInstanceOf[fixed_]
  
  @scala.inline
  def fo: fo = "fo".asInstanceOf[fo]
  
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  
  @scala.inline
  def focusin: focusin = "focusin".asInstanceOf[focusin]
  
  @scala.inline
  def focusout: focusout = "focusout".asInstanceOf[focusout]
  
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  
  @scala.inline
  def `fr-CA`: `fr-CA` = "fr-CA".asInstanceOf[`fr-CA`]
  
  @scala.inline
  def `fr-CH`: `fr-CH` = "fr-CH".asInstanceOf[`fr-CH`]
  
  @scala.inline
  def `fr-FR`: `fr-FR` = "fr-FR".asInstanceOf[`fr-FR`]
  
  @scala.inline
  def frame_ : frame_ = "frame".asInstanceOf[frame_]
  
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @scala.inline
  def fullscreen_ : fullscreen_ = "fullscreen".asInstanceOf[fullscreen_]
  
  @scala.inline
  def fullscreenchange: fullscreenchange = "fullscreenchange".asInstanceOf[fullscreenchange]
  
  @scala.inline
  def fullscreenerror: fullscreenerror = "fullscreenerror".asInstanceOf[fullscreenerror]
  
  @scala.inline
  def fy: fy = "fy".asInstanceOf[fy]
  
  @scala.inline
  def ga: ga = "ga".asInstanceOf[ga]
  
  @scala.inline
  def gamepad: gamepad = "gamepad".asInstanceOf[gamepad]
  
  @scala.inline
  def gcm: gcm = "gcm".asInstanceOf[gcm]
  
  @scala.inline
  def gd: gd = "gd".asInstanceOf[gd]
  
  @scala.inline
  def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @scala.inline
  def getter: getter = "getter".asInstanceOf[getter]
  
  @scala.inline
  def gl: gl = "gl".asInstanceOf[gl]
  
  @scala.inline
  def gn: gn = "gn".asInstanceOf[gn]
  
  @scala.inline
  def googDot: googDot = "goog.".asInstanceOf[googDot]
  
  @scala.inline
  def goog_ : goog_ = "goog".asInstanceOf[goog_]
  
  @scala.inline
  def google_ : google_ = "google".asInstanceOf[google_]
  
  @scala.inline
  def gotpointercapture: gotpointercapture = "gotpointercapture".asInstanceOf[gotpointercapture]
  
  @scala.inline
  def granted_ : granted_ = "granted".asInstanceOf[granted_]
  
  @scala.inline
  def gu: gu = "gu".asInstanceOf[gu]
  
  @scala.inline
  def ha: ha = "ha".asInstanceOf[ha]
  
  @scala.inline
  def haw: haw = "haw".asInstanceOf[haw]
  
  @scala.inline
  def he: he = "he".asInstanceOf[he]
  
  @scala.inline
  def hi: hi = "hi".asInstanceOf[hi]
  
  @scala.inline
  def hid: hid = "hid".asInstanceOf[hid]
  
  @scala.inline
  def hmn: hmn = "hmn".asInstanceOf[hmn]
  
  @scala.inline
  def hosted_app: hosted_app = "hosted_app".asInstanceOf[hosted_app]
  
  @scala.inline
  def hr: hr = "hr".asInstanceOf[hr]
  
  @scala.inline
  def ht: ht = "ht".asInstanceOf[ht]
  
  @scala.inline
  def httpColonSlashSlashAsteriskSlashAsterisk: httpColonSlashSlashAsteriskSlashAsterisk = "http://*/*".asInstanceOf[httpColonSlashSlashAsteriskSlashAsterisk]
  
  @scala.inline
  def httpsColonSlashSlashAsteriskSlashAsterisk: httpsColonSlashSlashAsteriskSlashAsterisk = "https://*/*".asInstanceOf[httpsColonSlashSlashAsteriskSlashAsterisk]
  
  @scala.inline
  def `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`: `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk` = "https://www.google-analytics.com/*".asInstanceOf[`httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`]
  
  @scala.inline
  def httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk: httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk = "https://www.googleapis.com/*".asInstanceOf[httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk]
  
  @scala.inline
  def hu: hu = "hu".asInstanceOf[hu]
  
  @scala.inline
  def hy: hy = "hy".asInstanceOf[hy]
  
  @scala.inline
  def ia: ia = "ia".asInstanceOf[ia]
  
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  
  @scala.inline
  def identity: identity = "identity".asInstanceOf[identity]
  
  @scala.inline
  def idle: idle = "idle".asInstanceOf[idle]
  
  @scala.inline
  def if_needed: if_needed = "if_needed".asInstanceOf[if_needed]
  
  @scala.inline
  def ig: ig = "ig".asInstanceOf[ig]
  
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @scala.inline
  def image_ : image_ = "image".asInstanceOf[image_]
  
  @scala.inline
  def in_ : in_ = "in".asInstanceOf[in_]
  
  @scala.inline
  def in_use_ : in_use_ = "in_use".asInstanceOf[in_use_]
  
  @scala.inline
  def incognito_persistent: incognito_persistent = "incognito_persistent".asInstanceOf[incognito_persistent]
  
  @scala.inline
  def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @scala.inline
  def indicate: indicate = "indicate".asInstanceOf[indicate]
  
  @scala.inline
  def initializing_ : initializing_ = "initializing".asInstanceOf[initializing_]
  
  @scala.inline
  def input_ : input_ = "input".asInstanceOf[input_]
  
  @scala.inline
  def install_ : install_ = "install".asInstanceOf[install_]
  
  @scala.inline
  def installed_notification_ : installed_notification_ = "installed_notification".asInstanceOf[installed_notification_]
  
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @scala.inline
  def interface_ : interface_ = "interface".asInstanceOf[interface_]
  
  @scala.inline
  def interrupt_ : interrupt_ = "interrupt".asInstanceOf[interrupt_]
  
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  
  @scala.inline
  def is: is = "is".asInstanceOf[is]
  
  @scala.inline
  def isochronous_ : isochronous_ = "isochronous".asInstanceOf[isochronous_]
  
  @scala.inline
  def it: it = "it".asInstanceOf[it]
  
  @scala.inline
  def `it-CH`: `it-CH` = "it-CH".asInstanceOf[`it-CH`]
  
  @scala.inline
  def `it-IT`: `it-IT` = "it-IT".asInstanceOf[`it-IT`]
  
  @scala.inline
  def ja: ja = "ja".asInstanceOf[ja]
  
  @scala.inline
  def joystick: joystick = "joystick".asInstanceOf[joystick]
  
  @scala.inline
  def jpeg: jpeg = "jpeg".asInstanceOf[jpeg]
  
  @scala.inline
  def jv: jv = "jv".asInstanceOf[jv]
  
  @scala.inline
  def ka: ka = "ka".asInstanceOf[ka]
  
  @scala.inline
  def keep: keep = "keep".asInstanceOf[keep]
  
  @scala.inline
  def keyboardMouseCombo: keyboardMouseCombo = "keyboardMouseCombo".asInstanceOf[keyboardMouseCombo]
  
  @scala.inline
  def keyboard_ : keyboard_ = "keyboard".asInstanceOf[keyboard_]
  
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
  
  @scala.inline
  def kill: kill = "kill".asInstanceOf[kill]
  
  @scala.inline
  def kiosk_ : kiosk_ = "kiosk".asInstanceOf[kiosk_]
  
  @scala.inline
  def kk: kk = "kk".asInstanceOf[kk]
  
  @scala.inline
  def km: km = "km".asInstanceOf[km]
  
  @scala.inline
  def kn: kn = "kn".asInstanceOf[kn]
  
  @scala.inline
  def known: known = "known".asInstanceOf[known]
  
  @scala.inline
  def ko: ko = "ko".asInstanceOf[ko]
  
  @scala.inline
  def ku: ku = "ku".asInstanceOf[ku]
  
  @scala.inline
  def ky: ky = "ky".asInstanceOf[ky]
  
  @scala.inline
  def la: la = "la".asInstanceOf[la]
  
  @scala.inline
  def last_write_win_ : last_write_win_ = "last_write_win".asInstanceOf[last_write_win_]
  
  @scala.inline
  def launcher_ : launcher_ = "launcher".asInstanceOf[launcher_]
  
  @scala.inline
  def lb: lb = "lb".asInstanceOf[lb]
  
  @scala.inline
  def left_ : left_ = "left".asInstanceOf[left_]
  
  @scala.inline
  def legacy_packaged_app: legacy_packaged_app = "legacy_packaged_app".asInstanceOf[legacy_packaged_app]
  
  @scala.inline
  def linkChanged: linkChanged = "linkChanged".asInstanceOf[linkChanged]
  
  @scala.inline
  def linkDown: linkDown = "linkDown".asInstanceOf[linkDown]
  
  @scala.inline
  def linkUp: linkUp = "linkUp".asInstanceOf[linkUp]
  
  @scala.inline
  def link_ : link_ = "link".asInstanceOf[link_]
  
  @scala.inline
  def linux_ : linux_ = "linux".asInstanceOf[linux_]
  
  @scala.inline
  def list_ : list_ = "list".asInstanceOf[list_]
  
  @scala.inline
  def ln: ln = "ln".asInstanceOf[ln]
  
  @scala.inline
  def lo: lo = "lo".asInstanceOf[lo]
  
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  
  @scala.inline
  def load_and_launch_ : load_and_launch_ = "load_and_launch".asInstanceOf[load_and_launch_]
  
  @scala.inline
  def loadabort: loadabort = "loadabort".asInstanceOf[loadabort]
  
  @scala.inline
  def loadcommit: loadcommit = "loadcommit".asInstanceOf[loadcommit]
  
  @scala.inline
  def loadeddata: loadeddata = "loadeddata".asInstanceOf[loadeddata]
  
  @scala.inline
  def loadedmetadata: loadedmetadata = "loadedmetadata".asInstanceOf[loadedmetadata]
  
  @scala.inline
  def loadplugin: loadplugin = "loadplugin".asInstanceOf[loadplugin]
  
  @scala.inline
  def loadredirect: loadredirect = "loadredirect".asInstanceOf[loadredirect]
  
  @scala.inline
  def loadstart: loadstart = "loadstart".asInstanceOf[loadstart]
  
  @scala.inline
  def loadstop: loadstop = "loadstop".asInstanceOf[loadstop]
  
  @scala.inline
  def local: local = "local".asInstanceOf[local]
  
  @scala.inline
  def local_to_remote_ : local_to_remote_ = "local_to_remote".asInstanceOf[local_to_remote_]
  
  @scala.inline
  def locked: locked = "locked".asInstanceOf[locked]
  
  @scala.inline
  def lostpointercapture: lostpointercapture = "lostpointercapture".asInstanceOf[lostpointercapture]
  
  @scala.inline
  def lt: lt = "lt".asInstanceOf[lt]
  
  @scala.inline
  def lv: lv = "lv".asInstanceOf[lv]
  
  @scala.inline
  def mac_ : mac_ = "mac".asInstanceOf[mac_]
  
  @scala.inline
  def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @scala.inline
  def male: male = "male".asInstanceOf[male]
  
  @scala.inline
  def managed: managed = "managed".asInstanceOf[managed]
  
  @scala.inline
  def management_api_ : management_api_ = "management_api".asInstanceOf[management_api_]
  
  @scala.inline
  def manual__ : manual__ = "manual".asInstanceOf[manual__]
  
  @scala.inline
  def maximized_ : maximized_ = "maximized".asInstanceOf[maximized_]
  
  @scala.inline
  def mdns: mdns = "mdns".asInstanceOf[mdns]
  
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  
  @scala.inline
  def mediaGalleries: mediaGalleries = "mediaGalleries".asInstanceOf[mediaGalleries]
  
  @scala.inline
  def media_pipeline_error_ : media_pipeline_error_ = "media_pipeline_error".asInstanceOf[media_pipeline_error_]
  
  @scala.inline
  def mg: mg = "mg".asInstanceOf[mg]
  
  @scala.inline
  def mi: mi = "mi".asInstanceOf[mi]
  
  @scala.inline
  def mimeTypeAndTags: mimeTypeAndTags = "mimeTypeAndTags".asInstanceOf[mimeTypeAndTags]
  
  @scala.inline
  def mimeTypeOnly: mimeTypeOnly = "mimeTypeOnly".asInstanceOf[mimeTypeOnly]
  
  @scala.inline
  def minimized_ : minimized_ = "minimized".asInstanceOf[minimized_]
  
  @scala.inline
  def mips64_ : mips64_ = "mips64".asInstanceOf[mips64_]
  
  @scala.inline
  def mips_ : mips_ = "mips".asInstanceOf[mips_]
  
  @scala.inline
  def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @scala.inline
  def mk: mk = "mk".asInstanceOf[mk]
  
  @scala.inline
  def ml: ml = "ml".asInstanceOf[ml]
  
  @scala.inline
  def mmx: mmx = "mmx".asInstanceOf[mmx]
  
  @scala.inline
  def mn: mn = "mn".asInstanceOf[mn]
  
  @scala.inline
  def mo: mo = "mo".asInstanceOf[mo]
  
  @scala.inline
  def modem: modem = "modem".asInstanceOf[modem]
  
  @scala.inline
  def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @scala.inline
  def mousedown: mousedown = "mousedown".asInstanceOf[mousedown]
  
  @scala.inline
  def mouseenter: mouseenter = "mouseenter".asInstanceOf[mouseenter]
  
  @scala.inline
  def mouseleave: mouseleave = "mouseleave".asInstanceOf[mouseleave]
  
  @scala.inline
  def mousemove: mousemove = "mousemove".asInstanceOf[mousemove]
  
  @scala.inline
  def mouseout: mouseout = "mouseout".asInstanceOf[mouseout]
  
  @scala.inline
  def mouseover: mouseover = "mouseover".asInstanceOf[mouseover]
  
  @scala.inline
  def mouseup: mouseup = "mouseup".asInstanceOf[mouseup]
  
  @scala.inline
  def mr: mr = "mr".asInstanceOf[mr]
  
  @scala.inline
  def ms: ms = "ms".asInstanceOf[ms]
  
  @scala.inline
  def mt: mt = "mt".asInstanceOf[mt]
  
  @scala.inline
  def my: my = "my".asInstanceOf[my]
  
  @scala.inline
  def nativeMessaging: nativeMessaging = "nativeMessaging".asInstanceOf[nativeMessaging]
  
  @scala.inline
  def nb: nb = "nb".asInstanceOf[nb]
  
  @scala.inline
  def ne: ne = "ne".asInstanceOf[ne]
  
  @scala.inline
  def network: network = "network".asInstanceOf[network]
  
  @scala.inline
  def networkingDotconfig: networkingDotconfig = "networking.config".asInstanceOf[networkingDotconfig]
  
  @scala.inline
  def networkingDotonc: networkingDotonc = "networking.onc".asInstanceOf[networkingDotonc]
  
  @scala.inline
  def new_background_tab: new_background_tab = "new_background_tab".asInstanceOf[new_background_tab]
  
  @scala.inline
  def new_foreground_tab: new_foreground_tab = "new_foreground_tab".asInstanceOf[new_foreground_tab]
  
  @scala.inline
  def new_note_ : new_note_ = "new_note".asInstanceOf[new_note_]
  
  @scala.inline
  def new_popup: new_popup = "new_popup".asInstanceOf[new_popup]
  
  @scala.inline
  def new_tab_page_ : new_tab_page_ = "new_tab_page".asInstanceOf[new_tab_page_]
  
  @scala.inline
  def new_window: new_window = "new_window".asInstanceOf[new_window]
  
  @scala.inline
  def newwindow: newwindow = "newwindow".asInstanceOf[newwindow]
  
  @scala.inline
  def nl: nl = "nl".asInstanceOf[nl]
  
  @scala.inline
  def nn: nn = "nn".asInstanceOf[nn]
  
  @scala.inline
  def no: no = "no".asInstanceOf[no]
  
  @scala.inline
  def no_such_device_ : no_such_device_ = "no_such_device".asInstanceOf[no_such_device_]
  
  @scala.inline
  def no_update_ : no_update_ = "no_update".asInstanceOf[no_update_]
  
  @scala.inline
  def none_ : none_ = "none".asInstanceOf[none_]
  
  @scala.inline
  def normal_ : normal_ = "normal".asInstanceOf[normal_]
  
  @scala.inline
  def not_connected: not_connected = "not_connected".asInstanceOf[not_connected]
  
  @scala.inline
  def not_controllable: not_controllable = "not_controllable".asInstanceOf[not_controllable]
  
  @scala.inline
  def not_listening: not_listening = "not_listening".asInstanceOf[not_listening]
  
  @scala.inline
  def notification_ : notification_ = "notification".asInstanceOf[notification_]
  
  @scala.inline
  def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @scala.inline
  def ny: ny = "ny".asInstanceOf[ny]
  
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  
  @scala.inline
  def oc: oc = "oc".asInstanceOf[oc]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def om: om = "om".asInstanceOf[om]
  
  @scala.inline
  def on: on = "on".asInstanceOf[on]
  
  @scala.inline
  def onAuthRequired: onAuthRequired = "onAuthRequired".asInstanceOf[onAuthRequired]
  
  @scala.inline
  def onBeforeRequest: onBeforeRequest = "onBeforeRequest".asInstanceOf[onBeforeRequest]
  
  @scala.inline
  def onBeforeSendHeaders: onBeforeSendHeaders = "onBeforeSendHeaders".asInstanceOf[onBeforeSendHeaders]
  
  @scala.inline
  def onHeadersReceived: onHeadersReceived = "onHeadersReceived".asInstanceOf[onHeadersReceived]
  
  @scala.inline
  def openDirectory: openDirectory = "openDirectory".asInstanceOf[openDirectory]
  
  @scala.inline
  def openFile: openFile = "openFile".asInstanceOf[openFile]
  
  @scala.inline
  def openWritableFile: openWritableFile = "openWritableFile".asInstanceOf[openWritableFile]
  
  @scala.inline
  def openbsd_ : openbsd_ = "openbsd".asInstanceOf[openbsd_]
  
  @scala.inline
  def or: or = "or".asInstanceOf[or]
  
  @scala.inline
  def os_update_ : os_update_ = "os_update".asInstanceOf[os_update_]
  
  @scala.inline
  def other_ : other_ = "other".asInstanceOf[other_]
  
  @scala.inline
  def out_ : out_ = "out".asInstanceOf[out_]
  
  @scala.inline
  def overrideEscFullscreen: overrideEscFullscreen = "overrideEscFullscreen".asInstanceOf[overrideEscFullscreen]
  
  @scala.inline
  def pa: pa = "pa".asInstanceOf[pa]
  
  @scala.inline
  def packaged_app: packaged_app = "packaged_app".asInstanceOf[packaged_app]
  
  @scala.inline
  def page_ : page_ = "page".asInstanceOf[page_]
  
  @scala.inline
  def page_action_ : page_action_ = "page_action".asInstanceOf[page_action_]
  
  @scala.inline
  def panel: panel = "panel".asInstanceOf[panel]
  
  @scala.inline
  def partial: partial = "partial".asInstanceOf[partial]
  
  @scala.inline
  def paste: paste = "paste".asInstanceOf[paste]
  
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  
  @scala.inline
  def pending_ : pending_ = "pending".asInstanceOf[pending_]
  
  @scala.inline
  def `per-origin`: `per-origin` = "per-origin".asInstanceOf[`per-origin`]
  
  @scala.inline
  def `per-view`: `per-view` = "per-view".asInstanceOf[`per-view`]
  
  @scala.inline
  def periodic_ : periodic_ = "periodic".asInstanceOf[periodic_]
  
  @scala.inline
  def peripheral: peripheral = "peripheral".asInstanceOf[peripheral]
  
  @scala.inline
  def permissionrequest: permissionrequest = "permissionrequest".asInstanceOf[permissionrequest]
  
  @scala.inline
  def permissions_increase_ : permissions_increase_ = "permissions_increase".asInstanceOf[permissions_increase_]
  
  @scala.inline
  def phone: phone = "phone".asInstanceOf[phone]
  
  @scala.inline
  def ping: ping = "ping".asInstanceOf[ping]
  
  @scala.inline
  def pl: pl = "pl".asInstanceOf[pl]
  
  @scala.inline
  def platformKeys: platformKeys = "platformKeys".asInstanceOf[platformKeys]
  
  @scala.inline
  def play: play = "play".asInstanceOf[play]
  
  @scala.inline
  def playing: playing = "playing".asInstanceOf[playing]
  
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  
  @scala.inline
  def pointerLock: pointerLock = "pointerLock".asInstanceOf[pointerLock]
  
  @scala.inline
  def pointercancel: pointercancel = "pointercancel".asInstanceOf[pointercancel]
  
  @scala.inline
  def pointerdown: pointerdown = "pointerdown".asInstanceOf[pointerdown]
  
  @scala.inline
  def pointerenter: pointerenter = "pointerenter".asInstanceOf[pointerenter]
  
  @scala.inline
  def pointerleave: pointerleave = "pointerleave".asInstanceOf[pointerleave]
  
  @scala.inline
  def pointermove: pointermove = "pointermove".asInstanceOf[pointermove]
  
  @scala.inline
  def pointerout: pointerout = "pointerout".asInstanceOf[pointerout]
  
  @scala.inline
  def pointerover: pointerover = "pointerover".asInstanceOf[pointerover]
  
  @scala.inline
  def pointerup: pointerup = "pointerup".asInstanceOf[pointerup]
  
  @scala.inline
  def power: power = "power".asInstanceOf[power]
  
  @scala.inline
  def printerProvider: printerProvider = "printerProvider".asInstanceOf[printerProvider]
  
  @scala.inline
  def progress_ : progress_ = "progress".asInstanceOf[progress_]
  
  @scala.inline
  def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @scala.inline
  def proxy: proxy = "proxy".asInstanceOf[proxy]
  
  @scala.inline
  def ps: ps = "ps".asInstanceOf[ps]
  
  @scala.inline
  def pt: pt = "pt".asInstanceOf[pt]
  
  @scala.inline
  def `pt-BR`: `pt-BR` = "pt-BR".asInstanceOf[`pt-BR`]
  
  @scala.inline
  def `pt-PT`: `pt-PT` = "pt-PT".asInstanceOf[`pt-PT`]
  
  @scala.inline
  def qu: qu = "qu".asInstanceOf[qu]
  
  @scala.inline
  def radio_ : radio_ = "radio".asInstanceOf[radio_]
  
  @scala.inline
  def ratechange: ratechange = "ratechange".asInstanceOf[ratechange]
  
  @scala.inline
  def read_ : read_ = "read".asInstanceOf[read_]
  
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  
  @scala.inline
  def regular_only: regular_only = "regular_only".asInstanceOf[regular_only]
  
  @scala.inline
  def rejected_ : rejected_ = "rejected".asInstanceOf[rejected_]
  
  @scala.inline
  def reliableWrite: reliableWrite = "reliableWrite".asInstanceOf[reliableWrite]
  
  @scala.inline
  def reload_ : reload_ = "reload".asInstanceOf[reload_]
  
  @scala.inline
  def remote_to_local_ : remote_to_local_ = "remote_to_local".asInstanceOf[remote_to_local_]
  
  @scala.inline
  def removable_ : removable_ = "removable".asInstanceOf[removable_]
  
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @scala.inline
  def requestFileSystem: requestFileSystem = "requestFileSystem".asInstanceOf[requestFileSystem]
  
  @scala.inline
  def reserved_ : reserved_ = "reserved".asInstanceOf[reserved_]
  
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  
  @scala.inline
  def responsive: responsive = "responsive".asInstanceOf[responsive]
  
  @scala.inline
  def restart_ : restart_ = "restart".asInstanceOf[restart_]
  
  @scala.inline
  def resume_ : resume_ = "resume".asInstanceOf[resume_]
  
  @scala.inline
  def retainEntries: retainEntries = "retainEntries".asInstanceOf[retainEntries]
  
  @scala.inline
  def right_ : right_ = "right".asInstanceOf[right_]
  
  @scala.inline
  def rm: rm = "rm".asInstanceOf[rm]
  
  @scala.inline
  def ro: ro = "ro".asInstanceOf[ro]
  
  @scala.inline
  def rsaSign: rsaSign = "rsaSign".asInstanceOf[rsaSign]
  
  @scala.inline
  def ru: ru = "ru".asInstanceOf[ru]
  
  @scala.inline
  def running_ : running_ = "running".asInstanceOf[running_]
  
  @scala.inline
  def runtime: runtime = "runtime".asInstanceOf[runtime]
  
  @scala.inline
  def saveFile: saveFile = "saveFile".asInstanceOf[saveFile]
  
  @scala.inline
  def save_to_disk: save_to_disk = "save_to_disk".asInstanceOf[save_to_disk]
  
  @scala.inline
  def screen_ : screen_ = "screen".asInstanceOf[screen_]
  
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  
  @scala.inline
  def scroll: scroll = "scroll".asInstanceOf[scroll]
  
  @scala.inline
  def sd: sd = "sd".asInstanceOf[sd]
  
  @scala.inline
  def securitypolicyviolation: securitypolicyviolation = "securitypolicyviolation".asInstanceOf[securitypolicyviolation]
  
  @scala.inline
  def seeked: seeked = "seeked".asInstanceOf[seeked]
  
  @scala.inline
  def seeking: seeking = "seeking".asInstanceOf[seeking]
  
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  
  @scala.inline
  def selection_ : selection_ = "selection".asInstanceOf[selection_]
  
  @scala.inline
  def selectionchange: selectionchange = "selectionchange".asInstanceOf[selectionchange]
  
  @scala.inline
  def selectstart: selectstart = "selectstart".asInstanceOf[selectstart]
  
  @scala.inline
  def separator_ : separator_ = "separator".asInstanceOf[separator_]
  
  @scala.inline
  def serial: serial = "serial".asInstanceOf[serial]
  
  @scala.inline
  def serviceType: serviceType = "serviceType".asInstanceOf[serviceType]
  
  @scala.inline
  def setter: setter = "setter".asInstanceOf[setter]
  
  @scala.inline
  def sh: sh = "sh".asInstanceOf[sh]
  
  @scala.inline
  def shared_module_update_ : shared_module_update_ = "shared_module_update".asInstanceOf[shared_module_update_]
  
  @scala.inline
  def shell: shell = "shell".asInstanceOf[shell]
  
  @scala.inline
  def showAddDialog: showAddDialog = "showAddDialog".asInstanceOf[showAddDialog]
  
  @scala.inline
  def showConfigureDialog: showConfigureDialog = "showConfigureDialog".asInstanceOf[showConfigureDialog]
  
  @scala.inline
  def si: si = "si".asInstanceOf[si]
  
  @scala.inline
  def sideload_ : sideload_ = "sideload".asInstanceOf[sideload_]
  
  @scala.inline
  def signedInDevices: signedInDevices = "signedInDevices".asInstanceOf[signedInDevices]
  
  @scala.inline
  def `sim-pin`: `sim-pin` = "sim-pin".asInstanceOf[`sim-pin`]
  
  @scala.inline
  def `sim-puk`: `sim-puk` = "sim-puk".asInstanceOf[`sim-puk`]
  
  @scala.inline
  def sizechanged: sizechanged = "sizechanged".asInstanceOf[sizechanged]
  
  @scala.inline
  def sk: sk = "sk".asInstanceOf[sk]
  
  @scala.inline
  def sl: sl = "sl".asInstanceOf[sl]
  
  @scala.inline
  def sm: sm = "sm".asInstanceOf[sm]
  
  @scala.inline
  def sn: sn = "sn".asInstanceOf[sn]
  
  @scala.inline
  def so: so = "so".asInstanceOf[so]
  
  @scala.inline
  def socket: socket = "socket".asInstanceOf[socket]
  
  @scala.inline
  def sq: sq = "sq".asInstanceOf[sq]
  
  @scala.inline
  def sr: sr = "sr".asInstanceOf[sr]
  
  @scala.inline
  def sse: sse = "sse".asInstanceOf[sse]
  
  @scala.inline
  def sse2: sse2 = "sse2".asInstanceOf[sse2]
  
  @scala.inline
  def sse3: sse3 = "sse3".asInstanceOf[sse3]
  
  @scala.inline
  def sse4_1: sse4_1 = "sse4_1".asInstanceOf[sse4_1]
  
  @scala.inline
  def sse4_2: sse4_2 = "sse4_2".asInstanceOf[sse4_2]
  
  @scala.inline
  def ssse3: ssse3 = "ssse3".asInstanceOf[ssse3]
  
  @scala.inline
  def st: st = "st".asInstanceOf[st]
  
  @scala.inline
  def stalled: stalled = "stalled".asInstanceOf[stalled]
  
  @scala.inline
  def standard_ : standard_ = "standard".asInstanceOf[standard_]
  
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @scala.inline
  def storage: storage = "storage".asInstanceOf[storage]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @scala.inline
  def su: su = "su".asInstanceOf[su]
  
  @scala.inline
  def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @scala.inline
  def submit: submit = "submit".asInstanceOf[submit]
  
  @scala.inline
  def succeeded_ : succeeded_ = "succeeded".asInstanceOf[succeeded_]
  
  @scala.inline
  def success_ : success_ = "success".asInstanceOf[success_]
  
  @scala.inline
  def suspend_ : suspend_ = "suspend".asInstanceOf[suspend_]
  
  @scala.inline
  def sv: sv = "sv".asInstanceOf[sv]
  
  @scala.inline
  def sw: sw = "sw".asInstanceOf[sw]
  
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  
  @scala.inline
  def syncFileSystem: syncFileSystem = "syncFileSystem".asInstanceOf[syncFileSystem]
  
  @scala.inline
  def synced_ : synced_ = "synced".asInstanceOf[synced_]
  
  @scala.inline
  def synchronous_ : synchronous_ = "synchronous".asInstanceOf[synchronous_]
  
  @scala.inline
  def systemDotcpu: systemDotcpu = "system.cpu".asInstanceOf[systemDotcpu]
  
  @scala.inline
  def systemDotdisplay: systemDotdisplay = "system.display".asInstanceOf[systemDotdisplay]
  
  @scala.inline
  def systemDotmemory: systemDotmemory = "system.memory".asInstanceOf[systemDotmemory]
  
  @scala.inline
  def systemDotnetwork: systemDotnetwork = "system.network".asInstanceOf[systemDotnetwork]
  
  @scala.inline
  def systemDotpowerSource: systemDotpowerSource = "system.powerSource".asInstanceOf[systemDotpowerSource]
  
  @scala.inline
  def systemDotstorage: systemDotstorage = "system.storage".asInstanceOf[systemDotstorage]
  
  @scala.inline
  def system_ : system_ = "system".asInstanceOf[system_]
  
  @scala.inline
  def system_error: system_error = "system_error".asInstanceOf[system_error]
  
  @scala.inline
  def system_tray_ : system_tray_ = "system_tray".asInstanceOf[system_tray_]
  
  @scala.inline
  def ta: ta = "ta".asInstanceOf[ta]
  
  @scala.inline
  def tab_ : tab_ = "tab".asInstanceOf[tab_]
  
  @scala.inline
  def tablet: tablet = "tablet".asInstanceOf[tablet]
  
  @scala.inline
  def te: te = "te".asInstanceOf[te]
  
  @scala.inline
  def temporary_unavailable_ : temporary_unavailable_ = "temporary_unavailable".asInstanceOf[temporary_unavailable_]
  
  @scala.inline
  def test_ : test_ = "test".asInstanceOf[test_]
  
  @scala.inline
  def textHtml: textHtml = "textHtml".asInstanceOf[textHtml]
  
  @scala.inline
  def textPlain: textPlain = "textPlain".asInstanceOf[textPlain]
  
  @scala.inline
  def tg: tg = "tg".asInstanceOf[tg]
  
  @scala.inline
  def th: th = "th".asInstanceOf[th]
  
  @scala.inline
  def theme: theme = "theme".asInstanceOf[theme]
  
  @scala.inline
  def throttled_ : throttled_ = "throttled".asInstanceOf[throttled_]
  
  @scala.inline
  def ti: ti = "ti".asInstanceOf[ti]
  
  @scala.inline
  def timeout_error_ : timeout_error_ = "timeout_error".asInstanceOf[timeout_error_]
  
  @scala.inline
  def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
  
  @scala.inline
  def tk: tk = "tk".asInstanceOf[tk]
  
  @scala.inline
  def tls1: tls1 = "tls1".asInstanceOf[tls1]
  
  @scala.inline
  def tls1Dot1: tls1Dot1 = "tls1.1".asInstanceOf[tls1Dot1]
  
  @scala.inline
  def tls1Dot2: tls1Dot2 = "tls1.2".asInstanceOf[tls1Dot2]
  
  @scala.inline
  def tls1Dot3: tls1Dot3 = "tls1.3".asInstanceOf[tls1Dot3]
  
  @scala.inline
  def to: to = "to".asInstanceOf[to]
  
  @scala.inline
  def toggle: toggle = "toggle".asInstanceOf[toggle]
  
  @scala.inline
  def top_ : top_ = "top".asInstanceOf[top_]
  
  @scala.inline
  def touchcancel: touchcancel = "touchcancel".asInstanceOf[touchcancel]
  
  @scala.inline
  def touchend: touchend = "touchend".asInstanceOf[touchend]
  
  @scala.inline
  def touchmove: touchmove = "touchmove".asInstanceOf[touchmove]
  
  @scala.inline
  def touchstart: touchstart = "touchstart".asInstanceOf[touchstart]
  
  @scala.inline
  def tr: tr = "tr".asInstanceOf[tr]
  
  @scala.inline
  def transitioncancel: transitioncancel = "transitioncancel".asInstanceOf[transitioncancel]
  
  @scala.inline
  def transitionend: transitionend = "transitionend".asInstanceOf[transitionend]
  
  @scala.inline
  def transitionrun: transitionrun = "transitionrun".asInstanceOf[transitionrun]
  
  @scala.inline
  def transitionstart: transitionstart = "transitionstart".asInstanceOf[transitionstart]
  
  @scala.inline
  def tt: tt = "tt".asInstanceOf[tt]
  
  @scala.inline
  def tts: tts = "tts".asInstanceOf[tts]
  
  @scala.inline
  def tw: tw = "tw".asInstanceOf[tw]
  
  @scala.inline
  def ug: ug = "ug".asInstanceOf[ug]
  
  @scala.inline
  def uk: uk = "uk".asInstanceOf[uk]
  
  @scala.inline
  def und: und = "und".asInstanceOf[und]
  
  @scala.inline
  def unhandled_ : unhandled_ = "unhandled".asInstanceOf[unhandled_]
  
  @scala.inline
  def unknown__ : unknown__ = "unknown".asInstanceOf[unknown__]
  
  @scala.inline
  def unknown_error_ : unknown_error_ = "unknown_error".asInstanceOf[unknown_error_]
  
  @scala.inline
  def unlimitedStorage: unlimitedStorage = "unlimitedStorage".asInstanceOf[unlimitedStorage]
  
  @scala.inline
  def unmanaged: unmanaged = "unmanaged".asInstanceOf[unmanaged]
  
  @scala.inline
  def unresponsive: unresponsive = "unresponsive".asInstanceOf[unresponsive]
  
  @scala.inline
  def untracked_ : untracked_ = "untracked".asInstanceOf[untracked_]
  
  @scala.inline
  def update_ : update_ = "update".asInstanceOf[update_]
  
  @scala.inline
  def update_available_ : update_available_ = "update_available".asInstanceOf[update_available_]
  
  @scala.inline
  def updated_ : updated_ = "updated".asInstanceOf[updated_]
  
  @scala.inline
  def ur: ur = "ur".asInstanceOf[ur]
  
  @scala.inline
  def url_handler_ : url_handler_ = "url_handler".asInstanceOf[url_handler_]
  
  @scala.inline
  def usbDevices: usbDevices = "usbDevices".asInstanceOf[usbDevices]
  
  @scala.inline
  def usb_ : usb_ = "usb".asInstanceOf[usb_]
  
  @scala.inline
  def user_ : user_ = "user".asInstanceOf[user_]
  
  @scala.inline
  def uz: uz = "uz".asInstanceOf[uz]
  
  @scala.inline
  def vendor_ : vendor_ = "vendor".asInstanceOf[vendor_]
  
  @scala.inline
  def vi: vi = "vi".asInstanceOf[vi]
  
  @scala.inline
  def videoCapture: videoCapture = "videoCapture".asInstanceOf[videoCapture]
  
  @scala.inline
  def video_ : video_ = "video".asInstanceOf[video_]
  
  @scala.inline
  def virtualKeyboard: virtualKeyboard = "virtualKeyboard".asInstanceOf[virtualKeyboard]
  
  @scala.inline
  def volumechange: volumechange = "volumechange".asInstanceOf[volumechange]
  
  @scala.inline
  def vpnProvider: vpnProvider = "vpnProvider".asInstanceOf[vpnProvider]
  
  @scala.inline
  def wa: wa = "wa".asInstanceOf[wa]
  
  @scala.inline
  def waiting: waiting = "waiting".asInstanceOf[waiting]
  
  @scala.inline
  def wallpaper: wallpaper = "wallpaper".asInstanceOf[wallpaper]
  
  @scala.inline
  def watch_dropped: watch_dropped = "watch_dropped".asInstanceOf[watch_dropped]
  
  @scala.inline
  def webgl: webgl = "webgl".asInstanceOf[webgl]
  
  @scala.inline
  def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @scala.inline
  def webview: webview = "webview".asInstanceOf[webview]
  
  @scala.inline
  def wheel: wheel = "wheel".asInstanceOf[wheel]
  
  @scala.inline
  def win_ : win_ = "win".asInstanceOf[win_]
  
  @scala.inline
  def window_ : window_ = "window".asInstanceOf[window_]
  
  @scala.inline
  def writableAuxiliaries: writableAuxiliaries = "writableAuxiliaries".asInstanceOf[writableAuxiliaries]
  
  @scala.inline
  def writeWithoutResponse: writeWithoutResponse = "writeWithoutResponse".asInstanceOf[writeWithoutResponse]
  
  @scala.inline
  def write_ : write_ = "write".asInstanceOf[write_]
  
  @scala.inline
  def `x86-32`: `x86-32` = "x86-32".asInstanceOf[`x86-32`]
  
  @scala.inline
  def `x86-64`: `x86-64` = "x86-64".asInstanceOf[`x86-64`]
  
  @scala.inline
  def xh: xh = "xh".asInstanceOf[xh]
  
  @scala.inline
  def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  
  @scala.inline
  def yes: yes = "yes".asInstanceOf[yes]
  
  @scala.inline
  def yi: yi = "yi".asInstanceOf[yi]
  
  @scala.inline
  def yo: yo = "yo".asInstanceOf[yo]
  
  @scala.inline
  def zh: zh = "zh".asInstanceOf[zh]
  
  @scala.inline
  def `zh-CN`: `zh-CN` = "zh-CN".asInstanceOf[`zh-CN`]
  
  @scala.inline
  def `zh-HK`: `zh-HK` = "zh-HK".asInstanceOf[`zh-HK`]
  
  @scala.inline
  def `zh-TW`: `zh-TW` = "zh-TW".asInstanceOf[`zh-TW`]
  
  @scala.inline
  def zh_hans_cn: zh_hans_cn = "zh_hans_cn".asInstanceOf[zh_hans_cn]
  
  @scala.inline
  def zh_hans_sg: zh_hans_sg = "zh_hans_sg".asInstanceOf[zh_hans_sg]
  
  @scala.inline
  def zh_hant_hk: zh_hant_hk = "zh_hant_hk".asInstanceOf[zh_hant_hk]
  
  @scala.inline
  def zh_hant_mo: zh_hant_mo = "zh_hant_mo".asInstanceOf[zh_hant_mo]
  
  @scala.inline
  def zh_hant_tw: zh_hant_tw = "zh_hant_tw".asInstanceOf[zh_hant_tw]
  
  @scala.inline
  def zoomchange: zoomchange = "zoomchange".asInstanceOf[zoomchange]
  
  @scala.inline
  def zu: zu = "zu".asInstanceOf[zu]
  
  @js.native
  sealed trait `8021X` extends EthernetAuthenticationType
  
  @js.native
  sealed trait ABORT extends js.Object
  
  @js.native
  sealed trait ABOUT_PAGE extends js.Object
  
  @js.native
  sealed trait ACCESS_DENIED extends js.Object
  
  @js.native
  sealed trait ADAPTIVE extends js.Object
  
  @js.native
  sealed trait ADDED extends js.Object
  
  @js.native
  sealed trait ADMIN extends js.Object
  
  @js.native
  sealed trait ALL extends js.Object
  
  @js.native
  sealed trait ANDROID extends js.Object
  
  @js.native
  sealed trait APP_LAUNCHER extends js.Object
  
  @js.native
  sealed trait APP_UPDATE extends js.Object
  
  @js.native
  sealed trait ARM extends js.Object
  
  @js.native
  sealed trait ASYNCHRONOUS extends js.Object
  
  @js.native
  sealed trait AUDIO extends js.Object
  
  @js.native
  sealed trait AUTHENTICATION_REQUIRED extends js.Object
  
  @js.native
  sealed trait Activated extends ActivationStateType
  
  @js.native
  sealed trait Activating extends ActivationStateType
  
  @js.native
  sealed trait AddRequestCookie extends js.Object
  
  @js.native
  sealed trait AddResponseCookie extends js.Object
  
  @js.native
  sealed trait AddResponseHeader extends js.Object
  
  @js.native
  sealed trait All_ extends NetworkType
  
  @js.native
  sealed trait Asterisk extends js.Object
  
  @js.native
  sealed trait BACKGROUND extends js.Object
  
  @js.native
  sealed trait BASIC extends js.Object
  
  @js.native
  sealed trait BLUETOOTH extends DeviceType
  
  @js.native
  sealed trait BOTTOM extends js.Object
  
  @js.native
  sealed trait BROWSER_ACTION extends js.Object
  
  @js.native
  sealed trait BULK extends js.Object
  
  @js.native
  sealed trait CAPABILITIES_NEGOTIATION_ERROR extends js.Object
  
  @js.native
  sealed trait CDMA extends js.Object
  
  @js.native
  sealed trait CENTER extends WallpaperLayoutType
  
  @js.native
  sealed trait CENTER_CROPPED extends WallpaperLayoutType
  
  @js.native
  sealed trait CHANGED extends js.Object
  
  @js.native
  sealed trait CHECKBOX extends js.Object
  
  @js.native
  sealed trait CHROME_INTERNAL extends js.Object
  
  @js.native
  sealed trait CHROME_UPDATE extends js.Object
  
  @js.native
  sealed trait CLASS extends js.Object
  
  @js.native
  sealed trait COMMAND_LINE extends js.Object
  
  @js.native
  sealed trait CONFLICTING extends js.Object
  
  @js.native
  sealed trait CONNECTED extends js.Object
  
  @js.native
  sealed trait CONNECTING extends js.Object
  
  @js.native
  sealed trait CONNECTION_ERROR extends js.Object
  
  @js.native
  sealed trait CONTEXT_MENU extends js.Object
  
  @js.native
  sealed trait CONTROL extends js.Object
  
  @js.native
  sealed trait CROS extends js.Object
  
  @js.native
  sealed trait CancelRequest extends js.Object
  
  @js.native
  sealed trait Cellular extends NetworkType
  
  @js.native
  sealed trait Connected_ extends ConnectionStateType
  
  @js.native
  sealed trait Connecting_ extends ConnectionStateType
  
  @js.native
  sealed trait DATA extends js.Object
  
  @js.native
  sealed trait DELETED extends js.Object
  
  @js.native
  sealed trait DENIED extends js.Object
  
  @js.native
  sealed trait DEVELOPMENT extends js.Object
  
  @js.native
  sealed trait DEVICE extends js.Object
  
  @js.native
  sealed trait DHCP extends IPConfigType
  
  @js.native
  sealed trait DISABLED extends js.Object
  
  @js.native
  sealed trait DISCONNECTED extends js.Object
  
  @js.native
  sealed trait DISPLAY extends js.Object
  
  @js.native
  sealed trait DevicePolicy extends js.Object
  
  @js.native
  sealed trait Device_ extends js.Object
  
  @js.native
  sealed trait Direct extends ProxySettingsType
  
  @js.native
  sealed trait Disabled_ extends DeviceState
  
  @js.native
  sealed trait Disconnected_ extends js.Object
  
  @js.native
  sealed trait ECDSA_SIGN extends js.Object
  
  @js.native
  sealed trait EDITABLE extends js.Object
  
  @js.native
  sealed trait ENDPOINT extends js.Object
  
  @js.native
  sealed trait EPHEMERAL_APP extends js.Object
  
  @js.native
  sealed trait ERROR extends js.Object
  
  @js.native
  sealed trait ERR_ABORTED extends LoadAbortReason
  
  @js.native
  sealed trait ERR_ADDRESS_UNREACHABLE extends LoadAbortReason
  
  @js.native
  sealed trait ERR_BLOCKED_BY_CLIENT extends LoadAbortReason
  
  @js.native
  sealed trait ERR_DISALLOWED_URL_SCHEME extends LoadAbortReason
  
  @js.native
  sealed trait ERR_EMPTY_RESPONSE extends LoadAbortReason
  
  @js.native
  sealed trait ERR_FILE_NOT_FOUND extends LoadAbortReason
  
  @js.native
  sealed trait ERR_INVALID_URL extends LoadAbortReason
  
  @js.native
  sealed trait ERR_UNKNOWN_URL_SCHEME extends LoadAbortReason
  
  @js.native
  sealed trait EXISTS extends js.Object
  
  @js.native
  sealed trait EXPLICIT_FEEDBACK extends js.Object
  
  @js.native
  sealed trait EXTENSIONS_PAGE extends js.Object
  
  @js.native
  sealed trait EditRequestCookie extends js.Object
  
  @js.native
  sealed trait EditResponseCookie extends js.Object
  
  @js.native
  sealed trait Enabled extends DeviceState
  
  @js.native
  sealed trait Enabling extends DeviceState
  
  @js.native
  sealed trait Ethernet extends NetworkType
  
  @js.native
  sealed trait FAILED extends js.Object
  
  @js.native
  sealed trait FAILURE extends js.Object
  
  @js.native
  sealed trait FEEDBACK extends js.Object
  
  @js.native
  sealed trait FILE_HANDLER extends js.Object
  
  @js.native
  sealed trait FIXED extends js.Object
  
  @js.native
  sealed trait FRAME extends js.Object
  
  @js.native
  sealed trait FRONT_MIC extends DeviceType
  
  @js.native
  sealed trait FULLSCREEN extends js.Object
  
  @js.native
  sealed trait GOOG extends DisallowedKeys
  
  @js.native
  sealed trait GOOGDot extends DisallowedKeys
  
  @js.native
  sealed trait GOOGLE extends DisallowedKeys
  
  @js.native
  sealed trait GRANTED extends js.Object
  
  @js.native
  sealed trait GSM extends js.Object
  
  @js.native
  sealed trait HDMI extends DeviceType
  
  @js.native
  sealed trait HEADPHONE extends DeviceType
  
  @js.native
  sealed trait HOTWORD extends DeviceType
  
  @js.native
  sealed trait IMAGE extends js.Object
  
  @js.native
  sealed trait IN extends js.Object
  
  @js.native
  sealed trait INITIALIZING extends js.Object
  
  @js.native
  sealed trait INPUT extends StreamType
  
  @js.native
  sealed trait INSTALL extends js.Object
  
  @js.native
  sealed trait INSTALLED_NOTIFICATION extends js.Object
  
  @js.native
  sealed trait INTERFACE extends js.Object
  
  @js.native
  sealed trait INTERNAL_MIC extends DeviceType
  
  @js.native
  sealed trait INTERNAL_SPEAKER extends DeviceType
  
  @js.native
  sealed trait INTERRUPT extends js.Object
  
  @js.native
  sealed trait INVALID_OPERATION extends js.Object
  
  @js.native
  sealed trait INVALID_PIN extends js.Object
  
  @js.native
  sealed trait INVALID_PUK extends js.Object
  
  @js.native
  sealed trait INVALID_URL extends js.Object
  
  @js.native
  sealed trait IN_USE extends js.Object
  
  @js.native
  sealed trait IO extends js.Object
  
  @js.native
  sealed trait IPv4 extends IPConfigurationType
  
  @js.native
  sealed trait IPv6 extends IPConfigurationType
  
  @js.native
  sealed trait ISOCHRONOUS extends js.Object
  
  @js.native
  sealed trait IgnoreRules extends js.Object
  
  @js.native
  sealed trait KEYBOARD extends js.Object
  
  @js.native
  sealed trait KEYBOARD_MIC extends DeviceType
  
  @js.native
  sealed trait KIOSK extends js.Object
  
  @js.native
  sealed trait LAST_WRITE_WIN extends js.Object
  
  @js.native
  sealed trait LAUNCHER extends js.Object
  
  @js.native
  sealed trait LEFT extends js.Object
  
  @js.native
  sealed trait LINEOUT extends DeviceType
  
  @js.native
  sealed trait LINK extends js.Object
  
  @js.native
  sealed trait LINK_CHANGED extends js.Object
  
  @js.native
  sealed trait LINK_DOWN extends js.Object
  
  @js.native
  sealed trait LINK_UP extends js.Object
  
  @js.native
  sealed trait LINUX extends js.Object
  
  @js.native
  sealed trait LIST extends js.Object
  
  @js.native
  sealed trait LOAD_AND_LAUNCH extends js.Object
  
  @js.native
  sealed trait LOCAL_TO_REMOTE extends js.Object
  
  @js.native
  sealed trait Lessthansignall_urlsGreaterthansign
    extends UrlMatches
       with OptionalPermission
  
  @js.native
  sealed trait MAC extends js.Object
  
  @js.native
  sealed trait MANAGEMENT_API extends js.Object
  
  @js.native
  sealed trait MANUAL extends js.Object
  
  @js.native
  sealed trait MAXIMIZED extends js.Object
  
  @js.native
  sealed trait MAX_ATTEMPTS_EXCEEDED extends js.Object
  
  @js.native
  sealed trait MD5_SHA1 extends Hash
  
  @js.native
  sealed trait MEDIA_PIPELINE_ERROR extends js.Object
  
  @js.native
  sealed trait MIC extends DeviceType
  
  @js.native
  sealed trait MINIMIZED extends js.Object
  
  @js.native
  sealed trait MIPS extends js.Object
  
  @js.native
  sealed trait MIPS64 extends js.Object
  
  @js.native
  sealed trait Manual_ extends ProxySettingsType
  
  @js.native
  sealed trait NEW_NOTE extends js.Object
  
  @js.native
  sealed trait NEW_TAB_PAGE extends js.Object
  
  @js.native
  sealed trait NORMAL extends js.Object
  
  @js.native
  sealed trait NOTIFICATION extends js.Object
  
  @js.native
  sealed trait NOT_A_DIRECTORY extends js.Object
  
  @js.native
  sealed trait NOT_A_FILE extends js.Object
  
  @js.native
  sealed trait NOT_EMPTY extends js.Object
  
  @js.native
  sealed trait NOT_FOUND extends js.Object
  
  @js.native
  sealed trait NO_MEMORY extends js.Object
  
  @js.native
  sealed trait NO_SPACE extends js.Object
  
  @js.native
  sealed trait NO_SUCH_DEVICE extends js.Object
  
  @js.native
  sealed trait NO_UPDATE extends js.Object
  
  @js.native
  sealed trait None extends EthernetAuthenticationType
  
  @js.native
  sealed trait NotActivated extends ActivationStateType
  
  @js.native
  sealed trait NotConnected extends ConnectionStateType
  
  @js.native
  sealed trait OFFLINE_NOT_NECESSARY extends js.Object
  
  @js.native
  sealed trait OK extends js.Object
  
  @js.native
  sealed trait OPENBSD extends js.Object
  
  @js.native
  sealed trait OPEN_AS_PINNED_TAB extends js.Object
  
  @js.native
  sealed trait OPEN_AS_REGULAR_TAB extends js.Object
  
  @js.native
  sealed trait OPEN_AS_WINDOW extends js.Object
  
  @js.native
  sealed trait OPEN_FULL_SCREEN extends js.Object
  
  @js.native
  sealed trait OS_UPDATE extends js.Object
  
  @js.native
  sealed trait OTHER extends DeviceType
  
  @js.native
  sealed trait OUT extends js.Object
  
  @js.native
  sealed trait OUTPUT extends StreamType
  
  @js.native
  sealed trait Offline extends CaptivePortalStatus
  
  @js.native
  sealed trait Online extends CaptivePortalStatus
  
  @js.native
  sealed trait PAC extends ProxySettingsType
  
  @js.native
  sealed trait PAGE extends js.Object
  
  @js.native
  sealed trait PAGE_ACTION extends js.Object
  
  @js.native
  sealed trait PBC extends js.Object
  
  @js.native
  sealed trait PENDING extends js.Object
  
  @js.native
  sealed trait PERIODIC extends js.Object
  
  @js.native
  sealed trait PERMISSIONS_INCREASE extends js.Object
  
  @js.native
  sealed trait PIN extends js.Object
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait POST_DSP_LOOPBACK extends DeviceType
  
  @js.native
  sealed trait POST_MIX_LOOPBACK extends DeviceType
  
  @js.native
  sealed trait PROGRESS extends js.Object
  
  @js.native
  sealed trait PUK extends js.Object
  
  @js.native
  sealed trait PartiallyActivated extends ActivationStateType
  
  @js.native
  sealed trait Pattern extends ClientCertType
  
  @js.native
  sealed trait Portal extends CaptivePortalStatus
  
  @js.native
  sealed trait Prohibited extends DeviceState
  
  @js.native
  sealed trait ProxyAuthRequired extends CaptivePortalStatus
  
  @js.native
  sealed trait RADIO extends js.Object
  
  @js.native
  sealed trait READ extends js.Object
  
  @js.native
  sealed trait REAR_MIC extends DeviceType
  
  @js.native
  sealed trait REJECTED extends js.Object
  
  @js.native
  sealed trait RELOAD extends js.Object
  
  @js.native
  sealed trait REMOTE_TO_LOCAL extends js.Object
  
  @js.native
  sealed trait REMOVABLE extends js.Object
  
  @js.native
  sealed trait RESERVED extends js.Object
  
  @js.native
  sealed trait RESTART extends js.Object
  
  @js.native
  sealed trait RESUME extends js.Object
  
  @js.native
  sealed trait RIGHT extends js.Object
  
  @js.native
  sealed trait RSA_SIGN extends js.Object
  
  @js.native
  sealed trait RUNNING extends js.Object
  
  @js.native
  sealed trait ReadOnly extends FileBrowserHandleExecuteId
  
  @js.native
  sealed trait ReadWrite extends FileBrowserHandleExecuteId
  
  @js.native
  sealed trait RedirectByRegEx extends js.Object
  
  @js.native
  sealed trait RedirectRequest extends js.Object
  
  @js.native
  sealed trait RedirectToEmptyDocument extends js.Object
  
  @js.native
  sealed trait RedirectToTransparentImage extends js.Object
  
  @js.native
  sealed trait Ref extends ClientCertType
  
  @js.native
  sealed trait RemoveRequestCookie extends js.Object
  
  @js.native
  sealed trait RemoveRequestHeader extends js.Object
  
  @js.native
  sealed trait RemoveResponseCookie extends js.Object
  
  @js.native
  sealed trait RemoveResponseHeader extends js.Object
  
  @js.native
  sealed trait RequestMatcher extends js.Object
  
  @js.native
  sealed trait SAVE_FOR_OFFLINE extends js.Object
  
  @js.native
  sealed trait SCREEN extends js.Object
  
  @js.native
  sealed trait SECURITY extends js.Object
  
  @js.native
  sealed trait SELECTION extends js.Object
  
  @js.native
  sealed trait SEPARATOR extends js.Object
  
  @js.native
  sealed trait SHA1 extends Hash
  
  @js.native
  sealed trait SHA256 extends Hash
  
  @js.native
  sealed trait SHA384 extends Hash
  
  @js.native
  sealed trait SHA512 extends Hash
  
  @js.native
  sealed trait SHARE extends js.Object
  
  @js.native
  sealed trait SHARED_MODULE_UPDATE extends js.Object
  
  @js.native
  sealed trait SHOW_ADD_DIALOG extends js.Object
  
  @js.native
  sealed trait SHOW_CONFIGURE_DIALOG extends js.Object
  
  @js.native
  sealed trait SIDELOAD extends js.Object
  
  @js.native
  sealed trait STANDARD extends js.Object
  
  @js.native
  sealed trait STRETCH extends WallpaperLayoutType
  
  @js.native
  sealed trait SUCCEEDED extends js.Object
  
  @js.native
  sealed trait SUCCESS extends js.Object
  
  @js.native
  sealed trait SUSPEND extends js.Object
  
  @js.native
  sealed trait SYNCED extends js.Object
  
  @js.native
  sealed trait SYNCHRONOUS extends js.Object
  
  @js.native
  sealed trait SYSTEM extends js.Object
  
  @js.native
  sealed trait SYSTEM_TRAY extends js.Object
  
  @js.native
  sealed trait SendMessageToExtension extends js.Object
  
  @js.native
  sealed trait SetRequestHeader extends js.Object
  
  @js.native
  sealed trait Static extends IPConfigType
  
  @js.native
  sealed trait TAB extends js.Object
  
  @js.native
  sealed trait TEMPORARY_UNAVAILABLE extends js.Object
  
  @js.native
  sealed trait TEST extends js.Object
  
  @js.native
  sealed trait TEXT_HTML extends js.Object
  
  @js.native
  sealed trait TEXT_PLAIN extends js.Object
  
  @js.native
  sealed trait THROTTLED extends js.Object
  
  @js.native
  sealed trait TIMEOUT_ERROR extends js.Object
  
  @js.native
  sealed trait TOO_MANY_OPENED extends js.Object
  
  @js.native
  sealed trait TOP extends js.Object
  
  @js.native
  sealed trait UNHANDLED extends js.Object
  
  @js.native
  sealed trait UNKNOWN extends js.Object
  
  @js.native
  sealed trait UNKNOWN_ERROR extends js.Object
  
  @js.native
  sealed trait UNTRACKED extends js.Object
  
  @js.native
  sealed trait UPDATE extends js.Object
  
  @js.native
  sealed trait UPDATED extends js.Object
  
  @js.native
  sealed trait UPDATE_AVAILABLE extends js.Object
  
  @js.native
  sealed trait URL_HANDLER extends js.Object
  
  @js.native
  sealed trait USB extends DeviceType
  
  @js.native
  sealed trait Uninitialized extends DeviceState
  
  @js.native
  sealed trait Unknown_ extends CaptivePortalStatus
  
  @js.native
  sealed trait User extends js.Object
  
  @js.native
  sealed trait UserPolicy extends js.Object
  
  @js.native
  sealed trait VENDOR extends js.Object
  
  @js.native
  sealed trait VIDEO extends js.Object
  
  @js.native
  sealed trait VPN extends NetworkType
  
  @js.native
  sealed trait `WEP-PSK` extends js.Object
  
  @js.native
  sealed trait WIN extends js.Object
  
  @js.native
  sealed trait WINDOW extends js.Object
  
  @js.native
  sealed trait WI_FI extends js.Object
  
  @js.native
  sealed trait `WPA-EAP` extends js.Object
  
  @js.native
  sealed trait `WPA-PSK` extends js.Object
  
  @js.native
  sealed trait WPAD extends ProxySettingsType
  
  @js.native
  sealed trait WRITE extends js.Object
  
  @js.native
  sealed trait WiFi extends NetworkType
  
  @js.native
  sealed trait WiMAX extends NetworkType
  
  @js.native
  sealed trait Wireless extends NetworkType
  
  @js.native
  sealed trait X86_32 extends js.Object
  
  @js.native
  sealed trait X86_64 extends js.Object
  
  @js.native
  sealed trait _empty extends js.Object
  
  @js.native
  sealed trait abnormal extends ExitEventReason
  
  @js.native
  sealed trait abort_ extends js.Object
  
  @js.native
  sealed trait about_page_ extends js.Object
  
  @js.native
  sealed trait activate extends js.Object
  
  @js.native
  sealed trait active extends IdleState
  
  @js.native
  sealed trait adaptive_ extends js.Object
  
  @js.native
  sealed trait added_ extends js.Object
  
  @js.native
  sealed trait admin_ extends js.Object
  
  @js.native
  sealed trait af
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait alarms
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait alert extends DialogMessageType
  
  @js.native
  sealed trait allAutoDetected extends js.Object
  
  @js.native
  sealed trait all__
    extends ContextType
       with DeviceFilterType
       with MetadataOptionsType
  
  @js.native
  sealed trait alwaysOnTopWindows
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait am
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait an
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait android_ extends OS
  
  @js.native
  sealed trait animationcancel extends js.Object
  
  @js.native
  sealed trait animationend extends js.Object
  
  @js.native
  sealed trait animationiteration extends js.Object
  
  @js.native
  sealed trait animationstart extends js.Object
  
  @js.native
  sealed trait appDotwindowDotalpha extends DevOnly
  
  @js.native
  sealed trait appDotwindowDotalwaysOnTop
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait appDotwindowDotfullscreen
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait appDotwindowDotfullscreenDotoverrideEsc
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait appDotwindowDotime extends UndocumentedPermissions
  
  @js.native
  sealed trait appDotwindowDotshape
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait app_launcher_ extends js.Object
  
  @js.native
  sealed trait app_update_ extends js.Object
  
  @js.native
  sealed trait appview
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait ar
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ar_001
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait arm_ extends js.Object
  
  @js.native
  sealed trait array extends js.Object
  
  @js.native
  sealed trait ast
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait asynchronous_ extends js.Object
  
  @js.native
  sealed trait audioCapture
    extends OptionalPermission
       with Permission
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.chromeApps.chrome.runtime.Permission because Already inherited */ @js.native
  sealed trait audio_
    extends KioskOnlyPermissions
       with ContextType
       with typings.chromeApps.chrome.bluetooth.DeviceType
       with MediaType
       with OptionalPermission
  
  @js.native
  sealed trait authenticatedSignedWrites extends CharacteristicProperties
  
  @js.native
  sealed trait authentication_required_ extends js.Object
  
  @js.native
  sealed trait author extends CSSOrigin
  
  @js.native
  sealed trait auxclick extends js.Object
  
  @js.native
  sealed trait available extends js.Object
  
  @js.native
  sealed trait avx extends js.Object
  
  @js.native
  sealed trait az
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait background_
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait basic_ extends js.Object
  
  @js.native
  sealed trait be
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait bg
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait bh
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait bluetooth_ extends DeviceVendorIdSource
  
  @js.native
  sealed trait blur extends js.Object
  
  @js.native
  sealed trait bn
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait bottom_ extends js.Object
  
  @js.native
  sealed trait br
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait broadcast
    extends AdvertisementType
       with CharacteristicProperties
  
  @js.native
  sealed trait browser
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait browser_action_ extends js.Object
  
  @js.native
  sealed trait bs
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait bulk_ extends js.Object
  
  @js.native
  sealed trait ca
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait cancel extends ScanProgressType
  
  @js.native
  sealed trait canplay extends js.Object
  
  @js.native
  sealed trait canplaythrough extends js.Object
  
  @js.native
  sealed trait capabilities_negotiation_error_ extends js.Object
  
  @js.native
  sealed trait carAudio
    extends typings.chromeApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait ceb
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait certificateProvider
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait changed_ extends js.Object
  
  @js.native
  sealed trait checkbox_ extends js.Object
  
  @js.native
  sealed trait chrome extends js.Object
  
  @js.native
  sealed trait chromeColonSlashSlashfaviconSlash
    extends UrlMatches
       with OptionalPermission
  
  @js.native
  sealed trait chrome_internal_ extends js.Object
  
  @js.native
  sealed trait chrome_os extends OS
  
  @js.native
  sealed trait chrome_update_ extends js.Object
  
  @js.native
  sealed trait ckb
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait class_ extends js.Object
  
  @js.native
  sealed trait clear extends js.Object
  
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait clipboard
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait clipboardRead
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait clipboardWrite
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait co
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait collapse_key extends DisallowedKeys
  
  @js.native
  sealed trait command_line_ extends js.Object
  
  @js.native
  sealed trait computer
    extends typings.chromeApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait confirm extends DialogMessageType
  
  @js.native
  sealed trait conflicting_ extends js.Object
  
  @js.native
  sealed trait connected__ extends js.Object
  
  @js.native
  sealed trait connection_error_ extends js.Object
  
  @js.native
  sealed trait consolemessage extends js.Object
  
  @js.native
  sealed trait contentload extends js.Object
  
  @js.native
  sealed trait contents_changed extends GalleryChangedType
  
  @js.native
  sealed trait contextMenus
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait context_menu_ extends js.Object
  
  @js.native
  sealed trait contextmenu extends js.Object
  
  @js.native
  sealed trait control_ extends js.Object
  
  @js.native
  sealed trait controllable_by_this_extension
    extends LevelOfControl
       with typings.chromeApps.chrome.types.LevelOfControl
  
  @js.native
  sealed trait controlled_by_other_extensions
    extends LevelOfControl
       with typings.chromeApps.chrome.types.LevelOfControl
  
  @js.native
  sealed trait controlled_by_this_extension
    extends LevelOfControl
       with typings.chromeApps.chrome.types.LevelOfControl
  
  @js.native
  sealed trait copy extends js.Object
  
  @js.native
  sealed trait crash extends ExitEventReason
  
  @js.native
  sealed trait created extends js.Object
  
  @js.native
  sealed trait cros_ extends js.Object
  
  @js.native
  sealed trait cs
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait csp_report extends ResourceType
  
  @js.native
  sealed trait cuechange extends js.Object
  
  @js.native
  sealed trait current_tab extends WindowOpenDisposition
  
  @js.native
  sealed trait cut extends js.Object
  
  @js.native
  sealed trait cy
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait da
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait data_ extends js.Object
  
  @js.native
  sealed trait dblclick extends js.Object
  
  @js.native
  sealed trait de
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `de-AT`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `de-CH`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `de-DE`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `de-LI`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait debugger extends NotAllowedAsOptionalPermissions
  
  @js.native
  sealed trait declarativeContentDotPageStateMatcher extends js.Object
  
  @js.native
  sealed trait declarativeContentDotonAuthRequired extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDotonBeforeRedirect extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDotonBeforeRequest extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDotonBeforeSendHeaders extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDotonCompleted extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDotonErrorOccured extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDotonHeadersReceived extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDotonMessage extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDotonRequest extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDotonResponseStarted extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDotonSendHeaders extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeWebRequestDotAddRequestCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotAddResponseCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotAddResponseHeader extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotCancelRequest extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotEditRequestCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotEditResponseCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotIgnoreRules extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotRedirectByRegEx extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotRedirectRequest extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotRedirectToEmptyDocument extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotRedirectToTransparentImage extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotRemoveRequestCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotRemoveRequestHeader extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotRemoveResponseCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotRemoveResponseHeader extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotSendMessageToExtension extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDotSetRequestHeader extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait deleted_ extends js.Object
  
  @js.native
  sealed trait denied_ extends js.Object
  
  @js.native
  sealed trait desktopCapture
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait desktop_or_laptop
    extends typings.chromeApps.chrome.signedInDevices.DeviceType
  
  @js.native
  sealed trait development_ extends js.Object
  
  @js.native
  sealed trait device__ extends js.Object
  
  @js.native
  sealed trait diagnostics extends DevOnly
  
  @js.native
  sealed trait dialog extends js.Object
  
  @js.native
  sealed trait directory extends js.Object
  
  @js.native
  sealed trait disabled__ extends ZoomMode
  
  @js.native
  sealed trait disconnected__ extends OnReceiveErrorCode
  
  @js.native
  sealed trait displaySource extends DevOnly
  
  @js.native
  sealed trait display_ extends js.Object
  
  @js.native
  sealed trait dns
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait documentScan
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait document_end extends RunAt
  
  @js.native
  sealed trait document_idle extends RunAt
  
  @js.native
  sealed trait document_start extends RunAt
  
  @js.native
  sealed trait download extends RequestedPermission
  
  @js.native
  sealed trait drag extends js.Object
  
  @js.native
  sealed trait dragend extends js.Object
  
  @js.native
  sealed trait dragenter extends js.Object
  
  @js.native
  sealed trait dragexit extends js.Object
  
  @js.native
  sealed trait dragleave extends js.Object
  
  @js.native
  sealed trait dragover extends js.Object
  
  @js.native
  sealed trait dragstart extends js.Object
  
  @js.native
  sealed trait drop extends js.Object
  
  @js.native
  sealed trait durationchange extends js.Object
  
  @js.native
  sealed trait ecdsaSign extends js.Object
  
  @js.native
  sealed trait editable_ extends ContextType
  
  @js.native
  sealed trait el
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait emptied extends js.Object
  
  @js.native
  sealed trait en
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `en-AU`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `en-CA`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `en-GB`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `en-IN`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `en-NZ`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `en-US`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `en-ZA`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait en_001
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait en_150
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait enabled_ extends js.Object
  
  @js.native
  sealed trait encryptAuthenticatedRead extends CharacteristicProperties
  
  @js.native
  sealed trait encryptAuthenticatedWrite extends CharacteristicProperties
  
  @js.native
  sealed trait encryptRead extends CharacteristicProperties
  
  @js.native
  sealed trait encryptWrite extends CharacteristicProperties
  
  @js.native
  sealed trait encryptedAuthenticatedRead extends DescriptorPermissions
  
  @js.native
  sealed trait encryptedAuthenticatedWrite extends DescriptorPermissions
  
  @js.native
  sealed trait encryptedRead extends DescriptorPermissions
  
  @js.native
  sealed trait encryptedWrite extends DescriptorPermissions
  
  @js.native
  sealed trait ended extends js.Object
  
  @js.native
  sealed trait endpoint_ extends js.Object
  
  @js.native
  sealed trait enterpriseDotdeviceAttributes
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait enterpriseDotplatformKeys
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait eo
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ephemeral_app_ extends js.Object
  
  @js.native
  sealed trait error_ extends ScanProgressType
  
  @js.native
  sealed trait es
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-419`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-AR`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-CL`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-CO`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-CR`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-ES`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-HN`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-MX`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-PE`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-US`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-UY`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `es-VE`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait et
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait eu
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait exit extends js.Object
  
  @js.native
  sealed trait experimental
    extends NotAllowedAsOptionalPermissions
       with Permission
  
  @js.native
  sealed trait explicitFeedback extends js.Object
  
  @js.native
  sealed trait extendedProperties extends CharacteristicProperties
  
  @js.native
  sealed trait extension extends js.Object
  
  @js.native
  sealed trait extensions_page_ extends js.Object
  
  @js.native
  sealed trait fa
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait failed_ extends js.Object
  
  @js.native
  sealed trait failure_ extends js.Object
  
  @js.native
  sealed trait feedback_ extends js.Object
  
  @js.native
  sealed trait female extends js.Object
  
  @js.native
  sealed trait fi
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait fil
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait fileBrowserHandler
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait fileColonSlashSlashSlashAsteriskSlashAsterisk
    extends UrlMatches
       with OptionalPermission
  
  @js.native
  sealed trait fileSystem
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait fileSystemProvider
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait file_handler_ extends js.Object
  
  @js.native
  sealed trait filesystem_ extends RequestedPermission
  
  @js.native
  sealed trait findupdate extends js.Object
  
  @js.native
  sealed trait finish extends ScanProgressType
  
  @js.native
  sealed trait fixed_ extends js.Object
  
  @js.native
  sealed trait fo
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait focus extends js.Object
  
  @js.native
  sealed trait focusin extends js.Object
  
  @js.native
  sealed trait focusout extends js.Object
  
  @js.native
  sealed trait font extends ResourceType
  
  @js.native
  sealed trait fr
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `fr-CA`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `fr-CH`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `fr-FR`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait frame_ extends ContextType
  
  @js.native
  sealed trait full extends InterfaceType
  
  @js.native
  sealed trait fullscreen_
    extends RequestedPermission
       with UndocumentedPermissions
  
  @js.native
  sealed trait fullscreenchange extends js.Object
  
  @js.native
  sealed trait fullscreenerror extends js.Object
  
  @js.native
  sealed trait fy
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ga
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait gamepad
    extends typings.chromeApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait gcm
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait gd
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait geolocation
    extends NotAllowedAsOptionalPermissions
       with Permission
       with RequestedPermission
  
  @js.native
  sealed trait getter extends ObjectFunction
  
  @js.native
  sealed trait gl
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait gn
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait googDot extends DisallowedKeys
  
  @js.native
  sealed trait goog_ extends DisallowedKeys
  
  @js.native
  sealed trait google_ extends DisallowedKeys
  
  @js.native
  sealed trait gotpointercapture extends js.Object
  
  @js.native
  sealed trait granted_ extends js.Object
  
  @js.native
  sealed trait gu
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ha
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait haw
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait he
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait hi
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait hid
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait hmn
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait hosted_app extends js.Object
  
  @js.native
  sealed trait hr
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ht
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait httpColonSlashSlashAsteriskSlashAsterisk
    extends UrlMatches
       with OptionalPermission
  
  @js.native
  sealed trait httpsColonSlashSlashAsteriskSlashAsterisk
    extends UrlMatches
       with OptionalPermission
  
  @js.native
  sealed trait `httpsColonSlashSlashwwwDotgoogle-analyticsDotcomSlashAsterisk`
    extends UrlMatches
       with OptionalPermission
  
  @js.native
  sealed trait httpsColonSlashSlashwwwDotgoogleapisDotcomSlashAsterisk
    extends UrlMatches
       with OptionalPermission
  
  @js.native
  sealed trait hu
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait hy
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ia
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait id
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait identity
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait idle
    extends IdleState
       with OptionalPermission
       with Permission
  
  @js.native
  sealed trait if_needed extends Interactive
  
  @js.native
  sealed trait ig
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ignore extends WindowOpenDisposition
  
  @js.native
  sealed trait image_
    extends ContextType
       with MediaType
       with ResourceType
  
  @js.native
  sealed trait in_ extends js.Object
  
  @js.native
  sealed trait in_use_ extends js.Object
  
  @js.native
  sealed trait incognito_persistent
    extends ChromeSettingScope
       with Scope
  
  @js.native
  sealed trait incognito_session_only
    extends ChromeSettingScope
       with Scope
  
  @js.native
  sealed trait indicate extends CharacteristicProperties
  
  @js.native
  sealed trait initializing_ extends js.Object
  
  @js.native
  sealed trait input_ extends js.Object
  
  @js.native
  sealed trait install_ extends js.Object
  
  @js.native
  sealed trait installed_notification_ extends js.Object
  
  @js.native
  sealed trait integer extends JSONBasicTypes
  
  @js.native
  sealed trait interface_ extends js.Object
  
  @js.native
  sealed trait interrupt_ extends js.Object
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait ios extends OS
  
  @js.native
  sealed trait is
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait isochronous_ extends js.Object
  
  @js.native
  sealed trait it
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `it-CH`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `it-IT`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ja
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait joystick
    extends typings.chromeApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait jpeg extends ImageType
  
  @js.native
  sealed trait jv
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ka
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait keep extends js.Object
  
  @js.native
  sealed trait keyboardMouseCombo
    extends typings.chromeApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait keyboard_
    extends typings.chromeApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait keydown extends js.Object
  
  @js.native
  sealed trait keypress extends js.Object
  
  @js.native
  sealed trait keyup extends js.Object
  
  @js.native
  sealed trait kill extends ExitEventReason
  
  @js.native
  sealed trait kiosk_ extends js.Object
  
  @js.native
  sealed trait kk
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait km
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait kn
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait known extends DeviceFilterType
  
  @js.native
  sealed trait ko
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ku
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ky
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait la
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait last_write_win_ extends js.Object
  
  @js.native
  sealed trait launcher_ extends js.Object
  
  @js.native
  sealed trait lb
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait left_ extends js.Object
  
  @js.native
  sealed trait legacy_packaged_app extends js.Object
  
  @js.native
  sealed trait linkChanged extends js.Object
  
  @js.native
  sealed trait linkDown extends js.Object
  
  @js.native
  sealed trait linkUp extends js.Object
  
  @js.native
  sealed trait link_ extends ContextType
  
  @js.native
  sealed trait linux_ extends OS
  
  @js.native
  sealed trait list_ extends js.Object
  
  @js.native
  sealed trait ln
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait lo
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait load extends js.Object
  
  @js.native
  sealed trait load_and_launch_ extends js.Object
  
  @js.native
  sealed trait loadabort extends js.Object
  
  @js.native
  sealed trait loadcommit extends js.Object
  
  @js.native
  sealed trait loadeddata extends js.Object
  
  @js.native
  sealed trait loadedmetadata extends js.Object
  
  @js.native
  sealed trait loadplugin extends RequestedPermission
  
  @js.native
  sealed trait loadredirect extends js.Object
  
  @js.native
  sealed trait loadstart extends js.Object
  
  @js.native
  sealed trait loadstop extends js.Object
  
  @js.native
  sealed trait local extends StorageAreas
  
  @js.native
  sealed trait local_to_remote_ extends js.Object
  
  @js.native
  sealed trait locked extends IdleState
  
  @js.native
  sealed trait lostpointercapture extends js.Object
  
  @js.native
  sealed trait lt
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait lv
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait mac_ extends OS
  
  @js.native
  sealed trait main_frame extends ResourceType
  
  @js.native
  sealed trait male extends js.Object
  
  @js.native
  sealed trait managed
    extends ManagedObject
       with StorageAreas
  
  @js.native
  sealed trait management_api_ extends js.Object
  
  @js.native
  sealed trait manual__ extends js.Object
  
  @js.native
  sealed trait maximized_ extends js.Object
  
  @js.native
  sealed trait mdns
    extends NotAllowedAsOptionalPermissions
       with Permission
  
  @js.native
  sealed trait media
    extends RequestedPermission
       with ResourceType
  
  @js.native
  sealed trait mediaGalleries
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait media_pipeline_error_ extends js.Object
  
  @js.native
  sealed trait mg
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait mi
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait mimeTypeAndTags extends MetadataOptionsType
  
  @js.native
  sealed trait mimeTypeOnly extends MetadataOptionsType
  
  @js.native
  sealed trait minimized_ extends js.Object
  
  @js.native
  sealed trait mips64_ extends js.Object
  
  @js.native
  sealed trait mips_ extends js.Object
  
  @js.native
  sealed trait mixed extends js.Object
  
  @js.native
  sealed trait mk
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ml
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait mmx extends js.Object
  
  @js.native
  sealed trait mn
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait mo
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait modem
    extends typings.chromeApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait mouse
    extends typings.chromeApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait mousedown extends js.Object
  
  @js.native
  sealed trait mouseenter extends js.Object
  
  @js.native
  sealed trait mouseleave extends js.Object
  
  @js.native
  sealed trait mousemove extends js.Object
  
  @js.native
  sealed trait mouseout extends js.Object
  
  @js.native
  sealed trait mouseover extends js.Object
  
  @js.native
  sealed trait mouseup extends js.Object
  
  @js.native
  sealed trait mr
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ms
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait mt
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait my
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait nativeMessaging
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait nb
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ne
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait network extends js.Object
  
  @js.native
  sealed trait networkingDotconfig
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait networkingDotonc
    extends KioskOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait new_background_tab extends WindowOpenDisposition
  
  @js.native
  sealed trait new_foreground_tab extends WindowOpenDisposition
  
  @js.native
  sealed trait new_note_ extends js.Object
  
  @js.native
  sealed trait new_popup extends WindowOpenDisposition
  
  @js.native
  sealed trait new_tab_page_ extends js.Object
  
  @js.native
  sealed trait new_window extends WindowOpenDisposition
  
  @js.native
  sealed trait newwindow extends js.Object
  
  @js.native
  sealed trait nl
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait nn
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait no
    extends Interactive
       with LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait no_such_device_ extends js.Object
  
  @js.native
  sealed trait no_update_ extends js.Object
  
  @js.native
  sealed trait none_ extends js.Object
  
  @js.native
  sealed trait normal_ extends ExitEventReason
  
  @js.native
  sealed trait not_connected extends OnReceiveErrorCode
  
  @js.native
  sealed trait not_controllable
    extends LevelOfControl
       with typings.chromeApps.chrome.types.LevelOfControl
  
  @js.native
  sealed trait not_listening extends OnAcceptErrorCode
  
  @js.native
  sealed trait notification_ extends js.Object
  
  @js.native
  sealed trait notifications
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait notify extends CharacteristicProperties
  
  @js.native
  sealed trait number extends JSONBasicTypes
  
  @js.native
  sealed trait ny
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `object` extends ResourceType
  
  @js.native
  sealed trait oc
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait off extends js.Object
  
  @js.native
  sealed trait om
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait on extends js.Object
  
  @js.native
  sealed trait onAuthRequired extends Stage
  
  @js.native
  sealed trait onBeforeRequest extends Stage
  
  @js.native
  sealed trait onBeforeSendHeaders extends Stage
  
  @js.native
  sealed trait onHeadersReceived extends Stage
  
  @js.native
  sealed trait openDirectory extends js.Object
  
  @js.native
  sealed trait openFile extends js.Object
  
  @js.native
  sealed trait openWritableFile extends js.Object
  
  @js.native
  sealed trait openbsd_ extends js.Object
  
  @js.native
  sealed trait or
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait os_update_ extends js.Object
  
  @js.native
  sealed trait other_ extends ResourceType
  
  @js.native
  sealed trait out_ extends js.Object
  
  @js.native
  sealed trait overrideEscFullscreen extends UndocumentedPermissions
  
  @js.native
  sealed trait pa
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait packaged_app extends js.Object
  
  @js.native
  sealed trait page_ extends ContextType
  
  @js.native
  sealed trait page_action_ extends js.Object
  
  @js.native
  sealed trait panel extends js.Object
  
  @js.native
  sealed trait partial extends InterfaceType
  
  @js.native
  sealed trait paste extends js.Object
  
  @js.native
  sealed trait pause extends js.Object
  
  @js.native
  sealed trait pending_ extends js.Object
  
  @js.native
  sealed trait `per-origin` extends ZoomMode
  
  @js.native
  sealed trait `per-view` extends ZoomMode
  
  @js.native
  sealed trait periodic_ extends js.Object
  
  @js.native
  sealed trait peripheral
    extends AdvertisementType
       with typings.chromeApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait permissionrequest extends js.Object
  
  @js.native
  sealed trait permissions_increase_ extends js.Object
  
  @js.native
  sealed trait phone
    extends typings.chromeApps.chrome.bluetooth.DeviceType
       with typings.chromeApps.chrome.signedInDevices.DeviceType
  
  @js.native
  sealed trait ping extends ResourceType
  
  @js.native
  sealed trait pl
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait platformKeys
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait play extends js.Object
  
  @js.native
  sealed trait playing extends js.Object
  
  @js.native
  sealed trait png extends ImageType
  
  @js.native
  sealed trait pointerLock
    extends OptionalPermission
       with Permission
       with RequestedPermission
  
  @js.native
  sealed trait pointercancel extends js.Object
  
  @js.native
  sealed trait pointerdown extends js.Object
  
  @js.native
  sealed trait pointerenter extends js.Object
  
  @js.native
  sealed trait pointerleave extends js.Object
  
  @js.native
  sealed trait pointermove extends js.Object
  
  @js.native
  sealed trait pointerout extends js.Object
  
  @js.native
  sealed trait pointerover extends js.Object
  
  @js.native
  sealed trait pointerup extends js.Object
  
  @js.native
  sealed trait power
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait printerProvider
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait progress_ extends js.Object
  
  @js.native
  sealed trait prompt extends DialogMessageType
  
  @js.native
  sealed trait proxy extends NotAllowedAsOptionalPermissions
  
  @js.native
  sealed trait ps
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait pt
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `pt-BR`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `pt-PT`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait qu
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait radio_ extends js.Object
  
  @js.native
  sealed trait ratechange extends js.Object
  
  @js.native
  sealed trait read_
    extends CharacteristicProperties
       with DescriptorPermissions
  
  @js.native
  sealed trait regular
    extends ChromeSettingScope
       with Scope
  
  @js.native
  sealed trait regular_only
    extends ChromeSettingScope
       with Scope
  
  @js.native
  sealed trait rejected_ extends js.Object
  
  @js.native
  sealed trait reliableWrite extends CharacteristicProperties
  
  @js.native
  sealed trait reload_ extends js.Object
  
  @js.native
  sealed trait remote_to_local_ extends js.Object
  
  @js.native
  sealed trait removable_ extends js.Object
  
  @js.native
  sealed trait removed extends js.Object
  
  @js.native
  sealed trait requestFileSystem extends js.Object
  
  @js.native
  sealed trait reserved_ extends js.Object
  
  @js.native
  sealed trait reset extends js.Object
  
  @js.native
  sealed trait resize extends js.Object
  
  @js.native
  sealed trait responsive extends js.Object
  
  @js.native
  sealed trait restart_ extends js.Object
  
  @js.native
  sealed trait resume_ extends js.Object
  
  @js.native
  sealed trait retainEntries extends js.Object
  
  @js.native
  sealed trait right_ extends js.Object
  
  @js.native
  sealed trait rm
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ro
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait rsaSign extends js.Object
  
  @js.native
  sealed trait ru
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait running_ extends js.Object
  
  @js.native
  sealed trait runtime
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait saveFile extends js.Object
  
  @js.native
  sealed trait save_to_disk extends WindowOpenDisposition
  
  @js.native
  sealed trait screen_ extends js.Object
  
  @js.native
  sealed trait script extends ResourceType
  
  @js.native
  sealed trait scroll extends js.Object
  
  @js.native
  sealed trait sd
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait securitypolicyviolation extends js.Object
  
  @js.native
  sealed trait seeked extends js.Object
  
  @js.native
  sealed trait seeking extends js.Object
  
  @js.native
  sealed trait select extends js.Object
  
  @js.native
  sealed trait selection_ extends ContextType
  
  @js.native
  sealed trait selectionchange extends js.Object
  
  @js.native
  sealed trait selectstart extends js.Object
  
  @js.native
  sealed trait separator_ extends js.Object
  
  @js.native
  sealed trait serial
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait serviceType extends js.Object
  
  @js.native
  sealed trait setter extends ObjectFunction
  
  @js.native
  sealed trait sh
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait shared_module_update_ extends js.Object
  
  @js.native
  sealed trait shell extends js.Object
  
  @js.native
  sealed trait showAddDialog extends js.Object
  
  @js.native
  sealed trait showConfigureDialog extends js.Object
  
  @js.native
  sealed trait si
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait sideload_ extends js.Object
  
  @js.native
  sealed trait signedInDevices extends DevOnly
  
  @js.native
  sealed trait `sim-pin` extends js.Object
  
  @js.native
  sealed trait `sim-puk` extends js.Object
  
  @js.native
  sealed trait sizechanged extends js.Object
  
  @js.native
  sealed trait sk
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait sl
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait sm
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait sn
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait so
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait socket extends OptionalPermission
  
  @js.native
  sealed trait sq
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait sr
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait sse extends js.Object
  
  @js.native
  sealed trait sse2 extends js.Object
  
  @js.native
  sealed trait sse3 extends js.Object
  
  @js.native
  sealed trait sse4_1 extends js.Object
  
  @js.native
  sealed trait sse4_2 extends js.Object
  
  @js.native
  sealed trait ssse3 extends js.Object
  
  @js.native
  sealed trait st
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait stalled extends js.Object
  
  @js.native
  sealed trait standard_ extends js.Object
  
  @js.native
  sealed trait start extends ScanProgressType
  
  @js.native
  sealed trait storage
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait string extends JSONBasicTypes
  
  @js.native
  sealed trait stylesheet extends ResourceType
  
  @js.native
  sealed trait su
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait sub_frame extends ResourceType
  
  @js.native
  sealed trait submit extends js.Object
  
  @js.native
  sealed trait succeeded_ extends js.Object
  
  @js.native
  sealed trait success_ extends js.Object
  
  @js.native
  sealed trait suspend_ extends js.Object
  
  @js.native
  sealed trait sv
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait sw
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait sync extends StorageAreas
  
  @js.native
  sealed trait syncFileSystem
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait synced_ extends js.Object
  
  @js.native
  sealed trait synchronous_ extends js.Object
  
  @js.native
  sealed trait systemDotcpu
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait systemDotdisplay
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait systemDotmemory
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait systemDotnetwork
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait systemDotpowerSource
    extends KioskOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait systemDotstorage
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait system_ extends js.Object
  
  @js.native
  sealed trait system_error
    extends OnAcceptErrorCode
       with OnReceiveErrorCode
  
  @js.native
  sealed trait system_tray_ extends js.Object
  
  @js.native
  sealed trait ta
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait tab_ extends js.Object
  
  @js.native
  sealed trait tablet
    extends typings.chromeApps.chrome.bluetooth.DeviceType
       with typings.chromeApps.chrome.signedInDevices.DeviceType
  
  @js.native
  sealed trait te
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait temporary_unavailable_ extends js.Object
  
  @js.native
  sealed trait test_ extends js.Object
  
  @js.native
  sealed trait textHtml extends js.Object
  
  @js.native
  sealed trait textPlain extends js.Object
  
  @js.native
  sealed trait tg
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait th
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait theme extends js.Object
  
  @js.native
  sealed trait throttled_ extends js.Object
  
  @js.native
  sealed trait ti
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait timeout_error_ extends js.Object
  
  @js.native
  sealed trait timeupdate extends js.Object
  
  @js.native
  sealed trait tk
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait tls1 extends js.Object
  
  @js.native
  sealed trait tls1Dot1 extends js.Object
  
  @js.native
  sealed trait tls1Dot2 extends js.Object
  
  @js.native
  sealed trait tls1Dot3 extends js.Object
  
  @js.native
  sealed trait to
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait toggle extends js.Object
  
  @js.native
  sealed trait top_ extends js.Object
  
  @js.native
  sealed trait touchcancel extends js.Object
  
  @js.native
  sealed trait touchend extends js.Object
  
  @js.native
  sealed trait touchmove extends js.Object
  
  @js.native
  sealed trait touchstart extends js.Object
  
  @js.native
  sealed trait tr
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait transitioncancel extends js.Object
  
  @js.native
  sealed trait transitionend extends js.Object
  
  @js.native
  sealed trait transitionrun extends js.Object
  
  @js.native
  sealed trait transitionstart extends js.Object
  
  @js.native
  sealed trait tt
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait tts
    extends NotAllowedAsOptionalPermissions
       with Permission
  
  @js.native
  sealed trait tw
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait ug
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait uk
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait und extends LanguageCode
  
  @js.native
  sealed trait unhandled_ extends js.Object
  
  @js.native
  sealed trait unknown__
    extends typings.chromeApps.chrome.signedInDevices.DeviceType
       with OS
       with ObjectFunction
  
  @js.native
  sealed trait unknown_error_ extends js.Object
  
  @js.native
  sealed trait unlimitedStorage
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait unmanaged extends ManagedObject
  
  @js.native
  sealed trait unresponsive extends js.Object
  
  @js.native
  sealed trait untracked_ extends js.Object
  
  @js.native
  sealed trait update_ extends js.Object
  
  @js.native
  sealed trait update_available_ extends js.Object
  
  @js.native
  sealed trait updated_ extends js.Object
  
  @js.native
  sealed trait ur
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait url_handler_ extends js.Object
  
  @js.native
  sealed trait usbDevices
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait usb_
    extends DeviceVendorIdSource
       with OptionalPermission
       with Permission
  
  @js.native
  sealed trait user_ extends CSSOrigin
  
  @js.native
  sealed trait uz
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait vendor_ extends js.Object
  
  @js.native
  sealed trait vi
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait videoCapture
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait video_
    extends ContextType
       with typings.chromeApps.chrome.bluetooth.DeviceType
       with MediaType
  
  @js.native
  sealed trait virtualKeyboard
    extends KioskOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait volumechange extends js.Object
  
  @js.native
  sealed trait vpnProvider
    extends ChromeOSOnlyPermissions
       with OptionalPermission
  
  @js.native
  sealed trait wa
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait waiting extends js.Object
  
  @js.native
  sealed trait wallpaper
    extends ChromeOSOnlyPermissions
       with NotAllowedAsOptionalPermissions
  
  @js.native
  sealed trait watch_dropped extends GalleryChangedType
  
  @js.native
  sealed trait webgl extends js.Object
  
  @js.native
  sealed trait websocket extends ResourceType
  
  @js.native
  sealed trait webview
    extends OptionalPermission
       with Permission
  
  @js.native
  sealed trait wheel extends js.Object
  
  @js.native
  sealed trait win_ extends OS
  
  @js.native
  sealed trait window_ extends js.Object
  
  @js.native
  sealed trait writableAuxiliaries extends CharacteristicProperties
  
  @js.native
  sealed trait writeWithoutResponse extends CharacteristicProperties
  
  @js.native
  sealed trait write_
    extends CharacteristicProperties
       with DescriptorPermissions
  
  @js.native
  sealed trait `x86-32` extends js.Object
  
  @js.native
  sealed trait `x86-64` extends js.Object
  
  @js.native
  sealed trait xh
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait xmlhttprequest extends ResourceType
  
  @js.native
  sealed trait yes extends Interactive
  
  @js.native
  sealed trait yi
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait yo
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait zh
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `zh-CN`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `zh-HK`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait `zh-TW`
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait zh_hans_cn
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait zh_hans_sg
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait zh_hant_hk
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait zh_hant_mo
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait zh_hant_tw
    extends LanguageCode
       with kLanguageInfoTable
  
  @js.native
  sealed trait zoomchange extends js.Object
  
  @js.native
  sealed trait zu
    extends LanguageCode
       with kLanguageInfoTable
}
