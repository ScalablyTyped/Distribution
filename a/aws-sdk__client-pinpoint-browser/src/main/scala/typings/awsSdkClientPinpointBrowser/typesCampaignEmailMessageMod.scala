package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCampaignEmailMessageMod {
  
  trait CampaignEmailMessage extends StObject {
    
    /**
      * The email text body.
      */
    var Body: js.UndefOr[String] = js.undefined
    
    /**
      * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
      */
    var FromAddress: js.UndefOr[String] = js.undefined
    
    /**
      * The email html body.
      */
    var HtmlBody: js.UndefOr[String] = js.undefined
    
    /**
      * The email title (Or subject).
      */
    var Title: js.UndefOr[String] = js.undefined
  }
  object CampaignEmailMessage {
    
    inline def apply(): CampaignEmailMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CampaignEmailMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CampaignEmailMessage] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setFromAddress(value: String): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
      
      inline def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
      
      inline def setHtmlBody(value: String): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
      
      inline def setHtmlBodyUndefined: Self = StObject.set(x, "HtmlBody", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  type UnmarshalledCampaignEmailMessage = CampaignEmailMessage
}
