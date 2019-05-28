package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofi18n extends js.Object {
  /**
    * Detects the language of the provided text using CLD.
    * @param text User input string to be translated.
    * @param callback
    * @since Chrome 47.
    */
  def detectLanguage(
    text: java.lang.String,
    callback: js.Function1[/* result */ chromeDashAppsLib.chromeNs.i18nNs.LanguageDetectionResult, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Gets the accept-languages of the browser.
    * This is different from the locale used by the browser;
    * to get the locale, use i18n.getUILanguage.
    */
  def getAcceptLanguages(
    callback: js.Function1[
      /* languages */ js.Array[chromeDashAppsLib.chromeNs.i18nNs.LanguageCode], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Gets the localized string for the specified message.
    * If the message is missing, this method returns an empty string ('').
    * If the format of the getMessage() call is wrong — for example,
    * messageName is not a string or the substitutions array has
    * more than 9 elements — this method returns undefined.
    *
    * @param messageName The name of the message, as specified in the messages.json file.
    * @param substitutions Up to 9 substitution strings, if the message requires any.
    */
  def getMessage(messageName: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getMessage(
    messageName: java.lang.String,
    substitutions: chromeDashAppsLib.chromeNs.i18nNs.StringSubstitutions
  ): js.UndefOr[java.lang.String] = js.native
  /**
    * Gets the browser UI language of the browser.
    * This is different from i18n.getAcceptLanguages which returns the preferred user languages.
    * @since Chrome 35.
    */
  def getUILanguage(): java.lang.String = js.native
}

