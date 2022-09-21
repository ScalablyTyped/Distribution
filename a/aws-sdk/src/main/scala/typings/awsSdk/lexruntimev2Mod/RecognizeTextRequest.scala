package typings.awsSdk.lexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizeTextRequest extends StObject {
  
  /**
    * The alias identifier in use for the bot that processes the request.
    */
  var botAliasId: BotAliasIdentifier
  
  /**
    * The identifier of the bot that processes the request.
    */
  var botId: BotIdentifier
  
  /**
    * The locale where the session is in use.
    */
  var localeId: LocaleId
  
  /**
    * Request-specific information passed between the client application and Amazon Lex V2  The namespace x-amz-lex: is reserved for special attributes. Don't create any request attributes with the prefix x-amz-lex:.
    */
  var requestAttributes: js.UndefOr[StringMap] = js.undefined
  
  /**
    * The identifier of the user session that is having the conversation.
    */
  var sessionId: SessionId
  
  /**
    * The current state of the dialog between the user and the bot.
    */
  var sessionState: js.UndefOr[SessionState] = js.undefined
  
  /**
    * The text that the user entered. Amazon Lex V2 interprets this text.
    */
  var text: Text
}
object RecognizeTextRequest {
  
  inline def apply(
    botAliasId: BotAliasIdentifier,
    botId: BotIdentifier,
    localeId: LocaleId,
    sessionId: SessionId,
    text: Text
  ): RecognizeTextRequest = {
    val __obj = js.Dynamic.literal(botAliasId = botAliasId.asInstanceOf[js.Any], botId = botId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizeTextRequest]
  }
  
  extension [Self <: RecognizeTextRequest](x: Self) {
    
    inline def setBotAliasId(value: BotAliasIdentifier): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotId(value: BotIdentifier): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributes(value: StringMap): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionState(value: SessionState): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
    
    inline def setSessionStateUndefined: Self = StObject.set(x, "sessionState", js.undefined)
    
    inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
