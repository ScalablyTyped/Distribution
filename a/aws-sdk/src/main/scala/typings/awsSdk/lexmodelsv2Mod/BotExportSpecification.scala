package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotExportSpecification extends StObject {
  
  /**
    * The identifier of the bot assigned by Amazon Lex.
    */
  var botId: Id
  
  /**
    * The version of the bot that was exported. This will be either DRAFT or the version number.
    */
  var botVersion: BotVersion
}
object BotExportSpecification {
  
  inline def apply(botId: Id, botVersion: BotVersion): BotExportSpecification = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotExportSpecification]
  }
  
  extension [Self <: BotExportSpecification](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
  }
}
