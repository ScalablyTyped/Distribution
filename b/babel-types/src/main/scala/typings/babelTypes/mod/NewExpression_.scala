package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.NewExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewExpression_
  extends Node
     with Expression {
  var arguments: js.Array[Expression | SpreadElement_] = js.native
  var callee: Expression | Super = js.native
  @JSName("type")
  var type_NewExpression_ : NewExpression = js.native
}

object NewExpression_ {
  @scala.inline
  def apply(
    arguments: js.Array[Expression | SpreadElement_],
    callee: Expression | Super,
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: NewExpression
  ): NewExpression_ = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewExpression_]
  }
  @scala.inline
  implicit class NewExpression_Ops[Self <: NewExpression_] (val x: Self) extends AnyVal {
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
    def setArgumentsVarargs(value: (Expression | SpreadElement_)*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[Expression | SpreadElement_]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallee(value: Expression | Super): Self = this.set("callee", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: NewExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

