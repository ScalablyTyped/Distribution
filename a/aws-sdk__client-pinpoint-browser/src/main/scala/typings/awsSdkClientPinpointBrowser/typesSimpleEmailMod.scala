package typings.awsSdkClientPinpointBrowser

import typings.awsSdkClientPinpointBrowser.typesSimpleEmailPartMod.SimpleEmailPart
import typings.awsSdkClientPinpointBrowser.typesSimpleEmailPartMod.UnmarshalledSimpleEmailPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSimpleEmailMod {
  
  @js.native
  trait SimpleEmail extends StObject {
    
    /**
      * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
      */
    var HtmlPart: js.UndefOr[SimpleEmailPart] = js.native
    
    /**
      * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
      */
    var Subject: js.UndefOr[SimpleEmailPart] = js.native
    
    /**
      * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
      */
    var TextPart: js.UndefOr[SimpleEmailPart] = js.native
  }
  object SimpleEmail {
    
    @scala.inline
    def apply(): SimpleEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleEmail]
    }
    
    @scala.inline
    implicit class SimpleEmailMutableBuilder[Self <: SimpleEmail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtmlPart(value: SimpleEmailPart): Self = StObject.set(x, "HtmlPart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlPartUndefined: Self = StObject.set(x, "HtmlPart", js.undefined)
      
      @scala.inline
      def setSubject(value: SimpleEmailPart): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
      
      @scala.inline
      def setTextPart(value: SimpleEmailPart): Self = StObject.set(x, "TextPart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPartUndefined: Self = StObject.set(x, "TextPart", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledSimpleEmail extends SimpleEmail {
    
    /**
      * The content of the message, in HTML format. Use this for email clients that can process HTML. You can include clickable links, formatted text, and much more in an HTML message.
      */
    @JSName("HtmlPart")
    var HtmlPart_UnmarshalledSimpleEmail: js.UndefOr[UnmarshalledSimpleEmailPart] = js.native
    
    /**
      * The subject of the message: A short summary of the content, which will appear in the recipient's inbox.
      */
    @JSName("Subject")
    var Subject_UnmarshalledSimpleEmail: js.UndefOr[UnmarshalledSimpleEmailPart] = js.native
    
    /**
      * The content of the message, in text format. Use this for text-based email clients, or clients on high-latency networks (such as mobile devices).
      */
    @JSName("TextPart")
    var TextPart_UnmarshalledSimpleEmail: js.UndefOr[UnmarshalledSimpleEmailPart] = js.native
  }
  object UnmarshalledSimpleEmail {
    
    @scala.inline
    def apply(): UnmarshalledSimpleEmail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSimpleEmail]
    }
    
    @scala.inline
    implicit class UnmarshalledSimpleEmailMutableBuilder[Self <: UnmarshalledSimpleEmail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtmlPart(value: UnmarshalledSimpleEmailPart): Self = StObject.set(x, "HtmlPart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlPartUndefined: Self = StObject.set(x, "HtmlPart", js.undefined)
      
      @scala.inline
      def setSubject(value: UnmarshalledSimpleEmailPart): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
      
      @scala.inline
      def setTextPart(value: UnmarshalledSimpleEmailPart): Self = StObject.set(x, "TextPart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPartUndefined: Self = StObject.set(x, "TextPart", js.undefined)
    }
  }
}
