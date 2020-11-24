package typings.azdata.mod.nb

import typings.azdata.azdataStrings.abort
import typings.azdata.azdataStrings.error
import typings.azdata.azdataStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteReply extends js.Object {
  
  var execution_count: Double | Null = js.native
  
  var status: ok | error | abort = js.native
}
object IExecuteReply {
  
  @scala.inline
  def apply(status: ok | error | abort): IExecuteReply = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReply]
  }
  
  @scala.inline
  implicit class IExecuteReplyOps[Self <: IExecuteReply] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: ok | error | abort): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_count(value: Double): Self = this.set("execution_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecution_countNull: Self = this.set("execution_count", null)
  }
}
