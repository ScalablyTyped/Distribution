package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrStatement extends js.Object {
  /**
    * The statements to combine with OR logic. You can use any statements that can be nested.
    */
  var Statements: typings.awsSdk.wafv2Mod.Statements = js.native
}

object OrStatement {
  @scala.inline
  def apply(Statements: Statements): OrStatement = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrStatement]
  }
  @scala.inline
  implicit class OrStatementOps[Self <: OrStatement] (val x: Self) extends AnyVal {
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
    def setStatementsVarargs(value: Statement*): Self = this.set("Statements", js.Array(value :_*))
    @scala.inline
    def setStatements(value: Statements): Self = this.set("Statements", value.asInstanceOf[js.Any])
  }
  
}

