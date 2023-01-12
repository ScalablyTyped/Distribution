package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesRawEmailMod.RawEmail
import typings.awsSdkClientPinpointBrowser.typesRawEmailMod.UnmarshalledRawEmail
import typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod.SimpleEmail
import typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod.UnmarshalledSimpleEmail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEmailMessageMod {
  
  trait EmailMessage extends StObject {
    
    /**
      * The body of the email message.
      */
    var Body: js.UndefOr[String] = js.undefined
    
    /**
      * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled.
      */
    var FeedbackForwardingAddress: js.UndefOr[String] = js.undefined
    
    /**
      * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
      */
    var FromAddress: js.UndefOr[String] = js.undefined
    
    /**
      * An email represented as a raw MIME message.
      */
    var RawEmail: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesRawEmailMod.RawEmail] = js.undefined
    
    /**
      * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
      */
    var ReplyToAddresses: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * An email composed of a subject, a text part and a html part.
      */
    var SimpleEmail: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod.SimpleEmail] = js.undefined
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[
        (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
      ] = js.undefined
  }
  object EmailMessage {
    
    inline def apply(): EmailMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailMessage] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setFeedbackForwardingAddress(value: String): Self = StObject.set(x, "FeedbackForwardingAddress", value.asInstanceOf[js.Any])
      
      inline def setFeedbackForwardingAddressUndefined: Self = StObject.set(x, "FeedbackForwardingAddress", js.undefined)
      
      inline def setFromAddress(value: String): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
      
      inline def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
      
      inline def setRawEmail(value: RawEmail): Self = StObject.set(x, "RawEmail", value.asInstanceOf[js.Any])
      
      inline def setRawEmailUndefined: Self = StObject.set(x, "RawEmail", js.undefined)
      
      inline def setReplyToAddresses(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "ReplyToAddresses", value.asInstanceOf[js.Any])
      
      inline def setReplyToAddressesUndefined: Self = StObject.set(x, "ReplyToAddresses", js.undefined)
      
      inline def setReplyToAddressesVarargs(value: String*): Self = StObject.set(x, "ReplyToAddresses", js.Array(value*))
      
      inline def setSimpleEmail(value: SimpleEmail): Self = StObject.set(x, "SimpleEmail", value.asInstanceOf[js.Any])
      
      inline def setSimpleEmailUndefined: Self = StObject.set(x, "SimpleEmail", js.undefined)
      
      inline def setSubstitutions(
        value: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
  
  trait UnmarshalledEmailMessage
    extends StObject
       with EmailMessage {
    
    /**
      * An email represented as a raw MIME message.
      */
    @JSName("RawEmail")
    var RawEmail_UnmarshalledEmailMessage: js.UndefOr[UnmarshalledRawEmail] = js.undefined
    
    /**
      * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
      */
    @JSName("ReplyToAddresses")
    var ReplyToAddresses_UnmarshalledEmailMessage: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An email composed of a subject, a text part and a html part.
      */
    @JSName("SimpleEmail")
    var SimpleEmail_UnmarshalledEmailMessage: js.UndefOr[UnmarshalledSimpleEmail] = js.undefined
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledEmailMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object UnmarshalledEmailMessage {
    
    inline def apply(): UnmarshalledEmailMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEmailMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledEmailMessage] (val x: Self) extends AnyVal {
      
      inline def setRawEmail(value: UnmarshalledRawEmail): Self = StObject.set(x, "RawEmail", value.asInstanceOf[js.Any])
      
      inline def setRawEmailUndefined: Self = StObject.set(x, "RawEmail", js.undefined)
      
      inline def setReplyToAddresses(value: js.Array[String]): Self = StObject.set(x, "ReplyToAddresses", value.asInstanceOf[js.Any])
      
      inline def setReplyToAddressesUndefined: Self = StObject.set(x, "ReplyToAddresses", js.undefined)
      
      inline def setReplyToAddressesVarargs(value: String*): Self = StObject.set(x, "ReplyToAddresses", js.Array(value*))
      
      inline def setSimpleEmail(value: UnmarshalledSimpleEmail): Self = StObject.set(x, "SimpleEmail", value.asInstanceOf[js.Any])
      
      inline def setSimpleEmailUndefined: Self = StObject.set(x, "SimpleEmail", js.undefined)
      
      inline def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
