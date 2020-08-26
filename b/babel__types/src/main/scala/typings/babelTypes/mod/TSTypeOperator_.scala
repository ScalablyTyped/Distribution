package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSTypeOperator_
  extends TSType
     with BaseNode {
  var operator: String = js.native
  var typeAnnotation: TSType = js.native
  @JSName("type")
  var type_TSTypeOperator_ : TSTypeOperator = js.native
}

object TSTypeOperator_ {
  @scala.inline
  def apply(operator: String, `type`: TSTypeOperator, typeAnnotation: TSType): TSTypeOperator_ = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeOperator_]
  }
  @scala.inline
  implicit class TSTypeOperator_Ops[Self <: TSTypeOperator_] (val x: Self) extends AnyVal {
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
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TSTypeOperator): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
  }
  
}

