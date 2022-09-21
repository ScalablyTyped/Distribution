package typings.ansiToHtmlX9bQETxB

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ansi-to-html", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Convert {
    def this(options: ConverterOptions) = this()
    
    /* CompleteClass */
    override def toHtml(data: String): String = js.native
  }
  
  trait Convert extends StObject {
    
    def toHtml(data: String): String
  }
  object Convert {
    
    inline def apply(toHtml: String => String): Convert = {
      val __obj = js.Dynamic.literal(toHtml = js.Any.fromFunction1(toHtml))
      __obj.asInstanceOf[Convert]
    }
    
    extension [Self <: Convert](x: Self) {
      
      inline def setToHtml(value: String => String): Self = StObject.set(x, "toHtml", js.Any.fromFunction1(value))
    }
  }
  
  trait ConverterOptions extends StObject {
    
    /** The default background color used when reset color codes are encountered. */
    var bg: js.UndefOr[String] = js.undefined
    
    /** Can override specific colors or the entire ANSI palette. */
    var colors: js.UndefOr[js.Array[String] | NumberDictionary[String]] = js.undefined
    
    /** Generate HTML/XML entities. */
    var escapeXML: js.UndefOr[Boolean] = js.undefined
    
    /** The default foreground color used when reset color codes are encountered. */
    var fg: js.UndefOr[String] = js.undefined
    
    /** Convert newline characters to `<br/>`. */
    var newline: js.UndefOr[Boolean] = js.undefined
    
    /** Save style state across invocations of `toHtml()`. */
    var stream: js.UndefOr[Boolean] = js.undefined
  }
  object ConverterOptions {
    
    inline def apply(): ConverterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConverterOptions]
    }
    
    extension [Self <: ConverterOptions](x: Self) {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      inline def setColors(value: js.Array[String] | NumberDictionary[String]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setEscapeXML(value: Boolean): Self = StObject.set(x, "escapeXML", value.asInstanceOf[js.Any])
      
      inline def setEscapeXMLUndefined: Self = StObject.set(x, "escapeXML", js.undefined)
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      inline def setNewline(value: Boolean): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
      
      inline def setNewlineUndefined: Self = StObject.set(x, "newline", js.undefined)
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
      
      inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    }
  }
}
