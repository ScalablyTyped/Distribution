package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotAliasResponse extends StObject {
  
  /**
    * The unique identifier of the bot alias to delete.
    */
  var botAliasId: js.UndefOr[BotAliasId] = js.undefined
  
  /**
    * The current status of the alias. The status is Deleting while the alias is in the process of being deleted. Once the alias is deleted, it will no longer appear in the list of aliases returned by the ListBotAliases operation.
    */
  var botAliasStatus: js.UndefOr[BotAliasStatus] = js.undefined
  
  /**
    * The unique identifier of the bot that contains the alias to delete.
    */
  var botId: js.UndefOr[Id] = js.undefined
}
object DeleteBotAliasResponse {
  
  inline def apply(): DeleteBotAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBotAliasResponse]
  }
  
  extension [Self <: DeleteBotAliasResponse](x: Self) {
    
    inline def setBotAliasId(value: BotAliasId): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotAliasIdUndefined: Self = StObject.set(x, "botAliasId", js.undefined)
    
    inline def setBotAliasStatus(value: BotAliasStatus): Self = StObject.set(x, "botAliasStatus", value.asInstanceOf[js.Any])
    
    inline def setBotAliasStatusUndefined: Self = StObject.set(x, "botAliasStatus", js.undefined)
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
  }
}
