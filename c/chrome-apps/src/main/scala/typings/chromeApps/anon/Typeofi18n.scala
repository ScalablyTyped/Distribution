package typings.chromeApps.anon

import typings.chromeApps.chrome.i18n.LanguageCode
import typings.chromeApps.chrome.i18n.LanguageDetectionResult
import typings.chromeApps.chrome.i18n.StringSubstitutions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofi18n extends StObject {
  
  /**
    * Detects the language of the provided text using CLD.
    * @param text User input string to be translated.
    * @param callback
    * @since Chrome 47.
    */
  def detectLanguage(text: String, callback: js.Function1[/* result */ LanguageDetectionResult, Unit]): Unit = js.native
  
  /**
    * Gets the accept-languages of the browser.
    * This is different from the locale used by the browser;
    * to get the locale, use i18n.getUILanguage.
    */
  def getAcceptLanguages(callback: js.Function1[/* languages */ js.Array[LanguageCode], Unit]): Unit = js.native
  
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
  def getMessage(messageName: String): js.UndefOr[String] = js.native
  def getMessage(messageName: String, substitutions: StringSubstitutions): js.UndefOr[String] = js.native
  
  /**
    * Gets the browser UI language of the browser.
    * This is different from i18n.getAcceptLanguages which returns the preferred user languages.
    * @since Chrome 35.
    */
  def getUILanguage(): String = js.native
}
