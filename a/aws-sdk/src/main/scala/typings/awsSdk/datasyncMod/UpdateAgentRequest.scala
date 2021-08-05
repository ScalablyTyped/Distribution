package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgentRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent to update.
    */
  var AgentArn: typings.awsSdk.datasyncMod.AgentArn
  
  /**
    * The name that you want to use to configure the agent.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
}
object UpdateAgentRequest {
  
  inline def apply(AgentArn: AgentArn): UpdateAgentRequest = {
    val __obj = js.Dynamic.literal(AgentArn = AgentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgentRequest]
  }
  
  extension [Self <: UpdateAgentRequest](x: Self) {
    
    inline def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
    
    inline def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
