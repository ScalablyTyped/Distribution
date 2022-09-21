package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSlotRequest extends StObject {
  
  /**
    * The identifier of the bot associated with the slot.
    */
  var botId: Id
  
  /**
    * The version of the bot associated with the slot.
    */
  var botVersion: BotVersion
  
  /**
    * The identifier of the intent that contains the slot.
    */
  var intentId: Id
  
  /**
    * The identifier of the language and locale of the slot to describe. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * The unique identifier for the slot.
    */
  var slotId: Id
}
object DescribeSlotRequest {
  
  inline def apply(botId: Id, botVersion: BotVersion, intentId: Id, localeId: LocaleId, slotId: Id): DescribeSlotRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], intentId = intentId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], slotId = slotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSlotRequest]
  }
  
  extension [Self <: DescribeSlotRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setIntentId(value: Id): Self = StObject.set(x, "intentId", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setSlotId(value: Id): Self = StObject.set(x, "slotId", value.asInstanceOf[js.Any])
  }
}
