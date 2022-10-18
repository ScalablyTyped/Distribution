package typings.babelPluginCodegen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMacroMod {
  
  @JSImport("babel-plugin-codegen/dist/macro", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof codegen` */
  inline def default(code: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(code.asInstanceOf[js.Any]).asInstanceOf[Any]
}
