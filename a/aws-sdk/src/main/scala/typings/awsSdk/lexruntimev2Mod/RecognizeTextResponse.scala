package typings.awsSdk.lexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeTextResponse extends StObject {
  
  /**
    * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.  Each interpretation includes the intent, a score that indicates now confident Amazon Lex V2 is that the interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in the utterance.
    */
  var interpretations: js.UndefOr[Interpretations] = js.undefined
  
  /**
    * A list of messages last sent to the user. The messages are ordered based on the order that you returned the messages from your Lambda function or the order that the messages are defined in the bot.
    */
  var messages: js.UndefOr[Messages] = js.undefined
  
  /**
    * The attributes sent in the request.
    */
  var requestAttributes: js.UndefOr[StringMap] = js.undefined
  
  /**
    * The identifier of the session in use.
    */
  var sessionId: js.UndefOr[SessionId] = js.undefined
  
  /**
    * Represents the current state of the dialog between the user and the bot.  Use this to determine the progress of the conversation and what the next action may be.
    */
  var sessionState: js.UndefOr[SessionState] = js.undefined
}
object RecognizeTextResponse {
  
  inline def apply(): RecognizeTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecognizeTextResponse]
  }
  
  extension [Self <: RecognizeTextResponse](x: Self) {
    
    inline def setInterpretations(value: Interpretations): Self = StObject.set(x, "interpretations", value.asInstanceOf[js.Any])
    
    inline def setInterpretationsUndefined: Self = StObject.set(x, "interpretations", js.undefined)
    
    inline def setInterpretationsVarargs(value: Interpretation*): Self = StObject.set(x, "interpretations", js.Array(value*))
    
    inline def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setRequestAttributes(value: StringMap): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSessionState(value: SessionState): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
    
    inline def setSessionStateUndefined: Self = StObject.set(x, "sessionState", js.undefined)
  }
}
