package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.ForStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForStatement_
  extends Node
     with BlockParent
     with For
     with Loop
     with Scopable
     with Statement {
  var body: Statement = js.native
  var init: VariableDeclaration_ | Expression = js.native
  var test: Expression = js.native
  @JSName("type")
  var type_ForStatement_ : ForStatement = js.native
  var update: Expression = js.native
}

object ForStatement_ {
  @scala.inline
  def apply(
    body: Statement,
    end: Double,
    init: VariableDeclaration_ | Expression,
    loc: SourceLocation,
    start: Double,
    test: Expression,
    `type`: ForStatement,
    update: Expression
  ): ForStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForStatement_]
  }
  @scala.inline
  implicit class ForStatement_Ops[Self <: ForStatement_] (val x: Self) extends AnyVal {
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
    def setBody(value: Statement): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setInit(value: VariableDeclaration_ | Expression): Self = this.set("init", value.asInstanceOf[js.Any])
    @scala.inline
    def setTest(value: Expression): Self = this.set("test", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ForStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: Expression): Self = this.set("update", value.asInstanceOf[js.Any])
  }
  
}

