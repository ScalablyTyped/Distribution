package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutBotResponse extends StObject {
  
  /**
    * The message that Amazon Lex uses to cancel a conversation. For more information, see PutBot.
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
    * Indicates whether the bot uses accuracy improvements. true indicates that the bot is using the improvements, otherwise, false.
    */
  var enableModelImprovements: js.UndefOr[Boolean] = js.native
  
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
    * The score that determines where Amazon Lex inserts the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent is inserted if the confidence score for all intents is below this value. AMAZON.KendraSearchIntent is only inserted if it is configured for the bot.
    */
  var nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold] = js.native
  
  /**
    *  When you send a request to create a bot with processBehavior set to BUILD, Amazon Lex sets the status response element to BUILDING. In the READY_BASIC_TESTING state you can test the bot with user inputs that exactly match the utterances configured for the bot's intents and values in the slot types. If Amazon Lex can't build the bot, Amazon Lex sets status to FAILED. Amazon Lex returns the reason for the failure in the failureReason response element.  When you set processBehavior to SAVE, Amazon Lex sets the status code to NOT BUILT. When the bot is in the READY state you can test and publish the bot.
    */
  var status: js.UndefOr[Status] = js.native
  
  /**
    * A list of tags associated with the bot.
    */
  var tags: js.UndefOr[TagList] = js.native
  
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
  def apply(): PutBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutBotResponse]
  }
  
  @scala.inline
  implicit class PutBotResponseMutableBuilder[Self <: PutBotResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbortStatement(value: Statement): Self = StObject.set(x, "abortStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbortStatementUndefined: Self = StObject.set(x, "abortStatement", js.undefined)
    
    @scala.inline
    def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    @scala.inline
    def setChildDirected(value: Boolean): Self = StObject.set(x, "childDirected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildDirectedUndefined: Self = StObject.set(x, "childDirected", js.undefined)
    
    @scala.inline
    def setClarificationPrompt(value: Prompt): Self = StObject.set(x, "clarificationPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClarificationPromptUndefined: Self = StObject.set(x, "clarificationPrompt", js.undefined)
    
    @scala.inline
    def setCreateVersion(value: Boolean): Self = StObject.set(x, "createVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateVersionUndefined: Self = StObject.set(x, "createVersion", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetectSentiment(value: Boolean): Self = StObject.set(x, "detectSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectSentimentUndefined: Self = StObject.set(x, "detectSentiment", js.undefined)
    
    @scala.inline
    def setEnableModelImprovements(value: Boolean): Self = StObject.set(x, "enableModelImprovements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableModelImprovementsUndefined: Self = StObject.set(x, "enableModelImprovements", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setIdleSessionTTLInSeconds(value: SessionTTL): Self = StObject.set(x, "idleSessionTTLInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleSessionTTLInSecondsUndefined: Self = StObject.set(x, "idleSessionTTLInSeconds", js.undefined)
    
    @scala.inline
    def setIntents(value: IntentList): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setName(value: BotName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNluIntentConfidenceThreshold(value: ConfidenceThreshold): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNluIntentConfidenceThresholdUndefined: Self = StObject.set(x, "nluIntentConfidenceThreshold", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVoiceId(value: String): Self = StObject.set(x, "voiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceIdUndefined: Self = StObject.set(x, "voiceId", js.undefined)
  }
}
