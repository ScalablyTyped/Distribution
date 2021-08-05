package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait ExportDefaultDeclaration_
  extends StObject
     with BaseNode
     with Declaration
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  
  var declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression
  
  @JSName("type")
  var type_ExportDefaultDeclaration_ : ExportDefaultDeclaration
}
object ExportDefaultDeclaration_ {
  
  inline def apply(declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression): ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[ExportDefaultDeclaration_]
  }
  
  extension [Self <: ExportDefaultDeclaration_](x: Self) {
    
    inline def setDeclaration(value: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    inline def setType(value: ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
