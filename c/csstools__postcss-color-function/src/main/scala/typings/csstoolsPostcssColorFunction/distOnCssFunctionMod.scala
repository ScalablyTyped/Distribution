package typings.csstoolsPostcssColorFunction

import typings.postcss.mod.Declaration
import typings.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOnCssFunctionMod {
  
  @JSImport("@csstools/postcss-color-function/dist/on-css-function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onCSSFunctionSRgb(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionNode */ Any,
    decl: Declaration,
    result: Result,
    preserve: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onCSSFunctionSRgb")(node.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], result.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
