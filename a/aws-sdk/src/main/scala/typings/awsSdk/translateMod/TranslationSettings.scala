package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslationSettings extends StObject {
  
  /**
    * You can optionally specify the desired level of formality for real-time translations to supported target languages. The formality setting controls the level of formal language usage (also known as register) in the translation output. You can set the value to informal or formal. If you don't specify a value for formality, or if the target language doesn't support formality, the translation will ignore the formality setting. Note that asynchronous translation jobs don't support formality. If you provide a value for formality, the StartTextTranslationJob API throws an exception (InvalidRequestException). For target languages that support formality, see Supported Languages and Language Codes in the Amazon Translate Developer Guide.
    */
  var Formality: js.UndefOr[typings.awsSdk.translateMod.Formality] = js.undefined
  
  /**
    * Enable the profanity setting if you want Amazon Translate to mask profane words and phrases in your translation output. To mask profane words and phrases, Amazon Translate replaces them with the grawlix string “?$#@$“. This 5-character sequence is used for each profane word or phrase, regardless of the length or number of words. Amazon Translate doesn't detect profanity in all of its supported languages. For languages that support profanity detection, see Supported Languages and Language Codes in the Amazon Translate Developer Guide.
    */
  var Profanity: js.UndefOr[typings.awsSdk.translateMod.Profanity] = js.undefined
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
