package typings.chrome

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
    val __obj = js.Dynamic.literal(automaticDownloads = automaticDownloads.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], fullscreen = fullscreen.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], javascript = javascript.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], microphone = microphone.asInstanceOf[js.Any], mouselock = mouselock.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], popups = popups.asInstanceOf[js.Any], unsandboxedPlugins = unsandboxedPlugins.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofcontentSettings]
  }
}

