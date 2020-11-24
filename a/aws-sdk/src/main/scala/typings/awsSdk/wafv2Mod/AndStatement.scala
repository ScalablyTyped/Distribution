package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndStatement extends js.Object {
  
  /**
    * The statements to combine with AND logic. You can use any statements that can be nested. 
    */
  var Statements: typings.awsSdk.wafv2Mod.Statements = js.native
}
object AndStatement {
  
  @scala.inline
  def apply(Statements: Statements): AndStatement = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndStatement]
  }
  
  @scala.inline
  implicit class AndStatementOps[Self <: AndStatement] (val x: Self) extends AnyVal {
    
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
