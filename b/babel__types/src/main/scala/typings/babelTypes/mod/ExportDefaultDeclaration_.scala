package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait ExportDefaultDeclaration_
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
  
  @scala.inline
  def apply(declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression): ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[ExportDefaultDeclaration_]
  }
  
  @scala.inline
  implicit class ExportDefaultDeclaration_MutableBuilder[Self <: ExportDefaultDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeclaration(value: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
