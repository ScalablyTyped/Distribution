package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ExportAllDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait ExportAllDeclaration_
  extends Declaration
     with BaseNode
     with ExportDeclaration
     with ModuleDeclaration
     with Statement {
  
  var assertions: ImportAttribute_ | Null = js.native
  
  var source: StringLiteral_ = js.native
  
  @JSName("type")
  var type_ExportAllDeclaration_ : ExportAllDeclaration = js.native
}
object ExportAllDeclaration_ {
  
  @scala.inline
  def apply(source: StringLiteral_, `type`: ExportAllDeclaration): ExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAllDeclaration_]
  }
  
  @scala.inline
  implicit class ExportAllDeclaration_Ops[Self <: ExportAllDeclaration_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSource(value: StringLiteral_): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ExportAllDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertions(value: ImportAttribute_): Self = this.set("assertions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertionsNull: Self = this.set("assertions", null)
  }
}
