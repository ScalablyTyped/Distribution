package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentStatusReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent's status.
    */
  var StatusArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The start timestamp of the agent's status.
    */
  var StatusStartTimestamp: js.UndefOr[js.Date] = js.undefined
}
object AgentStatusReference {
  
  inline def apply(): AgentStatusReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentStatusReference]
  }
  
  extension [Self <: AgentStatusReference](x: Self) {
    
    inline def setStatusArn(value: ARN): Self = StObject.set(x, "StatusArn", value.asInstanceOf[js.Any])
    
    inline def setStatusArnUndefined: Self = StObject.set(x, "StatusArn", js.undefined)
    
    inline def setStatusStartTimestamp(value: js.Date): Self = StObject.set(x, "StatusStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStatusStartTimestampUndefined: Self = StObject.set(x, "StatusStartTimestamp", js.undefined)
  }
}
