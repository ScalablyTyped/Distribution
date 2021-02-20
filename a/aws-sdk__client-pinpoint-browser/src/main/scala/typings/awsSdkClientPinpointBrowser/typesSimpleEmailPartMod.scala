package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSimpleEmailPartMod {
  
  @js.native
  trait SimpleEmailPart extends StObject {
    
    /**
      * The character set of the content.
      */
    var Charset: js.UndefOr[String] = js.native
    
    /**
      * The textual data of the content.
      */
    var Data: js.UndefOr[String] = js.native
  }
  object SimpleEmailPart {
    
    @scala.inline
    def apply(): SimpleEmailPart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleEmailPart]
    }
    
    @scala.inline
    implicit class SimpleEmailPartMutableBuilder[Self <: SimpleEmailPart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "Charset", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    }
  }
  
  type UnmarshalledSimpleEmailPart = SimpleEmailPart
}
