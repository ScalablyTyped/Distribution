package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportSpecifier
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ExportSpecifier_
  extends StObject
     with BaseNode
     with ModuleSpecifier
     with Standardized {
  
  var exportKind: `type` | value | Null
  
  var exported: Identifier_ | StringLiteral_
  
  var local: Identifier_
  
  @JSName("type")
  var type_ExportSpecifier_ : ExportSpecifier
}
object ExportSpecifier_ {
  
  inline def apply(exported: Identifier_ | StringLiteral_, local: Identifier_): ExportSpecifier_ = {
    val __obj = js.Dynamic.literal(exported = exported.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[ExportSpecifier_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportSpecifier_] (val x: Self) extends AnyVal {
    
    inline def setExportKind(value: `type` | value): Self = StObject.set(x, "exportKind", value.asInstanceOf[js.Any])
    
    inline def setExportKindNull: Self = StObject.set(x, "exportKind", null)
    
    inline def setExported(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
    
    inline def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
