package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutBotResponse extends js.Object {
  /**
    * The message that Amazon Lex uses to abort a conversation. For more information, see PutBot.
    */
  var abortStatement: js.UndefOr[Statement] = js.native
  /**
    * Checksum of the bot that you created.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
    */
  var childDirected: js.UndefOr[Boolean] = js.native
  /**
    *  The prompts that Amazon Lex uses when it doesn't understand the user's intent. For more information, see PutBot. 
    */
  var clarificationPrompt: js.UndefOr[Prompt] = js.native
  /**
    *  True if a new version of the bot was created. If the createVersion field was not specified in the request, the createVersion field is set to false in the response.
    */
  var createVersion: js.UndefOr[Boolean] = js.native
  /**
    * The date that the bot was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    *  true if the bot is configured to send user utterances to Amazon Comprehend for sentiment analysis. If the detectSentiment field was not specified in the request, the detectSentiment field is false in the response.
    */
  var detectSentiment: js.UndefOr[Boolean] = js.native
  /**
    * If status is FAILED, Amazon Lex provides the reason that it failed to build the bot.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * The maximum length of time that Amazon Lex retains the data gathered in a conversation. For more information, see PutBot.
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.native
  /**
    * An array of Intent objects. For more information, see PutBot.
    */
  var intents: js.UndefOr[IntentList] = js.native
  /**
    * The date that the bot was updated. When you create a resource, the creation date and last updated date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.native
  /**
    *  The target locale for the bot. 
    */
  var locale: js.UndefOr[Locale] = js.native
  /**
    * The name of the bot.
    */
  var name: js.UndefOr[BotName] = js.native
  /**
    *  When you send a request to create a bot with processBehavior set to BUILD, Amazon Lex sets the status response element to BUILDING. In the READY_BASIC_TESTING state you can test the bot with user inputs that exactly match the utterances configured for the bot's intents and values in the slot types. If Amazon Lex can't build the bot, Amazon Lex sets status to FAILED. Amazon Lex returns the reason for the failure in the failureReason response element.  When you set processBehavior to SAVE, Amazon Lex sets the status code to NOT BUILT. When the bot is in the READY state you can test and publish the bot.
    */
  var status: js.UndefOr[Status] = js.native
  /**
    * The version of the bot. For a new bot, the version is always $LATEST.
    */
  var version: js.UndefOr[Version] = js.native
  /**
    * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. For more information, see PutBot.
    */
  var voiceId: js.UndefOr[String] = js.native
}

object PutBotResponse {
  @scala.inline
  def apply(
    abortStatement: Statement = null,
    checksum: String = null,
    childDirected: js.UndefOr[scala.Boolean] = js.undefined,
    clarificationPrompt: Prompt = null,
    createVersion: js.UndefOr[scala.Boolean] = js.undefined,
    createdDate: Timestamp = null,
    description: Description = null,
    detectSentiment: js.UndefOr[scala.Boolean] = js.undefined,
    failureReason: String = null,
    idleSessionTTLInSeconds: Int | Double = null,
    intents: IntentList = null,
    lastUpdatedDate: Timestamp = null,
    locale: Locale = null,
    name: BotName = null,
    status: Status = null,
    version: Version = null,
    voiceId: String = null
  ): PutBotResponse = {
    val __obj = js.Dynamic.literal()
    if (abortStatement != null) __obj.updateDynamic("abortStatement")(abortStatement.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (!js.isUndefined(childDirected)) __obj.updateDynamic("childDirected")(childDirected.asInstanceOf[js.Any])
    if (clarificationPrompt != null) __obj.updateDynamic("clarificationPrompt")(clarificationPrompt.asInstanceOf[js.Any])
    if (!js.isUndefined(createVersion)) __obj.updateDynamic("createVersion")(createVersion.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(detectSentiment)) __obj.updateDynamic("detectSentiment")(detectSentiment.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (idleSessionTTLInSeconds != null) __obj.updateDynamic("idleSessionTTLInSeconds")(idleSessionTTLInSeconds.asInstanceOf[js.Any])
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (voiceId != null) __obj.updateDynamic("voiceId")(voiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBotResponse]
  }
}

