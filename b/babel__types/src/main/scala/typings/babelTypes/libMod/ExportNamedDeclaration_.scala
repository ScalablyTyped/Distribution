package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.ExportNamedDeclaration
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportNamedDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with ExportDeclaration
     with ImportOrExportDeclaration
     with ModuleDeclaration
     with Node
     with Standardized
     with Statement {
  
  var assertions: js.UndefOr[js.Array[ImportAttribute_] | Null] = js.undefined
  
  var attributes: js.UndefOr[js.Array[ImportAttribute_] | Null] = js.undefined
  
  var declaration: js.UndefOr[Declaration | Null] = js.undefined
  
  var exportKind: js.UndefOr[`type` | value | Null] = js.undefined
  
  var source: js.UndefOr[StringLiteral_ | Null] = js.undefined
  
  var specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]
  
  @JSName("type")
  var type_ExportNamedDeclaration_ : ExportNamedDeclaration
}
object ExportNamedDeclaration_ {
  
  inline def apply(specifiers: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): ExportNamedDeclaration_ = {
    val __obj = js.Dynamic.literal(specifiers = specifiers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[ExportNamedDeclaration_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportNamedDeclaration_] (val x: Self) extends AnyVal {
    
    inline def setAssertions(value: js.Array[ImportAttribute_]): Self = StObject.set(x, "assertions", value.asInstanceOf[js.Any])
    
    inline def setAssertionsNull: Self = StObject.set(x, "assertions", null)
    
    inline def setAssertionsUndefined: Self = StObject.set(x, "assertions", js.undefined)
    
    inline def setAssertionsVarargs(value: ImportAttribute_ *): Self = StObject.set(x, "assertions", js.Array(value*))
    
    inline def setAttributes(value: js.Array[ImportAttribute_]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesNull: Self = StObject.set(x, "attributes", null)
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: ImportAttribute_ *): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setDeclaration(value: Declaration): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setDeclarationNull: Self = StObject.set(x, "declaration", null)
    
    inline def setDeclarationUndefined: Self = StObject.set(x, "declaration", js.undefined)
    
    inline def setExportKind(value: `type` | value): Self = StObject.set(x, "exportKind", value.asInstanceOf[js.Any])
    
    inline def setExportKindNull: Self = StObject.set(x, "exportKind", null)
    
    inline def setExportKindUndefined: Self = StObject.set(x, "exportKind", js.undefined)
    
    inline def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceNull: Self = StObject.set(x, "source", null)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSpecifiers(value: js.Array[ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    inline def setSpecifiersVarargs(value: (ExportSpecifier_ | ExportDefaultSpecifier_ | ExportNamespaceSpecifier_)*): Self = StObject.set(x, "specifiers", js.Array(value*))
    
    inline def setType(value: ExportNamedDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
