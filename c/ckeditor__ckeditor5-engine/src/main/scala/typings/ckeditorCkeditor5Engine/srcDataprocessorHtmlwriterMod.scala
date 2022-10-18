package typings.ckeditorCkeditor5Engine

import typings.std.DocumentFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDataprocessorHtmlwriterMod {
  
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
