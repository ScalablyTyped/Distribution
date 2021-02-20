package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ExportDefaultDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait ExportDefaultDeclaration_
  extends Declaration
     with BaseNode
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  
  var declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression = js.native
  
  @JSName("type")
  var type_ExportDefaultDeclaration_ : ExportDefaultDeclaration = js.native
}
object ExportDefaultDeclaration_ {
  
  @scala.inline
  def apply(
    declaration: FunctionDeclaration_ | TSDeclareFunction_ | ClassDeclaration_ | Expression,
    `type`: ExportDefaultDeclaration
  ): ExportDefaultDeclaration_ = {
    val __obj = js.Dynamic.literal(declaration = declaration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
