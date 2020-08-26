package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Decorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decorator_ extends Node {
  var expression: Expression = js.native
  @JSName("type")
  var type_Decorator_ : Decorator = js.native
}

object Decorator_ {
  @scala.inline
  def apply(end: Double, expression: Expression, loc: SourceLocation, start: Double, `type`: Decorator): Decorator_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorator_]
  }
  @scala.inline
  implicit class Decorator_Ops[Self <: Decorator_] (val x: Self) extends AnyVal {
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
    def setType(value: Decorator): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

