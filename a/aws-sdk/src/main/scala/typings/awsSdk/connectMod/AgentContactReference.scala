package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentContactReference extends StObject {
  
  /**
    * The state of the contact.
    */
  var AgentContactState: js.UndefOr[ContactState] = js.undefined
  
  /**
    * The channel of the contact.
    */
  var Channel: js.UndefOr[typings.awsSdk.connectMod.Channel] = js.undefined
  
  /**
    * The time at which the contact was connected to an agent.
    */
  var ConnectedToAgentTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the contact in this instance of Amazon Connect. 
    */
  var ContactId: js.UndefOr[typings.awsSdk.connectMod.ContactId] = js.undefined
  
  /**
    * How the contact was initiated.
    */
  var InitiationMethod: js.UndefOr[ContactInitiationMethod] = js.undefined
  
  var Queue: js.UndefOr[QueueReference] = js.undefined
  
  /**
    * The epoch timestamp when the contact state started.
    */
  var StateStartTimestamp: js.UndefOr[js.Date] = js.undefined
}
object AgentContactReference {
  
  inline def apply(): AgentContactReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentContactReference]
  }
  
  extension [Self <: AgentContactReference](x: Self) {
    
    inline def setAgentContactState(value: ContactState): Self = StObject.set(x, "AgentContactState", value.asInstanceOf[js.Any])
    
    inline def setAgentContactStateUndefined: Self = StObject.set(x, "AgentContactState", js.undefined)
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
    
    inline def setConnectedToAgentTimestamp(value: js.Date): Self = StObject.set(x, "ConnectedToAgentTimestamp", value.asInstanceOf[js.Any])
    
    inline def setConnectedToAgentTimestampUndefined: Self = StObject.set(x, "ConnectedToAgentTimestamp", js.undefined)
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
    
    inline def setInitiationMethod(value: ContactInitiationMethod): Self = StObject.set(x, "InitiationMethod", value.asInstanceOf[js.Any])
    
    inline def setInitiationMethodUndefined: Self = StObject.set(x, "InitiationMethod", js.undefined)
    
    inline def setQueue(value: QueueReference): Self = StObject.set(x, "Queue", value.asInstanceOf[js.Any])
    
    inline def setQueueUndefined: Self = StObject.set(x, "Queue", js.undefined)
    
    inline def setStateStartTimestamp(value: js.Date): Self = StObject.set(x, "StateStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStateStartTimestampUndefined: Self = StObject.set(x, "StateStartTimestamp", js.undefined)
  }
}
