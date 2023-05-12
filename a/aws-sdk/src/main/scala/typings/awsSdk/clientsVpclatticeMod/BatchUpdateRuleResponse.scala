package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateRuleResponse extends StObject {
  
  /**
    * The rules that were successfully updated.
    */
  var successful: js.UndefOr[RuleUpdateSuccessList] = js.undefined
  
  /**
    * The rules that the operation couldn't update.
    */
  var unsuccessful: js.UndefOr[RuleUpdateFailureList] = js.undefined
}
object BatchUpdateRuleResponse {
  
  inline def apply(): BatchUpdateRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setSuccessful(value: RuleUpdateSuccessList): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: RuleUpdateSuccess*): Self = StObject.set(x, "successful", js.Array(value*))
    
    inline def setUnsuccessful(value: RuleUpdateFailureList): Self = StObject.set(x, "unsuccessful", value.asInstanceOf[js.Any])
    
    inline def setUnsuccessfulUndefined: Self = StObject.set(x, "unsuccessful", js.undefined)
    
    inline def setUnsuccessfulVarargs(value: RuleUpdateFailure*): Self = StObject.set(x, "unsuccessful", js.Array(value*))
  }
}
