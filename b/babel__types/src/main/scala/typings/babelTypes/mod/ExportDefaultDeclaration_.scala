package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import typings.babelTypes.babelTypesStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ExportDefaultDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with ExportDeclaration
     with ImportOrExportDeclaration
     with ModuleDeclaration
     with Standardized
     with Statement {
  
  var declaration: TSDeclareFunction_ | FunctionDeclaration_ | ClassDeclaration_ | Expression
  
  var exportKind: value | Null
  
  @JSName("type")
  var type_ExportDefaultDeclaration_ : ExportDefaultDeclaration
}
object ExportDefaultDeclaration_ {
  
  inline def apply(declaration: TSDeclareFunction_ | FunctionDeclaration_ | ClassDeclaration_ | Expression): ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = null, exportKind = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[ExportDefaultDeclaration_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportDefaultDeclaration_] (val x: Self) extends AnyVal {
    
    inline def setDeclaration(value: TSDeclareFunction_ | FunctionDeclaration_ | ClassDeclaration_ | Expression): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setExportKind(value: value): Self = StObject.set(x, "exportKind", value.asInstanceOf[js.Any])
    
    inline def setExportKindNull: Self = StObject.set(x, "exportKind", null)
    
    inline def setType(value: ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
