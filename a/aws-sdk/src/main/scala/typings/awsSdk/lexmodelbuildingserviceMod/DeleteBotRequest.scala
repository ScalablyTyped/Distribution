package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotRequest extends StObject {
  
  /**
    * The name of the bot. The name is case sensitive. 
    */
  var name: BotName
}
object DeleteBotRequest {
  
  inline def apply(name: BotName): DeleteBotRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotRequest]
  }
  
  extension [Self <: DeleteBotRequest](x: Self) {
    
    inline def setName(value: BotName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
