package typings.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRoleResponse extends js.Object {
  
  /**
    * If the Success element contains false, this value is an array of one or more error messages that were generated during the test process.
    */
  var Messages: js.UndefOr[ExceptionMessages] = js.native
  
  /**
    * If the operation is successful, this value is true; otherwise, the value is false.
    */
  var Success: js.UndefOr[typings.awsSdk.elastictranscoderMod.Success] = js.native
}
object TestRoleResponse {
  
  @scala.inline
  def apply(): TestRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRoleResponse]
  }
  
  @scala.inline
  implicit class TestRoleResponseOps[Self <: TestRoleResponse] (val x: Self) extends AnyVal {
    
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
    def setMessagesVarargs(value: String*): Self = this.set("Messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: ExceptionMessages): Self = this.set("Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("Messages", js.undefined)
    
    @scala.inline
    def setSuccess(value: Success): Self = this.set("Success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccess: Self = this.set("Success", js.undefined)
  }
}
