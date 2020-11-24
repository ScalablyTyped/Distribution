package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APNSMessage extends js.Object {
  
  /**
    * The type of push notification to send. Valid values are: alert - For a standard notification that's displayed on recipients' devices and prompts a recipient to interact with the notification. background - For a silent notification that delivers content in the background and isn't displayed on recipients' devices. complication - For a notification that contains update information for an app’s complication timeline. fileprovider - For a notification that signals changes to a File Provider extension. mdm - For a notification that tells managed devices to contact the MDM server. voip - For a notification that provides information about an incoming VoIP call. Amazon Pinpoint specifies this value in the apns-push-type request header when it sends the notification message to APNs. If you don't specify a value for this property, Amazon Pinpoint sets the value to alert or background automatically, based on the value that you specify for the SilentPush or RawContent property of the message. For more information about the apns-push-type request header, see Sending Notification Requests to APNs on the Apple Developer website.
    */
  var APNSPushType: js.UndefOr[string] = js.native
  
  /**
    * The action to occur if the recipient taps the push notification. Valid values are: OPEN_APP - Your app opens or it becomes the foreground app if it was sent to the background. This is the default action. DEEP_LINK - Your app opens and displays a designated user interface in the app. This setting uses the deep-linking features of the iOS platform. URL - The default mobile browser on the recipient's device opens and loads the web page at a URL that you specify.
    */
  var Action: js.UndefOr[typings.awsSdk.pinpointMod.Action] = js.native
  
  /**
    * The key that indicates whether and how to modify the badge of your app's icon when the recipient receives the push notification. If this key isn't included in the dictionary, the badge doesn't change. To remove the badge, set this value to 0.
    */
  var Badge: js.UndefOr[integer] = js.native
  
  /**
    * The body of the notification message.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * The key that indicates the notification type for the push notification. This key is a value that's defined by the identifier property of one of your app's registered categories.
    */
  var Category: js.UndefOr[string] = js.native
  
  /**
    * An arbitrary identifier that, if assigned to multiple messages, APNs uses to coalesce the messages into a single push notification instead of delivering each message individually. This value can't exceed 64 bytes. Amazon Pinpoint specifies this value in the apns-collapse-id request header when it sends the notification message to APNs.
    */
  var CollapseId: js.UndefOr[string] = js.native
  
  /**
    * The JSON payload to use for a silent push notification. This payload is added to the data.pinpoint.jsonBody object of the notification.
    */
  var Data: js.UndefOr[MapOfString] = js.native
  
  /**
    * The URL of an image or video to display in the push notification.
    */
  var MediaUrl: js.UndefOr[string] = js.native
  
  /**
    * The authentication method that you want Amazon Pinpoint to use when authenticating with APNs, CERTIFICATE or TOKEN.
    */
  var PreferredAuthenticationMethod: js.UndefOr[string] = js.native
  
  /**
    * para>5 - Low priority, the notification might be delayed, delivered as part of a group, or throttled./listitem> 10 - High priority, the notification is sent immediately. This is the default value. A high priority notification should trigger an alert, play a sound, or badge your app's icon on the recipient's device./para> Amazon Pinpoint specifies this value in the apns-priority request header when it sends the notification message to APNs. The equivalent values for Firebase Cloud Messaging (FCM), formerly Google Cloud Messaging (GCM), are normal, for 5, and high, for 10. If you specify an FCM value for this property, Amazon Pinpoint accepts and converts the value to the corresponding APNs value.
    */
  var Priority: js.UndefOr[string] = js.native
  
  /**
    * The raw, JSON-formatted string to use as the payload for the notification message. If specified, this value overrides all other content for the message. If you specify the raw content of an APNs push notification, the message payload has to include the content-available key. The value of the content-available key has to be an integer, and can only be 0 or 1. If you're sending a standard notification, set the value of content-available to 0. If you're sending a silent (background) notification, set the value of content-available to 1. Additionally, silent notification payloads can't include the alert, badge, or sound keys. For more information, see Generating a Remote Notification and Pushing Background Updates to Your App on the Apple Developer website.
    */
  var RawContent: js.UndefOr[string] = js.native
  
  /**
    * Specifies whether the notification is a silent push notification. A silent (or background) push notification isn't displayed on recipients' devices. You can use silent push notifications to make small updates to your app, or to display messages in an in-app message center. Amazon Pinpoint uses this property to determine the correct value for the apns-push-type request header when it sends the notification message to APNs. If you specify a value of true for this property, Amazon Pinpoint sets the value for the apns-push-type header field to background. If you specify the raw content of an APNs push notification, the message payload has to include the content-available key. For silent (background) notifications, set the value of content-available to 1. Additionally, the message payload for a silent notification can't include the alert, badge, or sound keys. For more information, see Generating a Remote Notification and Pushing Background Updates to Your App on the Apple Developer website. Apple has indicated that they will throttle "excessive" background notifications based on current traffic volumes. To prevent your notifications being throttled, Apple recommends that you send no more than 3 silent push notifications to each recipient per hour.
    */
  var SilentPush: js.UndefOr[boolean] = js.native
  
  /**
    * The key for the sound to play when the recipient receives the push notification. The value for this key is the name of a sound file in your app's main bundle or the Library/Sounds folder in your app's data container. If the sound file can't be found or you specify default for the value, the system plays the default alert sound.
    */
  var Sound: js.UndefOr[string] = js.native
  
  /**
    * The default message variables to use in the notification message. You can override these default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.native
  
  /**
    * The key that represents your app-specific identifier for grouping notifications. If you provide a Notification Content app extension, you can use this value to group your notifications together.
    */
  var ThreadId: js.UndefOr[string] = js.native
  
  /**
    * The amount of time, in seconds, that APNs should store and attempt to deliver the push notification, if the service is unable to deliver the notification the first time. If this value is 0, APNs treats the notification as if it expires immediately and the service doesn't store or try to deliver the notification again. Amazon Pinpoint specifies this value in the apns-expiration request header when it sends the notification message to APNs.
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
object APNSMessage {
  
  @scala.inline
  def apply(): APNSMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[APNSMessage]
  }
  
  @scala.inline
  implicit class APNSMessageOps[Self <: APNSMessage] (val x: Self) extends AnyVal {
    
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
    def setAPNSPushType(value: string): Self = this.set("APNSPushType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAPNSPushType: Self = this.set("APNSPushType", js.undefined)
    
    @scala.inline
    def setAction(value: Action): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setBadge(value: integer): Self = this.set("Badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("Badge", js.undefined)
    
    @scala.inline
    def setBody(value: string): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setCategory(value: string): Self = this.set("Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    
    @scala.inline
    def setCollapseId(value: string): Self = this.set("CollapseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseId: Self = this.set("CollapseId", js.undefined)
    
    @scala.inline
    def setData(value: MapOfString): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    
    @scala.inline
    def setMediaUrl(value: string): Self = this.set("MediaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaUrl: Self = this.set("MediaUrl", js.undefined)
    
    @scala.inline
    def setPreferredAuthenticationMethod(value: string): Self = this.set("PreferredAuthenticationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredAuthenticationMethod: Self = this.set("PreferredAuthenticationMethod", js.undefined)
    
    @scala.inline
    def setPriority(value: string): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    
    @scala.inline
    def setRawContent(value: string): Self = this.set("RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawContent: Self = this.set("RawContent", js.undefined)
    
    @scala.inline
    def setSilentPush(value: boolean): Self = this.set("SilentPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilentPush: Self = this.set("SilentPush", js.undefined)
    
    @scala.inline
    def setSound(value: string): Self = this.set("Sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("Sound", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
    
    @scala.inline
    def setThreadId(value: string): Self = this.set("ThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadId: Self = this.set("ThreadId", js.undefined)
    
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
