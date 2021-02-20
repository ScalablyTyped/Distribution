package typings.decomment

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("decomment", JSImport.Namespace)
  @js.native
  def apply(code: String): String = js.native
  @JSImport("decomment", JSImport.Namespace)
  @js.native
  def apply(code: String, options: Options): String = js.native
  
  /**
    * Returns End-of-Line string used within the text, based on the occurrence frequency:
    * - \n - for Unix-encoded text
    * - \r\n - for Windows-encoded text
    */
  @JSImport("decomment", "getEOL")
  @js.native
  def getEOL(text: String): String = js.native
  
  /**
    * Unlike the default decomment method, it instructs the library not to parse
    * or validate the input in any way, rather assume it to be HTML,
    * and remove all <!-- comment --> entries from it according to the options.
    */
  @JSImport("decomment", "html")
  @js.native
  def html(html: String): String = js.native
  @JSImport("decomment", "html")
  @js.native
  def html(html: String, options: Options): String = js.native
  
  /**
    * Unlike the default decomment, it instructs the library that text is not a JSON,
    * JavaScript or HTML, rather a plain text that needs no parsing or validation,
    * only to remove \/\/ and \/ **\/ comments from it according to the options.
    */
  @JSImport("decomment", "text")
  @js.native
  def text(text: String): String = js.native
  @JSImport("decomment", "text")
  @js.native
  def text(text: String, options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Takes either a single or an array of regular expressions to match against.
      * All matching blocks are then skipped, as well as any comment-like content inside them
      */
    var ignore: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
    
    /**
      * keep special multi-line comments that begin with:
      * - <!--[if - for conditional comments in HTML
      * - / *! - for everything else (other than HTML)
      * @default false - remove all multi-line comments
      */
    var safe: js.UndefOr[Boolean] = js.native
    
    /**
      * replace comment blocks with white spaces where needed,
      * in order to preserve the original line + column position of every code element.
      * @default false - remove comment blocks entirely
      */
    var space: js.UndefOr[Boolean] = js.native
    
    /**
      * remove empty lines that follow removed full-line comments
      * @defualt false - do not trim comments
      */
    var trim: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnore(value: RegExp | js.Array[RegExp]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      @scala.inline
      def setIgnoreVarargs(value: RegExp*): Self = StObject.set(x, "ignore", js.Array(value :_*))
      
      @scala.inline
      def setSafe(value: Boolean): Self = StObject.set(x, "safe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSafeUndefined: Self = StObject.set(x, "safe", js.undefined)
      
      @scala.inline
      def setSpace(value: Boolean): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
      
      @scala.inline
      def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
