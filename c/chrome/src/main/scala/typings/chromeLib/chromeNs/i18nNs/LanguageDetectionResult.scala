package typings
package chromeLib.chromeNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageDetectionResult extends js.Object {
  /** CLD detected language reliability */
  var isReliable: scala.Boolean
  /** Array of detectedLanguage */
  var languages: js.Array[DetectedLanguage]
}

object LanguageDetectionResult {
  @scala.inline
  def apply(isReliable: scala.Boolean, languages: js.Array[DetectedLanguage]): LanguageDetectionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isReliable")(isReliable)
    __obj.updateDynamic("languages")(languages)
    __obj.asInstanceOf[LanguageDetectionResult]
  }
}

