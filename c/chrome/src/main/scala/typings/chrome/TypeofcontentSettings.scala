package typings.chrome

import typings.chrome.chromeNs.contentSettingsNs.CameraContentSetting
import typings.chrome.chromeNs.contentSettingsNs.CookieContentSetting
import typings.chrome.chromeNs.contentSettingsNs.FullscreenContentSetting
import typings.chrome.chromeNs.contentSettingsNs.ImagesContentSetting
import typings.chrome.chromeNs.contentSettingsNs.JavascriptContentSetting
import typings.chrome.chromeNs.contentSettingsNs.LocationContentSetting
import typings.chrome.chromeNs.contentSettingsNs.MicrophoneContentSetting
import typings.chrome.chromeNs.contentSettingsNs.MouselockContentSetting
import typings.chrome.chromeNs.contentSettingsNs.MultipleAutomaticDownloadsContentSetting
import typings.chrome.chromeNs.contentSettingsNs.NotificationsContentSetting
import typings.chrome.chromeNs.contentSettingsNs.PluginsContentSetting
import typings.chrome.chromeNs.contentSettingsNs.PopupsContentSetting
import typings.chrome.chromeNs.contentSettingsNs.PpapiBrokerContentSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcontentSettings extends js.Object {
  var automaticDownloads: MultipleAutomaticDownloadsContentSetting
  var camera: CameraContentSetting
  var cookies: CookieContentSetting
  var fullscreen: FullscreenContentSetting
  var images: ImagesContentSetting
  var javascript: JavascriptContentSetting
  var location: LocationContentSetting
  var microphone: MicrophoneContentSetting
  var mouselock: MouselockContentSetting
  var notifications: NotificationsContentSetting
  var plugins: PluginsContentSetting
  var popups: PopupsContentSetting
  var unsandboxedPlugins: PpapiBrokerContentSetting
}

object TypeofcontentSettings {
  @scala.inline
  def apply(
    automaticDownloads: MultipleAutomaticDownloadsContentSetting,
    camera: CameraContentSetting,
    cookies: CookieContentSetting,
    fullscreen: FullscreenContentSetting,
    images: ImagesContentSetting,
    javascript: JavascriptContentSetting,
    location: LocationContentSetting,
    microphone: MicrophoneContentSetting,
    mouselock: MouselockContentSetting,
    notifications: NotificationsContentSetting,
    plugins: PluginsContentSetting,
    popups: PopupsContentSetting,
    unsandboxedPlugins: PpapiBrokerContentSetting
  ): TypeofcontentSettings = {
    val __obj = js.Dynamic.literal(automaticDownloads = automaticDownloads, camera = camera, cookies = cookies, fullscreen = fullscreen, images = images, javascript = javascript, location = location, microphone = microphone, mouselock = mouselock, notifications = notifications, plugins = plugins, popups = popups, unsandboxedPlugins = unsandboxedPlugins)
  
    __obj.asInstanceOf[TypeofcontentSettings]
  }
}

