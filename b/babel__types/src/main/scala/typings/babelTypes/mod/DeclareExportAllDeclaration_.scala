package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclareExportAllDeclaration
import typings.babelTypes.babelTypesStrings.`type`
import typings.babelTypes.babelTypesStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait DeclareExportAllDeclaration_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  
  var exportKind: `type` | value | Null = js.native
  
  var source: StringLiteral_ = js.native
  
  @JSName("type")
  var type_DeclareExportAllDeclaration_ : DeclareExportAllDeclaration = js.native
}
object DeclareExportAllDeclaration_ {
  
  @scala.inline
  def apply(source: StringLiteral_, `type`: DeclareExportAllDeclaration): DeclareExportAllDeclaration_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExportAllDeclaration_]
  }
  
  @scala.inline
  implicit class DeclareExportAllDeclaration_Ops[Self <: DeclareExportAllDeclaration_] (val x: Self) extends AnyVal {
    
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
    def setType(value: DeclareExportAllDeclaration): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportKind(value: `type` | value): Self = this.set("exportKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportKindNull: Self = this.set("exportKind", null)
  }
}
