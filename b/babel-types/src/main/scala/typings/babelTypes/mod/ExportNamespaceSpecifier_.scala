package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportNamespaceSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportNamespaceSpecifier_
  extends StObject
     with Node
     with ModuleSpecifier {
  
  var exported: Identifier_
  
  @JSName("type")
  var type_ExportNamespaceSpecifier_ : ExportNamespaceSpecifier
}
object ExportNamespaceSpecifier_ {
  
  inline def apply(end: Double, exported: Identifier_, loc: SourceLocation, start: Double): ExportNamespaceSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamespaceSpecifier")
    __obj.asInstanceOf[ExportNamespaceSpecifier_]
  }
  
  extension [Self <: ExportNamespaceSpecifier_](x: Self) {
    
    inline def setExported(value: Identifier_): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExportNamespaceSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
