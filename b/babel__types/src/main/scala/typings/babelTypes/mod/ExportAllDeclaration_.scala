package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportAllDeclaration_
  extends StObject
     with BaseNode {
  
  var assertions: js.Array[ImportAttribute_] | Null
  
  var exportKind: "type" | "value" | Null
  
  var source: StringLiteral_
  
  @JSName("type")
  var type_ExportAllDeclaration_ : "ExportAllDeclaration"
}
object ExportAllDeclaration_ {
  
  inline def apply(source: StringLiteral_): ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], assertions = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportAllDeclaration")
    __obj.asInstanceOf[ExportAllDeclaration_]
  }
  
  extension [Self <: ExportAllDeclaration_](x: Self) {
    
    inline def setAssertions(value: js.Array[ImportAttribute_]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setAssertionsNull: Self = StObject.set(x, "assertions", null)
    
    inline def setAssertionsVarargs(value: ImportAttribute_ *): Self = StObject.set(x, "assertions", js.Array(value*))
    
    inline def setExportKind(value: "type" | "value"): Self = StObject.set(x, "exportKind", value.asInstanceOf[js.Any])
    
    inline def setExportKindNull: Self = StObject.set(x, "exportKind", null)
    
    inline def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: "ExportAllDeclaration"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
