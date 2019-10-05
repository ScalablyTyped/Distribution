package typings.chromeDashApps.chrome.i18n

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Holds detected ISO language code and its percentage in the input string */
trait DetectedLanguage extends js.Object {
  /**
    * An ISO language code such as 'en' or 'fr'.
    * For a complete list of languages supported by this method:
    * @see [kLanguageInfoTable]{@link https://src.chromium.org/viewvc/chrome/trunk/src/third_party/cld/languages/internal/languages.cc}.
    * For an unknown language, 'und' will be returned, which means that [percentage] of the text is unknown to CLD */
  var language: kLanguageInfoTable
  /** The percentage of the detected language */
  var percentage: integer
}

object DetectedLanguage {
  @scala.inline
  def apply(language: kLanguageInfoTable, percentage: integer): DetectedLanguage = {
    val __obj = js.Dynamic.literal(language = language, percentage = percentage)
  
    __obj.asInstanceOf[DetectedLanguage]
  }
}

