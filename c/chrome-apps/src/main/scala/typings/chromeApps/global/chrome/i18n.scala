package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.i18n.LanguageCode
import typings.chromeApps.chrome.i18n.LanguageDetectionResult
import typings.chromeApps.chrome.i18n.StringSubstitutions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.i18n
/////////////////////////////////
// i18n - Internationalization //
/////////////////////////////////
/**
  * Use the chrome.i18n infrastructure to implement internationalization across your whole app.
  * Content scripts: Fully supported.
  * @see[Docs]{@link https://developer.chrome.com/apps/i18n}
  * @since Chrome 25.
  */
object i18n {
  
  @JSGlobal("chrome.i18n")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Detects the language of the provided text using CLD.
    * @param text User input string to be translated.
    * @param callback
    * @since Chrome 47.
    */
  @scala.inline
  def detectLanguage(text: String, callback: js.Function1[/* result */ LanguageDetectionResult, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detectLanguage")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the accept-languages of the browser.
    * This is different from the locale used by the browser;
    * to get the locale, use i18n.getUILanguage.
    */
  @scala.inline
  def getAcceptLanguages(callback: js.Function1[/* languages */ js.Array[LanguageCode], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getAcceptLanguages")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  @scala.inline
  def getMessage(messageName: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageName.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  @scala.inline
  def getMessage(messageName: String, substitutions: StringSubstitutions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMessage")(messageName.asInstanceOf[js.Any], substitutions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  /**
    * Gets the browser UI language of the browser.
    * This is different from i18n.getAcceptLanguages which returns the preferred user languages.
    * @since Chrome 35.
    */
  @scala.inline
  def getUILanguage(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUILanguage")().asInstanceOf[String]
}
