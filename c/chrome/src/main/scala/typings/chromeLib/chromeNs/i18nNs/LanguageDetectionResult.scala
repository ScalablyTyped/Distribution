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

