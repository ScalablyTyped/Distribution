package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendCommandResult extends js.Object {
  
  /**
    * The request as it was received by Systems Manager. Also provides the command ID which can be used future references to this request.
    */
  var Command: js.UndefOr[typings.awsSdk.ssmMod.Command] = js.native
}
object SendCommandResult {
  
  @scala.inline
  def apply(): SendCommandResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendCommandResult]
  }
  
  @scala.inline
  implicit class SendCommandResultOps[Self <: SendCommandResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommand(value: Command): Self = this.set("Command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("Command", js.undefined)
  }
}
