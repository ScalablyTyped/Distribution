package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSessionResponse extends StObject {
  
  /**
    * A list of active contexts for the session.
    */
  var activeContexts: js.UndefOr[ActiveContextsString] = js.native
  
  /**
    * The audio version of the message to convey to the user.
    */
  var audioStream: js.UndefOr[BlobStream] = js.native
  
  /**
    * Content type as specified in the Accept HTTP header in the request.
    */
  var contentType: js.UndefOr[HttpContentType] = js.native
  
  /**
    *     ConfirmIntent - Amazon Lex is expecting a "yes" or "no" response to confirm the intent before fulfilling an intent.    ElicitIntent - Amazon Lex wants to elicit the user's intent.    ElicitSlot - Amazon Lex is expecting the value of a slot for the current intent.    Failed - Conveys that the conversation with the user has failed. This can happen for various reasons, including the user does not provide an appropriate response to prompts from the service, or if the Lambda function fails to fulfill the intent.    Fulfilled - Conveys that the Lambda function has sucessfully fulfilled the intent.    ReadyForFulfillment - Conveys that the client has to fulfill the intent.  
    */
  var dialogState: js.UndefOr[DialogState] = js.native
  
  /**
    * The name of the current intent.
    */
  var intentName: js.UndefOr[IntentName] = js.native
  
  /**
    * The next message that should be presented to the user.
    */
  var message: js.UndefOr[Text] = js.native
  
  /**
    * The format of the response message. One of the following values:    PlainText - The message contains plain UTF-8 text.    CustomPayload - The message is a custom format for the client.    SSML - The message contains text formatted for voice output.    Composite - The message contains an escaped JSON object containing one or more messages from the groups that messages were assigned to when the intent was created.  
    */
  var messageFormat: js.UndefOr[MessageFormatType] = js.native
  
  /**
    * Map of key/value pairs representing session-specific context information.
    */
  var sessionAttributes: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.native
  
  /**
    * If the dialogState is ElicitSlot, returns the name of the slot for which Amazon Lex is eliciting a value.
    */
  var slotToElicit: js.UndefOr[String] = js.native
  
  /**
    * Map of zero or more intent slots Amazon Lex detected from the user input during the conversation. Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined by the valueSelectionStrategy selected when the slot type was created or updated. If valueSelectionStrategy is set to ORIGINAL_VALUE, the value provided by the user is returned, if the user value is similar to the slot values. If valueSelectionStrategy is set to TOP_RESOLUTION Amazon Lex returns the first value in the resolution list or, if there is no resolution list, null. If you don't specify a valueSelectionStrategy the default is ORIGINAL_VALUE. 
    */
  var slots: js.UndefOr[String] = js.native
}
object PutSessionResponse {
  
  @scala.inline
  def apply(): PutSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSessionResponse]
  }
  
  @scala.inline
  implicit class PutSessionResponseMutableBuilder[Self <: PutSessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveContexts(value: ActiveContextsString): Self = StObject.set(x, "activeContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveContextsUndefined: Self = StObject.set(x, "activeContexts", js.undefined)
    
    @scala.inline
    def setAudioStream(value: BlobStream): Self = StObject.set(x, "audioStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioStreamUndefined: Self = StObject.set(x, "audioStream", js.undefined)
    
    @scala.inline
    def setContentType(value: HttpContentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setDialogState(value: DialogState): Self = StObject.set(x, "dialogState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogStateUndefined: Self = StObject.set(x, "dialogState", js.undefined)
    
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
    def setSessionAttributes(value: String): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAttributesUndefined: Self = StObject.set(x, "sessionAttributes", js.undefined)
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    @scala.inline
    def setSlotToElicit(value: String): Self = StObject.set(x, "slotToElicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotToElicitUndefined: Self = StObject.set(x, "slotToElicit", js.undefined)
    
    @scala.inline
    def setSlots(value: String): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
  }
}
