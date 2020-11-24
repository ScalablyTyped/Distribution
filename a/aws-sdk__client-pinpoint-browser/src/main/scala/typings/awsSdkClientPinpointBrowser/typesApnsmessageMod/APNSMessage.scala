package typings.awsSdkClientPinpointBrowser.typesApnsmessageMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APNSMessage extends js.Object {
  
  /**
    * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
    */
  var Action: js.UndefOr[OPEN_APP | DEEP_LINK | URL | String] = js.native
  
  /**
    * Include this key when you want the system to modify the badge of your app icon. If this key is not included in the dictionary, the badge is not changed. To remove the badge, set the value of this key to 0.
    */
  var Badge: js.UndefOr[Double] = js.native
  
  /**
    * The message body of the notification.
    */
  var Body: js.UndefOr[String] = js.native
  
  /**
    * Provide this key with a string value that represents the notification's type. This value corresponds to the value in the identifier property of one of your app's registered categories.
    */
  var Category: js.UndefOr[String] = js.native
  
  /**
    * An ID that, if assigned to multiple messages, causes APNs to coalesce the messages into a single push notification instead of delivering each message individually. The value must not exceed 64 bytes. Amazon Pinpoint uses this value to set the apns-collapse-id request header when it sends the message to APNs.
    */
  var CollapseId: js.UndefOr[String] = js.native
  
  /**
    * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
    */
  var Data: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
  
  /**
    * The URL that points to a video used in the push notification.
    */
  var MediaUrl: js.UndefOr[String] = js.native
  
  /**
    * The preferred authentication method, either "CERTIFICATE" or "TOKEN"
    */
  var PreferredAuthenticationMethod: js.UndefOr[String] = js.native
  
  /**
    * The message priority. Amazon Pinpoint uses this value to set the apns-priority request header when it sends the message to APNs. Accepts the following values:
    *
    * "5" - Low priority. Messages might be delayed, delivered in groups, and throttled.
    *
    * "10" - High priority. Messages are sent immediately. High priority messages must cause an alert, sound, or badge on the receiving device.
    *
    * The default value is "10".
    *
    * The equivalent values for FCM or GCM messages are "normal" and "high". Amazon Pinpoint accepts these values for APNs messages and converts them.
    *
    * For more information about the apns-priority parameter, see Communicating with APNs in the APNs Local and Remote Notification Programming Guide.
    */
  var Priority: js.UndefOr[String] = js.native
  
  /**
    * The Raw JSON formatted string to be used as the payload. This value overrides the message.
    */
  var RawContent: js.UndefOr[String] = js.native
  
  /**
    * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration and Phone Home use cases.
    */
  var SilentPush: js.UndefOr[Boolean] = js.native
  
  /**
    * Include this key when you want the system to play a sound. The value of this key is the name of a sound file in your app's main bundle or in the Library/Sounds folder of your app's data container. If the sound file cannot be found, or if you specify defaultfor the value, the system plays the default alert sound.
    */
  var Sound: js.UndefOr[String] = js.native
  
  /**
    * Default message substitutions. Can be overridden by individual address substitutions.
    */
  var Substitutions: js.UndefOr[
    (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
  ] = js.native
  
  /**
    * Provide this key with a string value that represents the app-specific identifier for grouping notifications. If you provide a Notification Content app extension, you can use this value to group your notifications together.
    */
  var ThreadId: js.UndefOr[String] = js.native
  
  /**
    * The length of time (in seconds) that APNs stores and attempts to deliver the message. If the value is 0, APNs does not store the message or attempt to deliver it more than once. Amazon Pinpoint uses this value to set the apns-expiration request header when it sends the message to APNs.
    */
  var TimeToLive: js.UndefOr[Double] = js.native
  
  /**
    * The message title that displays above the message on the user's device.
    */
  var Title: js.UndefOr[String] = js.native
  
  /**
    * The URL to open in the user's mobile browser. Used if the value for Action is URL.
    */
  var Url: js.UndefOr[String] = js.native
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
    def setAction(value: OPEN_APP | DEEP_LINK | URL | String): Self = this.set("Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("Action", js.undefined)
    
    @scala.inline
    def setBadge(value: Double): Self = this.set("Badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("Badge", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setCategory(value: String): Self = this.set("Category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategory: Self = this.set("Category", js.undefined)
    
    @scala.inline
    def setCollapseId(value: String): Self = this.set("CollapseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapseId: Self = this.set("CollapseId", js.undefined)
    
    @scala.inline
    def setData(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    
    @scala.inline
    def setMediaUrl(value: String): Self = this.set("MediaUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaUrl: Self = this.set("MediaUrl", js.undefined)
    
    @scala.inline
    def setPreferredAuthenticationMethod(value: String): Self = this.set("PreferredAuthenticationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredAuthenticationMethod: Self = this.set("PreferredAuthenticationMethod", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("Priority", js.undefined)
    
    @scala.inline
    def setRawContent(value: String): Self = this.set("RawContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawContent: Self = this.set("RawContent", js.undefined)
    
    @scala.inline
    def setSilentPush(value: Boolean): Self = this.set("SilentPush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilentPush: Self = this.set("SilentPush", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = this.set("Sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSound: Self = this.set("Sound", js.undefined)
    
    @scala.inline
    def setSubstitutions(
      value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
    ): Self = this.set("Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubstitutions: Self = this.set("Substitutions", js.undefined)
    
    @scala.inline
    def setThreadId(value: String): Self = this.set("ThreadId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreadId: Self = this.set("ThreadId", js.undefined)
    
    @scala.inline
    def setTimeToLive(value: Double): Self = this.set("TimeToLive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeToLive: Self = this.set("TimeToLive", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
