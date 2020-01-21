package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSessionRequest extends js.Object {
  /**
    * The alias in use for the bot that contains the session data.
    */
  var botAlias: BotAlias = js.native
  /**
    * The name of the bot that contains the session data.
    */
  var botName: BotName = js.native
  /**
    * A string used to filter the intents returned in the recentIntentSummaryView structure.  When you specify a filter, only intents with their checkpointLabel field set to that string are returned.
    */
  var checkpointLabelFilter: js.UndefOr[IntentSummaryCheckpointLabel] = js.native
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. 
    */
  var userId: UserId = js.native
}

object GetSessionRequest {
  @scala.inline
  def apply(
    botAlias: BotAlias,
    botName: BotName,
    userId: UserId,
    checkpointLabelFilter: IntentSummaryCheckpointLabel = null
  ): GetSessionRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (checkpointLabelFilter != null) __obj.updateDynamic("checkpointLabelFilter")(checkpointLabelFilter.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionRequest]
  }
}

