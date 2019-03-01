package typings
package chromeDashAppsLib.chromeNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Holds detected language reliability and array of DetectedLanguage */
trait LanguageDetectionResult extends js.Object {
  /** CLD detected language reliability */
  var isReliable: scala.Boolean
  /** Array of DetectedLanguage */
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

