package typings.chrome

import typings.chrome.chromeNs.i18nNs.LanguageDetectionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofi18n extends js.Object {
  def detectLanguage(text: String, callback: js.Function1[/* result */ LanguageDetectionResult, Unit]): Unit = js.native
  def getAcceptLanguages(callback: js.Function1[/* languages */ js.Array[String], Unit]): Unit = js.native
  def getMessage(messageName: String): String = js.native
  def getMessage(messageName: String, substitutions: js.Any): String = js.native
  def getUILanguage(): String = js.native
}

