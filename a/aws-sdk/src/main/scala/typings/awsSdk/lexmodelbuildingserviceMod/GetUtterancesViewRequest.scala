package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUtterancesViewRequest extends js.Object {
  /**
    * The name of the bot for which utterance information should be returned.
    */
  var botName: BotName = js.native
  /**
    * An array of bot versions for which utterance information should be returned. The limit is 5 versions per request.
    */
  var botVersions: BotVersions = js.native
  /**
    * To return utterances that were recognized and handled, use Detected. To return utterances that were not recognized, use Missed.
    */
  var statusType: StatusType = js.native
}

object GetUtterancesViewRequest {
  @scala.inline
  def apply(botName: BotName, botVersions: BotVersions, statusType: StatusType): GetUtterancesViewRequest = {
    val __obj = js.Dynamic.literal(botName = botName.asInstanceOf[js.Any], botVersions = botVersions.asInstanceOf[js.Any], statusType = statusType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUtterancesViewRequest]
  }
  @scala.inline
  implicit class GetUtterancesViewRequestOps[Self <: GetUtterancesViewRequest] (val x: Self) extends AnyVal {
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
    def setBotVersionsVarargs(value: Version*): Self = this.set("botVersions", js.Array(value :_*))
    @scala.inline
    def setBotVersions(value: BotVersions): Self = this.set("botVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusType(value: StatusType): Self = this.set("statusType", value.asInstanceOf[js.Any])
  }
  
}

