package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contact extends StObject {
  
  /**
    * Information about the agent who accepted the contact.
    */
  var AgentInfo: js.UndefOr[typings.awsSdk.connectMod.AgentInfo] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the contact.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * How the contact reached your contact center.
    */
  var Channel: js.UndefOr[typings.awsSdk.connectMod.Channel] = js.undefined
  
  /**
    * The description of the contact.
    */
  var Description: js.UndefOr[typings.awsSdk.connectMod.Description] = js.undefined
  
  /**
    * The timestamp when the customer endpoint disconnected from Amazon Connect.
    */
  var DisconnectTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier for the contact.
    */
  var Id: js.UndefOr[ContactId] = js.undefined
  
  /**
    * If this contact is related to other contacts, this is the ID of the initial contact.
    */
  var InitialContactId: js.UndefOr[ContactId] = js.undefined
  
  /**
    * Indicates how the contact was initiated.
    */
  var InitiationMethod: js.UndefOr[ContactInitiationMethod] = js.undefined
  
  /**
    * The date and time this contact was initiated, in UTC time. For INBOUND, this is when the contact arrived. For OUTBOUND, this is when the agent began dialing. For CALLBACK, this is when the callback contact was created. For TRANSFER and QUEUE_TRANSFER, this is when the transfer was initiated. For API, this is when the request arrived.
    */
  var InitiationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp when contact was last updated.
    */
  var LastUpdateTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the contact.
    */
  var Name: js.UndefOr[typings.awsSdk.connectMod.Name] = js.undefined
  
  /**
    * If this contact is not the first contact, this is the ID of the previous contact.
    */
  var PreviousContactId: js.UndefOr[ContactId] = js.undefined
  
  /**
    * If this contact was queued, this contains information about the queue. 
    */
  var QueueInfo: js.UndefOr[typings.awsSdk.connectMod.QueueInfo] = js.undefined
  
  /**
    * The timestamp, in Unix epoch time format, at which to start running the inbound flow. 
    */
  var ScheduledTimestamp: js.UndefOr[js.Date] = js.undefined
}
object Contact {
  
  inline def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  
  extension [Self <: Contact](x: Self) {
    
    inline def setAgentInfo(value: AgentInfo): Self = StObject.set(x, "AgentInfo", value.asInstanceOf[js.Any])
    
    inline def setAgentInfoUndefined: Self = StObject.set(x, "AgentInfo", js.undefined)
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "Channel", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisconnectTimestamp(value: js.Date): Self = StObject.set(x, "DisconnectTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDisconnectTimestampUndefined: Self = StObject.set(x, "DisconnectTimestamp", js.undefined)
    
    inline def setId(value: ContactId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInitialContactId(value: ContactId): Self = StObject.set(x, "InitialContactId", value.asInstanceOf[js.Any])
    
    inline def setInitialContactIdUndefined: Self = StObject.set(x, "InitialContactId", js.undefined)
    
    inline def setInitiationMethod(value: ContactInitiationMethod): Self = StObject.set(x, "InitiationMethod", value.asInstanceOf[js.Any])
    
    inline def setInitiationMethodUndefined: Self = StObject.set(x, "InitiationMethod", js.undefined)
    
    inline def setInitiationTimestamp(value: js.Date): Self = StObject.set(x, "InitiationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInitiationTimestampUndefined: Self = StObject.set(x, "InitiationTimestamp", js.undefined)
    
    inline def setLastUpdateTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdateTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimestampUndefined: Self = StObject.set(x, "LastUpdateTimestamp", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPreviousContactId(value: ContactId): Self = StObject.set(x, "PreviousContactId", value.asInstanceOf[js.Any])
    
    inline def setPreviousContactIdUndefined: Self = StObject.set(x, "PreviousContactId", js.undefined)
    
    inline def setQueueInfo(value: QueueInfo): Self = StObject.set(x, "QueueInfo", value.asInstanceOf[js.Any])
    
    inline def setQueueInfoUndefined: Self = StObject.set(x, "QueueInfo", js.undefined)
    
    inline def setScheduledTimestamp(value: js.Date): Self = StObject.set(x, "ScheduledTimestamp", value.asInstanceOf[js.Any])
    
    inline def setScheduledTimestampUndefined: Self = StObject.set(x, "ScheduledTimestamp", js.undefined)
  }
}
