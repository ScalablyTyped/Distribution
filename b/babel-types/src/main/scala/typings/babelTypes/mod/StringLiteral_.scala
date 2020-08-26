package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringLiteral_
  extends Node
     with Expression
     with Immutable
     with Literal
     with Pureish {
  @JSName("type")
  var type_StringLiteral_ : StringLiteral = js.native
  var value: String = js.native
}

object StringLiteral_ {
  @scala.inline
  def apply(end: Double, loc: SourceLocation, start: Double, `type`: StringLiteral, value: String): StringLiteral_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringLiteral_]
  }
  @scala.inline
  implicit class StringLiteral_Ops[Self <: StringLiteral_] (val x: Self) extends AnyVal {
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
    def setType(value: StringLiteral): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

