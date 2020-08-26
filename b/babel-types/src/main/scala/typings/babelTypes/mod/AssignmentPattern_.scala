package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.AssignmentPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignmentPattern_
  extends Node
     with LVal
     with Pattern {
  var left: Identifier_ = js.native
  var right: Expression = js.native
  @JSName("type")
  var type_AssignmentPattern_ : AssignmentPattern = js.native
}

object AssignmentPattern_ {
  @scala.inline
  def apply(
    end: Double,
    left: Identifier_,
    loc: SourceLocation,
    right: Expression,
    start: Double,
    `type`: AssignmentPattern
  ): AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignmentPattern_]
  }
  @scala.inline
  implicit class AssignmentPattern_Ops[Self <: AssignmentPattern_] (val x: Self) extends AnyVal {
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
    def setLeft(value: Identifier_): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Expression): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: AssignmentPattern): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

