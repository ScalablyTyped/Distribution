package typings.chrome

import typings.chrome.chrome.contentSettings.DefaultContentSettingDetails
import typings.chrome.chrome.contentSettings.ScopeEnum
import typings.chrome.chrome.contextMenus.ContextItemType
import typings.chrome.chrome.contextMenus.ContextType
import typings.chrome.chrome.cookies.SameSiteStatus
import typings.chrome.chrome.downloads.DangerType
import typings.chrome.chrome.downloads.DownloadInterruptReason
import typings.chrome.chrome.downloads.DownloadState
import typings.chrome.chrome.downloads.FilenameConflictAction
import typings.chrome.chrome.idle.IdleState
import typings.chrome.chrome.input.ime.AssistiveWindowButton
import typings.chrome.chrome.loginState.ProfileType
import typings.chrome.chrome.loginState.SessionState
import typings.chrome.chrome.notifications.TemplateType
import typings.chrome.chrome.omnibox.OnInputEnteredDisposition
import typings.chrome.chrome.runtime.ManifestPermissions
import typings.chrome.chrome.runtime.PlatformArch
import typings.chrome.chrome.runtime.PlatformNaclArch
import typings.chrome.chrome.runtime.PlatformOs
import typings.chrome.chrome.runtime.RequestUpdateCheckStatus
import typings.chrome.chrome.scripting.ExecutionWorld
import typings.chrome.chrome.scripting.StyleOrigin
import typings.chrome.chrome.search.Disposition
import typings.chrome.chrome.storage.AccessLevel
import typings.chrome.chrome.storage.AreaName
import typings.chrome.chrome.tabGroups.ColorEnum
import typings.chrome.chrome.types._settingsScope
import typings.chrome.chrome.webRequest.ResourceType
import typings.chrome.chrome.windows.createTypeEnum
import typings.chrome.chrome.windows.windowStateEnum
import typings.chrome.chrome.windows.windowTypeEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait AUTHOR
    extends StObject
       with StyleOrigin
  inline def AUTHOR: AUTHOR = "AUTHOR".asInstanceOf[AUTHOR]
  
  @js.native
  sealed trait CENTER extends StObject
  inline def CENTER: CENTER = "CENTER".asInstanceOf[CENTER]
  
  @js.native
  sealed trait CENTER_CROPPED extends StObject
  inline def CENTER_CROPPED: CENTER_CROPPED = "CENTER_CROPPED".asInstanceOf[CENTER_CROPPED]
  
  @js.native
  sealed trait CRASH
    extends StObject
       with DownloadInterruptReason
  inline def CRASH: CRASH = "CRASH".asInstanceOf[CRASH]
  
  @js.native
  sealed trait CURRENT_TAB
    extends StObject
       with Disposition
  inline def CURRENT_TAB: CURRENT_TAB = "CURRENT_TAB".asInstanceOf[CURRENT_TAB]
  
  @js.native
  sealed trait FILE_ACCESS_DENIED
    extends StObject
       with DownloadInterruptReason
  inline def FILE_ACCESS_DENIED: FILE_ACCESS_DENIED = "FILE_ACCESS_DENIED".asInstanceOf[FILE_ACCESS_DENIED]
  
  @js.native
  sealed trait FILE_BLOCKED
    extends StObject
       with DownloadInterruptReason
  inline def FILE_BLOCKED: FILE_BLOCKED = "FILE_BLOCKED".asInstanceOf[FILE_BLOCKED]
  
  @js.native
  sealed trait FILE_FAILED
    extends StObject
       with DownloadInterruptReason
  inline def FILE_FAILED: FILE_FAILED = "FILE_FAILED".asInstanceOf[FILE_FAILED]
  
  @js.native
  sealed trait FILE_HASH_MISMATCH
    extends StObject
       with DownloadInterruptReason
  inline def FILE_HASH_MISMATCH: FILE_HASH_MISMATCH = "FILE_HASH_MISMATCH".asInstanceOf[FILE_HASH_MISMATCH]
  
  @js.native
  sealed trait FILE_NAME_TOO_LONG
    extends StObject
       with DownloadInterruptReason
  inline def FILE_NAME_TOO_LONG: FILE_NAME_TOO_LONG = "FILE_NAME_TOO_LONG".asInstanceOf[FILE_NAME_TOO_LONG]
  
  @js.native
  sealed trait FILE_NO_SPACE
    extends StObject
       with DownloadInterruptReason
  inline def FILE_NO_SPACE: FILE_NO_SPACE = "FILE_NO_SPACE".asInstanceOf[FILE_NO_SPACE]
  
  @js.native
  sealed trait FILE_SAME_AS_SOURCE
    extends StObject
       with DownloadInterruptReason
  inline def FILE_SAME_AS_SOURCE: FILE_SAME_AS_SOURCE = "FILE_SAME_AS_SOURCE".asInstanceOf[FILE_SAME_AS_SOURCE]
  
  @js.native
  sealed trait FILE_SECURITY_CHECK_FAILED
    extends StObject
       with DownloadInterruptReason
  inline def FILE_SECURITY_CHECK_FAILED: FILE_SECURITY_CHECK_FAILED = "FILE_SECURITY_CHECK_FAILED".asInstanceOf[FILE_SECURITY_CHECK_FAILED]
  
  @js.native
  sealed trait FILE_TOO_LARGE
    extends StObject
       with DownloadInterruptReason
  inline def FILE_TOO_LARGE: FILE_TOO_LARGE = "FILE_TOO_LARGE".asInstanceOf[FILE_TOO_LARGE]
  
  @js.native
  sealed trait FILE_TOO_SHORT
    extends StObject
       with DownloadInterruptReason
  inline def FILE_TOO_SHORT: FILE_TOO_SHORT = "FILE_TOO_SHORT".asInstanceOf[FILE_TOO_SHORT]
  
  @js.native
  sealed trait FILE_TRANSIENT_ERROR
    extends StObject
       with DownloadInterruptReason
  inline def FILE_TRANSIENT_ERROR: FILE_TRANSIENT_ERROR = "FILE_TRANSIENT_ERROR".asInstanceOf[FILE_TRANSIENT_ERROR]
  
  @js.native
  sealed trait FILE_VIRUS_INFECTED
    extends StObject
       with DownloadInterruptReason
  inline def FILE_VIRUS_INFECTED: FILE_VIRUS_INFECTED = "FILE_VIRUS_INFECTED".asInstanceOf[FILE_VIRUS_INFECTED]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait IN_LOCK_SCREEN
    extends StObject
       with SessionState
  inline def IN_LOCK_SCREEN: IN_LOCK_SCREEN = "IN_LOCK_SCREEN".asInstanceOf[IN_LOCK_SCREEN]
  
  @js.native
  sealed trait IN_LOGIN_SCREEN
    extends StObject
       with SessionState
  inline def IN_LOGIN_SCREEN: IN_LOGIN_SCREEN = "IN_LOGIN_SCREEN".asInstanceOf[IN_LOGIN_SCREEN]
  
  @js.native
  sealed trait IN_OOBE_SCREEN
    extends StObject
       with SessionState
  inline def IN_OOBE_SCREEN: IN_OOBE_SCREEN = "IN_OOBE_SCREEN".asInstanceOf[IN_OOBE_SCREEN]
  
  @js.native
  sealed trait IN_SESSION
    extends StObject
       with SessionState
  inline def IN_SESSION: IN_SESSION = "IN_SESSION".asInstanceOf[IN_SESSION]
  
  @js.native
  sealed trait ISOLATED
    extends StObject
       with ExecutionWorld
  inline def ISOLATED: ISOLATED = "ISOLATED".asInstanceOf[ISOLATED]
  
  @js.native
  sealed trait MAIN
    extends StObject
       with ExecutionWorld
  inline def MAIN: MAIN = "MAIN".asInstanceOf[MAIN]
  
  @js.native
  sealed trait NETWORK_DISCONNECTED
    extends StObject
       with DownloadInterruptReason
  inline def NETWORK_DISCONNECTED: NETWORK_DISCONNECTED = "NETWORK_DISCONNECTED".asInstanceOf[NETWORK_DISCONNECTED]
  
  @js.native
  sealed trait NETWORK_FAILED
    extends StObject
       with DownloadInterruptReason
  inline def NETWORK_FAILED: NETWORK_FAILED = "NETWORK_FAILED".asInstanceOf[NETWORK_FAILED]
  
  @js.native
  sealed trait NETWORK_INVALID_REQUEST
    extends StObject
       with DownloadInterruptReason
  inline def NETWORK_INVALID_REQUEST: NETWORK_INVALID_REQUEST = "NETWORK_INVALID_REQUEST".asInstanceOf[NETWORK_INVALID_REQUEST]
  
  @js.native
  sealed trait NETWORK_SERVER_DOWN
    extends StObject
       with DownloadInterruptReason
  inline def NETWORK_SERVER_DOWN: NETWORK_SERVER_DOWN = "NETWORK_SERVER_DOWN".asInstanceOf[NETWORK_SERVER_DOWN]
  
  @js.native
  sealed trait NETWORK_TIMEOUT
    extends StObject
       with DownloadInterruptReason
  inline def NETWORK_TIMEOUT: NETWORK_TIMEOUT = "NETWORK_TIMEOUT".asInstanceOf[NETWORK_TIMEOUT]
  
  @js.native
  sealed trait NEW_TAB
    extends StObject
       with Disposition
  inline def NEW_TAB: NEW_TAB = "NEW_TAB".asInstanceOf[NEW_TAB]
  
  @js.native
  sealed trait NEW_WINDOW
    extends StObject
       with Disposition
  inline def NEW_WINDOW: NEW_WINDOW = "NEW_WINDOW".asInstanceOf[NEW_WINDOW]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait SERVER_BAD_CONTENT
    extends StObject
       with DownloadInterruptReason
  inline def SERVER_BAD_CONTENT: SERVER_BAD_CONTENT = "SERVER_BAD_CONTENT".asInstanceOf[SERVER_BAD_CONTENT]
  
  @js.native
  sealed trait SERVER_CERT_PROBLEM
    extends StObject
       with DownloadInterruptReason
  inline def SERVER_CERT_PROBLEM: SERVER_CERT_PROBLEM = "SERVER_CERT_PROBLEM".asInstanceOf[SERVER_CERT_PROBLEM]
  
  @js.native
  sealed trait SERVER_CONTENT_LENGTH_MISMATCH
    extends StObject
       with DownloadInterruptReason
  inline def SERVER_CONTENT_LENGTH_MISMATCH: SERVER_CONTENT_LENGTH_MISMATCH = "SERVER_CONTENT_LENGTH_MISMATCH".asInstanceOf[SERVER_CONTENT_LENGTH_MISMATCH]
  
  @js.native
  sealed trait SERVER_CROSS_ORIGIN_REDIRECT
    extends StObject
       with DownloadInterruptReason
  inline def SERVER_CROSS_ORIGIN_REDIRECT: SERVER_CROSS_ORIGIN_REDIRECT = "SERVER_CROSS_ORIGIN_REDIRECT".asInstanceOf[SERVER_CROSS_ORIGIN_REDIRECT]
  
  @js.native
  sealed trait SERVER_FAILED
    extends StObject
       with DownloadInterruptReason
  inline def SERVER_FAILED: SERVER_FAILED = "SERVER_FAILED".asInstanceOf[SERVER_FAILED]
  
  @js.native
  sealed trait SERVER_FORBIDDEN
    extends StObject
       with DownloadInterruptReason
  inline def SERVER_FORBIDDEN: SERVER_FORBIDDEN = "SERVER_FORBIDDEN".asInstanceOf[SERVER_FORBIDDEN]
  
  @js.native
  sealed trait SERVER_NO_RANGE
    extends StObject
       with DownloadInterruptReason
  inline def SERVER_NO_RANGE: SERVER_NO_RANGE = "SERVER_NO_RANGE".asInstanceOf[SERVER_NO_RANGE]
  
  @js.native
  sealed trait SERVER_UNAUTHORIZED
    extends StObject
       with DownloadInterruptReason
  inline def SERVER_UNAUTHORIZED: SERVER_UNAUTHORIZED = "SERVER_UNAUTHORIZED".asInstanceOf[SERVER_UNAUTHORIZED]
  
  @js.native
  sealed trait SERVER_UNREACHABLE
    extends StObject
       with DownloadInterruptReason
  inline def SERVER_UNREACHABLE: SERVER_UNREACHABLE = "SERVER_UNREACHABLE".asInstanceOf[SERVER_UNREACHABLE]
  
  @js.native
  sealed trait SIGNIN_PROFILE
    extends StObject
       with ProfileType
  inline def SIGNIN_PROFILE: SIGNIN_PROFILE = "SIGNIN_PROFILE".asInstanceOf[SIGNIN_PROFILE]
  
  @js.native
  sealed trait STRETCH extends StObject
  inline def STRETCH: STRETCH = "STRETCH".asInstanceOf[STRETCH]
  
  @js.native
  sealed trait TRUSTED_AND_UNTRUSTED_CONTEXTS
    extends StObject
       with AccessLevel
  inline def TRUSTED_AND_UNTRUSTED_CONTEXTS: TRUSTED_AND_UNTRUSTED_CONTEXTS = "TRUSTED_AND_UNTRUSTED_CONTEXTS".asInstanceOf[TRUSTED_AND_UNTRUSTED_CONTEXTS]
  
  @js.native
  sealed trait TRUSTED_CONTEXTS
    extends StObject
       with AccessLevel
  inline def TRUSTED_CONTEXTS: TRUSTED_CONTEXTS = "TRUSTED_CONTEXTS".asInstanceOf[TRUSTED_CONTEXTS]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with SessionState
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait USER
    extends StObject
       with StyleOrigin
  inline def USER: USER = "USER".asInstanceOf[USER]
  
  @js.native
  sealed trait USER_CANCELED
    extends StObject
       with DownloadInterruptReason
  inline def USER_CANCELED: USER_CANCELED = "USER_CANCELED".asInstanceOf[USER_CANCELED]
  
  @js.native
  sealed trait USER_PROFILE
    extends StObject
       with ProfileType
  inline def USER_PROFILE: USER_PROFILE = "USER_PROFILE".asInstanceOf[USER_PROFILE]
  
  @js.native
  sealed trait USER_SHUTDOWN
    extends StObject
       with DownloadInterruptReason
  inline def USER_SHUTDOWN: USER_SHUTDOWN = "USER_SHUTDOWN".asInstanceOf[USER_SHUTDOWN]
  
  @js.native
  sealed trait accepted
    extends StObject
       with DangerType
  inline def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait action
    extends StObject
       with ContextType
  inline def action: action = "action".asInstanceOf[action]
  
  @js.native
  sealed trait active
    extends StObject
       with IdleState
  inline def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait activeTab
    extends StObject
       with ManifestPermissions
  inline def activeTab: activeTab = "activeTab".asInstanceOf[activeTab]
  
  @js.native
  sealed trait addToDictionary
    extends StObject
       with AssistiveWindowButton
  inline def addToDictionary: addToDictionary = "addToDictionary".asInstanceOf[addToDictionary]
  
  @js.native
  sealed trait alarms
    extends StObject
       with ManifestPermissions
  inline def alarms: alarms = "alarms".asInstanceOf[alarms]
  
  @js.native
  sealed trait all
    extends StObject
       with ContextType
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait allow
    extends StObject
       with DefaultContentSettingDetails
  inline def allow: allow = "allow".asInstanceOf[allow]
  
  @js.native
  sealed trait android
    extends StObject
       with PlatformOs
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait app
    extends StObject
       with windowTypeEnum
  inline def app: app = "app".asInstanceOf[app]
  
  @js.native
  sealed trait arm
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def arm: arm = "arm".asInstanceOf[arm]
  
  @js.native
  sealed trait arm64
    extends StObject
       with PlatformArch
  inline def arm64: arm64 = "arm64".asInstanceOf[arm64]
  
  @js.native
  sealed trait ask
    extends StObject
       with DefaultContentSettingDetails
  inline def ask: ask = "ask".asInstanceOf[ask]
  
  @js.native
  sealed trait audio
    extends StObject
       with ContextType
  inline def audio: audio = "audio".asInstanceOf[audio]
  
  @js.native
  sealed trait background
    extends StObject
       with ManifestPermissions
  inline def background: background = "background".asInstanceOf[background]
  
  @js.native
  sealed trait basic
    extends StObject
       with TemplateType
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait block
    extends StObject
       with DefaultContentSettingDetails
  inline def block: block = "block".asInstanceOf[block]
  
  @js.native
  sealed trait blue
    extends StObject
       with ColorEnum
  inline def blue: blue = "blue".asInstanceOf[blue]
  
  @js.native
  sealed trait bookmarks
    extends StObject
       with ManifestPermissions
  inline def bookmarks: bookmarks = "bookmarks".asInstanceOf[bookmarks]
  
  @js.native
  sealed trait bottom extends StObject
  inline def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait break extends StObject
  inline def break: break = "break".asInstanceOf[break]
  
  @js.native
  sealed trait browser_action
    extends StObject
       with ContextType
  inline def browser_action: browser_action = "browser_action".asInstanceOf[browser_action]
  
  @js.native
  sealed trait browsingData
    extends StObject
       with ManifestPermissions
  inline def browsingData: browsingData = "browsingData".asInstanceOf[browsingData]
  
  @js.native
  sealed trait buffer_overflow extends StObject
  inline def buffer_overflow: buffer_overflow = "buffer_overflow".asInstanceOf[buffer_overflow]
  
  @js.native
  sealed trait cancelled extends StObject
  inline def cancelled: cancelled = "cancelled".asInstanceOf[cancelled]
  
  @js.native
  sealed trait certificateProvider
    extends StObject
       with ManifestPermissions
  inline def certificateProvider: certificateProvider = "certificateProvider".asInstanceOf[certificateProvider]
  
  @js.native
  sealed trait checkbox
    extends StObject
       with ContextItemType
  inline def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @js.native
  sealed trait clipboardRead
    extends StObject
       with ManifestPermissions
  inline def clipboardRead: clipboardRead = "clipboardRead".asInstanceOf[clipboardRead]
  
  @js.native
  sealed trait clipboardWrite
    extends StObject
       with ManifestPermissions
  inline def clipboardWrite: clipboardWrite = "clipboardWrite".asInstanceOf[clipboardWrite]
  
  @js.native
  sealed trait complete
    extends StObject
       with DownloadState
  inline def complete: complete = "complete".asInstanceOf[complete]
  
  @js.native
  sealed trait content
    extends StObject
       with DangerType
  inline def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait contentSettings
    extends StObject
       with ManifestPermissions
  inline def contentSettings: contentSettings = "contentSettings".asInstanceOf[contentSettings]
  
  @js.native
  sealed trait contextMenus
    extends StObject
       with ManifestPermissions
  inline def contextMenus: contextMenus = "contextMenus".asInstanceOf[contextMenus]
  
  @js.native
  sealed trait controllable_by_this_extension extends StObject
  inline def controllable_by_this_extension: controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[controllable_by_this_extension]
  
  @js.native
  sealed trait controlled_by_other_extensions extends StObject
  inline def controlled_by_other_extensions: controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[controlled_by_other_extensions]
  
  @js.native
  sealed trait controlled_by_this_extension extends StObject
  inline def controlled_by_this_extension: controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[controlled_by_this_extension]
  
  @js.native
  sealed trait cookies
    extends StObject
       with ManifestPermissions
  inline def cookies: cookies = "cookies".asInstanceOf[cookies]
  
  @js.native
  sealed trait cros
    extends StObject
       with PlatformOs
  inline def cros: cros = "cros".asInstanceOf[cros]
  
  @js.native
  sealed trait csp_report
    extends StObject
       with ResourceType
  inline def csp_report: csp_report = "csp_report".asInstanceOf[csp_report]
  
  @js.native
  sealed trait currentTab
    extends StObject
       with OnInputEnteredDisposition
  inline def currentTab: currentTab = "currentTab".asInstanceOf[currentTab]
  
  @js.native
  sealed trait cursive extends StObject
  inline def cursive: cursive = "cursive".asInstanceOf[cursive]
  
  @js.native
  sealed trait cyan
    extends StObject
       with ColorEnum
  inline def cyan: cyan = "cyan".asInstanceOf[cyan]
  
  @js.native
  sealed trait dark extends StObject
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait debugger
    extends StObject
       with ManifestPermissions
  inline def debugger: debugger = "debugger".asInstanceOf[debugger]
  
  @js.native
  sealed trait declarativeContent
    extends StObject
       with ManifestPermissions
  inline def declarativeContent: declarativeContent = "declarativeContent".asInstanceOf[declarativeContent]
  
  @js.native
  sealed trait declarativeNetRequest
    extends StObject
       with ManifestPermissions
  inline def declarativeNetRequest: declarativeNetRequest = "declarativeNetRequest".asInstanceOf[declarativeNetRequest]
  
  @js.native
  sealed trait declarativeNetRequestFeedback
    extends StObject
       with ManifestPermissions
  inline def declarativeNetRequestFeedback: declarativeNetRequestFeedback = "declarativeNetRequestFeedback".asInstanceOf[declarativeNetRequestFeedback]
  
  @js.native
  sealed trait declarativeWebRequest
    extends StObject
       with ManifestPermissions
  inline def declarativeWebRequest: declarativeWebRequest = "declarativeWebRequest".asInstanceOf[declarativeWebRequest]
  
  @js.native
  sealed trait desktopCapture
    extends StObject
       with ManifestPermissions
  inline def desktopCapture: desktopCapture = "desktopCapture".asInstanceOf[desktopCapture]
  
  @js.native
  sealed trait detect_important_content
    extends StObject
       with DefaultContentSettingDetails
  inline def detect_important_content: detect_important_content = "detect_important_content".asInstanceOf[detect_important_content]
  
  @js.native
  sealed trait device_lost extends StObject
  inline def device_lost: device_lost = "device_lost".asInstanceOf[device_lost]
  
  @js.native
  sealed trait devtools
    extends StObject
       with windowTypeEnum
  inline def devtools: devtools = "devtools".asInstanceOf[devtools]
  
  @js.native
  sealed trait disconnected extends StObject
  inline def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @js.native
  sealed trait documentScan
    extends StObject
       with ManifestPermissions
  inline def documentScan: documentScan = "documentScan".asInstanceOf[documentScan]
  
  @js.native
  sealed trait document_end extends StObject
  inline def document_end: document_end = "document_end".asInstanceOf[document_end]
  
  @js.native
  sealed trait document_idle extends StObject
  inline def document_idle: document_idle = "document_idle".asInstanceOf[document_idle]
  
  @js.native
  sealed trait document_start extends StObject
  inline def document_start: document_start = "document_start".asInstanceOf[document_start]
  
  @js.native
  sealed trait downloads
    extends StObject
       with ManifestPermissions
  inline def downloads: downloads = "downloads".asInstanceOf[downloads]
  
  @js.native
  sealed trait editable
    extends StObject
       with ContextType
  inline def editable: editable = "editable".asInstanceOf[editable]
  
  @js.native
  sealed trait eight extends StObject
  inline def eight: eight = "eight".asInstanceOf[eight]
  
  @js.native
  sealed trait end extends StObject
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait enterpriseDotdeviceAttributes
    extends StObject
       with ManifestPermissions
  inline def enterpriseDotdeviceAttributes: enterpriseDotdeviceAttributes = "enterprise.deviceAttributes".asInstanceOf[enterpriseDotdeviceAttributes]
  
  @js.native
  sealed trait enterpriseDothardwarePlatform
    extends StObject
       with ManifestPermissions
  inline def enterpriseDothardwarePlatform: enterpriseDothardwarePlatform = "enterprise.hardwarePlatform".asInstanceOf[enterpriseDothardwarePlatform]
  
  @js.native
  sealed trait enterpriseDotnetworkingAttributes
    extends StObject
       with ManifestPermissions
  inline def enterpriseDotnetworkingAttributes: enterpriseDotnetworkingAttributes = "enterprise.networkingAttributes".asInstanceOf[enterpriseDotnetworkingAttributes]
  
  @js.native
  sealed trait enterpriseDotplatformKeys
    extends StObject
       with ManifestPermissions
  inline def enterpriseDotplatformKeys: enterpriseDotplatformKeys = "enterprise.platformKeys".asInstanceOf[enterpriseDotplatformKeys]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait even extends StObject
  inline def even: even = "even".asInstanceOf[even]
  
  @js.native
  sealed trait experimental
    extends StObject
       with ManifestPermissions
  inline def experimental: experimental = "experimental".asInstanceOf[experimental]
  
  @js.native
  sealed trait fantasy extends StObject
  inline def fantasy: fantasy = "fantasy".asInstanceOf[fantasy]
  
  @js.native
  sealed trait file
    extends StObject
       with DangerType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait fileBrowserHandler
    extends StObject
       with ManifestPermissions
  inline def fileBrowserHandler: fileBrowserHandler = "fileBrowserHandler".asInstanceOf[fileBrowserHandler]
  
  @js.native
  sealed trait fileSystemProvider
    extends StObject
       with ManifestPermissions
  inline def fileSystemProvider: fileSystemProvider = "fileSystemProvider".asInstanceOf[fileSystemProvider]
  
  @js.native
  sealed trait fixed extends StObject
  inline def fixed: fixed = "fixed".asInstanceOf[fixed]
  
  @js.native
  sealed trait font
    extends StObject
       with ResourceType
  inline def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait fontSettings
    extends StObject
       with ManifestPermissions
  inline def fontSettings: fontSettings = "fontSettings".asInstanceOf[fontSettings]
  
  @js.native
  sealed trait frame
    extends StObject
       with ContextType
  inline def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait frame_error extends StObject
  inline def frame_error: frame_error = "frame_error".asInstanceOf[frame_error]
  
  @js.native
  sealed trait fullscreen
    extends StObject
       with windowStateEnum
  inline def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
  
  @js.native
  sealed trait gcm
    extends StObject
       with ManifestPermissions
  inline def gcm: gcm = "gcm".asInstanceOf[gcm]
  
  @js.native
  sealed trait geolocation
    extends StObject
       with ManifestPermissions
  inline def geolocation: geolocation = "geolocation".asInstanceOf[geolocation]
  
  @js.native
  sealed trait green
    extends StObject
       with ColorEnum
  inline def green: green = "green".asInstanceOf[green]
  
  @js.native
  sealed trait grey
    extends StObject
       with ColorEnum
  inline def grey: grey = "grey".asInstanceOf[grey]
  
  @js.native
  sealed trait history
    extends StObject
       with ManifestPermissions
  inline def history: history = "history".asInstanceOf[history]
  
  @js.native
  sealed trait host
    extends StObject
       with DangerType
  inline def host: host = "host".asInstanceOf[host]
  
  @js.native
  sealed trait identity
    extends StObject
       with ManifestPermissions
  inline def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait idle
    extends StObject
       with IdleState
       with ManifestPermissions
  inline def idle: idle = "idle".asInstanceOf[idle]
  
  @js.native
  sealed trait image
    extends StObject
       with ContextType
       with ResourceType
       with TemplateType
  inline def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait in_progress
    extends StObject
       with DownloadState
  inline def in_progress: in_progress = "in_progress".asInstanceOf[in_progress]
  
  @js.native
  sealed trait incognito_persistent
    extends StObject
       with _settingsScope
  inline def incognito_persistent: incognito_persistent = "incognito_persistent".asInstanceOf[incognito_persistent]
  
  @js.native
  sealed trait incognito_session_only
    extends StObject
       with ScopeEnum
       with _settingsScope
  inline def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  
  @js.native
  sealed trait interrupted
    extends StObject
       with DownloadState
  inline def interrupted: interrupted = "interrupted".asInstanceOf[interrupted]
  
  @js.native
  sealed trait launcher
    extends StObject
       with ContextType
  inline def launcher: launcher = "launcher".asInstanceOf[launcher]
  
  @js.native
  sealed trait lax
    extends StObject
       with SameSiteStatus
  inline def lax: lax = "lax".asInstanceOf[lax]
  
  @js.native
  sealed trait left extends StObject
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait link
    extends StObject
       with ContextType
  inline def link: link = "link".asInstanceOf[link]
  
  @js.native
  sealed trait linux
    extends StObject
       with PlatformOs
  inline def linux: linux = "linux".asInstanceOf[linux]
  
  @js.native
  sealed trait list
    extends StObject
       with TemplateType
  inline def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait loading extends StObject
  inline def loading: loading = "loading".asInstanceOf[loading]
  
  @js.native
  sealed trait local
    extends StObject
       with AreaName
  inline def local: local = "local".asInstanceOf[local]
  
  @js.native
  sealed trait locked
    extends StObject
       with IdleState
  inline def locked: locked = "locked".asInstanceOf[locked]
  
  @js.native
  sealed trait `locked-fullscreen`
    extends StObject
       with windowStateEnum
  inline def `locked-fullscreen`: `locked-fullscreen` = "locked-fullscreen".asInstanceOf[`locked-fullscreen`]
  
  @js.native
  sealed trait loginState
    extends StObject
       with ManifestPermissions
  inline def loginState: loginState = "loginState".asInstanceOf[loginState]
  
  @js.native
  sealed trait mac
    extends StObject
       with PlatformOs
  inline def mac: mac = "mac".asInstanceOf[mac]
  
  @js.native
  sealed trait main_frame
    extends StObject
       with ResourceType
  inline def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  
  @js.native
  sealed trait managed
    extends StObject
       with AreaName
  inline def managed: managed = "managed".asInstanceOf[managed]
  
  @js.native
  sealed trait management
    extends StObject
       with ManifestPermissions
  inline def management: management = "management".asInstanceOf[management]
  
  @js.native
  sealed trait marker extends StObject
  inline def marker: marker = "marker".asInstanceOf[marker]
  
  @js.native
  sealed trait maximized
    extends StObject
       with windowStateEnum
  inline def maximized: maximized = "maximized".asInstanceOf[maximized]
  
  @js.native
  sealed trait media
    extends StObject
       with ResourceType
  inline def media: media = "media".asInstanceOf[media]
  
  @js.native
  sealed trait minimized
    extends StObject
       with windowStateEnum
  inline def minimized: minimized = "minimized".asInstanceOf[minimized]
  
  @js.native
  sealed trait mips
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def mips: mips = "mips".asInstanceOf[mips]
  
  @js.native
  sealed trait mips64
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def mips64: mips64 = "mips64".asInstanceOf[mips64]
  
  @js.native
  sealed trait mixed extends StObject
  inline def mixed: mixed = "mixed".asInstanceOf[mixed]
  
  @js.native
  sealed trait module extends StObject
  inline def module: module = "module".asInstanceOf[module]
  
  @js.native
  sealed trait nativeMessaging
    extends StObject
       with ManifestPermissions
  inline def nativeMessaging: nativeMessaging = "nativeMessaging".asInstanceOf[nativeMessaging]
  
  @js.native
  sealed trait newBackgroundTab
    extends StObject
       with OnInputEnteredDisposition
  inline def newBackgroundTab: newBackgroundTab = "newBackgroundTab".asInstanceOf[newBackgroundTab]
  
  @js.native
  sealed trait newForegroundTab
    extends StObject
       with OnInputEnteredDisposition
  inline def newForegroundTab: newForegroundTab = "newForegroundTab".asInstanceOf[newForegroundTab]
  
  @js.native
  sealed trait no extends StObject
  inline def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait no_restriction
    extends StObject
       with SameSiteStatus
  inline def no_restriction: no_restriction = "no_restriction".asInstanceOf[no_restriction]
  
  @js.native
  sealed trait no_update
    extends StObject
       with RequestUpdateCheckStatus
  inline def no_update: no_update = "no_update".asInstanceOf[no_update]
  
  @js.native
  sealed trait normal
    extends StObject
       with ContextItemType
       with createTypeEnum
       with windowStateEnum
       with windowTypeEnum
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait not_controllable extends StObject
  inline def not_controllable: not_controllable = "not_controllable".asInstanceOf[not_controllable]
  
  @js.native
  sealed trait notifications
    extends StObject
       with ManifestPermissions
  inline def notifications: notifications = "notifications".asInstanceOf[notifications]
  
  @js.native
  sealed trait `object`
    extends StObject
       with ResourceType
  inline def `object`: `object` = "object".asInstanceOf[`object`]
  
  @js.native
  sealed trait odd extends StObject
  inline def odd: odd = "odd".asInstanceOf[odd]
  
  @js.native
  sealed trait off extends StObject
  inline def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait one extends StObject
  inline def one: one = "one".asInstanceOf[one]
  
  @js.native
  sealed trait openbsd
    extends StObject
       with PlatformOs
  inline def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  
  @js.native
  sealed trait orange
    extends StObject
       with ColorEnum
  inline def orange: orange = "orange".asInstanceOf[orange]
  
  @js.native
  sealed trait other
    extends StObject
       with ResourceType
  inline def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait overrun extends StObject
  inline def overrun: overrun = "overrun".asInstanceOf[overrun]
  
  @js.native
  sealed trait overwrite
    extends StObject
       with FilenameConflictAction
  inline def overwrite: overwrite = "overwrite".asInstanceOf[overwrite]
  
  @js.native
  sealed trait page
    extends StObject
       with ContextType
  inline def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait pageCapture
    extends StObject
       with ManifestPermissions
  inline def pageCapture: pageCapture = "pageCapture".asInstanceOf[pageCapture]
  
  @js.native
  sealed trait page_action
    extends StObject
       with ContextType
  inline def page_action: page_action = "page_action".asInstanceOf[page_action]
  
  @js.native
  sealed trait panel
    extends StObject
       with createTypeEnum
       with windowTypeEnum
  inline def panel: panel = "panel".asInstanceOf[panel]
  
  @js.native
  sealed trait parity_error extends StObject
  inline def parity_error: parity_error = "parity_error".asInstanceOf[parity_error]
  
  @js.native
  sealed trait pause extends StObject
  inline def pause: pause = "pause".asInstanceOf[pause]
  
  @js.native
  sealed trait ping
    extends StObject
       with ResourceType
  inline def ping: ping = "ping".asInstanceOf[ping]
  
  @js.native
  sealed trait pink
    extends StObject
       with ColorEnum
  inline def pink: pink = "pink".asInstanceOf[pink]
  
  @js.native
  sealed trait platformKeys
    extends StObject
       with ManifestPermissions
  inline def platformKeys: platformKeys = "platformKeys".asInstanceOf[platformKeys]
  
  @js.native
  sealed trait popup
    extends StObject
       with createTypeEnum
       with windowTypeEnum
  inline def popup: popup = "popup".asInstanceOf[popup]
  
  @js.native
  sealed trait power
    extends StObject
       with ManifestPermissions
  inline def power: power = "power".asInstanceOf[power]
  
  @js.native
  sealed trait printerProvider
    extends StObject
       with ManifestPermissions
  inline def printerProvider: printerProvider = "printerProvider".asInstanceOf[printerProvider]
  
  @js.native
  sealed trait printing
    extends StObject
       with ManifestPermissions
  inline def printing: printing = "printing".asInstanceOf[printing]
  
  @js.native
  sealed trait printingMetrics
    extends StObject
       with ManifestPermissions
  inline def printingMetrics: printingMetrics = "printingMetrics".asInstanceOf[printingMetrics]
  
  @js.native
  sealed trait privacy
    extends StObject
       with ManifestPermissions
  inline def privacy: privacy = "privacy".asInstanceOf[privacy]
  
  @js.native
  sealed trait processes
    extends StObject
       with ManifestPermissions
  inline def processes: processes = "processes".asInstanceOf[processes]
  
  @js.native
  sealed trait progress
    extends StObject
       with TemplateType
  inline def progress: progress = "progress".asInstanceOf[progress]
  
  @js.native
  sealed trait prompt
    extends StObject
       with FilenameConflictAction
  inline def prompt: prompt = "prompt".asInstanceOf[prompt]
  
  @js.native
  sealed trait proxy
    extends StObject
       with ManifestPermissions
  inline def proxy: proxy = "proxy".asInstanceOf[proxy]
  
  @js.native
  sealed trait purple
    extends StObject
       with ColorEnum
  inline def purple: purple = "purple".asInstanceOf[purple]
  
  @js.native
  sealed trait radio
    extends StObject
       with ContextItemType
  inline def radio: radio = "radio".asInstanceOf[radio]
  
  @js.native
  sealed trait red
    extends StObject
       with ColorEnum
  inline def red: red = "red".asInstanceOf[red]
  
  @js.native
  sealed trait regular
    extends StObject
       with ScopeEnum
       with _settingsScope
  inline def regular: regular = "regular".asInstanceOf[regular]
  
  @js.native
  sealed trait regular_only
    extends StObject
       with _settingsScope
  inline def regular_only: regular_only = "regular_only".asInstanceOf[regular_only]
  
  @js.native
  sealed trait resume extends StObject
  inline def resume: resume = "resume".asInstanceOf[resume]
  
  @js.native
  sealed trait right extends StObject
  inline def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait safe
    extends StObject
       with DangerType
  inline def safe: safe = "safe".asInstanceOf[safe]
  
  @js.native
  sealed trait sansserif extends StObject
  inline def sansserif: sansserif = "sansserif".asInstanceOf[sansserif]
  
  @js.native
  sealed trait script
    extends StObject
       with ResourceType
  inline def script: script = "script".asInstanceOf[script]
  
  @js.native
  sealed trait scripting
    extends StObject
       with ManifestPermissions
  inline def scripting: scripting = "scripting".asInstanceOf[scripting]
  
  @js.native
  sealed trait search
    extends StObject
       with ManifestPermissions
  inline def search: search = "search".asInstanceOf[search]
  
  @js.native
  sealed trait selection
    extends StObject
       with ContextType
  inline def selection: selection = "selection".asInstanceOf[selection]
  
  @js.native
  sealed trait sentence extends StObject
  inline def sentence: sentence = "sentence".asInstanceOf[sentence]
  
  @js.native
  sealed trait separator
    extends StObject
       with ContextItemType
  inline def separator: separator = "separator".asInstanceOf[separator]
  
  @js.native
  sealed trait serif extends StObject
  inline def serif: serif = "serif".asInstanceOf[serif]
  
  @js.native
  sealed trait session
    extends StObject
       with AreaName
  inline def session: session = "session".asInstanceOf[session]
  
  @js.native
  sealed trait session_only
    extends StObject
       with DefaultContentSettingDetails
  inline def session_only: session_only = "session_only".asInstanceOf[session_only]
  
  @js.native
  sealed trait sessions
    extends StObject
       with ManifestPermissions
  inline def sessions: sessions = "sessions".asInstanceOf[sessions]
  
  @js.native
  sealed trait seven extends StObject
  inline def seven: seven = "seven".asInstanceOf[seven]
  
  @js.native
  sealed trait signedInDevices
    extends StObject
       with ManifestPermissions
  inline def signedInDevices: signedInDevices = "signedInDevices".asInstanceOf[signedInDevices]
  
  @js.native
  sealed trait standard extends StObject
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait start extends StObject
  inline def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait storage
    extends StObject
       with ManifestPermissions
  inline def storage: storage = "storage".asInstanceOf[storage]
  
  @js.native
  sealed trait strict
    extends StObject
       with SameSiteStatus
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait stylesheet
    extends StObject
       with ResourceType
  inline def stylesheet: stylesheet = "stylesheet".asInstanceOf[stylesheet]
  
  @js.native
  sealed trait sub_frame
    extends StObject
       with ResourceType
  inline def sub_frame: sub_frame = "sub_frame".asInstanceOf[sub_frame]
  
  @js.native
  sealed trait sync
    extends StObject
       with AreaName
  inline def sync: sync = "sync".asInstanceOf[sync]
  
  @js.native
  sealed trait systemDotcpu
    extends StObject
       with ManifestPermissions
  inline def systemDotcpu: systemDotcpu = "system.cpu".asInstanceOf[systemDotcpu]
  
  @js.native
  sealed trait systemDotdisplay
    extends StObject
       with ManifestPermissions
  inline def systemDotdisplay: systemDotdisplay = "system.display".asInstanceOf[systemDotdisplay]
  
  @js.native
  sealed trait systemDotmemory
    extends StObject
       with ManifestPermissions
  inline def systemDotmemory: systemDotmemory = "system.memory".asInstanceOf[systemDotmemory]
  
  @js.native
  sealed trait systemDotstorage
    extends StObject
       with ManifestPermissions
  inline def systemDotstorage: systemDotstorage = "system.storage".asInstanceOf[systemDotstorage]
  
  @js.native
  sealed trait system_error extends StObject
  inline def system_error: system_error = "system_error".asInstanceOf[system_error]
  
  @js.native
  sealed trait tabCapture
    extends StObject
       with ManifestPermissions
  inline def tabCapture: tabCapture = "tabCapture".asInstanceOf[tabCapture]
  
  @js.native
  sealed trait tabGroups
    extends StObject
       with ManifestPermissions
  inline def tabGroups: tabGroups = "tabGroups".asInstanceOf[tabGroups]
  
  @js.native
  sealed trait tabs
    extends StObject
       with ManifestPermissions
  inline def tabs: tabs = "tabs".asInstanceOf[tabs]
  
  @js.native
  sealed trait throttled
    extends StObject
       with RequestUpdateCheckStatus
  inline def throttled: throttled = "throttled".asInstanceOf[throttled]
  
  @js.native
  sealed trait timeout extends StObject
  inline def timeout: timeout = "timeout".asInstanceOf[timeout]
  
  @js.native
  sealed trait top extends StObject
  inline def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait topSites
    extends StObject
       with ManifestPermissions
  inline def topSites: topSites = "topSites".asInstanceOf[topSites]
  
  @js.native
  sealed trait tts
    extends StObject
       with ManifestPermissions
  inline def tts: tts = "tts".asInstanceOf[tts]
  
  @js.native
  sealed trait ttsEngine
    extends StObject
       with ManifestPermissions
  inline def ttsEngine: ttsEngine = "ttsEngine".asInstanceOf[ttsEngine]
  
  @js.native
  sealed trait two extends StObject
  inline def two: two = "two".asInstanceOf[two]
  
  @js.native
  sealed trait uncommon
    extends StObject
       with DangerType
  inline def uncommon: uncommon = "uncommon".asInstanceOf[uncommon]
  
  @js.native
  sealed trait undo
    extends StObject
       with AssistiveWindowButton
  inline def undo: undo = "undo".asInstanceOf[undo]
  
  @js.native
  sealed trait uniquify
    extends StObject
       with FilenameConflictAction
  inline def uniquify: uniquify = "uniquify".asInstanceOf[uniquify]
  
  @js.native
  sealed trait unlimitedStorage
    extends StObject
       with ManifestPermissions
  inline def unlimitedStorage: unlimitedStorage = "unlimitedStorage".asInstanceOf[unlimitedStorage]
  
  @js.native
  sealed trait unspecified
    extends StObject
       with SameSiteStatus
  inline def unspecified: unspecified = "unspecified".asInstanceOf[unspecified]
  
  @js.native
  sealed trait unwanted
    extends StObject
       with DangerType
  inline def unwanted: unwanted = "unwanted".asInstanceOf[unwanted]
  
  @js.native
  sealed trait update_available
    extends StObject
       with RequestUpdateCheckStatus
  inline def update_available: update_available = "update_available".asInstanceOf[update_available]
  
  @js.native
  sealed trait url
    extends StObject
       with DangerType
  inline def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait video
    extends StObject
       with ContextType
  inline def video: video = "video".asInstanceOf[video]
  
  @js.native
  sealed trait vpnProvider
    extends StObject
       with ManifestPermissions
  inline def vpnProvider: vpnProvider = "vpnProvider".asInstanceOf[vpnProvider]
  
  @js.native
  sealed trait wallpaper
    extends StObject
       with ManifestPermissions
  inline def wallpaper: wallpaper = "wallpaper".asInstanceOf[wallpaper]
  
  @js.native
  sealed trait webNavigation
    extends StObject
       with ManifestPermissions
  inline def webNavigation: webNavigation = "webNavigation".asInstanceOf[webNavigation]
  
  @js.native
  sealed trait webRequest
    extends StObject
       with ManifestPermissions
  inline def webRequest: webRequest = "webRequest".asInstanceOf[webRequest]
  
  @js.native
  sealed trait webRequestBlocking
    extends StObject
       with ManifestPermissions
  inline def webRequestBlocking: webRequestBlocking = "webRequestBlocking".asInstanceOf[webRequestBlocking]
  
  @js.native
  sealed trait websocket
    extends StObject
       with ResourceType
  inline def websocket: websocket = "websocket".asInstanceOf[websocket]
  
  @js.native
  sealed trait win
    extends StObject
       with PlatformOs
  inline def win: win = "win".asInstanceOf[win]
  
  @js.native
  sealed trait word extends StObject
  inline def word: word = "word".asInstanceOf[word]
  
  @js.native
  sealed trait `x86-32`
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def `x86-32`: `x86-32` = "x86-32".asInstanceOf[`x86-32`]
  
  @js.native
  sealed trait `x86-64`
    extends StObject
       with PlatformArch
       with PlatformNaclArch
  inline def `x86-64`: `x86-64` = "x86-64".asInstanceOf[`x86-64`]
  
  @js.native
  sealed trait xmlhttprequest
    extends StObject
       with ResourceType
  inline def xmlhttprequest: xmlhttprequest = "xmlhttprequest".asInstanceOf[xmlhttprequest]
  
  @js.native
  sealed trait yellow
    extends StObject
       with ColorEnum
  inline def yellow: yellow = "yellow".asInstanceOf[yellow]
}
