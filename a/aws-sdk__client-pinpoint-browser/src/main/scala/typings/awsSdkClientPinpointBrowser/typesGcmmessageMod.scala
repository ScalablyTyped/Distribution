package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGcmmessageMod {
  
  trait GCMMessage extends StObject {
    
    /**
      * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
      */
    var Action: js.UndefOr[OPEN_APP | DEEP_LINK | URL | String] = js.undefined
    
    /**
      * The message body of the notification.
      */
    var Body: js.UndefOr[String] = js.undefined
    
    /**
      * This parameter identifies a group of messages (e.g., with collapse_key: "Updates Available") that can be collapsed, so that only the last message gets sent when delivery can be resumed. This is intended to avoid sending too many of the same messages when the device comes back online or becomes active.
      */
    var CollapseKey: js.UndefOr[String] = js.undefined
    
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    var Data: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * The icon image name of the asset saved in your application.
      */
    var IconReference: js.UndefOr[String] = js.undefined
    
    /**
      * The URL that points to an image used as the large icon to the notification content view.
      */
    var ImageIconUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The URL that points to an image used in the push notification.
      */
    var ImageUrl: js.UndefOr[String] = js.undefined
    
    /**
      * The message priority. Amazon Pinpoint uses this value to set the FCM or GCM priority parameter when it sends the message. Accepts the following values:
      *
      * "Normal" - Messages might be delayed. Delivery is optimized for battery usage on the receiving device. Use normal priority unless immediate delivery is required.
      *
      * "High" - Messages are sent immediately and might wake a sleeping device.
      *
      * The equivalent values for APNs messages are "5" and "10". Amazon Pinpoint accepts these values here and converts them.
      *
      * For more information, see About FCM Messages in the Firebase documentation.
      */
    var Priority: js.UndefOr[String] = js.undefined
    
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[String] = js.undefined
    
    /**
      * This parameter specifies the package name of the application where the registration tokens must match in order to receive the message.
      */
    var RestrictedPackageName: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates if the message should display on the users device. Silent pushes can be used for Remote Configuration and Phone Home use cases.
      */
    var SilentPush: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The URL that points to an image used as the small icon for the notification which will be used to represent the notification in the status bar and content view
      */
    var SmallImageIconUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates a sound to play when the device receives the notification. Supports default, or the filename of a sound resource bundled in the app. Android sound files must reside in /res/raw/
      */
    var Sound: js.UndefOr[String] = js.undefined
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[
        (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
      ] = js.undefined
    
    /**
      * The length of time (in seconds) that FCM or GCM stores and attempts to deliver the message. If unspecified, the value defaults to the maximum, which is 2,419,200 seconds (28 days). Amazon Pinpoint uses this value to set the FCM or GCM time_to_live parameter.
      */
    var TimeToLive: js.UndefOr[Double] = js.undefined
    
    /**
      * The message title that displays above the message on the user's device.
      */
    var Title: js.UndefOr[String] = js.undefined
    
    /**
      * The URL to open in the user's mobile browser. Used if the value for Action is URL.
      */
    var Url: js.UndefOr[String] = js.undefined
  }
  object GCMMessage {
    
    inline def apply(): GCMMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GCMMessage]
    }
    
    extension [Self <: GCMMessage](x: Self) {
      
      inline def setAction(value: OPEN_APP | DEEP_LINK | URL | String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setCollapseKey(value: String): Self = StObject.set(x, "CollapseKey", value.asInstanceOf[js.Any])
      
      inline def setCollapseKeyUndefined: Self = StObject.set(x, "CollapseKey", js.undefined)
      
      inline def setData(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setIconReference(value: String): Self = StObject.set(x, "IconReference", value.asInstanceOf[js.Any])
      
      inline def setIconReferenceUndefined: Self = StObject.set(x, "IconReference", js.undefined)
      
      inline def setImageIconUrl(value: String): Self = StObject.set(x, "ImageIconUrl", value.asInstanceOf[js.Any])
      
      inline def setImageIconUrlUndefined: Self = StObject.set(x, "ImageIconUrl", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
      
      inline def setPriority(value: String): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
      
      inline def setRawContent(value: String): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
      
      inline def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
      
      inline def setRestrictedPackageName(value: String): Self = StObject.set(x, "RestrictedPackageName", value.asInstanceOf[js.Any])
      
      inline def setRestrictedPackageNameUndefined: Self = StObject.set(x, "RestrictedPackageName", js.undefined)
      
      inline def setSilentPush(value: Boolean): Self = StObject.set(x, "SilentPush", value.asInstanceOf[js.Any])
      
      inline def setSilentPushUndefined: Self = StObject.set(x, "SilentPush", js.undefined)
      
      inline def setSmallImageIconUrl(value: String): Self = StObject.set(x, "SmallImageIconUrl", value.asInstanceOf[js.Any])
      
      inline def setSmallImageIconUrlUndefined: Self = StObject.set(x, "SmallImageIconUrl", js.undefined)
      
      inline def setSound(value: String): Self = StObject.set(x, "Sound", value.asInstanceOf[js.Any])
      
      inline def setSoundUndefined: Self = StObject.set(x, "Sound", js.undefined)
      
      inline def setSubstitutions(
        value: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
      
      inline def setTimeToLive(value: Double): Self = StObject.set(x, "TimeToLive", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveUndefined: Self = StObject.set(x, "TimeToLive", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    }
  }
  
  trait UnmarshalledGCMMessage
    extends StObject
       with GCMMessage {
    
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    @JSName("Data")
    var Data_UnmarshalledGCMMessage: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledGCMMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object UnmarshalledGCMMessage {
    
    inline def apply(): UnmarshalledGCMMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGCMMessage]
    }
    
    extension [Self <: UnmarshalledGCMMessage](x: Self) {
      
      inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
