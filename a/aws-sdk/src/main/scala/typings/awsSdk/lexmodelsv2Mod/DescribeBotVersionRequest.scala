package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBotVersionRequest extends StObject {
  
  /**
    * The identifier of the bot containing the version to return metadata for.
    */
  var botId: Id
  
  /**
    * The version of the bot to return metadata for.
    */
  var botVersion: NumericalBotVersion
}
object DescribeBotVersionRequest {
  
  inline def apply(botId: Id, botVersion: NumericalBotVersion): DescribeBotVersionRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBotVersionRequest]
  }
  
  extension [Self <: DescribeBotVersionRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: NumericalBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
  }
}
