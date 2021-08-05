package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotAliasRequest extends StObject {
  
  /**
    * The name of the bot.
    */
  var botName: BotName
  
  /**
    * The name of the bot alias. The name is case sensitive.
    */
  var name: AliasName
}
object GetBotAliasRequest {
  
  inline def apply(botName: BotName, name: AliasName): GetBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotAliasRequest]
  }
  
  extension [Self <: GetBotAliasRequest](x: Self) {
    
    inline def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setName(value: AliasName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
