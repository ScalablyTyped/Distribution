package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotStatement extends js.Object {
  
  /**
    * The statement to negate. You can use any statement that can be nested.
    */
  var Statement: typings.awsSdk.wafv2Mod.Statement = js.native
}
object NotStatement {
  
  @scala.inline
  def apply(Statement: Statement): NotStatement = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotStatement]
  }
  
  @scala.inline
  implicit class NotStatementOps[Self <: NotStatement] (val x: Self) extends AnyVal {
    
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
    def setStatement(value: Statement): Self = this.set("Statement", value.asInstanceOf[js.Any])
  }
}
