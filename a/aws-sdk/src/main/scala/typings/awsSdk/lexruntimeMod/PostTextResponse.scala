package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostTextResponse extends StObject {
  
  /**
    * A list of active contexts for the session. A context can be set when an intent is fulfilled or by calling the PostContent, PostText, or PutSession operation. You can use a context to control the intents that can follow up an intent, or to modify the operation of your application.
    */
  var activeContexts: js.UndefOr[ActiveContextsList] = js.undefined
  
  /**
    * One to four alternative intents that may be applicable to the user's intent. Each alternative includes a score that indicates how confident Amazon Lex is that the intent matches the user's intent. The intents are sorted by the confidence score.
    */
  var alternativeIntents: js.UndefOr[IntentList] = js.undefined
  
  /**
    * The version of the bot that responded to the conversation. You can use this information to help determine if one version of a bot is performing better than another version.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    *  Identifies the current state of the user interaction. Amazon Lex returns one of the following values as dialogState. The client can optionally use this information to customize the user interface.     ElicitIntent - Amazon Lex wants to elicit user intent.  For example, a user might utter an intent ("I want to order a pizza"). If Amazon Lex cannot infer the user intent from this utterance, it will return this dialogState.    ConfirmIntent - Amazon Lex is expecting a "yes" or "no" response.   For example, Amazon Lex wants user confirmation before fulfilling an intent.  Instead of a simple "yes" or "no," a user might respond with additional information. For example, "yes, but make it thick crust pizza" or "no, I want to order a drink". Amazon Lex can process such additional information (in these examples, update the crust type slot value, or change intent from OrderPizza to OrderDrink).    ElicitSlot - Amazon Lex is expecting a slot value for the current intent.  For example, suppose that in the response Amazon Lex sends this message: "What size pizza would you like?". A user might reply with the slot value (e.g., "medium"). The user might also provide additional information in the response (e.g., "medium thick crust pizza"). Amazon Lex can process such additional information appropriately.     Fulfilled - Conveys that the Lambda function configured for the intent has successfully fulfilled the intent.     ReadyForFulfillment - Conveys that the client has to fulfill the intent.     Failed - Conveys that the conversation with the user failed.   This can happen for various reasons including that the user did not provide an appropriate response to prompts from the service (you can configure how many times Amazon Lex can prompt a user for specific information), or the Lambda function failed to fulfill the intent.   
    */
  var dialogState: js.UndefOr[DialogState] = js.undefined
  
  /**
    * The current user intent that Amazon Lex is aware of.
    */
  var intentName: js.UndefOr[IntentName] = js.undefined
  
  /**
    * The message to convey to the user. The message can come from the bot's configuration or from a Lambda function. If the intent is not configured with a Lambda function, or if the Lambda function returned Delegate as the dialogAction.type its response, Amazon Lex decides on the next course of action and selects an appropriate message from the bot's configuration based on the current interaction context. For example, if Amazon Lex isn't able to understand user input, it uses a clarification prompt message. When you create an intent you can assign messages to groups. When messages are assigned to groups Amazon Lex returns one message from each group in the response. The message field is an escaped JSON string containing the messages. For more information about the structure of the JSON string returned, see msg-prompts-formats. If the Lambda function returns a message, Amazon Lex passes it to the client in its response.
    */
  var message: js.UndefOr[Text] = js.undefined
  
  /**
    * The format of the response message. One of the following values:    PlainText - The message contains plain UTF-8 text.    CustomPayload - The message is a custom format defined by the Lambda function.    SSML - The message contains text formatted for voice output.    Composite - The message contains an escaped JSON object containing one or more messages from the groups that messages were assigned to when the intent was created.  
    */
  var messageFormat: js.UndefOr[MessageFormatType] = js.undefined
  
  /**
    * Provides a score that indicates how confident Amazon Lex is that the returned intent is the one that matches the user's intent. The score is between 0.0 and 1.0. For more information, see Confidence Scores. The score is a relative score, not an absolute score. The score may change based on improvements to Amazon Lex.
    */
  var nluIntentConfidence: js.UndefOr[IntentConfidence] = js.undefined
  
  /**
    * Represents the options that the user has to respond to the current prompt. Response Card can come from the bot configuration (in the Amazon Lex console, choose the settings button next to a slot) or from a code hook (Lambda function). 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.undefined
  
  /**
    * The sentiment expressed in and utterance. When the bot is configured to send utterances to Amazon Comprehend for sentiment analysis, this field contains the result of the analysis.
    */
  var sentimentResponse: js.UndefOr[SentimentResponse] = js.undefined
  
  /**
    * A map of key-value pairs representing the session-specific context information.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.undefined
  
  /**
    * A unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  
  /**
    * If the dialogState value is ElicitSlot, returns the name of the slot for which Amazon Lex is eliciting a value. 
    */
  var slotToElicit: js.UndefOr[String] = js.undefined
  
  /**
    *  The intent slots that Amazon Lex detected from the user input in the conversation.  Amazon Lex creates a resolution list containing likely values for a slot. The value that it returns is determined by the valueSelectionStrategy selected when the slot type was created or updated. If valueSelectionStrategy is set to ORIGINAL_VALUE, the value provided by the user is returned, if the user value is similar to the slot values. If valueSelectionStrategy is set to TOP_RESOLUTION Amazon Lex returns the first value in the resolution list or, if there is no resolution list, null. If you don't specify a valueSelectionStrategy, the default is ORIGINAL_VALUE.
    */
  var slots: js.UndefOr[StringMap] = js.undefined
}
object PostTextResponse {
  
