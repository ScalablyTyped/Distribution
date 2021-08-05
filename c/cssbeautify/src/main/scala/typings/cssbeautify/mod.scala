package typings.cssbeautify

import typings.cssbeautify.cssbeautifyStrings.`end-of-line`
import typings.cssbeautify.cssbeautifyStrings.`separate-line`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cssText: String): String = ^.asInstanceOf[js.Dynamic].apply(cssText.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(cssText: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(cssText.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("cssbeautify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * Always inserts a semicolon after the last ruleset(default is false)
      */
    var autosemicolon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A string used for the indentation of the declaration (default is 4
      * spaces).
      */
    var indent: js.UndefOr[String] = js.undefined
    
    /**
      * Defines the placement of open curly brace, either end-of-line (default)
      * or separate-line
      */
    var openbrace: js.UndefOr[`end-of-line` | `separate-line`] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutosemicolon(value: Boolean): Self = StObject.set(x, "autosemicolon", value.asInstanceOf[js.Any])
      
      inline def setAutosemicolonUndefined: Self = StObject.set(x, "autosemicolon", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def setOpenbrace(value: `end-of-line` | `separate-line`): Self = StObject.set(x, "openbrace", value.asInstanceOf[js.Any])
      
      inline def setOpenbraceUndefined: Self = StObject.set(x, "openbrace", js.undefined)
    }
  }
}
