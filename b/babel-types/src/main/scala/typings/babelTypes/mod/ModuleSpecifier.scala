package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ExportSpecifier_
  - typings.babelTypes.mod.ImportDefaultSpecifier_
  - typings.babelTypes.mod.ImportNamespaceSpecifier_
  - typings.babelTypes.mod.ImportSpecifier_
  - typings.babelTypes.mod.ExportDefaultSpecifier_
  - typings.babelTypes.mod.ExportNamespaceSpecifier_
*/
trait ModuleSpecifier extends StObject
object ModuleSpecifier {
  
  inline def ExportDefaultSpecifier_(end: Double, exported: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.mod.ExportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportDefaultSpecifier_]
  }
  
  inline def ExportNamespaceSpecifier_(end: Double, exported: Identifier_, loc: SourceLocation, start: Double): typings.babelTypes.mod.ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportNamespaceSpecifier_]
  }
  
  inline def ExportSpecifier_(
    end: Double,
    exported: Identifier_,
    imported: Identifier_,
    loc: SourceLocation,
    local: Identifier_,
    start: Double
  ): typings.babelTypes.mod.ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ExportSpecifier_]
  }
  
  inline def ImportDefaultSpecifier_(end: Double, loc: SourceLocation, local: Identifier_, start: Double): typings.babelTypes.mod.ImportDefaultSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ImportDefaultSpecifier_]
  }
  
  inline def ImportNamespaceSpecifier_(end: Double, loc: SourceLocation, local: Identifier_, start: Double): typings.babelTypes.mod.ImportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportNamespaceSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ImportNamespaceSpecifier_]
  }
  
  inline def ImportSpecifier_(end: Double, imported: Identifier_, loc: SourceLocation, local: Identifier_, start: Double): typings.babelTypes.mod.ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[typings.babelTypes.mod.ImportSpecifier_]
  }
}
