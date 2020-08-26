package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.DeclareModuleExports
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait DeclareModuleExports_
  extends Declaration
     with BaseNode
     with Flow
     with FlowDeclaration
     with Statement {
  var typeAnnotation: TypeAnnotation_ = js.native
  @JSName("type")
  var type_DeclareModuleExports_ : DeclareModuleExports = js.native
}

object DeclareModuleExports_ {
  @scala.inline
  def apply(`type`: DeclareModuleExports, typeAnnotation: TypeAnnotation_): DeclareModuleExports_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareModuleExports_]
  }
  @scala.inline
  implicit class DeclareModuleExports_Ops[Self <: DeclareModuleExports_] (val x: Self) extends AnyVal {
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
    def setType(value: DeclareModuleExports): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
  }
  
}

