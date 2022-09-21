package typings.cssEscape

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A robust polyfill for the `CSS.escape` utility method as defined in
    * [CSSOM](https://drafts.csswg.org/cssom/#the-css.escape()-method).
    */
  inline def apply(css: String): String = ^.asInstanceOf[js.Dynamic].apply(css.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("css.escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    object CSS {
      
      @JSGlobal("CSS")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * A robust polyfill for the `CSS.escape` utility method as defined in
        * [CSSOM](https://drafts.csswg.org/cssom/#the-css.escape()-method).
        */
      inline def escape(css: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(css.asInstanceOf[js.Any]).asInstanceOf[String]
    }
  }
}
