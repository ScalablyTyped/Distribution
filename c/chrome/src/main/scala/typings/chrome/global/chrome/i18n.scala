package typings.chrome.global.chrome

import typings.chrome.chrome.i18n.LanguageDetectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////
// i18n
////////////////////
/**
  * Use the chrome.i18n infrastructure to implement internationalization across your whole app or extension.
  * @since Chrome 5.
  */
@JSGlobal("chrome.i18n")
@js.native
object i18n extends js.Object {
  def detectLanguage(text: String, callback: js.Function1[/* result */ LanguageDetectionResult, Unit]): Unit = js.native
  def getAcceptLanguages(callback: js.Function1[/* languages */ js.Array[String], Unit]): Unit = js.native
  def getMessage(messageName: String): String = js.native
  def getMessage(messageName: String, substitutions: js.Any): String = js.native
  def getUILanguage(): String = js.native
}

