package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBotLocaleRequest extends StObject {
  
  /**
    * The unique identifier of the bot that contains the locale.
    */
  var botId: Id
  
  /**
    * The version of the bot that contains the locale to be updated. The version can only be the DRAFT version.
    */
  var botVersion: DraftBotVersion
  
  /**
    * The new description of the locale.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The identifier of the language and locale to update. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * The new confidence threshold where Amazon Lex inserts the AMAZON.FallbackIntent and AMAZON.KendraSearchIntent intents in the list of possible intents for an utterance.
    */
  var nluIntentConfidenceThreshold: ConfidenceThreshold
  
  /**
    * The new Amazon Polly voice Amazon Lex should use for voice interaction with the user.
    */
  var voiceSettings: js.UndefOr[VoiceSettings] = js.undefined
}
object UpdateBotLocaleRequest {
  
  inline def apply(
    botId: Id,
    botVersion: DraftBotVersion,
    localeId: LocaleId,
    nluIntentConfidenceThreshold: ConfidenceThreshold
  ): UpdateBotLocaleRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], nluIntentConfidenceThreshold = nluIntentConfidenceThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBotLocaleRequest]
  }
  
  extension [Self <: UpdateBotLocaleRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: DraftBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setNluIntentConfidenceThreshold(value: ConfidenceThreshold): Self = StObject.set(x, "nluIntentConfidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setVoiceSettings(value: VoiceSettings): Self = StObject.set(x, "voiceSettings", value.asInstanceOf[js.Any])
    
    inline def setVoiceSettingsUndefined: Self = StObject.set(x, "voiceSettings", js.undefined)
  }
}
