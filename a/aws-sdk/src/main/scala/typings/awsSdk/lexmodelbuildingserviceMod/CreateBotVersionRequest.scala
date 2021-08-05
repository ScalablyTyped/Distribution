package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBotVersionRequest extends StObject {
  
  /**
    * Identifies a specific revision of the $LATEST version of the bot. If you specify a checksum and the $LATEST version of the bot has a different checksum, a PreconditionFailedException exception is returned and Amazon Lex doesn't publish a new version. If you don't specify a checksum, Amazon Lex publishes the $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the bot that you want to create a new version of. The name is case sensitive. 
    */
  var name: BotName
}
object CreateBotVersionRequest {
  
  inline def apply(name: BotName): CreateBotVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotVersionRequest]
  }
  
  extension [Self <: CreateBotVersionRequest](x: Self) {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setName(value: BotName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
