package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutomaticDownloads extends js.Object {
  var automaticDownloads: chromeLib.chromeNs.contentSettingsNs.MultipleAutomaticDownloadsContentSetting
  var camera: chromeLib.chromeNs.contentSettingsNs.CameraContentSetting
  var cookies: chromeLib.chromeNs.contentSettingsNs.CookieContentSetting
  var fullscreen: chromeLib.chromeNs.contentSettingsNs.FullscreenContentSetting
  var images: chromeLib.chromeNs.contentSettingsNs.ImagesContentSetting
  var javascript: chromeLib.chromeNs.contentSettingsNs.JavascriptContentSetting
  var location: chromeLib.chromeNs.contentSettingsNs.LocationContentSetting
  var microphone: chromeLib.chromeNs.contentSettingsNs.MicrophoneContentSetting
  var mouselock: chromeLib.chromeNs.contentSettingsNs.MouselockContentSetting
  var notifications: chromeLib.chromeNs.contentSettingsNs.NotificationsContentSetting
  var plugins: chromeLib.chromeNs.contentSettingsNs.PluginsContentSetting
  var popups: chromeLib.chromeNs.contentSettingsNs.PopupsContentSetting
  var unsandboxedPlugins: chromeLib.chromeNs.contentSettingsNs.PpapiBrokerContentSetting
}

object Anon_AutomaticDownloads {
  @scala.inline
  def apply(
    automaticDownloads: chromeLib.chromeNs.contentSettingsNs.MultipleAutomaticDownloadsContentSetting,
    camera: chromeLib.chromeNs.contentSettingsNs.CameraContentSetting,
    cookies: chromeLib.chromeNs.contentSettingsNs.CookieContentSetting,
    fullscreen: chromeLib.chromeNs.contentSettingsNs.FullscreenContentSetting,
    images: chromeLib.chromeNs.contentSettingsNs.ImagesContentSetting,
    javascript: chromeLib.chromeNs.contentSettingsNs.JavascriptContentSetting,
    location: chromeLib.chromeNs.contentSettingsNs.LocationContentSetting,
    microphone: chromeLib.chromeNs.contentSettingsNs.MicrophoneContentSetting,
    mouselock: chromeLib.chromeNs.contentSettingsNs.MouselockContentSetting,
    notifications: chromeLib.chromeNs.contentSettingsNs.NotificationsContentSetting,
    plugins: chromeLib.chromeNs.contentSettingsNs.PluginsContentSetting,
    popups: chromeLib.chromeNs.contentSettingsNs.PopupsContentSetting,
    unsandboxedPlugins: chromeLib.chromeNs.contentSettingsNs.PpapiBrokerContentSetting
  ): Anon_AutomaticDownloads = {
    val __obj = js.Dynamic.literal(automaticDownloads = automaticDownloads, camera = camera, cookies = cookies, fullscreen = fullscreen, images = images, javascript = javascript, location = location, microphone = microphone, mouselock = mouselock, notifications = notifications, plugins = plugins, popups = popups, unsandboxedPlugins = unsandboxedPlugins)
  
    __obj.asInstanceOf[Anon_AutomaticDownloads]
  }
}

