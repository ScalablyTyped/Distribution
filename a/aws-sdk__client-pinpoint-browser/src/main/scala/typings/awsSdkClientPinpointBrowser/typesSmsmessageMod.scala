package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROMOTIONAL
import typings.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TRANSACTIONAL
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSmsmessageMod {
  
  trait SMSMessage extends StObject {
    
    /**
      * The body of the SMS message.
      */
    var Body: js.UndefOr[String] = js.undefined
    
    /**
      * The SMS program name that you provided to AWS Support when you requested your dedicated number.
      */
    var Keyword: js.UndefOr[String] = js.undefined
    
    /**
      * Is this a transaction priority message or lower priority.
      */
    var MessageType: js.UndefOr[TRANSACTIONAL | PROMOTIONAL | String] = js.undefined
    
    /**
      * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes that you requested from AWS Support and that is assigned to your account. If this attribute is not specified, Amazon Pinpoint randomly assigns a long code.
      */
    var OriginationNumber: js.UndefOr[String] = js.undefined
    
    /**
      * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by country or region.
      */
    var SenderId: js.UndefOr[String] = js.undefined
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[
        (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ] = js.undefined
  }
  object SMSMessage {
    
    @scala.inline
    def apply(): SMSMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SMSMessage]
    }
    
    @scala.inline
    implicit class SMSMessageMutableBuilder[Self <: SMSMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      @scala.inline
      def setKeyword(value: String): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordUndefined: Self = StObject.set(x, "Keyword", js.undefined)
      
      @scala.inline
      def setMessageType(value: TRANSACTIONAL | PROMOTIONAL | String): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
      
      @scala.inline
      def setOriginationNumber(value: String): Self = StObject.set(x, "OriginationNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginationNumberUndefined: Self = StObject.set(x, "OriginationNumber", js.undefined)
      
      @scala.inline
      def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
      
      @scala.inline
      def setSubstitutions(
        value: (StringDictionary[js.Array[String] | Iterable[String]]) | (Iterable[js.Tuple2[String, js.Array[String] | Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
  
  trait UnmarshalledSMSMessage
    extends StObject
       with SMSMessage {
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledSMSMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object UnmarshalledSMSMessage {
    
    @scala.inline
    def apply(): UnmarshalledSMSMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSMSMessage]
    }
    
    @scala.inline
    implicit class UnmarshalledSMSMessageMutableBuilder[Self <: UnmarshalledSMSMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
