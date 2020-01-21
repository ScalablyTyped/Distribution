package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSessionResponse extends js.Object {
  /**
    * The alias in use for the bot associated with the session data.
    */
  var botAlias: js.UndefOr[BotAlias] = js.native
  /**
    * The name of the bot associated with the session data.
    */
  var botName: js.UndefOr[BotName] = js.native
  /**
    * The unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * The ID of the client application user.
    */
  var userId: js.UndefOr[UserId] = js.native
}

object DeleteSessionResponse {
  @scala.inline
  def apply(
    botAlias: BotAlias = null,
    botName: BotName = null,
    sessionId: String = null,
    userId: UserId = null
  ): DeleteSessionResponse = {
    val __obj = js.Dynamic.literal()
    if (botAlias != null) __obj.updateDynamic("botAlias")(botAlias.asInstanceOf[js.Any])
    if (botName != null) __obj.updateDynamic("botName")(botName.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSessionResponse]
  }
}

