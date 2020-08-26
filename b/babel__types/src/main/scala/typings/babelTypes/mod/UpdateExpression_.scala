package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.PlussignPlussign
import typings.babelTypes.babelTypesStrings.UpdateExpression
import typings.babelTypes.babelTypesStrings.`--`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait UpdateExpression_
  extends Expression
     with BaseNode {
  var argument: Expression = js.native
  var operator: PlussignPlussign | `--` = js.native
  var prefix: Boolean = js.native
  @JSName("type")
  var type_UpdateExpression_ : UpdateExpression = js.native
}

object UpdateExpression_ {
  @scala.inline
  def apply(argument: Expression, operator: PlussignPlussign | `--`, prefix: Boolean, `type`: UpdateExpression): UpdateExpression_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExpression_]
  }
  @scala.inline
  implicit class UpdateExpression_Ops[Self <: UpdateExpression_] (val x: Self) extends AnyVal {
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
    def setArgument(value: Expression): Self = this.set("argument", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: PlussignPlussign | `--`): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: Boolean): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: UpdateExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

