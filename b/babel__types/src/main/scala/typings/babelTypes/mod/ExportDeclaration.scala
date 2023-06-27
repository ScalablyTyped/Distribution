package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ExportAllDeclaration_
  - typings.babelTypes.mod.ExportDefaultDeclaration_
  - typings.babelTypes.mod.ExportNamedDeclaration_
*/
trait ExportDeclaration
  extends StObject
     with _Node
object ExportDeclaration {
  
  inline def ExportAllDeclaration_(source: StringLiteral_): typings.babelTypes.mod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], assertions = null, attributes = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportAllDeclaration_]
  }
  
  inline def ExportDefaultDeclaration_(declaration: TSDeclareFunction_ | FunctionDeclaration_ | ClassDeclaration_ | Expression): typings.babelTypes.mod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportDefaultDeclaration_]
  }
  
  inline def ExportNamedDeclaration_(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): typings.babelTypes.mod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any], assertions = null, attributes = null, declaration = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, source = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportNamedDeclaration_]
  }
}
