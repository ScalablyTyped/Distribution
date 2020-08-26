package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUtterancesRequest extends js.Object {
  /**
    * The name of the bot that stored the utterances.
    */
  var botName: BotName = js.native
  /**
    *  The unique identifier for the user that made the utterances. This is the user ID that was sent in the PostContent or PostText operation request that contained the utterance.
    */
  var userId: UserId = js.native
}

object DeleteUtterancesRequest {
  @scala.inline
  def apply(botName: BotName, userId: UserId): DeleteUtterancesRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUtterancesRequest]
  }
  @scala.inline
  implicit class DeleteUtterancesRequestOps[Self <: DeleteUtterancesRequest] (val x: Self) extends AnyVal {
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
    def setUserId(value: UserId): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

