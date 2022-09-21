package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentStatusSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the agent status.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for an agent status.
    */
  var Id: js.UndefOr[AgentStatusId] = js.undefined
  
  /**
    * The name of the agent status.
    */
  var Name: js.UndefOr[AgentStatusName] = js.undefined
  
  /**
    * The type of the agent status.
    */
  var Type: js.UndefOr[AgentStatusType] = js.undefined
}
object AgentStatusSummary {
  
  inline def apply(): AgentStatusSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentStatusSummary]
  }
  
  extension [Self <: AgentStatusSummary](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: AgentStatusId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: AgentStatusName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: AgentStatusType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
