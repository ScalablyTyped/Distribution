package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.IfStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IfStatement_
  extends Node
     with Conditional
     with Statement {
  var alternate: Statement = js.native
  var consequent: Statement = js.native
  var test: Expression = js.native
  @JSName("type")
  var type_IfStatement_ : IfStatement = js.native
}

object IfStatement_ {
  @scala.inline
  def apply(
    alternate: Statement,
    consequent: Statement,
    end: Double,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: IfStatement
  ): IfStatement_ = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement_]
  }
  @scala.inline
  implicit class IfStatement_Ops[Self <: IfStatement_] (val x: Self) extends AnyVal {
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
    def setAlternate(value: Statement): Self = this.set("alternate", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsequent(value: Statement): Self = this.set("consequent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: Expression): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: IfStatement): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

