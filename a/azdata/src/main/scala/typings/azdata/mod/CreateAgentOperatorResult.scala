package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAgentOperatorResult extends ResultStatus {
  
  var operator: AgentOperatorInfo = js.native
}
object CreateAgentOperatorResult {
  
  @scala.inline
  def apply(errorMessage: String, operator: AgentOperatorInfo, success: Boolean): CreateAgentOperatorResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgentOperatorResult]
  }
  
  @scala.inline
  implicit class CreateAgentOperatorResultMutableBuilder[Self <: CreateAgentOperatorResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: AgentOperatorInfo): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
  }
}
