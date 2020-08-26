package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.CatchClause
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatchClause_
  extends Node
     with Scopable {
  var body: BlockStatement_ = js.native
  var param: Identifier_ = js.native
  @JSName("type")
  var type_CatchClause_ : CatchClause = js.native
}

object CatchClause_ {
  @scala.inline
  def apply(
    body: BlockStatement_,
    end: Double,
    loc: SourceLocation,
    param: Identifier_,
    start: Double,
    `type`: CatchClause
  ): CatchClause_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatchClause_]
  }
  @scala.inline
  implicit class CatchClause_Ops[Self <: CatchClause_] (val x: Self) extends AnyVal {
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
    def setBody(value: BlockStatement_): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setParam(value: Identifier_): Self = this.set("param", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: CatchClause): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

