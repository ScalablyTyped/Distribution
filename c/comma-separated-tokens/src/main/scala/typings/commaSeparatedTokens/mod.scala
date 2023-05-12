package typings.commaSeparatedTokens

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("comma-separated-tokens", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(value: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def stringify(values: js.Array[String | Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(values.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(values: js.Array[String | Double], options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
      * Whether to pad a space before a token.
      */
    var padLeft: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to pad a space after a token.
      */
    var padRight: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPadLeft(value: Boolean): Self = StObject.set(x, "padLeft", value.asInstanceOf[js.Any])
      
      inline def setPadLeftUndefined: Self = StObject.set(x, "padLeft", js.undefined)
      
      inline def setPadRight(value: Boolean): Self = StObject.set(x, "padRight", value.asInstanceOf[js.Any])
      
      inline def setPadRightUndefined: Self = StObject.set(x, "padRight", js.undefined)
    }
  }
  
  type StringifyOptions = Options
}
