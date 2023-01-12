package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DEEP_LINK
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPEN_APP
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAdmmessageMod {
  
  trait ADMMessage extends StObject {
    
    /**
      * The action that occurs if the user taps a push notification delivered by the campaign: OPEN_APP - Your app launches, or it becomes the foreground app if it has been sent to the background. This is the default action. DEEP_LINK - Uses deep linking features in iOS and Android to open your app and display a designated user interface within the app. URL - The default mobile browser on the user's device launches and opens a web page at the URL you specify. Possible values include: OPEN_APP | DEEP_LINK | URL
      */
    var Action: js.UndefOr[OPEN_APP | DEEP_LINK | URL | String] = js.undefined
    
    /**
      * The message body of the notification.
      */
    var Body: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. Arbitrary string used to indicate multiple messages are logically the same and that ADM is allowed to drop previously enqueued messages in favor of this one.
      */
    var ConsolidationKey: js.UndefOr[String] = js.undefined
    
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    var Data: js.UndefOr[StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])] = js.undefined
    
    /**
      * Optional. Number of seconds ADM should retain the message if the device is offline
      */
    var ExpiresAfter: js.UndefOr[String] = js.undefined
    
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
      * Optional. Base-64-encoded MD5 checksum of the data parameter. Used to verify data integrity
      */
    var MD5: js.UndefOr[String] = js.undefined
    
    /**
      * The Raw JSON formatted string to be used as the payload. This value overrides the message.
      */
    var RawContent: js.UndefOr[String] = js.undefined
    
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
      * The message title that displays above the message on the user's device.
      */
    var Title: js.UndefOr[String] = js.undefined
    
    /**
      * The URL to open in the user's mobile browser. Used if the value for Action is URL.
      */
    var Url: js.UndefOr[String] = js.undefined
  }
  object ADMMessage {
    
    inline def apply(): ADMMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ADMMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ADMMessage] (val x: Self) extends AnyVal {
      
      inline def setAction(value: OPEN_APP | DEEP_LINK | URL | String): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setConsolidationKey(value: String): Self = StObject.set(x, "ConsolidationKey", value.asInstanceOf[js.Any])
      
      inline def setConsolidationKeyUndefined: Self = StObject.set(x, "ConsolidationKey", js.undefined)
      
      inline def setData(value: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setExpiresAfter(value: String): Self = StObject.set(x, "ExpiresAfter", value.asInstanceOf[js.Any])
      
      inline def setExpiresAfterUndefined: Self = StObject.set(x, "ExpiresAfter", js.undefined)
      
      inline def setIconReference(value: String): Self = StObject.set(x, "IconReference", value.asInstanceOf[js.Any])
      
      inline def setIconReferenceUndefined: Self = StObject.set(x, "IconReference", js.undefined)
      
      inline def setImageIconUrl(value: String): Self = StObject.set(x, "ImageIconUrl", value.asInstanceOf[js.Any])
      
      inline def setImageIconUrlUndefined: Self = StObject.set(x, "ImageIconUrl", js.undefined)
      
      inline def setImageUrl(value: String): Self = StObject.set(x, "ImageUrl", value.asInstanceOf[js.Any])
      
      inline def setImageUrlUndefined: Self = StObject.set(x, "ImageUrl", js.undefined)
      
      inline def setMD5(value: String): Self = StObject.set(x, "MD5", value.asInstanceOf[js.Any])
      
      inline def setMD5Undefined: Self = StObject.set(x, "MD5", js.undefined)
      
      inline def setRawContent(value: String): Self = StObject.set(x, "RawContent", value.asInstanceOf[js.Any])
      
      inline def setRawContentUndefined: Self = StObject.set(x, "RawContent", js.undefined)
      
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
      
      inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    }
  }
  
  trait UnmarshalledADMMessage
    extends StObject
       with ADMMessage {
    
    /**
      * The data payload used for a silent push. This payload is added to the notifications' data.pinpoint.jsonBody' object
      */
    @JSName("Data")
    var Data_UnmarshalledADMMessage: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledADMMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object UnmarshalledADMMessage {
    
    inline def apply(): UnmarshalledADMMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledADMMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledADMMessage] (val x: Self) extends AnyVal {
      
      inline def setData(value: StringDictionary[String]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
      
      inline def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
