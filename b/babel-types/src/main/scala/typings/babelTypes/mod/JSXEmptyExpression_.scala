package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.JSXEmptyExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSXEmptyExpression_
  extends Node
     with Expression
     with JSX {
  @JSName("type")
  var type_JSXEmptyExpression_ : JSXEmptyExpression = js.native
}

object JSXEmptyExpression_ {
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: JSXEmptyExpression): JSXEmptyExpression_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSXEmptyExpression_]
  }
  @scala.inline
  implicit class JSXEmptyExpression_Ops[Self <: JSXEmptyExpression_] (val x: Self) extends AnyVal {
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
    def setType(value: JSXEmptyExpression): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

