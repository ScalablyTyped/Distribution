package typings.expoGlr2XJCr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNodeFormatterDTsMod {
  
  object default {
    
    @JSImport(".expo-glr2XJCr/build/logs/format/ReactNodeFormatter.d.ts", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def serialize(node: Any, config: Any, indentation: Any, depth: Any, refs: Any, printer: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indentation.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], printer.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def test(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
