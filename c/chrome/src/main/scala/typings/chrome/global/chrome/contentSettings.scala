package typings.chrome.global.chrome

import typings.chrome.chrome.contentSettings.CameraContentSetting
import typings.chrome.chrome.contentSettings.CookieContentSetting
import typings.chrome.chrome.contentSettings.FullscreenContentSetting
import typings.chrome.chrome.contentSettings.ImagesContentSetting
import typings.chrome.chrome.contentSettings.JavascriptContentSetting
import typings.chrome.chrome.contentSettings.LocationContentSetting
import typings.chrome.chrome.contentSettings.MicrophoneContentSetting
import typings.chrome.chrome.contentSettings.MouselockContentSetting
import typings.chrome.chrome.contentSettings.MultipleAutomaticDownloadsContentSetting
import typings.chrome.chrome.contentSettings.NotificationsContentSetting
import typings.chrome.chrome.contentSettings.PluginsContentSetting
import typings.chrome.chrome.contentSettings.PopupsContentSetting
import typings.chrome.chrome.contentSettings.PpapiBrokerContentSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Content Settings
////////////////////
/**
  * Use the chrome.contentSettings API to change settings that control whether websites can use features such as cookies, JavaScript, and plugins. More generally speaking, content settings allow you to customize Chrome's behavior on a per-site basis instead of globally.
  * Availability: Since Chrome 16.
  * Permissions:  "contentSettings"
  */
@JSGlobal("chrome.contentSettings")
@js.native
object contentSettings extends js.Object {
  
  var automaticDownloads: MultipleAutomaticDownloadsContentSetting = js.native
  
  var camera: CameraContentSetting = js.native
  
  var cookies: CookieContentSetting = js.native
  
  var fullscreen: FullscreenContentSetting = js.native
  
  var images: ImagesContentSetting = js.native
  
  var javascript: JavascriptContentSetting = js.native
  
  var location: LocationContentSetting = js.native
  
  var microphone: MicrophoneContentSetting = js.native
  
  var mouselock: MouselockContentSetting = js.native
  
  var notifications: NotificationsContentSetting = js.native
  
  var plugins: PluginsContentSetting = js.native
  
  var popups: PopupsContentSetting = js.native
  
  var unsandboxedPlugins: PpapiBrokerContentSetting = js.native
}
