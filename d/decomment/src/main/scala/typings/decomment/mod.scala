package typings.decomment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(code: String): String = ^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(code: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("decomment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns End-of-Line string used within the text, based on the occurrence frequency:
    * - \n - for Unix-encoded text
    * - \r\n - for Windows-encoded text
    */
  inline def getEOL(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEOL")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Unlike the default decomment method, it instructs the library not to parse
    * or validate the input in any way, rather assume it to be HTML,
    * and remove all <!-- comment --> entries from it according to the options.
    */
  inline def html(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def html(html: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Unlike the default decomment, it instructs the library that text is not a JSON,
    * JavaScript or HTML, rather a plain text that needs no parsing or validation,
    * only to remove \/\/ and \/ **\/ comments from it according to the options.
    */
  inline def text(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def text(text: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
      * Takes either a single or an array of regular expressions to match against.
      * All matching blocks are then skipped, as well as any comment-like content inside them
      */
    var ignore: js.UndefOr[js.RegExp | js.Array[js.RegExp]] = js.undefined
    
    /**
      * keep special multi-line comments that begin with:
      * - <!--[if - for conditional comments in HTML
      * - / *! - for everything else (other than HTML)
      * @default false - remove all multi-line comments
      */
    var safe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * replace comment blocks with white spaces where needed,
      * in order to preserve the original line + column position of every code element.
      * @default false - remove comment blocks entirely
      */
    var space: js.UndefOr[Boolean] = js.undefined
    
    /**
      * pass `tolerant` flag to [esprima] parser (the parser _may_ choose to continue parsing and produce a syntax tree).
      * @default false - performs strict parsing.
      */
    var tolerant: js.UndefOr[Boolean] = js.undefined
    
    /**
      * remove empty lines that follow removed full-line comments
      * @default false - do not trim comments
      */
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setIgnore(value: js.RegExp | js.Array[js.RegExp]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: js.RegExp*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      inline def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      inline def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      inline def setTolerant(value: Boolean): Self = StObject.set(x, "tolerant", value.asInstanceOf[js.Any])
      
      inline def setTolerantUndefined: Self = StObject.set(x, "tolerant", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
