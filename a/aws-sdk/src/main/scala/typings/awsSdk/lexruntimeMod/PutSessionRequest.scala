package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSessionRequest extends js.Object {
  /**
    * The message that Amazon Lex returns in the response can be either text or speech based depending on the value of this field.   If the value is text/plain; charset=utf-8, Amazon Lex returns text in the response.   If the value begins with audio/, Amazon Lex returns speech in the response. Amazon Lex uses Amazon Polly to generate the speech in the configuration that you specify. For example, if you specify audio/mpeg as the value, Amazon Lex returns speech in the MPEG format.   If the value is audio/pcm, the speech is returned as audio/pcm in 16-bit, little endian format.   The following are the accepted values:    audio/mpeg     audio/ogg     audio/pcm     audio/ * (defaults to mpeg)    text/plain; charset=utf-8     
    */
  var accept: js.UndefOr[Accept] = js.native
  /**
    * The alias in use for the bot that contains the session data.
    */
  var botAlias: BotAlias = js.native
  /**
    * The name of the bot that contains the session data.
    */
  var botName: BotName = js.native
  /**
    * Sets the next action that the bot should take to fulfill the conversation.
    */
  var dialogAction: js.UndefOr[DialogAction] = js.native
  /**
    * A summary of the recent intents for the bot. You can use the intent summary view to set a checkpoint label on an intent and modify attributes of intents. You can also use it to remove or add intent summary objects to the list. An intent that you modify or add to the list must make sense for the bot. For example, the intent name must be valid for the bot. You must provide valid values for:    intentName    slot names    slotToElict    If you send the recentIntentSummaryView parameter in a PutSession request, the contents of the new summary view replaces the old summary view. For example, if a GetSession request returns three intents in the summary view and you call PutSession with one intent in the summary view, the next call to GetSession will only return one intent.
    */
  var recentIntentSummaryView: js.UndefOr[IntentSummaryList] = js.native
  /**
    * Map of key/value pairs representing the session-specific context information. It contains application information passed between Amazon Lex and a client application.
    */
  var sessionAttributes: js.UndefOr[StringMap] = js.native
  /**
    * The ID of the client application user. Amazon Lex uses this to identify a user's conversation with your bot. 
    */
  var userId: UserId = js.native
}

object PutSessionRequest {
  @scala.inline
  def apply(
    botAlias: BotAlias,
    botName: BotName,
    userId: UserId,
    accept: Accept = null,
    dialogAction: DialogAction = null,
    recentIntentSummaryView: IntentSummaryList = null,
    sessionAttributes: StringMap = null
  ): PutSessionRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (accept != null) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (dialogAction != null) __obj.updateDynamic("dialogAction")(dialogAction.asInstanceOf[js.Any])
    if (recentIntentSummaryView != null) __obj.updateDynamic("recentIntentSummaryView")(recentIntentSummaryView.asInstanceOf[js.Any])
    if (sessionAttributes != null) __obj.updateDynamic("sessionAttributes")(sessionAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSessionRequest]
  }
}

