package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotResponse extends StObject {
  
  /**
    * The unique identifier of the bot that Amazon Lex is deleting.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The current status of the bot. The status is Deleting while the bot and its associated resources are being deleted.
    */
  var botStatus: js.UndefOr[BotStatus] = js.undefined
}
object DeleteBotResponse {
  
  inline def apply(): DeleteBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBotResponse]
  }
  
  extension [Self <: DeleteBotResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotStatus(value: BotStatus): Self = StObject.set(x, "botStatus", value.asInstanceOf[js.Any])
    
    inline def setBotStatusUndefined: Self = StObject.set(x, "botStatus", js.undefined)
  }
}
