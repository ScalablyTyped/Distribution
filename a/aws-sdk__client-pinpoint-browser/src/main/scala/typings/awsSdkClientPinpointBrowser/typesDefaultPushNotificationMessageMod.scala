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

object typesDefaultPushNotificationMessageMod {
  
  @js.native
  trait DefaultPushNotificationMessage extends StObject {
    
    /**
      * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
      */
    var Action: js.UndefOr[OPEN_APP | DEEP_LINK | URL | String] = js.native
    
    /**
      * The message body of the notification.
      */
    var Body: js.UndefOr[String] = js.native
    
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    var Data: js.UndefOr[StringDictionary[String] | (Iterable[js.Tuple2[String, String]])] = js.native
    
    /**
      * Indicates if the message should display on the recipient's device. You can use silent pushes for remote configuration or to deliver messages to in-app notification centers.
      */
    var SilentPush: js.UndefOr[Boolean] = js.native
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[
        (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ] = js.native
    
    /**
      * The message title that displays above the message on the user's device.
      */
    var Title: js.UndefOr[String] = js.native
    
    /**
      * The URL to open in the user's mobile browser. Used if the value for Action is URL.
      */
    var Url: js.UndefOr[String] = js.native
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
      def setAction(value: OPEN_APP | DEEP_LINK | URL | String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setData(value: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      @scala.inline
      def setSilentPush(value: Boolean): Self = StObject.set(x, "SilentPush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentPushUndefined: Self = StObject.set(x, "SilentPush", js.undefined)
      
      @scala.inline
      def setSubstitutions(
        value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
      
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
  trait UnmarshalledDefaultPushNotificationMessage extends DefaultPushNotificationMessage {
    
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    @JSName("Data")
    var Data_UnmarshalledDefaultPushNotificationMessage: js.UndefOr[StringDictionary[String]] = js.native
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledDefaultPushNotificationMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  }
  object UnmarshalledDefaultPushNotificationMessage {
    
    @scala.inline
    def apply(): UnmarshalledDefaultPushNotificationMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledDefaultPushNotificationMessage]
    }
    
    @scala.inline
    implicit class UnmarshalledDefaultPushNotificationMessageMutableBuilder[Self <: UnmarshalledDefaultPushNotificationMessage] (val x: Self) extends AnyVal {
      
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
