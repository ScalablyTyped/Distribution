package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GCMMessage extends js.Object {
  
  /**
    * The action to occur if the recipient taps the push notification. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This action uses the deep-linking features of the Android platform. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsSdk.pinpointMod.Action] = js.native
  
  /**
    * The body of the notification message.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * An arbitrary string that identifies a group of messages that can be collapsed to ensure that only the last message is sent when delivery can resume. This helps avoid sending too many instances of the same messages when the recipient's device comes online again or becomes active. Amazon Pinpoint specifies this value in the Firebase Cloud Messaging (FCM) collapse_key parameter when it sends the notification message to FCM.
    */
  var CollapseKey: js.UndefOr[string] = js.native
  
  /**
    * The JSON data payload to use for the push notification, if the notification is a silent push notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
    */
  var Data: js.UndefOr[MapOfString] = js.native
  
  /**
    * The icon image name of the asset saved in your app.
    */
  var IconReference: js.UndefOr[string] = js.native
  
  /**
    * The URL of the large icon image to display in the content view of the push notification.
    */
  var ImageIconUrl: js.UndefOr[string] = js.native
  
  /**
    * The URL of an image to display in the push notification.
    */
  var ImageUrl: js.UndefOr[string] = js.native
  
  /**
    * para>normal - The notification might be delayed. Delivery is optimized for battery usage on the recipient's device. Use this value unless immediate delivery is required./listitem> high - The notification is sent immediately and might wake a sleeping device./para> Amazon Pinpoint specifies this value in the FCM priority parameter when it sends the notification message to FCM. The equivalent values for Apple Push Notification service (APNs) are 5, for normal, and 10, for high. If you specify an APNs value for this property, Amazon Pinpoint accepts and converts the value to the corresponding FCM value.
    */
  var Priority: js.UndefOr[string] = js.native
  
  /**
    * The raw, JSON-formatted string to use as the payload for the notification message. If specified, this value overrides all other content for the message.
    */
  var RawContent: js.UndefOr[string] = js.native
  
  /**
    * The package name of the application where registration tokens must match in order for the recipient to receive the message.
    */
  var RestrictedPackageName: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the notification is a silent push notification, which is a push notification that doesn't display on a recipient's device. Silent push notifications can be used for cases such as updating an app's configuration or supporting phone home functionality.
    */
  var SilentPush: js.UndefOr[boolean] = js.native
  
  /**
    * The URL of the small icon image to display in the status bar and the content view of the push notification.
    */
  var SmallImageIconUrl: js.UndefOr[string] = js.native
  
  /**
    * The sound to play when the recipient receives the push notification. You can use the default stream or specify the file name of a sound resource that's bundled in your app. On an Android platform, the sound file must reside in /res/raw/.
    */
  var Sound: js.UndefOr[string] = js.native
  
  /**
    * The default message variables to use in the notification message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
  
  /**
    * The amount of time, in seconds, that FCM should store and attempt to deliver the push notification, if the service is unable to deliver the notification the first time. If you don't specify this value, FCM defaults to the maximum value, which is 2,419,200 seconds (28 days). Amazon Pinpoint specifies this value in the FCM time_to_live parameter when it sends the notification message to FCM.
    */
  var TimeToLive: js.UndefOr[integer] = js.native
  
  /**
    * The title to display above the notification message on the recipient's device.
    */
  var Title: js.UndefOr[string] = js.native
  
  /**
    * The URL to open in the recipient's default mobile browser, if a recipient taps the push notification and the value of the Action property is URL.
    */
  var Url: js.UndefOr[string] = js.native
}
object GCMMessage {
  
  @scala.inline
  def apply(): GCMMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GCMMessage]
  }
  
  @scala.inline
  implicit class GCMMessageOps[Self <: GCMMessage] (val x: Self) extends AnyVal {
    
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
    def setCollapseKey(value: string): Self = this.set("CollapseKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseKey: Self = this.set("CollapseKey", js.undefined)
    
    @scala.inline
    def setData(value: MapOfString): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    
    @scala.inline
    def setIconReference(value: string): Self = this.set("IconReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconReference: Self = this.set("IconReference", js.undefined)
    
    @scala.inline
    def setImageIconUrl(value: string): Self = this.set("ImageIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageIconUrl: Self = this.set("ImageIconUrl", js.undefined)
    
    @scala.inline
    def setImageUrl(value: string): Self = this.set("ImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("ImageUrl", js.undefined)
    
    @scala.inline
    def setPriority(value: string): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    
    @scala.inline
    def setRawContent(value: string): Self = this.set("RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawContent: Self = this.set("RawContent", js.undefined)
    
    @scala.inline
    def setRestrictedPackageName(value: string): Self = this.set("RestrictedPackageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictedPackageName: Self = this.set("RestrictedPackageName", js.undefined)
    
    @scala.inline
    def setSilentPush(value: boolean): Self = this.set("SilentPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilentPush: Self = this.set("SilentPush", js.undefined)
    
    @scala.inline
    def setSmallImageIconUrl(value: string): Self = this.set("SmallImageIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmallImageIconUrl: Self = this.set("SmallImageIconUrl", js.undefined)
    
    @scala.inline
    def setSound(value: string): Self = this.set("Sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("Sound", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
    
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
