package typings.chrome.chromeNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageDetectionResult extends js.Object {
  /** CLD detected language reliability */
  var isReliable: Boolean
  /** Array of detectedLanguage */
  var languages: js.Array[DetectedLanguage]
}

object LanguageDetectionResult {
  @scala.inline
  def apply(isReliable: Boolean, languages: js.Array[DetectedLanguage]): LanguageDetectionResult = {
    val __obj = js.Dynamic.literal(isReliable = isReliable, languages = languages)
  
    __obj.asInstanceOf[LanguageDetectionResult]
  }
}

