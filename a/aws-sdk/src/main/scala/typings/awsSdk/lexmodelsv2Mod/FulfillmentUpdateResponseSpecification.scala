package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FulfillmentUpdateResponseSpecification extends StObject {
  
  /**
    * Determines whether the user can interrupt an update message while it is playing.
    */
  var allowInterrupt: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The frequency that a message is sent to the user. When the period ends, Amazon Lex chooses a message from the message groups and plays it to the user. If the fulfillment Lambda returns before the first period ends, an update message is not played to the user.
    */
  var frequencyInSeconds: FulfillmentUpdateResponseFrequency
  
  /**
    * One to 5 message groups that contain update messages. Amazon Lex chooses one of the messages to play to the user.
    */
  var messageGroups: MessageGroupsList
}
object FulfillmentUpdateResponseSpecification {
  
  inline def apply(frequencyInSeconds: FulfillmentUpdateResponseFrequency, messageGroups: MessageGroupsList): FulfillmentUpdateResponseSpecification = {
    val __obj = js.Dynamic.literal(frequencyInSeconds = frequencyInSeconds.asInstanceOf[js.Any], messageGroups = messageGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[FulfillmentUpdateResponseSpecification]
  }
  
  extension [Self <: FulfillmentUpdateResponseSpecification](x: Self) {
    
    inline def setAllowInterrupt(value: BoxedBoolean): Self = StObject.set(x, "allowInterrupt", value.asInstanceOf[js.Any])
    
    inline def setAllowInterruptUndefined: Self = StObject.set(x, "allowInterrupt", js.undefined)
    
    inline def setFrequencyInSeconds(value: FulfillmentUpdateResponseFrequency): Self = StObject.set(x, "frequencyInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMessageGroups(value: MessageGroupsList): Self = StObject.set(x, "messageGroups", value.asInstanceOf[js.Any])
    
    inline def setMessageGroupsVarargs(value: MessageGroup*): Self = StObject.set(x, "messageGroups", js.Array(value*))
  }
}
