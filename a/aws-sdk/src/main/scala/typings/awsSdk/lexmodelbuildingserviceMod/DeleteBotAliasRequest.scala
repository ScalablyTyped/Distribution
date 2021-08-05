package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotAliasRequest extends StObject {
  
  /**
    * The name of the bot that the alias points to.
    */
  var botName: BotName
  
  /**
    * The name of the alias to delete. The name is case sensitive. 
    */
  var name: AliasName
}
object DeleteBotAliasRequest {
  
  inline def apply(botName: BotName, name: AliasName): DeleteBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotAliasRequest]
  }
  
  extension [Self <: DeleteBotAliasRequest](x: Self) {
    
    inline def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setName(value: AliasName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
