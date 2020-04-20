package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBotChannelAssociationRequest extends js.Object {
  /**
    * An alias that points to the specific version of the Amazon Lex bot to which this association is being made.
    */
  var botAlias: AliasName = js.native
  /**
    * The name of the Amazon Lex bot.
    */
  var botName: BotName = js.native
  /**
    * The name of the association. The name is case sensitive. 
    */
  var name: BotChannelName = js.native
}

object DeleteBotChannelAssociationRequest {
  @scala.inline
  def apply(botAlias: AliasName, botName: BotName, name: BotChannelName): DeleteBotChannelAssociationRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotChannelAssociationRequest]
  }
}

