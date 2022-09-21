package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareExportAllDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with Flow
     with FlowDeclaration
     with Node
     with Statement {
  
  var exportKind: js.UndefOr[`type` | value | Null] = js.undefined
  
  var source: StringLiteral_
  
  @JSName("type")
  var type_DeclareExportAllDeclaration_ : DeclareExportAllDeclaration
}
object DeclareExportAllDeclaration_ {
  
  inline def apply(source: StringLiteral_): DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("DeclareExportAllDeclaration")
    __obj.asInstanceOf[DeclareExportAllDeclaration_]
  }
  
  extension [Self <: DeclareExportAllDeclaration_](x: Self) {
    
    inline def setExportKind(value: `type` | value): Self = StObject.set(x, "exportKind", value.asInstanceOf[js.Any])
    
    inline def setExportKindNull: Self = StObject.set(x, "exportKind", null)
    
    inline def setExportKindUndefined: Self = StObject.set(x, "exportKind", js.undefined)
    
    inline def setSource(value: StringLiteral_): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: DeclareExportAllDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
