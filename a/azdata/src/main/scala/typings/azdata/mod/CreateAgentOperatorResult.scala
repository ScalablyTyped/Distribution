package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgentOperatorResult
  extends StObject
     with ResultStatus {
  
  var operator: AgentOperatorInfo
}
object CreateAgentOperatorResult {
  
  inline def apply(errorMessage: String, operator: AgentOperatorInfo, success: Boolean): CreateAgentOperatorResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentOperatorResult]
  }
  
  extension [Self <: CreateAgentOperatorResult](x: Self) {
    
    inline def setOperator(value: AgentOperatorInfo): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
