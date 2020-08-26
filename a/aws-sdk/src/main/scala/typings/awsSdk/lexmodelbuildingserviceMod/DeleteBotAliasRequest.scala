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
  @scala.inline
  implicit class DeleteBotAliasRequestOps[Self <: DeleteBotAliasRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBotName(value: BotName): Self = this.set("botName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: AliasName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

