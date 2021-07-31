package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPushNotificationMessage extends StObject {
  
  /**
    * The default action to occur if a recipient taps the push notification. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the deep-linking features of the iOS and Android platforms. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsSdk.pinpointMod.Action] = js.undefined
  
  /**
    * The default body of the notification message.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * The JSON data payload to use for the default push notification, if the notification is a silent push notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
    */
  var Data: js.UndefOr[MapOfString] = js.undefined
  
  /**
    * Specifies whether the default notification is a silent push notification, which is a push notification that doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an app's configuration or delivering messages to an in-app notification center.
    */
  var SilentPush: js.UndefOr[boolean] = js.undefined
  
  /**
    * The default message variables to use in the notification message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.undefined
  
  /**
    * The default title to display above the notification message on a recipient's device.
    */
  var Title: js.UndefOr[string] = js.undefined
  
  /**
    * The default URL to open in a recipient's default mobile browser, if a recipient taps the push notification and the value of the Action property is URL.
    */
  var Url: js.UndefOr[string] = js.undefined
}
object DefaultPushNotificationMessage {
  
  @scala.inline
  def apply(): DefaultPushNotificationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultPushNotificationMessage]
  }
  
  @scala.inline
  implicit class DefaultPushNotificationMessageMutableBuilder[Self <: DefaultPushNotificationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setData(value: MapOfString): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    @scala.inline
    def setSilentPush(value: boolean): Self = StObject.set(x, "SilentPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentPushUndefined: Self = StObject.set(x, "SilentPush", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    
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
