package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidPushNotificationTemplate extends js.Object {
  
  /**
    * The action to occur if a recipient taps a push notification that's based on the message template. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking features of the Android platform. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsSdk.pinpointMod.Action] = js.native
  
  /**
    * The message body to use in a push notification that's based on the message template.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * The URL of the large icon image to display in the content view of a push notification that's based on the message template.
    */
  var ImageIconUrl: js.UndefOr[string] = js.native
  
  /**
    * The URL of an image to display in a push notification that's based on the message template.
    */
  var ImageUrl: js.UndefOr[string] = js.native
  
  /**
    * The raw, JSON-formatted string to use as the payload for a push notification that's based on the message template. If specified, this value overrides all other content for the message template.
    */
  var RawContent: js.UndefOr[string] = js.native
  
  /**
    * The URL of the small icon image to display in the status bar and the content view of a push notification that's based on the message template.
    */
  var SmallImageIconUrl: js.UndefOr[string] = js.native
  
  /**
    * The sound to play when a recipient receives a push notification that's based on the message template. You can use the default stream or specify the file name of a sound resource that's bundled in your app. On an Android platform, the sound file must reside in /res/raw/.
    */
  var Sound: js.UndefOr[string] = js.native
  
  /**
    * The title to use in a push notification that's based on the message template. This title appears above the notification message on a recipient's device.
    */
  var Title: js.UndefOr[string] = js.native
  
  /**
    * The URL to open in a recipient's default mobile browser, if a recipient taps a push notification that's based on the message template and the value of the Action property is URL.
    */
  var Url: js.UndefOr[string] = js.native
}
object AndroidPushNotificationTemplate {
  
  @scala.inline
  def apply(): AndroidPushNotificationTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidPushNotificationTemplate]
  }
  
  @scala.inline
  implicit class AndroidPushNotificationTemplateOps[Self <: AndroidPushNotificationTemplate] (val x: Self) extends AnyVal {
    
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
    def setImageUrl(value: string): Self = this.set("ImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("ImageUrl", js.undefined)
    
    @scala.inline
    def setRawContent(value: string): Self = this.set("RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawContent: Self = this.set("RawContent", js.undefined)
    
    @scala.inline
    def setSmallImageIconUrl(value: string): Self = this.set("SmallImageIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallImageIconUrl: Self = this.set("SmallImageIconUrl", js.undefined)
    
    @scala.inline
    def setSound(value: string): Self = this.set("Sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("Sound", js.undefined)
    
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
