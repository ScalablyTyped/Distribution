package typings.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSimpleEmailPartMod {
  
  trait SimpleEmailPart extends StObject {
    
    /**
      * The character set of the content.
      */
    var Charset: js.UndefOr[String] = js.undefined
    
    /**
      * The textual data of the content.
      */
    var Data: js.UndefOr[String] = js.undefined
  }
  object SimpleEmailPart {
    
    inline def apply(): SimpleEmailPart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SimpleEmailPart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleEmailPart] (val x: Self) extends AnyVal {
      
      inline def setCharset(value: String): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "Charset", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    }
  }
  
  type UnmarshalledSimpleEmailPart = SimpleEmailPart
}
