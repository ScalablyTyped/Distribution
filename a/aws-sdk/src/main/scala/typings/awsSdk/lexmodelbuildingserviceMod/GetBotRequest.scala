package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotRequest extends js.Object {
  /**
    * The name of the bot. The name is case sensitive. 
    */
  var name: BotName = js.native
  /**
    * The version or alias of the bot.
    */
  var versionOrAlias: String = js.native
}

object GetBotRequest {
  @scala.inline
  def apply(name: BotName, versionOrAlias: String): GetBotRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], versionOrAlias = versionOrAlias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBotRequest]
  }
}

