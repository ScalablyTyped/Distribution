package typings.csstoolsPostcssOklabFunction

import typings.postcss.mod.Declaration
import typings.postcss.mod.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOnCssFunctionMod {
  
  @JSImport("@csstools/postcss-oklab-function/dist/on-css-function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def onCSSFunctionDisplayP3(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionNode */ Any,
    decl: Declaration,
    result: Result,
    preserve: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onCSSFunctionDisplayP3")(node.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], result.asInstanceOf[js.Any], preserve.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onCSSFunctionSRgb(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionNode */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onCSSFunctionSRgb")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
