package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIntentRequest extends StObject {
  
  /**
    * The identifier of the bot associated with the intent.
    */
  var botId: Id
  
  /**
    * The version of the bot associated with the intent.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The unique identifier of the intent to delete.
    */
  var intentId: Id
  
  /**
    * The identifier of the language and locale where the bot will be deleted. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
}
object DeleteIntentRequest {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, intentId: Id, localeId: LocaleId): DeleteIntentRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], intentId = intentId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntentRequest]
  }
  
  extension [Self <: DeleteIntentRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
