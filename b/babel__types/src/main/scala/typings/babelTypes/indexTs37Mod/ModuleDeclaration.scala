package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.ExportAllDeclaration_
  - typings.babelTypes.indexTs37Mod.ExportDefaultDeclaration_
  - typings.babelTypes.indexTs37Mod.ExportNamedDeclaration_
  - typings.babelTypes.indexTs37Mod.ImportDeclaration_
*/
trait ModuleDeclaration
  extends StObject
     with _Node
object ModuleDeclaration {
  
  inline def ExportAllDeclaration_(source: StringLiteral_): typings.babelTypes.indexTs37Mod.ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], assertions = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExportAllDeclaration_]
  }
  
  inline def ExportDefaultDeclaration_(declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression): typings.babelTypes.indexTs37Mod.ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExportDefaultDeclaration_]
  }
  
  inline def ExportNamedDeclaration_(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): typings.babelTypes.indexTs37Mod.ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any], assertions = null, declaration = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, source = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExportNamedDeclaration_]
  }
  
  inline def ImportDeclaration_(
    source: StringLiteral_,
    specifiers: js.Array[ImportSpecifier_ | ImportDefaultSpecifier_ | ImportNamespaceSpecifier_]
  ): typings.babelTypes.indexTs37Mod.ImportDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], specifiers = specifiers.asInstanceOf[js.Any], assertions = null, end = null, importKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ImportDeclaration_]
  }
}
