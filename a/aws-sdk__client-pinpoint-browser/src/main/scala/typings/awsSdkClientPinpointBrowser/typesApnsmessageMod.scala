package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesApnsmessageMod {
  
  @js.native
  trait APNSMessage extends StObject {
    
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
    implicit class APNSMessageMutableBuilder[Self <: APNSMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: OPEN_APP | DEEP_LINK | URL | String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      @scala.inline
      def setBadge(value: Double): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "Category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "Category", js.undefined)
      
      @scala.inline
      def setCollapseId(value: String): Self = StObject.set(x, "CollapseId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseIdUndefined: Self = StObject.set(x, "CollapseId", js.undefined)
      
      @scala.inline
      def setData(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      @scala.inline
      def setMediaUrl(value: String): Self = StObject.set(x, "MediaUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaUrlUndefined: Self = StObject.set(x, "MediaUrl", js.undefined)
      
      @scala.inline
      def setPreferredAuthenticationMethod(value: String): Self = StObject.set(x, "PreferredAuthenticationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredAuthenticationMethodUndefined: Self = StObject.set(x, "PreferredAuthenticationMethod", js.undefined)
      
      @scala.inline
      def setPriority(value: String): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
      
      @scala.inline
      def setRawContent(value: String): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
      
      @scala.inline
      def setSilentPush(value: Boolean): Self = StObject.set(x, "SilentPush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentPushUndefined: Self = StObject.set(x, "SilentPush", js.undefined)
      
      @scala.inline
      def setSound(value: String): Self = StObject.set(x, "Sound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSoundUndefined: Self = StObject.set(x, "Sound", js.undefined)
      
      @scala.inline
      def setSubstitutions(
        value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
      
      @scala.inline
      def setThreadId(value: String): Self = StObject.set(x, "ThreadId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThreadIdUndefined: Self = StObject.set(x, "ThreadId", js.undefined)
      
      @scala.inline
      def setTimeToLive(value: Double): Self = StObject.set(x, "TimeToLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeToLiveUndefined: Self = StObject.set(x, "TimeToLive", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledAPNSMessage extends APNSMessage {
    
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    @JSName("Data")
    var Data_UnmarshalledAPNSMessage: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledAPNSMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  }
  object UnmarshalledAPNSMessage {
    
    @scala.inline
    def apply(): UnmarshalledAPNSMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledAPNSMessage]
    }
    
    @scala.inline
    implicit class UnmarshalledAPNSMessageMutableBuilder[Self <: UnmarshalledAPNSMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: StringDictionary[String]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      @scala.inline
      def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
