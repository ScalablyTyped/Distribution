package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ExportDefaultSpecifier
import typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import typings.babelTypes.babelTypesStrings.ExportSpecifier
import typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import typings.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
import typings.babelTypes.babelTypesStrings.ImportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.indexTs37Mod.ExportSpecifier_
  - typings.babelTypes.indexTs37Mod.ImportDefaultSpecifier_
  - typings.babelTypes.indexTs37Mod.ImportNamespaceSpecifier_
  - typings.babelTypes.indexTs37Mod.ImportSpecifier_
  - typings.babelTypes.indexTs37Mod.ExportNamespaceSpecifier_
  - typings.babelTypes.indexTs37Mod.ExportDefaultSpecifier_
*/
trait ModuleSpecifier extends _Node
object ModuleSpecifier {
  
  @scala.inline
  def ExportDefaultSpecifier_(exported: Identifier_, `type`: ExportDefaultSpecifier): typings.babelTypes.indexTs37Mod.ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExportDefaultSpecifier_]
  }
  
  @scala.inline
  def ExportNamespaceSpecifier_(exported: Identifier_, `type`: ExportNamespaceSpecifier): typings.babelTypes.indexTs37Mod.ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExportNamespaceSpecifier_]
  }
  
  @scala.inline
  def ExportSpecifier_(exported: Identifier_ | StringLiteral_, local: Identifier_, `type`: ExportSpecifier): typings.babelTypes.indexTs37Mod.ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ExportSpecifier_]
  }
  
  @scala.inline
  def ImportDefaultSpecifier_(local: Identifier_, `type`: ImportDefaultSpecifier): typings.babelTypes.indexTs37Mod.ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ImportDefaultSpecifier_]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier_(local: Identifier_, `type`: ImportNamespaceSpecifier): typings.babelTypes.indexTs37Mod.ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ImportNamespaceSpecifier_]
  }
  
  @scala.inline
  def ImportSpecifier_(imported: Identifier_ | StringLiteral_, local: Identifier_, `type`: ImportSpecifier): typings.babelTypes.indexTs37Mod.ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.indexTs37Mod.ImportSpecifier_]
  }
}
