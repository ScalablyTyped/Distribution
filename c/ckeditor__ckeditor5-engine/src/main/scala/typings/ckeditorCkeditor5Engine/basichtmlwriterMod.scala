package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.htmlwriterMod.HtmlWriter
import typings.std.DocumentFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basichtmlwriterMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/dataprocessor/basichtmlwriter", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BasicHtmlWriter {
    
    /* CompleteClass */
    override def getHtml(fragment: DocumentFragment): String = js.native
  }
  
  trait BasicHtmlWriter
    extends StObject
       with HtmlWriter
  object BasicHtmlWriter {
    
    inline def apply(getHtml: DocumentFragment => String): BasicHtmlWriter = {
      val __obj = js.Dynamic.literal(getHtml = js.Any.fromFunction1(getHtml))
      __obj.asInstanceOf[BasicHtmlWriter]
    }
  }
}
