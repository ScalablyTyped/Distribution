package typings.chromeDashApps.chrome.i18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.i18n.detectLanguage")
@js.native
object detectLanguage extends js.Object {
  /**
    * Detects the language of the provided text using CLD.
    * @param text User input string to be translated.
    * @param callback
    * @since Chrome 47.
    */
  def apply(text: String, callback: js.Function1[/* result */ LanguageDetectionResult, Unit]): Unit = js.native
}

