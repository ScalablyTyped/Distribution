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
  def apply(): DeleteSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSessionResponse]
  }
  @scala.inline
  implicit class DeleteSessionResponseOps[Self <: DeleteSessionResponse] (val x: Self) extends AnyVal {
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
    def setBotAlias(value: BotAlias): Self = this.set("botAlias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBotAlias: Self = this.set("botAlias", js.undefined)
    @scala.inline
    def setBotName(value: BotName): Self = this.set("botName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBotName: Self = this.set("botName", js.undefined)
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionId: Self = this.set("sessionId", js.undefined)
    @scala.inline
    def setUserId(value: UserId): Self = this.set("userId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
  
}