  inline def apply(): PostTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostTextResponse]
  }
  
  extension [Self <: PostTextResponse](x: Self) {
    
    inline def setActiveContexts(value: ActiveContextsList): Self = StObject.set(x, "activeContexts", value.asInstanceOf[js.Any])
    
    inline def setActiveContextsUndefined: Self = StObject.set(x, "activeContexts", js.undefined)
    
    inline def setActiveContextsVarargs(value: ActiveContext*): Self = StObject.set(x, "activeContexts", js.Array(value :_*))
    
    inline def setAlternativeIntents(value: IntentList): Self = StObject.set(x, "alternativeIntents", value.asInstanceOf[js.Any])
    
    inline def setAlternativeIntentsUndefined: Self = StObject.set(x, "alternativeIntents", js.undefined)
    
    inline def setAlternativeIntentsVarargs(value: PredictedIntent*): Self = StObject.set(x, "alternativeIntents", js.Array(value :_*))
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setDialogState(value: DialogState): Self = StObject.set(x, "dialogState", value.asInstanceOf[js.Any])
    
    inline def setDialogStateUndefined: Self = StObject.set(x, "dialogState", js.undefined)
    
    inline def setIntentName(value: IntentName): Self = StObject.set(x, "intentName", value.asInstanceOf[js.Any])
    
    inline def setIntentNameUndefined: Self = StObject.set(x, "intentName", js.undefined)
    
    inline def setMessage(value: Text): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFormat(value: MessageFormatType): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
    
    inline def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setNluIntentConfidence(value: IntentConfidence): Self = StObject.set(x, "nluIntentConfidence", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceUndefined: Self = StObject.set(x, "nluIntentConfidence", js.undefined)
    
    inline def setResponseCard(value: ResponseCard): Self = StObject.set(x, "responseCard", value.asInstanceOf[js.Any])
    
    inline def setResponseCardUndefined: Self = StObject.set(x, "responseCard", js.undefined)
    
    inline def setSentimentResponse(value: SentimentResponse): Self = StObject.set(x, "sentimentResponse", value.asInstanceOf[js.Any])
    
    inline def setSentimentResponseUndefined: Self = StObject.set(x, "sentimentResponse", js.undefined)
    
    inline def setSessionAttributes(value: StringMap): Self = StObject.set(x, "sessionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSessionAttributesUndefined: Self = StObject.set(x, "sessionAttributes", js.undefined)
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSlotToElicit(value: String): Self = StObject.set(x, "slotToElicit", value.asInstanceOf[js.Any])
    
    inline def setSlotToElicitUndefined: Self = StObject.set(x, "slotToElicit", js.undefined)
    
    inline def setSlots(value: StringMap): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setSlotsUndefined: Self = StObject.set(x, "slots", js.undefined)
  }
}
