package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailMessage extends StObject {
  
  /**
    * The body of the email message.
    */
  var Body: js.UndefOr[string] = js.undefined
  
  /**
    * The email address to forward bounces and complaints to, if feedback forwarding is enabled.
    */
  var FeedbackForwardingAddress: js.UndefOr[string] = js.undefined
  
  /**
    * The verified email address to send the email message from. The default value is the FromAddress specified for the email channel.
    */
  var FromAddress: js.UndefOr[string] = js.undefined
  
  /**
    * The email message, represented as a raw MIME message.
    */
  var RawEmail: js.UndefOr[typings.awsSdk.pinpointMod.RawEmail] = js.undefined
  
  /**
    * The reply-to email address(es) for the email message. If a recipient replies to the email, each reply-to address receives the reply.
    */
  var ReplyToAddresses: js.UndefOr[ListOfString] = js.undefined
  
  /**
    * The email message, composed of a subject, a text part, and an HTML part.
    */
  var SimpleEmail: js.UndefOr[typings.awsSdk.pinpointMod.SimpleEmail] = js.undefined
  
  /**
    * The default message variables to use in the email message. You can override the default variables with individual address variables.
    */
  var Substitutions: js.UndefOr[MapOfListOfString] = js.undefined
}
object EmailMessage {
  
  @scala.inline
  def apply(): EmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailMessage]
  }
  
  @scala.inline
  implicit class EmailMessageMutableBuilder[Self <: EmailMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
    
    @scala.inline
    def setFeedbackForwardingAddress(value: string): Self = StObject.set(x, "FeedbackForwardingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedbackForwardingAddressUndefined: Self = StObject.set(x, "FeedbackForwardingAddress", js.undefined)
    
    @scala.inline
    def setFromAddress(value: string): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
    
    @scala.inline
    def setRawEmail(value: RawEmail): Self = StObject.set(x, "RawEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawEmailUndefined: Self = StObject.set(x, "RawEmail", js.undefined)
    
    @scala.inline
    def setReplyToAddresses(value: ListOfString): Self = StObject.set(x, "ReplyToAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToAddressesUndefined: Self = StObject.set(x, "ReplyToAddresses", js.undefined)
    
    @scala.inline
    def setReplyToAddressesVarargs(value: string*): Self = StObject.set(x, "ReplyToAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSimpleEmail(value: SimpleEmail): Self = StObject.set(x, "SimpleEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleEmailUndefined: Self = StObject.set(x, "SimpleEmail", js.undefined)
    
    @scala.inline
    def setSubstitutions(value: MapOfListOfString): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
  }
}
