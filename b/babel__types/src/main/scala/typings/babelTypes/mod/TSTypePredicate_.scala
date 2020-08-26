package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypePredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSTypePredicate_
  extends TSType
     with BaseNode {
  var asserts: Boolean | Null = js.native
  var parameterName: Identifier_ | TSThisType_ = js.native
  var typeAnnotation: TSTypeAnnotation_ | Null = js.native
  @JSName("type")
  var type_TSTypePredicate_ : TSTypePredicate = js.native
}

object TSTypePredicate_ {
  @scala.inline
  def apply(parameterName: Identifier_ | TSThisType_, `type`: TSTypePredicate): TSTypePredicate_ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypePredicate_]
  }
  @scala.inline
  implicit class TSTypePredicate_Ops[Self <: TSTypePredicate_] (val x: Self) extends AnyVal {
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
    def setParameterName(value: Identifier_ | TSThisType_): Self = this.set("parameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TSTypePredicate): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsserts(value: Boolean): Self = this.set("asserts", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssertsNull: Self = this.set("asserts", null)
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation_): Self = this.set("typeAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeAnnotationNull: Self = this.set("typeAnnotation", null)
  }
  
}

