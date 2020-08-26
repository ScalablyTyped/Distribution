package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AmpersandAmpersand
import typings.babelTypes.babelTypesStrings.LogicalExpression
import typings.babelTypes.babelTypesStrings.QuestionmarkQuestionmark
import typings.babelTypes.babelTypesStrings.VerticallineVerticalline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ @js.native
trait LogicalExpression_
  extends Binary
     with BaseNode
     with Expression {
  var left: Expression = js.native
  var operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark = js.native
  var right: Expression = js.native
  @JSName("type")
  var type_LogicalExpression_ : LogicalExpression = js.native
}

object LogicalExpression_ {
  @scala.inline
  def apply(
    left: Expression,
    operator: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark,
    right: Expression,
    `type`: LogicalExpression
  ): LogicalExpression_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogicalExpression_]
  }
  @scala.inline
  implicit class LogicalExpression_Ops[Self <: LogicalExpression_] (val x: Self) extends AnyVal {
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
    def setLeft(value: Expression): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperator(value: VerticallineVerticalline | AmpersandAmpersand | QuestionmarkQuestionmark): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Expression): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: LogicalExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

