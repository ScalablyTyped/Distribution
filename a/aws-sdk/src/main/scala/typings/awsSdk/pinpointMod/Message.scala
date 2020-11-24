package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends js.Object {
  
  /**
    * The action to occur if a recipient taps the push notification. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the deep-linking features of iOS and Android. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsSdk.pinpointMod.Action] = js.native
  
  /**
    * The body of the notification message. The maximum number of characters is 200.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * The URL of the image to display as the push-notification icon, such as the icon for the app.
    */
  var ImageIconUrl: js.UndefOr[string] = js.native
  
  /**
    * The URL of the image to display as the small, push-notification icon, such as a small version of the icon for the app.
    */
  var ImageSmallIconUrl: js.UndefOr[string] = js.native
  
  /**
    * The URL of an image to display in the push notification.
    */
  var ImageUrl: js.UndefOr[string] = js.native
  
  /**
    * The JSON payload to use for a silent push notification.
    */
  var JsonBody: js.UndefOr[string] = js.native
  
  /**
    * The URL of the image or video to display in the push notification.
    */
  var MediaUrl: js.UndefOr[string] = js.native
  
  /**
    * The raw, JSON-formatted string to use as the payload for the notification message. If specified, this value overrides all other content for the message.
    */
  var RawContent: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the notification is a silent push notification, which is a push notification that doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an app's configuration, displaying messages in an in-app message center, or supporting phone home functionality.
    */
  var SilentPush: js.UndefOr[boolean] = js.native
  
  /**
    * The number of seconds that the push-notification service should keep the message, if the service is unable to deliver the notification the first time. This value is converted to an expiration value when it's sent to a push-notification service. If this value is 0, the service treats the notification as if it expires immediately and the service doesn't store or try to deliver the notification again. This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
    */
  var TimeToLive: js.UndefOr[integer] = js.native
  
  /**
    * The title to display above the notification message on a recipient's device.
    */
  var Title: js.UndefOr[string] = js.native
  
  /**
    * The URL to open in a recipient's default mobile browser, if a recipient taps the push notification and the value of the Action property is URL.
    */
  var Url: js.UndefOr[string] = js.native
}
object Message {
  
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: Action): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setBody(value: string): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setImageIconUrl(value: string): Self = this.set("ImageIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageIconUrl: Self = this.set("ImageIconUrl", js.undefined)
    
    @scala.inline
    def setImageSmallIconUrl(value: string): Self = this.set("ImageSmallIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSmallIconUrl: Self = this.set("ImageSmallIconUrl", js.undefined)
    
    @scala.inline
    def setImageUrl(value: string): Self = this.set("ImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("ImageUrl", js.undefined)
    
    @scala.inline
    def setJsonBody(value: string): Self = this.set("JsonBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJsonBody: Self = this.set("JsonBody", js.undefined)
    
    @scala.inline
    def setMediaUrl(value: string): Self = this.set("MediaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaUrl: Self = this.set("MediaUrl", js.undefined)
    
    @scala.inline
    def setRawContent(value: string): Self = this.set("RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawContent: Self = this.set("RawContent", js.undefined)
    
    @scala.inline
    def setSilentPush(value: boolean): Self = this.set("SilentPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilentPush: Self = this.set("SilentPush", js.undefined)
    
    @scala.inline
    def setTimeToLive(value: integer): Self = this.set("TimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLive: Self = this.set("TimeToLive", js.undefined)
    
    @scala.inline
    def setTitle(value: string): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
