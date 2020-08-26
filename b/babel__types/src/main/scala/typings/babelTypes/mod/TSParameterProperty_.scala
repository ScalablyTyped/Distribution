package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSParameterProperty
import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.public
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait TSParameterProperty_
  extends LVal
     with BaseNode {
  var accessibility: public | `private` | `protected` | Null = js.native
  var parameter: Identifier_ | AssignmentPattern_ = js.native
  var readonly: Boolean | Null = js.native
  @JSName("type")
  var type_TSParameterProperty_ : TSParameterProperty = js.native
}

object TSParameterProperty_ {
  @scala.inline
  def apply(parameter: Identifier_ | AssignmentPattern_, `type`: TSParameterProperty): TSParameterProperty_ = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSParameterProperty_]
  }
  @scala.inline
  implicit class TSParameterProperty_Ops[Self <: TSParameterProperty_] (val x: Self) extends AnyVal {
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
    def setParameter(value: Identifier_ | AssignmentPattern_): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TSParameterProperty): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibility(value: public | `private` | `protected`): Self = this.set("accessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilityNull: Self = this.set("accessibility", null)
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadonlyNull: Self = this.set("readonly", null)
  }
  
}

