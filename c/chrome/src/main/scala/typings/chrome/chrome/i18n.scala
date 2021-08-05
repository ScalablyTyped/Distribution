package typings.chrome.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// i18n
////////////////////
/**
  * Use the chrome.i18n infrastructure to implement internationalization across your whole app or extension.
  * @since Chrome 5.
  */
object i18n {
  
  trait DetectedLanguage extends StObject {
    
    /** An ISO language code such as 'en' or 'fr'.
      * For a complete list of languages supported by this method, see  [kLanguageInfoTable]{@link https://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc}.
      * For an unknown language, 'und' will be returned, which means that [percentage] of the text is unknown to CLD */
    var language: String
    
    /** The percentage of the detected language */
    var percentage: Double
  }
  object DetectedLanguage {
    
    inline def apply(language: String, percentage: Double): DetectedLanguage = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectedLanguage]
    }
    
    extension [Self <: DetectedLanguage](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    }
  }
  
  trait LanguageDetectionResult extends StObject {
    
    /** CLD detected language reliability */
    var isReliable: Boolean
    
    /** Array of detectedLanguage */
    var languages: js.Array[DetectedLanguage]
  }
  object LanguageDetectionResult {
    
    inline def apply(isReliable: Boolean, languages: js.Array[DetectedLanguage]): LanguageDetectionResult = {
      val __obj = js.Dynamic.literal(isReliable = isReliable.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any])
      __obj.asInstanceOf[LanguageDetectionResult]
    }
    
    extension [Self <: LanguageDetectionResult](x: Self) {
      
      inline def setIsReliable(value: Boolean): Self = StObject.set(x, "isReliable", value.asInstanceOf[js.Any])
      
      inline def setLanguages(value: js.Array[DetectedLanguage]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesVarargs(value: DetectedLanguage*): Self = StObject.set(x, "languages", js.Array(value :_*))
    }
  }
}
