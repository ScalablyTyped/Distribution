package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignEmailMessage extends StObject {
  
  /**
    * The body of the email for recipients whose email clients don't render HTML content.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * The verified email address to send the email from. The default address is the FromAddress specified for the email channel for the application.
    */
  var FromAddress: js.UndefOr[string] = js.native
  
  /**
    * The body of the email, in HTML format, for recipients whose email clients render HTML content.
    */
  var HtmlBody: js.UndefOr[string] = js.native
  
  /**
    * The subject line, or title, of the email.
    */
  var Title: js.UndefOr[string] = js.native
}
object CampaignEmailMessage {
  
  @scala.inline
  def apply(): CampaignEmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignEmailMessage]
  }
  
  @scala.inline
  implicit class CampaignEmailMessageMutableBuilder[Self <: CampaignEmailMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setFromAddress(value: string): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
    
    @scala.inline
    def setHtmlBody(value: string): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlBodyUndefined: Self = StObject.set(x, "HtmlBody", js.undefined)
    
    @scala.inline
    def setTitle(value: string): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
