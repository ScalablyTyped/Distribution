package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgentOperatorResult
  extends StObject
     with ResultStatus {
  
  var operator: AgentOperatorInfo
}
object UpdateAgentOperatorResult {
  
  inline def apply(errorMessage: String, operator: AgentOperatorInfo, success: Boolean): UpdateAgentOperatorResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentOperatorResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAgentOperatorResult] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: AgentOperatorInfo): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
