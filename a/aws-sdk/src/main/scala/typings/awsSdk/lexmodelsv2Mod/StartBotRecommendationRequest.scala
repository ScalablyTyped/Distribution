package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBotRecommendationRequest extends StObject {
  
  /**
    * The unique identifier of the bot containing the bot recommendation.
    */
  var botId: Id
  
  /**
    * The version of the bot containing the bot recommendation.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The object representing the passwords that will be used to encrypt the data related to the bot recommendation results, as well as the KMS key ARN used to encrypt the associated metadata.
    */
  var encryptionSetting: js.UndefOr[EncryptionSetting] = js.undefined
  
  /**
    * The identifier of the language and locale of the bot recommendation to start. The string must match one of the supported locales. For more information, see Supported languages 
    */
  var localeId: LocaleId
  
  /**
    * The object representing the Amazon S3 bucket containing the transcript, as well as the associated metadata.
    */
  var transcriptSourceSetting: TranscriptSourceSetting
}
object StartBotRecommendationRequest {
  
  inline def apply(
    botId: Id,
    botVersion: DraftBotVersion,
    localeId: LocaleId,
    transcriptSourceSetting: TranscriptSourceSetting
  ): StartBotRecommendationRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], transcriptSourceSetting = transcriptSourceSetting.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBotRecommendationRequest]
  }
  
  extension [Self <: StartBotRecommendationRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSetting(value: EncryptionSetting): Self = StObject.set(x, "encryptionSetting", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSettingUndefined: Self = StObject.set(x, "encryptionSetting", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setTranscriptSourceSetting(value: TranscriptSourceSetting): Self = StObject.set(x, "transcriptSourceSetting", value.asInstanceOf[js.Any])
  }
}
