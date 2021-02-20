package typings.babelTypes.mod

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
  - typings.babelTypes.mod.ExportSpecifier_
  - typings.babelTypes.mod.ImportDefaultSpecifier_
  - typings.babelTypes.mod.ImportNamespaceSpecifier_
  - typings.babelTypes.mod.ImportSpecifier_
  - typings.babelTypes.mod.ExportNamespaceSpecifier_
  - typings.babelTypes.mod.ExportDefaultSpecifier_
*/
trait ModuleSpecifier extends _Node
object ModuleSpecifier {
  
  @scala.inline
  def ExportDefaultSpecifier_(exported: Identifier_, `type`: ExportDefaultSpecifier): typings.babelTypes.mod.ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ExportDefaultSpecifier_]
  }
  
  @scala.inline
  def ExportNamespaceSpecifier_(exported: Identifier_, `type`: ExportNamespaceSpecifier): typings.babelTypes.mod.ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ExportNamespaceSpecifier_]
  }
  
  @scala.inline
  def ExportSpecifier_(exported: Identifier_ | StringLiteral_, local: Identifier_, `type`: ExportSpecifier): typings.babelTypes.mod.ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ExportSpecifier_]
  }
  
  @scala.inline
  def ImportDefaultSpecifier_(local: Identifier_, `type`: ImportDefaultSpecifier): typings.babelTypes.mod.ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ImportDefaultSpecifier_]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier_(local: Identifier_, `type`: ImportNamespaceSpecifier): typings.babelTypes.mod.ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ImportNamespaceSpecifier_]
  }
  
  @scala.inline
  def ImportSpecifier_(imported: Identifier_ | StringLiteral_, local: Identifier_, `type`: ImportSpecifier): typings.babelTypes.mod.ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.babelTypes.mod.ImportSpecifier_]
  }
}
