package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.SpreadElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpreadElement_
  extends Node
     with UnaryLike {
  var argument: Expression = js.native
  @JSName("type")
  var type_SpreadElement_ : SpreadElement = js.native
}

object SpreadElement_ {
  @scala.inline
  def apply(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: SpreadElement): SpreadElement_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpreadElement_]
  }
  @scala.inline
  implicit class SpreadElement_Ops[Self <: SpreadElement_] (val x: Self) extends AnyVal {
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
    def setType(value: SpreadElement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

