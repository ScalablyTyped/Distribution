package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BindExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindExpression_
  extends Node
     with Expression {
  var callee: Expression = js.native
  var `object`: Expression = js.native
  @JSName("type")
  var type_BindExpression_ : BindExpression = js.native
}

object BindExpression_ {
  @scala.inline
  def apply(
    callee: Expression,
    end: Double,
    loc: SourceLocation,
    `object`: Expression,
    start: Double,
    `type`: BindExpression
  ): BindExpression_ = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindExpression_]
  }
  @scala.inline
  implicit class BindExpression_Ops[Self <: BindExpression_] (val x: Self) extends AnyVal {
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
    def setCallee(value: Expression): Self = this.set("callee", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: Expression): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BindExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

