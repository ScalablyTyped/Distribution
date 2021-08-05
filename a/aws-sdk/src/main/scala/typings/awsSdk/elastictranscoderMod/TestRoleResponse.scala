package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRoleResponse extends StObject {
  
  /**
    * If the Success element contains false, this value is an array of one or more error messages that were generated during the test process.
    */
  var Messages: js.UndefOr[ExceptionMessages] = js.undefined
  
  /**
    * If the operation is successful, this value is true; otherwise, the value is false.
    */
  var Success: js.UndefOr[typings.awsSdk.elastictranscoderMod.Success] = js.undefined
}
object TestRoleResponse {
  
  inline def apply(): TestRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRoleResponse]
  }
  
  extension [Self <: TestRoleResponse](x: Self) {
    
    inline def setMessages(value: ExceptionMessages): Self = StObject.set(x, "Messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "Messages", js.undefined)
    
    inline def setMessagesVarargs(value: String*): Self = StObject.set(x, "Messages", js.Array(value :_*))
    
    inline def setSuccess(value: Success): Self = StObject.set(x, "Success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "Success", js.undefined)
  }
}
