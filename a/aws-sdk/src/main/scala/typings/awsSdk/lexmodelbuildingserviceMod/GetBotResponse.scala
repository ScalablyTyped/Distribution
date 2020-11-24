package typings.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBotResponse extends js.Object {
  
  /**
    * The message that Amazon Lex returns when the user elects to end the conversation without completing it. For more information, see PutBot.
    */
  var abortStatement: js.UndefOr[Statement] = js.native
  
  /**
    * Checksum of the bot used to identify a specific revision of the bot's $LATEST version.
    */
  var checksum: js.UndefOr[String] = js.native
  
  /**
    * For each Amazon Lex bot created with the Amazon Lex Model Building Service, you must specify whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to the Children's Online Privacy Protection Act (COPPA) by specifying true or false in the childDirected field. By specifying true in the childDirected field, you confirm that your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. By specifying false in the childDirected field, you confirm that your use of Amazon Lex is not related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. You may not specify a default value for the childDirected field that does not accurately reflect whether your use of Amazon Lex is related to a website, program, or other application that is directed or targeted, in whole or in part, to children under age 13 and subject to COPPA. If your use of Amazon Lex relates to a website, program, or other application that is directed in whole or in part, to children under age 13, you must obtain any required verifiable parental consent under COPPA. For information regarding the use of Amazon Lex in connection with websites, programs, or other applications that are directed or targeted, in whole or in part, to children under age 13, see the Amazon Lex FAQ. 
    */
  var childDirected: js.UndefOr[Boolean] = js.native
  
  /**
    * The message Amazon Lex uses when it doesn't understand the user's request. For more information, see PutBot. 
    */
  var clarificationPrompt: js.UndefOr[Prompt] = js.native
  
  /**
    * The date that the bot was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * A description of the bot.
    */
  var description: js.UndefOr[Description] = js.native
  
  /**
    * Indicates whether user utterances should be sent to Amazon Comprehend for sentiment analysis.
    */
  var detectSentiment: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether the bot uses accuracy improvements. true indicates that the bot is using the improvements, otherwise, false.
    */
  var enableModelImprovements: js.UndefOr[Boolean] = js.native
  
  /**
    * If status is FAILED, Amazon Lex explains why it failed to build the bot.
    */
  var failureReason: js.UndefOr[String] = js.native
  
  /**
    * The maximum time in seconds that Amazon Lex retains the data gathered in a conversation. For more information, see PutBot.
    */
  var idleSessionTTLInSeconds: js.UndefOr[SessionTTL] = js.native
  
  /**
    * An array of intent objects. For more information, see PutBot.
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
    * The status of the bot.  When the status is BUILDING Amazon Lex is building the bot for testing and use. If the status of the bot is READY_BASIC_TESTING, you can test the bot using the exact utterances specified in the bot's intents. When the bot is ready for full testing or to run, the status is READY. If there was a problem with building the bot, the status is FAILED and the failureReason field explains why the bot did not build. If the bot was saved but not built, the status is NOT_BUILT.
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
object GetBotResponse {
  
  @scala.inline
  def apply(): GetBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotResponse]
  }
  
  @scala.inline
  implicit class GetBotResponseOps[Self <: GetBotResponse] (val x: Self) extends AnyVal {
    
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
    def setAbortStatement(value: Statement): Self = this.set("abortStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortStatement: Self = this.set("abortStatement", js.undefined)
    
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecksum: Self = this.set("checksum", js.undefined)
    
    @scala.inline
    def setChildDirected(value: Boolean): Self = this.set("childDirected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildDirected: Self = this.set("childDirected", js.undefined)
    
    @scala.inline
    def setClarificationPrompt(value: Prompt): Self = this.set("clarificationPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClarificationPrompt: Self = this.set("clarificationPrompt", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: Timestamp): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDetectSentiment(value: Boolean): Self = this.set("detectSentiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetectSentiment: Self = this.set("detectSentiment", js.undefined)
    
    @scala.inline
    def setEnableModelImprovements(value: Boolean): Self = this.set("enableModelImprovements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableModelImprovements: Self = this.set("enableModelImprovements", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = this.set("failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureReason: Self = this.set("failureReason", js.undefined)
    
    @scala.inline
    def setIdleSessionTTLInSeconds(value: SessionTTL): Self = this.set("idleSessionTTLInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleSessionTTLInSeconds: Self = this.set("idleSessionTTLInSeconds", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: Intent*): Self = this.set("intents", js.Array(value :_*))
    
    @scala.inline
    def setIntents(value: IntentList): Self = this.set("intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
    
    @scala.inline
    def setLastUpdatedDate(value: Timestamp): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedDate: Self = this.set("lastUpdatedDate", js.undefined)
    
    @scala.inline
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setName(value: BotName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNluIntentConfidenceThreshold(value: ConfidenceThreshold): Self = this.set("nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNluIntentConfidenceThreshold: Self = this.set("nluIntentConfidenceThreshold", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setVersion(value: Version): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVoiceId(value: String): Self = this.set("voiceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoiceId: Self = this.set("voiceId", js.undefined)
  }
}
