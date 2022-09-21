package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBotRecommendationResponse extends StObject {
  
  /**
    * The identifier of the bot associated with the bot recommendation.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The identifier of the bot recommendation being described.
    */
  var botRecommendationId: js.UndefOr[Id] = js.undefined
  
  /**
    * The object representing the URL of the bot definition, the URL of the associated transcript and a statistical summary of the bot recommendation results.
    */
  var botRecommendationResults: js.UndefOr[BotRecommendationResults] = js.undefined
  
  /**
    * The status of the bot recommendation. If the status is Failed, then the reasons for the failure are listed in the failureReasons field. 
    */
  var botRecommendationStatus: js.UndefOr[BotRecommendationStatus] = js.undefined
  
  /**
    * The version of the bot associated with the bot recommendation.
    */
  var botVersion: js.UndefOr[DraftBotVersion] = js.undefined
  
  /**
    * The date and time that the bot recommendation was created.
    */
  var creationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The object representing the passwords that were used to encrypt the data related to the bot recommendation results, as well as the KMS key ARN used to encrypt the associated metadata.
    */
  var encryptionSetting: js.UndefOr[EncryptionSetting] = js.undefined
  
  /**
    * If botRecommendationStatus is Failed, Amazon Lex explains why.
    */
  var failureReasons: js.UndefOr[FailureReasons] = js.undefined
  
  /**
    * The date and time that the bot recommendation was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the language and locale of the bot recommendation to describe.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The object representing the Amazon S3 bucket containing the transcript, as well as the associated metadata.
    */
  var transcriptSourceSetting: js.UndefOr[TranscriptSourceSetting] = js.undefined
}
object DescribeBotRecommendationResponse {
  
  inline def apply(): DescribeBotRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBotRecommendationResponse]
  }
  
  extension [Self <: DescribeBotRecommendationResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationIdUndefined: Self = StObject.set(x, "botRecommendationId", js.undefined)
    
    inline def setBotRecommendationResults(value: BotRecommendationResults): Self = StObject.set(x, "botRecommendationResults", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationResultsUndefined: Self = StObject.set(x, "botRecommendationResults", js.undefined)
    
    inline def setBotRecommendationStatus(value: BotRecommendationStatus): Self = StObject.set(x, "botRecommendationStatus", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationStatusUndefined: Self = StObject.set(x, "botRecommendationStatus", js.undefined)
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setEncryptionSetting(value: EncryptionSetting): Self = StObject.set(x, "encryptionSetting", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSettingUndefined: Self = StObject.set(x, "encryptionSetting", js.undefined)
    
    inline def setFailureReasons(value: FailureReasons): Self = StObject.set(x, "failureReasons", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonsUndefined: Self = StObject.set(x, "failureReasons", js.undefined)
    
    inline def setFailureReasonsVarargs(value: FailureReason*): Self = StObject.set(x, "failureReasons", js.Array(value*))
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setTranscriptSourceSetting(value: TranscriptSourceSetting): Self = StObject.set(x, "transcriptSourceSetting", value.asInstanceOf[js.Any])
    
    inline def setTranscriptSourceSettingUndefined: Self = StObject.set(x, "transcriptSourceSetting", js.undefined)
  }
}
