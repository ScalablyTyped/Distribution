package typings
package chromeLib.chromeNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectedLanguage extends js.Object {
  /** An ISO language code such as 'en' or 'fr'.
    * For a complete list of languages supported by this method, see  [kLanguageInfoTable]{@link https://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc}.
    * For an unknown language, 'und' will be returned, which means that [percentage] of the text is unknown to CLD */
  var language: java.lang.String
  /** The percentage of the detected language */
  var percentage: scala.Double
}

