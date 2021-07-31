package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotRequest extends StObject {
  
  /**
    * The name of the bot. The name is case sensitive. 
    */
  var name: BotName
  
  /**
    * The version or alias of the bot.
    */
  var versionOrAlias: String
}
object GetBotRequest {
  
  @scala.inline
  def apply(name: BotName, versionOrAlias: String): GetBotRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versionOrAlias = versionOrAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotRequest]
  }
  
  @scala.inline
  implicit class GetBotRequestMutableBuilder[Self <: GetBotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: BotName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionOrAlias(value: String): Self = StObject.set(x, "versionOrAlias", value.asInstanceOf[js.Any])
  }
}
