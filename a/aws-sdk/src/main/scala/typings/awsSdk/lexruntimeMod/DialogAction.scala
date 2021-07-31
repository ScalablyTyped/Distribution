package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogAction extends StObject {
  
  /**
    * The fulfillment state of the intent. The possible values are:    Failed - The Lambda function associated with the intent failed to fulfill the intent.    Fulfilled - The intent has fulfilled by the Lambda function associated with the intent.     ReadyForFulfillment - All of the information necessary for the intent is present and the intent ready to be fulfilled by the client application.  
    */
  var fulfillmentState: js.UndefOr[FulfillmentState] = js.undefined
  
  /**
    * The name of the intent.
    */
  var intentName: js.UndefOr[IntentName] = js.undefined
  
  /**
    * The message that should be shown to the user. If you don't specify a message, Amazon Lex will use the message configured for the intent.
    */
  var message: js.UndefOr[Text] = js.undefined
  
  /**
    *    PlainText - The message contains plain UTF-8 text.    CustomPayload - The message is a custom format for the client.    SSML - The message contains text formatted for voice output.    Composite - The message contains an escaped JSON object containing one or more messages. For more information, see Message Groups.   
    */
  var messageFormat: js.UndefOr[MessageFormatType] = js.undefined
  
  /**
    * The name of the slot that should be elicited from the user.
    */
  var slotToElicit: js.UndefOr[String] = js.undefined
  
  /**
    * Map of the slots that have been gathered and their values. 
    */
  var slots: js.UndefOr[StringMap] = js.undefined
  
  /**
    * The next action that the bot should take in its interaction with the user. The possible values are:    ConfirmIntent - The next action is asking the user if the intent is complete and ready to be fulfilled. This is a yes/no question such as "Place the order?"    Close - Indicates that the there will not be a response from the user. For example, the statement "Your order has been placed" does not require a response.    Delegate - The next action is determined by Amazon Lex.    ElicitIntent - The next action is to determine the intent that the user wants to fulfill.    ElicitSlot - The next action is to elicit a slot value from the user.  
    */
  var `type`: DialogActionType
}
object DialogAction {
  
  @scala.inline
  def apply(`type`: DialogActionType): DialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogAction]
  }
  
  @scala.inline
  implicit class DialogActionMutableBuilder[Self <: DialogAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFulfillmentState(value: FulfillmentState): Self = StObject.set(x, "fulfillmentState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentStateUndefined: Self = StObject.set(x, "fulfillmentState", js.undefined)
    
    @scala.inline
    def setIntentName(value: IntentName): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentNameUndefined: Self = StObject.set(x, "intentName", js.undefined)
    
    @scala.inline
    def setMessage(value: Text): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFormat(value: MessageFormatType): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setSlotToElicit(value: String): Self = StObject.set(x, "slotToElicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotToElicitUndefined: Self = StObject.set(x, "slotToElicit", js.undefined)
    
    @scala.inline
    def setSlots(value: StringMap): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
    
    @scala.inline
    def setType(value: DialogActionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
