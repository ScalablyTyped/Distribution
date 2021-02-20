package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentOperatorsResult extends ResultStatus {
  
  var operators: js.Array[AgentOperatorInfo] = js.native
}
object AgentOperatorsResult {
  
  @scala.inline
  def apply(errorMessage: String, operators: js.Array[AgentOperatorInfo], success: Boolean): AgentOperatorsResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOperatorsResult]
  }
  
  @scala.inline
  implicit class AgentOperatorsResultMutableBuilder[Self <: AgentOperatorsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperators(value: js.Array[AgentOperatorInfo]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsVarargs(value: AgentOperatorInfo*): Self = StObject.set(x, "operators", js.Array(value :_*))
  }
}
