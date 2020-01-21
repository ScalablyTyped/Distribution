package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotAliasRequest extends js.Object {
  /**
    * The name of the bot.
    */
  var botName: BotName = js.native
  /**
    * The name of the bot alias. The name is case sensitive.
    */
  var name: AliasName = js.native
}

object GetBotAliasRequest {
  @scala.inline
  def apply(botName: BotName, name: AliasName): GetBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBotAliasRequest]
  }
}

