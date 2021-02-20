package typings.chrome.anon

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofcontentSettings extends StObject {
  
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
  
  @scala.inline
  implicit class TypeofcontentSettingsMutableBuilder[Self <: TypeofcontentSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticDownloads(value: MultipleAutomaticDownloadsContentSetting): Self = StObject.set(x, "automaticDownloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCamera(value: CameraContentSetting): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookies(value: CookieContentSetting): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullscreen(value: FullscreenContentSetting): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: ImagesContentSetting): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavascript(value: JavascriptContentSetting): Self = StObject.set(x, "javascript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationContentSetting): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicrophone(value: MicrophoneContentSetting): Self = StObject.set(x, "microphone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouselock(value: MouselockContentSetting): Self = StObject.set(x, "mouselock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotifications(value: NotificationsContentSetting): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugins(value: PluginsContentSetting): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopups(value: PopupsContentSetting): Self = StObject.set(x, "popups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnsandboxedPlugins(value: PpapiBrokerContentSetting): Self = StObject.set(x, "unsandboxedPlugins", value.asInstanceOf[js.Any])
  }
}
