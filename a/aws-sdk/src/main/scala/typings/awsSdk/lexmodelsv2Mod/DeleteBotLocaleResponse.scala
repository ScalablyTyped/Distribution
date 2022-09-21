package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotLocaleResponse extends StObject {
  
  /**
    * The identifier of the bot that contained the deleted locale.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of deleting the bot locale. The locale first enters the Deleting status. Once the locale is deleted it no longer appears in the list of locales for the bot.
    */
  var botLocaleStatus: js.UndefOr[BotLocaleStatus] = js.undefined
  
  /**
    * The version of the bot that contained the deleted locale.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * The language and locale of the deleted locale.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
}
object DeleteBotLocaleResponse {
  
  inline def apply(): DeleteBotLocaleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBotLocaleResponse]
  }
  
  extension [Self <: DeleteBotLocaleResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotLocaleStatus(value: BotLocaleStatus): Self = StObject.set(x, "botLocaleStatus", value.asInstanceOf[js.Any])
    
    inline def setBotLocaleStatusUndefined: Self = StObject.set(x, "botLocaleStatus", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
  }
}
