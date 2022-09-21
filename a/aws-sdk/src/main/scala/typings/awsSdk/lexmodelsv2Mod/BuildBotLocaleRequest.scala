package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBotLocaleRequest extends StObject {
  
  /**
    * The identifier of the bot to build. The identifier is returned in the response from the CreateBot operation.
    */
  var botId: Id
  
  /**
    * The version of the bot to build. This can only be the draft version of the bot.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The identifier of the language and locale that the bot will be used in. The string must match one of the supported locales. All of the intents, slot types, and slots used in the bot must have the same locale. For more information, see Supported languages.
    */
  var localeId: LocaleId
}
object BuildBotLocaleRequest {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, localeId: LocaleId): BuildBotLocaleRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildBotLocaleRequest]
  }
  
  extension [Self <: BuildBotLocaleRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
