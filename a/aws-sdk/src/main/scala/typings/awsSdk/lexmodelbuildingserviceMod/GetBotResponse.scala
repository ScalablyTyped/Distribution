package typings.awsSdk.lexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotResponse extends StObject {
  
  /**
    * The message that Amazon Lex returns when the user elects to end the conversation without completing it. For more information, see PutBot.
    */
  var abortStatement: js.UndefOr[Statement] = js.undefined
  
  /**
    * Checksum of the bot used to identify a specific revision of the bot's $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.undefined
  
  /**
    * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
    */
  var childDirected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The message Amazon Lex uses when it doesn't understand the user's request. For more information, see PutBot. 
    */
  var clarificationPrompt: js.UndefOr[Prompt] = js.undefined
  
  /**
    * The date that the bot was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Indicates whether user utterances should be sent to Amazon Comprehend for sentiment analysis.
    */
  var detectSentiment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the bot uses accuracy improvements. true indicates that the bot is using the improvements, otherwise, false.
    */
  var enableModelImprovements: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If status is FAILED, Amazon Lex explains why it failed to build the bot.
    */
  var failureReason: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more information, see PutBot.
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.undefined
  
  /**
    * An array of intent objects. For more information, see PutBot.
    */
  var intents: js.UndefOr[IntentList] = js.undefined
  
  /**
    * The date that the bot was updated. When you create a resource, the creation date and last updated date are the same. 
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  The target locale for the bot. 
    */
  var locale: js.UndefOr[Locale] = js.undefined
  
  /**
    * The name of the bot.
    */
  var name: js.UndefOr[BotName] = js.undefined
  
  /**
    * The score that determines where Amazon Lex inserts the AMAZON.FallbackIntent, AMAZON.KendraSearchIntent, or both when returning alternative intents in a PostContent or PostText response. AMAZON.FallbackIntent is inserted if the confidence score for all intents is below this value. AMAZON.KendraSearchIntent is only inserted if it is configured for the bot.
    */
  var nluIntentConfidenceThreshold: js.UndefOr[ConfidenceThreshold] = js.undefined
  
  /**
    * The status of the bot.  When the status is BUILDING Amazon Lex is building the bot for testing and use. If the status of the bot is READY_BASIC_TESTING, you can test the bot using the exact utterances specified in the bot's intents. When the bot is ready for full testing or to run, the status is READY. If there was a problem with building the bot, the status is FAILED and the failureReason field explains why the bot did not build. If the bot was saved but not built, the status is NOT_BUILT.
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The version of the bot. For a new bot, the version is always $LATEST.
    */
  var version: js.UndefOr[Version] = js.undefined
  
  /**
    * The Amazon Polly voice ID that Amazon Lex uses for voice interaction with the user. For more information, see PutBot.
    */
  var voiceId: js.UndefOr[String] = js.undefined
}
object GetBotResponse {
  
  inline def apply(): GetBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotResponse]
  }
  
  extension [Self <: GetBotResponse](x: Self) {
    
    inline def setAbortStatement(value: Statement): Self = StObject.set(x, "abortStatement", value.asInstanceOf[js.Any])
    
    inline def setAbortStatementUndefined: Self = StObject.set(x, "abortStatement", js.undefined)
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "checksum", js.undefined)
    
    inline def setChildDirected(value: Boolean): Self = StObject.set(x, "childDirected", value.asInstanceOf[js.Any])
    
    inline def setChildDirectedUndefined: Self = StObject.set(x, "childDirected", js.undefined)
    
    inline def setClarificationPrompt(value: Prompt): Self = StObject.set(x, "clarificationPrompt", value.asInstanceOf[js.Any])
    
    inline def setClarificationPromptUndefined: Self = StObject.set(x, "clarificationPrompt", js.undefined)
    
    inline def setCreatedDate(value: Timestamp): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetectSentiment(value: Boolean): Self = StObject.set(x, "detectSentiment", value.asInstanceOf[js.Any])
    
    inline def setDetectSentimentUndefined: Self = StObject.set(x, "detectSentiment", js.undefined)
    
    inline def setEnableModelImprovements(value: Boolean): Self = StObject.set(x, "enableModelImprovements", value.asInstanceOf[js.Any])
    
    inline def setEnableModelImprovementsUndefined: Self = StObject.set(x, "enableModelImprovements", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setIdleSessionTTLInSeconds(value: SessionTTL): Self = StObject.set(x, "idleSessionTTLInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIdleSessionTTLInSecondsUndefined: Self = StObject.set(x, "idleSessionTTLInSeconds", js.undefined)
    
    inline def setIntents(value: IntentList): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: Intent*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    inline def setLastUpdatedDate(value: Timestamp): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateUndefined: Self = StObject.set(x, "lastUpdatedDate", js.undefined)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setName(value: BotName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNluIntentConfidenceThreshold(value: ConfidenceThreshold): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceThresholdUndefined: Self = StObject.set(x, "nluIntentConfidenceThreshold", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVoiceId(value: String): Self = StObject.set(x, "voiceId", value.asInstanceOf[js.Any])
    
    inline def setVoiceIdUndefined: Self = StObject.set(x, "voiceId", js.undefined)
  }
}
