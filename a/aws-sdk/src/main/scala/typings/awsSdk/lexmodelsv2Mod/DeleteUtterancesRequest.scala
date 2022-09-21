package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUtterancesRequest extends StObject {
  
  /**
    * The unique identifier of the bot that contains the utterances.
    */
  var botId: Id
  
  /**
    * The identifier of the language and locale where the utterances were collected. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The unique identifier of the session with the user. The ID is returned in the response from the RecognizeText and RecognizeUtterance operations.
    */
  var sessionId: js.UndefOr[SessionId] = js.undefined
}
object DeleteUtterancesRequest {
  
  inline def apply(botId: Id): DeleteUtterancesRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUtterancesRequest]
  }
  
  extension [Self <: DeleteUtterancesRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
