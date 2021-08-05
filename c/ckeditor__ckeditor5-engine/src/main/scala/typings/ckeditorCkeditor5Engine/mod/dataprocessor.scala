package typings.ckeditorCkeditor5Engine.mod

import typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataprocessor {
  
  // engine/dataprocessor/basichtmlwriter
  @JSImport("@ckeditor/ckeditor5-engine", "dataprocessor.BasicHtmlWriter")
  @js.native
  class BasicHtmlWriter ()
    extends StObject
       with HtmlWriter {
    
    /* CompleteClass */
    override def getHtml(fragment: DocumentFragment): String = js.native
  }
  
  // engine/dataprocessor/htmldataprocessor
  @JSImport("@ckeditor/ckeditor5-engine", "dataprocessor.HtmlDataProcessor")
  @js.native
  class HtmlDataProcessor ()
    extends StObject
       with DataProcessor
  
  // engine/dataprocessor/xmldataprocessor
  @JSImport("@ckeditor/ckeditor5-engine", "dataprocessor.XmlDataProcessor")
  @js.native
  class XmlDataProcessor ()
    extends StObject
       with DataProcessor
  
  // engine/dataprocessor/dataprocessor
  trait DataProcessor extends StObject
  
  // engine/dataprocessor/htmlwriter
  trait HtmlWriter extends StObject {
    
    def getHtml(fragment: DocumentFragment): String
  }
  object HtmlWriter {
    
    inline def apply(getHtml: DocumentFragment => String): HtmlWriter = {
      val __obj = js.Dynamic.literal(getHtml = js.Any.fromFunction1(getHtml))
      __obj.asInstanceOf[HtmlWriter]
    }
    
    extension [Self <: HtmlWriter](x: Self) {
      
      inline def setGetHtml(value: DocumentFragment => String): Self = StObject.set(x, "getHtml", js.Any.fromFunction1(value))
    }
  }
}
