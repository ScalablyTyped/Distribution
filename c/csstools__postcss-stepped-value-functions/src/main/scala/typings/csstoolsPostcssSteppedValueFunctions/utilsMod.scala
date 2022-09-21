package typings.csstoolsPostcssSteppedValueFunctions

import typings.csstoolsPostcssSteppedValueFunctions.mod.pluginOptions
import typings.postcss.mod.Declaration
import typings.postcss.mod.Result
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@csstools/postcss-stepped-value-functions/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def functionNodeToWordNode(
    fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionNode */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("functionNodeToWordNode")(fn.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isVarNode(node: Node): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVarNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def optionallyWarn(decl: Declaration, result: Result, message: String, options: pluginOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("optionallyWarn")(decl.asInstanceOf[js.Any], result.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateArgumentsAndTypes(
    node: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FunctionNode */ Any,
    decl: Declaration,
    result: Result,
    options: pluginOptions
  ): js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify valueParser.Dimension */ Any
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("validateArgumentsAndTypes")(node.asInstanceOf[js.Any], decl.asInstanceOf[js.Any], result.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify valueParser.Dimension */ Any
    ]
  ]]
}
