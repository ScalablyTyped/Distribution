package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAgentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent to delete. Use the ListAgents operation to return a list of agents for your account and AWS Region.
    */
  var AgentArn: typings.awsSdk.datasyncMod.AgentArn
}
object DeleteAgentRequest {
  
  @scala.inline
  def apply(AgentArn: AgentArn): DeleteAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAgentRequest]
  }
  
  @scala.inline
  implicit class DeleteAgentRequestMutableBuilder[Self <: DeleteAgentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
  }
}
