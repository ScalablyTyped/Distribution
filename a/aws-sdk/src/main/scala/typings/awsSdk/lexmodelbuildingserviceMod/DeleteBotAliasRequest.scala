package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBotAliasRequest extends js.Object {
  /**
    * The name of the bot that the alias points to.
    */
  var botName: BotName = js.native
  /**
    * The name of the alias to delete. The name is case sensitive. 
    */
  var name: AliasName = js.native
}

object DeleteBotAliasRequest {
  @scala.inline
  def apply(botName: BotName, name: AliasName): DeleteBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteBotAliasRequest]
  }
}

