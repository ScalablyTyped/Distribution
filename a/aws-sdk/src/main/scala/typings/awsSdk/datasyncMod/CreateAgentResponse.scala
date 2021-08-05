package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgentResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent. Use the ListAgents operation to return a list of agents for your account and AWS Region.
    */
  var AgentArn: js.UndefOr[typings.awsSdk.datasyncMod.AgentArn] = js.undefined
}
object CreateAgentResponse {
  
  inline def apply(): CreateAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAgentResponse]
  }
  
  extension [Self <: CreateAgentResponse](x: Self) {
    
    inline def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
    
    inline def setAgentArnUndefined: Self = StObject.set(x, "AgentArn", js.undefined)
  }
}
