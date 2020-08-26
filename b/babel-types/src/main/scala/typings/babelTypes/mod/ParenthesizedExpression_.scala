package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ParenthesizedExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParenthesizedExpression_
  extends Node
     with Expression
     with ExpressionWrapper {
  var expression: Expression = js.native
  @JSName("type")
  var type_ParenthesizedExpression_ : ParenthesizedExpression = js.native
}

object ParenthesizedExpression_ {
  @scala.inline
  def apply(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: ParenthesizedExpression
  ): ParenthesizedExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParenthesizedExpression_]
  }
  @scala.inline
  implicit class ParenthesizedExpression_Ops[Self <: ParenthesizedExpression_] (val x: Self) extends AnyVal {
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
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ParenthesizedExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

