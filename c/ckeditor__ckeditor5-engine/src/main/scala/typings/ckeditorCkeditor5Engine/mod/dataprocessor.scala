package typings.ckeditorCkeditor5Engine.mod

import typings.ckeditorCkeditor5Engine.mod.model.DocumentFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataprocessor {
  
  // engine/dataprocessor/basichtmlwriter
  @JSImport("@ckeditor/ckeditor5-engine", "dataprocessor.BasicHtmlWriter")
  @js.native
  class BasicHtmlWriter () extends HtmlWriter
  
  // engine/dataprocessor/htmldataprocessor
  @JSImport("@ckeditor/ckeditor5-engine", "dataprocessor.HtmlDataProcessor")
  @js.native
  class HtmlDataProcessor () extends DataProcessor
  
  // engine/dataprocessor/xmldataprocessor
  @JSImport("@ckeditor/ckeditor5-engine", "dataprocessor.XmlDataProcessor")
  @js.native
  class XmlDataProcessor () extends DataProcessor
  
  // engine/dataprocessor/dataprocessor
  @js.native
  trait DataProcessor extends StObject
  
  // engine/dataprocessor/htmlwriter
  @js.native
  trait HtmlWriter extends StObject {
    
    def getHtml(fragment: DocumentFragment): String = js.native
  }
  object HtmlWriter {
    
    @scala.inline
    def apply(getHtml: DocumentFragment => String): HtmlWriter = {
      val __obj = js.Dynamic.literal(getHtml = js.Any.fromFunction1(getHtml))
      __obj.asInstanceOf[HtmlWriter]
    }
    
    @scala.inline
    implicit class HtmlWriterMutableBuilder[Self <: HtmlWriter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetHtml(value: DocumentFragment => String): Self = StObject.set(x, "getHtml", js.Any.fromFunction1(value))
    }
  }
}
