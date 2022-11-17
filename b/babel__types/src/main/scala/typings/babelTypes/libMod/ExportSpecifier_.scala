package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSpecifier_
  extends StObject
     with BaseNode {
  
  var exportKind: js.UndefOr["type" | "value" | Null] = js.undefined
  
  var exported: Identifier_ | StringLiteral_
  
  var local: Identifier_
  
  @JSName("type")
  var type_ExportSpecifier_ : "ExportSpecifier"
}
object ExportSpecifier_ {
  
  inline def apply(exported: Identifier_ | StringLiteral_, local: Identifier_): ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[ExportSpecifier_]
  }
  
  extension [Self <: ExportSpecifier_](x: Self) {
    
    inline def setExportKind(value: "type" | "value"): Self = StObject.set(x, "exportKind", value.asInstanceOf[js.Any])
    
    inline def setExportKindNull: Self = StObject.set(x, "exportKind", null)
    
    inline def setExportKindUndefined: Self = StObject.set(x, "exportKind", js.undefined)
    
    inline def setExported(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ExportSpecifier"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
