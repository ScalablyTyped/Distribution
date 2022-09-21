package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBotRecommendationRequest extends StObject {
  
  /**
    * The unique identifier of the bot containing the bot recommendation to be updated.
    */
  var botId: Id
  
  /**
    * The unique identifier of the bot recommendation to be updated.
    */
  var botRecommendationId: Id
  
  /**
    * The version of the bot containing the bot recommendation to be updated.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The object representing the passwords that will be used to encrypt the data related to the bot recommendation results, as well as the KMS key ARN used to encrypt the associated metadata.
    */
  var encryptionSetting: EncryptionSetting
  
  /**
    * The identifier of the language and locale of the bot recommendation to update. The string must match one of the supported locales. For more information, see Supported languages 
    */
  var localeId: LocaleId
}
object UpdateBotRecommendationRequest {
  
  inline def apply(
    botId: Id,
    botRecommendationId: Id,
    botVersion: DraftBotVersion,
    encryptionSetting: EncryptionSetting,
    localeId: LocaleId
  ): UpdateBotRecommendationRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botRecommendationId = botRecommendationId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], encryptionSetting = encryptionSetting.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBotRecommendationRequest]
  }
  
  extension [Self <: UpdateBotRecommendationRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setEncryptionSetting(value: EncryptionSetting): Self = StObject.set(x, "encryptionSetting", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
  }
}
