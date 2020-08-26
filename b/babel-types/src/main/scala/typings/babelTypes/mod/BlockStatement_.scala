package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BlockStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlockStatement_
  extends Node
     with Block
     with BlockParent
     with Scopable
     with Statement {
  var body: js.Array[Statement] = js.native
  var directives: js.UndefOr[js.Array[Directive_]] = js.native
  @JSName("type")
  var type_BlockStatement_ : BlockStatement = js.native
}

object BlockStatement_ {
  @scala.inline
  def apply(body: js.Array[Statement], end: Double, loc: SourceLocation, start: Double, `type`: BlockStatement): BlockStatement_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement_]
  }
  @scala.inline
  implicit class BlockStatement_Ops[Self <: BlockStatement_] (val x: Self) extends AnyVal {
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
    def setBodyVarargs(value: Statement*): Self = this.set("body", js.Array(value :_*))
    @scala.inline
    def setBody(value: js.Array[Statement]): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BlockStatement): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectivesVarargs(value: Directive_ *): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[Directive_]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
  }
  
}

