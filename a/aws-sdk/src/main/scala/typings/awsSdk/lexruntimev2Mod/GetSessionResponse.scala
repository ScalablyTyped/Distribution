package typings.awsSdk.lexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionResponse extends StObject {
  
  /**
    * A list of intents that Amazon Lex V2 determined might satisfy the user's utterance.  Each interpretation includes the intent, a score that indicates how confident Amazon Lex V2 is that the interpretation is the correct one, and an optional sentiment response that indicates the sentiment expressed in the utterance.
    */
  var interpretations: js.UndefOr[Interpretations] = js.undefined
  
  /**
    * A list of messages that were last sent to the user. The messages are ordered based on the order that your returned the messages from your Lambda function or the order that messages are defined in the bot. 
    */
  var messages: js.UndefOr[Messages] = js.undefined
  
  /**
    * The identifier of the returned session.
    */
  var sessionId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Represents the current state of the dialog between the user and the bot. You can use this to determine the progress of the conversation and what the next action might be.
    */
  var sessionState: js.UndefOr[SessionState] = js.undefined
}
object GetSessionResponse {
  
  inline def apply(): GetSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSessionResponse]
  }
  
  extension [Self <: GetSessionResponse](x: Self) {
    
    inline def setInterpretations(value: Interpretations): Self = StObject.set(x, "interpretations", value.asInstanceOf[js.Any])
    
    inline def setInterpretationsUndefined: Self = StObject.set(x, "interpretations", js.undefined)
    
    inline def setInterpretationsVarargs(value: Interpretation*): Self = StObject.set(x, "interpretations", js.Array(value*))
    
    inline def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setSessionId(value: NonEmptyString): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
    
    inline def setSessionState(value: SessionState): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
    
    inline def setSessionStateUndefined: Self = StObject.set(x, "sessionState", js.undefined)
  }
}
