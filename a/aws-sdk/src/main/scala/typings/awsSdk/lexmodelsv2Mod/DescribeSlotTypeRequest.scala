package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSlotTypeRequest extends StObject {
  
  /**
    * The identifier of the bot associated with the slot type.
    */
  var botId: Id
  
  /**
    * The version of the bot associated with the slot type.
    */
  var botVersion: BotVersion
  
  /**
    * The identifier of the language and locale of the slot type to describe. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * The identifier of the slot type.
    */
  var slotTypeId: Id
}
object DescribeSlotTypeRequest {
  
  inline def apply(botId: Id, botVersion: BotVersion, localeId: LocaleId, slotTypeId: Id): DescribeSlotTypeRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], slotTypeId = slotTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSlotTypeRequest]
  }
  
  extension [Self <: DescribeSlotTypeRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setSlotTypeId(value: Id): Self = StObject.set(x, "slotTypeId", value.asInstanceOf[js.Any])
  }
}
