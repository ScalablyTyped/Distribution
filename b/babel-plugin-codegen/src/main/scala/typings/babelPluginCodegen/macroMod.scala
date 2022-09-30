package typings.babelPluginCodegen

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object macroMod {
  
  /* was `typeof codegen` */
  object default {
    
    inline def apply(code: String): Any = ^.asInstanceOf[js.Dynamic].apply(code.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def apply(literals: TemplateStringsArray, interpolations: Any*): Any = ^.asInstanceOf[js.Dynamic].apply(scala.List(literals.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
    
    @JSImport("babel-plugin-codegen/dist/macro", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def require(modulePath: String, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(scala.List(modulePath.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  }
}
