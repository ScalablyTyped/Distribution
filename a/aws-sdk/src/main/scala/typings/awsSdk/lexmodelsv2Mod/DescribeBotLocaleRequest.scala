package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBotLocaleRequest extends StObject {
  
  /**
    * The identifier of the bot associated with the locale.
    */
  var botId: Id
  
  /**
    * The identifier of the version of the bot associated with the locale.
    */
  var botVersion: BotVersion
  
  /**
    * The unique identifier of the locale to describe. The string must match one of the supported locales. For more information, see Supported languages. 
    */
  var localeId: LocaleId
}
object DescribeBotLocaleRequest {
  
  inline def apply(botId: Id, botVersion: BotVersion, localeId: LocaleId): DescribeBotLocaleRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBotLocaleRequest]
  }
  
  extension [Self <: DescribeBotLocaleRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
