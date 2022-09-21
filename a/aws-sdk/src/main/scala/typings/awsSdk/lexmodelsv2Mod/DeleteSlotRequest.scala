package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSlotRequest extends StObject {
  
  /**
    * The identifier of the bot associated with the slot to delete.
    */
  var botId: Id
  
  /**
    * The version of the bot associated with the slot to delete.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The identifier of the intent associated with the slot.
    */
  var intentId: Id
  
  /**
    * The identifier of the language and locale that the slot will be deleted from. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * The identifier of the slot to delete. 
    */
  var slotId: Id
}
object DeleteSlotRequest {
  
  inline def apply(botId: Id, botVersion: DraftBotVersion, intentId: Id, localeId: LocaleId, slotId: Id): DeleteSlotRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], intentId = intentId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], slotId = slotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSlotRequest]
  }
  
  extension [Self <: DeleteSlotRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setSlotId(value: Id): Self = StObject.set(x, "slotId", value.asInstanceOf[js.Any])
  }
}
