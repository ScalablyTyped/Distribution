package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRoleResponse extends StObject {
  
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
  implicit class TestRoleResponseMutableBuilder[Self <: TestRoleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: ExceptionMessages): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: String*): Self = StObject.set(x, "Messages", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
  }
}
