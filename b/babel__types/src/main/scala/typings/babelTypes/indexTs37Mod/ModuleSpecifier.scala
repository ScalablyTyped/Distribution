package typings.babelTypes.indexTs37Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.ExportSpecifier_
  - typings.babelTypes.indexTs37Mod.ImportDefaultSpecifier_
  - typings.babelTypes.indexTs37Mod.ImportNamespaceSpecifier_
  - typings.babelTypes.indexTs37Mod.ImportSpecifier_
  - typings.babelTypes.indexTs37Mod.ExportNamespaceSpecifier_
  - typings.babelTypes.indexTs37Mod.ExportDefaultSpecifier_
*/
trait ModuleSpecifier
  extends StObject
     with _Node
object ModuleSpecifier {
  
  @scala.inline
  def ExportDefaultSpecifier_(exported: Identifier_): typings.babelTypes.indexTs37Mod.ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExportDefaultSpecifier_]
  }
  
  @scala.inline
  def ExportNamespaceSpecifier_(exported: Identifier_): typings.babelTypes.indexTs37Mod.ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExportNamespaceSpecifier_]
  }
  
  @scala.inline
  def ExportSpecifier_(exported: Identifier_ | StringLiteral_, local: Identifier_): typings.babelTypes.indexTs37Mod.ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExportSpecifier_]
  }
  
  @scala.inline
  def ImportDefaultSpecifier_(local: Identifier_): typings.babelTypes.indexTs37Mod.ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ImportDefaultSpecifier_]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier_(local: Identifier_): typings.babelTypes.indexTs37Mod.ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ImportNamespaceSpecifier_]
  }
  
  @scala.inline
  def ImportSpecifier_(imported: Identifier_ | StringLiteral_, local: Identifier_): typings.babelTypes.indexTs37Mod.ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], end = null, importKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ImportSpecifier_]
  }
}
