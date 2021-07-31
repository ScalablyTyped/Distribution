package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait APNSPushNotificationTemplate extends StObject {
  
  /**
    * The action to occur if a recipient taps a push notification that's based on the message template. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the deep-linking features of the iOS platform. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsSdk.pinpointMod.Action] = js.undefined
  
  /**
    * The message body to use in push notifications that are based on the message template.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * The URL of an image or video to display in push notifications that are based on the message template.
    */
  var MediaUrl: js.UndefOr[string] = js.undefined
  
  /**
    * The raw, JSON-formatted string to use as the payload for push notifications that are based on the message template. If specified, this value overrides all other content for the message template.
    */
  var RawContent: js.UndefOr[string] = js.undefined
  
  /**
    * The key for the sound to play when the recipient receives a push notification that's based on the message template. The value for this key is the name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data container. If the sound file can't be found or you specify default for the value, the system plays the default alert sound.
    */
  var Sound: js.UndefOr[string] = js.undefined
  
  /**
    * The title to use in push notifications that are based on the message template. This title appears above the notification message on a recipient's device.
    */
  var Title: js.UndefOr[string] = js.undefined
  
  /**
    * The URL to open in the recipient's default mobile browser, if a recipient taps a push notification that's based on the message template and the value of the Action property is URL.
    */
  var Url: js.UndefOr[string] = js.undefined
}
object APNSPushNotificationTemplate {
  
  @scala.inline
  def apply(): APNSPushNotificationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APNSPushNotificationTemplate]
  }
  
  @scala.inline
  implicit class APNSPushNotificationTemplateMutableBuilder[Self <: APNSPushNotificationTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setMediaUrl(value: string): Self = StObject.set(x, "MediaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaUrlUndefined: Self = StObject.set(x, "MediaUrl", js.undefined)
    
    @scala.inline
    def setRawContent(value: string): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
    
    @scala.inline
    def setSound(value: string): Self = StObject.set(x, "Sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "Sound", js.undefined)
    
    @scala.inline
    def setTitle(value: string): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
