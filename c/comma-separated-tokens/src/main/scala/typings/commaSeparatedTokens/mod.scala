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
  inline def stringify(values: js.Array[String | Double], options: StringifyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(values.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait StringifyOptions extends StObject {
    
    /**
      * Whether to pad a space before a token (`boolean`, default: `true`).
      */
    var padLeft: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to pad a space after a token (`boolean`, default: `false`).
      */
    var padRight: js.UndefOr[Boolean] = js.undefined
  }
  object StringifyOptions {
    
    inline def apply(): StringifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringifyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StringifyOptions] (val x: Self) extends AnyVal {
      
      inline def setPadLeft(value: Boolean): Self = StObject.set(x, "padLeft", value.asInstanceOf[js.Any])
      
      inline def setPadLeftUndefined: Self = StObject.set(x, "padLeft", js.undefined)
      
      inline def setPadRight(value: Boolean): Self = StObject.set(x, "padRight", value.asInstanceOf[js.Any])
      
      inline def setPadRightUndefined: Self = StObject.set(x, "padRight", js.undefined)
    }
  }
}
