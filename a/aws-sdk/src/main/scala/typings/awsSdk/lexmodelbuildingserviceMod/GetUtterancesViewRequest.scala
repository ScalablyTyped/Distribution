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
}

