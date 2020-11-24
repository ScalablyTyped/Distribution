package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportDefaultSpecifier
import typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import typings.babelTypes.babelTypesStrings.ExportSpecifier
import typings.babelTypes.babelTypesStrings.ImportDefaultSpecifier
import typings.babelTypes.babelTypesStrings.ImportNamespaceSpecifier
import typings.babelTypes.babelTypesStrings.ImportSpecifier
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
  def ExportNamespaceSpecifier_(exported: Identifier_, `type`: ExportNamespaceSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ImportSpecifier_(imported: Identifier_ | StringLiteral_, local: Identifier_, `type`: ImportSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(imported = imported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ImportDefaultSpecifier_(local: Identifier_, `type`: ImportDefaultSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ImportNamespaceSpecifier_(local: Identifier_, `type`: ImportNamespaceSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ExportSpecifier_(exported: Identifier_ | StringLiteral_, local: Identifier_, `type`: ExportSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ExportDefaultSpecifier_(exported: Identifier_, `type`: ExportDefaultSpecifier): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
}
