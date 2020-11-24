package typings.babelTypes.ts36Mod

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
  - typings.babelTypes.ts36Mod.ExportSpecifier_
  - typings.babelTypes.ts36Mod.ImportDefaultSpecifier_
  - typings.babelTypes.ts36Mod.ImportNamespaceSpecifier_
  - typings.babelTypes.ts36Mod.ImportSpecifier_
  - typings.babelTypes.ts36Mod.ExportDefaultSpecifier_
  - typings.babelTypes.ts36Mod.ExportNamespaceSpecifier_
*/
trait ModuleSpecifier extends js.Object
object ModuleSpecifier {
  
  @scala.inline
  def ImportNamespaceSpecifier_(
    end: Double,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ImportNamespaceSpecifier
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ExportDefaultSpecifier_(
    end: Double,
    exported: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ExportDefaultSpecifier
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ImportDefaultSpecifier_(
    end: Double,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ImportDefaultSpecifier
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ExportSpecifier_(
    end: Double,
    exported: Identifier_,
    imported: Identifier_,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ExportSpecifier
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ExportNamespaceSpecifier_(
    end: Double,
    exported: Identifier_,
    loc: SourceLocation,
    start: Double,
    `type`: ExportNamespaceSpecifier
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
  
  @scala.inline
  def ImportSpecifier_(
    end: Double,
    imported: Identifier_,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ImportSpecifier
  ): ModuleSpecifier = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleSpecifier]
  }
}
