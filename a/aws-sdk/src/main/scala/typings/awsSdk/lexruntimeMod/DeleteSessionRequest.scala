package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSessionRequest extends js.Object {
  /**
    * The alias in use for the bot that contains the session data.
    */
  var botAlias: BotAlias = js.native
  /**
    * The name of the bot that contains the session data.
    */
  var botName: BotName = js.native
  /**
    * The identifier of the user associated with the session data.
    */
  var userId: UserId = js.native
}

object DeleteSessionRequest {
  @scala.inline
  def apply(botAlias: BotAlias, botName: BotName, userId: UserId): DeleteSessionRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSessionRequest]
  }
}

