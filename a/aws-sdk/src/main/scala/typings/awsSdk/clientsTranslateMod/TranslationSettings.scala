package typings.awsSdk.clientsTranslateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslationSettings extends StObject {
  
  /**
    * You can optionally specify the desired level of formality for translations to supported target languages. The formality setting controls the level of formal language usage (also known as register) in the translation output. You can set the value to informal or formal. If you don't specify a value for formality, or if the target language doesn't support formality, the translation will ignore the formality setting.  If you specify multiple target languages for the job, translate ignores the formality setting for any unsupported target language. For a list of target languages that support formality, see Setting Formality in the Amazon Translate Developer Guide.
    */
  var Formality: js.UndefOr[typings.awsSdk.clientsTranslateMod.Formality] = js.undefined
  
  /**
    * Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your translation output. To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This 5-character sequence is used for each profane word or phrase, regardless of the length or number of words. Amazon Translate doesn't detect profanity in all of its supported languages. For languages that support profanity detection, see Masking profanity in the Amazon Translate Developer Guide. If you specify multiple target languages for the job, all the target languages must support profanity masking. If any of the target languages don't support profanity masking, the translation job won't mask profanity for any target language.
    */
  var Profanity: js.UndefOr[typings.awsSdk.clientsTranslateMod.Profanity] = js.undefined
}
object TranslationSettings {
  
  inline def apply(): TranslationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranslationSettings]
  }
  
  extension [Self <: TranslationSettings](x: Self) {
    
    inline def setFormality(value: Formality): Self = StObject.set(x, "Formality", value.asInstanceOf[js.Any])
    
    inline def setFormalityUndefined: Self = StObject.set(x, "Formality", js.undefined)
    
    inline def setProfanity(value: Profanity): Self = StObject.set(x, "Profanity", value.asInstanceOf[js.Any])
    
    inline def setProfanityUndefined: Self = StObject.set(x, "Profanity", js.undefined)
  }
}
