package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportNamedDeclaration_
  extends StObject
     with BaseNode {
  
  var assertions: js.Array[ImportAttribute_] | Null
  
  var declaration: Declaration | Null
  
  var exportKind: "type" | "value" | Null
  
  var source: StringLiteral_ | Null
  
  var specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]
  
  @JSName("type")
  var type_ExportNamedDeclaration_ : "ExportNamedDeclaration"
}
object ExportNamedDeclaration_ {
  
  inline def apply(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any], assertions = null, declaration = null, end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, source = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[ExportNamedDeclaration_]
  }
  
  extension [Self <: ExportNamedDeclaration_](x: Self) {
    
    inline def setAssertions(value: js.Array[ImportAttribute_]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setAssertionsNull: Self = StObject.set(x, "assertions", null)
    
    inline def setAssertionsVarargs(value: ImportAttribute_ *): Self = StObject.set(x, "assertions", js.Array(value*))
    
    inline def setDeclaration(value: Declaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclarationNull: Self = StObject.set(x, "declaration", null)
    
    inline def setExportKind(value: "type" | "value"): Self = StObject.set(x, "exportKind", value.asInstanceOf[js.Any])
    
    inline def setExportKindNull: Self = StObject.set(x, "exportKind", null)
    
    inline def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSpecifiers(value: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    inline def setSpecifiersVarargs(value: (ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_)*): Self = StObject.set(x, "specifiers", js.Array(value*))
    
    inline def setType(value: "ExportNamedDeclaration"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
