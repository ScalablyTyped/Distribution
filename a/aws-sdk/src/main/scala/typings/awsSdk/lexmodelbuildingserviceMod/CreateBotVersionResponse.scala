package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBotVersionResponse extends js.Object {
  /**
    * The message that Amazon Lex uses to abort a conversation. For more information, see PutBot.
    */
  var abortStatement: js.UndefOr[Statement] = js.native
  /**
    * Checksum identifying the version of the bot that was created.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
    */
  var childDirected: js.UndefOr[Boolean] = js.native
  /**
    * The message that Amazon Lex uses when it doesn't understand the user's request. For more information, see PutBot. 
    */
  var clarificationPrompt: js.UndefOr[Prompt] = js.native
  /**
    * The date when the bot version was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Indicates whether utterances entered by the user should be sent to Amazon Comprehend for sentiment analysis.
    */
  var detectSentiment: js.UndefOr[Boolean] = js.native
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to build the bot.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more information, see PutBot.
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.native
  /**
    * An array of Intent objects. For more information, see PutBot.
    */
  var intents: js.UndefOr[IntentList] = js.native
  /**
    * The date when the $LATEST version of this bot was updated. 
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    *  Specifies the target locale for the bot. 
    */
  var locale: js.UndefOr[Locale] = js.native
  /**
    * The name of the bot.
    */
  var name: js.UndefOr[BotName] = js.native
  /**
    *  When you send a request to create or update a bot, Amazon Lex sets the status response element to BUILDING. After Amazon Lex builds the bot, it sets status to READY. If Amazon Lex can't build the bot, it sets status to FAILED. Amazon Lex returns the reason for the failure in the failureReason response element. 
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The version of the bot. 
    */
  var version: js.UndefOr[Version] = js.native
  /**
    * The Amazon Polly voice ID that Amazon Lex uses for voice interactions with the user.
    */
  var voiceId: js.UndefOr[String] = js.native
}

object CreateBotVersionResponse {
  @scala.inline
  def apply(
    abortStatement: Statement = null,
    checksum: String = null,
    childDirected: js.UndefOr[Boolean] = js.undefined,
    clarificationPrompt: Prompt = null,
    createdDate: Timestamp = null,
    description: Description = null,
    detectSentiment: js.UndefOr[Boolean] = js.undefined,
    failureReason: String = null,
    idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined,
    intents: IntentList = null,
    lastUpdatedDate: Timestamp = null,
    locale: Locale = null,
    name: BotName = null,
    status: Status = null,
    version: Version = null,
    voiceId: String = null
  ): CreateBotVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (abortStatement != null) __obj.updateDynamic("abortStatement")(abortStatement.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (!js.isUndefined(childDirected)) __obj.updateDynamic("childDirected")(childDirected.get.asInstanceOf[js.Any])
    if (clarificationPrompt != null) __obj.updateDynamic("clarificationPrompt")(clarificationPrompt.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(detectSentiment)) __obj.updateDynamic("detectSentiment")(detectSentiment.get.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (!js.isUndefined(idleSessionTTLInSeconds)) __obj.updateDynamic("idleSessionTTLInSeconds")(idleSessionTTLInSeconds.get.asInstanceOf[js.Any])
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (voiceId != null) __obj.updateDynamic("voiceId")(voiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBotVersionResponse]
  }
}

