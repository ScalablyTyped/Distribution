package typings.babelPluginCodegen

import typings.babelPluginCodegen.anon.AsFunction
import typings.babelPluginCodegen.anon.TypeofbabelCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distReplaceMod {
  
  @JSImport("babel-plugin-codegen/dist/replace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getReplacers(babel: TypeofbabelCore): AsFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("getReplacers")(babel.asInstanceOf[js.Any]).asInstanceOf[AsFunction]
}
