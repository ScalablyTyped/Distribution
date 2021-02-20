package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesRawEmailMod.RawEmail
import typings.awsSdkClientPinpointBrowser.typesRawEmailMod.UnmarshalledRawEmail
import typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod.SimpleEmail
import typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod.UnmarshalledSimpleEmail
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEmailMessageMod {
  
  @js.native
  trait EmailMessage extends StObject {
    
    /**
      * The body of the email message.
      */
    var Body: js.UndefOr[String] = js.native
    
    /**
      * The email address that bounces and complaints will be forwarded to when feedback forwarding is enabled.
      */
    var FeedbackForwardingAddress: js.UndefOr[String] = js.native
    
    /**
      * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
      */
    var FromAddress: js.UndefOr[String] = js.native
    
    /**
      * An email represented as a raw MIME message.
      */
    var RawEmail: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesRawEmailMod.RawEmail] = js.native
    
    /**
      * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
      */
    var ReplyToAddresses: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
    
    /**
      * An email composed of a subject, a text part and a html part.
      */
    var SimpleEmail: js.UndefOr[typings.awsSdkClientPinpointBrowser.typesSimpleEmailMod.SimpleEmail] = js.native
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[
        (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ] = js.native
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
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setFeedbackForwardingAddress(value: String): Self = StObject.set(x, "FeedbackForwardingAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeedbackForwardingAddressUndefined: Self = StObject.set(x, "FeedbackForwardingAddress", js.undefined)
      
      @scala.inline
      def setFromAddress(value: String): Self = StObject.set(x, "FromAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromAddressUndefined: Self = StObject.set(x, "FromAddress", js.undefined)
      
      @scala.inline
      def setRawEmail(value: RawEmail): Self = StObject.set(x, "RawEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawEmailUndefined: Self = StObject.set(x, "RawEmail", js.undefined)
      
      @scala.inline
      def setReplyToAddresses(value: js.Array[String] | Iterable[String]): Self = StObject.set(x, "ReplyToAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToAddressesUndefined: Self = StObject.set(x, "ReplyToAddresses", js.undefined)
      
      @scala.inline
      def setReplyToAddressesVarargs(value: String*): Self = StObject.set(x, "ReplyToAddresses", js.Array(value :_*))
      
      @scala.inline
      def setSimpleEmail(value: SimpleEmail): Self = StObject.set(x, "SimpleEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleEmailUndefined: Self = StObject.set(x, "SimpleEmail", js.undefined)
      
      @scala.inline
      def setSubstitutions(
        value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledEmailMessage extends EmailMessage {
    
    /**
      * An email represented as a raw MIME message.
      */
    @JSName("RawEmail")
    var RawEmail_UnmarshalledEmailMessage: js.UndefOr[UnmarshalledRawEmail] = js.native
    
    /**
      * The reply-to email address(es) for the email. If the recipient replies to the email, each reply-to address will receive the reply.
      */
    @JSName("ReplyToAddresses")
    var ReplyToAddresses_UnmarshalledEmailMessage: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * An email composed of a subject, a text part and a html part.
      */
    @JSName("SimpleEmail")
    var SimpleEmail_UnmarshalledEmailMessage: js.UndefOr[UnmarshalledSimpleEmail] = js.native
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledEmailMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.native
  }
  object UnmarshalledEmailMessage {
    
    @scala.inline
    def apply(): UnmarshalledEmailMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledEmailMessage]
    }
    
    @scala.inline
    implicit class UnmarshalledEmailMessageMutableBuilder[Self <: UnmarshalledEmailMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRawEmail(value: UnmarshalledRawEmail): Self = StObject.set(x, "RawEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawEmailUndefined: Self = StObject.set(x, "RawEmail", js.undefined)
      
      @scala.inline
      def setReplyToAddresses(value: js.Array[String]): Self = StObject.set(x, "ReplyToAddresses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplyToAddressesUndefined: Self = StObject.set(x, "ReplyToAddresses", js.undefined)
      
      @scala.inline
      def setReplyToAddressesVarargs(value: String*): Self = StObject.set(x, "ReplyToAddresses", js.Array(value :_*))
      
      @scala.inline
      def setSimpleEmail(value: UnmarshalledSimpleEmail): Self = StObject.set(x, "SimpleEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleEmailUndefined: Self = StObject.set(x, "SimpleEmail", js.undefined)
      
      @scala.inline
      def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
