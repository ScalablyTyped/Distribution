package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotChannelAssociationRequest extends js.Object {
  /**
    * An alias pointing to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: AliasName = js.native
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName = js.native
  /**
    * The name of the association between the bot and the channel. The name is case sensitive. 
    */
  var name: BotChannelName = js.native
}

object GetBotChannelAssociationRequest {
  @scala.inline
  def apply(botAlias: AliasName, botName: BotName, name: BotChannelName): GetBotChannelAssociationRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBotChannelAssociationRequest]
  }
  @scala.inline
  implicit class GetBotChannelAssociationRequestOps[Self <: GetBotChannelAssociationRequest] (val x: Self) extends AnyVal {
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
    def setBotAlias(value: AliasName): Self = this.set("botAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def setBotName(value: BotName): Self = this.set("botName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: BotChannelName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

