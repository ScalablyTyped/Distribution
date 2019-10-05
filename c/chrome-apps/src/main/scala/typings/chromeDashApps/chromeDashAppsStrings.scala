package typings.chromeDashApps

import typings.chromeDashApps.WebView.ContextType
import typings.chromeDashApps.WebView.Events.DialogMessageType
import typings.chromeDashApps.WebView.Events.ExitEventReason
import typings.chromeDashApps.WebView.Events.LoadAbortReason
import typings.chromeDashApps.WebView.Events.RequestedPermission
import typings.chromeDashApps.WebView.Events.WindowOpenDisposition
import typings.chromeDashApps.WebView.ZoomMode
import typings.chromeDashApps.chrome.accessibilityFeatures.LevelOfControl
import typings.chromeDashApps.chrome.accessibilityFeatures.Scope
import typings.chromeDashApps.chrome.audio.DeviceType
import typings.chromeDashApps.chrome.audio.StreamType
import typings.chromeDashApps.chrome.bluetooth.DeviceFilterType
import typings.chromeDashApps.chrome.bluetooth.DeviceVendorIdSource
import typings.chromeDashApps.chrome.bluetoothLowEnergy.AdvertisementType
import typings.chromeDashApps.chrome.bluetoothLowEnergy.CharacteristicProperties
import typings.chromeDashApps.chrome.bluetoothLowEnergy.DescriptorPermissions
import typings.chromeDashApps.chrome.bluetoothSocket.OnAcceptErrorCode
import typings.chromeDashApps.chrome.bluetoothSocket.OnReceiveErrorCode
import typings.chromeDashApps.chrome.certificateProvider.Hash
import typings.chromeDashApps.chrome.clipboard.ImageType
import typings.chromeDashApps.chrome.contextMenus.MediaType
import typings.chromeDashApps.chrome.extensionTypes.CSSOrigin
import typings.chromeDashApps.chrome.extensionTypes.RunAt
import typings.chromeDashApps.chrome.fileBrowserHandler.FileBrowserHandleExecuteId
import typings.chromeDashApps.chrome.gcm.DisallowedKeys
import typings.chromeDashApps.chrome.i18n.LanguageCode
import typings.chromeDashApps.chrome.i18n.kLanguageInfoTable
import typings.chromeDashApps.chrome.idle.IdleState
import typings.chromeDashApps.chrome.mediaGalleries.GalleryChangedType
import typings.chromeDashApps.chrome.mediaGalleries.Interactive
import typings.chromeDashApps.chrome.mediaGalleries.MetadataOptionsType
import typings.chromeDashApps.chrome.mediaGalleries.ScanProgressType
import typings.chromeDashApps.chrome.networking.onc.ActivationStateType
import typings.chromeDashApps.chrome.networking.onc.CaptivePortalStatus
import typings.chromeDashApps.chrome.networking.onc.ClientCertType
import typings.chromeDashApps.chrome.networking.onc.ConnectionStateType
import typings.chromeDashApps.chrome.networking.onc.DeviceState
import typings.chromeDashApps.chrome.networking.onc.EthernetAuthenticationType
import typings.chromeDashApps.chrome.networking.onc.IPConfigType
import typings.chromeDashApps.chrome.networking.onc.IPConfigurationType
import typings.chromeDashApps.chrome.networking.onc.InterfaceType
import typings.chromeDashApps.chrome.networking.onc.ManagedObject
import typings.chromeDashApps.chrome.networking.onc.NetworkType
import typings.chromeDashApps.chrome.networking.onc.ProxySettingsType
import typings.chromeDashApps.chrome.networking.onc._internal_.ObjectFunction
import typings.chromeDashApps.chrome.runtime.ChromeOSOnlyPermissions
import typings.chromeDashApps.chrome.runtime.DevOnly
import typings.chromeDashApps.chrome.runtime.JSONBasicTypes
import typings.chromeDashApps.chrome.runtime.KioskOnlyPermissions
import typings.chromeDashApps.chrome.runtime.NotAllowedAsOptionalPermissions
import typings.chromeDashApps.chrome.runtime.Permission
import typings.chromeDashApps.chrome.runtime.UndocumentedPermissions
import typings.chromeDashApps.chrome.runtime.UrlMatches
import typings.chromeDashApps.chrome.signedInDevices.OS
import typings.chromeDashApps.chrome.storage.StorageAreas
import typings.chromeDashApps.chrome.types.ChromeSettingScope
import typings.chromeDashApps.chrome.wallpaper.WallpaperLayoutType
import typings.chromeDashApps.chrome.webRequest.ResourceType
import typings.chromeDashApps.chrome.webViewRequest.DeclarativeWebRequestActionsList
import typings.chromeDashApps.chrome.webViewRequest.DeclarativeWebRequestEventList
import typings.chromeDashApps.chrome.webViewRequest.Stage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object chromeDashAppsStrings {
  @js.native
  sealed trait `*` extends js.Object
  
  @js.native
  sealed trait `8021X` extends EthernetAuthenticationType
  
  @js.native
  sealed trait `<all_urls>` extends UrlMatches
  
  @js.native
  sealed trait ABORT extends js.Object
  
  @js.native
  sealed trait ACCESS_DENIED extends js.Object
  
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
  sealed trait All extends NetworkType
  
  @js.native
  sealed trait BLUETOOTH extends DeviceType
  
  @js.native
  sealed trait CDMA extends js.Object
  
  @js.native
  sealed trait CENTER extends WallpaperLayoutType
  
  @js.native
  sealed trait CENTER_CROPPED extends WallpaperLayoutType
  
  @js.native
  sealed trait CHANGED extends js.Object
  
  @js.native
  sealed trait CancelRequest extends js.Object
  
  @js.native
  sealed trait Cellular extends NetworkType
  
  @js.native
  sealed trait Connected extends ConnectionStateType
  
  @js.native
  sealed trait Connecting extends ConnectionStateType
  
  @js.native
  sealed trait DELETED extends js.Object
  
  @js.native
  sealed trait DHCP extends IPConfigType
  
  @js.native
  sealed trait Device extends js.Object
  
  @js.native
  sealed trait DevicePolicy extends js.Object
  
  @js.native
  sealed trait Direct extends ProxySettingsType
  
  @js.native
  sealed trait Disabled extends DeviceState
  
  @js.native
  sealed trait Disconnected extends js.Object
  
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
  sealed trait EditRequestCookie extends js.Object
  
  @js.native
  sealed trait EditResponseCookie extends js.Object
  
  @js.native
  sealed trait Empty extends js.Object
  
  @js.native
  sealed trait Enabled extends DeviceState
  
  @js.native
  sealed trait Enabling extends DeviceState
  
  @js.native
  sealed trait Ethernet extends NetworkType
  
  @js.native
  sealed trait FAILED extends js.Object
  
  @js.native
  sealed trait FRONT_MIC extends DeviceType
  
  @js.native
  sealed trait GOOG extends DisallowedKeys
  
  @js.native
  sealed trait GOOGDOT extends DisallowedKeys
  
  @js.native
  sealed trait GOOGLE extends DisallowedKeys
  
  @js.native
  sealed trait GSM extends js.Object
  
  @js.native
  sealed trait HDMI extends DeviceType
  
  @js.native
  sealed trait HEADPHONE extends DeviceType
  
  @js.native
  sealed trait HOTWORD extends DeviceType
  
  @js.native
  sealed trait INPUT extends StreamType
  
  @js.native
  sealed trait INTERNAL_MIC extends DeviceType
  
  @js.native
  sealed trait INTERNAL_SPEAKER extends DeviceType
  
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
  sealed trait IgnoreRules extends js.Object
  
  @js.native
  sealed trait KEYBOARD_MIC extends DeviceType
  
  @js.native
  sealed trait LINEOUT extends DeviceType
  
  @js.native
  sealed trait MAX_ATTEMPTS_EXCEEDED extends js.Object
  
  @js.native
  sealed trait MD5_SHA1 extends Hash
  
  @js.native
  sealed trait MIC extends DeviceType
  
  @js.native
  sealed trait Manual extends ProxySettingsType
  
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
  sealed trait OPEN_AS_PINNED_TAB extends js.Object
  
  @js.native
  sealed trait OPEN_AS_REGULAR_TAB extends js.Object
  
  @js.native
  sealed trait OPEN_AS_WINDOW extends js.Object
  
  @js.native
  sealed trait OPEN_FULL_SCREEN extends js.Object
  
  @js.native
  sealed trait OTHER extends DeviceType
  
  @js.native
  sealed trait OUTPUT extends StreamType
  
  @js.native
  sealed trait Offline extends CaptivePortalStatus
  
  @js.native
  sealed trait Online extends CaptivePortalStatus
  
  @js.native
  sealed trait PAC extends ProxySettingsType
  
  @js.native
  sealed trait PBC extends js.Object
  
  @js.native
  sealed trait PIN extends js.Object
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait POST_DSP_LOOPBACK extends DeviceType
  
  @js.native
  sealed trait POST_MIX_LOOPBACK extends DeviceType
  
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
  sealed trait READ extends js.Object
  
  @js.native
  sealed trait REAR_MIC extends DeviceType
  
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
  sealed trait SECURITY extends js.Object
  
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
  sealed trait STRETCH extends WallpaperLayoutType
  
  @js.native
  sealed trait SendMessageToExtension extends js.Object
  
  @js.native
  sealed trait SetRequestHeader extends js.Object
  
  @js.native
  sealed trait Static extends IPConfigType
  
  @js.native
  sealed trait TOO_MANY_OPENED extends js.Object
  
  @js.native
  sealed trait UNKNOWN_ERROR extends js.Object
  
  @js.native
  sealed trait USB extends DeviceType
  
  @js.native
  sealed trait Uninitialized extends DeviceState
  
  @js.native
  sealed trait Unknown extends CaptivePortalStatus
  
  @js.native
  sealed trait User extends js.Object
  
  @js.native
  sealed trait UserPolicy extends js.Object
  
  @js.native
  sealed trait VPN extends NetworkType
  
  @js.native
  sealed trait `WEP-PSK` extends js.Object
  
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
  sealed trait abnormal extends ExitEventReason
  
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait about_page extends js.Object
  
  @js.native
  sealed trait activate extends js.Object
  
  @js.native
  sealed trait active extends IdleState
  
  @js.native
  sealed trait adaptive extends js.Object
  
  @js.native
  sealed trait added extends js.Object
  
  @js.native
  sealed trait admin extends js.Object
  
  @js.native
  sealed trait af extends kLanguageInfoTable
  
  @js.native
  sealed trait alarms extends Permission
  
  @js.native
  sealed trait alert extends DialogMessageType
  
  @js.native
  sealed trait all
    extends ContextType
       with DeviceFilterType
       with MetadataOptionsType
  
  @js.native
  sealed trait allAutoDetected extends js.Object
  
  @js.native
  sealed trait alwaysOnTopWindows extends Permission
  
  @js.native
  sealed trait am extends kLanguageInfoTable
  
  @js.native
  sealed trait an extends kLanguageInfoTable
  
  @js.native
  sealed trait android extends OS
  
  @js.native
  sealed trait animationcancel extends js.Object
  
  @js.native
  sealed trait animationend extends js.Object
  
  @js.native
  sealed trait animationiteration extends js.Object
  
  @js.native
  sealed trait animationstart extends js.Object
  
  @js.native
  sealed trait appDOTwindowDOTalpha extends DevOnly
  
  @js.native
  sealed trait appDOTwindowDOTalwaysOnTop extends Permission
  
  @js.native
  sealed trait appDOTwindowDOTfullscreen extends Permission
  
  @js.native
  sealed trait appDOTwindowDOTfullscreenDOToverrideEsc extends Permission
  
  @js.native
  sealed trait appDOTwindowDOTime extends UndocumentedPermissions
  
  @js.native
  sealed trait appDOTwindowDOTshape extends Permission
  
  @js.native
  sealed trait app_launcher extends js.Object
  
  @js.native
  sealed trait app_update extends js.Object
  
  @js.native
  sealed trait appview extends Permission
  
  @js.native
  sealed trait ar extends kLanguageInfoTable
  
  @js.native
  sealed trait ar_001 extends kLanguageInfoTable
  
  @js.native
  sealed trait arm extends js.Object
  
  @js.native
  sealed trait array extends js.Object
  
  @js.native
  sealed trait ast extends kLanguageInfoTable
  
  @js.native
  sealed trait asynchronous extends js.Object
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.chromeDashApps.chrome.runtime.Permission because Already inherited */ @js.native
  sealed trait audio
    extends KioskOnlyPermissions
       with ContextType
       with typings.chromeDashApps.chrome.bluetooth.DeviceType
       with MediaType
  
  @js.native
  sealed trait audioCapture extends Permission
  
  @js.native
  sealed trait authenticatedSignedWrites extends CharacteristicProperties
  
  @js.native
  sealed trait authentication_required extends js.Object
  
  @js.native
  sealed trait author extends CSSOrigin
  
  @js.native
  sealed trait auxclick extends js.Object
  
  @js.native
  sealed trait available extends js.Object
  
  @js.native
  sealed trait avx extends js.Object
  
  @js.native
  sealed trait az extends kLanguageInfoTable
  
  @js.native
  sealed trait background extends Permission
  
  @js.native
  sealed trait basic extends js.Object
  
  @js.native
  sealed trait be extends kLanguageInfoTable
  
  @js.native
  sealed trait bg extends kLanguageInfoTable
  
  @js.native
  sealed trait bh extends kLanguageInfoTable
  
  @js.native
  sealed trait bluetooth extends DeviceVendorIdSource
  
  @js.native
  sealed trait blur extends js.Object
  
  @js.native
  sealed trait bn extends kLanguageInfoTable
  
  @js.native
  sealed trait bottom extends js.Object
  
  @js.native
  sealed trait br extends kLanguageInfoTable
  
  @js.native
  sealed trait broadcast
    extends AdvertisementType
       with CharacteristicProperties
  
  @js.native
  sealed trait browser extends Permission
  
  @js.native
  sealed trait browser_action extends js.Object
  
  @js.native
  sealed trait bs extends kLanguageInfoTable
  
  @js.native
  sealed trait bulk extends js.Object
  
  @js.native
  sealed trait ca extends kLanguageInfoTable
  
  @js.native
  sealed trait cancel extends ScanProgressType
  
  @js.native
  sealed trait canplay extends js.Object
  
  @js.native
  sealed trait canplaythrough extends js.Object
  
  @js.native
  sealed trait capabilities_negotiation_error extends js.Object
  
  @js.native
  sealed trait carAudio
    extends typings.chromeDashApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait ceb extends kLanguageInfoTable
  
  @js.native
  sealed trait certificateProvider extends ChromeOSOnlyPermissions
  
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait changed extends js.Object
  
  @js.native
  sealed trait checkbox extends js.Object
  
  @js.native
  sealed trait chrome extends js.Object
  
  @js.native
  sealed trait `chrome://favicon/` extends UrlMatches
  
  @js.native
  sealed trait chrome_internal extends js.Object
  
  @js.native
  sealed trait chrome_os extends OS
  
  @js.native
  sealed trait chrome_update extends js.Object
  
  @js.native
  sealed trait ckb extends kLanguageInfoTable
  
  @js.native
  sealed trait `class` extends js.Object
  
  @js.native
  sealed trait clear extends js.Object
  
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait clipboard extends ChromeOSOnlyPermissions
  
  @js.native
  sealed trait clipboardRead extends Permission
  
  @js.native
  sealed trait clipboardWrite extends Permission
  
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait co extends kLanguageInfoTable
  
  @js.native
  sealed trait collapse_key extends DisallowedKeys
  
  @js.native
  sealed trait command_line extends js.Object
  
  @js.native
  sealed trait computer
    extends typings.chromeDashApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait confirm extends DialogMessageType
  
  @js.native
  sealed trait conflicting extends js.Object
  
  @js.native
  sealed trait connected extends js.Object
  
  @js.native
  sealed trait connection_error extends js.Object
  
  @js.native
  sealed trait consolemessage extends js.Object
  
  @js.native
  sealed trait contentload extends js.Object
  
  @js.native
  sealed trait contents_changed extends GalleryChangedType
  
  @js.native
  sealed trait contextMenus extends Permission
  
  @js.native
  sealed trait context_menu extends js.Object
  
  @js.native
  sealed trait contextmenu extends js.Object
  
  @js.native
  sealed trait control extends js.Object
  
  @js.native
  sealed trait controllable_by_this_extension
    extends LevelOfControl
       with typings.chromeDashApps.chrome.types.LevelOfControl
  
  @js.native
  sealed trait controlled_by_other_extensions
    extends LevelOfControl
       with typings.chromeDashApps.chrome.types.LevelOfControl
  
  @js.native
  sealed trait controlled_by_this_extension
    extends LevelOfControl
       with typings.chromeDashApps.chrome.types.LevelOfControl
  
  @js.native
  sealed trait copy extends js.Object
  
  @js.native
  sealed trait crash extends ExitEventReason
  
  @js.native
  sealed trait created extends js.Object
  
  @js.native
  sealed trait cros extends js.Object
  
  @js.native
  sealed trait cs extends kLanguageInfoTable
  
  @js.native
  sealed trait csp_report extends ResourceType
  
  @js.native
  sealed trait cuechange extends js.Object
  
  @js.native
  sealed trait current_tab extends WindowOpenDisposition
  
  @js.native
  sealed trait cut extends js.Object
  
  @js.native
  sealed trait cy extends kLanguageInfoTable
  
  @js.native
  sealed trait da extends kLanguageInfoTable
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait dblclick extends js.Object
  
  @js.native
  sealed trait de extends kLanguageInfoTable
  
  @js.native
  sealed trait `de-AT` extends kLanguageInfoTable
  
  @js.native
  sealed trait `de-CH` extends kLanguageInfoTable
  
  @js.native
  sealed trait `de-DE` extends kLanguageInfoTable
  
  @js.native
  sealed trait `de-LI` extends kLanguageInfoTable
  
  @js.native
  sealed trait debugger extends NotAllowedAsOptionalPermissions
  
  @js.native
  sealed trait declarativeContentDOTPageStateMatcher extends js.Object
  
  @js.native
  sealed trait declarativeContentDOTonAuthRequired extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDOTonBeforeRedirect extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDOTonBeforeRequest extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDOTonBeforeSendHeaders extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDOTonCompleted extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDOTonErrorOccured extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDOTonHeadersReceived extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDOTonMessage extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDOTonRequest extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDOTonResponseStarted extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeContentDOTonSendHeaders extends DeclarativeWebRequestEventList
  
  @js.native
  sealed trait declarativeWebRequestDOTAddRequestCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTAddResponseCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTAddResponseHeader extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTCancelRequest extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTEditRequestCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTEditResponseCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTIgnoreRules extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTRedirectByRegEx extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTRedirectRequest extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTRedirectToEmptyDocument extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTRedirectToTransparentImage extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTRemoveRequestCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTRemoveRequestHeader extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTRemoveResponseCookie extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTRemoveResponseHeader extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTSendMessageToExtension extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait declarativeWebRequestDOTSetRequestHeader extends DeclarativeWebRequestActionsList
  
  @js.native
  sealed trait deleted extends js.Object
  
  @js.native
  sealed trait denied extends js.Object
  
  @js.native
  sealed trait desktopCapture extends Permission
  
  @js.native
  sealed trait desktop_or_laptop
    extends typings.chromeDashApps.chrome.signedInDevices.DeviceType
  
  @js.native
  sealed trait development extends js.Object
  
  @js.native
  sealed trait device extends js.Object
  
  @js.native
  sealed trait diagnostics extends DevOnly
  
  @js.native
  sealed trait dialog extends js.Object
  
  @js.native
  sealed trait directory extends js.Object
  
  @js.native
  sealed trait disabled extends ZoomMode
  
  @js.native
  sealed trait disconnected extends OnReceiveErrorCode
  
  @js.native
  sealed trait display extends js.Object
  
  @js.native
  sealed trait displaySource extends DevOnly
  
  @js.native
  sealed trait dns extends ChromeOSOnlyPermissions
  
  @js.native
  sealed trait documentScan extends ChromeOSOnlyPermissions
  
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
  sealed trait editable extends ContextType
  
  @js.native
  sealed trait el extends kLanguageInfoTable
  
  @js.native
  sealed trait emptied extends js.Object
  
  @js.native
  sealed trait en extends kLanguageInfoTable
  
  @js.native
  sealed trait `en-AU` extends kLanguageInfoTable
  
  @js.native
  sealed trait `en-CA` extends kLanguageInfoTable
  
  @js.native
  sealed trait `en-GB` extends kLanguageInfoTable
  
  @js.native
  sealed trait `en-IN` extends kLanguageInfoTable
  
  @js.native
  sealed trait `en-NZ` extends kLanguageInfoTable
  
  @js.native
  sealed trait `en-US` extends kLanguageInfoTable
  
  @js.native
  sealed trait `en-ZA` extends kLanguageInfoTable
  
  @js.native
  sealed trait en_001 extends kLanguageInfoTable
  
  @js.native
  sealed trait en_150 extends kLanguageInfoTable
  
  @js.native
  sealed trait enabled extends js.Object
  
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
  sealed trait endpoint extends js.Object
  
  @js.native
  sealed trait enterpriseDOTdeviceAttributes extends ChromeOSOnlyPermissions
  
  @js.native
  sealed trait enterpriseDOTplatformKeys extends ChromeOSOnlyPermissions
  
  @js.native
  sealed trait eo extends kLanguageInfoTable
  
  @js.native
  sealed trait ephemeral_app extends js.Object
  
  @js.native
  sealed trait error extends ScanProgressType
  
  @js.native
  sealed trait es extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-419` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-AR` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-CL` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-CO` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-CR` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-ES` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-HN` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-MX` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-PE` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-US` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-UY` extends kLanguageInfoTable
  
  @js.native
  sealed trait `es-VE` extends kLanguageInfoTable
  
  @js.native
  sealed trait et extends kLanguageInfoTable
  
  @js.native
  sealed trait eu extends kLanguageInfoTable
  
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
  sealed trait extensions_page extends js.Object
  
  @js.native
  sealed trait fa extends kLanguageInfoTable
  
  @js.native
  sealed trait failed extends js.Object
  
  @js.native
  sealed trait failure extends js.Object
  
  @js.native
  sealed trait feedback extends js.Object
  
  @js.native
  sealed trait female extends js.Object
  
  @js.native
  sealed trait fi extends kLanguageInfoTable
  
  @js.native
  sealed trait fil extends kLanguageInfoTable
  
  @js.native
  sealed trait `file:///*/*` extends UrlMatches
  
  @js.native
  sealed trait fileBrowserHandler extends ChromeOSOnlyPermissions
  
  @js.native
  sealed trait fileSystem extends Permission
  
  @js.native
  sealed trait fileSystemProvider extends ChromeOSOnlyPermissions
  
  @js.native
  sealed trait file_handler extends js.Object
  
  @js.native
  sealed trait filesystem extends RequestedPermission
  
  @js.native
  sealed trait findupdate extends js.Object
  
  @js.native
  sealed trait finish extends ScanProgressType
  
  @js.native
  sealed trait fixed extends js.Object
  
  @js.native
  sealed trait fo extends kLanguageInfoTable
  
  @js.native
  sealed trait focus extends js.Object
  
  @js.native
  sealed trait focusin extends js.Object
  
  @js.native
  sealed trait focusout extends js.Object
  
  @js.native
  sealed trait font extends ResourceType
  
  @js.native
  sealed trait fr extends kLanguageInfoTable
  
  @js.native
  sealed trait `fr-CA` extends kLanguageInfoTable
  
  @js.native
  sealed trait `fr-CH` extends kLanguageInfoTable
  
  @js.native
  sealed trait `fr-FR` extends kLanguageInfoTable
  
  @js.native
  sealed trait frame extends ContextType
  
  @js.native
  sealed trait full extends InterfaceType
  
  @js.native
  sealed trait fullscreen
    extends RequestedPermission
       with UndocumentedPermissions
  
  @js.native
  sealed trait fullscreenchange extends js.Object
  
  @js.native
  sealed trait fullscreenerror extends js.Object
  
  @js.native
  sealed trait fy extends kLanguageInfoTable
  
  @js.native
  sealed trait ga extends kLanguageInfoTable
  
  @js.native
  sealed trait gamepad
    extends typings.chromeDashApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait gcm extends Permission
  
  @js.native
  sealed trait gd extends kLanguageInfoTable
  
  @js.native
  sealed trait geolocation
    extends NotAllowedAsOptionalPermissions
       with Permission
       with RequestedPermission
  
  @js.native
  sealed trait getter extends ObjectFunction
  
  @js.native
  sealed trait gl extends kLanguageInfoTable
  
  @js.native
  sealed trait gn extends kLanguageInfoTable
  
  @js.native
  sealed trait goog extends DisallowedKeys
  
  @js.native
  sealed trait googDOT extends DisallowedKeys
  
  @js.native
  sealed trait google extends DisallowedKeys
  
  @js.native
  sealed trait gotpointercapture extends js.Object
  
  @js.native
  sealed trait granted extends js.Object
  
  @js.native
  sealed trait gu extends kLanguageInfoTable
  
  @js.native
  sealed trait ha extends kLanguageInfoTable
  
  @js.native
  sealed trait haw extends kLanguageInfoTable
  
  @js.native
  sealed trait he extends kLanguageInfoTable
  
  @js.native
  sealed trait hi extends kLanguageInfoTable
  
  @js.native
  sealed trait hid extends Permission
  
  @js.native
  sealed trait hmn extends kLanguageInfoTable
  
  @js.native
  sealed trait hosted_app extends js.Object
  
  @js.native
  sealed trait hr extends kLanguageInfoTable
  
  @js.native
  sealed trait ht extends kLanguageInfoTable
  
  @js.native
  sealed trait `http://*/*` extends UrlMatches
  
  @js.native
  sealed trait `https://*/*` extends UrlMatches
  
  @js.native
  sealed trait `https://wwwDOTgoogle-analyticsDOTcom/*` extends UrlMatches
  
  @js.native
  sealed trait `https://wwwDOTgoogleapisDOTcom/*` extends UrlMatches
  
  @js.native
  sealed trait hu extends kLanguageInfoTable
  
  @js.native
  sealed trait hy extends kLanguageInfoTable
  
  @js.native
  sealed trait ia extends kLanguageInfoTable
  
  @js.native
  sealed trait id extends kLanguageInfoTable
  
  @js.native
  sealed trait identity extends Permission
  
  @js.native
  sealed trait idle
    extends IdleState
       with Permission
  
  @js.native
  sealed trait if_needed extends Interactive
  
  @js.native
  sealed trait ig extends kLanguageInfoTable
  
  @js.native
  sealed trait ignore extends WindowOpenDisposition
  
  @js.native
  sealed trait image
    extends ContextType
       with MediaType
       with ResourceType
  
  @js.native
  sealed trait in extends js.Object
  
  @js.native
  sealed trait in_use extends js.Object
  
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
  sealed trait initializing extends js.Object
  
  @js.native
  sealed trait input extends js.Object
  
  @js.native
  sealed trait install extends js.Object
  
  @js.native
  sealed trait installed_notification extends js.Object
  
  @js.native
  sealed trait integer extends JSONBasicTypes
  
  @js.native
  sealed trait interface extends js.Object
  
  @js.native
  sealed trait interrupt extends js.Object
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait ios extends OS
  
  @js.native
  sealed trait is extends kLanguageInfoTable
  
  @js.native
  sealed trait isochronous extends js.Object
  
  @js.native
  sealed trait it extends kLanguageInfoTable
  
  @js.native
  sealed trait `it-CH` extends kLanguageInfoTable
  
  @js.native
  sealed trait `it-IT` extends kLanguageInfoTable
  
  @js.native
  sealed trait ja extends kLanguageInfoTable
  
  @js.native
  sealed trait joystick
    extends typings.chromeDashApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait jpeg extends ImageType
  
  @js.native
  sealed trait jv extends kLanguageInfoTable
  
  @js.native
  sealed trait ka extends kLanguageInfoTable
  
  @js.native
  sealed trait keep extends js.Object
  
  @js.native
  sealed trait keyboard
    extends typings.chromeDashApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait keyboardMouseCombo
    extends typings.chromeDashApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait keydown extends js.Object
  
  @js.native
  sealed trait keypress extends js.Object
  
  @js.native
  sealed trait keyup extends js.Object
  
  @js.native
  sealed trait kill extends ExitEventReason
  
  @js.native
  sealed trait kiosk extends js.Object
  
  @js.native
  sealed trait kk extends kLanguageInfoTable
  
  @js.native
  sealed trait km extends kLanguageInfoTable
  
  @js.native
  sealed trait kn extends kLanguageInfoTable
  
  @js.native
  sealed trait known extends DeviceFilterType
  
  @js.native
  sealed trait ko extends kLanguageInfoTable
  
  @js.native
  sealed trait ku extends kLanguageInfoTable
  
  @js.native
  sealed trait ky extends kLanguageInfoTable
  
  @js.native
  sealed trait la extends kLanguageInfoTable
  
  @js.native
  sealed trait last_write_win extends js.Object
  
  @js.native
  sealed trait launcher extends js.Object
  
  @js.native
  sealed trait lb extends kLanguageInfoTable
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait legacy_packaged_app extends js.Object
  
  @js.native
  sealed trait link extends ContextType
  
  @js.native
  sealed trait linkChanged extends js.Object
  
  @js.native
  sealed trait linkDown extends js.Object
  
  @js.native
  sealed trait linkUp extends js.Object
  
  @js.native
  sealed trait linux extends OS
  
  @js.native
  sealed trait list extends js.Object
  
  @js.native
  sealed trait ln extends kLanguageInfoTable
  
  @js.native
  sealed trait lo extends kLanguageInfoTable
  
  @js.native
  sealed trait load extends js.Object
  
  @js.native
  sealed trait load_and_launch extends js.Object
  
  @js.native
  sealed trait loadabort extends js.Object
  
  @js.native
  sealed trait loadcommit extends js.Object
  
  @js.native
  sealed trait loadeddata extends js.Object
  
  @js.native
  sealed trait loadedmetadata extends js.Object
  
  @js.native
  sealed trait loadend extends js.Object
  
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
  sealed trait local_to_remote extends js.Object
  
  @js.native
  sealed trait locked extends IdleState
  
  @js.native
  sealed trait lostpointercapture extends js.Object
  
  @js.native
  sealed trait lt extends kLanguageInfoTable
  
  @js.native
  sealed trait lv extends kLanguageInfoTable
  
  @js.native
  sealed trait mac extends OS
  
  @js.native
  sealed trait main_frame extends ResourceType
  
  @js.native
  sealed trait male extends js.Object
  
  @js.native
  sealed trait managed
    extends ManagedObject
       with StorageAreas
  
  @js.native
  sealed trait management_api extends js.Object
  
  @js.native
  sealed trait manual extends js.Object
  
  @js.native
  sealed trait maximized extends js.Object
  
  @js.native
  sealed trait mdns
    extends NotAllowedAsOptionalPermissions
       with Permission
  
  @js.native
  sealed trait media
    extends RequestedPermission
       with ResourceType
  
  @js.native
  sealed trait mediaGalleries extends Permission
  
  @js.native
  sealed trait media_pipeline_error extends js.Object
  
  @js.native
  sealed trait mg extends kLanguageInfoTable
  
  @js.native
  sealed trait mi extends kLanguageInfoTable
  
  @js.native
  sealed trait mimeTypeAndTags extends MetadataOptionsType
  
  @js.native
  sealed trait mimeTypeOnly extends MetadataOptionsType
  
  @js.native
  sealed trait minimized extends js.Object
  
  @js.native
  sealed trait mips extends js.Object
  
  @js.native
  sealed trait mips64 extends js.Object
  
  @js.native
  sealed trait mixed extends js.Object
  
  @js.native
  sealed trait mk extends kLanguageInfoTable
  
  @js.native
  sealed trait ml extends kLanguageInfoTable
  
  @js.native
  sealed trait mmx extends js.Object
  
  @js.native
  sealed trait mn extends kLanguageInfoTable
  
  @js.native
  sealed trait mo extends kLanguageInfoTable
  
  @js.native
  sealed trait modem
    extends typings.chromeDashApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait mouse
    extends typings.chromeDashApps.chrome.bluetooth.DeviceType
  
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
  sealed trait mr extends kLanguageInfoTable
  
  @js.native
  sealed trait ms extends kLanguageInfoTable
  
  @js.native
  sealed trait mt extends kLanguageInfoTable
  
  @js.native
  sealed trait my extends kLanguageInfoTable
  
  @js.native
  sealed trait nativeMessaging extends Permission
  
  @js.native
  sealed trait nb extends kLanguageInfoTable
  
  @js.native
  sealed trait ne extends kLanguageInfoTable
  
  @js.native
  sealed trait network extends js.Object
  
  @js.native
  sealed trait networkingDOTconfig extends ChromeOSOnlyPermissions
  
  @js.native
  sealed trait networkingDOTonc extends KioskOnlyPermissions
  
  @js.native
  sealed trait new_background_tab extends WindowOpenDisposition
  
  @js.native
  sealed trait new_foreground_tab extends WindowOpenDisposition
  
  @js.native
  sealed trait new_note extends js.Object
  
  @js.native
  sealed trait new_popup extends WindowOpenDisposition
  
  @js.native
  sealed trait new_tab_page extends js.Object
  
  @js.native
  sealed trait new_window extends WindowOpenDisposition
  
  @js.native
  sealed trait newwindow extends js.Object
  
  @js.native
  sealed trait nl extends kLanguageInfoTable
  
  @js.native
  sealed trait nn extends kLanguageInfoTable
  
  @js.native
  sealed trait no
    extends kLanguageInfoTable
       with Interactive
  
  @js.native
  sealed trait no_such_device extends js.Object
  
  @js.native
  sealed trait no_update extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait normal extends ExitEventReason
  
  @js.native
  sealed trait not_connected extends OnReceiveErrorCode
  
  @js.native
  sealed trait not_controllable
    extends LevelOfControl
       with typings.chromeDashApps.chrome.types.LevelOfControl
  
  @js.native
  sealed trait not_listening extends OnAcceptErrorCode
  
  @js.native
  sealed trait notification extends js.Object
  
  @js.native
  sealed trait notifications extends Permission
  
  @js.native
  sealed trait notify extends CharacteristicProperties
  
  @js.native
  sealed trait number extends JSONBasicTypes
  
  @js.native
  sealed trait ny extends kLanguageInfoTable
  
  @js.native
  sealed trait `object` extends ResourceType
  
  @js.native
  sealed trait oc extends kLanguageInfoTable
  
  @js.native
  sealed trait off extends js.Object
  
  @js.native
  sealed trait om extends kLanguageInfoTable
  
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
  sealed trait openbsd extends js.Object
  
  @js.native
  sealed trait or extends kLanguageInfoTable
  
  @js.native
  sealed trait os_update extends js.Object
  
  @js.native
  sealed trait other extends ResourceType
  
  @js.native
  sealed trait out extends js.Object
  
  @js.native
  sealed trait overrideEscFullscreen extends UndocumentedPermissions
  
  @js.native
  sealed trait pa extends kLanguageInfoTable
  
  @js.native
  sealed trait packaged_app extends js.Object
  
  @js.native
  sealed trait page extends ContextType
  
  @js.native
  sealed trait page_action extends js.Object
  
  @js.native
  sealed trait panel extends js.Object
  
  @js.native
  sealed trait partial extends InterfaceType
  
  @js.native
  sealed trait paste extends js.Object
  
  @js.native
  sealed trait pause extends js.Object
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait `per-origin` extends ZoomMode
  
  @js.native
  sealed trait `per-view` extends ZoomMode
  
  @js.native
  sealed trait periodic extends js.Object
  
  @js.native
  sealed trait peripheral
    extends AdvertisementType
       with typings.chromeDashApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait permissionrequest extends js.Object
  
  @js.native
  sealed trait permissions_increase extends js.Object
  
  @js.native
  sealed trait phone
    extends typings.chromeDashApps.chrome.signedInDevices.DeviceType
       with typings.chromeDashApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait ping extends ResourceType
  
  @js.native
  sealed trait pl extends kLanguageInfoTable
  
  @js.native
  sealed trait platformKeys extends ChromeOSOnlyPermissions
  
  @js.native
  sealed trait play extends js.Object
  
  @js.native
  sealed trait playing extends js.Object
  
  @js.native
  sealed trait png extends ImageType
  
  @js.native
  sealed trait pointerLock
    extends Permission
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
  sealed trait power extends Permission
  
  @js.native
  sealed trait printerProvider extends Permission
  
  @js.native
  sealed trait progress extends js.Object
  
  @js.native
  sealed trait prompt extends DialogMessageType
  
  @js.native
  sealed trait proxy extends NotAllowedAsOptionalPermissions
  
  @js.native
  sealed trait ps extends kLanguageInfoTable
  
  @js.native
  sealed trait pt extends kLanguageInfoTable
  
  @js.native
  sealed trait `pt-BR` extends kLanguageInfoTable
  
  @js.native
  sealed trait `pt-PT` extends kLanguageInfoTable
  
  @js.native
  sealed trait qu extends kLanguageInfoTable
  
  @js.native
  sealed trait radio extends js.Object
  
  @js.native
  sealed trait ratechange extends js.Object
  
  @js.native
  sealed trait read
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
  sealed trait rejected extends js.Object
  
  @js.native
  sealed trait reliableWrite extends CharacteristicProperties
  
  @js.native
  sealed trait reload extends js.Object
  
  @js.native
  sealed trait remote_to_local extends js.Object
  
  @js.native
  sealed trait removable extends js.Object
  
  @js.native
  sealed trait removed extends js.Object
  
  @js.native
  sealed trait requestFileSystem extends js.Object
  
  @js.native
  sealed trait reserved extends js.Object
  
  @js.native
  sealed trait reset extends js.Object
  
  @js.native
  sealed trait resize extends js.Object
  
  @js.native
  sealed trait responsive extends js.Object
  
  @js.native
  sealed trait restart extends js.Object
  
  @js.native
  sealed trait resume extends js.Object
  
  @js.native
  sealed trait retainEntries extends js.Object
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait rm extends kLanguageInfoTable
  
  @js.native
  sealed trait ro extends kLanguageInfoTable
  
  @js.native
  sealed trait rsaSign extends js.Object
  
  @js.native
  sealed trait ru extends kLanguageInfoTable
  
  @js.native
  sealed trait running extends js.Object
  
  @js.native
  sealed trait runtime extends Permission
  
  @js.native
  sealed trait saveFile extends js.Object
  
  @js.native
  sealed trait save_to_disk extends WindowOpenDisposition
  
  @js.native
  sealed trait screen extends js.Object
  
  @js.native
  sealed trait script extends ResourceType
  
  @js.native
  sealed trait scroll extends js.Object
  
  @js.native
  sealed trait sd extends kLanguageInfoTable
  
  @js.native
  sealed trait securitypolicyviolation extends js.Object
  
  @js.native
  sealed trait seeked extends js.Object
  
  @js.native
  sealed trait seeking extends js.Object
  
  @js.native
  sealed trait select extends js.Object
  
  @js.native
  sealed trait selection extends ContextType
  
  @js.native
  sealed trait selectionchange extends js.Object
  
  @js.native
  sealed trait selectstart extends js.Object
  
  @js.native
  sealed trait separator extends js.Object
  
  @js.native
  sealed trait serial extends Permission
  
  @js.native
  sealed trait serviceType extends js.Object
  
  @js.native
  sealed trait setter extends ObjectFunction
  
  @js.native
  sealed trait sh extends kLanguageInfoTable
  
  @js.native
  sealed trait shared_module_update extends js.Object
  
  @js.native
  sealed trait shell extends js.Object
  
  @js.native
  sealed trait showAddDialog extends js.Object
  
  @js.native
  sealed trait showConfigureDialog extends js.Object
  
  @js.native
  sealed trait si extends kLanguageInfoTable
  
  @js.native
  sealed trait sideload extends js.Object
  
  @js.native
  sealed trait signedInDevices extends DevOnly
  
  @js.native
  sealed trait `sim-pin` extends js.Object
  
  @js.native
  sealed trait `sim-puk` extends js.Object
  
  @js.native
  sealed trait sizechanged extends js.Object
  
  @js.native
  sealed trait sk extends kLanguageInfoTable
  
  @js.native
  sealed trait sl extends kLanguageInfoTable
  
  @js.native
  sealed trait sm extends kLanguageInfoTable
  
  @js.native
  sealed trait sn extends kLanguageInfoTable
  
  @js.native
  sealed trait so extends kLanguageInfoTable
  
  @js.native
  sealed trait sq extends kLanguageInfoTable
  
  @js.native
  sealed trait sr extends kLanguageInfoTable
  
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
  sealed trait st extends kLanguageInfoTable
  
  @js.native
  sealed trait stalled extends js.Object
  
  @js.native
  sealed trait standard extends js.Object
  
  @js.native
  sealed trait start extends ScanProgressType
  
  @js.native
  sealed trait storage extends Permission
  
  @js.native
  sealed trait string extends JSONBasicTypes
  
  @js.native
  sealed trait stylesheet extends ResourceType
  
  @js.native
  sealed trait su extends kLanguageInfoTable
  
  @js.native
  sealed trait sub_frame extends ResourceType
  
  @js.native
  sealed trait submit extends js.Object
  
  @js.native
  sealed trait succeeded extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @js.native
  sealed trait suspend extends js.Object
  
  @js.native
  sealed trait sv extends kLanguageInfoTable
  
  @js.native
  sealed trait sw extends kLanguageInfoTable
  
  @js.native
  sealed trait sync extends StorageAreas
  
  @js.native
  sealed trait syncFileSystem extends Permission
  
  @js.native
  sealed trait synced extends js.Object
  
  @js.native
  sealed trait synchronous extends js.Object
  
  @js.native
  sealed trait system extends js.Object
  
  @js.native
  sealed trait systemDOTcpu extends Permission
  
  @js.native
  sealed trait systemDOTdisplay extends Permission
  
  @js.native
  sealed trait systemDOTmemory extends Permission
  
  @js.native
  sealed trait systemDOTnetwork extends Permission
  
  @js.native
  sealed trait systemDOTpowerSource extends KioskOnlyPermissions
  
  @js.native
  sealed trait systemDOTstorage extends Permission
  
  @js.native
  sealed trait system_error
    extends OnAcceptErrorCode
       with OnReceiveErrorCode
  
  @js.native
  sealed trait system_tray extends js.Object
  
  @js.native
  sealed trait ta extends kLanguageInfoTable
  
  @js.native
  sealed trait tab extends js.Object
  
  @js.native
  sealed trait tablet
    extends typings.chromeDashApps.chrome.signedInDevices.DeviceType
       with typings.chromeDashApps.chrome.bluetooth.DeviceType
  
  @js.native
  sealed trait te extends kLanguageInfoTable
  
  @js.native
  sealed trait temporary_unavailable extends js.Object
  
  @js.native
  sealed trait test extends js.Object
  
  @js.native
  sealed trait textHtml extends js.Object
  
  @js.native
  sealed trait textPlain extends js.Object
  
  @js.native
  sealed trait tg extends kLanguageInfoTable
  
  @js.native
  sealed trait th extends kLanguageInfoTable
  
  @js.native
  sealed trait theme extends js.Object
  
  @js.native
  sealed trait throttled extends js.Object
  
  @js.native
  sealed trait ti extends kLanguageInfoTable
  
  @js.native
  sealed trait timeout_error extends js.Object
  
  @js.native
  sealed trait timeupdate extends js.Object
  
  @js.native
  sealed trait tk extends kLanguageInfoTable
  
  @js.native
  sealed trait tls1 extends js.Object
  
  @js.native
  sealed trait tls1DOT1 extends js.Object
  
  @js.native
  sealed trait tls1DOT2 extends js.Object
  
  @js.native
  sealed trait tls1DOT3 extends js.Object
  
  @js.native
  sealed trait to extends kLanguageInfoTable
  
  @js.native
  sealed trait toggle extends js.Object
  
  @js.native
  sealed trait top extends js.Object
  
  @js.native
  sealed trait touchcancel extends js.Object
  
  @js.native
  sealed trait touchend extends js.Object
  
  @js.native
  sealed trait touchmove extends js.Object
  
  @js.native
  sealed trait touchstart extends js.Object
  
  @js.native
  sealed trait tr extends kLanguageInfoTable
  
  @js.native
  sealed trait transitioncancel extends js.Object
  
  @js.native
  sealed trait transitionend extends js.Object
  
  @js.native
  sealed trait transitionrun extends js.Object
  
  @js.native
  sealed trait transitionstart extends js.Object
  
  @js.native
  sealed trait tt extends kLanguageInfoTable
  
  @js.native
  sealed trait tts
    extends NotAllowedAsOptionalPermissions
       with Permission
  
  @js.native
  sealed trait tw extends kLanguageInfoTable
  
  @js.native
  sealed trait ug extends kLanguageInfoTable
  
  @js.native
  sealed trait uk extends kLanguageInfoTable
  
  @js.native
  sealed trait und extends LanguageCode
  
  @js.native
  sealed trait unhandled extends js.Object
  
  @js.native
  sealed trait unknown
    extends typings.chromeDashApps.chrome.signedInDevices.DeviceType
       with OS
       with ObjectFunction
  
  @js.native
  sealed trait unknown_error extends js.Object
  
  @js.native
  sealed trait unlimitedStorage extends Permission
  
  @js.native
  sealed trait unmanaged extends ManagedObject
  
  @js.native
  sealed trait unresponsive extends js.Object
  
  @js.native
  sealed trait untracked extends js.Object
  
  @js.native
  sealed trait update extends js.Object
  
  @js.native
  sealed trait update_available extends js.Object
  
  @js.native
  sealed trait updated extends js.Object
  
  @js.native
  sealed trait ur extends kLanguageInfoTable
  
  @js.native
  sealed trait url_handler extends js.Object
  
  @js.native
  sealed trait usb
    extends DeviceVendorIdSource
       with Permission
  
  @js.native
  sealed trait usbDevices extends Permission
  
  @js.native
  sealed trait user extends CSSOrigin
  
  @js.native
  sealed trait uz extends kLanguageInfoTable
  
  @js.native
  sealed trait vendor extends js.Object
  
  @js.native
  sealed trait vi extends kLanguageInfoTable
  
  @js.native
  sealed trait video
    extends ContextType
       with typings.chromeDashApps.chrome.bluetooth.DeviceType
       with MediaType
  
  @js.native
  sealed trait videoCapture extends Permission
  
  @js.native
  sealed trait virtualKeyboard extends KioskOnlyPermissions
  
  @js.native
  sealed trait volumechange extends js.Object
  
  @js.native
  sealed trait vpnProvider extends ChromeOSOnlyPermissions
  
  @js.native
  sealed trait wa extends kLanguageInfoTable
  
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
  sealed trait webview extends Permission
  
  @js.native
  sealed trait wheel extends js.Object
  
  @js.native
  sealed trait win extends OS
  
  @js.native
  sealed trait window extends js.Object
  
  @js.native
  sealed trait writableAuxiliaries extends CharacteristicProperties
  
  @js.native
  sealed trait write
    extends CharacteristicProperties
       with DescriptorPermissions
  
  @js.native
  sealed trait writeWithoutResponse extends CharacteristicProperties
  
  @js.native
  sealed trait `x86-32` extends js.Object
  
  @js.native
  sealed trait `x86-64` extends js.Object
  
  @js.native
  sealed trait xh extends kLanguageInfoTable
  
  @js.native
  sealed trait xmlhttprequest extends ResourceType
  
  @js.native
  sealed trait yes extends Interactive
  
  @js.native
  sealed trait yi extends kLanguageInfoTable
  
  @js.native
  sealed trait yo extends kLanguageInfoTable
  
  @js.native
  sealed trait zh extends kLanguageInfoTable
  
  @js.native
  sealed trait `zh-CN` extends kLanguageInfoTable
  
  @js.native
  sealed trait `zh-HK` extends kLanguageInfoTable
  
  @js.native
  sealed trait `zh-TW` extends kLanguageInfoTable
  
  @js.native
  sealed trait zh_hans_cn extends kLanguageInfoTable
  
  @js.native
  sealed trait zh_hans_sg extends kLanguageInfoTable
  
  @js.native
  sealed trait zh_hant_hk extends kLanguageInfoTable
  
  @js.native
  sealed trait zh_hant_mo extends kLanguageInfoTable
  
  @js.native
  sealed trait zh_hant_tw extends kLanguageInfoTable
  
  @js.native
  sealed trait zoomchange extends js.Object
  
  @js.native
  sealed trait zu extends kLanguageInfoTable
  
  @scala.inline
  def `*`: `*` = "*".asInstanceOf[`*`]
  @scala.inline
  def `8021X`: `8021X` = "8021X".asInstanceOf[`8021X`]
  @scala.inline
  def `<all_urls>`: `<all_urls>` = "<all_urls>".asInstanceOf[`<all_urls>`]
  @scala.inline
  def ABORT: ABORT = "ABORT".asInstanceOf[ABORT]
  @scala.inline
  def ACCESS_DENIED: ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[ACCESS_DENIED]
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
  def All: All = "All".asInstanceOf[All]
  @scala.inline
  def BLUETOOTH: BLUETOOTH = "BLUETOOTH".asInstanceOf[BLUETOOTH]
  @scala.inline
  def CDMA: CDMA = "CDMA".asInstanceOf[CDMA]
  @scala.inline
  def CENTER: CENTER = "CENTER".asInstanceOf[CENTER]
  @scala.inline
  def CENTER_CROPPED: CENTER_CROPPED = "CENTER_CROPPED".asInstanceOf[CENTER_CROPPED]
  @scala.inline
  def CHANGED: CHANGED = "CHANGED".asInstanceOf[CHANGED]
  @scala.inline
  def CancelRequest: CancelRequest = "CancelRequest".asInstanceOf[CancelRequest]
  @scala.inline
  def Cellular: Cellular = "Cellular".asInstanceOf[Cellular]
  @scala.inline
  def Connected: Connected = "Connected".asInstanceOf[Connected]
  @scala.inline
  def Connecting: Connecting = "Connecting".asInstanceOf[Connecting]
  @scala.inline
  def DELETED: DELETED = "DELETED".asInstanceOf[DELETED]
  @scala.inline
  def DHCP: DHCP = "DHCP".asInstanceOf[DHCP]
  @scala.inline
  def Device: Device = "Device".asInstanceOf[Device]
  @scala.inline
  def DevicePolicy: DevicePolicy = "DevicePolicy".asInstanceOf[DevicePolicy]
  @scala.inline
  def Direct: Direct = "Direct".asInstanceOf[Direct]
  @scala.inline
  def Disabled: Disabled = "Disabled".asInstanceOf[Disabled]
  @scala.inline
  def Disconnected: Disconnected = "Disconnected".asInstanceOf[Disconnected]
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
  def EditRequestCookie: EditRequestCookie = "EditRequestCookie".asInstanceOf[EditRequestCookie]
  @scala.inline
  def EditResponseCookie: EditResponseCookie = "EditResponseCookie".asInstanceOf[EditResponseCookie]
  @scala.inline
  def Empty: Empty = "".asInstanceOf[Empty]
  @scala.inline
  def Enabled: Enabled = "Enabled".asInstanceOf[Enabled]
  @scala.inline
  def Enabling: Enabling = "Enabling".asInstanceOf[Enabling]
  @scala.inline
  def Ethernet: Ethernet = "Ethernet".asInstanceOf[Ethernet]
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  @scala.inline
  def FRONT_MIC: FRONT_MIC = "FRONT_MIC".asInstanceOf[FRONT_MIC]
  @scala.inline
  def GOOG: GOOG = "GOOG".asInstanceOf[GOOG]
  @scala.inline
  def GOOGDOT: GOOGDOT = "GOOG.".asInstanceOf[GOOGDOT]
  @scala.inline
  def GOOGLE: GOOGLE = "GOOGLE".asInstanceOf[GOOGLE]
  @scala.inline
  def GSM: GSM = "GSM".asInstanceOf[GSM]
  @scala.inline
  def HDMI: HDMI = "HDMI".asInstanceOf[HDMI]
  @scala.inline
  def HEADPHONE: HEADPHONE = "HEADPHONE".asInstanceOf[HEADPHONE]
  @scala.inline
  def HOTWORD: HOTWORD = "HOTWORD".asInstanceOf[HOTWORD]
  @scala.inline
  def INPUT: INPUT = "INPUT".asInstanceOf[INPUT]
  @scala.inline
  def INTERNAL_MIC: INTERNAL_MIC = "INTERNAL_MIC".asInstanceOf[INTERNAL_MIC]
  @scala.inline
  def INTERNAL_SPEAKER: INTERNAL_SPEAKER = "INTERNAL_SPEAKER".asInstanceOf[INTERNAL_SPEAKER]
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
  def IgnoreRules: IgnoreRules = "IgnoreRules".asInstanceOf[IgnoreRules]
  @scala.inline
  def KEYBOARD_MIC: KEYBOARD_MIC = "KEYBOARD_MIC".asInstanceOf[KEYBOARD_MIC]
  @scala.inline
  def LINEOUT: LINEOUT = "LINEOUT".asInstanceOf[LINEOUT]
  @scala.inline
  def MAX_ATTEMPTS_EXCEEDED: MAX_ATTEMPTS_EXCEEDED = "MAX_ATTEMPTS_EXCEEDED".asInstanceOf[MAX_ATTEMPTS_EXCEEDED]
  @scala.inline
  def MD5_SHA1: MD5_SHA1 = "MD5_SHA1".asInstanceOf[MD5_SHA1]
  @scala.inline
  def MIC: MIC = "MIC".asInstanceOf[MIC]
  @scala.inline
  def Manual: Manual = "Manual".asInstanceOf[Manual]
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
  def OPEN_AS_PINNED_TAB: OPEN_AS_PINNED_TAB = "OPEN_AS_PINNED_TAB".asInstanceOf[OPEN_AS_PINNED_TAB]
  @scala.inline
  def OPEN_AS_REGULAR_TAB: OPEN_AS_REGULAR_TAB = "OPEN_AS_REGULAR_TAB".asInstanceOf[OPEN_AS_REGULAR_TAB]
  @scala.inline
  def OPEN_AS_WINDOW: OPEN_AS_WINDOW = "OPEN_AS_WINDOW".asInstanceOf[OPEN_AS_WINDOW]
  @scala.inline
  def OPEN_FULL_SCREEN: OPEN_FULL_SCREEN = "OPEN_FULL_SCREEN".asInstanceOf[OPEN_FULL_SCREEN]
  @scala.inline
  def OTHER: OTHER = "OTHER".asInstanceOf[OTHER]
  @scala.inline
  def OUTPUT: OUTPUT = "OUTPUT".asInstanceOf[OUTPUT]
  @scala.inline
  def Offline: Offline = "Offline".asInstanceOf[Offline]
  @scala.inline
  def Online: Online = "Online".asInstanceOf[Online]
  @scala.inline
  def PAC: PAC = "PAC".asInstanceOf[PAC]
  @scala.inline
  def PBC: PBC = "PBC".asInstanceOf[PBC]
  @scala.inline
  def PIN: PIN = "PIN".asInstanceOf[PIN]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def POST_DSP_LOOPBACK: POST_DSP_LOOPBACK = "POST_DSP_LOOPBACK".asInstanceOf[POST_DSP_LOOPBACK]
  @scala.inline
  def POST_MIX_LOOPBACK: POST_MIX_LOOPBACK = "POST_MIX_LOOPBACK".asInstanceOf[POST_MIX_LOOPBACK]
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
  def READ: READ = "READ".asInstanceOf[READ]
  @scala.inline
  def REAR_MIC: REAR_MIC = "REAR_MIC".asInstanceOf[REAR_MIC]
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
  def SECURITY: SECURITY = "SECURITY".asInstanceOf[SECURITY]
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
  def STRETCH: STRETCH = "STRETCH".asInstanceOf[STRETCH]
  @scala.inline
  def SendMessageToExtension: SendMessageToExtension = "SendMessageToExtension".asInstanceOf[SendMessageToExtension]
  @scala.inline
  def SetRequestHeader: SetRequestHeader = "SetRequestHeader".asInstanceOf[SetRequestHeader]
  @scala.inline
  def Static: Static = "Static".asInstanceOf[Static]
  @scala.inline
  def TOO_MANY_OPENED: TOO_MANY_OPENED = "TOO_MANY_OPENED".asInstanceOf[TOO_MANY_OPENED]
  @scala.inline
  def UNKNOWN_ERROR: UNKNOWN_ERROR = "UNKNOWN_ERROR".asInstanceOf[UNKNOWN_ERROR]
  @scala.inline
  def USB: USB = "USB".asInstanceOf[USB]
  @scala.inline
  def Uninitialized: Uninitialized = "Uninitialized".asInstanceOf[Uninitialized]
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  @scala.inline
  def User: User = "User".asInstanceOf[User]
  @scala.inline
  def UserPolicy: UserPolicy = "UserPolicy".asInstanceOf[UserPolicy]
  @scala.inline
  def VPN: VPN = "VPN".asInstanceOf[VPN]
  @scala.inline
  def `WEP-PSK`: `WEP-PSK` = "WEP-PSK".asInstanceOf[`WEP-PSK`]
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
  def abnormal: abnormal = "abnormal".asInstanceOf[abnormal]
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def about_page: about_page = "about_page".asInstanceOf[about_page]
  @scala.inline
  def activate: activate = "activate".asInstanceOf[activate]
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def adaptive: adaptive = "adaptive".asInstanceOf[adaptive]
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  @scala.inline
  def admin: admin = "admin".asInstanceOf[admin]
  @scala.inline
  def af: af = "af".asInstanceOf[af]
  @scala.inline
  def alarms: alarms = "alarms".asInstanceOf[alarms]
  @scala.inline
  def alert: alert = "alert".asInstanceOf[alert]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def allAutoDetected: allAutoDetected = "allAutoDetected".asInstanceOf[allAutoDetected]
  @scala.inline
  def alwaysOnTopWindows: alwaysOnTopWindows = "alwaysOnTopWindows".asInstanceOf[alwaysOnTopWindows]
  @scala.inline
  def am: am = "am".asInstanceOf[am]
  @scala.inline
  def an: an = "an".asInstanceOf[an]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def animationcancel: animationcancel = "animationcancel".asInstanceOf[animationcancel]
  @scala.inline
  def animationend: animationend = "animationend".asInstanceOf[animationend]
  @scala.inline
  def animationiteration: animationiteration = "animationiteration".asInstanceOf[animationiteration]
  @scala.inline
  def animationstart: animationstart = "animationstart".asInstanceOf[animationstart]
  @scala.inline
  def appDOTwindowDOTalpha: appDOTwindowDOTalpha = "app.window.alpha".asInstanceOf[appDOTwindowDOTalpha]
  @scala.inline
  def appDOTwindowDOTalwaysOnTop: appDOTwindowDOTalwaysOnTop = "app.window.alwaysOnTop".asInstanceOf[appDOTwindowDOTalwaysOnTop]
  @scala.inline
  def appDOTwindowDOTfullscreen: appDOTwindowDOTfullscreen = "app.window.fullscreen".asInstanceOf[appDOTwindowDOTfullscreen]
  @scala.inline
  def appDOTwindowDOTfullscreenDOToverrideEsc: appDOTwindowDOTfullscreenDOToverrideEsc = "app.window.fullscreen.overrideEsc".asInstanceOf[appDOTwindowDOTfullscreenDOToverrideEsc]
  @scala.inline
  def appDOTwindowDOTime: appDOTwindowDOTime = "app.window.ime".asInstanceOf[appDOTwindowDOTime]
  @scala.inline
  def appDOTwindowDOTshape: appDOTwindowDOTshape = "app.window.shape".asInstanceOf[appDOTwindowDOTshape]
  @scala.inline
  def app_launcher: app_launcher = "app_launcher".asInstanceOf[app_launcher]
  @scala.inline
  def app_update: app_update = "app_update".asInstanceOf[app_update]
  @scala.inline
  def appview: appview = "appview".asInstanceOf[appview]
  @scala.inline
  def ar: ar = "ar".asInstanceOf[ar]
  @scala.inline
  def ar_001: ar_001 = "ar_001".asInstanceOf[ar_001]
  @scala.inline
  def arm: arm = "arm".asInstanceOf[arm]
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def ast: ast = "ast".asInstanceOf[ast]
  @scala.inline
  def asynchronous: asynchronous = "asynchronous".asInstanceOf[asynchronous]
  @scala.inline
  def audio: audio = "audio".asInstanceOf[audio]
  @scala.inline
  def audioCapture: audioCapture = "audioCapture".asInstanceOf[audioCapture]
  @scala.inline
  def authenticatedSignedWrites: authenticatedSignedWrites = "authenticatedSignedWrites".asInstanceOf[authenticatedSignedWrites]
  @scala.inline
  def authentication_required: authentication_required = "authentication_required".asInstanceOf[authentication_required]
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
  def background: background = "background".asInstanceOf[background]
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  @scala.inline
  def be: be = "be".asInstanceOf[be]
  @scala.inline
  def bg: bg = "bg".asInstanceOf[bg]
  @scala.inline
  def bh: bh = "bh".asInstanceOf[bh]
  @scala.inline
  def bluetooth: bluetooth = "bluetooth".asInstanceOf[bluetooth]
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  @scala.inline
  def bn: bn = "bn".asInstanceOf[bn]
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  @scala.inline
  def br: br = "br".asInstanceOf[br]
  @scala.inline
  def broadcast: broadcast = "broadcast".asInstanceOf[broadcast]
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  @scala.inline
  def browser_action: browser_action = "browser_action".asInstanceOf[browser_action]
  @scala.inline
  def bs: bs = "bs".asInstanceOf[bs]
  @scala.inline
  def bulk: bulk = "bulk".asInstanceOf[bulk]
  @scala.inline
  def ca: ca = "ca".asInstanceOf[ca]
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  @scala.inline
  def canplay: canplay = "canplay".asInstanceOf[canplay]
  @scala.inline
  def canplaythrough: canplaythrough = "canplaythrough".asInstanceOf[canplaythrough]
  @scala.inline
  def capabilities_negotiation_error: capabilities_negotiation_error = "capabilities_negotiation_error".asInstanceOf[capabilities_negotiation_error]
  @scala.inline
  def carAudio: carAudio = "carAudio".asInstanceOf[carAudio]
  @scala.inline
  def ceb: ceb = "ceb".asInstanceOf[ceb]
  @scala.inline
  def certificateProvider: certificateProvider = "certificateProvider".asInstanceOf[certificateProvider]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def changed: changed = "changed".asInstanceOf[changed]
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def chrome: chrome = "chrome".asInstanceOf[chrome]
  @scala.inline
  def `chrome://favicon/`: `chrome://favicon/` = "chrome://favicon/".asInstanceOf[`chrome://favicon/`]
  @scala.inline
  def chrome_internal: chrome_internal = "chrome_internal".asInstanceOf[chrome_internal]
  @scala.inline
  def chrome_os: chrome_os = "chrome_os".asInstanceOf[chrome_os]
  @scala.inline
  def chrome_update: chrome_update = "chrome_update".asInstanceOf[chrome_update]
  @scala.inline
  def ckb: ckb = "ckb".asInstanceOf[ckb]
  @scala.inline
  def `class`: `class` = "class".asInstanceOf[`class`]
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
  def command_line: command_line = "command_line".asInstanceOf[command_line]
  @scala.inline
  def computer: computer = "computer".asInstanceOf[computer]
  @scala.inline
  def confirm: confirm = "confirm".asInstanceOf[confirm]
  @scala.inline
  def conflicting: conflicting = "conflicting".asInstanceOf[conflicting]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def connection_error: connection_error = "connection_error".asInstanceOf[connection_error]
  @scala.inline
  def consolemessage: consolemessage = "consolemessage".asInstanceOf[consolemessage]
  @scala.inline
  def contentload: contentload = "contentload".asInstanceOf[contentload]
  @scala.inline
  def contents_changed: contents_changed = "contents_changed".asInstanceOf[contents_changed]
  @scala.inline
  def contextMenus: contextMenus = "contextMenus".asInstanceOf[contextMenus]
  @scala.inline
  def context_menu: context_menu = "context_menu".asInstanceOf[context_menu]
  @scala.inline
  def contextmenu: contextmenu = "contextmenu".asInstanceOf[contextmenu]
  @scala.inline
  def control: control = "control".asInstanceOf[control]
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
  def cros: cros = "cros".asInstanceOf[cros]
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
  def data: data = "data".asInstanceOf[data]
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
  def declarativeContentDOTPageStateMatcher: declarativeContentDOTPageStateMatcher = "declarativeContent.PageStateMatcher".asInstanceOf[declarativeContentDOTPageStateMatcher]
  @scala.inline
  def declarativeContentDOTonAuthRequired: declarativeContentDOTonAuthRequired = "declarativeContent.onAuthRequired".asInstanceOf[declarativeContentDOTonAuthRequired]
  @scala.inline
  def declarativeContentDOTonBeforeRedirect: declarativeContentDOTonBeforeRedirect = "declarativeContent.onBeforeRedirect".asInstanceOf[declarativeContentDOTonBeforeRedirect]
  @scala.inline
  def declarativeContentDOTonBeforeRequest: declarativeContentDOTonBeforeRequest = "declarativeContent.onBeforeRequest".asInstanceOf[declarativeContentDOTonBeforeRequest]
  @scala.inline
  def declarativeContentDOTonBeforeSendHeaders: declarativeContentDOTonBeforeSendHeaders = "declarativeContent.onBeforeSendHeaders".asInstanceOf[declarativeContentDOTonBeforeSendHeaders]
  @scala.inline
  def declarativeContentDOTonCompleted: declarativeContentDOTonCompleted = "declarativeContent.onCompleted".asInstanceOf[declarativeContentDOTonCompleted]
  @scala.inline
  def declarativeContentDOTonErrorOccured: declarativeContentDOTonErrorOccured = "declarativeContent.onErrorOccured".asInstanceOf[declarativeContentDOTonErrorOccured]
  @scala.inline
  def declarativeContentDOTonHeadersReceived: declarativeContentDOTonHeadersReceived = "declarativeContent.onHeadersReceived".asInstanceOf[declarativeContentDOTonHeadersReceived]
  @scala.inline
  def declarativeContentDOTonMessage: declarativeContentDOTonMessage = "declarativeContent.onMessage".asInstanceOf[declarativeContentDOTonMessage]
  @scala.inline
  def declarativeContentDOTonRequest: declarativeContentDOTonRequest = "declarativeContent.onRequest".asInstanceOf[declarativeContentDOTonRequest]
  @scala.inline
  def declarativeContentDOTonResponseStarted: declarativeContentDOTonResponseStarted = "declarativeContent.onResponseStarted".asInstanceOf[declarativeContentDOTonResponseStarted]
  @scala.inline
  def declarativeContentDOTonSendHeaders: declarativeContentDOTonSendHeaders = "declarativeContent.onSendHeaders".asInstanceOf[declarativeContentDOTonSendHeaders]
  @scala.inline
  def declarativeWebRequestDOTAddRequestCookie: declarativeWebRequestDOTAddRequestCookie = "declarativeWebRequest.AddRequestCookie".asInstanceOf[declarativeWebRequestDOTAddRequestCookie]
  @scala.inline
  def declarativeWebRequestDOTAddResponseCookie: declarativeWebRequestDOTAddResponseCookie = "declarativeWebRequest.AddResponseCookie".asInstanceOf[declarativeWebRequestDOTAddResponseCookie]
  @scala.inline
  def declarativeWebRequestDOTAddResponseHeader: declarativeWebRequestDOTAddResponseHeader = "declarativeWebRequest.AddResponseHeader".asInstanceOf[declarativeWebRequestDOTAddResponseHeader]
  @scala.inline
  def declarativeWebRequestDOTCancelRequest: declarativeWebRequestDOTCancelRequest = "declarativeWebRequest.CancelRequest".asInstanceOf[declarativeWebRequestDOTCancelRequest]
  @scala.inline
  def declarativeWebRequestDOTEditRequestCookie: declarativeWebRequestDOTEditRequestCookie = "declarativeWebRequest.EditRequestCookie".asInstanceOf[declarativeWebRequestDOTEditRequestCookie]
  @scala.inline
  def declarativeWebRequestDOTEditResponseCookie: declarativeWebRequestDOTEditResponseCookie = "declarativeWebRequest.EditResponseCookie".asInstanceOf[declarativeWebRequestDOTEditResponseCookie]
  @scala.inline
  def declarativeWebRequestDOTIgnoreRules: declarativeWebRequestDOTIgnoreRules = "declarativeWebRequest.IgnoreRules".asInstanceOf[declarativeWebRequestDOTIgnoreRules]
  @scala.inline
  def declarativeWebRequestDOTRedirectByRegEx: declarativeWebRequestDOTRedirectByRegEx = "declarativeWebRequest.RedirectByRegEx".asInstanceOf[declarativeWebRequestDOTRedirectByRegEx]
  @scala.inline
  def declarativeWebRequestDOTRedirectRequest: declarativeWebRequestDOTRedirectRequest = "declarativeWebRequest.RedirectRequest".asInstanceOf[declarativeWebRequestDOTRedirectRequest]
  @scala.inline
  def declarativeWebRequestDOTRedirectToEmptyDocument: declarativeWebRequestDOTRedirectToEmptyDocument = "declarativeWebRequest.RedirectToEmptyDocument".asInstanceOf[declarativeWebRequestDOTRedirectToEmptyDocument]
  @scala.inline
  def declarativeWebRequestDOTRedirectToTransparentImage: declarativeWebRequestDOTRedirectToTransparentImage = "declarativeWebRequest.RedirectToTransparentImage".asInstanceOf[declarativeWebRequestDOTRedirectToTransparentImage]
  @scala.inline
  def declarativeWebRequestDOTRemoveRequestCookie: declarativeWebRequestDOTRemoveRequestCookie = "declarativeWebRequest.RemoveRequestCookie".asInstanceOf[declarativeWebRequestDOTRemoveRequestCookie]
  @scala.inline
  def declarativeWebRequestDOTRemoveRequestHeader: declarativeWebRequestDOTRemoveRequestHeader = "declarativeWebRequest.RemoveRequestHeader".asInstanceOf[declarativeWebRequestDOTRemoveRequestHeader]
  @scala.inline
  def declarativeWebRequestDOTRemoveResponseCookie: declarativeWebRequestDOTRemoveResponseCookie = "declarativeWebRequest.RemoveResponseCookie".asInstanceOf[declarativeWebRequestDOTRemoveResponseCookie]
  @scala.inline
  def declarativeWebRequestDOTRemoveResponseHeader: declarativeWebRequestDOTRemoveResponseHeader = "declarativeWebRequest.RemoveResponseHeader".asInstanceOf[declarativeWebRequestDOTRemoveResponseHeader]
  @scala.inline
  def declarativeWebRequestDOTSendMessageToExtension: declarativeWebRequestDOTSendMessageToExtension = "declarativeWebRequest.SendMessageToExtension".asInstanceOf[declarativeWebRequestDOTSendMessageToExtension]
  @scala.inline
  def declarativeWebRequestDOTSetRequestHeader: declarativeWebRequestDOTSetRequestHeader = "declarativeWebRequest.SetRequestHeader".asInstanceOf[declarativeWebRequestDOTSetRequestHeader]
  @scala.inline
  def deleted: deleted = "deleted".asInstanceOf[deleted]
  @scala.inline
  def denied: denied = "denied".asInstanceOf[denied]
  @scala.inline
  def desktopCapture: desktopCapture = "desktopCapture".asInstanceOf[desktopCapture]
  @scala.inline
  def desktop_or_laptop: desktop_or_laptop = "desktop_or_laptop".asInstanceOf[desktop_or_laptop]
  @scala.inline
  def development: development = "development".asInstanceOf[development]
  @scala.inline
  def device: device = "device".asInstanceOf[device]
  @scala.inline
  def diagnostics: diagnostics = "diagnostics".asInstanceOf[diagnostics]
  @scala.inline
  def dialog: dialog = "dialog".asInstanceOf[dialog]
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def display: display = "display".asInstanceOf[display]
  @scala.inline
  def displaySource: displaySource = "displaySource".asInstanceOf[displaySource]
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
  def editable: editable = "editable".asInstanceOf[editable]
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
  def enabled: enabled = "enabled".asInstanceOf[enabled]
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
  def endpoint: endpoint = "endpoint".asInstanceOf[endpoint]
  @scala.inline
  def enterpriseDOTdeviceAttributes: enterpriseDOTdeviceAttributes = "enterprise.deviceAttributes".asInstanceOf[enterpriseDOTdeviceAttributes]
  @scala.inline
  def enterpriseDOTplatformKeys: enterpriseDOTplatformKeys = "enterprise.platformKeys".asInstanceOf[enterpriseDOTplatformKeys]
  @scala.inline
  def eo: eo = "eo".asInstanceOf[eo]
  @scala.inline
  def ephemeral_app: ephemeral_app = "ephemeral_app".asInstanceOf[ephemeral_app]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
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
  def extensions_page: extensions_page = "extensions_page".asInstanceOf[extensions_page]
  @scala.inline
  def fa: fa = "fa".asInstanceOf[fa]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def feedback: feedback = "feedback".asInstanceOf[feedback]
  @scala.inline
  def female: female = "female".asInstanceOf[female]
  @scala.inline
  def fi: fi = "fi".asInstanceOf[fi]
  @scala.inline
  def fil: fil = "fil".asInstanceOf[fil]
  @scala.inline
  def `file:///*/*`: `file:///*/*` = "file:///*/*".asInstanceOf[`file:///*/*`]
  @scala.inline
  def fileBrowserHandler: fileBrowserHandler = "fileBrowserHandler".asInstanceOf[fileBrowserHandler]
  @scala.inline
  def fileSystem: fileSystem = "fileSystem".asInstanceOf[fileSystem]
  @scala.inline
  def fileSystemProvider: fileSystemProvider = "fileSystemProvider".asInstanceOf[fileSystemProvider]
  @scala.inline
  def file_handler: file_handler = "file_handler".asInstanceOf[file_handler]
  @scala.inline
  def filesystem: filesystem = "filesystem".asInstanceOf[filesystem]
  @scala.inline
  def findupdate: findupdate = "findupdate".asInstanceOf[findupdate]
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  @scala.inline
  def fixed: fixed = "fixed".asInstanceOf[fixed]
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
  def frame: frame = "frame".asInstanceOf[frame]
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  @scala.inline
  def fullscreen: fullscreen = "fullscreen".asInstanceOf[fullscreen]
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
  def goog: goog = "goog".asInstanceOf[goog]
  @scala.inline
  def googDOT: googDOT = "goog.".asInstanceOf[googDOT]
  @scala.inline
  def google: google = "google".asInstanceOf[google]
  @scala.inline
  def gotpointercapture: gotpointercapture = "gotpointercapture".asInstanceOf[gotpointercapture]
  @scala.inline
  def granted: granted = "granted".asInstanceOf[granted]
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
  def `http://*/*`: `http://*/*` = "http://*/*".asInstanceOf[`http://*/*`]
  @scala.inline
  def `https://*/*`: `https://*/*` = "https://*/*".asInstanceOf[`https://*/*`]
  @scala.inline
  def `https://wwwDOTgoogle-analyticsDOTcom/*`: `https://wwwDOTgoogle-analyticsDOTcom/*` = "https://www.google-analytics.com/*".asInstanceOf[`https://wwwDOTgoogle-analyticsDOTcom/*`]
  @scala.inline
  def `https://wwwDOTgoogleapisDOTcom/*`: `https://wwwDOTgoogleapisDOTcom/*` = "https://www.googleapis.com/*".asInstanceOf[`https://wwwDOTgoogleapisDOTcom/*`]
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
  def image: image = "image".asInstanceOf[image]
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  @scala.inline
  def in_use: in_use = "in_use".asInstanceOf[in_use]
  @scala.inline
  def incognito_persistent: incognito_persistent = "incognito_persistent".asInstanceOf[incognito_persistent]
  @scala.inline
  def incognito_session_only: incognito_session_only = "incognito_session_only".asInstanceOf[incognito_session_only]
  @scala.inline
  def indicate: indicate = "indicate".asInstanceOf[indicate]
  @scala.inline
  def initializing: initializing = "initializing".asInstanceOf[initializing]
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  @scala.inline
  def install: install = "install".asInstanceOf[install]
  @scala.inline
  def installed_notification: installed_notification = "installed_notification".asInstanceOf[installed_notification]
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  @scala.inline
  def interface: interface = "interface".asInstanceOf[interface]
  @scala.inline
  def interrupt: interrupt = "interrupt".asInstanceOf[interrupt]
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  @scala.inline
  def is: is = "is".asInstanceOf[is]
  @scala.inline
  def isochronous: isochronous = "isochronous".asInstanceOf[isochronous]
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
  def keyboard: keyboard = "keyboard".asInstanceOf[keyboard]
  @scala.inline
  def keyboardMouseCombo: keyboardMouseCombo = "keyboardMouseCombo".asInstanceOf[keyboardMouseCombo]
  @scala.inline
  def keydown: keydown = "keydown".asInstanceOf[keydown]
  @scala.inline
  def keypress: keypress = "keypress".asInstanceOf[keypress]
  @scala.inline
  def keyup: keyup = "keyup".asInstanceOf[keyup]
  @scala.inline
  def kill: kill = "kill".asInstanceOf[kill]
  @scala.inline
  def kiosk: kiosk = "kiosk".asInstanceOf[kiosk]
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
  def last_write_win: last_write_win = "last_write_win".asInstanceOf[last_write_win]
  @scala.inline
  def launcher: launcher = "launcher".asInstanceOf[launcher]
  @scala.inline
  def lb: lb = "lb".asInstanceOf[lb]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def legacy_packaged_app: legacy_packaged_app = "legacy_packaged_app".asInstanceOf[legacy_packaged_app]
  @scala.inline
  def link: link = "link".asInstanceOf[link]
  @scala.inline
  def linkChanged: linkChanged = "linkChanged".asInstanceOf[linkChanged]
  @scala.inline
  def linkDown: linkDown = "linkDown".asInstanceOf[linkDown]
  @scala.inline
  def linkUp: linkUp = "linkUp".asInstanceOf[linkUp]
  @scala.inline
  def linux: linux = "linux".asInstanceOf[linux]
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  @scala.inline
  def ln: ln = "ln".asInstanceOf[ln]
  @scala.inline
  def lo: lo = "lo".asInstanceOf[lo]
  @scala.inline
  def load: load = "load".asInstanceOf[load]
  @scala.inline
  def load_and_launch: load_and_launch = "load_and_launch".asInstanceOf[load_and_launch]
  @scala.inline
  def loadabort: loadabort = "loadabort".asInstanceOf[loadabort]
  @scala.inline
  def loadcommit: loadcommit = "loadcommit".asInstanceOf[loadcommit]
  @scala.inline
  def loadeddata: loadeddata = "loadeddata".asInstanceOf[loadeddata]
  @scala.inline
  def loadedmetadata: loadedmetadata = "loadedmetadata".asInstanceOf[loadedmetadata]
  @scala.inline
  def loadend: loadend = "loadend".asInstanceOf[loadend]
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
  def local_to_remote: local_to_remote = "local_to_remote".asInstanceOf[local_to_remote]
  @scala.inline
  def locked: locked = "locked".asInstanceOf[locked]
  @scala.inline
  def lostpointercapture: lostpointercapture = "lostpointercapture".asInstanceOf[lostpointercapture]
  @scala.inline
  def lt: lt = "lt".asInstanceOf[lt]
  @scala.inline
  def lv: lv = "lv".asInstanceOf[lv]
  @scala.inline
  def mac: mac = "mac".asInstanceOf[mac]
  @scala.inline
  def main_frame: main_frame = "main_frame".asInstanceOf[main_frame]
  @scala.inline
  def male: male = "male".asInstanceOf[male]
  @scala.inline
  def managed: managed = "managed".asInstanceOf[managed]
  @scala.inline
  def management_api: management_api = "management_api".asInstanceOf[management_api]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def maximized: maximized = "maximized".asInstanceOf[maximized]
  @scala.inline
  def mdns: mdns = "mdns".asInstanceOf[mdns]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def mediaGalleries: mediaGalleries = "mediaGalleries".asInstanceOf[mediaGalleries]
  @scala.inline
  def media_pipeline_error: media_pipeline_error = "media_pipeline_error".asInstanceOf[media_pipeline_error]
  @scala.inline
  def mg: mg = "mg".asInstanceOf[mg]
  @scala.inline
  def mi: mi = "mi".asInstanceOf[mi]
  @scala.inline
  def mimeTypeAndTags: mimeTypeAndTags = "mimeTypeAndTags".asInstanceOf[mimeTypeAndTags]
  @scala.inline
  def mimeTypeOnly: mimeTypeOnly = "mimeTypeOnly".asInstanceOf[mimeTypeOnly]
  @scala.inline
  def minimized: minimized = "minimized".asInstanceOf[minimized]
  @scala.inline
  def mips: mips = "mips".asInstanceOf[mips]
  @scala.inline
  def mips64: mips64 = "mips64".asInstanceOf[mips64]
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
  def networkingDOTconfig: networkingDOTconfig = "networking.config".asInstanceOf[networkingDOTconfig]
  @scala.inline
  def networkingDOTonc: networkingDOTonc = "networking.onc".asInstanceOf[networkingDOTonc]
  @scala.inline
  def new_background_tab: new_background_tab = "new_background_tab".asInstanceOf[new_background_tab]
  @scala.inline
  def new_foreground_tab: new_foreground_tab = "new_foreground_tab".asInstanceOf[new_foreground_tab]
  @scala.inline
  def new_note: new_note = "new_note".asInstanceOf[new_note]
  @scala.inline
  def new_popup: new_popup = "new_popup".asInstanceOf[new_popup]
  @scala.inline
  def new_tab_page: new_tab_page = "new_tab_page".asInstanceOf[new_tab_page]
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
  def no_such_device: no_such_device = "no_such_device".asInstanceOf[no_such_device]
  @scala.inline
  def no_update: no_update = "no_update".asInstanceOf[no_update]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def not_connected: not_connected = "not_connected".asInstanceOf[not_connected]
  @scala.inline
  def not_controllable: not_controllable = "not_controllable".asInstanceOf[not_controllable]
  @scala.inline
  def not_listening: not_listening = "not_listening".asInstanceOf[not_listening]
  @scala.inline
  def notification: notification = "notification".asInstanceOf[notification]
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
  def openbsd: openbsd = "openbsd".asInstanceOf[openbsd]
  @scala.inline
  def or: or = "or".asInstanceOf[or]
  @scala.inline
  def os_update: os_update = "os_update".asInstanceOf[os_update]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def out: out = "out".asInstanceOf[out]
  @scala.inline
  def overrideEscFullscreen: overrideEscFullscreen = "overrideEscFullscreen".asInstanceOf[overrideEscFullscreen]
  @scala.inline
  def pa: pa = "pa".asInstanceOf[pa]
  @scala.inline
  def packaged_app: packaged_app = "packaged_app".asInstanceOf[packaged_app]
  @scala.inline
  def page: page = "page".asInstanceOf[page]
  @scala.inline
  def page_action: page_action = "page_action".asInstanceOf[page_action]
  @scala.inline
  def panel: panel = "panel".asInstanceOf[panel]
  @scala.inline
  def partial: partial = "partial".asInstanceOf[partial]
  @scala.inline
  def paste: paste = "paste".asInstanceOf[paste]
  @scala.inline
  def pause: pause = "pause".asInstanceOf[pause]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def `per-origin`: `per-origin` = "per-origin".asInstanceOf[`per-origin`]
  @scala.inline
  def `per-view`: `per-view` = "per-view".asInstanceOf[`per-view`]
  @scala.inline
  def periodic: periodic = "periodic".asInstanceOf[periodic]
  @scala.inline
  def peripheral: peripheral = "peripheral".asInstanceOf[peripheral]
  @scala.inline
  def permissionrequest: permissionrequest = "permissionrequest".asInstanceOf[permissionrequest]
  @scala.inline
  def permissions_increase: permissions_increase = "permissions_increase".asInstanceOf[permissions_increase]
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
  def progress: progress = "progress".asInstanceOf[progress]
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
  def radio: radio = "radio".asInstanceOf[radio]
  @scala.inline
  def ratechange: ratechange = "ratechange".asInstanceOf[ratechange]
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  @scala.inline
  def regular: regular = "regular".asInstanceOf[regular]
  @scala.inline
  def regular_only: regular_only = "regular_only".asInstanceOf[regular_only]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def reliableWrite: reliableWrite = "reliableWrite".asInstanceOf[reliableWrite]
  @scala.inline
  def reload: reload = "reload".asInstanceOf[reload]
  @scala.inline
  def remote_to_local: remote_to_local = "remote_to_local".asInstanceOf[remote_to_local]
  @scala.inline
  def removable: removable = "removable".asInstanceOf[removable]
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  @scala.inline
  def requestFileSystem: requestFileSystem = "requestFileSystem".asInstanceOf[requestFileSystem]
  @scala.inline
  def reserved: reserved = "reserved".asInstanceOf[reserved]
  @scala.inline
  def reset: reset = "reset".asInstanceOf[reset]
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def responsive: responsive = "responsive".asInstanceOf[responsive]
  @scala.inline
  def restart: restart = "restart".asInstanceOf[restart]
  @scala.inline
  def resume: resume = "resume".asInstanceOf[resume]
  @scala.inline
  def retainEntries: retainEntries = "retainEntries".asInstanceOf[retainEntries]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def rm: rm = "rm".asInstanceOf[rm]
  @scala.inline
  def ro: ro = "ro".asInstanceOf[ro]
  @scala.inline
  def rsaSign: rsaSign = "rsaSign".asInstanceOf[rsaSign]
  @scala.inline
  def ru: ru = "ru".asInstanceOf[ru]
  @scala.inline
  def running: running = "running".asInstanceOf[running]
  @scala.inline
  def runtime: runtime = "runtime".asInstanceOf[runtime]
  @scala.inline
  def saveFile: saveFile = "saveFile".asInstanceOf[saveFile]
  @scala.inline
  def save_to_disk: save_to_disk = "save_to_disk".asInstanceOf[save_to_disk]
  @scala.inline
  def screen: screen = "screen".asInstanceOf[screen]
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
  def selection: selection = "selection".asInstanceOf[selection]
  @scala.inline
  def selectionchange: selectionchange = "selectionchange".asInstanceOf[selectionchange]
  @scala.inline
  def selectstart: selectstart = "selectstart".asInstanceOf[selectstart]
  @scala.inline
  def separator: separator = "separator".asInstanceOf[separator]
  @scala.inline
  def serial: serial = "serial".asInstanceOf[serial]
  @scala.inline
  def serviceType: serviceType = "serviceType".asInstanceOf[serviceType]
  @scala.inline
  def setter: setter = "setter".asInstanceOf[setter]
  @scala.inline
  def sh: sh = "sh".asInstanceOf[sh]
  @scala.inline
  def shared_module_update: shared_module_update = "shared_module_update".asInstanceOf[shared_module_update]
  @scala.inline
  def shell: shell = "shell".asInstanceOf[shell]
  @scala.inline
  def showAddDialog: showAddDialog = "showAddDialog".asInstanceOf[showAddDialog]
  @scala.inline
  def showConfigureDialog: showConfigureDialog = "showConfigureDialog".asInstanceOf[showConfigureDialog]
  @scala.inline
  def si: si = "si".asInstanceOf[si]
  @scala.inline
  def sideload: sideload = "sideload".asInstanceOf[sideload]
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
  def standard: standard = "standard".asInstanceOf[standard]
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
  def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def suspend: suspend = "suspend".asInstanceOf[suspend]
  @scala.inline
  def sv: sv = "sv".asInstanceOf[sv]
  @scala.inline
  def sw: sw = "sw".asInstanceOf[sw]
  @scala.inline
  def sync: sync = "sync".asInstanceOf[sync]
  @scala.inline
  def syncFileSystem: syncFileSystem = "syncFileSystem".asInstanceOf[syncFileSystem]
  @scala.inline
  def synced: synced = "synced".asInstanceOf[synced]
  @scala.inline
  def synchronous: synchronous = "synchronous".asInstanceOf[synchronous]
  @scala.inline
  def system: system = "system".asInstanceOf[system]
  @scala.inline
  def systemDOTcpu: systemDOTcpu = "system.cpu".asInstanceOf[systemDOTcpu]
  @scala.inline
  def systemDOTdisplay: systemDOTdisplay = "system.display".asInstanceOf[systemDOTdisplay]
  @scala.inline
  def systemDOTmemory: systemDOTmemory = "system.memory".asInstanceOf[systemDOTmemory]
  @scala.inline
  def systemDOTnetwork: systemDOTnetwork = "system.network".asInstanceOf[systemDOTnetwork]
  @scala.inline
  def systemDOTpowerSource: systemDOTpowerSource = "system.powerSource".asInstanceOf[systemDOTpowerSource]
  @scala.inline
  def systemDOTstorage: systemDOTstorage = "system.storage".asInstanceOf[systemDOTstorage]
  @scala.inline
  def system_error: system_error = "system_error".asInstanceOf[system_error]
  @scala.inline
  def system_tray: system_tray = "system_tray".asInstanceOf[system_tray]
  @scala.inline
  def ta: ta = "ta".asInstanceOf[ta]
  @scala.inline
  def tab: tab = "tab".asInstanceOf[tab]
  @scala.inline
  def tablet: tablet = "tablet".asInstanceOf[tablet]
  @scala.inline
  def te: te = "te".asInstanceOf[te]
  @scala.inline
  def temporary_unavailable: temporary_unavailable = "temporary_unavailable".asInstanceOf[temporary_unavailable]
  @scala.inline
  def test: test = "test".asInstanceOf[test]
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
  def throttled: throttled = "throttled".asInstanceOf[throttled]
  @scala.inline
  def ti: ti = "ti".asInstanceOf[ti]
  @scala.inline
  def timeout_error: timeout_error = "timeout_error".asInstanceOf[timeout_error]
  @scala.inline
  def timeupdate: timeupdate = "timeupdate".asInstanceOf[timeupdate]
  @scala.inline
  def tk: tk = "tk".asInstanceOf[tk]
  @scala.inline
  def tls1: tls1 = "tls1".asInstanceOf[tls1]
  @scala.inline
  def tls1DOT1: tls1DOT1 = "tls1.1".asInstanceOf[tls1DOT1]
  @scala.inline
  def tls1DOT2: tls1DOT2 = "tls1.2".asInstanceOf[tls1DOT2]
  @scala.inline
  def tls1DOT3: tls1DOT3 = "tls1.3".asInstanceOf[tls1DOT3]
  @scala.inline
  def to: to = "to".asInstanceOf[to]
  @scala.inline
  def toggle: toggle = "toggle".asInstanceOf[toggle]
  @scala.inline
  def top: top = "top".asInstanceOf[top]
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
  def unhandled: unhandled = "unhandled".asInstanceOf[unhandled]
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def unknown_error: unknown_error = "unknown_error".asInstanceOf[unknown_error]
  @scala.inline
  def unlimitedStorage: unlimitedStorage = "unlimitedStorage".asInstanceOf[unlimitedStorage]
  @scala.inline
  def unmanaged: unmanaged = "unmanaged".asInstanceOf[unmanaged]
  @scala.inline
  def unresponsive: unresponsive = "unresponsive".asInstanceOf[unresponsive]
  @scala.inline
  def untracked: untracked = "untracked".asInstanceOf[untracked]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def update_available: update_available = "update_available".asInstanceOf[update_available]
  @scala.inline
  def updated: updated = "updated".asInstanceOf[updated]
  @scala.inline
  def ur: ur = "ur".asInstanceOf[ur]
  @scala.inline
  def url_handler: url_handler = "url_handler".asInstanceOf[url_handler]
  @scala.inline
  def usb: usb = "usb".asInstanceOf[usb]
  @scala.inline
  def usbDevices: usbDevices = "usbDevices".asInstanceOf[usbDevices]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  @scala.inline
  def uz: uz = "uz".asInstanceOf[uz]
  @scala.inline
  def vendor: vendor = "vendor".asInstanceOf[vendor]
  @scala.inline
  def vi: vi = "vi".asInstanceOf[vi]
  @scala.inline
  def video: video = "video".asInstanceOf[video]
  @scala.inline
  def videoCapture: videoCapture = "videoCapture".asInstanceOf[videoCapture]
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
  def win: win = "win".asInstanceOf[win]
  @scala.inline
  def window: window = "window".asInstanceOf[window]
  @scala.inline
  def writableAuxiliaries: writableAuxiliaries = "writableAuxiliaries".asInstanceOf[writableAuxiliaries]
  @scala.inline
  def write: write = "write".asInstanceOf[write]
  @scala.inline
  def writeWithoutResponse: writeWithoutResponse = "writeWithoutResponse".asInstanceOf[writeWithoutResponse]
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
}

